package androidx.leanback.widget;

import android.graphics.PointF;
import androidx.leanback.widget.p;

/* compiled from: GridLayoutManager */
public class q extends p.c {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ p f2506s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(p pVar) {
        super();
        this.f2506s = pVar;
    }

    public PointF a(int i10) {
        if (this.f2917b.f2828u.A() == 0) {
            return null;
        }
        p pVar = this.f2506s;
        boolean z10 = false;
        int T = pVar.T(pVar.z(0));
        p pVar2 = this.f2506s;
        int i11 = 1;
        if ((pVar2.f2479z & 262144) == 0 ? i10 < T : i10 > T) {
            z10 = true;
        }
        if (z10) {
            i11 = -1;
        }
        if (pVar2.f2471r == 0) {
            return new PointF((float) i11, 0.0f);
        }
        return new PointF(0.0f, (float) i11);
    }
}
