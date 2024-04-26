package w6;

import a5.d;
import a5.g;
import android.os.Handler;
import android.view.Surface;
import x4.b0;

/* compiled from: VideoRendererEventListener */
public interface s {

    /* compiled from: VideoRendererEventListener */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Handler f27132a;

        /* renamed from: b  reason: collision with root package name */
        public final s f27133b;

        public a(Handler handler, s sVar) {
            if (sVar != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.f27132a = handler;
            this.f27133b = sVar;
        }

        public void a(int i10, int i11, int i12, float f10) {
            Handler handler = this.f27132a;
            if (handler != null) {
                handler.post(new r(this, i10, i11, i12, f10));
            }
        }
    }

    void G(Surface surface);

    void I(b0 b0Var, g gVar);

    void J(d dVar);

    void T(int i10, long j10);

    void W(long j10, int i10);

    void a(int i10, int i11, int i12, float f10);

    void h(String str);

    void m(String str, long j10, long j11);

    void z(d dVar);
}
