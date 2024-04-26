package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;
import e8.vh0;
import e8.z70;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class aw extends aq<aw, a> implements c90 {
    /* access modifiers changed from: private */
    public static final aw zzcbb;
    private static volatile f90<aw> zzei;
    private String zzcat = "";
    private nw zzcau;
    private int zzcav;
    private ow zzcaw;
    private int zzcax;
    private int zzcay = 1000;
    private int zzcaz = 1000;
    private int zzcba = 1000;
    private int zzdt;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<aw, a> {
        public a() {
            super(aw.zzcbb);
        }

        public a(uw uwVar) {
            super(aw.zzcbb);
        }
    }

    static {
        aw awVar = new aw();
        zzcbb = awVar;
        aq.t(aw.class, awVar);
    }

    public static aw A() {
        return zzcbb;
    }

    public static void y(aw awVar, ow owVar) {
        awVar.getClass();
        owVar.getClass();
        awVar.zzcaw = owVar;
        awVar.zzdt |= 8;
    }

    public static void z(aw awVar, String str) {
        awVar.getClass();
        str.getClass();
        awVar.zzdt |= 1;
        awVar.zzcat = str;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (uw.f8300a[i10 - 1]) {
            case 1:
                return new aw();
            case 2:
                return new a((uw) null);
            case 3:
                z70 z70 = vh0.f17147a;
                return new k90(zzcbb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zzdt", "zzcat", "zzcau", "zzcav", "zzcaw", "zzcax", "zzcay", z70, "zzcaz", z70, "zzcba", z70});
            case 4:
                return zzcbb;
            case 5:
                f90<aw> f90 = zzei;
                if (f90 == null) {
                    synchronized (aw.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzcbb);
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
