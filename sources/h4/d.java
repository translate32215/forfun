package h4;

/* compiled from: StateVerifier */
public abstract class d {

    /* compiled from: StateVerifier */
    public static class b extends d {

        /* renamed from: a  reason: collision with root package name */
        public volatile boolean f18889a;

        public b() {
            super((a) null);
        }

        public void a() {
            if (this.f18889a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public d(a aVar) {
    }

    public abstract void a();
}
