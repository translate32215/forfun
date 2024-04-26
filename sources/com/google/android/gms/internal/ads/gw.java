package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;
import e8.x70;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class gw extends aq<gw, a> implements c90 {
    /* access modifiers changed from: private */
    public static final gw zzcco;
    private static volatile f90<gw> zzei;
    private int zzbzn;
    private int zzccn;
    private int zzdt;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<gw, a> {
        public a() {
            super(gw.zzcco);
        }

        public final a o(c cVar) {
            if (this.f5971c) {
                n();
                this.f5971c = false;
            }
            gw.z((gw) this.f5970b, cVar);
            return this;
        }

        public a(uw uwVar) {
            super(gw.zzcco);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public enum b implements x70 {
        CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
        TWO_G(1),
        THREE_G(2),
        LTE(4);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f6714a;

        /* access modifiers changed from: public */
        b(int i10) {
            this.f6714a = i10;
        }

        public static b a(int i10) {
            if (i10 == 0) {
                return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
            }
            if (i10 == 1) {
                return TWO_G;
            }
            if (i10 == 2) {
                return THREE_G;
            }
            if (i10 != 4) {
                return null;
            }
            return LTE;
        }

        public final int g() {
            return this.f6714a;
        }

        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f6714a + " name=" + name() + '>';
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public enum c implements x70 {
        NETWORKTYPE_UNSPECIFIED(0),
        CELL(1),
        WIFI(2);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f6719a;

        /* access modifiers changed from: public */
        c(int i10) {
            this.f6719a = i10;
        }

        public static c a(int i10) {
            if (i10 == 0) {
                return NETWORKTYPE_UNSPECIFIED;
            }
            if (i10 == 1) {
                return CELL;
            }
            if (i10 != 2) {
                return null;
            }
            return WIFI;
        }

        public final int g() {
            return this.f6719a;
        }

        public final String toString() {
            return "<" + c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f6719a + " name=" + name() + '>';
        }
    }

    static {
        gw gwVar = new gw();
        zzcco = gwVar;
        aq.t(gw.class, gwVar);
    }

    public static a E() {
        return (a) zzcco.v();
    }

    public static gw F() {
        return zzcco;
    }

    public static void y(gw gwVar, b bVar) {
        gwVar.getClass();
        gwVar.zzccn = bVar.f6714a;
        gwVar.zzdt |= 2;
    }

    public static void z(gw gwVar, c cVar) {
        gwVar.getClass();
        gwVar.zzbzn = cVar.f6719a;
        gwVar.zzdt |= 1;
    }

    public final boolean A() {
        return (this.zzdt & 1) != 0;
    }

    public final c B() {
        c a10 = c.a(this.zzbzn);
        return a10 == null ? c.NETWORKTYPE_UNSPECIFIED : a10;
    }

    public final boolean C() {
        return (this.zzdt & 2) != 0;
    }

    public final b D() {
        b a10 = b.a(this.zzccn);
        return a10 == null ? b.CELLULAR_NETWORK_TYPE_UNSPECIFIED : a10;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (uw.f8300a[i10 - 1]) {
            case 1:
                return new gw();
            case 2:
                return new a((uw) null);
            case 3:
                return new k90(zzcco, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzdt", "zzbzn", bx.f6070a, "zzccn", ax.f5986a});
            case 4:
                return zzcco;
            case 5:
                f90<gw> f90 = zzei;
                if (f90 == null) {
                    synchronized (gw.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzcco);
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
