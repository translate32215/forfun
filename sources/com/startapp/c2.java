package com.startapp;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import com.startapp.sdk.adsbase.remoteconfig.ConnectivityHelperMetadata;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Sta */
public class c2 {

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f10227f;

    /* renamed from: a  reason: collision with root package name */
    public final Context f10228a;

    /* renamed from: b  reason: collision with root package name */
    public final d3<ConnectivityHelperMetadata> f10229b;

    /* renamed from: c  reason: collision with root package name */
    public final List<d3<Void>> f10230c = new LinkedList();

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f10231d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    public a f10232e;

    /* compiled from: Sta */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final Context f10233a;

        /* renamed from: b  reason: collision with root package name */
        public final ConnectivityManager f10234b;

        public a(Context context, ConnectivityManager connectivityManager) {
            this.f10233a = context;
            this.f10234b = connectivityManager;
        }

        public abstract int a();

        public void b() {
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            arrayList.add(0);
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);
            arrayList.add(4);
        }
        if (i10 >= 26) {
            arrayList.add(5);
        }
        if (i10 >= 27) {
            arrayList.add(6);
        }
        if (i10 >= 31) {
            arrayList.add(8);
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        f10227f = iArr;
    }

    public c2(Context context, d3<ConnectivityHelperMetadata> d3Var) {
        this.f10228a = context;
        this.f10229b = d3Var;
    }

    public boolean a() {
        if (a0.a(this.f10228a, "android.permission.ACCESS_NETWORK_STATE")) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f10228a.getSystemService("connectivity");
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                        return false;
                    }
                    return true;
                }
            } catch (Throwable th) {
                i4.a(th);
            }
        }
        return true;
    }

    public static int a(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return 0;
        }
        int i10 = 0;
        for (int i11 : f10227f) {
            try {
                if (networkCapabilities.hasTransport(i11)) {
                    i10 |= 1 << i11;
                }
            } catch (Throwable unused) {
            }
        }
        return i10;
    }
}
