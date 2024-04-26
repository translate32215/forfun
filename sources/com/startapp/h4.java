package com.startapp;

import android.content.Context;
import android.net.Uri;
import com.startapp.o7;
import com.startapp.sdk.adsbase.a;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.ImpressionsTrackingMetadata;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.components.ComponentLocator;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Sta */
public class h4 implements c3<String, o7.a, Throwable, Void> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f10490a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f10491b;

    /* renamed from: c  reason: collision with root package name */
    public final TrackingParams f10492c;

    /* renamed from: d  reason: collision with root package name */
    public final d3<ImpressionsTrackingMetadata> f10493d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, Pair<Integer, String>> f10494e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicInteger f10495f;

    /* renamed from: g  reason: collision with root package name */
    public AtomicReference<ImpressionsTrackingMetadata> f10496g;

    /* renamed from: h  reason: collision with root package name */
    public String f10497h;

    public h4(Context context, List<String> list, TrackingParams trackingParams, d3<ImpressionsTrackingMetadata> d3Var) {
        this.f10490a = context;
        this.f10491b = list;
        this.f10492c = trackingParams;
        this.f10493d = d3Var;
        this.f10494e = Collections.synchronizedMap(new LinkedHashMap(list.size()));
        this.f10495f = new AtomicInteger(list.size());
    }

    public Object a(Object obj, Object obj2, Object obj3) {
        Pair pair;
        String str = (String) obj;
        Throwable th = (Throwable) obj3;
        if (((o7.a) obj2) != null) {
            pair = new Pair(4, String.valueOf(200));
        } else {
            if (th instanceof SDKException) {
                SDKException sDKException = (SDKException) th;
                if (sDKException.a() > 0) {
                    pair = new Pair(1, String.valueOf(sDKException.a()));
                } else {
                    th = th.getCause();
                }
            }
            pair = null;
        }
        if (pair == null) {
            if (th != null) {
                pair = new Pair(2, th.getClass().getName());
            } else {
                pair = new Pair(2, String.valueOf(-1));
            }
        }
        this.f10494e.put(str, pair);
        a();
        return null;
    }

    public static void a(Context context, List<String> list, TrackingParams trackingParams) {
        h4 h4Var = (h4) ComponentLocator.a(context).K.b().a(context, list, trackingParams);
        if (h4Var != null) {
            wb.a(h4Var.f10490a, 4, "Sending impression", true);
            for (String next : h4Var.f10491b) {
                if (next == null || next.length() <= 0) {
                    h4Var.f10494e.put(next, (Object) null);
                    h4Var.a();
                } else {
                    if (h4Var.f10497h == null) {
                        h4Var.f10497h = a.a(next, (String) null);
                    }
                    Pair<String, Boolean> a10 = bb.a(h4Var.f10490a, next, h4Var.f10492c, (c3<String, o7.a, Throwable, Void>) h4Var);
                    boolean equals = Boolean.TRUE.equals(a10.second);
                    h4Var.f10494e.put((String) a10.first, (Object) null);
                    if (!equals) {
                        h4Var.a();
                    }
                }
            }
        }
    }

    public final void a() {
        String str;
        if (this.f10495f.decrementAndGet() == 0) {
            AtomicReference<ImpressionsTrackingMetadata> atomicReference = this.f10496g;
            String str2 = null;
            if (atomicReference == null) {
                ImpressionsTrackingMetadata call = this.f10493d.call();
                if (call == null || call.a() <= Math.random()) {
                    call = null;
                }
                AtomicReference<ImpressionsTrackingMetadata> atomicReference2 = new AtomicReference<>(call);
                this.f10496g = atomicReference2;
                atomicReference = atomicReference2;
            }
            ImpressionsTrackingMetadata impressionsTrackingMetadata = atomicReference.get();
            if (impressionsTrackingMetadata != null) {
                StringBuilder sb2 = new StringBuilder();
                StringBuilder sb3 = new StringBuilder();
                boolean z10 = false;
                String str3 = "";
                for (Map.Entry next : this.f10494e.entrySet()) {
                    Integer num = next.getValue() != null ? (Integer) ((Pair) next.getValue()).first : 2;
                    if (num != null && (impressionsTrackingMetadata.b() & num.intValue()) == num.intValue()) {
                        String valueOf = next.getValue() != null ? (String) ((Pair) next.getValue()).second : String.valueOf(-2);
                        String str4 = (String) next.getKey();
                        sb2.append(str3);
                        sb2.append(valueOf);
                        sb3.append(str3);
                        if (str4 != null) {
                            try {
                                Uri parse = Uri.parse(str4);
                                str = parse.getAuthority() + parse.getPath();
                            } catch (Throwable th) {
                                str = th.getClass().getName();
                            }
                        } else {
                            str = String.valueOf((char[]) null);
                        }
                        sb3.append(str);
                        z10 = true;
                        str3 = ",";
                    }
                }
                if (z10) {
                    i4 i4Var = new i4(j4.f10596m);
                    i4Var.f10538e = sb2 + ";" + sb3;
                    i4Var.f10540g = this.f10497h;
                    StringBuilder a10 = b1.a("adTag: ");
                    TrackingParams trackingParams = this.f10492c;
                    if (trackingParams != null) {
                        str2 = trackingParams.a();
                    }
                    a10.append(str2);
                    i4Var.f10537d = a10.toString();
                    i4Var.a();
                }
            }
        }
    }
}
