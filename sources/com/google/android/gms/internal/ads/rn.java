package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c80;
import e8.c90;
import e8.f80;
import e8.f90;
import e8.i90;
import e8.k90;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class rn extends aq<rn, a> implements c90 {
    private static volatile f90<rn> zzei;
    /* access modifiers changed from: private */
    public static final rn zzigc;
    private int zziga;
    private c80<b> zzigb = i90.f15001d;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<rn, a> {
        public a(sn snVar) {
            super(rn.zzigc);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class b extends aq<b, a> implements c90 {
        private static volatile f90<b> zzei;
        /* access modifiers changed from: private */
        public static final b zzigg;
        private int zzift;
        private kn zzigd;
        private int zzige;
        private int zzigf;

        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        public static final class a extends aq.b<b, a> {
            public a(sn snVar) {
                super(b.zzigg);
            }
        }

        static {
            b bVar = new b();
            zzigg = bVar;
            aq.t(b.class, bVar);
        }

        public final boolean A() {
            return this.zzigd != null;
        }

        public final kn B() {
            kn knVar = this.zzigd;
            return knVar == null ? kn.F() : knVar;
        }

        public final int C() {
            return this.zzigf;
        }

        public final Object q(int i10, Object obj, Object obj2) {
            switch (sn.f8130a[i10 - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a((sn) null);
                case 3:
                    return new k90(zzigg, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzigd", "zzige", "zzigf", "zzift"});
                case 4:
                    return zzigg;
                case 5:
                    f90<b> f90 = zzei;
                    if (f90 == null) {
                        synchronized (b.class) {
                            f90 = zzei;
                            if (f90 == null) {
                                f90 = new aq.a<>(zzigg);
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

        public final ln y() {
            ln lnVar;
            int i10 = this.zzige;
            if (i10 == 0) {
                lnVar = ln.UNKNOWN_STATUS;
            } else if (i10 == 1) {
                lnVar = ln.ENABLED;
            } else if (i10 == 2) {
                lnVar = ln.DISABLED;
            } else if (i10 != 3) {
                lnVar = null;
            } else {
                lnVar = ln.DESTROYED;
            }
            return lnVar == null ? ln.UNRECOGNIZED : lnVar;
        }

        public final Cdo z() {
            Cdo doVar;
            int i10 = this.zzift;
            if (i10 == 0) {
                doVar = Cdo.UNKNOWN_PREFIX;
            } else if (i10 == 1) {
                doVar = Cdo.TINK;
            } else if (i10 == 2) {
                doVar = Cdo.LEGACY;
            } else if (i10 == 3) {
                doVar = Cdo.RAW;
            } else if (i10 != 4) {
                doVar = null;
            } else {
                doVar = Cdo.CRUNCHY;
            }
            return doVar == null ? Cdo.UNRECOGNIZED : doVar;
        }
    }

    static {
        rn rnVar = new rn();
        zzigc = rnVar;
        aq.t(rn.class, rnVar);
    }

    public static rn C(byte[] bArr, up upVar) throws f80 {
        aq n10 = aq.n(zzigc, bArr, bArr.length, upVar);
        aq.k(n10);
        return (rn) n10;
    }

    public final int A() {
        return this.zzigb.size();
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (sn.f8130a[i10 - 1]) {
            case 1:
                return new rn();
            case 2:
                return new a((sn) null);
            case 3:
                return new k90(zzigc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zziga", "zzigb", b.class});
            case 4:
                return zzigc;
            case 5:
                f90<rn> f90 = zzei;
                if (f90 == null) {
                    synchronized (rn.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzigc);
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
        return this.zziga;
    }

    public final List<b> z() {
        return this.zzigb;
    }
}
