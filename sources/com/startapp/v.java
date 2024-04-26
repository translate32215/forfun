package com.startapp;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import com.startapp.c2;

/* compiled from: Sta */
public class v extends c2.a {
    public v(Context context, ConnectivityManager connectivityManager) {
        super(context, connectivityManager);
    }

    public int a() {
        Network[] allNetworks;
        if (!a0.a(this.f10233a, "android.permission.ACCESS_NETWORK_STATE") || (allNetworks = this.f10234b.getAllNetworks()) == null) {
            return 0;
        }
        int i10 = 0;
        for (Network network : allNetworks) {
            if (network != null) {
                i10 |= c2.a(this.f10234b.getNetworkCapabilities(network));
            }
        }
        return i10;
    }
}
