package g2;

import android.annotation.SuppressLint;

/* compiled from: Operation */
public interface g {
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: a  reason: collision with root package name */
    public static final b.c f18410a = new b.c((a) null);
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: b  reason: collision with root package name */
    public static final b.C0143b f18411b = new b.C0143b((a) null);

    /* compiled from: Operation */
    public static abstract class b {

        /* compiled from: Operation */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public final Throwable f18412a;

            public a(Throwable th) {
                this.f18412a = th;
            }

            public String toString() {
                return String.format("FAILURE (%s)", new Object[]{this.f18412a.getMessage()});
            }
        }

        /* renamed from: g2.g$b$b  reason: collision with other inner class name */
        /* compiled from: Operation */
        public static final class C0143b extends b {
            public C0143b(a aVar) {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        /* compiled from: Operation */
        public static final class c extends b {
            public c() {
            }

            public String toString() {
                return "SUCCESS";
            }

            public c(a aVar) {
            }
        }
    }
}
