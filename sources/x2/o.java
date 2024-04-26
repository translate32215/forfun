package x2;

import h3.a;
import java.util.Collections;
import o1.p;

/* compiled from: ValueCallbackKeyframeAnimation */
public class o<K, A> extends a<K, A> {

    /* renamed from: i  reason: collision with root package name */
    public final A f27294i;

    public o(p pVar, A a10) {
        super(Collections.emptyList());
        i(pVar);
        this.f27294i = a10;
    }

    public float b() {
        return 1.0f;
    }

    public A e() {
        p pVar = this.f27253e;
        A a10 = this.f27294i;
        float f10 = this.f27252d;
        return pVar.b(0.0f, 0.0f, a10, a10, f10, f10, f10);
    }

    public A f(a<K> aVar, float f10) {
        return e();
    }

    public void g() {
        if (this.f27253e != null) {
            super.g();
        }
    }

    public void h(float f10) {
        this.f27252d = f10;
    }
}
