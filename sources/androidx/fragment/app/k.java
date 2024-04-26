package androidx.fragment.app;

import androidx.fragment.app.q0;
import s.a;

/* compiled from: DefaultSpecialEffectsController */
public class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q0.d f1734a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q0.d f1735b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f1736c;

    public k(f fVar, q0.d dVar, q0.d dVar2, boolean z10, a aVar) {
        this.f1734a = dVar;
        this.f1735b = dVar2;
        this.f1736c = z10;
    }

    public void run() {
        p pVar = this.f1734a.f1849c;
        p pVar2 = this.f1735b.f1849c;
        boolean z10 = this.f1736c;
        m0 m0Var = j0.f1732a;
        if (z10) {
            pVar2.s();
        } else {
            pVar.s();
        }
    }
}
