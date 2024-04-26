package l0;

import android.graphics.Typeface;
import f0.g;
import g0.e;

/* compiled from: CallbackWithHandler */
public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f20965a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Typeface f20966b;

    public a(c cVar, p pVar, Typeface typeface) {
        this.f20965a = pVar;
        this.f20966b = typeface;
    }

    public void run() {
        p pVar = this.f20965a;
        Typeface typeface = this.f20966b;
        g.f fVar = ((e.a) pVar).f18364a;
        if (fVar != null) {
            fVar.e(typeface);
        }
    }
}
