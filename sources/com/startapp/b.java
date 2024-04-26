package com.startapp;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.startapp.c2;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Sta */
public class b extends c2.a {

    /* renamed from: c  reason: collision with root package name */
    public final Map<Network, Integer> f10099c = new HashMap();

    /* compiled from: Sta */
    public class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            int a10 = c2.a(networkCapabilities);
            synchronized (b.this.f10099c) {
                b.this.f10099c.put(network, Integer.valueOf(a10));
            }
        }

        public void onLost(Network network) {
            synchronized (b.this.f10099c) {
                b.this.f10099c.remove(network);
            }
        }
    }

    public b(Context context, ConnectivityManager connectivityManager) {
        super(context, connectivityManager);
    }

    public int a() {
        int i10;
        synchronized (this.f10099c) {
            i10 = 0;
            for (Integer next : this.f10099c.values()) {
                if (next != null) {
                    i10 |= next.intValue();
                }
            }
        }
        return i10;
    }

    public void b() {
        if (a0.a(this.f10233a, "android.permission.ACCESS_NETWORK_STATE")) {
            this.f10234b.registerDefaultNetworkCallback(new a());
        }
    }
}
