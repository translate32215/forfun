package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.ActionMenuView;
import com.startapp.startappsdk.R;
import f.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import o0.c0;
import o0.h;
import o0.i;
import o0.j;

public class Toolbar extends ViewGroup implements i {
    public int A;
    public v0 B;
    public int C;
    public int D;
    public int E;
    public CharSequence F;
    public CharSequence G;
    public ColorStateList H;
    public ColorStateList I;
    public boolean J;
    public boolean K;
    public final ArrayList<View> L;
    public final ArrayList<View> M;
    public final int[] N;
    public final j O;
    public ArrayList<MenuItem> P;
    public f Q;
    public final ActionMenuView.e R;
    public i1 S;

    /* renamed from: a  reason: collision with root package name */
    public ActionMenuView f752a;

    /* renamed from: a0  reason: collision with root package name */
    public c f753a0;

    /* renamed from: b  reason: collision with root package name */
    public TextView f754b;

    /* renamed from: b0  reason: collision with root package name */
    public d f755b0;

    /* renamed from: c  reason: collision with root package name */
    public TextView f756c;

    /* renamed from: c0  reason: collision with root package name */
    public i.a f757c0;

    /* renamed from: d  reason: collision with root package name */
    public ImageButton f758d;

    /* renamed from: d0  reason: collision with root package name */
    public e.a f759d0;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f760e;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f761e0;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f762f;

    /* renamed from: f0  reason: collision with root package name */
    public final Runnable f763f0;

    /* renamed from: g  reason: collision with root package name */
    public CharSequence f764g;

    /* renamed from: h  reason: collision with root package name */
    public ImageButton f765h;

    /* renamed from: i  reason: collision with root package name */
    public View f766i;

    /* renamed from: r  reason: collision with root package name */
    public Context f767r;

    /* renamed from: s  reason: collision with root package name */
    public int f768s;

    /* renamed from: t  reason: collision with root package name */
    public int f769t;

    /* renamed from: u  reason: collision with root package name */
    public int f770u;

    /* renamed from: v  reason: collision with root package name */
    public int f771v;

    /* renamed from: w  reason: collision with root package name */
    public int f772w;

    /* renamed from: x  reason: collision with root package name */
    public int f773x;

    /* renamed from: y  reason: collision with root package name */
    public int f774y;

