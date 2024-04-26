package f;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import e.l;
import j.a;

/* compiled from: ActionBar */
public abstract class a {

    /* compiled from: ActionBar */
    public interface b {
        void a(boolean z10);
    }

    @Deprecated
    /* compiled from: ActionBar */
    public static abstract class c {
        public abstract void a();
    }

    public boolean a() {
        return false;
    }

    public abstract boolean b();

    public abstract void c(boolean z10);

    public abstract int d();

    public abstract Context e();

    public boolean f() {
        return false;
    }

    public abstract void g(Configuration configuration);

    public void h() {
    }

    public abstract boolean i(int i10, KeyEvent keyEvent);

    public boolean j(KeyEvent keyEvent) {
        return false;
    }

    public boolean k() {
        return false;
    }

    public abstract void l(boolean z10);

    public abstract void m(boolean z10);

    public abstract void n(int i10);

    public abstract void o(Drawable drawable);

    public abstract void p(boolean z10);

    public abstract void q(CharSequence charSequence);

    public abstract void r(CharSequence charSequence);

    public j.a s(a.C0165a aVar) {
        return null;
    }

    /* renamed from: f.a$a  reason: collision with other inner class name */
    /* compiled from: ActionBar */
    public static class C0135a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f17857a;

        public C0135a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f17857a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f13502b);
            this.f17857a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0135a(int i10, int i11) {
            super(i10, i11);
            this.f17857a = 0;
            this.f17857a = 8388627;
        }

        public C0135a(C0135a aVar) {
            super(aVar);
            this.f17857a = 0;
            this.f17857a = aVar.f17857a;
        }

        public C0135a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f17857a = 0;
        }
    }
}
