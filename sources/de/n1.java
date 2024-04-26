package de;

import md.f;

/* compiled from: Unconfined.kt */
public final class n1 extends u {

    /* renamed from: b  reason: collision with root package name */
    public static final n1 f13316b = new n1();

    public void f0(f fVar, Runnable runnable) {
        q1 q1Var = (q1) fVar.get(q1.f13323b);
        if (q1Var != null) {
            q1Var.f13324a = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
