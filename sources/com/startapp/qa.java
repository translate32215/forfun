package com.startapp;

import com.startapp.sa;

/* compiled from: Sta */
public class qa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ sa f11630a;

    public qa(sa saVar) {
        this.f11630a = saVar;
    }

    public void run() {
        sa saVar = this.f11630a;
        saVar.getClass();
        try {
            if (saVar.a() != null) {
                if (saVar.f11710f == null) {
                    sa.c a10 = saVar.a((Class<?>) null);
                    saVar.f11710f = a10;
                    if (a10 != null) {
                        a10.a();
                    }
                }
            }
        } catch (Throwable th) {
            if (saVar.a(1)) {
                i4.a(th);
            }
        }
    }
}
