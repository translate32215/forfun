package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class pw extends aq<pw, a> implements c90 {
    /* access modifiers changed from: private */
    public static final pw zzcfs;
    private static volatile f90<pw> zzei;
    private tw zzcfc;
    private rv zzcfd;
    private sv zzcfe;
    private tv zzcff;
    private qw zzcfg;
    private qv zzcfh;
    private sw zzcfi;
    private int zzcfj;
    private int zzcfk;
    private nw zzcfl;
    private int zzcfm;
    private int zzcfn;
    private int zzcfo;
    private int zzcfp;
    private int zzcfq;
    private long zzcfr;
    private int zzdt;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<pw, a> {
        public a(uw uwVar) {
            super(pw.zzcfs);
        }
    }

    static {
        pw pwVar = new pw();
        zzcfs = pwVar;
        aq.t(pw.class, pwVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (uw.f8300a[i10 - 1]) {
            case 1:
                return new pw();
            case 2:
                return new a((uw) null);
            case 3:
                return new k90(zzcfs, "\u0001\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzdt", "zzcfc", "zzcfd", "zzcfe", "zzcff", "zzcfg", "zzcfh", "zzcfi", "zzcfj", "zzcfk", "zzcfl", "zzcfm", "zzcfn", "zzcfo", "zzcfp", "zzcfq", "zzcfr"});
            case 4:
                return zzcfs;
            case 5:
                f90<pw> f90 = zzei;
                if (f90 == null) {
                    synchronized (pw.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzcfs);
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
