package l9;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import java.util.WeakHashMap;
import o0.c0;
import o0.o0;
import o0.s;

/* compiled from: ViewUtils */
public class u {

    /* compiled from: ViewUtils */
    public class a implements s {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f21177a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c f21178b;

        public a(b bVar, c cVar) {
            this.f21177a = bVar;
            this.f21178b = cVar;
        }

        public o0 a(View view, o0 o0Var) {
            return this.f21177a.a(view, o0Var, new c(this.f21178b));
        }
    }

    /* compiled from: ViewUtils */
    public interface b {
        o0 a(View view, o0 o0Var, c cVar);
    }

    public static void a(View view, b bVar) {
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        c0.J(view, new a(bVar, new c(c0.e.f(view), view.getPaddingTop(), c0.e.e(view), view.getPaddingBottom())));
        if (c0.q(view)) {
            c0.A(view);
        } else {
            view.addOnAttachStateChangeListener(new v());
        }
    }

    public static float b(Context context, int i10) {
        return TypedValue.applyDimension(1, (float) i10, context.getResources().getDisplayMetrics());
    }

    public static boolean c(View view) {
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        return c0.e.d(view) == 1;
    }

    public static PorterDuff.Mode d(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* compiled from: ViewUtils */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f21179a;

        /* renamed from: b  reason: collision with root package name */
        public int f21180b;

        /* renamed from: c  reason: collision with root package name */
        public int f21181c;

        /* renamed from: d  reason: collision with root package name */
        public int f21182d;

        public c(int i10, int i11, int i12, int i13) {
            this.f21179a = i10;
            this.f21180b = i11;
            this.f21181c = i12;
            this.f21182d = i13;
        }

        public c(c cVar) {
            this.f21179a = cVar.f21179a;
            this.f21180b = cVar.f21180b;
            this.f21181c = cVar.f21181c;
            this.f21182d = cVar.f21182d;
        }
    }
}
