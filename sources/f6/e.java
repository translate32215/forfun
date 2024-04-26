package f6;

import android.net.Uri;
import ba.o0;
import ba.s;
import ba.u;
import ba.y;
import java.util.List;
import java.util.Map;

/* compiled from: HlsMediaPlaylist */
public final class e extends f {

    /* renamed from: d  reason: collision with root package name */
    public final int f18177d;

    /* renamed from: e  reason: collision with root package name */
    public final long f18178e;

    /* renamed from: f  reason: collision with root package name */
    public final long f18179f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f18180g;

    /* renamed from: h  reason: collision with root package name */
    public final int f18181h;

    /* renamed from: i  reason: collision with root package name */
    public final long f18182i;

    /* renamed from: j  reason: collision with root package name */
    public final int f18183j;

    /* renamed from: k  reason: collision with root package name */
    public final long f18184k;

    /* renamed from: l  reason: collision with root package name */
    public final long f18185l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f18186m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f18187n;

    /* renamed from: o  reason: collision with root package name */
    public final c5.f f18188o;

    /* renamed from: p  reason: collision with root package name */
    public final List<d> f18189p;

    /* renamed from: q  reason: collision with root package name */
    public final List<b> f18190q;

    /* renamed from: r  reason: collision with root package name */
    public final Map<Uri, c> f18191r;

    /* renamed from: s  reason: collision with root package name */
    public final long f18192s;

    /* renamed from: t  reason: collision with root package name */
    public final f f18193t;

    /* compiled from: HlsMediaPlaylist */
    public static final class b extends C0139e {

        /* renamed from: t  reason: collision with root package name */
        public final boolean f18194t;

        /* renamed from: u  reason: collision with root package name */
        public final boolean f18195u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, d dVar, long j10, int i10, long j11, c5.f fVar, String str2, String str3, long j12, long j13, boolean z10, boolean z11, boolean z12) {
            super(str, dVar, j10, i10, j11, fVar, str2, str3, j12, j13, z10, (a) null);
            this.f18194t = z11;
            this.f18195u = z12;
        }
    }

    /* compiled from: HlsMediaPlaylist */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final long f18196a;

        /* renamed from: b  reason: collision with root package name */
        public final int f18197b;

        public c(Uri uri, long j10, int i10) {
            this.f18196a = j10;
            this.f18197b = i10;
        }
    }

    /* renamed from: f6.e$e  reason: collision with other inner class name */
    /* compiled from: HlsMediaPlaylist */
    public static class C0139e implements Comparable<Long> {

        /* renamed from: a  reason: collision with root package name */
        public final String f18200a;

        /* renamed from: b  reason: collision with root package name */
        public final d f18201b;

        /* renamed from: c  reason: collision with root package name */
        public final long f18202c;

        /* renamed from: d  reason: collision with root package name */
        public final int f18203d;

        /* renamed from: e  reason: collision with root package name */
        public final long f18204e;

        /* renamed from: f  reason: collision with root package name */
        public final c5.f f18205f;

        /* renamed from: g  reason: collision with root package name */
        public final String f18206g;

        /* renamed from: h  reason: collision with root package name */
        public final String f18207h;

        /* renamed from: i  reason: collision with root package name */
        public final long f18208i;

        /* renamed from: r  reason: collision with root package name */
        public final long f18209r;

        /* renamed from: s  reason: collision with root package name */
        public final boolean f18210s;

        public C0139e(String str, d dVar, long j10, int i10, long j11, c5.f fVar, String str2, String str3, long j12, long j13, boolean z10, a aVar) {
            this.f18200a = str;
            this.f18201b = dVar;
            this.f18202c = j10;
            this.f18203d = i10;
            this.f18204e = j11;
            this.f18205f = fVar;
            this.f18206g = str2;
            this.f18207h = str3;
            this.f18208i = j12;
            this.f18209r = j13;
            this.f18210s = z10;
        }

        public int compareTo(Object obj) {
            Long l10 = (Long) obj;
            if (this.f18204e > l10.longValue()) {
                return 1;
            }
            return this.f18204e < l10.longValue() ? -1 : 0;
        }
    }

    /* compiled from: HlsMediaPlaylist */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final long f18211a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f18212b;

        /* renamed from: c  reason: collision with root package name */
        public final long f18213c;

        /* renamed from: d  reason: collision with root package name */
        public final long f18214d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f18215e;

        public f(long j10, boolean z10, long j11, long j12, boolean z11) {
            this.f18211a = j10;
            this.f18212b = z10;
            this.f18213c = j11;
            this.f18214d = j12;
            this.f18215e = z11;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(int i10, String str, List<String> list, long j10, long j11, boolean z10, int i11, long j12, int i12, long j13, long j14, boolean z11, boolean z12, boolean z13, c5.f fVar, List<d> list2, List<b> list3, f fVar2, Map<Uri, c> map) {
        super(str, list, z11);
        String str2 = str;
        List<String> list4 = list;
        this.f18177d = i10;
        this.f18179f = j11;
        this.f18180g = z10;
        this.f18181h = i11;
        this.f18182i = j12;
        this.f18183j = i12;
        this.f18184k = j13;
        this.f18185l = j14;
        this.f18186m = z12;
        this.f18187n = z13;
        this.f18188o = fVar;
        this.f18189p = s.z(list2);
        this.f18190q = s.z(list3);
        this.f18191r = u.a(map);
        if (!list3.isEmpty()) {
            b bVar = (b) y.b(list3);
            this.f18192s = bVar.f18204e + bVar.f18202c;
        } else if (!list2.isEmpty()) {
            d dVar = (d) y.b(list2);
            this.f18192s = dVar.f18204e + dVar.f18202c;
        } else {
            this.f18192s = 0;
        }
        this.f18178e = j10 == -9223372036854775807L ? -9223372036854775807L : j10 >= 0 ? j10 : this.f18192s + j10;
        this.f18193t = fVar2;
    }

    public Object a(List list) {
        return this;
    }

    public long b() {
        return this.f18179f + this.f18192s;
    }

    /* compiled from: HlsMediaPlaylist */
    public static final class d extends C0139e {

        /* renamed from: t  reason: collision with root package name */
        public final String f18198t;

        /* renamed from: u  reason: collision with root package name */
        public final List<b> f18199u;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public d(String str, long j10, long j11, String str2, String str3) {
            this(str, (d) null, "", 0, -1, -9223372036854775807L, (c5.f) null, str2, str3, j10, j11, false, o0.f3765e);
            ba.a<Object> aVar = s.f3795b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str, d dVar, String str2, long j10, int i10, long j11, c5.f fVar, String str3, String str4, long j12, long j13, boolean z10, List<b> list) {
            super(str, dVar, j10, i10, j11, fVar, str3, str4, j12, j13, z10, (a) null);
            this.f18198t = str2;
            this.f18199u = s.z(list);
        }
    }
}
