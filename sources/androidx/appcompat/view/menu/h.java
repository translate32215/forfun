package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.i;
import java.util.WeakHashMap;
import k.d;
import o0.c0;

/* compiled from: MenuPopupHelper */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f591a;

    /* renamed from: b  reason: collision with root package name */
    public final e f592b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f593c;

    /* renamed from: d  reason: collision with root package name */
    public final int f594d;

    /* renamed from: e  reason: collision with root package name */
    public final int f595e;

    /* renamed from: f  reason: collision with root package name */
    public View f596f;

    /* renamed from: g  reason: collision with root package name */
    public int f597g = 8388611;

    /* renamed from: h  reason: collision with root package name */
    public boolean f598h;

    /* renamed from: i  reason: collision with root package name */
    public i.a f599i;

    /* renamed from: j  reason: collision with root package name */
    public d f600j;

    /* renamed from: k  reason: collision with root package name */
    public PopupWindow.OnDismissListener f601k;

    /* renamed from: l  reason: collision with root package name */
    public final PopupWindow.OnDismissListener f602l = new a();

    /* compiled from: MenuPopupHelper */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        public void onDismiss() {
            h.this.c();
        }
    }

    /* compiled from: MenuPopupHelper */
    public static class b {
        public static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public h(Context context, e eVar, View view, boolean z10, int i10, int i11) {
        this.f591a = context;
        this.f592b = eVar;
        this.f596f = view;
        this.f593c = z10;
        this.f594d = i10;
        this.f595e = i11;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [k.d, androidx.appcompat.view.menu.i] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.k] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k.d a() {
        /*
            r14 = this;
            k.d r0 = r14.f600j
            if (r0 != 0) goto L_0x0079
            android.content.Context r0 = r14.f591a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            androidx.appcompat.view.menu.h.b.a(r0, r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f591a
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165206(0x7f070016, float:1.7944623E38)
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            if (r0 == 0) goto L_0x0047
            androidx.appcompat.view.menu.b r0 = new androidx.appcompat.view.menu.b
            android.content.Context r2 = r14.f591a
            android.view.View r3 = r14.f596f
            int r4 = r14.f594d
            int r5 = r14.f595e
            boolean r6 = r14.f593c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0059
        L_0x0047:
            androidx.appcompat.view.menu.k r0 = new androidx.appcompat.view.menu.k
            android.content.Context r8 = r14.f591a
            androidx.appcompat.view.menu.e r9 = r14.f592b
            android.view.View r10 = r14.f596f
            int r11 = r14.f594d
            int r12 = r14.f595e
            boolean r13 = r14.f593c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0059:
            androidx.appcompat.view.menu.e r1 = r14.f592b
            r0.m(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f602l
            r0.s(r1)
            android.view.View r1 = r14.f596f
            r0.o(r1)
            androidx.appcompat.view.menu.i$a r1 = r14.f599i
            r0.l(r1)
            boolean r1 = r14.f598h
            r0.p(r1)
            int r1 = r14.f597g
            r0.q(r1)
            r14.f600j = r0
        L_0x0079:
            k.d r0 = r14.f600j
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.h.a():k.d");
    }

    public boolean b() {
        d dVar = this.f600j;
        return dVar != null && dVar.b();
    }

    public void c() {
        this.f600j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f601k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void d(i.a aVar) {
        this.f599i = aVar;
        d dVar = this.f600j;
        if (dVar != null) {
            dVar.l(aVar);
        }
    }

    public final void e(int i10, int i11, boolean z10, boolean z11) {
        d a10 = a();
        a10.t(z11);
        if (z10) {
            int i12 = this.f597g;
            View view = this.f596f;
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            if ((Gravity.getAbsoluteGravity(i12, c0.e.d(view)) & 7) == 5) {
                i10 -= this.f596f.getWidth();
            }
            a10.r(i10);
            a10.u(i11);
            int i13 = (int) ((this.f591a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a10.f19862a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a10.S();
    }

    public boolean f() {
        if (b()) {
            return true;
        }
        if (this.f596f == null) {
            return false;
        }
        e(0, 0, false, false);
        return true;
    }
}
