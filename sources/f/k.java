package f;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import s.c;

/* compiled from: AppCompatDelegate */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final c<WeakReference<k>> f17870a = new c<>(0);

    /* renamed from: b  reason: collision with root package name */
    public static final Object f17871b = new Object();

    public static void t(k kVar) {
        synchronized (f17871b) {
            Iterator<WeakReference<k>> it = f17870a.iterator();
            while (it.hasNext()) {
                k kVar2 = (k) it.next().get();
                if (kVar2 == kVar || kVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void A(CharSequence charSequence);

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public Context d(Context context) {
        return context;
    }

    public abstract <T extends View> T e(int i10);

    public abstract b f();

    public int g() {
        return -100;
    }

    public abstract MenuInflater h();

    public abstract a i();

    public abstract void j();

    public abstract void k();

    public abstract void l(Configuration configuration);

    public abstract void m(Bundle bundle);

    public abstract void n();

    public abstract void o(Bundle bundle);

    public abstract void p();

    public abstract void q(Bundle bundle);

    public abstract void r();

    public abstract void s();

    public abstract boolean u(int i10);

    public abstract void v(int i10);

    public abstract void w(View view);

    public abstract void x(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void y(Toolbar toolbar);

    public void z(int i10) {
    }
}
