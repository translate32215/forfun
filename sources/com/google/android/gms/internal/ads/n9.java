package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class n9 extends aq<n9, a> implements c90 {
    private static volatile f90<n9> zzei;
    /* access modifiers changed from: private */
    public static final n9 zzeu;
    private int zzdt;
    private o9 zzes;
    private p9 zzet;

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public static final class a extends aq.b<n9, a> {
        public a(z9 z9Var) {
            super(n9.zzeu);
        }
    }

    static {
        n9 n9Var = new n9();
        zzeu = n9Var;
        aq.t(n9.class, n9Var);
    }

    public final boolean A() {
        return (this.zzdt & 1) != 0;
    }

    public final o9 B() {
        o9 o9Var = this.zzes;
        return o9Var == null ? o9.z() : o9Var;
    }

    public final boolean C() {
        return (this.zzdt & 2) != 0;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (z9.f8681a[i10 - 1]) {
            case 1:
                return new n9();
            case 2:
                return new a((z9) null);
            case 3:
                return new k90(zzeu, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzdt", "zzes", "zzet"});
            case 4:
                return zzeu;
            case 5:
                f90<n9> f90 = zzei;
                if (f90 == null) {
                    synchronized (n9.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzeu);
                            zzei = f90;
                        }
                    }
                }
                return f90;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final p9 y() {
        p9 p9Var = this.zzet;
        return p9Var == null ? p9.z() : p9Var;
    }
}
