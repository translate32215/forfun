package com.startapp;

import com.startapp.sdk.components.ComponentLocator;

/* compiled from: Sta */
public class k3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ComponentLocator f10777a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.adsbase.remoteconfig.a f10778b;

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Boolean f10779a;

        public a(Boolean bool) {
            this.f10779a = bool;
        }

        public void run() {
            k3.this.f10778b.a(this.f10779a);
        }
    }

    public k3(com.startapp.sdk.adsbase.remoteconfig.a aVar, ComponentLocator componentLocator) {
        this.f10778b = aVar;
        this.f10777a = componentLocator;
    }

    public void run() {
        this.f10777a.g().execute(new a(this.f10778b.a()));
    }
}
