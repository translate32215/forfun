package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class sm extends aq<sm, a> implements c90 {
    private static volatile f90<sm> zzei;
    /* access modifiers changed from: private */
    public static final sm zzidz;
    private an zzidw;
    private om zzidx;
    private int zzidy;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<sm, a> {
        public a(um umVar) {
            super(sm.zzidz);
        }
    }

    static {
        sm smVar = new sm();
        zzidz = smVar;
        aq.t(sm.class, smVar);
    }

    public static sm B() {
        return zzidz;
    }

    public final nm A() {
        nm nmVar;
        int i10 = this.zzidy;
        if (i10 == 0) {
            nmVar = nm.UNKNOWN_FORMAT;
        } else if (i10 == 1) {
            nmVar = nm.UNCOMPRESSED;
        } else if (i10 == 2) {
            nmVar = nm.COMPRESSED;
        } else if (i10 != 3) {
            nmVar = null;
        } else {
            nmVar = nm.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        }
        return nmVar == null ? nm.UNRECOGNIZED : nmVar;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (um.f8250a[i10 - 1]) {
            case 1:
                return new sm();
            case 2:
                return new a((um) null);
            case 3:
                return new k90(zzidz, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzidw", "zzidx", "zzidy"});
            case 4:
                return zzidz;
            case 5:
                f90<sm> f90 = zzei;
                if (f90 == null) {
                    synchronized (sm.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzidz);
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

    public final an y() {
        an anVar = this.zzidw;
        return anVar == null ? an.B() : anVar;
    }

    public final om z() {
        om omVar = this.zzidx;
        return omVar == null ? om.z() : omVar;
    }
}
