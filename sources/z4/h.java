package z4;

import ba.y;
import u6.b;
import v6.e0;
import v6.o;
import y4.q;
import y4.v;
import y4.x;
import z4.k;
import z5.r;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28353a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f28354b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f28355c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f28356d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ long f28357e;

    public /* synthetic */ h(b.a.C0257a.C0258a aVar, int i10, long j10, long j11) {
        this.f28354b = aVar;
        this.f28355c = i10;
        this.f28356d = j10;
        this.f28357e = j11;
    }

    public /* synthetic */ h(k.a aVar, int i10, long j10, long j11) {
        this.f28354b = aVar;
        this.f28355c = i10;
        this.f28356d = j10;
        this.f28357e = j11;
    }

    public final void run() {
        switch (this.f28353a) {
            case 0:
                int i10 = this.f28355c;
                long j10 = this.f28356d;
                long j11 = this.f28357e;
                k kVar = ((k.a) this.f28354b).f28366b;
                int i11 = e0.f26436a;
                kVar.S(i10, j10, j11);
                return;
            default:
                int i12 = this.f28355c;
                long j12 = this.f28356d;
                long j13 = this.f28357e;
                v vVar = (v) ((b.a.C0257a.C0258a) this.f28354b).f26042b;
                v.a aVar = vVar.f28079d;
                x.a b02 = vVar.b0(aVar.f28085b.isEmpty() ? null : (r.a) y.b(aVar.f28085b));
                q qVar = new q(b02, i12, j12, j13, 0);
                vVar.f28080e.put(1006, b02);
                o<x, x.b> oVar = vVar.f28081f;
                oVar.b(1006, qVar);
                oVar.a();
                return;
        }
    }
}
