package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;
import e8.vh0;
import e8.z70;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class jw extends aq<jw, a> implements c90 {
    /* access modifiers changed from: private */
    public static final jw zzcen;
    private static volatile f90<jw> zzei;
    private int zzcec = 1000;
    private int zzced = 1000;
    private int zzcee;
    private int zzcef;
    private int zzceg;
    private int zzceh;
    private int zzcei;
    private int zzcej;
    private int zzcek;
    private int zzcel;
    private kw zzcem;
    private int zzdt;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<jw, a> {
        public a(uw uwVar) {
            super(jw.zzcen);
        }
    }

    static {
        jw jwVar = new jw();
        zzcen = jwVar;
        aq.t(jw.class, jwVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (uw.f8300a[i10 - 1]) {
            case 1:
                return new jw();
            case 2:
                return new a((uw) null);
            case 3:
                z70 z70 = vh0.f17147a;
                return new k90(zzcen, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzdt", "zzcec", z70, "zzced", z70, "zzcee", "zzcef", "zzceg", "zzceh", "zzcei", "zzcej", "zzcek", "zzcel", "zzcem"});
            case 4:
                return zzcen;
            case 5:
                f90<jw> f90 = zzei;
                if (f90 == null) {
                    synchronized (jw.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzcen);
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
