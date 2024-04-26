package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.startapp.startappsdk.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import s0.f;

/* compiled from: DropDownListView */
public class l0 extends ListView {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f994a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    public int f995b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f996c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f997d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f998e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f999f;

    /* renamed from: g  reason: collision with root package name */
    public Field f1000g;

    /* renamed from: h  reason: collision with root package name */
    public c f1001h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1002i;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1003r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1004s;

    /* renamed from: t  reason: collision with root package name */
    public f f1005t;

    /* renamed from: u  reason: collision with root package name */
    public d f1006u;

    /* compiled from: DropDownListView */
    public static class a {
        public static void a(View view, float f10, float f11) {
            view.drawableHotspotChanged(f10, f11);
        }
    }

    /* compiled from: DropDownListView */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static Method f1007a;

        /* renamed from: b  reason: collision with root package name */
        public static Method f1008b;

        /* renamed from: c  reason: collision with root package name */
        public static Method f1009c;

        /* renamed from: d  reason: collision with root package name */
        public static boolean f1010d = true;

        static {
            Class<AbsListView> cls = AbsListView.class;
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("positionSelector", new Class[]{cls2, View.class, Boolean.TYPE, cls3, cls3});
                f1007a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", new Class[]{cls2});
                f1008b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", new Class[]{cls2});
                f1009c = declaredMethod3;
                declaredMethod3.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* compiled from: DropDownListView */
    public static class c extends h.d {

        /* renamed from: b  reason: collision with root package name */
        public boolean f1011b = true;

        public c(Drawable drawable) {
            super(drawable);
        }

        public void draw(Canvas canvas) {
            if (this.f1011b) {
                this.f18755a.draw(canvas);
            }
        }

        public void setHotspot(float f10, float f11) {
            if (this.f1011b) {
                androidx.core.graphics.drawable.a.h(this.f18755a, f10, f11);
            }
        }

        public void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f1011b) {
                androidx.core.graphics.drawable.a.i(this.f18755a, i10, i11, i12, i13);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f1011b) {
                return this.f18755a.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z10, boolean z11) {
            if (this.f1011b) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    /* compiled from: DropDownListView */
    public class d implements Runnable {
        public d() {
        }

        public void run() {
            l0 l0Var = l0.this;
            l0Var.f1006u = null;
            l0Var.drawableStateChanged();
        }
    }

    public l0(Context context, boolean z10) {
        super(context, (AttributeSet) null, R.attr.dropDownListViewStyle);
        this.f1003r = z10;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1000g = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e10) {
            e10.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z10) {
        c cVar = this.f1001h;
        if (cVar != null) {
            cVar.f1011b = z10;
        }
    }

    public int a(int i10, int i11, int i12) {
        int i13;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i14 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < count) {
            int itemViewType = adapter.getItemViewType(i15);
            if (itemViewType != i16) {
                view = null;
                i16 = itemViewType;
            }
            view = adapter.getView(i15, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i18 = layoutParams.height;
            if (i18 > 0) {
                i13 = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
            } else {
                i13 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i10, i13);
            view.forceLayout();
            if (i15 > 0) {
                i14 += dividerHeight;
            }
            i14 += view.getMeasuredHeight();
            if (i14 >= i11) {
                return (i12 < 0 || i15 <= i12 || i17 <= 0 || i14 == i11) ? i11 : i17;
            }
            if (i12 >= 0 && i15 >= i12) {
                i17 = i14;
            }
            i15++;
        }
        return i14;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r3 != 3) goto L_0x0129;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x015f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(android.view.MotionEvent r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            int r3 = r17.getActionMasked()
            r4 = 0
            r5 = 1
            if (r3 == r5) goto L_0x0016
            r0 = 2
            if (r3 == r0) goto L_0x0014
            r0 = 3
            if (r3 == r0) goto L_0x001d
            goto L_0x0129
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            int r6 = r17.findPointerIndex(r18)
            if (r6 >= 0) goto L_0x0020
        L_0x001d:
            r0 = 0
            goto L_0x012a
        L_0x0020:
            float r7 = r2.getX(r6)
            int r7 = (int) r7
            float r6 = r2.getY(r6)
            int r6 = (int) r6
            int r8 = r1.pointToPosition(r7, r6)
            r9 = -1
            if (r8 != r9) goto L_0x0033
            goto L_0x012b
        L_0x0033:
            int r0 = r16.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r10 = r1.getChildAt(r0)
            float r7 = (float) r7
            float r6 = (float) r6
            r1.f1004s = r5
            int r0 = android.os.Build.VERSION.SDK_INT
            r11 = 21
            if (r0 < r11) goto L_0x004a
            androidx.appcompat.widget.l0.a.a(r1, r7, r6)
        L_0x004a:
            boolean r12 = r16.isPressed()
            if (r12 != 0) goto L_0x0053
            r1.setPressed(r5)
        L_0x0053:
            r16.layoutChildren()
            int r12 = r1.f999f
            if (r12 == r9) goto L_0x0070
            int r13 = r16.getFirstVisiblePosition()
            int r12 = r12 - r13
            android.view.View r12 = r1.getChildAt(r12)
            if (r12 == 0) goto L_0x0070
            if (r12 == r10) goto L_0x0070
            boolean r13 = r12.isPressed()
            if (r13 == 0) goto L_0x0070
            r12.setPressed(r4)
        L_0x0070:
            r1.f999f = r8
            int r12 = r10.getLeft()
            float r12 = (float) r12
            float r12 = r7 - r12
            int r13 = r10.getTop()
            float r13 = (float) r13
            float r13 = r6 - r13
            if (r0 < r11) goto L_0x0085
            androidx.appcompat.widget.l0.a.a(r10, r12, r13)
        L_0x0085:
            boolean r0 = r10.isPressed()
            if (r0 != 0) goto L_0x008e
            r10.setPressed(r5)
        L_0x008e:
            android.graphics.drawable.Drawable r11 = r16.getSelector()
            if (r11 == 0) goto L_0x0098
            if (r8 == r9) goto L_0x0098
            r12 = 1
            goto L_0x0099
        L_0x0098:
            r12 = 0
        L_0x0099:
            if (r12 == 0) goto L_0x009e
            r11.setVisible(r4, r4)
        L_0x009e:
            android.graphics.Rect r0 = r1.f994a
            int r13 = r10.getLeft()
            int r14 = r10.getTop()
            int r15 = r10.getRight()
            int r5 = r10.getBottom()
            r0.set(r13, r14, r15, r5)
            int r5 = r0.left
            int r13 = r1.f995b
            int r5 = r5 - r13
            r0.left = r5
            int r5 = r0.top
            int r13 = r1.f996c
            int r5 = r5 - r13
            r0.top = r5
            int r5 = r0.right
            int r13 = r1.f997d
            int r5 = r5 + r13
            r0.right = r5
            int r5 = r0.bottom
            int r13 = r1.f998e
            int r5 = r5 + r13
            r0.bottom = r5
            java.lang.reflect.Field r0 = r1.f1000g     // Catch:{ IllegalAccessException -> 0x00ef }
            boolean r0 = r0.getBoolean(r1)     // Catch:{ IllegalAccessException -> 0x00ef }
            boolean r5 = r10.isEnabled()     // Catch:{ IllegalAccessException -> 0x00ef }
            if (r5 == r0) goto L_0x00f3
            java.lang.reflect.Field r5 = r1.f1000g     // Catch:{ IllegalAccessException -> 0x00ef }
            if (r0 != 0) goto L_0x00e1
            r0 = 1
            goto L_0x00e2
        L_0x00e1:
            r0 = 0
        L_0x00e2:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x00ef }
            r5.set(r1, r0)     // Catch:{ IllegalAccessException -> 0x00ef }
            if (r8 == r9) goto L_0x00f3
            r16.refreshDrawableState()     // Catch:{ IllegalAccessException -> 0x00ef }
            goto L_0x00f3
        L_0x00ef:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00f3:
            if (r12 == 0) goto L_0x010e
            android.graphics.Rect r0 = r1.f994a
            float r5 = r0.exactCenterX()
            float r0 = r0.exactCenterY()
            int r12 = r16.getVisibility()
            if (r12 != 0) goto L_0x0107
            r12 = 1
            goto L_0x0108
        L_0x0107:
            r12 = 0
        L_0x0108:
            r11.setVisible(r12, r4)
            androidx.core.graphics.drawable.a.h(r11, r5, r0)
        L_0x010e:
            android.graphics.drawable.Drawable r0 = r16.getSelector()
            if (r0 == 0) goto L_0x0119
            if (r8 == r9) goto L_0x0119
            androidx.core.graphics.drawable.a.h(r0, r7, r6)
        L_0x0119:
            r1.setSelectorEnabled(r4)
            r16.refreshDrawableState()
            r5 = 1
            if (r3 != r5) goto L_0x0129
            long r5 = r1.getItemIdAtPosition(r8)
            r1.performItemClick(r10, r8, r5)
        L_0x0129:
            r0 = 1
        L_0x012a:
            r5 = 0
        L_0x012b:
            if (r0 == 0) goto L_0x012f
            if (r5 == 0) goto L_0x0147
        L_0x012f:
            r1.f1004s = r4
            r1.setPressed(r4)
            r16.drawableStateChanged()
            int r3 = r1.f999f
            int r5 = r16.getFirstVisiblePosition()
            int r3 = r3 - r5
            android.view.View r3 = r1.getChildAt(r3)
            if (r3 == 0) goto L_0x0147
            r3.setPressed(r4)
        L_0x0147:
            if (r0 == 0) goto L_0x015f
            s0.f r3 = r1.f1005t
            if (r3 != 0) goto L_0x0154
            s0.f r3 = new s0.f
            r3.<init>(r1)
            r1.f1005t = r3
        L_0x0154:
            s0.f r3 = r1.f1005t
            boolean r4 = r3.f24875x
            r4 = 1
            r3.f24875x = r4
            r3.onTouch(r1, r2)
            goto L_0x016c
        L_0x015f:
            s0.f r2 = r1.f1005t
            if (r2 == 0) goto L_0x016c
            boolean r3 = r2.f24875x
            if (r3 == 0) goto L_0x016a
            r2.d()
        L_0x016a:
            r2.f24875x = r4
        L_0x016c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.l0.b(android.view.MotionEvent, int):boolean");
    }

    public final void c() {
        Drawable selector = getSelector();
        if (selector != null && this.f1004s && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f994a.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f994a);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public void drawableStateChanged() {
        if (this.f1006u == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            c();
        }
    }

    public boolean hasFocus() {
        return this.f1003r || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f1003r || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f1003r || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f1003r && this.f1002i) || super.isInTouchMode();
    }

    public void onDetachedFromWindow() {
        this.f1006u = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1006u == null) {
            d dVar = new d();
            this.f1006u = dVar;
            post(dVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i10 < 30 || !b.f1010d) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            b.f1007a.invoke(this, new Object[]{Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1});
                            b.f1008b.invoke(this, new Object[]{Integer.valueOf(pointToPosition)});
                            b.f1009c.invoke(this, new Object[]{Integer.valueOf(pointToPosition)});
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                        } catch (InvocationTargetException e11) {
                            e11.printStackTrace();
                        }
                    }
                }
                c();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f999f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        d dVar = this.f1006u;
        if (dVar != null) {
            l0 l0Var = l0.this;
            l0Var.f1006u = null;
            l0Var.removeCallbacks(dVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f1002i = z10;
    }

    public void setSelector(Drawable drawable) {
        c cVar = drawable != null ? new c(drawable) : null;
        this.f1001h = cVar;
        super.setSelector(cVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f995b = rect.left;
        this.f996c = rect.top;
        this.f997d = rect.right;
        this.f998e = rect.bottom;
    }
}
