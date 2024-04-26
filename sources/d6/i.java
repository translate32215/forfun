package d6;

import android.net.Uri;
import b2.t;
import d6.j;
import java.util.Collections;
import java.util.List;
import v6.e0;
import x4.b0;

/* compiled from: Representation */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f13122a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13123b;

    /* renamed from: c  reason: collision with root package name */
    public final long f13124c;

    /* renamed from: d  reason: collision with root package name */
    public final List<d> f13125d;

    /* renamed from: e  reason: collision with root package name */
    public final h f13126e;

    /* compiled from: Representation */
    public static class b extends i implements c6.b {

        /* renamed from: f  reason: collision with root package name */
        public final j.a f13127f;

        public b(long j10, b0 b0Var, String str, j.a aVar, List<d> list) {
            super(j10, b0Var, str, aVar, list, (a) null);
            this.f13127f = aVar;
        }

        public int B(long j10) {
            return this.f13127f.d(j10);
        }

        public int C(long j10, long j11) {
            return this.f13127f.b(j10, j11);
        }

        public String a() {
            return null;
        }

        public c6.b b() {
            return this;
        }

        public h c() {
            return null;
        }

        public long d(long j10) {
            return this.f13127f.g(j10);
        }

        public long h(long j10, long j11) {
            return this.f13127f.f(j10, j11);
        }

        public long l(long j10, long j11) {
            return this.f13127f.e(j10, j11);
        }

        public long n(long j10, long j11) {
            return this.f13127f.c(j10, j11);
        }

        public long t(long j10, long j11) {
            j.a aVar = this.f13127f;
            if (aVar.f13136f != null) {
                return -9223372036854775807L;
            }
            long c10 = aVar.c(j10, j11) + ((long) aVar.b(j10, j11));
            return (aVar.e(c10, j10) + aVar.g(c10)) - aVar.f13139i;
        }

        public h u(long j10) {
            return this.f13127f.h(this, j10);
        }

        public boolean w() {
            return this.f13127f.i();
        }

        public long x() {
            return this.f13127f.f13134d;
        }
    }

    /* compiled from: Representation */
    public static class c extends i {

        /* renamed from: f  reason: collision with root package name */
        public final String f13128f;

        /* renamed from: g  reason: collision with root package name */
        public final h f13129g;

        /* renamed from: h  reason: collision with root package name */
        public final t f13130h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(long j10, b0 b0Var, String str, j.e eVar, List<d> list, String str2, long j11) {
            super(j10, b0Var, str, eVar, list, (a) null);
            h hVar;
            j.e eVar2 = eVar;
            Uri.parse(str);
            long j12 = eVar2.f13147e;
            t tVar = null;
            if (j12 <= 0) {
                hVar = null;
            } else {
                hVar = new h((String) null, eVar2.f13146d, j12);
            }
            this.f13129g = hVar;
            this.f13128f = str2;
            this.f13130h = hVar == null ? new t(new h((String) null, 0, j11)) : tVar;
        }

        public String a() {
            return this.f13128f;
        }

        public c6.b b() {
            return this.f13130h;
        }

        public h c() {
            return this.f13129g;
        }
    }

    public i(long j10, b0 b0Var, String str, j jVar, List list, a aVar) {
        List<d> list2;
        this.f13122a = b0Var;
        this.f13123b = str;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = Collections.unmodifiableList(list);
        }
        this.f13125d = list2;
        this.f13126e = jVar.a(this);
        this.f13124c = e0.P(jVar.f13133c, 1000000, jVar.f13132b);
    }

    public abstract String a();

    public abstract c6.b b();

    public abstract h c();
}
