package com.startapp;

import com.startapp.sa;

/* compiled from: Sta */
public class ra implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ sa f11666a;

    public ra(sa saVar) {
        this.f11666a = saVar;
    }

    public void run() {
        sa saVar = this.f11666a;
        saVar.getClass();
        try {
            sa.c cVar = saVar.f11710f;
            if (cVar != null) {
                cVar.b();
                saVar.f11710f = null;
            }
        } catch (Throwable th) {
            if (saVar.a(4)) {
                i4.a(th);
            }
        }
    }
}