    /* renamed from: z  reason: collision with root package name */
    public int f775z;

    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            Toolbar.this.y();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        public void onClick(View view) {
            androidx.appcompat.view.menu.g gVar;
            d dVar = Toolbar.this.f755b0;
            if (dVar == null) {
                gVar = null;
            } else {
                gVar = dVar.f780b;
            }
            if (gVar != null) {
                gVar.collapseActionView();
            }
        }
    }

    public class d implements androidx.appcompat.view.menu.i {

        /* renamed from: a  reason: collision with root package name */
        public androidx.appcompat.view.menu.e f779a;

        /* renamed from: b  reason: collision with root package name */
        public androidx.appcompat.view.menu.g f780b;

        public d() {
        }

        public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        public void c(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f779a;
            if (!(eVar2 == null || (gVar = this.f780b) == null)) {
                eVar2.d(gVar);
            }
            this.f779a = eVar;
        }

        public void d(Parcelable parcelable) {
        }

        public boolean e(l lVar) {
            return false;
        }

        public void g(boolean z10) {
            if (this.f780b != null) {
                androidx.appcompat.view.menu.e eVar = this.f779a;
                boolean z11 = false;
                if (eVar != null) {
                    int size = eVar.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        } else if (this.f779a.getItem(i10) == this.f780b) {
                            z11 = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (!z11) {
                    j(this.f779a, this.f780b);
                }
            }
        }

        public int getId() {
            return 0;
        }

        public boolean h() {
            return false;
        }

        public Parcelable i() {
            return null;
        }

        public boolean j(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            View view = Toolbar.this.f766i;
            if (view instanceof j.b) {
                ((j.b) view).e();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f766i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f765h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f766i = null;
            int size = toolbar3.M.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar3.addView(toolbar3.M.get(size));
                } else {
                    toolbar3.M.clear();
                    this.f780b = null;
                    Toolbar.this.requestLayout();
                    gVar.C = false;
                    gVar.f577n.p(false);
                    return true;
                }
            }
        }

        public boolean k(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.c();
            ViewParent parent = Toolbar.this.f765h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f765h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f765h);
            }
            Toolbar.this.f766i = gVar.getActionView();
            this.f780b = gVar;
            ViewParent parent2 = Toolbar.this.f766i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f766i);
                }
                e i10 = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                i10.f17857a = 8388611 | (toolbar4.f771v & 112);
                i10.f782b = 2;
                toolbar4.f766i.setLayoutParams(i10);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f766i);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (!(((e) childAt.getLayoutParams()).f782b == 2 || childAt == toolbar6.f752a)) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.M.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            gVar.C = true;
            gVar.f577n.p(false);
            View view = Toolbar.this.f766i;
            if (view instanceof j.b) {
                ((j.b) view).c();
            }
            return true;
        }
    }

    public interface f {
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new j.g(getContext());
    }

    public final void a(List<View> list, int i10) {
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        boolean z10 = c0.e.d(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, c0.e.d(this));
        list.clear();
        if (z10) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f782b == 0 && x(childAt) && k(eVar.f17857a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f782b == 0 && x(childAt2) && k(eVar2.f17857a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z10) {
        e eVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            eVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            eVar = generateLayoutParams(layoutParams);
        } else {
            eVar = (e) layoutParams;
        }
        eVar.f782b = 1;
        if (!z10 || this.f766i == null) {
            addView(view, eVar);
            return;
        }
        view.setLayoutParams(eVar);
        this.M.add(view);
    }

    public void c() {
        if (this.f765h == null) {
            q qVar = new q(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            this.f765h = qVar;
            qVar.setImageDrawable(this.f762f);
            this.f765h.setContentDescription(this.f764g);
            e i10 = generateDefaultLayoutParams();
            i10.f17857a = 8388611 | (this.f771v & 112);
            i10.f782b = 2;
            this.f765h.setLayoutParams(i10);
            this.f765h.setOnClickListener(new c());
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public final void d() {
        if (this.B == null) {
            this.B = new v0();
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f752a;
        if (actionMenuView.f666x == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) actionMenuView.getMenu();
            if (this.f755b0 == null) {
                this.f755b0 = new d();
            }
            this.f752a.setExpandedActionViewsExclusive(true);
            eVar.b(this.f755b0, this.f767r);
        }
    }

    public final void f() {
        if (this.f752a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), (AttributeSet) null);
            this.f752a = actionMenuView;
            actionMenuView.setPopupTheme(this.f768s);
            this.f752a.setOnMenuItemClickListener(this.R);
            ActionMenuView actionMenuView2 = this.f752a;
            i.a aVar = this.f757c0;
            e.a aVar2 = this.f759d0;
            actionMenuView2.C = aVar;
            actionMenuView2.D = aVar2;
            e i10 = generateDefaultLayoutParams();
            i10.f17857a = 8388613 | (this.f771v & 112);
            this.f752a.setLayoutParams(i10);
            b(this.f752a, false);
        }
    }

    public void g(o0.l lVar) {
        j jVar = this.O;
        jVar.f22589b.add(lVar);
        jVar.f22588a.run();
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f765h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f765h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        v0 v0Var = this.B;
        if (v0Var != null) {
            return v0Var.f1119g ? v0Var.f1113a : v0Var.f1114b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.D;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        v0 v0Var = this.B;
        if (v0Var != null) {
            return v0Var.f1113a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        v0 v0Var = this.B;
        if (v0Var != null) {
            return v0Var.f1114b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        v0 v0Var = this.B;
        if (v0Var != null) {
            return v0Var.f1119g ? v0Var.f1114b : v0Var.f1113a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.C;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.f666x;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f752a
            r1 = 0
            if (r0 == 0) goto L_0x0011
            androidx.appcompat.view.menu.e r0 = r0.f666x
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x0023
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.D
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0027
        L_0x0023:
            int r0 = r3.getContentInsetEnd()
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        if (c0.e.d(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        if (c0.e.d(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.C, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f760e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f760e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f752a.getMenu();
    }

    public View getNavButtonView() {
        return this.f758d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f758d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f758d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public c getOuterActionMenuPresenter() {
        return this.f753a0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f752a.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f767r;
    }

    public int getPopupTheme() {
        return this.f768s;
    }

    public CharSequence getSubtitle() {
        return this.G;
    }

    public final TextView getSubtitleTextView() {
        return this.f756c;
    }

    public CharSequence getTitle() {
        return this.F;
    }

    public int getTitleMarginBottom() {
        return this.A;
    }

    public int getTitleMarginEnd() {
        return this.f774y;
    }

    public int getTitleMarginStart() {
        return this.f773x;
    }

    public int getTitleMarginTop() {
        return this.f775z;
    }

    public final TextView getTitleTextView() {
        return this.f754b;
    }

    public j0 getWrapper() {
        if (this.S == null) {
            this.S = new i1(this, true);
        }
        return this.S;
    }

    public final void h() {
        if (this.f758d == null) {
            this.f758d = new q(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            e i10 = generateDefaultLayoutParams();
            i10.f17857a = 8388611 | (this.f771v & 112);
            this.f758d.setLayoutParams(i10);
        }
    }

    /* renamed from: i */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    /* renamed from: j */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof a.C0135a) {
            return new e((a.C0135a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    public final int k(int i10) {
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        int d10 = c0.e.d(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, d10) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return d10 == 1 ? 5 : 3;
    }

    public final int l(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int i12 = eVar.f17857a & 112;
        if (!(i12 == 16 || i12 == 48 || i12 == 80)) {
            i12 = this.E & 112;
        }
        if (i12 == 48) {
            return getPaddingTop() - i11;
        }
        if (i12 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i13 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i14 = eVar.topMargin;
        if (i13 < i14) {
            i13 = i14;
        } else {
            int i15 = (((height - paddingBottom) - measuredHeight) - i13) - paddingTop;
            int i16 = eVar.bottomMargin;
            if (i15 < i16) {
                i13 = Math.max(0, i13 - (i16 - i15));
            }
        }
        return paddingTop + i13;
    }

    public final int m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return h.c(marginLayoutParams) + h.b(marginLayoutParams);
    }

    public final int n(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public void o(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f763f0);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.K = false;
        }
        if (!this.K) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.K = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.K = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x02a1 A[LOOP:0: B:101:0x029f->B:102:0x02a1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c3 A[LOOP:1: B:104:0x02c1->B:105:0x02c3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02e8 A[LOOP:2: B:107:0x02e6->B:108:0x02e8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x033a A[LOOP:3: B:115:0x0338->B:116:0x033a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0227  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            java.util.WeakHashMap<android.view.View, java.lang.String> r1 = o0.c0.f22553a
            int r1 = o0.c0.e.d(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000e
            r1 = 1
            goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.N
            r11[r2] = r3
            r11[r3] = r3
            int r12 = o0.c0.d.d(r19)
            if (r12 < 0) goto L_0x003c
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003d
        L_0x003c:
            r12 = 0
        L_0x003d:
            android.widget.ImageButton r13 = r0.f758d
            boolean r13 = r0.x(r13)
            if (r13 == 0) goto L_0x0057
            if (r1 == 0) goto L_0x0050
            android.widget.ImageButton r13 = r0.f758d
            int r13 = r0.u(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0059
        L_0x0050:
            android.widget.ImageButton r13 = r0.f758d
            int r13 = r0.t(r13, r6, r11, r12)
            goto L_0x0058
        L_0x0057:
            r13 = r6
        L_0x0058:
            r14 = r10
        L_0x0059:
            android.widget.ImageButton r15 = r0.f765h
            boolean r15 = r0.x(r15)
            if (r15 == 0) goto L_0x0070
            if (r1 == 0) goto L_0x006a
            android.widget.ImageButton r15 = r0.f765h
            int r14 = r0.u(r15, r14, r11, r12)
            goto L_0x0070
        L_0x006a:
            android.widget.ImageButton r15 = r0.f765h
            int r13 = r0.t(r15, r13, r11, r12)
        L_0x0070:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f752a
            boolean r15 = r0.x(r15)
            if (r15 == 0) goto L_0x0087
            if (r1 == 0) goto L_0x0081
            androidx.appcompat.widget.ActionMenuView r15 = r0.f752a
            int r13 = r0.t(r15, r13, r11, r12)
            goto L_0x0087
        L_0x0081:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f752a
            int r14 = r0.u(r15, r14, r11, r12)
        L_0x0087:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f766i
            boolean r13 = r0.x(r13)
            if (r13 == 0) goto L_0x00c4
            if (r1 == 0) goto L_0x00be
            android.view.View r13 = r0.f766i
            int r10 = r0.u(r13, r10, r11, r12)
            goto L_0x00c4
        L_0x00be:
            android.view.View r13 = r0.f766i
            int r2 = r0.t(r13, r2, r11, r12)
        L_0x00c4:
            android.widget.ImageView r13 = r0.f760e
            boolean r13 = r0.x(r13)
            if (r13 == 0) goto L_0x00db
            if (r1 == 0) goto L_0x00d5
            android.widget.ImageView r13 = r0.f760e
            int r10 = r0.u(r13, r10, r11, r12)
            goto L_0x00db
        L_0x00d5:
            android.widget.ImageView r13 = r0.f760e
            int r2 = r0.t(r13, r2, r11, r12)
        L_0x00db:
            android.widget.TextView r13 = r0.f754b
            boolean r13 = r0.x(r13)
            android.widget.TextView r14 = r0.f756c
            boolean r14 = r0.x(r14)
            if (r13 == 0) goto L_0x0102
            android.widget.TextView r15 = r0.f754b
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.e) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f754b
            int r7 = r7.getMeasuredHeight()
            int r7 = r7 + r3
            int r3 = r15.bottomMargin
            int r7 = r7 + r3
            r3 = 0
            int r7 = r7 + r3
            goto L_0x0105
        L_0x0102:
            r23 = r7
            r7 = 0
        L_0x0105:
            if (r14 == 0) goto L_0x011f
            android.widget.TextView r3 = r0.f756c
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.e) r3
            int r15 = r3.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f756c
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r15
            int r3 = r3.bottomMargin
            int r4 = r4 + r3
            int r7 = r7 + r4
            goto L_0x0121
        L_0x011f:
            r16 = r4
        L_0x0121:
            if (r13 != 0) goto L_0x012c
            if (r14 == 0) goto L_0x0126
            goto L_0x012c
        L_0x0126:
            r18 = r6
            r22 = r12
            goto L_0x0291
        L_0x012c:
            if (r13 == 0) goto L_0x0131
            android.widget.TextView r3 = r0.f754b
            goto L_0x0133
        L_0x0131:
            android.widget.TextView r3 = r0.f756c
        L_0x0133:
            if (r14 == 0) goto L_0x0138
            android.widget.TextView r4 = r0.f756c
            goto L_0x013a
        L_0x0138:
            android.widget.TextView r4 = r0.f754b
        L_0x013a:
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.e) r3
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.e) r4
            if (r13 == 0) goto L_0x0150
            android.widget.TextView r15 = r0.f754b
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x015a
        L_0x0150:
            if (r14 == 0) goto L_0x015d
            android.widget.TextView r15 = r0.f756c
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015d
        L_0x015a:
            r17 = 1
            goto L_0x015f
        L_0x015d:
            r17 = 0
        L_0x015f:
            int r15 = r0.E
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x01a7
            r6 = 80
            if (r15 == r6) goto L_0x0199
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r7
            int r6 = r6 / 2
            int r15 = r3.topMargin
            r22 = r12
            int r12 = r0.f775z
            r24 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L_0x0182
            int r6 = r15 + r12
            goto L_0x0197
        L_0x0182:
            int r5 = r5 - r9
            int r5 = r5 - r7
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r3.bottomMargin
            int r3 = r0.A
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0197
            int r2 = r4.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0197:
            int r8 = r8 + r6
            goto L_0x01b6
        L_0x0199:
            r24 = r2
            r22 = r12
            int r5 = r5 - r9
            int r2 = r4.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.A
            int r5 = r5 - r2
            int r8 = r5 - r7
            goto L_0x01b6
        L_0x01a7:
            r24 = r2
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r3.topMargin
            int r2 = r2 + r3
            int r3 = r0.f775z
            int r8 = r2 + r3
        L_0x01b6:
            if (r1 == 0) goto L_0x0227
            if (r17 == 0) goto L_0x01bd
            int r1 = r0.f773x
            goto L_0x01be
        L_0x01bd:
            r1 = 0
        L_0x01be:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01f5
            android.widget.TextView r1 = r0.f754b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            android.widget.TextView r2 = r0.f754b
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f754b
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f754b
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f774y
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f6
        L_0x01f5:
            r2 = r10
        L_0x01f6:
            if (r14 == 0) goto L_0x021c
            android.widget.TextView r1 = r0.f756c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f756c
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.f756c
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f756c
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.f774y
            int r1 = r10 - r1
            goto L_0x021d
        L_0x021c:
            r1 = r10
        L_0x021d:
            if (r17 == 0) goto L_0x0224
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x0224:
            r2 = r24
            goto L_0x0291
        L_0x0227:
            if (r17 == 0) goto L_0x022c
            int r1 = r0.f773x
            goto L_0x022d
        L_0x022c:
            r1 = 0
        L_0x022d:
            r2 = 0
            r3 = r11[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r3 + r24
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x0263
            android.widget.TextView r1 = r0.f754b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            android.widget.TextView r2 = r0.f754b
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r3
            android.widget.TextView r4 = r0.f754b
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f754b
            r5.layout(r3, r8, r2, r4)
            int r5 = r0.f774y
            int r2 = r2 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x0264
        L_0x0263:
            r2 = r3
        L_0x0264:
            if (r14 == 0) goto L_0x0288
            android.widget.TextView r1 = r0.f756c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f756c
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r3
            android.widget.TextView r4 = r0.f756c
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f756c
            r5.layout(r3, r8, r1, r4)
            int r4 = r0.f774y
            int r1 = r1 + r4
            goto L_0x0289
        L_0x0288:
            r1 = r3
        L_0x0289:
            if (r17 == 0) goto L_0x0290
            int r2 = java.lang.Math.max(r2, r1)
            goto L_0x0291
        L_0x0290:
            r2 = r3
        L_0x0291:
            java.util.ArrayList<android.view.View> r1 = r0.L
            r3 = 3
            r0.a(r1, r3)
            java.util.ArrayList<android.view.View> r1 = r0.L
            int r1 = r1.size()
            r3 = r2
            r2 = 0
        L_0x029f:
            if (r2 >= r1) goto L_0x02b2
            java.util.ArrayList<android.view.View> r4 = r0.L
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r3 = r0.t(r4, r3, r11, r12)
            int r2 = r2 + 1
            goto L_0x029f
        L_0x02b2:
            r12 = r22
            java.util.ArrayList<android.view.View> r1 = r0.L
            r2 = 5
            r0.a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.L
            int r1 = r1.size()
            r2 = 0
        L_0x02c1:
            if (r2 >= r1) goto L_0x02d2
            java.util.ArrayList<android.view.View> r4 = r0.L
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.u(r4, r10, r11, r12)
            int r2 = r2 + 1
            goto L_0x02c1
        L_0x02d2:
            java.util.ArrayList<android.view.View> r1 = r0.L
            r2 = 1
            r0.a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.L
            r4 = 0
            r5 = r11[r4]
            r2 = r11[r2]
            int r4 = r1.size()
            r7 = r5
            r5 = 0
            r6 = 0
        L_0x02e6:
            if (r5 >= r4) goto L_0x0319
            java.lang.Object r8 = r1.get(r5)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r9 = (androidx.appcompat.widget.Toolbar.e) r9
            int r13 = r9.leftMargin
            int r13 = r13 - r7
            int r7 = r9.rightMargin
            int r7 = r7 - r2
            r2 = 0
            int r9 = java.lang.Math.max(r2, r13)
            int r14 = java.lang.Math.max(r2, r7)
            int r13 = -r13
            int r13 = java.lang.Math.max(r2, r13)
            int r7 = -r7
            int r7 = java.lang.Math.max(r2, r7)
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 + r9
            int r8 = r8 + r14
            int r6 = r6 + r8
            int r5 = r5 + 1
            r2 = r7
            r7 = r13
            goto L_0x02e6
        L_0x0319:
            r2 = 0
            int r4 = r16 - r18
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r4 = r4 + r18
            int r1 = r6 / 2
            int r4 = r4 - r1
            int r6 = r6 + r4
            if (r4 >= r3) goto L_0x0329
            goto L_0x0330
        L_0x0329:
            if (r6 <= r10) goto L_0x032f
            int r6 = r6 - r10
            int r3 = r4 - r6
            goto L_0x0330
        L_0x032f:
            r3 = r4
        L_0x0330:
            java.util.ArrayList<android.view.View> r1 = r0.L
            int r1 = r1.size()
            r2 = r3
            r3 = 0
        L_0x0338:
            if (r3 >= r1) goto L_0x0349
            java.util.ArrayList<android.view.View> r4 = r0.L
            java.lang.Object r4 = r4.get(r3)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.t(r4, r2, r11, r12)
            int r3 = r3 + 1
            goto L_0x0338
        L_0x0349:
            java.util.ArrayList<android.view.View> r1 = r0.L
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr = this.N;
        char b10 = n1.b(this);
        boolean z10 = true;
        int i19 = 0;
        char c10 = b10 ^ 1;
        if (x(this.f758d)) {
            w(this.f758d, i10, 0, i11, 0, this.f772w);
            i14 = m(this.f758d) + this.f758d.getMeasuredWidth();
            i13 = Math.max(0, n(this.f758d) + this.f758d.getMeasuredHeight());
            i12 = View.combineMeasuredStates(0, this.f758d.getMeasuredState());
        } else {
            i14 = 0;
            i13 = 0;
            i12 = 0;
        }
        if (x(this.f765h)) {
            w(this.f765h, i10, 0, i11, 0, this.f772w);
            i14 = m(this.f765h) + this.f765h.getMeasuredWidth();
            i13 = Math.max(i13, n(this.f765h) + this.f765h.getMeasuredHeight());
            i12 = View.combineMeasuredStates(i12, this.f765h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i14) + 0;
        iArr[b10] = Math.max(0, currentContentInsetStart - i14);
        if (x(this.f752a)) {
            w(this.f752a, i10, max, i11, 0, this.f772w);
            i15 = m(this.f752a) + this.f752a.getMeasuredWidth();
            i13 = Math.max(i13, n(this.f752a) + this.f752a.getMeasuredHeight());
            i12 = View.combineMeasuredStates(i12, this.f752a.getMeasuredState());
        } else {
            i15 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = Math.max(currentContentInsetEnd, i15) + max;
        iArr[c10] = Math.max(0, currentContentInsetEnd - i15);
        if (x(this.f766i)) {
            max2 += v(this.f766i, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, n(this.f766i) + this.f766i.getMeasuredHeight());
            i12 = View.combineMeasuredStates(i12, this.f766i.getMeasuredState());
        }
        if (x(this.f760e)) {
            max2 += v(this.f760e, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, n(this.f760e) + this.f760e.getMeasuredHeight());
            i12 = View.combineMeasuredStates(i12, this.f760e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (((e) childAt.getLayoutParams()).f782b == 0 && x(childAt)) {
                View view = childAt;
                max2 += v(childAt, i10, max2, i11, 0, iArr);
                View view2 = view;
                i13 = Math.max(i13, n(view2) + view.getMeasuredHeight());
                i12 = View.combineMeasuredStates(i12, view2.getMeasuredState());
            }
        }
        int i21 = this.f775z + this.A;
        int i22 = this.f773x + this.f774y;
        if (x(this.f754b)) {
            v(this.f754b, i10, max2 + i22, i11, i21, iArr);
            int m10 = m(this.f754b) + this.f754b.getMeasuredWidth();
            i16 = n(this.f754b) + this.f754b.getMeasuredHeight();
            i18 = View.combineMeasuredStates(i12, this.f754b.getMeasuredState());
            i17 = m10;
        } else {
            i18 = i12;
            i17 = 0;
            i16 = 0;
        }
        if (x(this.f756c)) {
            int i23 = i16 + i21;
            i17 = Math.max(i17, v(this.f756c, i10, max2 + i22, i11, i23, iArr));
            i16 = n(this.f756c) + this.f756c.getMeasuredHeight() + i16;
            i18 = View.combineMeasuredStates(i18, this.f756c.getMeasuredState());
        } else {
            int i24 = i18;
        }
        int max3 = Math.max(i13, i16);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max3;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max2 + i17, getSuggestedMinimumWidth()), i10, -16777216 & i18);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, i18 << 16);
        if (this.f761e0) {
            int childCount2 = getChildCount();
            int i25 = 0;
            while (true) {
                if (i25 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i25);
                if (x(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i25++;
            }
        }
        z10 = false;
        if (!z10) {
            i19 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i19);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.f25915a);
        ActionMenuView actionMenuView = this.f752a;
        androidx.appcompat.view.menu.e eVar = actionMenuView != null ? actionMenuView.f666x : null;
        int i10 = gVar.f783c;
        if (!(i10 == 0 || this.f755b0 == null || eVar == null || (findItem = eVar.findItem(i10)) == null)) {
            findItem.expandActionView();
        }
        if (gVar.f784d) {
            removeCallbacks(this.f763f0);
            post(this.f763f0);
        }
    }

    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        d();
        v0 v0Var = this.B;
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        if (z10 != v0Var.f1119g) {
            v0Var.f1119g = z10;
            if (!v0Var.f1120h) {
                v0Var.f1113a = v0Var.f1117e;
                v0Var.f1114b = v0Var.f1118f;
            } else if (z10) {
                int i11 = v0Var.f1116d;
                if (i11 == Integer.MIN_VALUE) {
                    i11 = v0Var.f1117e;
                }
                v0Var.f1113a = i11;
                int i12 = v0Var.f1115c;
                if (i12 == Integer.MIN_VALUE) {
                    i12 = v0Var.f1118f;
                }
                v0Var.f1114b = i12;
            } else {
                int i13 = v0Var.f1115c;
                if (i13 == Integer.MIN_VALUE) {
                    i13 = v0Var.f1117e;
                }
                v0Var.f1113a = i13;
                int i14 = v0Var.f1116d;
                if (i14 == Integer.MIN_VALUE) {
                    i14 = v0Var.f1118f;
                }
                v0Var.f1114b = i14;
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        g gVar2 = new g(super.onSaveInstanceState());
        d dVar = this.f755b0;
        if (!(dVar == null || (gVar = dVar.f780b) == null)) {
            gVar2.f783c = gVar.f564a;
        }
        gVar2.f784d = s();
        return gVar2;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.J = false;
        }
        if (!this.J) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.J = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.J = false;
        }
        return true;
    }

    public void p() {
        Iterator<MenuItem> it = this.P.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.O.a(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.P = currentMenuItems2;
        this.O.c(menu);
    }

    public final boolean q(View view) {
        return view.getParent() == this || this.M.contains(view);
    }

    public void r(o0.l lVar) {
        this.O.d(lVar);
    }

    public boolean s() {
        ActionMenuView actionMenuView = this.f752a;
        if (actionMenuView != null) {
            c cVar = actionMenuView.B;
            if (cVar != null && cVar.o()) {
                return true;
            }
        }
        return false;
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(g.a.b(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.f761e0 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.D) {
            this.D = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.C) {
            this.C = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(g.a.b(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(g.a.b(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        h();
        this.f758d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.Q = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f752a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f768s != i10) {
            this.f768s = i10;
            if (i10 == 0) {
                this.f767r = getContext();
            } else {
                this.f767r = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.A = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f774y = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f773x = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f775z = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public final int t(View view, int i10, int[] iArr, int i11) {
        e eVar = (e) view.getLayoutParams();
        int i12 = eVar.leftMargin - iArr[0];
        int max = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int l10 = l(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, l10, max + measuredWidth, view.getMeasuredHeight() + l10);
        return measuredWidth + eVar.rightMargin + max;
    }

    public final int u(View view, int i10, int[] iArr, int i11) {
        e eVar = (e) view.getLayoutParams();
        int i12 = eVar.rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int l10 = l(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, l10, max, view.getMeasuredHeight() + l10);
        return max - (measuredWidth + eVar.leftMargin);
    }

    public final int v(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i15) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void w(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean x(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean y() {
        ActionMenuView actionMenuView = this.f752a;
        if (actionMenuView != null) {
            c cVar = actionMenuView.B;
            if (cVar != null && cVar.p()) {
                return true;
            }
        }
        return false;
    }

    public static class e extends a.C0135a {

        /* renamed from: b  reason: collision with root package name */
        public int f782b = 0;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i10, int i11) {
            super(i10, i11);
            this.f17857a = 8388627;
        }

        public e(e eVar) {
            super((a.C0135a) eVar);
            this.f782b = eVar.f782b;
        }

        public e(a.C0135a aVar) {
            super(aVar);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.E = 8388627;
        this.L = new ArrayList<>();
        this.M = new ArrayList<>();
        this.N = new int[2];
        this.O = new j(new androidx.activity.c(this));
        this.P = new ArrayList<>();
        this.R = new a();
        this.f763f0 = new b();
        Context context2 = getContext();
        int[] iArr = e.l.f13525y;
        g1 r10 = g1.r(context2, attributeSet, iArr, i10, 0);
        c0.B(this, context, iArr, attributeSet, r10.f924b, i10, 0);
        this.f769t = r10.m(28, 0);
        this.f770u = r10.m(19, 0);
        this.E = r10.k(0, this.E);
        this.f771v = r10.k(2, 48);
        int e10 = r10.e(22, 0);
        e10 = r10.p(27) ? r10.e(27, e10) : e10;
        this.A = e10;
        this.f775z = e10;
        this.f774y = e10;
        this.f773x = e10;
        int e11 = r10.e(25, -1);
        if (e11 >= 0) {
            this.f773x = e11;
        }
        int e12 = r10.e(24, -1);
        if (e12 >= 0) {
            this.f774y = e12;
        }
        int e13 = r10.e(26, -1);
        if (e13 >= 0) {
            this.f775z = e13;
        }
        int e14 = r10.e(23, -1);
        if (e14 >= 0) {
            this.A = e14;
        }
        this.f772w = r10.f(13, -1);
        int e15 = r10.e(9, Integer.MIN_VALUE);
        int e16 = r10.e(5, Integer.MIN_VALUE);
        int f10 = r10.f(7, 0);
        int f11 = r10.f(8, 0);
        d();
        v0 v0Var = this.B;
        v0Var.f1120h = false;
        if (f10 != Integer.MIN_VALUE) {
            v0Var.f1117e = f10;
            v0Var.f1113a = f10;
        }
        if (f11 != Integer.MIN_VALUE) {
            v0Var.f1118f = f11;
            v0Var.f1114b = f11;
        }
        if (!(e15 == Integer.MIN_VALUE && e16 == Integer.MIN_VALUE)) {
            v0Var.a(e15, e16);
        }
        this.C = r10.e(10, Integer.MIN_VALUE);
        this.D = r10.e(6, Integer.MIN_VALUE);
        this.f762f = r10.g(4);
        this.f764g = r10.o(3);
        CharSequence o10 = r10.o(21);
        if (!TextUtils.isEmpty(o10)) {
            setTitle(o10);
        }
        CharSequence o11 = r10.o(18);
        if (!TextUtils.isEmpty(o11)) {
            setSubtitle(o11);
        }
        this.f767r = getContext();
        setPopupTheme(r10.m(17, 0));
        Drawable g10 = r10.g(16);
        if (g10 != null) {
            setNavigationIcon(g10);
        }
        CharSequence o12 = r10.o(15);
        if (!TextUtils.isEmpty(o12)) {
            setNavigationContentDescription(o12);
        }
        Drawable g11 = r10.g(11);
        if (g11 != null) {
            setLogo(g11);
        }
        CharSequence o13 = r10.o(12);
        if (!TextUtils.isEmpty(o13)) {
            setLogoDescription(o13);
        }
        if (r10.p(29)) {
            setTitleTextColor(r10.c(29));
        }
        if (r10.p(20)) {
            setSubtitleTextColor(r10.c(20));
        }
        if (r10.p(14)) {
            getMenuInflater().inflate(r10.m(14, 0), getMenu());
        }
        r10.f924b.recycle();
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        ImageButton imageButton = this.f765h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f765h.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f765h;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f762f);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f760e == null) {
                this.f760e = new AppCompatImageView(getContext(), (AttributeSet) null);
            }
            if (!q(this.f760e)) {
                b(this.f760e, true);
            }
        } else {
            ImageView imageView = this.f760e;
            if (imageView != null && q(imageView)) {
                removeView(this.f760e);
                this.M.remove(this.f760e);
            }
        }
        ImageView imageView2 = this.f760e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f760e == null) {
            this.f760e = new AppCompatImageView(getContext(), (AttributeSet) null);
        }
        ImageView imageView = this.f760e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            h();
        }
        ImageButton imageButton = this.f758d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            j1.a(this.f758d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            h();
            if (!q(this.f758d)) {
                b(this.f758d, true);
            }
        } else {
            ImageButton imageButton = this.f758d;
            if (imageButton != null && q(imageButton)) {
                removeView(this.f758d);
                this.M.remove(this.f758d);
            }
        }
        ImageButton imageButton2 = this.f758d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f756c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
                this.f756c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f756c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f770u;
                if (i10 != 0) {
                    this.f756c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.I;
                if (colorStateList != null) {
                    this.f756c.setTextColor(colorStateList);
                }
            }
            if (!q(this.f756c)) {
                b(this.f756c, true);
            }
        } else {
            TextView textView = this.f756c;
            if (textView != null && q(textView)) {
                removeView(this.f756c);
                this.M.remove(this.f756c);
            }
        }
        TextView textView2 = this.f756c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.G = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.I = colorStateList;
        TextView textView = this.f756c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f754b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
                this.f754b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f754b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f769t;
                if (i10 != 0) {
                    this.f754b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.H;
                if (colorStateList != null) {
                    this.f754b.setTextColor(colorStateList);
                }
            }
            if (!q(this.f754b)) {
                b(this.f754b, true);
            }
        } else {
            TextView textView = this.f754b;
            if (textView != null && q(textView)) {
                removeView(this.f754b);
                this.M.remove(this.f754b);
            }
        }
        TextView textView2 = this.f754b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.F = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.H = colorStateList;
        TextView textView = this.f754b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class g extends u0.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f783c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f784d;

        public class a implements Parcelable.ClassLoaderCreator<g> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            public Object[] newArray(int i10) {
                return new g[i10];
            }

            public Object createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f783c = parcel.readInt();
            this.f784d = parcel.readInt() != 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f25915a, i10);
            parcel.writeInt(this.f783c);
            parcel.writeInt(this.f784d ? 1 : 0);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
