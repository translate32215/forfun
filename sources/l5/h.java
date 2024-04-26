package l5;

import d5.a0;
import d5.j;
import d5.k;
import d5.x;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import v6.v;
import x4.b0;

/* compiled from: StreamReader */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public final d f21076a = new d();

    /* renamed from: b  reason: collision with root package name */
    public a0 f21077b;

    /* renamed from: c  reason: collision with root package name */
    public k f21078c;

    /* renamed from: d  reason: collision with root package name */
    public f f21079d;

    /* renamed from: e  reason: collision with root package name */
    public long f21080e;

    /* renamed from: f  reason: collision with root package name */
    public long f21081f;

    /* renamed from: g  reason: collision with root package name */
    public long f21082g;

    /* renamed from: h  reason: collision with root package name */
    public int f21083h;

    /* renamed from: i  reason: collision with root package name */
    public int f21084i;

    /* renamed from: j  reason: collision with root package name */
    public b f21085j = new b();

    /* renamed from: k  reason: collision with root package name */
    public long f21086k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f21087l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f21088m;

    /* compiled from: StreamReader */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public b0 f21089a;

        /* renamed from: b  reason: collision with root package name */
        public f f21090b;
    }

    /* compiled from: StreamReader */
    public static final class c implements f {
        public c(a aVar) {
        }

        public x a() {
            return new x.b(-9223372036854775807L, 0);
        }

        public long b(j jVar) {
            return -1;
        }

        public void c(long j10) {
        }
    }

    public long a(long j10) {
        return (((long) this.f21084i) * j10) / 1000000;
    }

    public void b(long j10) {
        this.f21082g = j10;
    }

    public abstract long c(v vVar);

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean d(v vVar, long j10, b bVar) throws IOException;

    public void e(boolean z10) {
        if (z10) {
            this.f21085j = new b();
            this.f21081f = 0;
            this.f21083h = 0;
        } else {
            this.f21083h = 1;
        }
        this.f21080e = -1;
        this.f21082g = 0;
    }
}
