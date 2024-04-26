package x4;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import x4.f0;

/* compiled from: MediaItem */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f27503a;

    /* renamed from: b  reason: collision with root package name */
    public final g f27504b;

    /* renamed from: c  reason: collision with root package name */
    public final f f27505c;

    /* renamed from: d  reason: collision with root package name */
    public final f0 f27506d;

    /* renamed from: e  reason: collision with root package name */
    public final d f27507e;

    /* compiled from: MediaItem */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f27508a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f27509b;

        public b(Uri uri, Object obj, a aVar) {
            this.f27508a = uri;
            this.f27509b = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!this.f27508a.equals(bVar.f27508a) || !v6.e0.a(this.f27509b, bVar.f27509b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.f27508a.hashCode() * 31;
            Object obj = this.f27509b;
            return hashCode + (obj != null ? obj.hashCode() : 0);
        }
    }

    /* compiled from: MediaItem */
    public static final class c {
        public float A = -3.4028235E38f;

        /* renamed from: a  reason: collision with root package name */
        public String f27510a;

        /* renamed from: b  reason: collision with root package name */
        public Uri f27511b;

        /* renamed from: c  reason: collision with root package name */
        public String f27512c;

        /* renamed from: d  reason: collision with root package name */
        public long f27513d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f27514e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f27515f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f27516g;

        /* renamed from: h  reason: collision with root package name */
        public Uri f27517h;

        /* renamed from: i  reason: collision with root package name */
        public Map<String, String> f27518i = Collections.emptyMap();

        /* renamed from: j  reason: collision with root package name */
        public UUID f27519j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f27520k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f27521l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f27522m;

        /* renamed from: n  reason: collision with root package name */
        public List<Integer> f27523n = Collections.emptyList();

        /* renamed from: o  reason: collision with root package name */
        public byte[] f27524o;

        /* renamed from: p  reason: collision with root package name */
        public List<y5.c> f27525p = Collections.emptyList();

        /* renamed from: q  reason: collision with root package name */
        public String f27526q;

        /* renamed from: r  reason: collision with root package name */
        public List<Object> f27527r = Collections.emptyList();

        /* renamed from: s  reason: collision with root package name */
        public Uri f27528s;

        /* renamed from: t  reason: collision with root package name */
        public Object f27529t;

        /* renamed from: u  reason: collision with root package name */
        public Object f27530u;

        /* renamed from: v  reason: collision with root package name */
        public f0 f27531v;

        /* renamed from: w  reason: collision with root package name */
        public long f27532w = -9223372036854775807L;

        /* renamed from: x  reason: collision with root package name */
        public long f27533x = -9223372036854775807L;

        /* renamed from: y  reason: collision with root package name */
        public long f27534y = -9223372036854775807L;

        /* renamed from: z  reason: collision with root package name */
        public float f27535z = -3.4028235E38f;

        public e0 a() {
            g gVar;
            v6.a.d(this.f27517h == null || this.f27519j != null);
            Uri uri = this.f27511b;
            if (uri != null) {
                String str = this.f27512c;
                UUID uuid = this.f27519j;
                e eVar = uuid != null ? new e(uuid, this.f27517h, this.f27518i, this.f27520k, this.f27522m, this.f27521l, this.f27523n, this.f27524o, (a) null) : null;
                Uri uri2 = this.f27528s;
                g gVar2 = new g(uri, str, eVar, uri2 != null ? new b(uri2, this.f27529t, (a) null) : null, this.f27525p, this.f27526q, this.f27527r, this.f27530u, (a) null);
                String str2 = this.f27510a;
                if (str2 == null) {
                    str2 = uri.toString();
                }
                this.f27510a = str2;
                gVar = gVar2;
            } else {
                gVar = null;
            }
            String str3 = this.f27510a;
            str3.getClass();
            d dVar = new d(this.f27513d, Long.MIN_VALUE, this.f27514e, this.f27515f, this.f27516g, (a) null);
            f fVar = new f(this.f27532w, this.f27533x, this.f27534y, this.f27535z, this.A);
            f0 f0Var = this.f27531v;
            if (f0Var == null) {
                f0Var = new f0((String) null, (f0.a) null);
            }
            return new e0(str3, dVar, gVar, fVar, f0Var, (a) null);
        }

        public c b(List<y5.c> list) {
            List<y5.c> list2;
            if (!list.isEmpty()) {
                list2 = Collections.unmodifiableList(new ArrayList(list));
            } else {
                list2 = Collections.emptyList();
            }
            this.f27525p = list2;
            return this;
        }
    }

    /* compiled from: MediaItem */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final long f27536a;

        /* renamed from: b  reason: collision with root package name */
        public final long f27537b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f27538c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f27539d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f27540e;

        public d(long j10, long j11, boolean z10, boolean z11, boolean z12, a aVar) {
            this.f27536a = j10;
            this.f27537b = j11;
            this.f27538c = z10;
            this.f27539d = z11;
            this.f27540e = z12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f27536a == dVar.f27536a && this.f27537b == dVar.f27537b && this.f27538c == dVar.f27538c && this.f27539d == dVar.f27539d && this.f27540e == dVar.f27540e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f27536a;
            long j11 = this.f27537b;
            return (((((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f27538c ? 1 : 0)) * 31) + (this.f27539d ? 1 : 0)) * 31) + (this.f27540e ? 1 : 0);
        }
    }

    /* compiled from: MediaItem */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final UUID f27541a;

        /* renamed from: b  reason: collision with root package name */
        public final Uri f27542b;

        /* renamed from: c  reason: collision with root package name */
        public final Map<String, String> f27543c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f27544d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f27545e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f27546f;

        /* renamed from: g  reason: collision with root package name */
        public final List<Integer> f27547g;

        /* renamed from: h  reason: collision with root package name */
        public final byte[] f27548h;

        public e(UUID uuid, Uri uri, Map map, boolean z10, boolean z11, boolean z12, List list, byte[] bArr, a aVar) {
            v6.a.a(!z11 || uri != null);
            this.f27541a = uuid;
            this.f27542b = uri;
            this.f27543c = map;
            this.f27544d = z10;
            this.f27546f = z11;
            this.f27545e = z12;
            this.f27547g = list;
            this.f27548h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (!this.f27541a.equals(eVar.f27541a) || !v6.e0.a(this.f27542b, eVar.f27542b) || !v6.e0.a(this.f27543c, eVar.f27543c) || this.f27544d != eVar.f27544d || this.f27546f != eVar.f27546f || this.f27545e != eVar.f27545e || !this.f27547g.equals(eVar.f27547g) || !Arrays.equals(this.f27548h, eVar.f27548h)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.f27541a.hashCode() * 31;
            Uri uri = this.f27542b;
            int hashCode2 = uri != null ? uri.hashCode() : 0;
            int hashCode3 = this.f27543c.hashCode();
            return Arrays.hashCode(this.f27548h) + ((this.f27547g.hashCode() + ((((((((hashCode3 + ((hashCode + hashCode2) * 31)) * 31) + (this.f27544d ? 1 : 0)) * 31) + (this.f27546f ? 1 : 0)) * 31) + (this.f27545e ? 1 : 0)) * 31)) * 31);
        }
    }

    /* compiled from: MediaItem */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final long f27549a;

        /* renamed from: b  reason: collision with root package name */
        public final long f27550b;

        /* renamed from: c  reason: collision with root package name */
        public final long f27551c;

        /* renamed from: d  reason: collision with root package name */
        public final float f27552d;

        /* renamed from: e  reason: collision with root package name */
        public final float f27553e;

        public f(long j10, long j11, long j12, float f10, float f11) {
            this.f27549a = j10;
            this.f27550b = j11;
            this.f27551c = j12;
            this.f27552d = f10;
            this.f27553e = f11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (this.f27549a == fVar.f27549a && this.f27550b == fVar.f27550b && this.f27551c == fVar.f27551c && this.f27552d == fVar.f27552d && this.f27553e == fVar.f27553e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f27549a;
            long j11 = this.f27550b;
            long j12 = this.f27551c;
            int i10 = ((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            float f10 = this.f27552d;
            int i11 = 0;
            int floatToIntBits = (i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f27553e;
            if (f11 != 0.0f) {
                i11 = Float.floatToIntBits(f11);
            }
            return floatToIntBits + i11;
        }
    }

    /* compiled from: MediaItem */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f27554a;

        /* renamed from: b  reason: collision with root package name */
        public final String f27555b;

        /* renamed from: c  reason: collision with root package name */
        public final e f27556c;

        /* renamed from: d  reason: collision with root package name */
        public final b f27557d;

        /* renamed from: e  reason: collision with root package name */
        public final List<y5.c> f27558e;

        /* renamed from: f  reason: collision with root package name */
        public final String f27559f;

        /* renamed from: g  reason: collision with root package name */
        public final List<Object> f27560g;

        /* renamed from: h  reason: collision with root package name */
        public final Object f27561h;

        public g(Uri uri, String str, e eVar, b bVar, List list, String str2, List list2, Object obj, a aVar) {
            this.f27554a = uri;
            this.f27555b = str;
            this.f27556c = eVar;
            this.f27557d = bVar;
            this.f27558e = list;
            this.f27559f = str2;
            this.f27560g = list2;
            this.f27561h = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (!this.f27554a.equals(gVar.f27554a) || !v6.e0.a(this.f27555b, gVar.f27555b) || !v6.e0.a(this.f27556c, gVar.f27556c) || !v6.e0.a(this.f27557d, gVar.f27557d) || !this.f27558e.equals(gVar.f27558e) || !v6.e0.a(this.f27559f, gVar.f27559f) || !this.f27560g.equals(gVar.f27560g) || !v6.e0.a(this.f27561h, gVar.f27561h)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.f27554a.hashCode() * 31;
            String str = this.f27555b;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            e eVar = this.f27556c;
            int hashCode3 = (hashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
            b bVar = this.f27557d;
            int hashCode4 = (this.f27558e.hashCode() + ((hashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
            String str2 = this.f27559f;
            int hashCode5 = (this.f27560g.hashCode() + ((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Object obj = this.f27561h;
            if (obj != null) {
                i10 = obj.hashCode();
            }
            return hashCode5 + i10;
        }
    }

    public e0(String str, d dVar, g gVar, f fVar, f0 f0Var, a aVar) {
        this.f27503a = str;
        this.f27504b = gVar;
        this.f27505c = fVar;
        this.f27506d = f0Var;
        this.f27507e = dVar;
    }

    public c a() {
        c cVar = new c();
        d dVar = this.f27507e;
        long j10 = dVar.f27537b;
        cVar.f27514e = dVar.f27538c;
        cVar.f27515f = dVar.f27539d;
        cVar.f27513d = dVar.f27536a;
        cVar.f27516g = dVar.f27540e;
        cVar.f27510a = this.f27503a;
        cVar.f27531v = this.f27506d;
        f fVar = this.f27505c;
        cVar.f27532w = fVar.f27549a;
        cVar.f27533x = fVar.f27550b;
        cVar.f27534y = fVar.f27551c;
        cVar.f27535z = fVar.f27552d;
        cVar.A = fVar.f27553e;
        g gVar = this.f27504b;
        if (gVar != null) {
            cVar.f27526q = gVar.f27559f;
            cVar.f27512c = gVar.f27555b;
            cVar.f27511b = gVar.f27554a;
            cVar.f27525p = gVar.f27558e;
            cVar.f27527r = gVar.f27560g;
            cVar.f27530u = gVar.f27561h;
            e eVar = gVar.f27556c;
            if (eVar != null) {
                cVar.f27517h = eVar.f27542b;
                cVar.f27518i = eVar.f27543c;
                cVar.f27520k = eVar.f27544d;
                cVar.f27522m = eVar.f27546f;
                cVar.f27521l = eVar.f27545e;
                cVar.f27523n = eVar.f27547g;
                cVar.f27519j = eVar.f27541a;
                byte[] bArr = eVar.f27548h;
                cVar.f27524o = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
            }
            b bVar = gVar.f27557d;
            if (bVar != null) {
                cVar.f27528s = bVar.f27508a;
                cVar.f27529t = bVar.f27509b;
            }
        }
        return cVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (!v6.e0.a(this.f27503a, e0Var.f27503a) || !this.f27507e.equals(e0Var.f27507e) || !v6.e0.a(this.f27504b, e0Var.f27504b) || !v6.e0.a(this.f27505c, e0Var.f27505c) || !v6.e0.a(this.f27506d, e0Var.f27506d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.f27503a.hashCode() * 31;
        g gVar = this.f27504b;
        int hashCode2 = gVar != null ? gVar.hashCode() : 0;
        int hashCode3 = this.f27505c.hashCode();
        return this.f27506d.hashCode() + ((this.f27507e.hashCode() + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31);
    }
}
