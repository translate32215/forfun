package d4;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import c4.c;
import c4.h;
import com.startapp.startappsdk.R;
import e.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* compiled from: ViewTarget */
public abstract class i<T extends View, Z> extends a<Z> {

    /* renamed from: a  reason: collision with root package name */
    public final T f12966a;

    /* renamed from: b  reason: collision with root package name */
    public final a f12967b;

    /* compiled from: ViewTarget */
    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        public static Integer f12968d;

        /* renamed from: a  reason: collision with root package name */
        public final View f12969a;

        /* renamed from: b  reason: collision with root package name */
        public final List<g> f12970b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public C0127a f12971c;

        /* renamed from: d4.i$a$a  reason: collision with other inner class name */
        /* compiled from: ViewTarget */
        public static final class C0127a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a  reason: collision with root package name */
            public final WeakReference<a> f12972a;

            public C0127a(a aVar) {
                this.f12972a = new WeakReference<>(aVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = (a) this.f12972a.get();
                if (aVar == null || aVar.f12970b.isEmpty()) {
                    return true;
                }
                int d10 = aVar.d();
                int c10 = aVar.c();
                if (!aVar.e(d10, c10)) {
                    return true;
                }
                Iterator it = new ArrayList(aVar.f12970b).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).a(d10, c10);
                }
                aVar.a();
                return true;
            }
        }

        public a(View view) {
            this.f12969a = view;
        }

        public void a() {
            ViewTreeObserver viewTreeObserver = this.f12969a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f12971c);
            }
            this.f12971c = null;
            this.f12970b.clear();
        }

        public final int b(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f12969a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = this.f12969a.getContext();
            if (f12968d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                e.b(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f12968d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f12968d.intValue();
        }

        public final int c() {
            int paddingBottom = this.f12969a.getPaddingBottom() + this.f12969a.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.f12969a.getLayoutParams();
            return b(this.f12969a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        public final int d() {
            int paddingRight = this.f12969a.getPaddingRight() + this.f12969a.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.f12969a.getLayoutParams();
            return b(this.f12969a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }

        public final boolean e(int i10, int i11) {
            if (i10 > 0 || i10 == Integer.MIN_VALUE) {
                if (i11 > 0 || i11 == Integer.MIN_VALUE) {
                    return true;
                }
            }
            return false;
        }
    }

    public i(T t10) {
        if (t10 != null) {
            this.f12966a = t10;
            this.f12967b = new a(t10);
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public void a(g gVar) {
        this.f12967b.f12970b.remove(gVar);
    }

    public void b(g gVar) {
        a aVar = this.f12967b;
        int d10 = aVar.d();
        int c10 = aVar.c();
        if (aVar.e(d10, c10)) {
            ((h) gVar).a(d10, c10);
            return;
        }
        if (!aVar.f12970b.contains(gVar)) {
            aVar.f12970b.add(gVar);
        }
        if (aVar.f12971c == null) {
            ViewTreeObserver viewTreeObserver = aVar.f12969a.getViewTreeObserver();
            a.C0127a aVar2 = new a.C0127a(aVar);
            aVar.f12971c = aVar2;
            viewTreeObserver.addOnPreDrawListener(aVar2);
        }
    }

    public void f(c cVar) {
        this.f12966a.setTag(R.id.glide_custom_view_target_tag, cVar);
    }

    public c g() {
        Object tag = this.f12966a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof c) {
            return (c) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("Target for: ");
        a10.append(this.f12966a);
        return a10.toString();
    }
}
