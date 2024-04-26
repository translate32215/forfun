package b6;

import android.util.SparseArray;
import b6.f;
import com.google.android.exoplayer2.upstream.c;
import d5.a0;
import d5.h;
import d5.i;
import d5.j;
import d5.k;
import d5.w;
import d5.x;
import d5.z;
import java.io.IOException;
import v6.e0;
import v6.v;
import x4.b0;

/* compiled from: BundledChunkExtractor */
public final class d implements k, f {

    /* renamed from: r  reason: collision with root package name */
    public static final w f3572r = new w(0);

    /* renamed from: a  reason: collision with root package name */
    public final i f3573a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3574b;

    /* renamed from: c  reason: collision with root package name */
    public final b0 f3575c;

    /* renamed from: d  reason: collision with root package name */
    public final SparseArray<a> f3576d = new SparseArray<>();

    /* renamed from: e  reason: collision with root package name */
    public boolean f3577e;

    /* renamed from: f  reason: collision with root package name */
    public f.a f3578f;

    /* renamed from: g  reason: collision with root package name */
    public long f3579g;

    /* renamed from: h  reason: collision with root package name */
    public x f3580h;

    /* renamed from: i  reason: collision with root package name */
    public b0[] f3581i;

    /* compiled from: BundledChunkExtractor */
    public static final class a implements a0 {

        /* renamed from: a  reason: collision with root package name */
        public final int f3582a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3583b;

        /* renamed from: c  reason: collision with root package name */
        public final b0 f3584c;

        /* renamed from: d  reason: collision with root package name */
        public final h f3585d = new h();

        /* renamed from: e  reason: collision with root package name */
        public b0 f3586e;

        /* renamed from: f  reason: collision with root package name */
        public a0 f3587f;

        /* renamed from: g  reason: collision with root package name */
        public long f3588g;

        public a(int i10, int i11, b0 b0Var) {
            this.f3582a = i10;
            this.f3583b = i11;
            this.f3584c = b0Var;
        }

        public int a(c cVar, int i10, boolean z10, int i11) throws IOException {
            a0 a0Var = this.f3587f;
            int i12 = e0.f26436a;
            return a0Var.f(cVar, i10, z10);
        }

        public /* synthetic */ void b(v vVar, int i10) {
            z.b(this, vVar, i10);
        }

        public void c(b0 b0Var) {
            b0 b0Var2 = this.f3584c;
            if (b0Var2 != null) {
                b0Var = b0Var.g(b0Var2);
            }
            this.f3586e = b0Var;
            a0 a0Var = this.f3587f;
            int i10 = e0.f26436a;
            a0Var.c(b0Var);
        }

        public void d(long j10, int i10, int i11, int i12, a0.a aVar) {
            long j11 = this.f3588g;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                this.f3587f = this.f3585d;
            }
            a0 a0Var = this.f3587f;
            int i13 = e0.f26436a;
            a0Var.d(j10, i10, i11, i12, aVar);
        }

        public void e(v vVar, int i10, int i11) {
            a0 a0Var = this.f3587f;
            int i12 = e0.f26436a;
            a0Var.b(vVar, i10);
        }

        public /* synthetic */ int f(c cVar, int i10, boolean z10) {
            return z.a(this, cVar, i10, z10);
        }

        public void g(f.a aVar, long j10) {
            if (aVar == null) {
                this.f3587f = this.f3585d;
                return;
            }
            this.f3588g = j10;
            a0 b10 = ((c) aVar).b(this.f3582a, this.f3583b);
            this.f3587f = b10;
            b0 b0Var = this.f3586e;
            if (b0Var != null) {
                b10.c(b0Var);
            }
        }
    }

    public d(i iVar, int i10, b0 b0Var) {
        this.f3573a = iVar;
        this.f3574b = i10;
        this.f3575c = b0Var;
    }

    public void a(f.a aVar, long j10, long j11) {
        this.f3578f = aVar;
        this.f3579g = j11;
        if (!this.f3577e) {
            this.f3573a.i(this);
            if (j10 != -9223372036854775807L) {
                this.f3573a.h(0, j10);
            }
            this.f3577e = true;
            return;
        }
        i iVar = this.f3573a;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        iVar.h(0, j10);
        for (int i10 = 0; i10 < this.f3576d.size(); i10++) {
            this.f3576d.valueAt(i10).g(aVar, j11);
        }
    }

    public void b(x xVar) {
        this.f3580h = xVar;
    }

    public boolean c(j jVar) throws IOException {
        int f10 = this.f3573a.f(jVar, f3572r);
        v6.a.d(f10 != 1);
        if (f10 == 0) {
            return true;
        }
        return false;
    }

    public void d() {
        b0[] b0VarArr = new b0[this.f3576d.size()];
        for (int i10 = 0; i10 < this.f3576d.size(); i10++) {
            b0 b0Var = this.f3576d.valueAt(i10).f3586e;
            v6.a.f(b0Var);
            b0VarArr[i10] = b0Var;
        }
        this.f3581i = b0VarArr;
    }

    public a0 l(int i10, int i11) {
        a aVar = this.f3576d.get(i10);
        if (aVar == null) {
            v6.a.d(this.f3581i == null);
            aVar = new a(i10, i11, i11 == this.f3574b ? this.f3575c : null);
            aVar.g(this.f3578f, this.f3579g);
            this.f3576d.put(i10, aVar);
        }
        return aVar;
    }
}
