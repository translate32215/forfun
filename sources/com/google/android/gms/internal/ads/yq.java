package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c80;
import e8.c90;
import e8.f90;
import e8.i90;
import e8.ia0;
import e8.k90;
import e8.w70;
import e8.x70;
import e8.y70;
import e8.z60;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class yq extends aq<yq, b> implements c90 {
    private static volatile f90<yq> zzei;
    /* access modifiers changed from: private */
    public static final yq zzixc;
    private int zzbzn;
    private int zzdt;
    private mp zzivw;
    private byte zziwa = 2;
    private String zziwd = "";
    private int zziwn;
    private String zziwo = "";
    private String zziwp = "";
    private a zziwq;
    private c80<h> zziwr;
    private String zziws;
    private f zziwt;
    private boolean zziwu;
    private c80<String> zziwv;
    private String zziww;
    private boolean zziwx;
    private boolean zziwy;
    private i zziwz;
    private c80<String> zzixa;
    private c80<String> zzixb;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq<a, C0088a> implements c90 {
        private static volatile f90<a> zzei;
        /* access modifiers changed from: private */
        public static final a zzixe;
        private int zzdt;
        private String zzixd = "";

        /* renamed from: com.google.android.gms.internal.ads.yq$a$a  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        public static final class C0088a extends aq.b<a, C0088a> {
            public C0088a() {
                super(a.zzixe);
            }

            public C0088a(wq wqVar) {
                super(a.zzixe);
            }
        }

        static {
            a aVar = new a();
            zzixe = aVar;
            aq.t(a.class, aVar);
        }

        public static void y(a aVar, String str) {
            aVar.getClass();
            str.getClass();
            aVar.zzdt |= 1;
            aVar.zzixd = str;
        }

        public static C0088a z() {
            return (C0088a) zzixe.v();
        }

        public final Object q(int i10, Object obj, Object obj2) {
            switch (wq.f8477a[i10 - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C0088a((wq) null);
                case 3:
                    return new k90(zzixe, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzdt", "zzixd"});
                case 4:
                    return zzixe;
                case 5:
                    f90<a> f90 = zzei;
                    if (f90 == null) {
                        synchronized (a.class) {
                            f90 = zzei;
                            if (f90 == null) {
                                f90 = new aq.a<>(zzixe);
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
    public static final class b extends aq.b<yq, b> {
        public b() {
            super(yq.zzixc);
        }

        public b(wq wqVar) {
            super(yq.zzixc);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class c extends aq<c, a> implements c90 {
        private static volatile f90<c> zzei;
        /* access modifiers changed from: private */
        public static final c zzixg;
        private int zzdt;
        private mp zzifd;
        private byte zziwa = 2;
        private mp zzixf;

        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        public static final class a extends aq.b<c, a> {
            public a() {
                super(c.zzixg);
            }

            public a(wq wqVar) {
                super(c.zzixg);
            }
        }

        static {
            c cVar = new c();
            zzixg = cVar;
            aq.t(c.class, cVar);
        }

        public c() {
            mp mpVar = mp.f7494b;
            this.zzixf = mpVar;
            this.zzifd = mpVar;
        }

        public static a A() {
            return (a) zzixg.v();
        }

        public static void y(c cVar, mp mpVar) {
            cVar.getClass();
            mpVar.getClass();
            cVar.zzdt |= 1;
            cVar.zzixf = mpVar;
        }

        public static void z(c cVar, mp mpVar) {
            cVar.getClass();
            mpVar.getClass();
            cVar.zzdt |= 2;
            cVar.zzifd = mpVar;
        }

        public final Object q(int i10, Object obj, Object obj2) {
            int i11 = 1;
            switch (wq.f8477a[i10 - 1]) {
                case 1:
                    return new c();
                case 2:
                    return new a((wq) null);
                case 3:
                    return new k90(zzixg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzdt", "zzixf", "zzifd"});
                case 4:
                    return zzixg;
                case 5:
                    f90<c> f90 = zzei;
                    if (f90 == null) {
                        synchronized (c.class) {
                            f90 = zzei;
                            if (f90 == null) {
                                f90 = new aq.a<>(zzixg);
                                zzei = f90;
                            }
                        }
                    }
                    return f90;
                case 6:
                    return Byte.valueOf(this.zziwa);
                case 7:
                    if (obj == null) {
                        i11 = 0;
                    }
                    this.zziwa = (byte) i11;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class d extends aq<d, b> implements c90 {
        private static volatile f90<d> zzei;
        /* access modifiers changed from: private */
        public static final d zzixm;
        private int zzdt;
        private byte zziwa = 2;
        private a zzixh;
        private c80<c> zzixi = i90.f15001d;
        private mp zzixj;
        private mp zzixk;
        private int zzixl;

        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        public static final class a extends aq<a, C0089a> implements c90 {
            private static volatile f90<a> zzei;
            /* access modifiers changed from: private */
            public static final a zzixq;
            private int zzdt;
            private mp zzixn;
            private mp zzixo;
            private mp zzixp;

            /* renamed from: com.google.android.gms.internal.ads.yq$d$a$a  reason: collision with other inner class name */
            /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
            public static final class C0089a extends aq.b<a, C0089a> {
                public C0089a(wq wqVar) {
                    super(a.zzixq);
                }
            }

            static {
                a aVar = new a();
                zzixq = aVar;
                aq.t(a.class, aVar);
            }

            public a() {
                mp mpVar = mp.f7494b;
                this.zzixn = mpVar;
                this.zzixo = mpVar;
                this.zzixp = mpVar;
            }

            public final Object q(int i10, Object obj, Object obj2) {
                switch (wq.f8477a[i10 - 1]) {
                    case 1:
                        return new a();
                    case 2:
                        return new C0089a((wq) null);
                    case 3:
                        return new k90(zzixq, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzdt", "zzixn", "zzixo", "zzixp"});
                    case 4:
                        return zzixq;
                    case 5:
                        f90<a> f90 = zzei;
                        if (f90 == null) {
                            synchronized (a.class) {
                                f90 = zzei;
                                if (f90 == null) {
                                    f90 = new aq.a<>(zzixq);
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
        public static final class b extends aq.b<d, b> {
            public b() {
                super(d.zzixm);
            }

            public b(wq wqVar) {
                super(d.zzixm);
            }
        }

        static {
            d dVar = new d();
            zzixm = dVar;
            aq.t(d.class, dVar);
        }

        public d() {
            mp mpVar = mp.f7494b;
            this.zzixj = mpVar;
            this.zzixk = mpVar;
        }

        public static void y(d dVar, c cVar) {
            dVar.getClass();
            cVar.getClass();
            c80<c> c80 = dVar.zzixi;
            if (!c80.k()) {
                dVar.zzixi = aq.p(c80);
            }
            dVar.zzixi.add(cVar);
        }

        public static b z() {
            return (b) zzixm.v();
        }

        public final Object q(int i10, Object obj, Object obj2) {
            int i11 = 1;
            switch (wq.f8477a[i10 - 1]) {
                case 1:
                    return new d();
                case 2:
                    return new b((wq) null);
                case 3:
                    return new k90(zzixm, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzdt", "zzixh", "zzixi", c.class, "zzixj", "zzixk", "zzixl"});
                case 4:
                    return zzixm;
                case 5:
                    f90<d> f90 = zzei;
                    if (f90 == null) {
                        synchronized (d.class) {
                            f90 = zzei;
                            if (f90 == null) {
                                f90 = new aq.a<>(zzixm);
                                zzei = f90;
                            }
                        }
                    }
                    return f90;
                case 6:
                    return Byte.valueOf(this.zziwa);
                case 7:
                    if (obj == null) {
                        i11 = 0;
                    }
                    this.zziwa = (byte) i11;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class e extends aq<e, b> implements c90 {
        private static volatile f90<e> zzei;
        /* access modifiers changed from: private */
        public static final e zzixt;
        private int zzdt;
        private byte zziwa = 2;
        private c80<c> zzixi = i90.f15001d;
        private mp zzixj;
        private mp zzixk;
        private int zzixl;
        private a zzixr;
        private mp zzixs;

        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        public static final class a extends aq<a, C0090a> implements c90 {
            private static volatile f90<a> zzei;
            /* access modifiers changed from: private */
            public static final a zzixw;
            private int zzdt;
            private mp zzixp;
            private int zzixu;
            private mp zzixv;

            /* renamed from: com.google.android.gms.internal.ads.yq$e$a$a  reason: collision with other inner class name */
            /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
            public static final class C0090a extends aq.b<a, C0090a> {
                public C0090a(wq wqVar) {
                    super(a.zzixw);
                }
            }

            static {
                a aVar = new a();
                zzixw = aVar;
                aq.t(a.class, aVar);
            }

            public a() {
                mp mpVar = mp.f7494b;
                this.zzixv = mpVar;
                this.zzixp = mpVar;
            }

            public final Object q(int i10, Object obj, Object obj2) {
                switch (wq.f8477a[i10 - 1]) {
                    case 1:
                        return new a();
                    case 2:
                        return new C0090a((wq) null);
                    case 3:
                        return new k90(zzixw, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzdt", "zzixu", "zzixv", "zzixp"});
                    case 4:
                        return zzixw;
                    case 5:
                        f90<a> f90 = zzei;
                        if (f90 == null) {
                            synchronized (a.class) {
                                f90 = zzei;
                                if (f90 == null) {
                                    f90 = new aq.a<>(zzixw);
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
        public static final class b extends aq.b<e, b> {
            public b(wq wqVar) {
                super(e.zzixt);
            }
        }

        static {
            e eVar = new e();
            zzixt = eVar;
            aq.t(e.class, eVar);
        }

        public e() {
            mp mpVar = mp.f7494b;
            this.zzixj = mpVar;
            this.zzixk = mpVar;
            this.zzixs = mpVar;
        }

        public final Object q(int i10, Object obj, Object obj2) {
            int i11 = 1;
            switch (wq.f8477a[i10 - 1]) {
                case 1:
                    return new e();
                case 2:
                    return new b((wq) null);
                case 3:
                    return new k90(zzixt, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzdt", "zzixr", "zzixi", c.class, "zzixj", "zzixk", "zzixl", "zzixs"});
                case 4:
                    return zzixt;
                case 5:
                    f90<e> f90 = zzei;
                    if (f90 == null) {
                        synchronized (e.class) {
                            f90 = zzei;
                            if (f90 == null) {
                                f90 = new aq.a<>(zzixt);
                                zzei = f90;
                            }
                        }
                    }
                    return f90;
                case 6:
                    return Byte.valueOf(this.zziwa);
                case 7:
                    if (obj == null) {
                        i11 = 0;
                    }
                    this.zziwa = (byte) i11;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class f extends aq<f, b> implements c90 {
        private static volatile f90<f> zzei;
        /* access modifiers changed from: private */
        public static final f zzixz;
        private int zzbzn;
        private int zzdt;
        private String zzixx = "";
        private mp zzixy = mp.f7494b;

        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        public enum a implements x70 {
            TYPE_UNKNOWN(0),
            TYPE_CREATIVE(1);
            

            /* renamed from: a  reason: collision with root package name */
            public final int f8622a;

            /* access modifiers changed from: public */
            a(int i10) {
                this.f8622a = i10;
            }

            public final int g() {
                return this.f8622a;
            }

            public final String toString() {
                return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8622a + " name=" + name() + '>';
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        public static final class b extends aq.b<f, b> {
            public b() {
                super(f.zzixz);
            }

            public b(wq wqVar) {
                super(f.zzixz);
            }
        }

        static {
            f fVar = new f();
            zzixz = fVar;
            aq.t(f.class, fVar);
        }

        public static void A(f fVar, String str) {
            fVar.getClass();
            str.getClass();
            fVar.zzdt |= 2;
            fVar.zzixx = str;
        }

        public static b B() {
            return (b) zzixz.v();
        }

        public static void y(f fVar, mp mpVar) {
            fVar.getClass();
            mpVar.getClass();
            fVar.zzdt |= 4;
            fVar.zzixy = mpVar;
        }

        public static void z(f fVar, a aVar) {
            fVar.getClass();
            fVar.zzbzn = aVar.f8622a;
            fVar.zzdt |= 1;
        }

        public final Object q(int i10, Object obj, Object obj2) {
            switch (wq.f8477a[i10 - 1]) {
                case 1:
                    return new f();
                case 2:
                    return new b((wq) null);
                case 3:
                    return new k90(zzixz, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"zzdt", "zzbzn", zq.f8731a, "zzixx", "zzixy"});
                case 4:
                    return zzixz;
                case 5:
                    f90<f> f90 = zzei;
                    if (f90 == null) {
                        synchronized (f.class) {
                            f90 = zzei;
                            if (f90 == null) {
                                f90 = new aq.a<>(zzixz);
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
    public enum g implements x70 {
        UNKNOWN(0),
        URL_PHISHING(1),
        URL_MALWARE(2),
        URL_UNWANTED(3),
        CLIENT_SIDE_PHISHING_URL(4),
        CLIENT_SIDE_MALWARE_URL(5),
        DANGEROUS_DOWNLOAD_RECOVERY(6),
        DANGEROUS_DOWNLOAD_WARNING(7),
        OCTAGON_AD(8),
        OCTAGON_AD_SB_MATCH(9);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f8634a;

        /* access modifiers changed from: public */
        g(int i10) {
            this.f8634a = i10;
        }

        public final int g() {
            return this.f8634a;
        }

        public final String toString() {
            return "<" + g.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8634a + " name=" + name() + '>';
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class h extends aq<h, b> implements c90 {
        private static volatile f90<h> zzei;
        /* access modifiers changed from: private */
        public static final h zziyw;
        private int zzdt;
        private byte zziwa = 2;
        private String zziwd = "";
        private int zziyo;
        private d zziyp;
        private e zziyq;
        private int zziyr;
        private y70 zziys = w70.f17224d;
        private String zziyt = "";
        private int zziyu;
        private c80<String> zziyv = i90.f15001d;

        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        public enum a implements x70 {
            AD_RESOURCE_UNKNOWN(0),
            AD_RESOURCE_CREATIVE(1),
            AD_RESOURCE_POST_CLICK(2),
            AD_RESOURCE_AUTO_CLICK_DESTINATION(3);
            

            /* renamed from: a  reason: collision with root package name */
            public final int f8640a;

            /* access modifiers changed from: public */
            a(int i10) {
                this.f8640a = i10;
            }

            public static a a(int i10) {
                if (i10 == 0) {
                    return AD_RESOURCE_UNKNOWN;
                }
                if (i10 == 1) {
                    return AD_RESOURCE_CREATIVE;
                }
                if (i10 == 2) {
                    return AD_RESOURCE_POST_CLICK;
                }
                if (i10 != 3) {
                    return null;
                }
                return AD_RESOURCE_AUTO_CLICK_DESTINATION;
            }

            public final int g() {
                return this.f8640a;
            }

            public final String toString() {
                return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8640a + " name=" + name() + '>';
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        public static final class b extends aq.b<h, b> {
            public b() {
                super(h.zziyw);
            }

            public b(wq wqVar) {
                super(h.zziyw);
            }
        }

        static {
            h hVar = new h();
            zziyw = hVar;
            aq.t(h.class, hVar);
        }

        public static void A(h hVar, d dVar) {
            hVar.getClass();
            dVar.getClass();
            hVar.zziyp = dVar;
            hVar.zzdt |= 4;
        }

        public static void B(h hVar, a aVar) {
            hVar.getClass();
            hVar.zziyu = aVar.f8640a;
            hVar.zzdt |= 64;
        }

        public static void C(h hVar, String str) {
            hVar.getClass();
            str.getClass();
            hVar.zzdt |= 2;
            hVar.zziwd = str;
        }

        public static void D(h hVar, String str) {
            hVar.getClass();
            str.getClass();
            c80<String> c80 = hVar.zziyv;
            if (!c80.k()) {
                hVar.zziyv = aq.p(c80);
            }
            hVar.zziyv.add(str);
        }

        public static b F() {
            return (b) zziyw.v();
        }

        public static void z(h hVar, int i10) {
            hVar.zzdt |= 1;
            hVar.zziyo = i10;
        }

        public final int E() {
            return this.zziyv.size();
        }

        public final Object q(int i10, Object obj, Object obj2) {
            int i11 = 1;
            switch (wq.f8477a[i10 - 1]) {
                case 1:
                    return new h();
                case 2:
                    return new b((wq) null);
                case 3:
                    return new k90(zziyw, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zzdt", "zziyo", "zziwd", "zziyp", "zziyq", "zziyr", "zziys", "zziyt", "zziyu", br.f6053a, "zziyv"});
                case 4:
                    return zziyw;
                case 5:
                    f90<h> f90 = zzei;
                    if (f90 == null) {
                        synchronized (h.class) {
                            f90 = zzei;
                            if (f90 == null) {
                                f90 = new aq.a<>(zziyw);
                                zzei = f90;
                            }
                        }
                    }
                    return f90;
                case 6:
                    return Byte.valueOf(this.zziwa);
                case 7:
                    if (obj == null) {
                        i11 = 0;
                    }
                    this.zziwa = (byte) i11;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final String y() {
            return this.zziwd;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class i extends aq<i, a> implements c90 {
        private static volatile f90<i> zzei;
        /* access modifiers changed from: private */
        public static final i zzizf;
        private int zzdt;
        private String zzizc = "";
        private long zzizd;
        private boolean zzize;

        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        public static final class a extends aq.b<i, a> {
            public a() {
                super(i.zzizf);
            }

            public a(wq wqVar) {
                super(i.zzizf);
            }
        }

        static {
            i iVar = new i();
            zzizf = iVar;
            aq.t(i.class, iVar);
        }

        public static void A(i iVar, boolean z10) {
            iVar.zzdt |= 4;
            iVar.zzize = z10;
        }

        public static a B() {
            return (a) zzizf.v();
        }

        public static void y(i iVar, long j10) {
            iVar.zzdt |= 2;
            iVar.zzizd = j10;
        }

        public static void z(i iVar, String str) {
            iVar.getClass();
            str.getClass();
            iVar.zzdt |= 1;
            iVar.zzizc = str;
        }

        public final Object q(int i10, Object obj, Object obj2) {
            switch (wq.f8477a[i10 - 1]) {
                case 1:
                    return new i();
                case 2:
                    return new a((wq) null);
                case 3:
                    return new k90(zzizf, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"zzdt", "zzizc", "zzizd", "zzize"});
                case 4:
                    return zzizf;
                case 5:
                    f90<i> f90 = zzei;
                    if (f90 == null) {
                        synchronized (i.class) {
                            f90 = zzei;
                            if (f90 == null) {
                                f90 = new aq.a<>(zzizf);
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
        yq yqVar = new yq();
        zzixc = yqVar;
        aq.t(yq.class, yqVar);
    }

    public yq() {
        i90<Object> i90 = i90.f15001d;
        this.zziwr = i90;
        this.zziws = "";
        this.zziwv = i90;
        this.zziww = "";
        this.zzivw = mp.f7494b;
        this.zzixa = i90;
        this.zzixb = i90;
    }

    public static void A(yq yqVar, a aVar) {
        yqVar.getClass();
        aVar.getClass();
        yqVar.zziwq = aVar;
        yqVar.zzdt |= 32;
    }

    public static void B(yq yqVar, f fVar) {
        yqVar.getClass();
        fVar.getClass();
        yqVar.zziwt = fVar;
        yqVar.zzdt |= 128;
    }

    public static void C(yq yqVar, g gVar) {
        yqVar.getClass();
        yqVar.zzbzn = gVar.f8634a;
        yqVar.zzdt |= 1;
    }

    public static void D(yq yqVar, h hVar) {
        yqVar.getClass();
        hVar.getClass();
        c80<h> c80 = yqVar.zziwr;
        if (!c80.k()) {
            yqVar.zziwr = aq.p(c80);
        }
        yqVar.zziwr.add(hVar);
    }

    public static void E(yq yqVar, i iVar) {
        yqVar.getClass();
        iVar.getClass();
        yqVar.zziwz = iVar;
        yqVar.zzdt |= 8192;
    }

    public static void F(yq yqVar, Iterable iterable) {
        c80<String> c80 = yqVar.zzixa;
        if (!c80.k()) {
            yqVar.zzixa = aq.p(c80);
        }
        z60.h(iterable, yqVar.zzixa);
    }

    public static void G(yq yqVar, String str) {
        yqVar.getClass();
        str.getClass();
        yqVar.zzdt |= 4;
        yqVar.zziwd = str;
    }

    public static void H(yq yqVar, Iterable iterable) {
        c80<String> c80 = yqVar.zzixb;
        if (!c80.k()) {
            yqVar.zzixb = aq.p(c80);
        }
        z60.h(iterable, yqVar.zzixb);
    }

    public static void I(yq yqVar, String str) {
        yqVar.getClass();
        str.getClass();
        yqVar.zzdt |= 8;
        yqVar.zziwo = str;
    }

    public static b L() {
        return (b) zzixc.v();
    }

    public static void N(yq yqVar, String str) {
        yqVar.getClass();
        str.getClass();
        yqVar.zzdt |= 64;
        yqVar.zziws = str;
    }

    public static void z(yq yqVar) {
        yqVar.zzdt &= -65;
        yqVar.zziws = zzixc.zziws;
    }

    public final List<h> J() {
        return this.zziwr;
    }

    public final String K() {
        return this.zziws;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        int i11 = 1;
        switch (wq.f8477a[i10 - 1]) {
            case 1:
                return new yq();
            case 2:
                return new b((wq) null);
            case 3:
                return new k90(zzixc, "\u0001\u0012\u0000\u0001\u0001\u0015\u0012\u0000\u0004\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\nဌ\u0000\u000bဌ\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0011ဉ\r\u0014\u001a\u0015\u001a", new Object[]{"zzdt", "zziwd", "zziwo", "zziwp", "zziwr", h.class, "zziwu", "zziwv", "zziww", "zziwx", "zziwy", "zzbzn", ar.f5973a, "zziwn", ia0.f15004a, "zziwq", "zziws", "zziwt", "zzivw", "zziwz", "zzixa", "zzixb"});
            case 4:
                return zzixc;
            case 5:
                f90<yq> f90 = zzei;
                if (f90 == null) {
                    synchronized (yq.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzixc);
                            zzei = f90;
                        }
                    }
                }
                return f90;
            case 6:
                return Byte.valueOf(this.zziwa);
            case 7:
                if (obj == null) {
                    i11 = 0;
                }
                this.zziwa = (byte) i11;
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final String y() {
        return this.zziwd;
    }
}
