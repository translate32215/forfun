package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f80;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class ms extends aq<ms, a> implements c90 {
    /* access modifiers changed from: private */
    public static final ms zzacf;
    private static volatile f90<ms> zzei;
    private String zzaca = "";
    private String zzacb = "";
    private long zzacc;
    private long zzacd;
    private long zzace;
    private int zzdt;

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public static final class a extends aq.b<ms, a> {
        public a() {
            super(ms.zzacf);
        }

        public a(ns nsVar) {
            super(ms.zzacf);
        }
    }

    static {
        ms msVar = new ms();
        zzacf = msVar;
        aq.t(ms.class, msVar);
    }

    public static ms A(mp mpVar, up upVar) throws f80 {
        return (ms) aq.l(zzacf, mpVar, upVar);
    }

    public static void B(ms msVar, long j10) {
        msVar.zzdt |= 8;
        msVar.zzacd = j10;
    }

    public static void C(ms msVar, String str) {
        msVar.getClass();
        str.getClass();
        msVar.zzdt |= 2;
        msVar.zzacb = str;
    }

    public static void D(ms msVar, long j10) {
        msVar.zzdt |= 16;
        msVar.zzace = j10;
    }

    public static a J() {
        return (a) zzacf.v();
    }

    public static ms K() {
        return zzacf;
    }

    public static ms M(mp mpVar) throws f80 {
        aq u10 = aq.u(zzacf, mpVar, up.a());
        aq.k(u10);
        aq.k(u10);
        return (ms) u10;
    }

    public static void y(ms msVar, long j10) {
        msVar.zzdt |= 4;
        msVar.zzacc = j10;
    }

    public static void z(ms msVar, String str) {
        msVar.getClass();
        str.getClass();
        msVar.zzdt |= 1;
        msVar.zzaca = str;
    }

    public final String E() {
        return this.zzaca;
    }

    public final String F() {
        return this.zzacb;
    }

    public final long G() {
        return this.zzacc;
    }

    public final long H() {
        return this.zzacd;
    }

    public final long I() {
        return this.zzace;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (ns.f7609a[i10 - 1]) {
            case 1:
                return new ms();
            case 2:
                return new a((ns) null);
            case 3:
                return new k90(zzacf, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzdt", "zzaca", "zzacb", "zzacc", "zzacd", "zzace"});
            case 4:
                return zzacf;
            case 5:
                f90<ms> f90 = zzei;
                if (f90 == null) {
                    synchronized (ms.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzacf);
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
