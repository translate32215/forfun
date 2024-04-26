package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c80;
import e8.c90;
import e8.f80;
import e8.f90;
import e8.gu;
import e8.hs;
import e8.i90;
import e8.k90;
import e8.ts;
import e8.x70;
import e8.z70;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class ma extends aq<ma, a> implements c90 {
    private static volatile f90<ma> zzei;
    /* access modifiers changed from: private */
    public static final ma zzih;
    private int zzdt;
    private String zzed = "";
    private String zzfd = "";
    private String zzff = "";
    private String zzfg = "D";
    private String zzfh = "D";
    private int zzfk;
    private int zzfl;
    private String zzfm = "";
    private long zzfn;
    private long zzfo;
    private long zzfp;
    private long zzfq;
    private long zzfr;
    private long zzfs;
    private long zzft;
    private long zzfu;
    private long zzfv;
    private long zzfw;
    private String zzfx = "";
    private long zzfy;
    private long zzfz;
    private long zzga;
    private long zzgb;
    private long zzgc;
    private long zzgd;
    private long zzge;
    private long zzgf;
    private long zzgg;
    private String zzgh = "D";
    private String zzgi = "";
    private long zzgj;
    private long zzgk;
    private long zzgl;
    private long zzgm;
    private long zzgn = -1;
    private long zzgo = -1;
    private na zzgp;
    private long zzgq = -1;
    private long zzgr = -1;
    private long zzgs = -1;
    private long zzgt = -1;
    private long zzgu = -1;
    private long zzgv = -1;
    private long zzgw = -1;
    private int zzgx = 1000;
    private int zzgy = 1000;
    private long zzgz = -1;
    private long zzha = -1;
    private long zzhb = -1;
    private long zzhc = -1;
    private long zzhd = -1;
    private int zzhe = 1000;
    private d zzhf;
    private c80<d> zzhg = i90.f15001d;
    private e zzhh;
    private long zzhi = -1;
    private long zzhj = -1;
    private long zzhk = -1;
    private long zzhl = -1;
    private long zzhm = -1;
    private long zzhn = -1;
    private long zzho = -1;
    private long zzhp = -1;
    private String zzhq = "D";
    private long zzhr = -1;
    private int zzhs;
    private int zzht;
    private int zzhu;
    private qa zzhv;
    private long zzhw = -1;
    private int zzhx = 1000;
    private int zzhy = 1000;
    private String zzhz = "D";
    private long zzia;
    private String zzib = "";
    private int zzic = 2;
    private boolean zzid;
    private String zzie = "";
    private long zzif;
    private pa zzig;

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public static final class a extends aq.b<ma, a> {
        public a() {
            super(ma.zzih);
        }

        public final a o(nb nbVar) {
            if (this.f5971c) {
                n();
                this.f5971c = false;
            }
            ma.E((ma) this.f5970b, nbVar);
            return this;
        }

        public final a p(String str) {
            if (this.f5971c) {
                n();
                this.f5971c = false;
            }
            ma.s0((ma) this.f5970b, str);
            return this;
        }

        public final a q(long j10) {
            if (this.f5971c) {
                n();
                this.f5971c = false;
            }
            ma.t0((ma) this.f5970b, j10);
            return this;
        }

        public final a r(String str) {
            if (this.f5971c) {
                n();
                this.f5971c = false;
            }
            ma.b0((ma) this.f5970b, str);
            return this;
        }

        public a(la laVar) {
            super(ma.zzih);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public enum b implements x70 {
        DEBUGGER_STATE_UNSPECIFIED(0),
        DEBUGGER_STATE_NOT_INSTALLED(1),
        DEBUGGER_STATE_INSTALLED(2),
        DEBUGGER_STATE_ACTIVE(3),
        DEBUGGER_STATE_ENVVAR(4),
        DEBUGGER_STATE_MACHPORT(5),
        DEBUGGER_STATE_ENVVAR_MACHPORT(6);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f7456a;

        /* access modifiers changed from: public */
        b(int i10) {
            this.f7456a = i10;
        }

        public final int g() {
            return this.f7456a;
        }

        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f7456a + " name=" + name() + '>';
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public enum c implements x70 {
        DEVICE_IDENTIFIER_NO_ID(0),
        DEVICE_IDENTIFIER_APP_SPECIFIC_ID(1),
        DEVICE_IDENTIFIER_GLOBAL_ID(2),
        DEVICE_IDENTIFIER_ADVERTISER_ID(3),
        DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED(4),
        DEVICE_IDENTIFIER_ANDROID_AD_ID(5),
        DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID(6);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f7465a;

        /* access modifiers changed from: public */
        c(int i10) {
            this.f7465a = i10;
        }

        public static c a(int i10) {
            switch (i10) {
                case 0:
                    return DEVICE_IDENTIFIER_NO_ID;
                case 1:
                    return DEVICE_IDENTIFIER_APP_SPECIFIC_ID;
                case 2:
                    return DEVICE_IDENTIFIER_GLOBAL_ID;
                case 3:
                    return DEVICE_IDENTIFIER_ADVERTISER_ID;
                case 4:
                    return DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED;
                case 5:
                    return DEVICE_IDENTIFIER_ANDROID_AD_ID;
                case 6:
                    return DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID;
                default:
                    return null;
            }
        }

        public final int g() {
            return this.f7465a;
        }

        public final String toString() {
            return "<" + c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f7465a + " name=" + name() + '>';
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public static final class d extends aq<d, a> implements c90 {
        private static volatile f90<d> zzei;
        /* access modifiers changed from: private */
        public static final d zzkr;
        private int zzdt;
        private long zzfy = -1;
        private long zzfz = -1;
        private long zzjy = -1;
        private long zzjz = -1;
        private long zzka = -1;
        private long zzkb = -1;
        private int zzkc = 1000;
        private long zzkd = -1;
        private long zzke = -1;
        private long zzkf = -1;
        private int zzkg = 1000;
        private long zzkh = -1;
        private long zzki = -1;
        private long zzkj = -1;
        private long zzkk = -1;
        private long zzkl;
        private long zzkm;
        private long zzkn = -1;
        private long zzko = -1;
        private long zzkp = -1;
        private long zzkq = -1;

        /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
        public static final class a extends aq.b<d, a> {
            public a() {
                super(d.zzkr);
            }

            public a(la laVar) {
                super(d.zzkr);
            }
        }

        static {
            d dVar = new d();
            zzkr = dVar;
            aq.t(d.class, dVar);
        }

        public static a A() {
            return (a) zzkr.v();
        }

        public static void C(d dVar, long j10) {
            dVar.zzdt |= 2;
            dVar.zzfz = j10;
        }

        public static void D(d dVar, nb nbVar) {
            dVar.getClass();
            dVar.zzkg = nbVar.f7568a;
            dVar.zzdt |= 1024;
        }

        public static void E(d dVar, long j10) {
            dVar.zzdt |= 4;
            dVar.zzjy = j10;
        }

        public static void F(d dVar, long j10) {
            dVar.zzdt |= 8;
            dVar.zzjz = j10;
        }

        public static void G(d dVar) {
            dVar.zzdt &= -9;
            dVar.zzjz = -1;
        }

        public static void H(d dVar, long j10) {
            dVar.zzdt |= 16;
            dVar.zzka = j10;
        }

        public static void I(d dVar, long j10) {
            dVar.zzdt |= 32;
            dVar.zzkb = j10;
        }

        public static void J(d dVar, long j10) {
            dVar.zzdt |= 128;
            dVar.zzkd = j10;
        }

        public static void K(d dVar, long j10) {
            dVar.zzdt |= 256;
            dVar.zzke = j10;
        }

        public static void L(d dVar, long j10) {
            dVar.zzdt |= 512;
            dVar.zzkf = j10;
        }

        public static void M(d dVar, long j10) {
            dVar.zzdt |= 2048;
            dVar.zzkh = j10;
        }

        public static void N(d dVar, long j10) {
            dVar.zzdt |= 4096;
            dVar.zzki = j10;
        }

        public static void O(d dVar, long j10) {
            dVar.zzdt |= 8192;
            dVar.zzkj = j10;
        }

        public static void P(d dVar, long j10) {
            dVar.zzdt |= 16384;
            dVar.zzkk = j10;
        }

        public static void Q(d dVar, long j10) {
            dVar.zzdt |= 32768;
            dVar.zzkl = j10;
        }

        public static void R(d dVar, long j10) {
            dVar.zzdt |= 65536;
            dVar.zzkm = j10;
        }

        public static void S(d dVar, long j10) {
            dVar.zzdt |= 131072;
            dVar.zzkn = j10;
        }

        public static void T(d dVar, long j10) {
            dVar.zzdt |= 262144;
            dVar.zzko = j10;
        }

        public static void y(d dVar, long j10) {
            dVar.zzdt |= 1;
            dVar.zzfy = j10;
        }

        public static void z(d dVar, nb nbVar) {
            dVar.getClass();
            dVar.zzkc = nbVar.f7568a;
            dVar.zzdt |= 64;
        }

        public final Object q(int i10, Object obj, Object obj2) {
            switch (la.f7356a[i10 - 1]) {
                case 1:
                    return new d();
                case 2:
                    return new a((la) null);
                case 3:
                    z70 z70 = ts.f16809a;
                    return new k90(zzkr, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzdt", "zzfy", "zzfz", "zzjy", "zzjz", "zzka", "zzkb", "zzkc", z70, "zzkd", "zzke", "zzkf", "zzkg", z70, "zzkh", "zzki", "zzkj", "zzkk", "zzkl", "zzkm", "zzkn", "zzko", "zzkp", "zzkq"});
                case 4:
                    return zzkr;
                case 5:
                    f90<d> f90 = zzei;
                    if (f90 == null) {
                        synchronized (d.class) {
                            f90 = zzei;
                            if (f90 == null) {
                                f90 = new aq.a<>(zzkr);
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

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public static final class e extends aq<e, a> implements c90 {
        private static volatile f90<e> zzei;
        /* access modifiers changed from: private */
        public static final e zzkw;
        private int zzdt;
        private long zzhc = -1;
        private long zzhd = -1;
        private long zzks = -1;
        private long zzkt = -1;
        private long zzku = -1;
        private long zzkv = -1;

        /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
        public static final class a extends aq.b<e, a> {
            public a() {
                super(e.zzkw);
            }

            public a(la laVar) {
                super(e.zzkw);
            }
        }

        static {
            e eVar = new e();
            zzkw = eVar;
            aq.t(e.class, eVar);
        }

        public static void B(e eVar, long j10) {
            eVar.zzdt |= 8;
            eVar.zzkt = j10;
        }

        public static void C(e eVar, long j10) {
            eVar.zzdt |= 16;
            eVar.zzku = j10;
        }

        public static void D(e eVar, long j10) {
            eVar.zzdt |= 32;
            eVar.zzkv = j10;
        }

        public static void y(e eVar, long j10) {
            eVar.zzdt |= 4;
            eVar.zzks = j10;
        }

        public static a z() {
            return (a) zzkw.v();
        }

        public final Object q(int i10, Object obj, Object obj2) {
            switch (la.f7356a[i10 - 1]) {
                case 1:
                    return new e();
                case 2:
                    return new a((la) null);
                case 3:
                    return new k90(zzkw, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"zzdt", "zzhc", "zzhd", "zzks", "zzkt", "zzku", "zzkv"});
                case 4:
                    return zzkw;
                case 5:
                    f90<e> f90 = zzei;
                    if (f90 == null) {
                        synchronized (e.class) {
                            f90 = zzei;
                            if (f90 == null) {
                                f90 = new aq.a<>(zzkw);
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
        ma maVar = new ma();
        zzih = maVar;
        aq.t(ma.class, maVar);
    }

    public static void A(ma maVar, long j10) {
        maVar.zzdt |= 4;
        maVar.zzfn = j10;
    }

    public static void A0(ma maVar, long j10) {
        maVar.zzdt |= 1073741824;
        maVar.zzgn = j10;
    }

    public static void B(ma maVar, c cVar) {
        maVar.getClass();
        maVar.zzic = cVar.f7465a;
        maVar.zzfl |= 256;
    }

    public static void B0(ma maVar, long j10) {
        maVar.zzdt |= Integer.MIN_VALUE;
        maVar.zzgo = j10;
    }

    public static void C(ma maVar, d dVar) {
        maVar.getClass();
        dVar.getClass();
        maVar.zzhf = dVar;
        maVar.zzfk |= 262144;
    }

    public static void C0(ma maVar, long j10) {
        maVar.zzfk |= 2;
        maVar.zzgq = j10;
    }

    public static void D(ma maVar, e eVar) {
        maVar.getClass();
        eVar.getClass();
        maVar.zzhh = eVar;
        maVar.zzfk |= 524288;
    }

    public static void D0(ma maVar, long j10) {
        maVar.zzfk |= 4;
        maVar.zzgr = j10;
    }

    public static void E(ma maVar, nb nbVar) {
        maVar.getClass();
        maVar.zzgx = nbVar.f7568a;
        maVar.zzfk |= 1024;
    }

    public static void E0(ma maVar, long j10) {
        maVar.zzfk |= 8;
        maVar.zzgs = j10;
    }

    public static void F(ma maVar, String str) {
        maVar.getClass();
        str.getClass();
        maVar.zzdt |= 1;
        maVar.zzfm = str;
    }

    public static void F0(ma maVar, long j10) {
        maVar.zzfk |= 16;
        maVar.zzgt = j10;
    }

    public static void G(ma maVar, boolean z10) {
        maVar.zzfl |= 512;
        maVar.zzid = z10;
    }

    public static void G0(ma maVar, long j10) {
        maVar.zzfk |= 32;
        maVar.zzgu = j10;
    }

    public static void H(ma maVar, long j10) {
        maVar.zzfk |= 16384;
        maVar.zzhb = j10;
    }

    public static void H0(ma maVar, long j10) {
        maVar.zzfk |= 64;
        maVar.zzgv = j10;
    }

    public static void I(ma maVar, long j10) {
        maVar.zzfk |= 2097152;
        maVar.zzhj = j10;
    }

    public static void I0(ma maVar, long j10) {
        maVar.zzfk |= 4096;
        maVar.zzgz = j10;
    }

    public static void J(ma maVar, long j10) {
        maVar.zzfk |= 4194304;
        maVar.zzhk = j10;
    }

    public static void J0(ma maVar, long j10) {
        maVar.zzfk |= 8192;
        maVar.zzha = j10;
    }

    public static void K(ma maVar, long j10) {
        maVar.zzfk |= 8388608;
        maVar.zzhl = j10;
    }

    public static void L(ma maVar, long j10) {
        maVar.zzfk |= 67108864;
        maVar.zzho = j10;
    }

    public static void N(ma maVar, long j10) {
        maVar.zzfk |= 134217728;
        maVar.zzhp = j10;
    }

    public static void O(ma maVar, long j10) {
        maVar.zzfl |= 2048;
        maVar.zzif = j10;
    }

    public static a V() {
        return (a) zzih.v();
    }

    public static ma W() {
        return zzih;
    }

    public static void Y(ma maVar, long j10) {
        maVar.zzdt |= 16;
        maVar.zzfp = j10;
    }

    public static void Z(ma maVar, d dVar) {
        maVar.getClass();
        dVar.getClass();
        c80<d> c80 = maVar.zzhg;
        if (!c80.k()) {
            maVar.zzhg = aq.p(c80);
        }
        maVar.zzhg.add(dVar);
    }

    public static void a0(ma maVar, nb nbVar) {
        maVar.getClass();
        maVar.zzgy = nbVar.f7568a;
        maVar.zzfk |= 2048;
    }

    public static void b0(ma maVar, String str) {
        maVar.getClass();
        str.getClass();
        maVar.zzdt |= 2;
        maVar.zzed = str;
    }

    public static void c0(ma maVar, long j10) {
        maVar.zzdt |= 32;
        maVar.zzfq = j10;
    }

    public static void d0(ma maVar, nb nbVar) {
        maVar.getClass();
        maVar.zzhe = nbVar.f7568a;
        maVar.zzfk |= 131072;
    }

    public static void e0(ma maVar, String str) {
        maVar.getClass();
        str.getClass();
        maVar.zzdt |= 4194304;
        maVar.zzfd = str;
    }

    public static void f0(ma maVar, long j10) {
        maVar.zzdt |= 1024;
        maVar.zzfv = j10;
    }

    public static void g0(ma maVar, nb nbVar) {
        maVar.getClass();
        maVar.zzhx = nbVar.f7568a;
        maVar.zzfl |= 8;
    }

    public static void h0(ma maVar, String str) {
        maVar.getClass();
        str.getClass();
        maVar.zzdt |= 16777216;
        maVar.zzgi = str;
    }

    public static void i0(ma maVar, long j10) {
        maVar.zzdt |= 2048;
        maVar.zzfw = j10;
    }

    public static void j0(ma maVar, nb nbVar) {
        maVar.getClass();
        maVar.zzhy = nbVar.f7568a;
        maVar.zzfl |= 16;
    }

    public static void k0(ma maVar, String str) {
        maVar.getClass();
        str.getClass();
        maVar.zzdt |= 268435456;
        maVar.zzff = str;
    }

    public static void l0(ma maVar, long j10) {
        maVar.zzdt |= 8192;
        maVar.zzfy = j10;
    }

    public static void m0(ma maVar, String str) {
        maVar.getClass();
        str.getClass();
        maVar.zzfk |= 128;
        maVar.zzfg = str;
    }

    public static void n0(ma maVar, long j10) {
        maVar.zzdt |= 16384;
        maVar.zzfz = j10;
    }

    public static void o0(ma maVar, String str) {
        maVar.getClass();
        str.getClass();
        maVar.zzfk |= 256;
        maVar.zzfh = str;
    }

    public static void p0(ma maVar, long j10) {
        maVar.zzdt |= 32768;
        maVar.zzga = j10;
    }

    public static void q0(ma maVar, String str) {
        maVar.getClass();
        str.getClass();
        maVar.zzfk |= 268435456;
        maVar.zzhq = str;
    }

    public static void r0(ma maVar, long j10) {
        maVar.zzdt |= 65536;
        maVar.zzgb = j10;
    }

    public static void s0(ma maVar, String str) {
        maVar.getClass();
        str.getClass();
        maVar.zzfl |= 128;
        maVar.zzib = str;
    }

    public static void t0(ma maVar, long j10) {
        maVar.zzdt |= 524288;
        maVar.zzge = j10;
    }

    public static void u0(ma maVar, long j10) {
        maVar.zzdt |= 1048576;
        maVar.zzgf = j10;
    }

    public static void v0(ma maVar, long j10) {
        maVar.zzdt |= 2097152;
        maVar.zzgg = j10;
    }

    public static void w0(ma maVar, long j10) {
        maVar.zzdt |= 33554432;
        maVar.zzgj = j10;
    }

    public static void x0(ma maVar, long j10) {
        maVar.zzdt |= 67108864;
        maVar.zzgk = j10;
    }

    public static ma y(byte[] bArr, up upVar) throws f80 {
        aq n10 = aq.n(zzih, bArr, bArr.length, upVar);
        aq.k(n10);
        return (ma) n10;
    }

    public static void y0(ma maVar, long j10) {
        maVar.zzdt |= 134217728;
        maVar.zzgl = j10;
    }

    public static void z(ma maVar) {
        maVar.getClass();
        maVar.zzhg = i90.f15001d;
    }

    public static void z0(ma maVar, long j10) {
        maVar.zzdt |= 536870912;
        maVar.zzgm = j10;
    }

    public final String M() {
        return this.zzfd;
    }

    public final boolean P() {
        return (this.zzdt & 4194304) != 0;
    }

    public final String Q() {
        return this.zzib;
    }

    public final c R() {
        c a10 = c.a(this.zzic);
        return a10 == null ? c.DEVICE_IDENTIFIER_GLOBAL_ID : a10;
    }

    public final boolean S() {
        return this.zzid;
    }

    public final boolean T() {
        return (this.zzfl & 4096) != 0;
    }

    public final pa U() {
        pa paVar = this.zzig;
        return paVar == null ? pa.A() : paVar;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (la.f7356a[i10 - 1]) {
            case 1:
                return new ma();
            case 2:
                return new a((la) null);
            case 3:
                z70 z70 = ts.f16809a;
                return new k90(zzih, "\u0001N\u0000\u0003\u0001ÉN\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂF\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈG\u0019ဂK\u001aဌH\u001bဈ\u0016\u001cဇI\u001dဈ\u0018\u001eဈJ\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0ဌ*1ဌ+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08ဌ19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=Aဌ>Bဌ?Cဈ<Dဌ@EဉAFဂBGဂ8Hဂ9IဌCJဂ)Kဈ\u0017LဌDMဈEÉဉL", new Object[]{"zzdt", "zzfk", "zzfl", "zzfm", "zzed", "zzfn", "zzfo", "zzfp", "zzfq", "zzfr", "zzfs", "zzft", "zzfu", "zzfv", "zzfw", "zzfx", "zzfy", "zzfz", "zzga", "zzgb", "zzgc", "zzgd", "zzge", "zzia", "zzgf", "zzgg", "zzib", "zzif", "zzic", hb.f6840a, "zzfd", "zzid", "zzgi", "zzie", "zzgj", "zzgk", "zzgl", "zzff", "zzgm", "zzgn", "zzgo", "zzgp", "zzgq", "zzgr", "zzgs", "zzgt", "zzhg", d.class, "zzgu", "zzgv", "zzfg", "zzfh", "zzgx", z70, "zzgy", z70, "zzhf", "zzgz", "zzha", "zzhb", "zzhc", "zzhd", "zzhe", z70, "zzhh", "zzhi", "zzhj", "zzhk", "zzhl", "zzho", "zzhp", "zzhr", "zzhs", hs.f14933a, "zzht", gu.f14825a, "zzhq", "zzhu", db.f6198a, "zzhv", "zzhw", "zzhm", "zzhn", "zzhx", z70, "zzgw", "zzgh", "zzhy", z70, "zzhz", "zzig"});
            case 4:
                return zzih;
            case 5:
                f90<ma> f90 = zzei;
                if (f90 == null) {
                    synchronized (ma.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzih);
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
