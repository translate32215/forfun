package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import e.l;
import o0.c0;

/* compiled from: LinearLayoutCompat */
public class o0 extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1038a;

    /* renamed from: b  reason: collision with root package name */
    public int f1039b;

    /* renamed from: c  reason: collision with root package name */
    public int f1040c;

    /* renamed from: d  reason: collision with root package name */
    public int f1041d;

    /* renamed from: e  reason: collision with root package name */
    public int f1042e;

    /* renamed from: f  reason: collision with root package name */
    public int f1043f;

    /* renamed from: g  reason: collision with root package name */
    public float f1044g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1045h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f1046i;

    /* renamed from: r  reason: collision with root package name */
    public int[] f1047r;

    /* renamed from: s  reason: collision with root package name */
    public Drawable f1048s;

    /* renamed from: t  reason: collision with root package name */
    public int f1049t;

    /* renamed from: u  reason: collision with root package name */
    public int f1050u;

    /* renamed from: v  reason: collision with root package name */
    public int f1051v;

    /* renamed from: w  reason: collision with root package name */
    public int f1052w;

    /* compiled from: LinearLayoutCompat */
    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i10, int i11) {
            super(i10, i11);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public o0(Context context) {
        this(context, (AttributeSet) null);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void f(Canvas canvas, int i10) {
        this.f1048s.setBounds(getPaddingLeft() + this.f1052w, i10, (getWidth() - getPaddingRight()) - this.f1052w, this.f1050u + i10);
        this.f1048s.draw(canvas);
    }

    public void g(Canvas canvas, int i10) {
        this.f1048s.setBounds(i10, getPaddingTop() + this.f1052w, this.f1049t + i10, (getHeight() - getPaddingBottom()) - this.f1052w);
        this.f1048s.draw(canvas);
    }

    public int getBaseline() {
        int i10;
        if (this.f1039b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f1039b;
        if (childCount > i11) {
            View childAt = getChildAt(i11);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i12 = this.f1040c;
                if (this.f1041d == 1 && (i10 = this.f1042e & 112) != 48) {
                    if (i10 == 16) {
                        i12 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1043f) / 2;
                    } else if (i10 == 80) {
                        i12 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1043f;
                    }
                }
                return i12 + ((a) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f1039b == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1039b;
    }

    public Drawable getDividerDrawable() {
        return this.f1048s;
    }

    public int getDividerPadding() {
        return this.f1052w;
    }

    public int getDividerWidth() {
        return this.f1049t;
    }

    public int getGravity() {
        return this.f1042e;
    }

    public int getOrientation() {
        return this.f1041d;
    }

    public int getShowDividers() {
        return this.f1051v;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1044g;
    }

    /* renamed from: h */
    public a generateDefaultLayoutParams() {
        int i10 = this.f1041d;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    /* renamed from: i */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* renamed from: j */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public boolean k(int i10) {
        if (i10 == 0) {
            return (this.f1051v & 1) != 0;
        }
        if (i10 == getChildCount()) {
            if ((this.f1051v & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.f1051v & 2) == 0) {
            return false;
        } else {
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    public void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (this.f1048s != null) {
            int i15 = 0;
            if (this.f1041d == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i15 < virtualChildCount) {
                    View childAt = getChildAt(i15);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !k(i15))) {
                        f(canvas, (childAt.getTop() - ((a) childAt.getLayoutParams()).topMargin) - this.f1050u);
                    }
                    i15++;
                }
                if (k(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        i14 = (getHeight() - getPaddingBottom()) - this.f1050u;
                    } else {
                        i14 = childAt2.getBottom() + ((a) childAt2.getLayoutParams()).bottomMargin;
                    }
                    f(canvas, i14);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean b10 = n1.b(this);
            while (i15 < virtualChildCount2) {
                View childAt3 = getChildAt(i15);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !k(i15))) {
                    a aVar = (a) childAt3.getLayoutParams();
                    if (b10) {
                        i13 = childAt3.getRight() + aVar.rightMargin;
                    } else {
                        i13 = (childAt3.getLeft() - aVar.leftMargin) - this.f1049t;
                    }
                    g(canvas, i13);
                }
                i15++;
            }
            if (k(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    a aVar2 = (a) childAt4.getLayoutParams();
                    if (b10) {
                        i12 = childAt4.getLeft() - aVar2.leftMargin;
                        i11 = this.f1049t;
                    } else {
                        i10 = childAt4.getRight() + aVar2.rightMargin;
                        g(canvas, i10);
                    }
                } else if (b10) {
                    i10 = getPaddingLeft();
                    g(canvas, i10);
                } else {
                    i12 = getWidth() - getPaddingRight();
                    i11 = this.f1049t;
                }
                i10 = i12 - i11;
                g(canvas, i10);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r26, int r27, int r28, int r29, int r30) {
        /*
            r25 = this;
            r0 = r25
            int r1 = r0.f1041d
            r2 = 80
            r3 = 16
            r4 = 8
            r5 = 5
            r6 = 8388615(0x800007, float:1.1754953E-38)
            r7 = 2
            r8 = 1
            if (r1 != r8) goto L_0x00bb
            int r1 = r25.getPaddingLeft()
            int r10 = r29 - r27
            int r11 = r25.getPaddingRight()
            int r11 = r10 - r11
            int r10 = r10 - r1
            int r12 = r25.getPaddingRight()
            int r10 = r10 - r12
            int r12 = r25.getVirtualChildCount()
            int r13 = r0.f1042e
            r14 = r13 & 112(0x70, float:1.57E-43)
            r6 = r6 & r13
            if (r14 == r3) goto L_0x0042
            if (r14 == r2) goto L_0x0036
            int r2 = r25.getPaddingTop()
            goto L_0x004d
        L_0x0036:
            int r2 = r25.getPaddingTop()
            int r2 = r2 + r30
            int r2 = r2 - r28
            int r3 = r0.f1043f
            int r2 = r2 - r3
            goto L_0x004d
        L_0x0042:
            int r2 = r25.getPaddingTop()
            int r3 = r30 - r28
            int r13 = r0.f1043f
            int r3 = r3 - r13
            int r3 = r3 / r7
            int r2 = r2 + r3
        L_0x004d:
            r3 = 0
        L_0x004e:
            if (r3 >= r12) goto L_0x01d5
            android.view.View r13 = r0.getChildAt(r3)
            if (r13 != 0) goto L_0x0059
            int r2 = r2 + 0
            goto L_0x00b5
        L_0x0059:
            int r14 = r13.getVisibility()
            if (r14 == r4) goto L_0x00b5
            int r14 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r16 = r13.getLayoutParams()
            r4 = r16
            androidx.appcompat.widget.o0$a r4 = (androidx.appcompat.widget.o0.a) r4
            int r9 = r4.gravity
            if (r9 >= 0) goto L_0x0074
            r9 = r6
        L_0x0074:
            java.util.WeakHashMap<android.view.View, java.lang.String> r17 = o0.c0.f22553a
            int r7 = o0.c0.e.d(r25)
            int r7 = android.view.Gravity.getAbsoluteGravity(r9, r7)
            r7 = r7 & 7
            if (r7 == r8) goto L_0x008d
            if (r7 == r5) goto L_0x0088
            int r7 = r4.leftMargin
            int r7 = r7 + r1
            goto L_0x0098
        L_0x0088:
            int r7 = r11 - r14
            int r9 = r4.rightMargin
            goto L_0x0097
        L_0x008d:
            int r7 = r10 - r14
            r9 = 2
            int r7 = r7 / r9
            int r7 = r7 + r1
            int r9 = r4.leftMargin
            int r7 = r7 + r9
            int r9 = r4.rightMargin
        L_0x0097:
            int r7 = r7 - r9
        L_0x0098:
            boolean r9 = r0.k(r3)
            if (r9 == 0) goto L_0x00a1
            int r9 = r0.f1050u
            int r2 = r2 + r9
        L_0x00a1:
            int r9 = r4.topMargin
            int r2 = r2 + r9
            int r9 = r2 + 0
            int r14 = r14 + r7
            int r5 = r15 + r9
            r13.layout(r7, r9, r14, r5)
            int r4 = r4.bottomMargin
            int r15 = r15 + r4
            r4 = 0
            int r15 = r15 + r4
            int r15 = r15 + r2
            int r3 = r3 + 0
            r2 = r15
        L_0x00b5:
            int r3 = r3 + r8
            r4 = 8
            r5 = 5
            r7 = 2
            goto L_0x004e
        L_0x00bb:
            boolean r1 = androidx.appcompat.widget.n1.b(r25)
            int r4 = r25.getPaddingTop()
            int r5 = r30 - r28
            int r7 = r25.getPaddingBottom()
            int r7 = r5 - r7
            int r5 = r5 - r4
            int r9 = r25.getPaddingBottom()
            int r5 = r5 - r9
            int r9 = r25.getVirtualChildCount()
            int r10 = r0.f1042e
            r6 = r6 & r10
            r10 = r10 & 112(0x70, float:1.57E-43)
            boolean r11 = r0.f1038a
            int[] r12 = r0.f1046i
            int[] r13 = r0.f1047r
            java.util.WeakHashMap<android.view.View, java.lang.String> r14 = o0.c0.f22553a
            int r14 = o0.c0.e.d(r25)
            int r6 = android.view.Gravity.getAbsoluteGravity(r6, r14)
            if (r6 == r8) goto L_0x0100
            r14 = 5
            if (r6 == r14) goto L_0x00f4
            int r6 = r25.getPaddingLeft()
            goto L_0x010c
        L_0x00f4:
            int r6 = r25.getPaddingLeft()
            int r6 = r6 + r29
            int r6 = r6 - r27
            int r14 = r0.f1043f
            int r6 = r6 - r14
            goto L_0x010c
        L_0x0100:
            int r6 = r25.getPaddingLeft()
            int r14 = r29 - r27
            int r15 = r0.f1043f
            int r14 = r14 - r15
            r15 = 2
            int r14 = r14 / r15
            int r6 = r6 + r14
        L_0x010c:
            if (r1 == 0) goto L_0x0112
            int r1 = r9 + -1
            r15 = -1
            goto L_0x0114
        L_0x0112:
            r1 = 0
            r15 = 1
        L_0x0114:
            r18 = r6
            r6 = 0
        L_0x0117:
            if (r6 >= r9) goto L_0x01d5
            int r19 = r15 * r6
            int r8 = r19 + r1
            android.view.View r2 = r0.getChildAt(r8)
            if (r2 != 0) goto L_0x012f
            int r18 = r18 + 0
        L_0x0125:
            r28 = r1
            r30 = r9
            r22 = r10
            r1 = 0
        L_0x012c:
            r2 = 1
            goto L_0x01c7
        L_0x012f:
            int r3 = r2.getVisibility()
            r14 = 8
            if (r3 == r14) goto L_0x0125
            int r3 = r2.getMeasuredWidth()
            int r21 = r2.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r22 = r2.getLayoutParams()
            r14 = r22
            androidx.appcompat.widget.o0$a r14 = (androidx.appcompat.widget.o0.a) r14
            if (r11 == 0) goto L_0x0157
            r28 = r1
            int r1 = r14.height
            r30 = r9
            r9 = -1
            if (r1 == r9) goto L_0x015b
            int r9 = r2.getBaseline()
            goto L_0x015c
        L_0x0157:
            r28 = r1
            r30 = r9
        L_0x015b:
            r9 = -1
        L_0x015c:
            int r1 = r14.gravity
            if (r1 >= 0) goto L_0x0161
            r1 = r10
        L_0x0161:
            r1 = r1 & 112(0x70, float:1.57E-43)
            r22 = r10
            r10 = 16
            if (r1 == r10) goto L_0x0199
            r10 = 48
            if (r1 == r10) goto L_0x018a
            r10 = 80
            if (r1 == r10) goto L_0x0174
            r1 = r4
            r10 = -1
            goto L_0x01a5
        L_0x0174:
            int r1 = r7 - r21
            int r10 = r14.bottomMargin
            int r1 = r1 - r10
            r10 = -1
            if (r9 == r10) goto L_0x01a5
            int r23 = r2.getMeasuredHeight()
            int r23 = r23 - r9
            r9 = 2
            r24 = r13[r9]
            int r24 = r24 - r23
            int r1 = r1 - r24
            goto L_0x01a5
        L_0x018a:
            r10 = -1
            int r1 = r14.topMargin
            int r1 = r1 + r4
            if (r9 == r10) goto L_0x01a5
            r20 = 1
            r23 = r12[r20]
            int r23 = r23 - r9
            int r1 = r23 + r1
            goto L_0x01a5
        L_0x0199:
            r10 = -1
            int r1 = r5 - r21
            r9 = 2
            int r1 = r1 / r9
            int r1 = r1 + r4
            int r9 = r14.topMargin
            int r1 = r1 + r9
            int r9 = r14.bottomMargin
            int r1 = r1 - r9
        L_0x01a5:
            boolean r8 = r0.k(r8)
            if (r8 == 0) goto L_0x01af
            int r8 = r0.f1049t
            int r18 = r18 + r8
        L_0x01af:
            int r8 = r14.leftMargin
            int r18 = r18 + r8
            int r8 = r18 + 0
            int r9 = r3 + r8
            int r10 = r21 + r1
            r2.layout(r8, r1, r9, r10)
            int r1 = r14.rightMargin
            int r3 = r3 + r1
            r1 = 0
            int r3 = r3 + r1
            int r18 = r3 + r18
            int r6 = r6 + 0
            goto L_0x012c
        L_0x01c7:
            int r6 = r6 + r2
            r1 = r28
            r9 = r30
            r10 = r22
            r2 = 80
            r3 = 16
            r8 = 1
            goto L_0x0117
        L_0x01d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:142:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x049a  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04c7  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x04e2  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x04f6  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0505  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0509  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0525  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x054c  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0559  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x055b  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0563  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x056e  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0605  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x06c4  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x06e1  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x07d1  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x07f5  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x0835  */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x083e  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x0897  */
    /* JADX WARNING: Removed duplicated region for block: B:428:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r39, int r40) {
        /*
            r38 = this;
            r6 = r38
            r7 = r39
            r8 = r40
            int r0 = r6.f1041d
            r10 = -2
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 8
            r13 = 0
            r15 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            r4 = 0
            if (r0 != r5) goto L_0x0396
            r6.f1043f = r4
            int r3 = r38.getVirtualChildCount()
            int r2 = android.view.View.MeasureSpec.getMode(r39)
            int r1 = android.view.View.MeasureSpec.getMode(r40)
            int r0 = r6.f1039b
            boolean r9 = r6.f1045h
            r14 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 1
            r24 = 0
            r25 = 0
        L_0x0039:
            if (r14 >= r3) goto L_0x017c
            android.view.View r26 = r6.getChildAt(r14)
            if (r26 != 0) goto L_0x0047
            int r5 = r6.f1043f
            int r5 = r5 + r4
            r6.f1043f = r5
            goto L_0x004f
        L_0x0047:
            int r5 = r26.getVisibility()
            if (r5 != r12) goto L_0x005b
            int r14 = r14 + 0
        L_0x004f:
            r10 = r0
            r29 = r1
            r0 = r2
            r31 = r3
            r4 = r17
            r27 = 1
            goto L_0x0166
        L_0x005b:
            boolean r5 = r6.k(r14)
            if (r5 == 0) goto L_0x0068
            int r5 = r6.f1043f
            int r4 = r6.f1050u
            int r5 = r5 + r4
            r6.f1043f = r5
        L_0x0068:
            android.view.ViewGroup$LayoutParams r4 = r26.getLayoutParams()
            r5 = r4
            androidx.appcompat.widget.o0$a r5 = (androidx.appcompat.widget.o0.a) r5
            float r4 = r5.weight
            float r21 = r21 + r4
            if (r1 != r15) goto L_0x0097
            int r12 = r5.height
            if (r12 != 0) goto L_0x0097
            int r12 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x0097
            int r4 = r6.f1043f
            int r12 = r5.topMargin
            int r12 = r12 + r4
            int r15 = r5.bottomMargin
            int r12 = r12 + r15
            int r4 = java.lang.Math.max(r4, r12)
            r6.f1043f = r4
            r10 = r0
            r29 = r1
            r30 = r2
            r31 = r3
            r13 = r5
            r5 = 1
            r27 = 1
            goto L_0x00ee
        L_0x0097:
            int r12 = r5.height
            if (r12 != 0) goto L_0x00a3
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x00a3
            r5.height = r10
            r12 = 0
            goto L_0x00a5
        L_0x00a3:
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00a5:
            r4 = 0
            int r15 = (r21 > r13 ? 1 : (r21 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x00ae
            int r15 = r6.f1043f
            r10 = r0
            goto L_0x00b0
        L_0x00ae:
            r10 = r0
            r15 = 0
        L_0x00b0:
            r0 = r38
            r29 = r1
            r1 = r26
            r30 = r2
            r2 = r39
            r31 = r3
            r3 = r4
            r13 = 0
            r4 = r40
            r13 = r5
            r27 = 1
            r5 = r15
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            if (r12 == r11) goto L_0x00cb
            r13.height = r12
        L_0x00cb:
            int r0 = r26.getMeasuredHeight()
            int r1 = r6.f1043f
            int r2 = r1 + r0
            int r3 = r13.topMargin
            int r2 = r2 + r3
            int r3 = r13.bottomMargin
            int r2 = r2 + r3
            r3 = 0
            int r2 = r2 + r3
            int r1 = java.lang.Math.max(r1, r2)
            r6.f1043f = r1
            if (r9 == 0) goto L_0x00ea
            r4 = r18
            int r18 = java.lang.Math.max(r0, r4)
            goto L_0x00ec
        L_0x00ea:
            r4 = r18
        L_0x00ec:
            r5 = r22
        L_0x00ee:
            if (r10 < 0) goto L_0x00f8
            int r0 = r14 + 1
            if (r10 != r0) goto L_0x00f8
            int r0 = r6.f1043f
            r6.f1040c = r0
        L_0x00f8:
            if (r14 >= r10) goto L_0x010a
            float r0 = r13.weight
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0102
            goto L_0x010a
        L_0x0102:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x010a:
            r0 = r30
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x0119
            int r1 = r13.width
            r2 = -1
            if (r1 != r2) goto L_0x0119
            r1 = 1
            r24 = 1
            goto L_0x011a
        L_0x0119:
            r1 = 0
        L_0x011a:
            int r2 = r13.leftMargin
            int r3 = r13.rightMargin
            int r2 = r2 + r3
            int r3 = r26.getMeasuredWidth()
            int r3 = r3 + r2
            r12 = r17
            int r4 = java.lang.Math.max(r12, r3)
            int r12 = r26.getMeasuredState()
            r15 = r25
            int r12 = android.view.View.combineMeasuredStates(r15, r12)
            if (r23 == 0) goto L_0x013d
            int r15 = r13.width
            r11 = -1
            if (r15 != r11) goto L_0x013d
            r11 = 1
            goto L_0x013e
        L_0x013d:
            r11 = 0
        L_0x013e:
            float r13 = r13.weight
            r15 = 0
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 <= 0) goto L_0x0150
            if (r1 == 0) goto L_0x0148
            goto L_0x0149
        L_0x0148:
            r2 = r3
        L_0x0149:
            r13 = r20
            int r20 = java.lang.Math.max(r13, r2)
            goto L_0x015e
        L_0x0150:
            r13 = r20
            if (r1 == 0) goto L_0x0155
            goto L_0x0156
        L_0x0155:
            r2 = r3
        L_0x0156:
            r1 = r19
            int r19 = java.lang.Math.max(r1, r2)
            r20 = r13
        L_0x015e:
            int r14 = r14 + 0
            r22 = r5
            r23 = r11
            r25 = r12
        L_0x0166:
            int r14 = r14 + 1
            r2 = r0
            r17 = r4
            r0 = r10
            r1 = r29
            r3 = r31
            r4 = 0
            r5 = 1
            r10 = -2
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 8
            r13 = 0
            r15 = 1073741824(0x40000000, float:2.0)
            goto L_0x0039
        L_0x017c:
            r29 = r1
            r0 = r2
            r31 = r3
            r12 = r17
            r4 = r18
            r1 = r19
            r13 = r20
            r15 = r25
            r27 = 1
            int r2 = r6.f1043f
            r10 = r31
            if (r2 <= 0) goto L_0x01a0
            boolean r2 = r6.k(r10)
            if (r2 == 0) goto L_0x01a0
            int r2 = r6.f1043f
            int r3 = r6.f1050u
            int r2 = r2 + r3
            r6.f1043f = r2
        L_0x01a0:
            r2 = r29
            if (r9 == 0) goto L_0x01e6
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r3) goto L_0x01aa
            if (r2 != 0) goto L_0x01e6
        L_0x01aa:
            r3 = 0
            r6.f1043f = r3
            r5 = 0
        L_0x01ae:
            if (r5 >= r10) goto L_0x01e6
            android.view.View r11 = r6.getChildAt(r5)
            if (r11 != 0) goto L_0x01bc
            int r11 = r6.f1043f
            int r11 = r11 + r3
            r6.f1043f = r11
            goto L_0x01e2
        L_0x01bc:
            int r3 = r11.getVisibility()
            r14 = 8
            if (r3 != r14) goto L_0x01c7
            int r5 = r5 + 0
            goto L_0x01e2
        L_0x01c7:
            android.view.ViewGroup$LayoutParams r3 = r11.getLayoutParams()
            androidx.appcompat.widget.o0$a r3 = (androidx.appcompat.widget.o0.a) r3
            int r11 = r6.f1043f
            int r18 = r11 + r4
            int r14 = r3.topMargin
            int r18 = r18 + r14
            int r3 = r3.bottomMargin
            int r18 = r18 + r3
            r3 = 0
            int r14 = r18 + 0
            int r3 = java.lang.Math.max(r11, r14)
            r6.f1043f = r3
        L_0x01e2:
            int r5 = r5 + 1
            r3 = 0
            goto L_0x01ae
        L_0x01e6:
            int r3 = r6.f1043f
            int r5 = r38.getPaddingTop()
            int r11 = r38.getPaddingBottom()
            int r11 = r11 + r5
            int r11 = r11 + r3
            r6.f1043f = r11
            int r3 = r38.getSuggestedMinimumHeight()
            int r3 = java.lang.Math.max(r11, r3)
            r5 = 0
            int r3 = android.view.View.resolveSizeAndState(r3, r8, r5)
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r3
            int r11 = r6.f1043f
            int r5 = r5 - r11
            if (r22 != 0) goto L_0x0253
            if (r5 == 0) goto L_0x0212
            r11 = 0
            int r14 = (r21 > r11 ? 1 : (r21 == r11 ? 0 : -1))
            if (r14 <= 0) goto L_0x0212
            goto L_0x0253
        L_0x0212:
            int r1 = java.lang.Math.max(r1, r13)
            if (r9 == 0) goto L_0x024f
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 == r5) goto L_0x024f
            r2 = 0
        L_0x021d:
            if (r2 >= r10) goto L_0x024f
            android.view.View r5 = r6.getChildAt(r2)
            if (r5 == 0) goto L_0x024c
            int r9 = r5.getVisibility()
            r11 = 8
            if (r9 != r11) goto L_0x022e
            goto L_0x024c
        L_0x022e:
            android.view.ViewGroup$LayoutParams r9 = r5.getLayoutParams()
            androidx.appcompat.widget.o0$a r9 = (androidx.appcompat.widget.o0.a) r9
            float r9 = r9.weight
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 <= 0) goto L_0x024c
            int r9 = r5.getMeasuredWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r11)
            r5.measure(r9, r13)
        L_0x024c:
            int r2 = r2 + 1
            goto L_0x021d
        L_0x024f:
            r17 = r12
            goto L_0x0336
        L_0x0253:
            float r4 = r6.f1044g
            r9 = 0
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x025c
            r21 = r4
        L_0x025c:
            r4 = 0
            r6.f1043f = r4
            r4 = 0
        L_0x0260:
            if (r4 >= r10) goto L_0x0326
            android.view.View r9 = r6.getChildAt(r4)
            int r11 = r9.getVisibility()
            r13 = 8
            if (r11 != r13) goto L_0x0272
            r29 = r2
            goto L_0x0320
        L_0x0272:
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            androidx.appcompat.widget.o0$a r11 = (androidx.appcompat.widget.o0.a) r11
            float r13 = r11.weight
            r14 = 0
            int r16 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x02d5
            float r14 = (float) r5
            float r14 = r14 * r13
            float r14 = r14 / r21
            int r14 = (int) r14
            float r21 = r21 - r13
            int r5 = r5 - r14
            int r13 = r38.getPaddingLeft()
            int r16 = r38.getPaddingRight()
            int r16 = r16 + r13
            int r13 = r11.leftMargin
            int r16 = r16 + r13
            int r13 = r11.rightMargin
            int r13 = r16 + r13
            r16 = r5
            int r5 = r11.width
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r7, r13, r5)
            int r13 = r11.height
            if (r13 != 0) goto L_0x02b7
            r13 = 1073741824(0x40000000, float:2.0)
            if (r2 == r13) goto L_0x02ab
            goto L_0x02b9
        L_0x02ab:
            if (r14 <= 0) goto L_0x02ae
            goto L_0x02af
        L_0x02ae:
            r14 = 0
        L_0x02af:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r9.measure(r5, r14)
            goto L_0x02c9
        L_0x02b7:
            r13 = 1073741824(0x40000000, float:2.0)
        L_0x02b9:
            int r17 = r9.getMeasuredHeight()
            int r14 = r17 + r14
            if (r14 >= 0) goto L_0x02c2
            r14 = 0
        L_0x02c2:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r9.measure(r5, r14)
        L_0x02c9:
            int r5 = r9.getMeasuredState()
            r5 = r5 & -256(0xffffffffffffff00, float:NaN)
            int r15 = android.view.View.combineMeasuredStates(r15, r5)
            r5 = r16
        L_0x02d5:
            int r13 = r11.leftMargin
            int r14 = r11.rightMargin
            int r13 = r13 + r14
            int r14 = r9.getMeasuredWidth()
            int r14 = r14 + r13
            int r12 = java.lang.Math.max(r12, r14)
            r29 = r2
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r2) goto L_0x02f2
            int r2 = r11.width
            r16 = r5
            r5 = -1
            if (r2 != r5) goto L_0x02f5
            r2 = 1
            goto L_0x02f6
        L_0x02f2:
            r16 = r5
            r5 = -1
        L_0x02f5:
            r2 = 0
        L_0x02f6:
            if (r2 == 0) goto L_0x02f9
            goto L_0x02fa
        L_0x02f9:
            r13 = r14
        L_0x02fa:
            int r1 = java.lang.Math.max(r1, r13)
            if (r23 == 0) goto L_0x0306
            int r2 = r11.width
            if (r2 != r5) goto L_0x0306
            r5 = 1
            goto L_0x0307
        L_0x0306:
            r5 = 0
        L_0x0307:
            int r2 = r6.f1043f
            int r9 = r9.getMeasuredHeight()
            int r9 = r9 + r2
            int r13 = r11.topMargin
            int r9 = r9 + r13
            int r11 = r11.bottomMargin
            int r9 = r9 + r11
            r11 = 0
            int r9 = r9 + r11
            int r2 = java.lang.Math.max(r2, r9)
            r6.f1043f = r2
            r23 = r5
            r5 = r16
        L_0x0320:
            int r4 = r4 + 1
            r2 = r29
            goto L_0x0260
        L_0x0326:
            int r2 = r6.f1043f
            int r4 = r38.getPaddingTop()
            int r5 = r38.getPaddingBottom()
            int r5 = r5 + r4
            int r5 = r5 + r2
            r6.f1043f = r5
            goto L_0x024f
        L_0x0336:
            if (r23 != 0) goto L_0x033d
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r2) goto L_0x033d
            goto L_0x033f
        L_0x033d:
            r1 = r17
        L_0x033f:
            int r0 = r38.getPaddingLeft()
            int r2 = r38.getPaddingRight()
            int r2 = r2 + r0
            int r2 = r2 + r1
            int r0 = r38.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r2, r0)
            int r0 = android.view.View.resolveSizeAndState(r0, r7, r15)
            r6.setMeasuredDimension(r0, r3)
            if (r24 == 0) goto L_0x08d7
            int r0 = r38.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r9 = 0
        L_0x0365:
            if (r9 >= r10) goto L_0x08d7
            android.view.View r1 = r6.getChildAt(r9)
            int r0 = r1.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x0393
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            androidx.appcompat.widget.o0$a r11 = (androidx.appcompat.widget.o0.a) r11
            int r0 = r11.width
            r2 = -1
            if (r0 != r2) goto L_0x0393
            int r12 = r11.height
            int r0 = r1.getMeasuredHeight()
            r11.height = r0
            r3 = 0
            r5 = 0
            r0 = r38
            r2 = r7
            r4 = r40
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.height = r12
        L_0x0393:
            int r9 = r9 + 1
            goto L_0x0365
        L_0x0396:
            r27 = 1
            r0 = 0
            r6.f1043f = r0
            int r9 = r38.getVirtualChildCount()
            int r10 = android.view.View.MeasureSpec.getMode(r39)
            int r11 = android.view.View.MeasureSpec.getMode(r40)
            int[] r0 = r6.f1046i
            r12 = 4
            if (r0 == 0) goto L_0x03b0
            int[] r0 = r6.f1047r
            if (r0 != 0) goto L_0x03b8
        L_0x03b0:
            int[] r0 = new int[r12]
            r6.f1046i = r0
            int[] r0 = new int[r12]
            r6.f1047r = r0
        L_0x03b8:
            int[] r13 = r6.f1046i
            int[] r14 = r6.f1047r
            r15 = 3
            r0 = -1
            r13[r15] = r0
            r18 = 2
            r13[r18] = r0
            r13[r27] = r0
            r1 = 0
            r13[r1] = r0
            r14[r15] = r0
            r14[r18] = r0
            r14[r27] = r0
            r14[r1] = r0
            boolean r5 = r6.f1038a
            boolean r4 = r6.f1045h
            r0 = 1073741824(0x40000000, float:2.0)
            if (r10 != r0) goto L_0x03dc
            r19 = 1
            goto L_0x03de
        L_0x03dc:
            r19 = 0
        L_0x03de:
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r8 = 0
            r12 = 0
            r15 = 0
            r22 = 0
            r23 = 1
            r24 = 0
        L_0x03eb:
            if (r3 >= r9) goto L_0x0593
            android.view.View r7 = r6.getChildAt(r3)
            if (r7 != 0) goto L_0x0400
            int r7 = r6.f1043f
            r25 = 0
            int r7 = r7 + 0
            r6.f1043f = r7
            r25 = r0
            r26 = r2
            goto L_0x040e
        L_0x0400:
            r25 = r0
            int r0 = r7.getVisibility()
            r26 = r2
            r2 = 8
            if (r0 != r2) goto L_0x0418
            int r3 = r3 + 0
        L_0x040e:
            r30 = r5
            r0 = r25
            r2 = r26
            r26 = r4
            goto L_0x0589
        L_0x0418:
            boolean r0 = r6.k(r3)
            if (r0 == 0) goto L_0x0425
            int r0 = r6.f1043f
            int r2 = r6.f1049t
            int r0 = r0 + r2
            r6.f1043f = r0
        L_0x0425:
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            r2 = r0
            androidx.appcompat.widget.o0$a r2 = (androidx.appcompat.widget.o0.a) r2
            float r0 = r2.weight
            float r29 = r1 + r0
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 != r1) goto L_0x0483
            int r1 = r2.width
            if (r1 != 0) goto L_0x0483
            r1 = 0
            int r30 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r30 <= 0) goto L_0x0483
            if (r19 == 0) goto L_0x044c
            int r0 = r6.f1043f
            int r1 = r2.leftMargin
            r30 = r3
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r1 = r1 + r0
            r6.f1043f = r1
            goto L_0x045c
        L_0x044c:
            r30 = r3
            int r0 = r6.f1043f
            int r1 = r2.leftMargin
            int r1 = r1 + r0
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r0 = java.lang.Math.max(r0, r1)
            r6.f1043f = r0
        L_0x045c:
            if (r5 == 0) goto L_0x0473
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r7.measure(r1, r1)
            r1 = r2
            r33 = r25
            r34 = r26
            r25 = r30
            r26 = r4
            r30 = r5
            goto L_0x04fa
        L_0x0473:
            r1 = r2
            r33 = r25
            r34 = r26
            r25 = r30
            r0 = 1073741824(0x40000000, float:2.0)
            r26 = r4
            r30 = r5
            r5 = 1
            goto L_0x04fe
        L_0x0483:
            r30 = r3
            int r1 = r2.width
            if (r1 != 0) goto L_0x0493
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0494
            r0 = -2
            r2.width = r0
            r3 = 0
            goto L_0x0496
        L_0x0493:
            r1 = 0
        L_0x0494:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0496:
            int r0 = (r29 > r1 ? 1 : (r29 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x049f
            int r0 = r6.f1043f
            r31 = r0
            goto L_0x04a1
        L_0x049f:
            r31 = 0
        L_0x04a1:
            r32 = 0
            r1 = r25
            r0 = r38
            r33 = r1
            r1 = r7
            r35 = r2
            r34 = r26
            r2 = r39
            r36 = r3
            r25 = r30
            r3 = r31
            r26 = r4
            r4 = r40
            r30 = r5
            r5 = r32
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r0 = r36
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x04cc
            r1 = r35
            r1.width = r0
            goto L_0x04ce
        L_0x04cc:
            r1 = r35
        L_0x04ce:
            int r0 = r7.getMeasuredWidth()
            if (r19 == 0) goto L_0x04e2
            int r2 = r6.f1043f
            int r3 = r1.leftMargin
            int r3 = r3 + r0
            int r4 = r1.rightMargin
            int r3 = r3 + r4
            r4 = 0
            int r3 = r3 + r4
            int r3 = r3 + r2
            r6.f1043f = r3
            goto L_0x04f4
        L_0x04e2:
            r4 = 0
            int r2 = r6.f1043f
            int r3 = r2 + r0
            int r5 = r1.leftMargin
            int r3 = r3 + r5
            int r5 = r1.rightMargin
            int r3 = r3 + r5
            int r3 = r3 + r4
            int r2 = java.lang.Math.max(r2, r3)
            r6.f1043f = r2
        L_0x04f4:
            if (r26 == 0) goto L_0x04fa
            int r8 = java.lang.Math.max(r0, r8)
        L_0x04fa:
            r5 = r22
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x04fe:
            if (r11 == r0) goto L_0x0509
            int r0 = r1.height
            r2 = -1
            if (r0 != r2) goto L_0x0509
            r0 = 1
            r24 = 1
            goto L_0x050a
        L_0x0509:
            r0 = 0
        L_0x050a:
            int r2 = r1.topMargin
            int r3 = r1.bottomMargin
            int r2 = r2 + r3
            int r3 = r7.getMeasuredHeight()
            int r3 = r3 + r2
            int r4 = r7.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r12, r4)
            if (r30 == 0) goto L_0x054c
            int r7 = r7.getBaseline()
            r12 = -1
            if (r7 == r12) goto L_0x054c
            int r12 = r1.gravity
            if (r12 >= 0) goto L_0x052b
            int r12 = r6.f1042e
        L_0x052b:
            r12 = r12 & 112(0x70, float:1.57E-43)
            r21 = 4
            int r12 = r12 >> 4
            r22 = -2
            r12 = r12 & -2
            int r12 = r12 >> 1
            r22 = r2
            r2 = r13[r12]
            int r2 = java.lang.Math.max(r2, r7)
            r13[r12] = r2
            r2 = r14[r12]
            int r7 = r3 - r7
            int r2 = java.lang.Math.max(r2, r7)
            r14[r12] = r2
            goto L_0x054e
        L_0x054c:
            r22 = r2
        L_0x054e:
            int r2 = java.lang.Math.max(r15, r3)
            if (r23 == 0) goto L_0x055b
            int r7 = r1.height
            r12 = -1
            if (r7 != r12) goto L_0x055b
            r7 = 1
            goto L_0x055c
        L_0x055b:
            r7 = 0
        L_0x055c:
            float r1 = r1.weight
            r12 = 0
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 <= 0) goto L_0x056e
            if (r0 == 0) goto L_0x0567
            r3 = r22
        L_0x0567:
            r1 = r33
            int r0 = java.lang.Math.max(r1, r3)
            goto L_0x057d
        L_0x056e:
            r1 = r33
            if (r0 == 0) goto L_0x0574
            r3 = r22
        L_0x0574:
            r0 = r34
            int r0 = java.lang.Math.max(r0, r3)
            r34 = r0
            r0 = r1
        L_0x057d:
            int r3 = r25 + 0
            r15 = r2
            r12 = r4
            r22 = r5
            r23 = r7
            r1 = r29
            r2 = r34
        L_0x0589:
            int r3 = r3 + 1
            r7 = r39
            r4 = r26
            r5 = r30
            goto L_0x03eb
        L_0x0593:
            r26 = r4
            r30 = r5
            r37 = r2
            r2 = r0
            r0 = r37
            int r3 = r6.f1043f
            if (r3 <= 0) goto L_0x05ad
            boolean r3 = r6.k(r9)
            if (r3 == 0) goto L_0x05ad
            int r3 = r6.f1043f
            int r4 = r6.f1049t
            int r3 = r3 + r4
            r6.f1043f = r3
        L_0x05ad:
            r3 = r13[r27]
            r4 = -1
            if (r3 != r4) goto L_0x05c4
            r3 = 0
            r5 = r13[r3]
            if (r5 != r4) goto L_0x05c4
            r3 = r13[r18]
            if (r3 != r4) goto L_0x05c4
            r3 = 3
            r5 = r13[r3]
            if (r5 == r4) goto L_0x05c1
            goto L_0x05c5
        L_0x05c1:
            r25 = r12
            goto L_0x05f7
        L_0x05c4:
            r3 = 3
        L_0x05c5:
            r4 = r13[r3]
            r5 = 0
            r7 = r13[r5]
            r5 = r13[r27]
            r3 = r13[r18]
            int r3 = java.lang.Math.max(r5, r3)
            int r3 = java.lang.Math.max(r7, r3)
            int r3 = java.lang.Math.max(r4, r3)
            r4 = 3
            r5 = r14[r4]
            r4 = 0
            r7 = r14[r4]
            r4 = r14[r27]
            r25 = r12
            r12 = r14[r18]
            int r4 = java.lang.Math.max(r4, r12)
            int r4 = java.lang.Math.max(r7, r4)
            int r4 = java.lang.Math.max(r5, r4)
            int r4 = r4 + r3
            int r15 = java.lang.Math.max(r15, r4)
        L_0x05f7:
            if (r26 == 0) goto L_0x0649
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r3) goto L_0x05ff
            if (r10 != 0) goto L_0x0649
        L_0x05ff:
            r3 = 0
            r6.f1043f = r3
            r4 = 0
        L_0x0603:
            if (r4 >= r9) goto L_0x0649
            android.view.View r5 = r6.getChildAt(r4)
            if (r5 != 0) goto L_0x0611
            int r5 = r6.f1043f
            int r5 = r5 + r3
            r6.f1043f = r5
            goto L_0x0645
        L_0x0611:
            int r3 = r5.getVisibility()
            r7 = 8
            if (r3 != r7) goto L_0x061c
            int r4 = r4 + 0
            goto L_0x0645
        L_0x061c:
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            androidx.appcompat.widget.o0$a r3 = (androidx.appcompat.widget.o0.a) r3
            if (r19 == 0) goto L_0x0632
            int r5 = r6.f1043f
            int r7 = r3.leftMargin
            int r7 = r7 + r8
            int r3 = r3.rightMargin
            int r7 = r7 + r3
            r12 = 0
            int r7 = r7 + r12
            int r7 = r7 + r5
            r6.f1043f = r7
            goto L_0x0645
        L_0x0632:
            r12 = 0
            int r5 = r6.f1043f
            int r7 = r5 + r8
            int r12 = r3.leftMargin
            int r7 = r7 + r12
            int r3 = r3.rightMargin
            int r7 = r7 + r3
            r3 = 0
            int r7 = r7 + r3
            int r3 = java.lang.Math.max(r5, r7)
            r6.f1043f = r3
        L_0x0645:
            int r4 = r4 + 1
            r3 = 0
            goto L_0x0603
        L_0x0649:
            int r3 = r6.f1043f
            int r4 = r38.getPaddingLeft()
            int r5 = r38.getPaddingRight()
            int r5 = r5 + r4
            int r5 = r5 + r3
            r6.f1043f = r5
            int r3 = r38.getSuggestedMinimumWidth()
            int r3 = java.lang.Math.max(r5, r3)
            r7 = r39
            r4 = 0
            int r3 = android.view.View.resolveSizeAndState(r3, r7, r4)
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r3
            int r5 = r6.f1043f
            int r4 = r4 - r5
            if (r22 != 0) goto L_0x06bd
            if (r4 == 0) goto L_0x0677
            r12 = 0
            int r16 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r16 <= 0) goto L_0x0677
            goto L_0x06bd
        L_0x0677:
            int r0 = java.lang.Math.max(r0, r2)
            if (r26 == 0) goto L_0x06b4
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 == r1) goto L_0x06b4
            r4 = 0
        L_0x0682:
            if (r4 >= r9) goto L_0x06b4
            android.view.View r1 = r6.getChildAt(r4)
            if (r1 == 0) goto L_0x06b1
            int r2 = r1.getVisibility()
            r10 = 8
            if (r2 != r10) goto L_0x0693
            goto L_0x06b1
        L_0x0693:
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.appcompat.widget.o0$a r2 = (androidx.appcompat.widget.o0.a) r2
            float r2 = r2.weight
            r10 = 0
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x06b1
            r2 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r2)
            int r12 = r1.getMeasuredHeight()
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r2)
            r1.measure(r10, r12)
        L_0x06b1:
            int r4 = r4 + 1
            goto L_0x0682
        L_0x06b4:
            r8 = r40
            r22 = r9
            r12 = r25
        L_0x06ba:
            r5 = 0
            goto L_0x086e
        L_0x06bd:
            float r2 = r6.f1044g
            r8 = 0
            int r12 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r12 <= 0) goto L_0x06c5
            r1 = r2
        L_0x06c5:
            r2 = 3
            r8 = -1
            r13[r2] = r8
            r13[r18] = r8
            r13[r27] = r8
            r12 = 0
            r13[r12] = r8
            r14[r2] = r8
            r14[r18] = r8
            r14[r27] = r8
            r14[r12] = r8
            r6.f1043f = r12
            r8 = r4
            r12 = r25
            r2 = -1
            r4 = 0
        L_0x06df:
            if (r4 >= r9) goto L_0x0815
            android.view.View r15 = r6.getChildAt(r4)
            if (r15 == 0) goto L_0x07fe
            int r5 = r15.getVisibility()
            r7 = 8
            if (r5 != r7) goto L_0x06f1
            goto L_0x07fe
        L_0x06f1:
            android.view.ViewGroup$LayoutParams r5 = r15.getLayoutParams()
            androidx.appcompat.widget.o0$a r5 = (androidx.appcompat.widget.o0.a) r5
            float r7 = r5.weight
            r17 = 0
            int r22 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r22 <= 0) goto L_0x075d
            r22 = r9
            float r9 = (float) r8
            float r9 = r9 * r7
            float r9 = r9 / r1
            int r9 = (int) r9
            float r1 = r1 - r7
            int r8 = r8 - r9
            int r7 = r38.getPaddingTop()
            int r25 = r38.getPaddingBottom()
            int r25 = r25 + r7
            int r7 = r5.topMargin
            int r25 = r25 + r7
            int r7 = r5.bottomMargin
            int r7 = r25 + r7
            r25 = r1
            int r1 = r5.height
            r26 = r8
            r8 = r40
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r8, r7, r1)
            int r7 = r5.width
            if (r7 != 0) goto L_0x073b
            r7 = 1073741824(0x40000000, float:2.0)
            if (r10 == r7) goto L_0x072f
            goto L_0x073d
        L_0x072f:
            if (r9 <= 0) goto L_0x0732
            goto L_0x0733
        L_0x0732:
            r9 = 0
        L_0x0733:
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r7)
            r15.measure(r9, r1)
            goto L_0x074d
        L_0x073b:
            r7 = 1073741824(0x40000000, float:2.0)
        L_0x073d:
            int r28 = r15.getMeasuredWidth()
            int r9 = r28 + r9
            if (r9 >= 0) goto L_0x0746
            r9 = 0
        L_0x0746:
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r7)
            r15.measure(r9, r1)
        L_0x074d:
            int r1 = r15.getMeasuredState()
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r7
            int r12 = android.view.View.combineMeasuredStates(r12, r1)
            r1 = r25
            r7 = r26
            goto L_0x0762
        L_0x075d:
            r7 = r8
            r22 = r9
            r8 = r40
        L_0x0762:
            if (r19 == 0) goto L_0x077e
            int r9 = r6.f1043f
            int r25 = r15.getMeasuredWidth()
            r26 = r1
            int r1 = r5.leftMargin
            int r25 = r25 + r1
            int r1 = r5.rightMargin
            int r25 = r25 + r1
            r1 = 0
            int r25 = r25 + 0
            int r9 = r25 + r9
            r6.f1043f = r9
            r29 = r7
            goto L_0x079c
        L_0x077e:
            r26 = r1
            r1 = 0
            int r9 = r6.f1043f
            int r25 = r15.getMeasuredWidth()
            int r25 = r25 + r9
            int r1 = r5.leftMargin
            int r25 = r25 + r1
            int r1 = r5.rightMargin
            int r25 = r25 + r1
            r29 = r7
            r1 = 0
            int r7 = r25 + 0
            int r1 = java.lang.Math.max(r9, r7)
            r6.f1043f = r1
        L_0x079c:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r11 == r1) goto L_0x07a7
            int r1 = r5.height
            r7 = -1
            if (r1 != r7) goto L_0x07a7
            r1 = 1
            goto L_0x07a8
        L_0x07a7:
            r1 = 0
        L_0x07a8:
            int r7 = r5.topMargin
            int r9 = r5.bottomMargin
            int r7 = r7 + r9
            int r9 = r15.getMeasuredHeight()
            int r9 = r9 + r7
            int r2 = java.lang.Math.max(r2, r9)
            if (r1 == 0) goto L_0x07b9
            goto L_0x07ba
        L_0x07b9:
            r7 = r9
        L_0x07ba:
            int r0 = java.lang.Math.max(r0, r7)
            if (r23 == 0) goto L_0x07c7
            int r1 = r5.height
            r7 = -1
            if (r1 != r7) goto L_0x07c8
            r1 = 1
            goto L_0x07c9
        L_0x07c7:
            r7 = -1
        L_0x07c8:
            r1 = 0
        L_0x07c9:
            if (r30 == 0) goto L_0x07f5
            int r15 = r15.getBaseline()
            if (r15 == r7) goto L_0x07f5
            int r5 = r5.gravity
            if (r5 >= 0) goto L_0x07d7
            int r5 = r6.f1042e
        L_0x07d7:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r21 = 4
            int r5 = r5 >> 4
            r25 = -2
            r5 = r5 & -2
            int r5 = r5 >> 1
            r7 = r13[r5]
            int r7 = java.lang.Math.max(r7, r15)
            r13[r5] = r7
            r7 = r14[r5]
            int r9 = r9 - r15
            int r7 = java.lang.Math.max(r7, r9)
            r14[r5] = r7
            goto L_0x07f9
        L_0x07f5:
            r21 = 4
            r25 = -2
        L_0x07f9:
            r23 = r1
            r1 = r26
            goto L_0x080b
        L_0x07fe:
            r7 = r8
            r22 = r9
            r17 = 0
            r21 = 4
            r25 = -2
            r8 = r40
            r29 = r7
        L_0x080b:
            int r4 = r4 + 1
            r7 = r39
            r9 = r22
            r8 = r29
            goto L_0x06df
        L_0x0815:
            r8 = r40
            r22 = r9
            int r1 = r6.f1043f
            int r4 = r38.getPaddingLeft()
            int r5 = r38.getPaddingRight()
            int r5 = r5 + r4
            int r5 = r5 + r1
            r6.f1043f = r5
            r1 = r13[r27]
            r4 = -1
            if (r1 != r4) goto L_0x083e
            r1 = 0
            r5 = r13[r1]
            if (r5 != r4) goto L_0x083e
            r1 = r13[r18]
            if (r1 != r4) goto L_0x083e
            r1 = 3
            r5 = r13[r1]
            if (r5 == r4) goto L_0x083b
            goto L_0x083f
        L_0x083b:
            r15 = r2
            goto L_0x06ba
        L_0x083e:
            r1 = 3
        L_0x083f:
            r4 = r13[r1]
            r5 = 0
            r7 = r13[r5]
            r9 = r13[r27]
            r10 = r13[r18]
            int r9 = java.lang.Math.max(r9, r10)
            int r7 = java.lang.Math.max(r7, r9)
            int r4 = java.lang.Math.max(r4, r7)
            r1 = r14[r1]
            r7 = r14[r5]
            r9 = r14[r27]
            r10 = r14[r18]
            int r9 = java.lang.Math.max(r9, r10)
            int r7 = java.lang.Math.max(r7, r9)
            int r1 = java.lang.Math.max(r1, r7)
            int r1 = r1 + r4
            int r1 = java.lang.Math.max(r2, r1)
            r15 = r1
        L_0x086e:
            if (r23 != 0) goto L_0x0875
            r1 = 1073741824(0x40000000, float:2.0)
            if (r11 == r1) goto L_0x0875
            goto L_0x0876
        L_0x0875:
            r0 = r15
        L_0x0876:
            int r1 = r38.getPaddingTop()
            int r2 = r38.getPaddingBottom()
            int r2 = r2 + r1
            int r2 = r2 + r0
            int r0 = r38.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r2, r0)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r12
            r1 = r1 | r3
            int r2 = r12 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r8, r2)
            r6.setMeasuredDimension(r1, r0)
            if (r24 == 0) goto L_0x08d7
            int r0 = r38.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r9 = r22
            r8 = 0
        L_0x08a4:
            if (r8 >= r9) goto L_0x08d7
            android.view.View r1 = r6.getChildAt(r8)
            int r0 = r1.getVisibility()
            r10 = 8
            if (r0 == r10) goto L_0x08d3
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            androidx.appcompat.widget.o0$a r11 = (androidx.appcompat.widget.o0.a) r11
            int r0 = r11.height
            r12 = -1
            if (r0 != r12) goto L_0x08d4
            int r13 = r11.width
            int r0 = r1.getMeasuredWidth()
            r11.width = r0
            r3 = 0
            r5 = 0
            r0 = r38
            r2 = r39
            r4 = r7
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.width = r13
            goto L_0x08d4
        L_0x08d3:
            r12 = -1
        L_0x08d4:
            int r8 = r8 + 1
            goto L_0x08a4
        L_0x08d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z10) {
        this.f1038a = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 < 0 || i10 >= getChildCount()) {
            StringBuilder a10 = android.support.v4.media.a.a("base aligned child index out of range (0, ");
            a10.append(getChildCount());
            a10.append(")");
            throw new IllegalArgumentException(a10.toString());
        }
        this.f1039b = i10;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f1048s) {
            this.f1048s = drawable;
            boolean z10 = false;
            if (drawable != null) {
                this.f1049t = drawable.getIntrinsicWidth();
                this.f1050u = drawable.getIntrinsicHeight();
            } else {
                this.f1049t = 0;
                this.f1050u = 0;
            }
            if (drawable == null) {
                z10 = true;
            }
            setWillNotDraw(z10);
            requestLayout();
        }
    }

    public void setDividerPadding(int i10) {
        this.f1052w = i10;
    }

    public void setGravity(int i10) {
        if (this.f1042e != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f1042e = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f1042e;
        if ((8388615 & i12) != i11) {
            this.f1042e = i11 | (-8388616 & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f1045h = z10;
    }

    public void setOrientation(int i10) {
        if (this.f1041d != i10) {
            this.f1041d = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f1051v) {
            requestLayout();
        }
        this.f1051v = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f1042e;
        if ((i12 & 112) != i11) {
            this.f1042e = i11 | (i12 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f1044g = Math.max(0.0f, f10);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public o0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public o0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Drawable drawable;
        int resourceId;
        this.f1038a = true;
        this.f1039b = -1;
        this.f1040c = 0;
        this.f1042e = 8388659;
        int[] iArr = l.f13515o;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        c0.B(this, context, iArr, attributeSet, obtainStyledAttributes, i10, 0);
        int i11 = obtainStyledAttributes.getInt(1, -1);
        if (i11 >= 0) {
            setOrientation(i11);
        }
        int i12 = obtainStyledAttributes.getInt(0, -1);
        if (i12 >= 0) {
            setGravity(i12);
        }
        boolean z10 = obtainStyledAttributes.getBoolean(2, true);
        if (!z10) {
            setBaselineAligned(z10);
        }
        this.f1044g = obtainStyledAttributes.getFloat(4, -1.0f);
        this.f1039b = obtainStyledAttributes.getInt(3, -1);
        this.f1045h = obtainStyledAttributes.getBoolean(7, false);
        if (!obtainStyledAttributes.hasValue(5) || (resourceId = obtainStyledAttributes.getResourceId(5, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(5);
        } else {
            drawable = g.a.b(context, resourceId);
        }
        setDividerDrawable(drawable);
        this.f1051v = obtainStyledAttributes.getInt(8, 0);
        this.f1052w = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }
}
