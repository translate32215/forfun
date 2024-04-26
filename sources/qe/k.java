package qe;

import java.io.IOException;
import le.b;
import qe.t;
import ve.f;

/* compiled from: Http2Connection */
public class k extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f24375b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f24376c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f24377d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ g f24378e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(g gVar, String str, Object[] objArr, int i10, f fVar, int i11, boolean z10) {
        super(str, objArr);
        this.f24378e = gVar;
        this.f24375b = i10;
        this.f24376c = fVar;
        this.f24377d = i11;
    }

    public void a() {
        try {
            t tVar = this.f24378e.f24339r;
            f fVar = this.f24376c;
            int i10 = this.f24377d;
            ((t.a) tVar).getClass();
            fVar.b((long) i10);
            this.f24378e.D.u(this.f24375b, b.CANCEL);
            synchronized (this.f24378e) {
                this.f24378e.F.remove(Integer.valueOf(this.f24375b));
            }
        } catch (IOException unused) {
        }
    }
}
