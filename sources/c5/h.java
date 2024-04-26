package c5;

import c5.j;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4324a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j.a f4325b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j f4326c;

    public /* synthetic */ h(j.a aVar, j jVar, int i10) {
        this.f4324a = i10;
        this.f4325b = aVar;
        this.f4326c = jVar;
    }

    public final void run() {
        switch (this.f4324a) {
            case 0:
                j.a aVar = this.f4325b;
                this.f4326c.x(aVar.f4330a, aVar.f4331b);
                return;
            default:
                j.a aVar2 = this.f4325b;
                this.f4326c.U(aVar2.f4330a, aVar2.f4331b);
                return;
        }
    }
}
