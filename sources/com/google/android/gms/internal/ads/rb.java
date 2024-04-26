package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.iw;
import e8.di;
import e8.vs;
import e8.xs;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class rb {

    /* renamed from: g  reason: collision with root package name */
    public static final SparseArray<iw.b> f8020g;

    /* renamed from: a  reason: collision with root package name */
    public final Context f8021a;

    /* renamed from: b  reason: collision with root package name */
    public final di f8022b;

    /* renamed from: c  reason: collision with root package name */
    public final TelephonyManager f8023c;

    /* renamed from: d  reason: collision with root package name */
    public final xs f8024d;

    /* renamed from: e  reason: collision with root package name */
    public final vs f8025e;

    /* renamed from: f  reason: collision with root package name */
    public yw f8026f;

    static {
        SparseArray<iw.b> sparseArray = new SparseArray<>();
        f8020g = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), iw.b.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        iw.b bVar = iw.b.CONNECTING;
        sparseArray.put(ordinal, bVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), bVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), bVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), iw.b.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        iw.b bVar2 = iw.b.DISCONNECTED;
        sparseArray.put(ordinal2, bVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), bVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), bVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), bVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), bVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), iw.b.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), bVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), bVar);
    }

    public rb(Context context, di diVar, xs xsVar, vs vsVar) {
        this.f8021a = context;
        this.f8022b = diVar;
        this.f8024d = xsVar;
        this.f8025e = vsVar;
        this.f8023c = (TelephonyManager) context.getSystemService("phone");
    }

    public static yw a(boolean z10) {
        return z10 ? yw.ENUM_TRUE : yw.ENUM_FALSE;
    }
}
