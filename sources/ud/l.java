package ud;

import java.io.Serializable;

/* compiled from: Lambda.kt */
public abstract class l<R> implements h<R>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final int f26193a;

    public l(int i10) {
        this.f26193a = i10;
    }

    public int e() {
        return this.f26193a;
    }

    public String toString() {
        String b10 = v.f26198a.b(this);
        k.e(b10, "renderLambdaToString(this)");
        return b10;
    }
}
