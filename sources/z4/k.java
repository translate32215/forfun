package z4;

import a5.d;
import a5.g;
import android.os.Handler;
import c1.b;
import x4.b0;

/* compiled from: AudioRendererEventListener */
public interface k {

    /* compiled from: AudioRendererEventListener */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Handler f28365a;

        /* renamed from: b  reason: collision with root package name */
        public final k f28366b;

        public a(Handler handler, k kVar) {
            if (kVar != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.f28365a = handler;
            this.f28366b = kVar;
        }

        public void a(d dVar) {
            synchronized (dVar) {
            }
            Handler handler = this.f28365a;
            if (handler != null) {
                handler.post(new b(this, dVar));
            }
        }
    }

    void A(b0 b0Var, g gVar);

    void K(String str);

    void L(String str, long j10, long j11);

    void S(int i10, long j10, long j11);

    void d(d dVar);

    void j(d dVar);

    void s(boolean z10);

    void v(Exception exc);

    void w(long j10);
}
