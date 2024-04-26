package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import com.google.android.gms.internal.ads.wv;
import e8.a80;
import e8.b80;
import e8.c80;
import e8.c90;
import e8.d70;
import e8.f80;
import e8.f90;
import e8.i90;
import e8.k90;
import e8.vh0;
import e8.w70;
import e8.x70;
import e8.y70;
import e8.z60;
import e8.z70;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class iw extends aq<iw, c> implements c90 {
    /* access modifiers changed from: private */
    public static final iw zzcdu;
    private static volatile f90<iw> zzei;
    private c80<a> zzbzc = i90.f15001d;
    private int zzcdp;
    private int zzcdq;
    private long zzcdr;
    private String zzcds = "";
    private long zzcdt;
    private int zzdt;
    private String zzdu = "";

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq<a, C0085a> implements c90 {
        private static final a80<Integer, wv.a> zzcdg = new cx();
        /* access modifiers changed from: private */
        public static final a zzcdo;
        private static volatile f90<a> zzei;
        private long zzcdb;
        private int zzcdc;
        private long zzcdd;
        private long zzcde;
        private y70 zzcdf = w70.f17224d;
        private gw zzcdh;
        private int zzcdi;
        private int zzcdj;
        private int zzcdk;
        private int zzcdl;
        private int zzcdm;
        private int zzcdn;
        private int zzdt;

        /* renamed from: com.google.android.gms.internal.ads.iw$a$a  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        public static final class C0085a extends aq.b<a, C0085a> {
            public C0085a() {
                super(a.zzcdo);
            }

            public C0085a(uw uwVar) {
                super(a.zzcdo);
            }
        }

        static {
            a aVar = new a();
            zzcdo = aVar;
            aq.t(a.class, aVar);
        }

        public static void A(a aVar, long j10) {
            aVar.zzdt |= 1;
            aVar.zzcdb = j10;
        }

        public static void B(a aVar, gw gwVar) {
            aVar.getClass();
            gwVar.getClass();
            aVar.zzcdh = gwVar;
            aVar.zzdt |= 16;
        }

        public static void C(a aVar, b bVar) {
            aVar.getClass();
            aVar.zzcdn = bVar.f7119a;
            aVar.zzdt |= 1024;
        }

        public static void D(a aVar, yw ywVar) {
            aVar.getClass();
            aVar.zzcdc = ywVar.f8664a;
            aVar.zzdt |= 2;
        }

        public static void E(a aVar, Iterable iterable) {
            y70 y70 = aVar.zzcdf;
            if (!((d70) y70).f14227a) {
                aVar.zzcdf = aq.o(y70);
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                ((w70) aVar.zzcdf).o(((wv.a) it.next()).f8491a);
            }
        }

        public static void F(a aVar, long j10) {
            aVar.zzdt |= 4;
            aVar.zzcdd = j10;
        }

        public static void G(a aVar, yw ywVar) {
            aVar.getClass();
            aVar.zzcdi = ywVar.f8664a;
            aVar.zzdt |= 32;
        }

        public static void H(a aVar, long j10) {
            aVar.zzdt |= 8;
            aVar.zzcde = j10;
        }

        public static void I(a aVar, yw ywVar) {
            aVar.getClass();
            aVar.zzcdj = ywVar.f8664a;
            aVar.zzdt |= 64;
        }

        public static void J(a aVar, yw ywVar) {
            aVar.getClass();
            aVar.zzcdk = ywVar.f8664a;
            aVar.zzdt |= 128;
        }

        public static void K(a aVar, yw ywVar) {
            aVar.getClass();
            aVar.zzcdm = ywVar.f8664a;
            aVar.zzdt |= 512;
        }

        public static a L(byte[] bArr) throws f80 {
            aq n10 = aq.n(zzcdo, bArr, bArr.length, up.a());
            aq.k(n10);
            return (a) n10;
        }

        public static C0085a X() {
            return (C0085a) zzcdo.v();
        }

        public static void z(a aVar, int i10) {
            aVar.zzdt |= 256;
            aVar.zzcdl = i10;
        }

        public final yw M() {
            yw a10 = yw.a(this.zzcdc);
            return a10 == null ? yw.ENUM_FALSE : a10;
        }

        public final long N() {
            return this.zzcdd;
        }

        public final long O() {
            return this.zzcde;
        }

        public final List<wv.a> P() {
            return new b80(this.zzcdf, zzcdg);
        }

        public final gw Q() {
            gw gwVar = this.zzcdh;
            return gwVar == null ? gw.F() : gwVar;
        }

        public final yw R() {
            yw a10 = yw.a(this.zzcdi);
            return a10 == null ? yw.ENUM_FALSE : a10;
        }

        public final yw S() {
            yw a10 = yw.a(this.zzcdj);
            return a10 == null ? yw.ENUM_FALSE : a10;
        }

        public final yw T() {
            yw a10 = yw.a(this.zzcdk);
            return a10 == null ? yw.ENUM_FALSE : a10;
        }

        public final int U() {
            return this.zzcdl;
        }

        public final yw V() {
            yw a10 = yw.a(this.zzcdm);
            return a10 == null ? yw.ENUM_FALSE : a10;
        }

        public final b W() {
            b a10 = b.a(this.zzcdn);
            return a10 == null ? b.UNSPECIFIED : a10;
        }

        public final Object q(int i10, Object obj, Object obj2) {
            switch (uw.f8300a[i10 - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C0085a((uw) null);
                case 3:
                    z70 z70 = vh0.f17147a;
                    return new k90(zzcdo, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n", new Object[]{"zzdt", "zzcdb", "zzcdc", z70, "zzcdd", "zzcde", "zzcdf", xw.f8579a, "zzcdh", "zzcdi", z70, "zzcdj", z70, "zzcdk", z70, "zzcdl", "zzcdm", z70, "zzcdn", dx.f6252a});
                case 4:
                    return zzcdo;
                case 5:
                    f90<a> f90 = zzei;
                    if (f90 == null) {
                        synchronized (a.class) {
                            f90 = zzei;
                            if (f90 == null) {
                                f90 = new aq.a<>(zzcdo);
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

        public final long y() {
            return this.zzcdb;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public enum b implements x70 {
        UNSPECIFIED(0),
        CONNECTING(1),
        CONNECTED(2),
        DISCONNECTING(3),
        DISCONNECTED(4),
        SUSPENDED(5);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f7119a;

        /* access modifiers changed from: public */
        b(int i10) {
            this.f7119a = i10;
        }

        public static b a(int i10) {
            if (i10 == 0) {
                return UNSPECIFIED;
            }
            if (i10 == 1) {
                return CONNECTING;
            }
            if (i10 == 2) {
                return CONNECTED;
            }
            if (i10 == 3) {
                return DISCONNECTING;
            }
            if (i10 == 4) {
                return DISCONNECTED;
            }
            if (i10 != 5) {
                return null;
            }
            return SUSPENDED;
        }

        public final int g() {
            return this.f7119a;
        }

        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f7119a + " name=" + name() + '>';
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class c extends aq.b<iw, c> {
        public c() {
            super(iw.zzcdu);
        }

        public c(uw uwVar) {
            super(iw.zzcdu);
        }
    }

    static {
        iw iwVar = new iw();
        zzcdu = iwVar;
        aq.t(iw.class, iwVar);
    }

    public static void A(iw iwVar, Iterable iterable) {
        c80<a> c80 = iwVar.zzbzc;
        if (!c80.k()) {
            iwVar.zzbzc = aq.p(c80);
        }
        z60.h(iterable, iwVar.zzbzc);
    }

    public static void B(iw iwVar, String str) {
        iwVar.getClass();
        str.getClass();
        iwVar.zzdt |= 8;
        iwVar.zzdu = str;
    }

    public static void C(iw iwVar, int i10) {
        iwVar.zzdt |= 2;
        iwVar.zzcdq = i10;
    }

    public static void D(iw iwVar, long j10) {
        iwVar.zzdt |= 32;
        iwVar.zzcdt = j10;
    }

    public static void E(iw iwVar, String str) {
        iwVar.getClass();
        str.getClass();
        iwVar.zzdt |= 16;
        iwVar.zzcds = str;
    }

    public static c F() {
        return (c) zzcdu.v();
    }

    public static void y(iw iwVar, int i10) {
        iwVar.zzdt |= 1;
        iwVar.zzcdp = i10;
    }

    public static void z(iw iwVar, long j10) {
        iwVar.zzdt |= 4;
        iwVar.zzcdr = j10;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (uw.f8300a[i10 - 1]) {
            case 1:
                return new iw();
            case 2:
                return new c((uw) null);
            case 3:
                return new k90(zzcdu, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005", new Object[]{"zzdt", "zzbzc", a.class, "zzcdp", "zzcdq", "zzcdr", "zzdu", "zzcds", "zzcdt"});
            case 4:
                return zzcdu;
            case 5:
                f90<iw> f90 = zzei;
                if (f90 == null) {
                    synchronized (iw.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzcdu);
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
