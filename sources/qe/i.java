package qe;

import java.io.IOException;
import java.util.List;
import le.b;

/* compiled from: Http2Connection */
public class i extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f24369b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List f24370c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f24371d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(g gVar, String str, Object[] objArr, int i10, List list) {
        super(str, objArr);
        this.f24371d = gVar;
        this.f24369b = i10;
        this.f24370c = list;
    }

    public void a() {
        this.f24371d.f24339r.getClass();
        try {
            this.f24371d.D.u(this.f24369b, b.CANCEL);
            synchronized (this.f24371d) {
                this.f24371d.F.remove(Integer.valueOf(this.f24369b));
            }
        } catch (IOException unused) {
        }
    }
}
