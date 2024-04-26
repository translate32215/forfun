package od;

import md.d;
import ud.k;
import ud.v;

/* compiled from: ContinuationImpl.kt */
public abstract class h extends c implements ud.h<Object> {

    /* renamed from: d  reason: collision with root package name */
    public final int f23692d;

    public h(int i10, d<Object> dVar) {
        super(dVar);
        this.f23692d = i10;
    }

    public int e() {
        return this.f23692d;
    }

    public String toString() {
        if (this.f23683a != null) {
            return super.toString();
        }
        String b10 = v.f26198a.b(this);
        k.e(b10, "renderLambdaToString(this)");
        return b10;
    }
}
