package androidx.lifecycle;

/* compiled from: Transformations */
public class p0 implements c0<Object> {

    /* renamed from: a  reason: collision with root package name */
    public LiveData<Object> f2702a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n.a f2703b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a0 f2704c;

    /* compiled from: Transformations */
    public class a implements c0<Object> {
        public a() {
        }

        public void g(Object obj) {
            p0.this.f2704c.l(obj);
        }
    }

    public p0(n.a aVar, a0 a0Var) {
        this.f2703b = aVar;
        this.f2704c = a0Var;
    }

    public void g(Object obj) {
        LiveData<Object> liveData = (LiveData) this.f2703b.apply(obj);
        LiveData<Object> liveData2 = this.f2702a;
        if (liveData2 != liveData) {
            if (liveData2 != null) {
                this.f2704c.n(liveData2);
            }
            this.f2702a = liveData;
            if (liveData != null) {
                this.f2704c.m(liveData, new a());
            }
        }
    }
}
