package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c80;
import e8.c90;
import e8.f90;
import e8.i90;
import e8.k90;
import e8.x70;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class vv extends aq<vv, b> implements c90 {
    /* access modifiers changed from: private */
    public static final vv zzbzd;
    private static volatile f90<vv> zzei;
    private c80<a> zzbzc = i90.f15001d;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq<a, C0087a> implements c90 {
        /* access modifiers changed from: private */
        public static final a zzbzb;
        private static volatile f90<a> zzei;
        private int zzbyy;
        private d zzbyz;
        private e zzbza;
        private int zzdt;

        /* renamed from: com.google.android.gms.internal.ads.vv$a$a  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        public static final class C0087a extends aq.b<a, C0087a> {
            public C0087a() {
                super(a.zzbzb);
            }

            public final C0087a o(d.a aVar) {
                if (this.f5971c) {
                    n();
                    this.f5971c = false;
                }
                a.z((a) this.f5970b, (d) ((aq) aVar.j()));
                return this;
            }

            public final C0087a p(c cVar) {
                if (this.f5971c) {
                    n();
                    this.f5971c = false;
                }
                a.y((a) this.f5970b, cVar);
                return this;
            }

            public C0087a(uw uwVar) {
                super(a.zzbzb);
            }
        }

        static {
            a aVar = new a();
            zzbzb = aVar;
            aq.t(a.class, aVar);
        }

        public static void A(a aVar, e eVar) {
            aVar.getClass();
            eVar.getClass();
            aVar.zzbza = eVar;
            aVar.zzdt |= 4;
        }

        public static C0087a B() {
            return (C0087a) zzbzb.v();
        }

        public static void y(a aVar, c cVar) {
            aVar.getClass();
            aVar.zzbyy = cVar.f8416a;
            aVar.zzdt |= 1;
        }

        public static void z(a aVar, d dVar) {
            aVar.getClass();
            aVar.zzbyz = dVar;
            aVar.zzdt |= 2;
        }

        public final Object q(int i10, Object obj, Object obj2) {
            switch (uw.f8300a[i10 - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C0087a((uw) null);
                case 3:
                    return new k90(zzbzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzdt", "zzbyy", ww.f8492a, "zzbyz", "zzbza"});
                case 4:
                    return zzbzb;
                case 5:
                    f90<a> f90 = zzei;
                    if (f90 == null) {
                        synchronized (a.class) {
                            f90 = zzei;
                            if (f90 == null) {
                                f90 = new aq.a<>(zzbzb);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class b extends aq.b<vv, b> {
        public b() {
            super(vv.zzbzd);
        }

        public final b o(a.C0087a aVar) {
            if (this.f5971c) {
                n();
                this.f5971c = false;
            }
            vv.y((vv) this.f5970b, (a) ((aq) aVar.j()));
            return this;
        }

        public b(uw uwVar) {
            super(vv.zzbzd);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public enum c implements x70 {
        UNSPECIFIED(0),
        IN_MEMORY(1);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f8416a;

        /* access modifiers changed from: public */
        c(int i10) {
            this.f8416a = i10;
        }

        public final int g() {
            return this.f8416a;
        }

        public final String toString() {
            return "<" + c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8416a + " name=" + name() + '>';
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class d extends aq<d, a> implements c90 {
        /* access modifiers changed from: private */
        public static final d zzbzj;
        private static volatile f90<d> zzei;
        private boolean zzbzh;
        private int zzbzi;
        private int zzdt;

        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        public static final class a extends aq.b<d, a> {
            public a() {
                super(d.zzbzj);
            }

            public a(uw uwVar) {
                super(d.zzbzj);
            }
        }

        static {
            d dVar = new d();
            zzbzj = dVar;
            aq.t(d.class, dVar);
        }

        public static a A() {
            return (a) zzbzj.v();
        }

        public static void y(d dVar, int i10) {
            dVar.zzdt |= 2;
            dVar.zzbzi = i10;
        }

        public static void z(d dVar, boolean z10) {
            dVar.zzdt |= 1;
            dVar.zzbzh = z10;
        }

        public final Object q(int i10, Object obj, Object obj2) {
            switch (uw.f8300a[i10 - 1]) {
                case 1:
                    return new d();
                case 2:
                    return new a((uw) null);
                case 3:
                    return new k90(zzbzj, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzdt", "zzbzh", "zzbzi"});
                case 4:
                    return zzbzj;
                case 5:
                    f90<d> f90 = zzei;
                    if (f90 == null) {
                        synchronized (d.class) {
                            f90 = zzei;
                            if (f90 == null) {
                                f90 = new aq.a<>(zzbzj);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class e extends aq<e, a> implements c90 {
        /* access modifiers changed from: private */
        public static final e zzbzm;
        private static volatile f90<e> zzei;
        private int zzbzi;
        private boolean zzbzk;
        private boolean zzbzl;
        private int zzdt;

        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        public static final class a extends aq.b<e, a> {
            public a() {
                super(e.zzbzm);
            }

            public a(uw uwVar) {
                super(e.zzbzm);
            }
        }

        static {
            e eVar = new e();
            zzbzm = eVar;
            aq.t(e.class, eVar);
        }

        public static void A(e eVar, boolean z10) {
            eVar.zzdt |= 2;
            eVar.zzbzl = z10;
        }

        public static a B() {
            return (a) zzbzm.v();
        }

        public static void y(e eVar, int i10) {
            eVar.zzdt |= 4;
            eVar.zzbzi = i10;
        }

        public static void z(e eVar, boolean z10) {
            eVar.zzdt |= 1;
            eVar.zzbzk = z10;
        }

        public final Object q(int i10, Object obj, Object obj2) {
            switch (uw.f8300a[i10 - 1]) {
                case 1:
                    return new e();
                case 2:
                    return new a((uw) null);
                case 3:
                    return new k90(zzbzm, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzdt", "zzbzk", "zzbzl", "zzbzi"});
                case 4:
                    return zzbzm;
                case 5:
                    f90<e> f90 = zzei;
                    if (f90 == null) {
                        synchronized (e.class) {
                            f90 = zzei;
                            if (f90 == null) {
                                f90 = new aq.a<>(zzbzm);
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

    static {
        vv vvVar = new vv();
        zzbzd = vvVar;
        aq.t(vv.class, vvVar);
    }

    public static void y(vv vvVar, a aVar) {
        vvVar.getClass();
        c80<a> c80 = vvVar.zzbzc;
        if (!c80.k()) {
            vvVar.zzbzc = aq.p(c80);
        }
        vvVar.zzbzc.add(aVar);
    }

    public static b z() {
        return (b) zzbzd.v();
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (uw.f8300a[i10 - 1]) {
            case 1:
                return new vv();
            case 2:
                return new b((uw) null);
            case 3:
                return new k90(zzbzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbzc", a.class});
            case 4:
                return zzbzd;
            case 5:
                f90<vv> f90 = zzei;
                if (f90 == null) {
                    synchronized (vv.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzbzd);
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
