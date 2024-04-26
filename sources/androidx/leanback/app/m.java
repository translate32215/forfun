package androidx.leanback.app;

import androidx.appcompat.widget.d0;
import androidx.leanback.widget.h0;
import androidx.leanback.widget.v0;

/* compiled from: ListRowDataAdapter */
public class m extends h0 {

    /* renamed from: c  reason: collision with root package name */
    public final h0 f2031c;

    /* renamed from: d  reason: collision with root package name */
    public int f2032d;

    /* renamed from: e  reason: collision with root package name */
    public final h0.b f2033e;

    /* compiled from: ListRowDataAdapter */
    public class a extends h0.b {
        public a() {
        }

        public void a() {
            m.this.f();
            m.this.b();
        }
    }

    /* compiled from: ListRowDataAdapter */
    public class b extends h0.b {
        public b() {
        }

        public void a() {
            m.this.f();
            e(16, -1, -1);
        }

        public void b(int i10, int i11) {
            int i12 = m.this.f2032d;
            if (i10 <= i12) {
                e(2, i10, Math.min(i11, (i12 - i10) + 1));
            }
        }

        public void c(int i10, int i11) {
            m mVar = m.this;
            int i12 = mVar.f2032d;
            if (i10 <= i12) {
                mVar.f2032d = i12 + i11;
                e(4, i10, i11);
                return;
            }
            mVar.f();
            int i13 = m.this.f2032d;
            if (i13 > i12) {
                e(4, i12 + 1, i13 - i12);
            }
        }

        public void d(int i10, int i11) {
            int i12 = (i10 + i11) - 1;
            m mVar = m.this;
            int i13 = mVar.f2032d;
            if (i12 < i13) {
                mVar.f2032d = i13 - i11;
                e(8, i10, i11);
                return;
            }
            mVar.f();
            int i14 = m.this.f2032d;
            int i15 = i13 - i14;
            if (i15 > 0) {
                e(8, Math.min(i14 + 1, i10), i15);
            }
        }

        public void e(int i10, int i11, int i12) {
            m mVar = m.this;
            mVar.getClass();
            if (i10 == 2) {
                mVar.f2400a.b(i11, i12);
            } else if (i10 == 4) {
                mVar.c(i11, i12);
            } else if (i10 == 8) {
                mVar.f2400a.d(i11, i12);
            } else if (i10 == 16) {
                mVar.f2400a.a();
            } else {
                throw new IllegalArgumentException(d0.a("Invalid event type ", i10));
            }
        }
    }

    public m(h0 h0Var) {
        super(h0Var.f2401b);
        this.f2031c = h0Var;
        f();
        if (h0Var instanceof androidx.leanback.widget.a) {
            this.f2033e = new b();
        } else {
            this.f2033e = new a();
        }
        f();
        h0Var.f2400a.registerObserver(this.f2033e);
    }

    public Object a(int i10) {
        return this.f2031c.a(i10);
    }

    public int e() {
        return this.f2032d + 1;
    }

    public void f() {
        this.f2032d = -1;
        for (int e10 = this.f2031c.e() - 1; e10 >= 0; e10--) {
            if (((v0) this.f2031c.a(e10)).a()) {
                this.f2032d = e10;
                return;
            }
        }
    }
}
