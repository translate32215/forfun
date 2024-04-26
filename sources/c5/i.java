package c5;

import c5.j;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4327a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j.a f4328b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j f4329c;

    public /* synthetic */ i(j.a aVar, j jVar, int i10) {
        this.f4327a = i10;
        this.f4328b = aVar;
        this.f4329c = jVar;
    }

    public final void run() {
        switch (this.f4327a) {
            case 0:
                j.a aVar = this.f4328b;
                this.f4329c.t(aVar.f4330a, aVar.f4331b);
                return;
            default:
                j.a aVar2 = this.f4328b;
                this.f4329c.y(aVar2.f4330a, aVar2.f4331b);
                return;
        }
    }
}
