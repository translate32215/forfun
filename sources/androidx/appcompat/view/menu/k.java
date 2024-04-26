package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.s0;
import com.startapp.startappsdk.R;
import k.d;

/* compiled from: StandardMenuPopup */
public final class k extends d implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public int A;
    public int B = 0;
    public boolean C;

    /* renamed from: b  reason: collision with root package name */
    public final Context f604b;

    /* renamed from: c  reason: collision with root package name */
    public final e f605c;

    /* renamed from: d  reason: collision with root package name */
    public final d f606d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f607e;

    /* renamed from: f  reason: collision with root package name */
    public final int f608f;

    /* renamed from: g  reason: collision with root package name */
    public final int f609g;

    /* renamed from: h  reason: collision with root package name */
    public final int f610h;

    /* renamed from: i  reason: collision with root package name */
    public final s0 f611i;

    /* renamed from: r  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f612r = new a();

    /* renamed from: s  reason: collision with root package name */
    public final View.OnAttachStateChangeListener f613s = new b();

    /* renamed from: t  reason: collision with root package name */
    public PopupWindow.OnDismissListener f614t;

    /* renamed from: u  reason: collision with root package name */
    public View f615u;

    /* renamed from: v  reason: collision with root package name */
    public View f616v;

    /* renamed from: w  reason: collision with root package name */
    public i.a f617w;

    /* renamed from: x  reason: collision with root package name */
    public ViewTreeObserver f618x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f619y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f620z;

    /* compiled from: StandardMenuPopup */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (k.this.b()) {
                k kVar = k.this;
                if (!kVar.f611i.F) {
                    View view = kVar.f616v;
                    if (view == null || !view.isShown()) {
                        k.this.dismiss();
                    } else {
                        k.this.f611i.S();
                    }
                }
            }
        }
    }

    /* compiled from: StandardMenuPopup */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = k.this.f618x;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    k.this.f618x = view.getViewTreeObserver();
                }
                k kVar = k.this;
                kVar.f618x.removeGlobalOnLayoutListener(kVar.f612r);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public k(Context context, e eVar, View view, int i10, int i11, boolean z10) {
        this.f604b = context;
        this.f605c = eVar;
        this.f607e = z10;
        this.f606d = new d(eVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.f609g = i10;
        this.f610h = i11;
        Resources resources = context.getResources();
        this.f608f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f615u = view;
        this.f611i = new s0(context, (AttributeSet) null, i10, i11);
        eVar.b(this, context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void S() {
        /*
            r7 = this;
            boolean r0 = r7.b()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000b
        L_0x0008:
            r1 = 1
            goto L_0x00c7
        L_0x000b:
            boolean r0 = r7.f619y
            if (r0 != 0) goto L_0x00c7
            android.view.View r0 = r7.f615u
            if (r0 != 0) goto L_0x0015
            goto L_0x00c7
        L_0x0015:
            r7.f616v = r0
            androidx.appcompat.widget.s0 r0 = r7.f611i
            android.widget.PopupWindow r0 = r0.G
            r0.setOnDismissListener(r7)
            androidx.appcompat.widget.s0 r0 = r7.f611i
            r0.f1073x = r7
            r0.r(r2)
            android.view.View r0 = r7.f616v
            android.view.ViewTreeObserver r3 = r7.f618x
            if (r3 != 0) goto L_0x002d
            r3 = 1
            goto L_0x002e
        L_0x002d:
            r3 = 0
        L_0x002e:
            android.view.ViewTreeObserver r4 = r0.getViewTreeObserver()
            r7.f618x = r4
            if (r3 == 0) goto L_0x003b
            android.view.ViewTreeObserver$OnGlobalLayoutListener r3 = r7.f612r
            r4.addOnGlobalLayoutListener(r3)
        L_0x003b:
            android.view.View$OnAttachStateChangeListener r3 = r7.f613s
            r0.addOnAttachStateChangeListener(r3)
            androidx.appcompat.widget.s0 r3 = r7.f611i
            r3.f1072w = r0
            int r0 = r7.B
            r3.f1069t = r0
            boolean r0 = r7.f620z
            r3 = 0
            if (r0 != 0) goto L_0x005b
            androidx.appcompat.view.menu.d r0 = r7.f606d
            android.content.Context r4 = r7.f604b
            int r5 = r7.f608f
            int r0 = k.d.n(r0, r3, r4, r5)
            r7.A = r0
            r7.f620z = r2
        L_0x005b:
            androidx.appcompat.widget.s0 r0 = r7.f611i
            int r4 = r7.A
            r0.q(r4)
            androidx.appcompat.widget.s0 r0 = r7.f611i
            r4 = 2
            android.widget.PopupWindow r0 = r0.G
            r0.setInputMethodMode(r4)
            androidx.appcompat.widget.s0 r0 = r7.f611i
            android.graphics.Rect r4 = r7.f19862a
            r0.getClass()
            if (r4 == 0) goto L_0x0079
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r4)
            goto L_0x007a
        L_0x0079:
            r5 = r3
        L_0x007a:
            r0.E = r5
            androidx.appcompat.widget.s0 r0 = r7.f611i
            r0.S()
            androidx.appcompat.widget.s0 r0 = r7.f611i
            androidx.appcompat.widget.l0 r0 = r0.f1060c
            r0.setOnKeyListener(r7)
            boolean r4 = r7.C
            if (r4 == 0) goto L_0x00b9
            androidx.appcompat.view.menu.e r4 = r7.f605c
            java.lang.CharSequence r4 = r4.f549m
            if (r4 == 0) goto L_0x00b9
            android.content.Context r4 = r7.f604b
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r5 = 2131623954(0x7f0e0012, float:1.8875074E38)
            android.view.View r4 = r4.inflate(r5, r0, r1)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x00b3
            androidx.appcompat.view.menu.e r6 = r7.f605c
            java.lang.CharSequence r6 = r6.f549m
            r5.setText(r6)
        L_0x00b3:
            r4.setEnabled(r1)
            r0.addHeaderView(r4, r3, r1)
        L_0x00b9:
            androidx.appcompat.widget.s0 r0 = r7.f611i
            androidx.appcompat.view.menu.d r1 = r7.f606d
            r0.o(r1)
            androidx.appcompat.widget.s0 r0 = r7.f611i
            r0.S()
            goto L_0x0008
        L_0x00c7:
            if (r1 == 0) goto L_0x00ca
            return
        L_0x00ca:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "StandardMenuPopup cannot be used without an anchor"
            r0.<init>(r1)
            goto L_0x00d3
        L_0x00d2:
            throw r0
        L_0x00d3:
            goto L_0x00d2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.k.S():void");
    }

    public void a(e eVar, boolean z10) {
        if (eVar == this.f605c) {
            dismiss();
            i.a aVar = this.f617w;
            if (aVar != null) {
                aVar.a(eVar, z10);
            }
        }
    }

    public boolean b() {
        return !this.f619y && this.f611i.b();
    }

    public void d(Parcelable parcelable) {
    }

    public void dismiss() {
        if (b()) {
            this.f611i.dismiss();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(androidx.appcompat.view.menu.l r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L_0x0078
            androidx.appcompat.view.menu.h r0 = new androidx.appcompat.view.menu.h
            android.content.Context r3 = r9.f604b
            android.view.View r5 = r9.f616v
            boolean r6 = r9.f607e
            int r7 = r9.f609g
            int r8 = r9.f610h
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.appcompat.view.menu.i$a r2 = r9.f617w
            r0.d(r2)
            boolean r2 = k.d.v(r10)
            r0.f598h = r2
            k.d r3 = r0.f600j
            if (r3 == 0) goto L_0x002a
            r3.p(r2)
        L_0x002a:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f614t
            r0.f601k = r2
            r2 = 0
            r9.f614t = r2
            androidx.appcompat.view.menu.e r2 = r9.f605c
            r2.c(r1)
            androidx.appcompat.widget.s0 r2 = r9.f611i
            int r3 = r2.f1063f
            boolean r4 = r2.f1066i
            if (r4 != 0) goto L_0x0040
            r2 = 0
            goto L_0x0042
        L_0x0040:
            int r2 = r2.f1064g
        L_0x0042:
            int r4 = r9.B
            android.view.View r5 = r9.f615u
            java.util.WeakHashMap<android.view.View, java.lang.String> r6 = o0.c0.f22553a
            int r5 = o0.c0.e.d(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L_0x005c
            android.view.View r4 = r9.f615u
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L_0x005c:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L_0x0064
            goto L_0x006d
        L_0x0064:
            android.view.View r4 = r0.f596f
            if (r4 != 0) goto L_0x006a
            r0 = 0
            goto L_0x006e
        L_0x006a:
            r0.e(r3, r2, r5, r5)
        L_0x006d:
            r0 = 1
        L_0x006e:
            if (r0 == 0) goto L_0x0078
            androidx.appcompat.view.menu.i$a r0 = r9.f617w
            if (r0 == 0) goto L_0x0077
            r0.b(r10)
        L_0x0077:
            return r5
        L_0x0078:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.k.e(androidx.appcompat.view.menu.l):boolean");
    }

    public ListView f() {
        return this.f611i.f1060c;
    }

    public void g(boolean z10) {
        this.f620z = false;
        d dVar = this.f606d;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    public boolean h() {
        return false;
    }

    public Parcelable i() {
        return null;
    }

    public void l(i.a aVar) {
        this.f617w = aVar;
    }

    public void m(e eVar) {
    }

    public void o(View view) {
        this.f615u = view;
    }

    public void onDismiss() {
        this.f619y = true;
        this.f605c.c(true);
        ViewTreeObserver viewTreeObserver = this.f618x;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f618x = this.f616v.getViewTreeObserver();
            }
            this.f618x.removeGlobalOnLayoutListener(this.f612r);
            this.f618x = null;
        }
        this.f616v.removeOnAttachStateChangeListener(this.f613s);
        PopupWindow.OnDismissListener onDismissListener = this.f614t;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void p(boolean z10) {
        this.f606d.f532c = z10;
    }

    public void q(int i10) {
        this.B = i10;
    }

    public void r(int i10) {
        this.f611i.f1063f = i10;
    }

    public void s(PopupWindow.OnDismissListener onDismissListener) {
        this.f614t = onDismissListener;
    }

    public void t(boolean z10) {
        this.C = z10;
    }

    public void u(int i10) {
        s0 s0Var = this.f611i;
        s0Var.f1064g = i10;
        s0Var.f1066i = true;
    }
}
