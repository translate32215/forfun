package u6;

import com.google.android.exoplayer2.upstream.e;
import java.util.ArrayList;
import java.util.Map;
import v6.e0;

/* compiled from: BaseDataSource */
public abstract class c implements e {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f26044a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<i> f26045b = new ArrayList<>(1);

    /* renamed from: c  reason: collision with root package name */
    public int f26046c;

    /* renamed from: d  reason: collision with root package name */
    public e f26047d;

    public c(boolean z10) {
        this.f26044a = z10;
    }

    public /* synthetic */ Map N() {
        return d.a(this);
    }

    public final void P(i iVar) {
        iVar.getClass();
        if (!this.f26045b.contains(iVar)) {
            this.f26045b.add(iVar);
            this.f26046c++;
        }
    }

    public final void m(int i10) {
        e eVar = this.f26047d;
        int i11 = e0.f26436a;
        for (int i12 = 0; i12 < this.f26046c; i12++) {
            this.f26045b.get(i12).c(this, eVar, this.f26044a, i10);
        }
    }

    public final void n() {
        e eVar = this.f26047d;
        int i10 = e0.f26436a;
        for (int i11 = 0; i11 < this.f26046c; i11++) {
            this.f26045b.get(i11).h(this, eVar, this.f26044a);
        }
        this.f26047d = null;
    }

    public final void o(e eVar) {
        for (int i10 = 0; i10 < this.f26046c; i10++) {
            this.f26045b.get(i10).b(this, eVar, this.f26044a);
        }
    }

    public final void p(e eVar) {
        this.f26047d = eVar;
        for (int i10 = 0; i10 < this.f26046c; i10++) {
            this.f26045b.get(i10).f(this, eVar, this.f26044a);
        }
    }
}
