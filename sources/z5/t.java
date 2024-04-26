package z5;

import z5.r;
import z5.v;

public final /* synthetic */ class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28637a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v.a f28638b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ v f28639c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f28640d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ n f28641e;

    public /* synthetic */ t(v.a aVar, v vVar, k kVar, n nVar) {
        this.f28638b = aVar;
        this.f28639c = vVar;
        this.f28640d = kVar;
        this.f28641e = nVar;
    }

    public /* synthetic */ t(v.a aVar, v vVar, r.a aVar2, n nVar) {
        this.f28638b = aVar;
        this.f28639c = vVar;
        this.f28640d = aVar2;
        this.f28641e = nVar;
    }

    public final void run() {
        switch (this.f28637a) {
            case 0:
                v.a aVar = this.f28638b;
                n nVar = this.f28641e;
                this.f28639c.R(aVar.f28648a, (r.a) this.f28640d, nVar);
                return;
            default:
                v.a aVar2 = this.f28638b;
                n nVar2 = this.f28641e;
                this.f28639c.B(aVar2.f28648a, aVar2.f28649b, (k) this.f28640d, nVar2);
                return;
        }
    }
}
