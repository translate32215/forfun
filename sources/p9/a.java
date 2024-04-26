package p9;

import android.graphics.Typeface;
import l.c;
import l9.d;

/* compiled from: CancelableFontCallback */
public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public final Typeface f23948a;

    /* renamed from: b  reason: collision with root package name */
    public final C0213a f23949b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f23950c;

    /* renamed from: p9.a$a  reason: collision with other inner class name */
    /* compiled from: CancelableFontCallback */
    public interface C0213a {
    }

    public a(C0213a aVar, Typeface typeface) {
        super(2);
        this.f23948a = typeface;
        this.f23949b = aVar;
    }

    public void c(int i10) {
        f(this.f23948a);
    }

    public void d(Typeface typeface, boolean z10) {
        f(typeface);
    }

    public final void f(Typeface typeface) {
        if (!this.f23950c) {
            com.google.android.material.internal.a aVar = ((d) this.f23949b).f21114a;
            if (aVar.o(typeface)) {
                aVar.k(false);
            }
        }
    }
}
