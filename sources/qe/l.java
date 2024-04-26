package qe;

import le.b;

/* compiled from: Http2Connection */
public class l extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f24379b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f24380c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(g gVar, String str, Object[] objArr, int i10, b bVar) {
        super(str, objArr);
        this.f24380c = gVar;
        this.f24379b = i10;
    }

    public void a() {
        this.f24380c.f24339r.getClass();
        synchronized (this.f24380c) {
            this.f24380c.F.remove(Integer.valueOf(this.f24379b));
        }
    }
}
