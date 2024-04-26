package l0;

import android.os.Handler;
import l0.m;

/* compiled from: CallbackWithHandler */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final p f20969a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f20970b;

    public c(p pVar, Handler handler) {
        this.f20969a = pVar;
        this.f20970b = handler;
    }

    public void a(m.a aVar) {
        int i10 = aVar.f20993b;
        if (i10 == 0) {
            this.f20970b.post(new a(this, this.f20969a, aVar.f20992a));
            return;
        }
        this.f20970b.post(new b(this, this.f20969a, i10));
    }
}
