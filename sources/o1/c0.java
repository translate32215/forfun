package o1;

import android.view.View;
import android.view.ViewParent;
import be.c;
import be.g;
import be.i;
import com.startapp.startappsdk.R;
import java.lang.ref.WeakReference;
import ud.k;
import ud.l;

/* compiled from: Navigation.kt */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final c0 f22664a = new c0();

    /* compiled from: Navigation.kt */
    public static final class a extends l implements td.l<View, View> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f22665b = new a();

        public a() {
            super(1);
        }

        public Object c(Object obj) {
            View view = (View) obj;
            k.f(view, "it");
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* compiled from: Navigation.kt */
    public static final class b extends l implements td.l<View, k> {

        /* renamed from: b  reason: collision with root package name */
        public static final b f22666b = new b();

        public b() {
            super(1);
        }

        public Object c(Object obj) {
            View view = (View) obj;
            k.f(view, "it");
            Object tag = view.getTag(R.id.nav_controller_view_tag);
            if (tag instanceof WeakReference) {
                return (k) ((WeakReference) tag).get();
            }
            if (tag instanceof k) {
                return (k) tag;
            }
            return null;
        }
    }

    public static final k a(View view) {
        k b10 = f22664a.b(view);
        if (b10 != null) {
            return b10;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    public static final void c(View view, k kVar) {
        view.setTag(R.id.nav_controller_view_tag, kVar);
    }

    public final k b(View view) {
        Object obj;
        c.a aVar = new c.a((c) i.h(g.c(view, a.f22665b), b.f22666b));
        if (!aVar.hasNext()) {
            obj = null;
        } else {
            obj = aVar.next();
        }
        return (k) obj;
    }
}
