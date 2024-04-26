package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;
import e8.x70;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class kn extends aq<kn, b> implements c90 {
    private static volatile f90<kn> zzei;
    /* access modifiers changed from: private */
    public static final kn zziff;
    private String zzifc = "";
    private mp zzifd = mp.f7494b;
    private int zzife;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public enum a implements x70 {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f7260a;

        /* access modifiers changed from: public */
        a(int i10) {
            this.f7260a = i10;
        }

        public final int g() {
            if (this != UNRECOGNIZED) {
                return this.f7260a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("<");
            sb2.append(a.class.getName());
            sb2.append('@');
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            if (this != UNRECOGNIZED) {
                sb2.append(" number=");
                sb2.append(g());
            }
            sb2.append(" name=");
            sb2.append(name());
            sb2.append('>');
            return sb2.toString();
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class b extends aq.b<kn, b> {
        public b() {
            super(kn.zziff);
        }

        public b(jn jnVar) {
            super(kn.zziff);
        }
    }

    static {
        kn knVar = new kn();
        zziff = knVar;
        aq.t(kn.class, knVar);
    }

    public static void A(kn knVar, String str) {
        knVar.getClass();
        str.getClass();
        knVar.zzifc = str;
    }

    public static b E() {
        return (b) zziff.v();
    }

    public static kn F() {
        return zziff;
    }

    public static void y(kn knVar, a aVar) {
        knVar.getClass();
        knVar.zzife = aVar.g();
    }

    public static void z(kn knVar, mp mpVar) {
        knVar.getClass();
        mpVar.getClass();
        knVar.zzifd = mpVar;
    }

    public final String B() {
        return this.zzifc;
    }

    public final mp C() {
        return this.zzifd;
    }

    public final a D() {
        a aVar;
        int i10 = this.zzife;
        if (i10 == 0) {
            aVar = a.UNKNOWN_KEYMATERIAL;
        } else if (i10 == 1) {
            aVar = a.SYMMETRIC;
        } else if (i10 == 2) {
            aVar = a.ASYMMETRIC_PRIVATE;
        } else if (i10 == 3) {
            aVar = a.ASYMMETRIC_PUBLIC;
        } else if (i10 != 4) {
            aVar = null;
        } else {
            aVar = a.REMOTE;
        }
        return aVar == null ? a.UNRECOGNIZED : aVar;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (jn.f7155a[i10 - 1]) {
            case 1:
                return new kn();
            case 2:
                return new b((jn) null);
            case 3:
                return new k90(zziff, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzifc", "zzifd", "zzife"});
            case 4:
                return zziff;
            case 5:
                f90<kn> f90 = zzei;
                if (f90 == null) {
                    synchronized (kn.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zziff);
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
