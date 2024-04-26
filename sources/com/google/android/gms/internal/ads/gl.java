package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f80;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class gl extends aq<gl, a> implements c90 {
    private static volatile f90<gl> zzei;
    /* access modifiers changed from: private */
    public static final gl zzicm;
    private int zzicj;
    private mp zzick = mp.f7494b;
    private kl zzicl;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<gl, a> {
        public a() {
            super(gl.zzicm);
        }

        public a(fl flVar) {
            super(gl.zzicm);
        }
    }

    static {
        gl glVar = new gl();
        zzicm = glVar;
        aq.t(gl.class, glVar);
    }

    public static void A(gl glVar, kl klVar) {
        glVar.getClass();
        klVar.getClass();
        glVar.zzicl = klVar;
    }

    public static void B(gl glVar, mp mpVar) {
        glVar.getClass();
        mpVar.getClass();
        glVar.zzick = mpVar;
    }

    public static a E() {
        return (a) zzicm.v();
    }

    public static gl G(mp mpVar, up upVar) throws f80 {
        return (gl) aq.l(zzicm, mpVar, upVar);
    }

    public static void z(gl glVar) {
        glVar.zzicj = 0;
    }

    public final mp C() {
        return this.zzick;
    }

    public final kl D() {
        kl klVar = this.zzicl;
        return klVar == null ? kl.z() : klVar;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (fl.f6467a[i10 - 1]) {
            case 1:
                return new gl();
            case 2:
                return new a((fl) null);
            case 3:
                return new k90(zzicm, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzicj", "zzick", "zzicl"});
            case 4:
                return zzicm;
            case 5:
                f90<gl> f90 = zzei;
                if (f90 == null) {
                    synchronized (gl.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzicm);
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

    public final int y() {
        return this.zzicj;
    }
}
