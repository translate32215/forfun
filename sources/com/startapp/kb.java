package com.startapp;

import com.startapp.sdk.jobs.b;

/* compiled from: Sta */
public class kb implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b.a f10801a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f10802b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ jb f10803c;

    public kb(jb jbVar, b.a aVar, b bVar) {
        this.f10803c = jbVar;
        this.f10801a = aVar;
        this.f10802b = bVar;
    }

    public void run() {
        try {
            this.f10803c.f10730j.run();
        } finally {
            this.f10801a.a(this.f10802b, false);
        }
    }
}
