package qe;

import java.io.IOException;
import java.util.List;
import le.b;

/* compiled from: Http2Connection */
public class j extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f24372b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List f24373c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f24374d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(g gVar, String str, Object[] objArr, int i10, List list, boolean z10) {
        super(str, objArr);
        this.f24374d = gVar;
        this.f24372b = i10;
        this.f24373c = list;
    }

    public void a() {
        this.f24374d.f24339r.getClass();
        try {
            this.f24374d.D.u(this.f24372b, b.CANCEL);
            synchronized (this.f24374d) {
                this.f24374d.F.remove(Integer.valueOf(this.f24372b));
            }
        } catch (IOException unused) {
        }
    }
}
