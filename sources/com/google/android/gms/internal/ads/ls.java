package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f80;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class ls extends aq<ls, a> implements c90 {
    /* access modifiers changed from: private */
    public static final ls zzabz;
    private static volatile f90<ls> zzei;
    private ms zzabw;
    private mp zzabx;
    private mp zzaby;
    private int zzdt;

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public static final class a extends aq.b<ls, a> {
        public a(ks ksVar) {
            super(ls.zzabz);
        }
    }

    static {
        ls lsVar = new ls();
        zzabz = lsVar;
        aq.t(ls.class, lsVar);
    }

    public ls() {
        mp mpVar = mp.f7494b;
        this.zzabx = mpVar;
        this.zzaby = mpVar;
    }

    public static ls y(mp mpVar, up upVar) throws f80 {
        return (ls) aq.l(zzabz, mpVar, upVar);
    }

    public final mp A() {
        return this.zzabx;
    }

    public final mp B() {
        return this.zzaby;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (ks.f7269a[i10 - 1]) {
            case 1:
                return new ls();
            case 2:
                return new a((ks) null);
            case 3:
                return new k90(zzabz, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzdt", "zzabw", "zzabx", "zzaby"});
            case 4:
                return zzabz;
            case 5:
                f90<ls> f90 = zzei;
                if (f90 == null) {
                    synchronized (ls.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzabz);
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

    public final ms z() {
        ms msVar = this.zzabw;
        return msVar == null ? ms.K() : msVar;
    }
}
