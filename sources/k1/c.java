package k1;

import a3.k;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import g3.g;
import java.util.ArrayList;
import java.util.List;
import w2.r;
import x2.a;
import x2.i;
import x2.j;

/* compiled from: InitializerViewModelFactory.kt */
public class c implements k {

    /* renamed from: a  reason: collision with root package name */
    public List<e<?>> f19876a;

    public c(List list) {
        this.f19876a = list;
    }

    public a<PointF, PointF> a() {
        if (((h3.a) this.f19876a.get(0)).d()) {
            return new j(this.f19876a);
        }
        return new i(this.f19876a);
    }

    public List<h3.a<PointF>> b() {
        return this.f19876a;
    }

    public boolean c() {
        return this.f19876a.size() == 1 && ((h3.a) this.f19876a.get(0)).d();
    }

    public void d(Path path) {
        for (int size = this.f19876a.size() - 1; size >= 0; size--) {
            r rVar = (r) this.f19876a.get(size);
            PathMeasure pathMeasure = g.f18436a;
            if (rVar != null && !rVar.f26993a) {
                g.a(path, ((x2.c) rVar.f26996d).j() / 100.0f, ((x2.c) rVar.f26997e).j() / 100.0f, ((x2.c) rVar.f26998f).j() / 360.0f);
            }
        }
    }

    public c(int i10) {
        if (i10 != 1) {
            this.f19876a = new ArrayList();
        } else {
            this.f19876a = new ArrayList();
        }
    }
}
