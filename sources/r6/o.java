package r6;

import v6.e0;
import x4.x0;

/* compiled from: TrackSelectorResult */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final int f24680a;

    /* renamed from: b  reason: collision with root package name */
    public final x0[] f24681b;

    /* renamed from: c  reason: collision with root package name */
    public final h[] f24682c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f24683d;

    public o(x0[] x0VarArr, h[] hVarArr, Object obj) {
        this.f24681b = x0VarArr;
        this.f24682c = (h[]) hVarArr.clone();
        this.f24683d = obj;
        this.f24680a = x0VarArr.length;
    }

    public boolean a(o oVar, int i10) {
        if (oVar != null && e0.a(this.f24681b[i10], oVar.f24681b[i10]) && e0.a(this.f24682c[i10], oVar.f24682c[i10])) {
            return true;
        }
        return false;
    }

    public boolean b(int i10) {
        return this.f24681b[i10] != null;
    }
}
