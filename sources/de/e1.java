package de;

import ie.n;

/* compiled from: MainCoroutineDispatcher.kt */
public abstract class e1 extends u {
    public abstract e1 i0();

    public final String j0() {
        e1 e1Var;
        u uVar = g0.f13286a;
        e1 e1Var2 = n.f19394a;
        if (this == e1Var2) {
            return "Dispatchers.Main";
        }
        try {
            e1Var = e1Var2.i0();
        } catch (UnsupportedOperationException unused) {
            e1Var = null;
        }
        if (this == e1Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public String toString() {
        String j02 = j0();
        if (j02 != null) {
            return j02;
        }
        return getClass().getSimpleName() + '@' + a0.c(this);
    }
}
