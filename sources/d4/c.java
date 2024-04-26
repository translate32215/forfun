package d4;

import android.graphics.drawable.Drawable;
import c4.h;
import g4.j;

/* compiled from: CustomTarget */
public abstract class c<T> implements h<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f12962a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12963b;

    /* renamed from: c  reason: collision with root package name */
    public c4.c f12964c;

    public c() {
        if (j.j(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            this.f12962a = Integer.MIN_VALUE;
            this.f12963b = Integer.MIN_VALUE;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
    }

    public void Z() {
    }

    public final void a(g gVar) {
    }

    public final void b(g gVar) {
        ((h) gVar).a(this.f12962a, this.f12963b);
    }

    public void c(Drawable drawable) {
    }

    public void e(Drawable drawable) {
    }

    public final void f(c4.c cVar) {
        this.f12964c = cVar;
    }

    public final c4.c g() {
        return this.f12964c;
    }

    public void onDestroy() {
    }

    public void v0() {
    }
}
