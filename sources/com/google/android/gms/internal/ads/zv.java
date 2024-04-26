package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c80;
import e8.c90;
import e8.f90;
import e8.i90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class zv extends aq<zv, a> implements c90 {
    /* access modifiers changed from: private */
    public static final zv zzcas;
    private static volatile f90<zv> zzei;
    private int zzcam;
    private nw zzcan;
    private nw zzcao;
    private nw zzcap;
    private c80<nw> zzcaq = i90.f15001d;
    private int zzcar;
    private int zzdt;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<zv, a> {
        public a(uw uwVar) {
            super(zv.zzcas);
        }
    }

    static {
        zv zvVar = new zv();
        zzcas = zvVar;
        aq.t(zv.class, zvVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (uw.f8300a[i10 - 1]) {
            case 1:
                return new zv();
            case 2:
                return new a((uw) null);
            case 3:
                return new k90(zzcas, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzdt", "zzcam", "zzcan", "zzcao", "zzcap", "zzcaq", nw.class, "zzcar"});
            case 4:
                return zzcas;
            case 5:
                f90<zv> f90 = zzei;
                if (f90 == null) {
                    synchronized (zv.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzcas);
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
