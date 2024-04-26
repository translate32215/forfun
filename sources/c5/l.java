package c5;

import android.os.Looper;
import c5.g;
import c5.j;
import x4.b0;

/* compiled from: DrmSessionManager */
public interface l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f4335a = new a();

    /* compiled from: DrmSessionManager */
    public class a implements l {
        public /* synthetic */ void a() {
            k.b(this);
        }

        public /* synthetic */ void b() {
            k.a(this);
        }

        public Class<a0> c(b0 b0Var) {
            if (b0Var.f27411w != null) {
                return a0.class;
            }
            return null;
        }

        public g d(Looper looper, j.a aVar, b0 b0Var) {
            if (b0Var.f27411w == null) {
                return null;
            }
            return new o(new g.a(new z(1)));
        }
    }

    void a();

    void b();

    Class<? extends p> c(b0 b0Var);

    g d(Looper looper, j.a aVar, b0 b0Var);
}
