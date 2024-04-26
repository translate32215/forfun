package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class p9 extends aq<p9, a> implements c90 {
    private static volatile f90<p9> zzei;
    /* access modifiers changed from: private */
    public static final p9 zzfj;
    private int zzdt;
    private String zzfd = "";
    private String zzfe = "";
    private String zzff = "";
    private String zzfg = "";
    private String zzfh = "";
    private String zzfi = "";

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public static final class a extends aq.b<p9, a> {
        public a(z9 z9Var) {
            super(p9.zzfj);
        }
    }

    static {
        p9 p9Var = new p9();
        zzfj = p9Var;
        aq.t(p9.class, p9Var);
    }

    public static p9 z() {
        return zzfj;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (z9.f8681a[i10 - 1]) {
            case 1:
                return new p9();
            case 2:
                return new a((z9) null);
            case 3:
                return new k90(zzfj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzdt", "zzfd", "zzfe", "zzff", "zzfg", "zzfh", "zzfi"});
            case 4:
                return zzfj;
            case 5:
                f90<p9> f90 = zzei;
                if (f90 == null) {
                    synchronized (p9.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzfj);
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

    public final String y() {
        return this.zzfd;
    }
}
