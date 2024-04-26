package com.startapp;

import android.net.ConnectivityManager;

/* compiled from: Sta */
public class b2 implements ConnectivityManager.OnNetworkActiveListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c2 f10101a;

    public b2(c2 c2Var) {
        this.f10101a = c2Var;
    }

    public void onNetworkActive() {
        c2 c2Var = this.f10101a;
        synchronized (c2Var.f10230c) {
            for (d3<Void> call : c2Var.f10230c) {
                call.call();
            }
        }
    }
}
