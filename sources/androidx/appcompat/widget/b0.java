package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import o0.c0;
import o0.x;

/* compiled from: AppCompatSpinner */
public class b0 extends Spinner implements x {
    @SuppressLint({"ResourceType"})

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f816i = {16843505};

    /* renamed from: a  reason: collision with root package name */
    public final e f817a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f818b;

    /* renamed from: c  reason: collision with root package name */
    public n0 f819c;

    /* renamed from: d  reason: collision with root package name */
    public SpinnerAdapter f820d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f821e;

    /* renamed from: f  reason: collision with root package name */
    public i f822f;

    /* renamed from: g  reason: collision with root package name */
    public int f823g;

    /* renamed from: h  reason: collision with root package name */
    public final Rect f824h = new Rect();

    /* compiled from: AppCompatSpinner */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (!b0.this.getInternalPopup().b()) {
                b0.this.b();
            }
            ViewTreeObserver viewTreeObserver = b0.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                b.a(viewTreeObserver, this);
            }
        }
    }

    /* compiled from: AppCompatSpinner */
    public static final class b {
        public static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* compiled from: AppCompatSpinner */
    public static final class c {
        public static int a(View view) {
            return view.getTextAlignment();
        }

        public static int b(View view) {
            return view.getTextDirection();
        }

        public static void c(View view, int i10) {
            view.setTextAlignment(i10);
        }

        public static void d(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    /* compiled from: AppCompatSpinner */
    public static final class d {
        public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    /* compiled from: AppCompatSpinner */
    public class e implements i, DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public androidx.appcompat.app.b f826a;

        /* renamed from: b  reason: collision with root package name */
        public ListAdapter f827b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f828c;

        public e() {
        }

        public boolean b() {
            androidx.appcompat.app.b bVar = this.f826a;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        public int c() {
            return 0;
        }

        public void dismiss() {
            androidx.appcompat.app.b bVar = this.f826a;
            if (bVar != null) {
                bVar.dismiss();
                this.f826a = null;
            }
        }

        public Drawable e() {
            return null;
        }

        public void g(CharSequence charSequence) {
            this.f828c = charSequence;
        }

        public void h(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        public void i(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        public void j(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        public void k(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        public void l(int i10, int i11) {
            if (this.f827b != null) {
                b.a aVar = new b.a(b0.this.getPopupContext());
                CharSequence charSequence = this.f828c;
                if (charSequence != null) {
                    aVar.setTitle(charSequence);
                }
                ListAdapter listAdapter = this.f827b;
                int selectedItemPosition = b0.this.getSelectedItemPosition();
                AlertController.b bVar = aVar.f441a;
                bVar.f432l = listAdapter;
                bVar.f433m = this;
                bVar.f436p = selectedItemPosition;
                bVar.f435o = true;
                androidx.appcompat.app.b create = aVar.create();
                this.f826a = create;
                ListView listView = create.f440e.f398g;
                c.d(listView, i10);
                c.c(listView, i11);
                this.f826a.show();
            }
        }

        public int m() {
            return 0;
        }

        public CharSequence n() {
            return this.f828c;
        }

        public void o(ListAdapter listAdapter) {
            this.f827b = listAdapter;
        }

        public void onClick(DialogInterface dialogInterface, int i10) {
            b0.this.setSelection(i10);
            if (b0.this.getOnItemClickListener() != null) {
                b0.this.performItemClick((View) null, i10, this.f827b.getItemId(i10));
            }
            androidx.appcompat.app.b bVar = this.f826a;
            if (bVar != null) {
                bVar.dismiss();
                this.f826a = null;
            }
        }
    }

    /* compiled from: AppCompatSpinner */
    public static class f implements ListAdapter, SpinnerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public SpinnerAdapter f830a;

        /* renamed from: b  reason: collision with root package name */
        public ListAdapter f831b;

        public f(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f830a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f831b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                d.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            } else if (spinnerAdapter instanceof c1) {
                c1 c1Var = (c1) spinnerAdapter;
                if (c1Var.getDropDownViewTheme() == null) {
                    c1Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f831b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f830a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f830a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f830a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f830a;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i10);
        }

        public int getItemViewType(int i10) {
            return 0;
        }

        public View getView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f830a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f830a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f831b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f830a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f830a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* compiled from: AppCompatSpinner */
    public class g extends q0 implements i {
        public CharSequence K;
        public ListAdapter L;
        public final Rect M = new Rect();
        public int N;

        /* compiled from: AppCompatSpinner */
        public class a implements AdapterView.OnItemClickListener {
            public a(b0 b0Var) {
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                b0.this.setSelection(i10);
                if (b0.this.getOnItemClickListener() != null) {
                    g gVar = g.this;
                    b0.this.performItemClick(view, i10, gVar.L.getItemId(i10));
                }
                g.this.dismiss();
            }
        }

        /* compiled from: AppCompatSpinner */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            public void onGlobalLayout() {
                g gVar = g.this;
                b0 b0Var = b0.this;
                gVar.getClass();
                if (!(c0.q(b0Var) && b0Var.getGlobalVisibleRect(gVar.M))) {
                    g.this.dismiss();
                    return;
                }
                g.this.s();
                g.this.S();
            }
        }

        /* compiled from: AppCompatSpinner */
        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f834a;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f834a = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = b0.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f834a);
                }
            }
        }

        public g(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10, 0);
            this.f1072w = b0.this;
            r(true);
            this.f1073x = new a(b0.this);
        }

        public void g(CharSequence charSequence) {
            this.K = charSequence;
        }

        public void j(int i10) {
            this.N = i10;
        }

        public void l(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean b10 = b();
            s();
            this.G.setInputMethodMode(2);
            S();
            l0 l0Var = this.f1060c;
            l0Var.setChoiceMode(1);
            c.d(l0Var, i10);
            c.c(l0Var, i11);
            int selectedItemPosition = b0.this.getSelectedItemPosition();
            l0 l0Var2 = this.f1060c;
            if (b() && l0Var2 != null) {
                l0Var2.setListSelectionHidden(false);
                l0Var2.setSelection(selectedItemPosition);
                if (l0Var2.getChoiceMode() != 0) {
                    l0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!b10 && (viewTreeObserver = b0.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                this.G.setOnDismissListener(new c(bVar));
            }
        }

        public CharSequence n() {
            return this.K;
        }

        public void o(ListAdapter listAdapter) {
            super.o(listAdapter);
            this.L = listAdapter;
        }

        public void s() {
            int i10;
            int i11;
            Drawable e10 = e();
            int i12 = 0;
            if (e10 != null) {
                e10.getPadding(b0.this.f824h);
                if (n1.b(b0.this)) {
                    i11 = b0.this.f824h.right;
                } else {
                    i11 = -b0.this.f824h.left;
                }
                i12 = i11;
            } else {
                Rect rect = b0.this.f824h;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = b0.this.getPaddingLeft();
            int paddingRight = b0.this.getPaddingRight();
            int width = b0.this.getWidth();
            b0 b0Var = b0.this;
            int i13 = b0Var.f823g;
            if (i13 == -2) {
                int a10 = b0Var.a((SpinnerAdapter) this.L, e());
                int i14 = b0.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = b0.this.f824h;
                int i15 = (i14 - rect2.left) - rect2.right;
                if (a10 > i15) {
                    a10 = i15;
                }
                q(Math.max(a10, (width - paddingLeft) - paddingRight));
            } else if (i13 == -1) {
                q((width - paddingLeft) - paddingRight);
            } else {
                q(i13);
            }
            if (n1.b(b0.this)) {
                i10 = (((width - paddingRight) - this.f1062e) - this.N) + i12;
            } else {
                i10 = paddingLeft + this.N + i12;
            }
            this.f1063f = i10;
        }
    }

    /* compiled from: AppCompatSpinner */
    public static class h extends View.BaseSavedState {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public boolean f836a;

        /* compiled from: AppCompatSpinner */
        public class a implements Parcelable.Creator<h> {
            public Object createFromParcel(Parcel parcel) {
                return new h(parcel);
            }

            public Object[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f836a ? (byte) 1 : 0);
        }

        public h(Parcel parcel) {
            super(parcel);
            this.f836a = parcel.readByte() != 0;
        }
    }

    /* compiled from: AppCompatSpinner */
    public interface i {
        boolean b();

        int c();

        void dismiss();

        Drawable e();

        void g(CharSequence charSequence);

        void h(Drawable drawable);

        void i(int i10);

        void j(int i10);

        void k(int i10);

        void l(int i10, int i11);

        int m();

        CharSequence n();

        void o(ListAdapter listAdapter);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (r4 != null) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b0(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            r9.<init>(r10, r11, r12)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.f824h = r0
            android.content.Context r0 = r9.getContext()
            androidx.appcompat.widget.b1.a(r9, r0)
            int[] r0 = e.l.f13523w
            r1 = 0
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r11, r0, r12, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r9)
            r9.f817a = r2
            r2 = 4
            int r2 = r0.getResourceId(r2, r1)
            if (r2 == 0) goto L_0x002e
            j.c r3 = new j.c
            r3.<init>((android.content.Context) r10, (int) r2)
            r9.f818b = r3
            goto L_0x0030
        L_0x002e:
            r9.f818b = r10
        L_0x0030:
            r2 = 0
            r3 = -1
            int[] r4 = f816i     // Catch:{ Exception -> 0x004c, all -> 0x0049 }
            android.content.res.TypedArray r4 = r10.obtainStyledAttributes(r11, r4, r12, r1)     // Catch:{ Exception -> 0x004c, all -> 0x0049 }
            boolean r5 = r4.hasValue(r1)     // Catch:{ Exception -> 0x0047 }
            if (r5 == 0) goto L_0x0058
            int r3 = r4.getInt(r1, r1)     // Catch:{ Exception -> 0x0047 }
            goto L_0x0058
        L_0x0043:
            r10 = move-exception
            r2 = r4
            goto L_0x00d0
        L_0x0047:
            r5 = move-exception
            goto L_0x004f
        L_0x0049:
            r10 = move-exception
            goto L_0x00d0
        L_0x004c:
            r4 = move-exception
            r5 = r4
            r4 = r2
        L_0x004f:
            java.lang.String r6 = "AppCompatSpinner"
            java.lang.String r7 = "Could not read android:spinnerMode"
            android.util.Log.i(r6, r7, r5)     // Catch:{ all -> 0x0043 }
            if (r4 == 0) goto L_0x005b
        L_0x0058:
            r4.recycle()
        L_0x005b:
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0097
            if (r3 == r5) goto L_0x0062
            goto L_0x00a5
        L_0x0062:
            androidx.appcompat.widget.b0$g r3 = new androidx.appcompat.widget.b0$g
            android.content.Context r6 = r9.f818b
            r3.<init>(r6, r11, r12)
            android.content.Context r6 = r9.f818b
            int[] r7 = e.l.f13523w
            androidx.appcompat.widget.g1 r6 = androidx.appcompat.widget.g1.r(r6, r11, r7, r12, r1)
            r7 = 3
            r8 = -2
            int r7 = r6.l(r7, r8)
            r9.f823g = r7
            android.graphics.drawable.Drawable r7 = r6.g(r5)
            android.widget.PopupWindow r8 = r3.G
            r8.setBackgroundDrawable(r7)
            java.lang.String r4 = r0.getString(r4)
            r3.K = r4
            android.content.res.TypedArray r4 = r6.f924b
            r4.recycle()
            r9.f822f = r3
            androidx.appcompat.widget.a0 r4 = new androidx.appcompat.widget.a0
            r4.<init>(r9, r9, r3)
            r9.f819c = r4
            goto L_0x00a5
        L_0x0097:
            androidx.appcompat.widget.b0$e r3 = new androidx.appcompat.widget.b0$e
            r3.<init>()
            r9.f822f = r3
            java.lang.String r4 = r0.getString(r4)
            r3.g(r4)
        L_0x00a5:
            java.lang.CharSequence[] r1 = r0.getTextArray(r1)
            if (r1 == 0) goto L_0x00bc
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r10, r4, r1)
            r10 = 2131624145(0x7f0e00d1, float:1.8875461E38)
            r3.setDropDownViewResource(r10)
            r9.setAdapter((android.widget.SpinnerAdapter) r3)
        L_0x00bc:
            r0.recycle()
            r9.f821e = r5
            android.widget.SpinnerAdapter r10 = r9.f820d
            if (r10 == 0) goto L_0x00ca
            r9.setAdapter((android.widget.SpinnerAdapter) r10)
            r9.f820d = r2
        L_0x00ca:
            androidx.appcompat.widget.e r10 = r9.f817a
            r10.d(r11, r12)
            return
        L_0x00d0:
            if (r2 == 0) goto L_0x00d5
            r2.recycle()
        L_0x00d5:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b0.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i11;
        }
        drawable.getPadding(this.f824h);
        Rect rect = this.f824h;
        return i11 + rect.left + rect.right;
    }

    public void b() {
        this.f822f.l(c.b(this), c.a(this));
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f817a;
        if (eVar != null) {
            eVar.a();
        }
    }

    public int getDropDownHorizontalOffset() {
        i iVar = this.f822f;
        if (iVar != null) {
            return iVar.c();
        }
        return super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        i iVar = this.f822f;
        if (iVar != null) {
            return iVar.m();
        }
        return super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        if (this.f822f != null) {
            return this.f823g;
        }
        return super.getDropDownWidth();
    }

    public final i getInternalPopup() {
        return this.f822f;
    }

    public Drawable getPopupBackground() {
        i iVar = this.f822f;
        if (iVar != null) {
            return iVar.e();
        }
        return super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.f818b;
    }

    public CharSequence getPrompt() {
        i iVar = this.f822f;
        return iVar != null ? iVar.n() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f817a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f817a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.f822f;
        if (iVar != null && iVar.b()) {
            this.f822f.dismiss();
        }
    }

    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f822f != null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        if (hVar.f836a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new a());
        }
    }

    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        i iVar = this.f822f;
        hVar.f836a = iVar != null && iVar.b();
        return hVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        n0 n0Var = this.f819c;
        if (n0Var == null || !n0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        i iVar = this.f822f;
        if (iVar == null) {
            return super.performClick();
        }
        if (iVar.b()) {
            return true;
        }
        b();
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f817a;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f817a;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    public void setDropDownHorizontalOffset(int i10) {
        i iVar = this.f822f;
        if (iVar != null) {
            iVar.j(i10);
            this.f822f.k(i10);
            return;
        }
        super.setDropDownHorizontalOffset(i10);
    }

    public void setDropDownVerticalOffset(int i10) {
        i iVar = this.f822f;
        if (iVar != null) {
            iVar.i(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    public void setDropDownWidth(int i10) {
        if (this.f822f != null) {
            this.f823g = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        i iVar = this.f822f;
        if (iVar != null) {
            iVar.h(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(g.a.b(getPopupContext(), i10));
    }

    public void setPrompt(CharSequence charSequence) {
        i iVar = this.f822f;
        if (iVar != null) {
            iVar.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f817a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f817a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f821e) {
            this.f820d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f822f != null) {
            Context context = this.f818b;
            if (context == null) {
                context = getContext();
            }
            this.f822f.o(new f(spinnerAdapter, context.getTheme()));
        }
    }
}
