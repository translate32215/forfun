package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f80;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class oa extends aq<oa, a> implements c90 {
    private static volatile f90<oa> zzei;
    /* access modifiers changed from: private */
    public static final oa zzlh;
    private int zzdt;
    private mp zzld;
    private mp zzle;
    private mp zzlf;
    private mp zzlg;

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public static final class a extends aq.b<oa, a> {
        public a() {
            super(oa.zzlh);
        }

        public final a o(mp mpVar) {
            if (this.f5971c) {
                n();
                this.f5971c = false;
            }
            oa.y((oa) this.f5970b, mpVar);
            return this;
        }

        public final a p(mp mpVar) {
            if (this.f5971c) {
                n();
                this.f5971c = false;
            }
            oa.A((oa) this.f5970b, mpVar);
            return this;
        }

        public final a q(mp mpVar) {
            if (this.f5971c) {
                n();
                this.f5971c = false;
            }
            oa.H((oa) this.f5970b, mpVar);
            return this;
        }

        public final a r(mp mpVar) {
            if (this.f5971c) {
                n();
                this.f5971c = false;
            }
            oa.I((oa) this.f5970b, mpVar);
            return this;
        }

        public a(la laVar) {
            super(oa.zzlh);
        }
    }

    static {
        oa oaVar = new oa();
        zzlh = oaVar;
        aq.t(oa.class, oaVar);
    }

    public oa() {
        mp mpVar = mp.f7494b;
        this.zzld = mpVar;
        this.zzle = mpVar;
        this.zzlf = mpVar;
        this.zzlg = mpVar;
    }

    public static void A(oa oaVar, mp mpVar) {
        oaVar.getClass();
        mpVar.getClass();
        oaVar.zzdt |= 2;
        oaVar.zzle = mpVar;
    }

    public static a F() {
        return (a) zzlh.v();
    }

    public static void H(oa oaVar, mp mpVar) {
        oaVar.getClass();
        mpVar.getClass();
        oaVar.zzdt |= 4;
        oaVar.zzlf = mpVar;
    }

    public static void I(oa oaVar, mp mpVar) {
        oaVar.getClass();
        mpVar.getClass();
        oaVar.zzdt |= 8;
        oaVar.zzlg = mpVar;
    }

    public static void y(oa oaVar, mp mpVar) {
        oaVar.getClass();
        mpVar.getClass();
        oaVar.zzdt |= 1;
        oaVar.zzld = mpVar;
    }

    public static oa z(byte[] bArr, up upVar) throws f80 {
        aq n10 = aq.n(zzlh, bArr, bArr.length, upVar);
        aq.k(n10);
        return (oa) n10;
    }

    public final mp B() {
        return this.zzld;
    }

    public final mp C() {
        return this.zzle;
    }

    public final mp D() {
        return this.zzlf;
    }

    public final mp E() {
        return this.zzlg;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (la.f7356a[i10 - 1]) {
            case 1:
                return new oa();
            case 2:
                return new a((la) null);
            case 3:
                return new k90(zzlh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzdt", "zzld", "zzle", "zzlf", "zzlg"});
            case 4:
                return zzlh;
            case 5:
                f90<oa> f90 = zzei;
                if (f90 == null) {
                    synchronized (oa.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzlh);
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
}
