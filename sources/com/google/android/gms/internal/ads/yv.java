package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c80;
import e8.c90;
import e8.f90;
import e8.i90;
import e8.k90;
import e8.vh0;
import e8.z70;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class yv extends aq<yv, a> implements c90 {
    /* access modifiers changed from: private */
    public static final yv zzcal;
    private static volatile f90<yv> zzei;
    private String zzcag = "";
    private c80<wv> zzcah = i90.f15001d;
    private int zzcai = 1000;
    private int zzcaj = 1000;
    private int zzcak = 1000;
    private int zzdt;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<yv, a> {
        public a() {
            super(yv.zzcal);
        }

        public a(uw uwVar) {
            super(yv.zzcal);
        }
    }

    static {
        yv yvVar = new yv();
        zzcal = yvVar;
        aq.t(yv.class, yvVar);
    }

    public static void y(yv yvVar, String str) {
        yvVar.getClass();
        str.getClass();
        yvVar.zzdt |= 1;
        yvVar.zzcag = str;
    }

    public static yv z() {
        return zzcal;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (uw.f8300a[i10 - 1]) {
            case 1:
                return new yv();
            case 2:
                return new a((uw) null);
            case 3:
                z70 z70 = vh0.f17147a;
                return new k90(zzcal, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zzdt", "zzcag", "zzcah", wv.class, "zzcai", z70, "zzcaj", z70, "zzcak", z70});
            case 4:
                return zzcal;
            case 5:
                f90<yv> f90 = zzei;
                if (f90 == null) {
                    synchronized (yv.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzcal);
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
