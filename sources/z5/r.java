package z5;

import android.os.Handler;
import c5.j;
import java.io.IOException;
import u6.f;
import u6.i;
import x4.c1;
import x4.e0;

/* compiled from: MediaSource */
public interface r {

    /* compiled from: MediaSource */
    public static final class a extends p {
        public a(Object obj) {
            super(obj);
        }

        public a b(Object obj) {
            p pVar;
            if (this.f28627a.equals(obj)) {
                pVar = this;
            } else {
                pVar = new p(obj, this.f28628b, this.f28629c, this.f28630d, this.f28631e);
            }
            return new a(pVar);
        }

        public a(Object obj, long j10, int i10) {
            super(obj, j10, i10);
        }

        public a(Object obj, int i10, int i11, long j10) {
            super(obj, i10, i11, j10);
        }

        public a(p pVar) {
            super(pVar);
        }
    }

    /* compiled from: MediaSource */
    public interface b {
        void a(r rVar, c1 c1Var);
    }

    e0 a();

    void b(b bVar);

    void c() throws IOException;

    boolean d();

    c1 e();

    void f(b bVar, i iVar);

    void g(o oVar);

    void h(Handler handler, v vVar);

    void i(Handler handler, j jVar);

    void j(b bVar);

    void l(v vVar);

    o o(a aVar, f fVar, long j10);

    void p(b bVar);
}
