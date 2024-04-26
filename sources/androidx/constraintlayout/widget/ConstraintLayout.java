package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.startapp.b4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import v.d;
import v.g;
import v.h;
import w.b;
import y.c;
import y.e;
import y.f;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: z  reason: collision with root package name */
    public static f f1138z;

    /* renamed from: a  reason: collision with root package name */
    public SparseArray<View> f1139a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<a> f1140b = new ArrayList<>(4);

    /* renamed from: c  reason: collision with root package name */
    public g f1141c = new g();

    /* renamed from: d  reason: collision with root package name */
    public int f1142d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f1143e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f1144f = Integer.MAX_VALUE;

    /* renamed from: g  reason: collision with root package name */
    public int f1145g = Integer.MAX_VALUE;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1146h = true;

    /* renamed from: i  reason: collision with root package name */
    public int f1147i = 257;

    /* renamed from: r  reason: collision with root package name */
    public b f1148r = null;

    /* renamed from: s  reason: collision with root package name */
    public y.b f1149s = null;

    /* renamed from: t  reason: collision with root package name */
    public int f1150t = -1;

    /* renamed from: u  reason: collision with root package name */
    public HashMap<String, Integer> f1151u = new HashMap<>();

    /* renamed from: v  reason: collision with root package name */
    public SparseArray<v.f> f1152v = new SparseArray<>();

    /* renamed from: w  reason: collision with root package name */
    public b f1153w = new b(this);

    /* renamed from: x  reason: collision with root package name */
    public int f1154x = 0;

    /* renamed from: y  reason: collision with root package name */
    public int f1155y = 0;

    public class b implements b.C0268b {

        /* renamed from: a  reason: collision with root package name */
        public ConstraintLayout f1200a;

        /* renamed from: b  reason: collision with root package name */
        public int f1201b;

        /* renamed from: c  reason: collision with root package name */
        public int f1202c;

        /* renamed from: d  reason: collision with root package name */
        public int f1203d;

        /* renamed from: e  reason: collision with root package name */
        public int f1204e;

        /* renamed from: f  reason: collision with root package name */
        public int f1205f;

        /* renamed from: g  reason: collision with root package name */
        public int f1206g;

        public b(ConstraintLayout constraintLayout) {
            this.f1200a = constraintLayout;
        }

        public final boolean a(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 != 1073741824) {
                return false;
            }
            if ((mode == Integer.MIN_VALUE || mode == 0) && i12 == size) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:114:0x019e  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x01a0  */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x01a3  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x01b6  */
        /* JADX WARNING: Removed duplicated region for block: B:121:0x01b8  */
        /* JADX WARNING: Removed duplicated region for block: B:123:0x01bb  */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x01bd  */
        /* JADX WARNING: Removed duplicated region for block: B:138:0x01d8  */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x01da  */
        /* JADX WARNING: Removed duplicated region for block: B:143:0x01e3  */
        /* JADX WARNING: Removed duplicated region for block: B:144:0x01e5  */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x01e8 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x01e9  */
        @android.annotation.SuppressLint({"WrongCall"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(v.f r18, w.b.a r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                if (r1 != 0) goto L_0x0009
                return
            L_0x0009:
                int r3 = r1.f26264i0
                r4 = 8
                r5 = 0
                if (r3 != r4) goto L_0x001b
                boolean r3 = r1.F
                if (r3 != 0) goto L_0x001b
                r2.f26796e = r5
                r2.f26797f = r5
                r2.f26798g = r5
                return
            L_0x001b:
                v.f r3 = r1.V
                if (r3 != 0) goto L_0x0020
                return
            L_0x0020:
                int r3 = r2.f26792a
                int r4 = r2.f26793b
                int r6 = r2.f26794c
                int r7 = r2.f26795d
                int r8 = r0.f1201b
                int r9 = r0.f1202c
                int r8 = r8 + r9
                int r9 = r0.f1203d
                java.lang.Object r10 = r1.f26262h0
                android.view.View r10 = (android.view.View) r10
                int r11 = t.g.f(r3)
                r12 = 2
                r13 = 3
                r14 = -1
                r15 = 1
                if (r11 == 0) goto L_0x00b1
                if (r11 == r15) goto L_0x00a7
                if (r11 == r12) goto L_0x005d
                if (r11 == r13) goto L_0x0045
                goto L_0x00b7
            L_0x0045:
                int r6 = r0.f1205f
                v.d r11 = r1.J
                if (r11 == 0) goto L_0x004f
                int r11 = r11.f26235g
                int r11 = r11 + r5
                goto L_0x0050
            L_0x004f:
                r11 = 0
            L_0x0050:
                v.d r5 = r1.L
                if (r5 == 0) goto L_0x0057
                int r5 = r5.f26235g
                int r11 = r11 + r5
            L_0x0057:
                int r9 = r9 + r11
                int r5 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r14)
                goto L_0x00b7
            L_0x005d:
                int r5 = r0.f1205f
                r6 = -2
                int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r9, r6)
                int r6 = r1.f26281r
                if (r6 != r15) goto L_0x006a
                r6 = 1
                goto L_0x006b
            L_0x006a:
                r6 = 0
            L_0x006b:
                int r9 = r2.f26801j
                if (r9 == r15) goto L_0x0075
                if (r9 != r12) goto L_0x0072
                goto L_0x0075
            L_0x0072:
                r11 = 1073741824(0x40000000, float:2.0)
                goto L_0x00b7
            L_0x0075:
                int r9 = r10.getMeasuredHeight()
                int r11 = r18.l()
                if (r9 != r11) goto L_0x0081
                r9 = 1
                goto L_0x0082
            L_0x0081:
                r9 = 0
            L_0x0082:
                int r11 = r2.f26801j
                if (r11 == r12) goto L_0x0099
                if (r6 == 0) goto L_0x0099
                if (r6 == 0) goto L_0x008c
                if (r9 != 0) goto L_0x0099
            L_0x008c:
                boolean r6 = r10 instanceof androidx.constraintlayout.widget.d
                if (r6 != 0) goto L_0x0099
                boolean r6 = r18.D()
                if (r6 == 0) goto L_0x0097
                goto L_0x0099
            L_0x0097:
                r6 = 0
                goto L_0x009a
            L_0x0099:
                r6 = 1
            L_0x009a:
                if (r6 == 0) goto L_0x0072
                int r5 = r18.u()
                r11 = 1073741824(0x40000000, float:2.0)
                int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r11)
                goto L_0x00b7
            L_0x00a7:
                r11 = 1073741824(0x40000000, float:2.0)
                int r5 = r0.f1205f
                r6 = -2
                int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r9, r6)
                goto L_0x00b7
            L_0x00b1:
                r11 = 1073741824(0x40000000, float:2.0)
                int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r11)
            L_0x00b7:
                int r6 = t.g.f(r4)
                if (r6 == 0) goto L_0x0137
                if (r6 == r15) goto L_0x012d
                if (r6 == r12) goto L_0x00e3
                if (r6 == r13) goto L_0x00c6
                r9 = 0
                goto L_0x013e
            L_0x00c6:
                int r6 = r0.f1206g
                v.d r7 = r1.J
                if (r7 == 0) goto L_0x00d3
                v.d r7 = r1.K
                int r7 = r7.f26235g
                r9 = 0
                int r7 = r7 + r9
                goto L_0x00d4
            L_0x00d3:
                r7 = 0
            L_0x00d4:
                v.d r9 = r1.L
                if (r9 == 0) goto L_0x00dd
                v.d r9 = r1.M
                int r9 = r9.f26235g
                int r7 = r7 + r9
            L_0x00dd:
                int r8 = r8 + r7
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r8, r14)
                goto L_0x013d
            L_0x00e3:
                int r6 = r0.f1206g
                r7 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r8, r7)
                int r7 = r1.f26282s
                if (r7 != r15) goto L_0x00f0
                r7 = 1
                goto L_0x00f1
            L_0x00f0:
                r7 = 0
            L_0x00f1:
                int r8 = r2.f26801j
                if (r8 == r15) goto L_0x00fb
                if (r8 != r12) goto L_0x00f8
                goto L_0x00fb
            L_0x00f8:
                r9 = 1073741824(0x40000000, float:2.0)
                goto L_0x013d
            L_0x00fb:
                int r8 = r10.getMeasuredWidth()
                int r9 = r18.u()
                if (r8 != r9) goto L_0x0107
                r8 = 1
                goto L_0x0108
            L_0x0107:
                r8 = 0
            L_0x0108:
                int r9 = r2.f26801j
                if (r9 == r12) goto L_0x011f
                if (r7 == 0) goto L_0x011f
                if (r7 == 0) goto L_0x0112
                if (r8 != 0) goto L_0x011f
            L_0x0112:
                boolean r7 = r10 instanceof androidx.constraintlayout.widget.d
                if (r7 != 0) goto L_0x011f
                boolean r7 = r18.E()
                if (r7 == 0) goto L_0x011d
                goto L_0x011f
            L_0x011d:
                r7 = 0
                goto L_0x0120
            L_0x011f:
                r7 = 1
            L_0x0120:
                if (r7 == 0) goto L_0x00f8
                int r6 = r18.l()
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
                goto L_0x013d
            L_0x012d:
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = r0.f1206g
                r7 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r8, r7)
                goto L_0x013d
            L_0x0137:
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9)
            L_0x013d:
                r9 = r6
            L_0x013e:
                v.f r6 = r1.V
                v.g r6 = (v.g) r6
                if (r6 == 0) goto L_0x01b4
                androidx.constraintlayout.widget.ConstraintLayout r7 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r7 = r7.f1147i
                r8 = 256(0x100, float:3.59E-43)
                boolean r7 = v.k.b(r7, r8)
                if (r7 == 0) goto L_0x01b4
                int r7 = r10.getMeasuredWidth()
                int r8 = r18.u()
                if (r7 != r8) goto L_0x01b4
                int r7 = r10.getMeasuredWidth()
                int r8 = r6.u()
                if (r7 >= r8) goto L_0x01b4
                int r7 = r10.getMeasuredHeight()
                int r8 = r18.l()
                if (r7 != r8) goto L_0x01b4
                int r7 = r10.getMeasuredHeight()
                int r6 = r6.l()
                if (r7 >= r6) goto L_0x01b4
                int r6 = r10.getBaseline()
                int r7 = r1.f26252c0
                if (r6 != r7) goto L_0x01b4
                boolean r6 = r18.C()
                if (r6 != 0) goto L_0x01b4
                int r6 = r1.H
                int r7 = r18.u()
                boolean r6 = r0.a(r6, r5, r7)
                if (r6 == 0) goto L_0x01a0
                int r6 = r1.I
                int r7 = r18.l()
                boolean r6 = r0.a(r6, r9, r7)
                if (r6 == 0) goto L_0x01a0
                r6 = 1
                goto L_0x01a1
            L_0x01a0:
                r6 = 0
            L_0x01a1:
                if (r6 == 0) goto L_0x01b4
                int r3 = r18.u()
                r2.f26796e = r3
                int r3 = r18.l()
                r2.f26797f = r3
                int r1 = r1.f26252c0
                r2.f26798g = r1
                return
            L_0x01b4:
                if (r3 != r13) goto L_0x01b8
                r6 = 1
                goto L_0x01b9
            L_0x01b8:
                r6 = 0
            L_0x01b9:
                if (r4 != r13) goto L_0x01bd
                r7 = 1
                goto L_0x01be
            L_0x01bd:
                r7 = 0
            L_0x01be:
                r8 = 4
                if (r4 == r8) goto L_0x01c6
                if (r4 != r15) goto L_0x01c4
                goto L_0x01c6
            L_0x01c4:
                r4 = 0
                goto L_0x01c7
            L_0x01c6:
                r4 = 1
            L_0x01c7:
                if (r3 == r8) goto L_0x01ce
                if (r3 != r15) goto L_0x01cc
                goto L_0x01ce
            L_0x01cc:
                r3 = 0
                goto L_0x01cf
            L_0x01ce:
                r3 = 1
            L_0x01cf:
                r8 = 0
                if (r6 == 0) goto L_0x01da
                float r11 = r1.Y
                int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                if (r11 <= 0) goto L_0x01da
                r11 = 1
                goto L_0x01db
            L_0x01da:
                r11 = 0
            L_0x01db:
                if (r7 == 0) goto L_0x01e5
                float r13 = r1.Y
                int r8 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
                if (r8 <= 0) goto L_0x01e5
                r8 = 1
                goto L_0x01e6
            L_0x01e5:
                r8 = 0
            L_0x01e6:
                if (r10 != 0) goto L_0x01e9
                return
            L_0x01e9:
                android.view.ViewGroup$LayoutParams r13 = r10.getLayoutParams()
                androidx.constraintlayout.widget.ConstraintLayout$a r13 = (androidx.constraintlayout.widget.ConstraintLayout.a) r13
                int r14 = r2.f26801j
                if (r14 == r15) goto L_0x0209
                if (r14 == r12) goto L_0x0209
                if (r6 == 0) goto L_0x0209
                int r6 = r1.f26281r
                if (r6 != 0) goto L_0x0209
                if (r7 == 0) goto L_0x0209
                int r6 = r1.f26282s
                if (r6 == 0) goto L_0x0202
                goto L_0x0209
            L_0x0202:
                r0 = -1
                r4 = 0
                r9 = 0
                r14 = 0
                r15 = 0
                goto L_0x02b0
            L_0x0209:
                boolean r6 = r10 instanceof y.g
                if (r6 == 0) goto L_0x0218
                boolean r6 = r1 instanceof v.l
                if (r6 == 0) goto L_0x0218
                r6 = r1
                v.l r6 = (v.l) r6
                r6 = r10
                y.g r6 = (y.g) r6
                goto L_0x021b
            L_0x0218:
                r10.measure(r5, r9)
            L_0x021b:
                r1.H = r5
                r1.I = r9
                r6 = 0
                r1.f26259g = r6
                int r6 = r10.getMeasuredWidth()
                int r7 = r10.getMeasuredHeight()
                int r12 = r10.getBaseline()
                int r14 = r1.f26284u
                if (r14 <= 0) goto L_0x0237
                int r14 = java.lang.Math.max(r14, r6)
                goto L_0x0238
            L_0x0237:
                r14 = r6
            L_0x0238:
                int r15 = r1.f26285v
                if (r15 <= 0) goto L_0x0240
                int r14 = java.lang.Math.min(r15, r14)
            L_0x0240:
                int r15 = r1.f26287x
                if (r15 <= 0) goto L_0x024b
                int r15 = java.lang.Math.max(r15, r7)
                r16 = r5
                goto L_0x024e
            L_0x024b:
                r16 = r5
                r15 = r7
            L_0x024e:
                int r5 = r1.f26288y
                if (r5 <= 0) goto L_0x0256
                int r15 = java.lang.Math.min(r5, r15)
            L_0x0256:
                androidx.constraintlayout.widget.ConstraintLayout r5 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r5 = r5.f1147i
                r0 = 1
                boolean r5 = v.k.b(r5, r0)
                if (r5 != 0) goto L_0x027b
                r0 = 1056964608(0x3f000000, float:0.5)
                if (r11 == 0) goto L_0x0270
                if (r4 == 0) goto L_0x0270
                float r3 = r1.Y
                float r4 = (float) r15
                float r4 = r4 * r3
                float r4 = r4 + r0
                int r0 = (int) r4
                r14 = r0
                goto L_0x027b
            L_0x0270:
                if (r8 == 0) goto L_0x027b
                if (r3 == 0) goto L_0x027b
                float r3 = r1.Y
                float r4 = (float) r14
                float r4 = r4 / r3
                float r4 = r4 + r0
                int r0 = (int) r4
                r15 = r0
            L_0x027b:
                if (r6 != r14) goto L_0x0284
                if (r7 == r15) goto L_0x0280
                goto L_0x0284
            L_0x0280:
                r4 = r12
                r0 = -1
                r9 = 0
                goto L_0x02b0
            L_0x0284:
                if (r6 == r14) goto L_0x028d
                r0 = 1073741824(0x40000000, float:2.0)
                int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r0)
                goto L_0x0291
            L_0x028d:
                r0 = 1073741824(0x40000000, float:2.0)
                r5 = r16
            L_0x0291:
                if (r7 == r15) goto L_0x0297
                int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r0)
            L_0x0297:
                r10.measure(r5, r9)
                r1.H = r5
                r1.I = r9
                r9 = 0
                r1.f26259g = r9
                int r0 = r10.getMeasuredWidth()
                int r3 = r10.getMeasuredHeight()
                int r4 = r10.getBaseline()
                r14 = r0
                r15 = r3
                r0 = -1
            L_0x02b0:
                if (r4 == r0) goto L_0x02b4
                r0 = 1
                goto L_0x02b5
            L_0x02b4:
                r0 = 0
            L_0x02b5:
                int r3 = r2.f26794c
                if (r14 != r3) goto L_0x02c0
                int r3 = r2.f26795d
                if (r15 == r3) goto L_0x02be
                goto L_0x02c0
            L_0x02be:
                r5 = 0
                goto L_0x02c1
            L_0x02c0:
                r5 = 1
            L_0x02c1:
                r2.f26800i = r5
                boolean r3 = r13.f1161c0
                if (r3 == 0) goto L_0x02c8
                r0 = 1
            L_0x02c8:
                if (r0 == 0) goto L_0x02d4
                r3 = -1
                if (r4 == r3) goto L_0x02d4
                int r1 = r1.f26252c0
                if (r1 == r4) goto L_0x02d4
                r1 = 1
                r2.f26800i = r1
            L_0x02d4:
                r2.f26796e = r14
                r2.f26797f = r15
                r2.f26799h = r0
                r2.f26798g = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.b(v.f, w.b$a):void");
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f(attributeSet, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static f getSharedValues() {
        if (f1138z == null) {
            f1138z = new f();
        }
        return f1138z;
    }

    /* renamed from: b */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    public Object c(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f1151u;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f1151u.get(str);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public View d(int i10) {
        return this.f1139a.get(i10);
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<a> arrayList = this.f1140b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.f1140b.get(i10).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i12 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i13 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = (float) i12;
                        float f11 = (float) (i12 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f12 = (float) i13;
                        float f13 = f10;
                        float f14 = f10;
                        float f15 = f12;
                        Paint paint2 = paint;
                        float f16 = f11;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f13, f15, f16, f12, paint3);
                        float parseInt4 = (float) (i13 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f17 = f11;
                        float f18 = parseInt4;
                        canvas2.drawLine(f17, f15, f16, f18, paint3);
                        float f19 = parseInt4;
                        float f20 = f14;
                        canvas2.drawLine(f17, f19, f20, f18, paint3);
                        float f21 = f14;
                        canvas2.drawLine(f21, f19, f20, f12, paint3);
                        Paint paint4 = paint2;
                        paint4.setColor(-16711936);
                        Paint paint5 = paint4;
                        float f22 = f11;
                        Paint paint6 = paint5;
                        canvas2.drawLine(f21, f12, f22, parseInt4, paint6);
                        canvas2.drawLine(f21, parseInt4, f22, f12, paint6);
                    }
                }
            }
        }
    }

    public final v.f e(View view) {
        if (view == this) {
            return this.f1141c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof a) {
            return ((a) view.getLayoutParams()).f1189q0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof a) {
            return ((a) view.getLayoutParams()).f1189q0;
        }
        return null;
    }

    public final void f(AttributeSet attributeSet, int i10, int i11) {
        g gVar = this.f1141c;
        gVar.f26262h0 = this;
        b bVar = this.f1153w;
        gVar.f26293v0 = bVar;
        gVar.f26291t0.f26809f = bVar;
        this.f1139a.put(getId(), this);
        this.f1148r = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.f27962b, i10, i11);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = obtainStyledAttributes.getIndex(i12);
                if (index == 16) {
                    this.f1142d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1142d);
                } else if (index == 17) {
                    this.f1143e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1143e);
                } else if (index == 14) {
                    this.f1144f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1144f);
                } else if (index == 15) {
                    this.f1145g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1145g);
                } else if (index == 113) {
                    this.f1147i = obtainStyledAttributes.getInt(index, this.f1147i);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            k(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1149s = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        b bVar2 = new b();
                        this.f1148r = bVar2;
                        bVar2.f(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1148r = null;
                    }
                    this.f1150t = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1141c.g0(this.f1147i);
    }

    public void forceLayout() {
        this.f1146h = true;
        super.forceLayout();
    }

    public boolean g() {
        if (!((getContext().getApplicationInfo().flags & 4194304) != 0) || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.f1145g;
    }

    public int getMaxWidth() {
        return this.f1144f;
    }

    public int getMinHeight() {
        return this.f1143e;
    }

    public int getMinWidth() {
        return this.f1142d;
    }

    public int getOptimizationLevel() {
        return this.f1141c.E0;
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.f1141c.f26265j == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.f1141c.f26265j = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.f1141c.f26265j = "parent";
            }
        }
        g gVar = this.f1141c;
        if (gVar.f26266j0 == null) {
            gVar.f26266j0 = gVar.f26265j;
            StringBuilder a10 = android.support.v4.media.a.a(" setDebugName ");
            a10.append(this.f1141c.f26266j0);
            Log.v("ConstraintLayout", a10.toString());
        }
        Iterator<v.f> it = this.f1141c.f26307r0.iterator();
        while (it.hasNext()) {
            v.f next = it.next();
            View view = (View) next.f26262h0;
            if (view != null) {
                if (next.f26265j == null && (id2 = view.getId()) != -1) {
                    next.f26265j = getContext().getResources().getResourceEntryName(id2);
                }
                if (next.f26266j0 == null) {
                    next.f26266j0 = next.f26265j;
                    StringBuilder a11 = android.support.v4.media.a.a(" setDebugName ");
                    a11.append(next.f26266j0);
                    Log.v("ConstraintLayout", a11.toString());
                }
            }
        }
        this.f1141c.q(sb2);
        return sb2.toString();
    }

    public void k(int i10) {
        this.f1149s = new y.b(getContext(), this, i10);
    }

    public void l(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        b bVar = this.f1153w;
        int i14 = bVar.f1204e;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i12 + bVar.f1203d, i10, 0);
        int min = Math.min(this.f1144f, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f1145g, ViewGroup.resolveSizeAndState(i13 + i14, i11, 0) & 16777215);
        if (z10) {
            min |= 16777216;
        }
        if (z11) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            a aVar = (a) childAt.getLayoutParams();
            v.f fVar = aVar.f1189q0;
            if ((childAt.getVisibility() != 8 || aVar.f1163d0 || aVar.f1165e0 || isInEditMode) && !aVar.f1167f0) {
                int v10 = fVar.v();
                int w10 = fVar.w();
                int u10 = fVar.u() + v10;
                int l10 = fVar.l() + w10;
                childAt.layout(v10, w10, u10, l10);
                if ((childAt instanceof d) && (content = ((d) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(v10, w10, u10, l10);
                }
            }
        }
        int size = this.f1140b.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                this.f1140b.get(i15).getClass();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x04ab  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x04c7  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x055f  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x05ee  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x05f4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x07b5  */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x0563 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01f3 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r28, int r29) {
        /*
            r27 = this;
            r7 = r27
            r1 = r28
            r2 = r29
            boolean r0 = r7.f1146h
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x0023
            int r0 = r27.getChildCount()
            r5 = 0
        L_0x0011:
            if (r5 >= r0) goto L_0x0023
            android.view.View r6 = r7.getChildAt(r5)
            boolean r6 = r6.isLayoutRequested()
            if (r6 == 0) goto L_0x0020
            r7.f1146h = r3
            goto L_0x0023
        L_0x0020:
            int r5 = r5 + 1
            goto L_0x0011
        L_0x0023:
            r7.f1154x = r1
            r7.f1155y = r2
            v.g r0 = r7.f1141c
            boolean r5 = r27.g()
            r0.f26294w0 = r5
            boolean r0 = r7.f1146h
            if (r0 == 0) goto L_0x0042
            r7.f1146h = r4
            boolean r0 = r27.r()
            if (r0 == 0) goto L_0x0042
            v.g r0 = r7.f1141c
            w.b r5 = r0.f26290s0
            r5.c(r0)
        L_0x0042:
            v.g r0 = r7.f1141c
            int r5 = r7.f1147i
            int r6 = android.view.View.MeasureSpec.getMode(r28)
            int r8 = android.view.View.MeasureSpec.getSize(r28)
            int r9 = android.view.View.MeasureSpec.getMode(r29)
            int r10 = android.view.View.MeasureSpec.getSize(r29)
            int r11 = r27.getPaddingTop()
            int r11 = java.lang.Math.max(r4, r11)
            int r12 = r27.getPaddingBottom()
            int r12 = java.lang.Math.max(r4, r12)
            int r13 = r11 + r12
            int r14 = r27.getPaddingWidth()
            androidx.constraintlayout.widget.ConstraintLayout$b r15 = r7.f1153w
            r15.f1201b = r11
            r15.f1202c = r12
            r15.f1203d = r14
            r15.f1204e = r13
            r15.f1205f = r1
            r15.f1206g = r2
            int r12 = r27.getPaddingStart()
            int r12 = java.lang.Math.max(r4, r12)
            int r15 = r27.getPaddingEnd()
            int r15 = java.lang.Math.max(r4, r15)
            if (r12 > 0) goto L_0x0098
            if (r15 <= 0) goto L_0x008f
            goto L_0x0098
        L_0x008f:
            int r12 = r27.getPaddingLeft()
            int r12 = java.lang.Math.max(r4, r12)
            goto L_0x009f
        L_0x0098:
            boolean r16 = r27.g()
            if (r16 == 0) goto L_0x009f
            r12 = r15
        L_0x009f:
            int r8 = r8 - r14
            int r10 = r10 - r13
            androidx.constraintlayout.widget.ConstraintLayout$b r13 = r7.f1153w
            int r14 = r13.f1204e
            int r13 = r13.f1203d
            int r15 = r27.getChildCount()
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r6 == r3) goto L_0x00cf
            if (r6 == 0) goto L_0x00c1
            if (r6 == r4) goto L_0x00b8
            r3 = 1
            r4 = 0
            goto L_0x00dd
        L_0x00b8:
            int r4 = r7.f1144f
            int r4 = r4 - r13
            int r4 = java.lang.Math.min(r4, r8)
            r3 = 1
            goto L_0x00dd
        L_0x00c1:
            if (r15 != 0) goto L_0x00cd
            int r4 = r7.f1142d
            r3 = 0
            int r17 = java.lang.Math.max(r3, r4)
            r3 = r17
            goto L_0x00db
        L_0x00cd:
            r3 = 0
            goto L_0x00db
        L_0x00cf:
            r3 = 0
            if (r15 != 0) goto L_0x00da
            int r4 = r7.f1142d
            int r4 = java.lang.Math.max(r3, r4)
            r3 = r4
            goto L_0x00db
        L_0x00da:
            r3 = r8
        L_0x00db:
            r4 = r3
            r3 = 2
        L_0x00dd:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == r1) goto L_0x0102
            if (r9 == 0) goto L_0x00f4
            r1 = 1073741824(0x40000000, float:2.0)
            if (r9 == r1) goto L_0x00ea
            r1 = 1
            r15 = 0
            goto L_0x010e
        L_0x00ea:
            int r1 = r7.f1145g
            int r1 = r1 - r14
            int r1 = java.lang.Math.min(r1, r10)
            r15 = r1
            r1 = 1
            goto L_0x010e
        L_0x00f4:
            if (r15 != 0) goto L_0x0100
            int r1 = r7.f1143e
            r15 = 0
            int r17 = java.lang.Math.max(r15, r1)
            r15 = r17
            goto L_0x010d
        L_0x0100:
            r15 = 0
            goto L_0x010d
        L_0x0102:
            r1 = 0
            if (r15 != 0) goto L_0x010c
            int r15 = r7.f1143e
            int r15 = java.lang.Math.max(r1, r15)
            goto L_0x010d
        L_0x010c:
            r15 = r10
        L_0x010d:
            r1 = 2
        L_0x010e:
            int r2 = r0.u()
            if (r4 != r2) goto L_0x0120
            int r2 = r0.l()
            if (r15 == r2) goto L_0x011b
            goto L_0x0120
        L_0x011b:
            r18 = r10
            r2 = 0
            r10 = 1
            goto L_0x0128
        L_0x0120:
            w.e r2 = r0.f26291t0
            r18 = r10
            r10 = 1
            r2.f26806c = r10
            r2 = 0
        L_0x0128:
            r0.f26248a0 = r2
            r0.f26250b0 = r2
            int r10 = r7.f1144f
            int r10 = r10 - r13
            r19 = r8
            int[] r8 = r0.C
            r8[r2] = r10
            int r10 = r7.f1145g
            int r10 = r10 - r14
            r16 = 1
            r8[r16] = r10
            r0.Q(r2)
            r0.P(r2)
            int[] r8 = r0.U
            r8[r2] = r3
            r0.S(r4)
            int[] r2 = r0.U
            r2[r16] = r1
            r0.N(r15)
            int r1 = r7.f1142d
            int r1 = r1 - r13
            r0.Q(r1)
            int r1 = r7.f1143e
            int r1 = r1 - r14
            r0.P(r1)
            r0.f26296y0 = r12
            r0.f26297z0 = r11
            w.b r1 = r0.f26290s0
            r1.getClass()
            v.d$a r2 = v.d.a.BOTTOM
            v.d$a r3 = v.d.a.RIGHT
            r4 = 3
            w.b$b r8 = r0.f26293v0
            java.util.ArrayList<v.f> r10 = r0.f26307r0
            int r10 = r10.size()
            int r11 = r0.u()
            int r12 = r0.l()
            r13 = 128(0x80, float:1.794E-43)
            boolean r13 = v.k.b(r5, r13)
            r14 = 64
            if (r13 != 0) goto L_0x018d
            boolean r5 = v.k.b(r5, r14)
            if (r5 == 0) goto L_0x018b
            goto L_0x018d
        L_0x018b:
            r5 = 0
            goto L_0x018e
        L_0x018d:
            r5 = 1
        L_0x018e:
            if (r5 == 0) goto L_0x01ed
            r14 = 0
        L_0x0191:
            if (r14 >= r10) goto L_0x01ed
            java.util.ArrayList<v.f> r15 = r0.f26307r0
            java.lang.Object r15 = r15.get(r14)
            v.f r15 = (v.f) r15
            r22 = r5
            int r5 = r15.m()
            if (r5 != r4) goto L_0x01a5
            r5 = 1
            goto L_0x01a6
        L_0x01a5:
            r5 = 0
        L_0x01a6:
            int r7 = r15.t()
            if (r7 != r4) goto L_0x01ae
            r7 = 1
            goto L_0x01af
        L_0x01ae:
            r7 = 0
        L_0x01af:
            if (r5 == 0) goto L_0x01bc
            if (r7 == 0) goto L_0x01bc
            float r5 = r15.Y
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x01bc
            r5 = 1
            goto L_0x01bd
        L_0x01bc:
            r5 = 0
        L_0x01bd:
            boolean r7 = r15.A()
            if (r7 == 0) goto L_0x01c6
            if (r5 == 0) goto L_0x01c6
            goto L_0x01e8
        L_0x01c6:
            boolean r7 = r15.B()
            if (r7 == 0) goto L_0x01cf
            if (r5 == 0) goto L_0x01cf
            goto L_0x01e8
        L_0x01cf:
            boolean r5 = r15 instanceof v.l
            if (r5 == 0) goto L_0x01d4
            goto L_0x01e8
        L_0x01d4:
            boolean r5 = r15.A()
            if (r5 != 0) goto L_0x01e8
            boolean r5 = r15.B()
            if (r5 == 0) goto L_0x01e1
            goto L_0x01e8
        L_0x01e1:
            int r14 = r14 + 1
            r7 = r27
            r5 = r22
            goto L_0x0191
        L_0x01e8:
            r5 = 1073741824(0x40000000, float:2.0)
            r22 = 0
            goto L_0x01f1
        L_0x01ed:
            r22 = r5
            r5 = 1073741824(0x40000000, float:2.0)
        L_0x01f1:
            if (r6 != r5) goto L_0x01f5
            if (r9 == r5) goto L_0x01f7
        L_0x01f5:
            if (r13 == 0) goto L_0x01f9
        L_0x01f7:
            r5 = 1
            goto L_0x01fa
        L_0x01f9:
            r5 = 0
        L_0x01fa:
            r5 = r22 & r5
            if (r5 == 0) goto L_0x04ab
            int[] r7 = r0.C
            r14 = 0
            r7 = r7[r14]
            r14 = r19
            int r7 = java.lang.Math.min(r7, r14)
            int[] r14 = r0.C
            r15 = 1
            r14 = r14[r15]
            r15 = r18
            int r14 = java.lang.Math.min(r14, r15)
            r15 = 1073741824(0x40000000, float:2.0)
            if (r6 != r15) goto L_0x0224
            int r4 = r0.u()
            if (r4 == r7) goto L_0x0224
            r0.S(r7)
            r0.d0()
        L_0x0224:
            if (r9 != r15) goto L_0x0232
            int r4 = r0.l()
            if (r4 == r14) goto L_0x0232
            r0.N(r14)
            r0.d0()
        L_0x0232:
            if (r6 != r15) goto L_0x03fd
            if (r9 != r15) goto L_0x03fd
            w.e r4 = r0.f26291t0
            r14 = 1
            r13 = r13 & r14
            boolean r14 = r4.f26805b
            if (r14 != 0) goto L_0x0245
            boolean r14 = r4.f26806c
            if (r14 == 0) goto L_0x0243
            goto L_0x0245
        L_0x0243:
            r14 = 0
            goto L_0x0282
        L_0x0245:
            v.g r14 = r4.f26804a
            java.util.ArrayList<v.f> r14 = r14.f26307r0
            java.util.Iterator r14 = r14.iterator()
        L_0x024d:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x026a
            java.lang.Object r15 = r14.next()
            v.f r15 = (v.f) r15
            r15.h()
            r7 = 0
            r15.f26247a = r7
            w.l r7 = r15.f26253d
            r7.n()
            w.n r7 = r15.f26255e
            r7.m()
            goto L_0x024d
        L_0x026a:
            v.g r7 = r4.f26804a
            r7.h()
            v.g r7 = r4.f26804a
            r14 = 0
            r7.f26247a = r14
            w.l r7 = r7.f26253d
            r7.n()
            v.g r7 = r4.f26804a
            w.n r7 = r7.f26255e
            r7.m()
            r4.f26806c = r14
        L_0x0282:
            v.g r7 = r4.f26807d
            r4.b(r7)
            v.g r7 = r4.f26804a
            r7.f26248a0 = r14
            r7.f26250b0 = r14
            int r7 = r7.k(r14)
            v.g r14 = r4.f26804a
            r15 = 1
            int r14 = r14.k(r15)
            boolean r15 = r4.f26805b
            if (r15 == 0) goto L_0x029f
            r4.c()
        L_0x029f:
            v.g r15 = r4.f26804a
            int r15 = r15.v()
            r22 = r5
            v.g r5 = r4.f26804a
            int r5 = r5.w()
            r23 = r2
            v.g r2 = r4.f26804a
            w.l r2 = r2.f26253d
            w.f r2 = r2.f26856h
            r2.c(r15)
            v.g r2 = r4.f26804a
            w.n r2 = r2.f26255e
            w.f r2 = r2.f26856h
            r2.c(r5)
            r4.g()
            r2 = 2
            if (r7 == r2) goto L_0x02cf
            if (r14 != r2) goto L_0x02ca
            goto L_0x02cf
        L_0x02ca:
            r24 = r3
            r25 = r8
            goto L_0x0335
        L_0x02cf:
            if (r13 == 0) goto L_0x02ea
            java.util.ArrayList<w.p> r2 = r4.f26808e
            java.util.Iterator r2 = r2.iterator()
        L_0x02d7:
            boolean r24 = r2.hasNext()
            if (r24 == 0) goto L_0x02ea
            java.lang.Object r24 = r2.next()
            w.p r24 = (w.p) r24
            boolean r24 = r24.k()
            if (r24 != 0) goto L_0x02d7
            r13 = 0
        L_0x02ea:
            if (r13 == 0) goto L_0x0311
            r2 = 2
            if (r7 != r2) goto L_0x0311
            v.g r2 = r4.f26804a
            r24 = r3
            int[] r3 = r2.U
            r25 = r8
            r8 = 0
            r16 = 1
            r3[r8] = r16
            int r3 = r4.d(r2, r8)
            r2.S(r3)
            v.g r2 = r4.f26804a
            w.l r3 = r2.f26253d
            w.g r3 = r3.f26853e
            int r2 = r2.u()
            r3.c(r2)
            goto L_0x0315
        L_0x0311:
            r24 = r3
            r25 = r8
        L_0x0315:
            if (r13 == 0) goto L_0x0335
            r2 = 2
            if (r14 != r2) goto L_0x0335
            v.g r2 = r4.f26804a
            int[] r3 = r2.U
            r8 = 1
            r3[r8] = r8
            int r3 = r4.d(r2, r8)
            r2.N(r3)
            v.g r2 = r4.f26804a
            w.n r3 = r2.f26255e
            w.g r3 = r3.f26853e
            int r2 = r2.l()
            r3.c(r2)
        L_0x0335:
            v.g r2 = r4.f26804a
            int[] r3 = r2.U
            r8 = 0
            r13 = r3[r8]
            r26 = r11
            r11 = 1
            if (r13 == r11) goto L_0x0349
            r3 = r3[r8]
            r8 = 4
            if (r3 != r8) goto L_0x0347
            goto L_0x0349
        L_0x0347:
            r2 = 0
            goto L_0x038e
        L_0x0349:
            int r2 = r2.u()
            int r2 = r2 + r15
            v.g r3 = r4.f26804a
            w.l r3 = r3.f26253d
            w.f r3 = r3.f26857i
            r3.c(r2)
            v.g r3 = r4.f26804a
            w.l r3 = r3.f26253d
            w.g r3 = r3.f26853e
            int r2 = r2 - r15
            r3.c(r2)
            r4.g()
            v.g r2 = r4.f26804a
            int[] r3 = r2.U
            r8 = 1
            r11 = r3[r8]
            if (r11 == r8) goto L_0x0372
            r3 = r3[r8]
            r8 = 4
            if (r3 != r8) goto L_0x038a
        L_0x0372:
            int r2 = r2.l()
            int r2 = r2 + r5
            v.g r3 = r4.f26804a
            w.n r3 = r3.f26255e
            w.f r3 = r3.f26857i
            r3.c(r2)
            v.g r3 = r4.f26804a
            w.n r3 = r3.f26255e
            w.g r3 = r3.f26853e
            int r2 = r2 - r5
            r3.c(r2)
        L_0x038a:
            r4.g()
            r2 = 1
        L_0x038e:
            java.util.ArrayList<w.p> r3 = r4.f26808e
            java.util.Iterator r3 = r3.iterator()
        L_0x0394:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x03af
            java.lang.Object r5 = r3.next()
            w.p r5 = (w.p) r5
            v.f r8 = r5.f26850b
            v.g r11 = r4.f26804a
            if (r8 != r11) goto L_0x03ab
            boolean r8 = r5.f26855g
            if (r8 != 0) goto L_0x03ab
            goto L_0x0394
        L_0x03ab:
            r5.e()
            goto L_0x0394
        L_0x03af:
            java.util.ArrayList<w.p> r3 = r4.f26808e
            java.util.Iterator r3 = r3.iterator()
        L_0x03b5:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x03ec
            java.lang.Object r5 = r3.next()
            w.p r5 = (w.p) r5
            if (r2 != 0) goto L_0x03ca
            v.f r8 = r5.f26850b
            v.g r11 = r4.f26804a
            if (r8 != r11) goto L_0x03ca
            goto L_0x03b5
        L_0x03ca:
            w.f r8 = r5.f26856h
            boolean r8 = r8.f26821j
            if (r8 != 0) goto L_0x03d1
            goto L_0x03ea
        L_0x03d1:
            w.f r8 = r5.f26857i
            boolean r8 = r8.f26821j
            if (r8 != 0) goto L_0x03dc
            boolean r8 = r5 instanceof w.j
            if (r8 != 0) goto L_0x03dc
            goto L_0x03ea
        L_0x03dc:
            w.g r8 = r5.f26853e
            boolean r8 = r8.f26821j
            if (r8 != 0) goto L_0x03b5
            boolean r8 = r5 instanceof w.c
            if (r8 != 0) goto L_0x03b5
            boolean r5 = r5 instanceof w.j
            if (r5 != 0) goto L_0x03b5
        L_0x03ea:
            r2 = 0
            goto L_0x03ed
        L_0x03ec:
            r2 = 1
        L_0x03ed:
            v.g r3 = r4.f26804a
            r3.O(r7)
            v.g r3 = r4.f26804a
            r3.R(r14)
            r3 = r2
            r2 = 1073741824(0x40000000, float:2.0)
            r5 = 2
            goto L_0x049b
        L_0x03fd:
            r23 = r2
            r24 = r3
            r22 = r5
            r25 = r8
            r26 = r11
            w.e r2 = r0.f26291t0
            boolean r3 = r2.f26805b
            if (r3 == 0) goto L_0x0464
            v.g r3 = r2.f26804a
            java.util.ArrayList<v.f> r3 = r3.f26307r0
            java.util.Iterator r3 = r3.iterator()
        L_0x0415:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x043e
            java.lang.Object r4 = r3.next()
            v.f r4 = (v.f) r4
            r4.h()
            r5 = 0
            r4.f26247a = r5
            w.l r7 = r4.f26253d
            w.g r8 = r7.f26853e
            r8.f26821j = r5
            r7.f26855g = r5
            r7.n()
            w.n r4 = r4.f26255e
            w.g r7 = r4.f26853e
            r7.f26821j = r5
            r4.f26855g = r5
            r4.m()
            goto L_0x0415
        L_0x043e:
            r5 = 0
            v.g r3 = r2.f26804a
            r3.h()
            v.g r3 = r2.f26804a
            r3.f26247a = r5
            w.l r3 = r3.f26253d
            w.g r4 = r3.f26853e
            r4.f26821j = r5
            r3.f26855g = r5
            r3.n()
            v.g r3 = r2.f26804a
            w.n r3 = r3.f26255e
            w.g r4 = r3.f26853e
            r4.f26821j = r5
            r3.f26855g = r5
            r3.m()
            r2.c()
            goto L_0x0465
        L_0x0464:
            r5 = 0
        L_0x0465:
            v.g r3 = r2.f26807d
            r2.b(r3)
            v.g r3 = r2.f26804a
            r3.f26248a0 = r5
            r3.f26250b0 = r5
            w.l r3 = r3.f26253d
            w.f r3 = r3.f26856h
            r3.c(r5)
            v.g r2 = r2.f26804a
            w.n r2 = r2.f26255e
            w.f r2 = r2.f26856h
            r2.c(r5)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r6 != r2) goto L_0x048f
            boolean r3 = r0.c0(r13, r5)
            r4 = 1
            r16 = r3 & 1
            r3 = r16
            r5 = 1
            goto L_0x0492
        L_0x048f:
            r4 = 1
            r3 = 1
            r5 = 0
        L_0x0492:
            if (r9 != r2) goto L_0x049b
            boolean r7 = r0.c0(r13, r4)
            r3 = r3 & r7
            int r5 = r5 + 1
        L_0x049b:
            if (r3 == 0) goto L_0x04b7
            if (r6 != r2) goto L_0x04a1
            r4 = 1
            goto L_0x04a2
        L_0x04a1:
            r4 = 0
        L_0x04a2:
            if (r9 != r2) goto L_0x04a6
            r2 = 1
            goto L_0x04a7
        L_0x04a6:
            r2 = 0
        L_0x04a7:
            r0.T(r4, r2)
            goto L_0x04b7
        L_0x04ab:
            r23 = r2
            r24 = r3
            r22 = r5
            r25 = r8
            r26 = r11
            r3 = 0
            r5 = 0
        L_0x04b7:
            if (r3 == 0) goto L_0x04c1
            r2 = 2
            if (r5 == r2) goto L_0x04bd
            goto L_0x04c1
        L_0x04bd:
            r7 = r27
            goto L_0x07bb
        L_0x04c1:
            int r2 = r0.E0
            r3 = 8
            if (r10 <= 0) goto L_0x05e1
            java.util.ArrayList<v.f> r4 = r0.f26307r0
            int r4 = r4.size()
            r5 = 64
            boolean r5 = r0.f0(r5)
            w.b$b r6 = r0.f26293v0
            r7 = 0
        L_0x04d6:
            if (r7 >= r4) goto L_0x0567
            java.util.ArrayList<v.f> r8 = r0.f26307r0
            java.lang.Object r8 = r8.get(r7)
            v.f r8 = (v.f) r8
            boolean r9 = r8 instanceof v.h
            if (r9 == 0) goto L_0x04e5
            goto L_0x0505
        L_0x04e5:
            boolean r9 = r8 instanceof v.a
            if (r9 == 0) goto L_0x04ea
            goto L_0x0505
        L_0x04ea:
            boolean r9 = r8.G
            if (r9 == 0) goto L_0x04ef
            goto L_0x0505
        L_0x04ef:
            if (r5 == 0) goto L_0x0508
            w.l r9 = r8.f26253d
            if (r9 == 0) goto L_0x0508
            w.n r11 = r8.f26255e
            if (r11 == 0) goto L_0x0508
            w.g r9 = r9.f26853e
            boolean r9 = r9.f26821j
            if (r9 == 0) goto L_0x0508
            w.g r9 = r11.f26853e
            boolean r9 = r9.f26821j
            if (r9 == 0) goto L_0x0508
        L_0x0505:
            r9 = 3
            r13 = 0
            goto L_0x0563
        L_0x0508:
            r9 = 0
            int r11 = r8.k(r9)
            r9 = 1
            int r13 = r8.k(r9)
            r14 = 3
            if (r11 != r14) goto L_0x0521
            int r15 = r8.f26281r
            if (r15 == r9) goto L_0x0521
            if (r13 != r14) goto L_0x0521
            int r14 = r8.f26282s
            if (r14 == r9) goto L_0x0521
            r14 = 1
            goto L_0x0522
        L_0x0521:
            r14 = 0
        L_0x0522:
            if (r14 != 0) goto L_0x055a
            boolean r15 = r0.f0(r9)
            if (r15 == 0) goto L_0x055a
            boolean r9 = r8 instanceof v.l
            if (r9 != 0) goto L_0x055a
            r9 = 3
            if (r11 != r9) goto L_0x053e
            int r15 = r8.f26281r
            if (r15 != 0) goto L_0x053e
            if (r13 == r9) goto L_0x053e
            boolean r15 = r8.A()
            if (r15 != 0) goto L_0x053e
            r14 = 1
        L_0x053e:
            if (r13 != r9) goto L_0x054d
            int r15 = r8.f26282s
            if (r15 != 0) goto L_0x054d
            if (r11 == r9) goto L_0x054d
            boolean r15 = r8.A()
            if (r15 != 0) goto L_0x054d
            r14 = 1
        L_0x054d:
            if (r11 == r9) goto L_0x0551
            if (r13 != r9) goto L_0x055b
        L_0x0551:
            float r11 = r8.Y
            r13 = 0
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x055c
            r14 = 1
            goto L_0x055c
        L_0x055a:
            r9 = 3
        L_0x055b:
            r13 = 0
        L_0x055c:
            if (r14 == 0) goto L_0x055f
            goto L_0x0563
        L_0x055f:
            r11 = 0
            r1.a(r6, r8, r11)
        L_0x0563:
            int r7 = r7 + 1
            goto L_0x04d6
        L_0x0567:
            androidx.constraintlayout.widget.ConstraintLayout$b r6 = (androidx.constraintlayout.widget.ConstraintLayout.b) r6
            androidx.constraintlayout.widget.ConstraintLayout r4 = r6.f1200a
            int r4 = r4.getChildCount()
            r5 = 0
        L_0x0570:
            if (r5 >= r4) goto L_0x05c4
            androidx.constraintlayout.widget.ConstraintLayout r7 = r6.f1200a
            android.view.View r7 = r7.getChildAt(r5)
            boolean r8 = r7 instanceof androidx.constraintlayout.widget.d
            if (r8 == 0) goto L_0x05c1
            androidx.constraintlayout.widget.d r7 = (androidx.constraintlayout.widget.d) r7
            android.view.View r8 = r7.f1331b
            if (r8 != 0) goto L_0x0583
            goto L_0x05c1
        L_0x0583:
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.a) r8
            android.view.View r7 = r7.f1331b
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r7 = (androidx.constraintlayout.widget.ConstraintLayout.a) r7
            v.f r9 = r7.f1189q0
            r11 = 0
            r9.f26264i0 = r11
            v.f r9 = r8.f1189q0
            int r9 = r9.m()
            r11 = 1
            if (r9 == r11) goto L_0x05aa
            v.f r9 = r8.f1189q0
            v.f r13 = r7.f1189q0
            int r13 = r13.u()
            r9.S(r13)
        L_0x05aa:
            v.f r9 = r8.f1189q0
            int r9 = r9.t()
            if (r9 == r11) goto L_0x05bd
            v.f r8 = r8.f1189q0
            v.f r9 = r7.f1189q0
            int r9 = r9.l()
            r8.N(r9)
        L_0x05bd:
            v.f r7 = r7.f1189q0
            r7.f26264i0 = r3
        L_0x05c1:
            int r5 = r5 + 1
            goto L_0x0570
        L_0x05c4:
            androidx.constraintlayout.widget.ConstraintLayout r4 = r6.f1200a
            java.util.ArrayList<androidx.constraintlayout.widget.a> r4 = r4.f1140b
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x05e1
            r5 = 0
        L_0x05cf:
            if (r5 >= r4) goto L_0x05e1
            androidx.constraintlayout.widget.ConstraintLayout r7 = r6.f1200a
            java.util.ArrayList<androidx.constraintlayout.widget.a> r7 = r7.f1140b
            java.lang.Object r7 = r7.get(r5)
            androidx.constraintlayout.widget.a r7 = (androidx.constraintlayout.widget.a) r7
            r7.getClass()
            int r5 = r5 + 1
            goto L_0x05cf
        L_0x05e1:
            r1.c(r0)
            java.util.ArrayList<v.f> r4 = r1.f26789a
            int r4 = r4.size()
            r5 = r26
            if (r10 <= 0) goto L_0x05f2
            r6 = 0
            r1.b(r0, r6, r5, r12)
        L_0x05f2:
            if (r4 <= 0) goto L_0x07b5
            int r6 = r0.m()
            r7 = 2
            if (r6 != r7) goto L_0x05fd
            r6 = 1
            goto L_0x05fe
        L_0x05fd:
            r6 = 0
        L_0x05fe:
            int r8 = r0.t()
            if (r8 != r7) goto L_0x0606
            r7 = 1
            goto L_0x0607
        L_0x0606:
            r7 = 0
        L_0x0607:
            int r8 = r0.u()
            v.g r9 = r1.f26791c
            int r9 = r9.f26254d0
            int r8 = java.lang.Math.max(r8, r9)
            int r9 = r0.l()
            v.g r10 = r1.f26791c
            int r10 = r10.f26256e0
            int r9 = java.lang.Math.max(r9, r10)
            r10 = r8
            r11 = r9
            r8 = 0
            r9 = 0
        L_0x0623:
            if (r8 >= r4) goto L_0x06be
            java.util.ArrayList<v.f> r13 = r1.f26789a
            java.lang.Object r13 = r13.get(r8)
            v.f r13 = (v.f) r13
            boolean r14 = r13 instanceof v.l
            if (r14 != 0) goto L_0x063c
            r18 = r2
            r15 = r23
            r14 = r24
            r3 = r25
            r2 = 0
            goto L_0x06b0
        L_0x063c:
            int r14 = r13.u()
            int r15 = r13.l()
            r18 = r2
            r3 = r25
            r2 = 1
            boolean r19 = r1.a(r3, r13, r2)
            r2 = r9 | r19
            int r9 = r13.u()
            r19 = r2
            int r2 = r13.l()
            if (r9 == r14) goto L_0x0680
            r13.S(r9)
            if (r6 == 0) goto L_0x067b
            int r9 = r13.p()
            if (r9 <= r10) goto L_0x067b
            int r9 = r13.p()
            r14 = r24
            v.d r19 = r13.i(r14)
            int r19 = r19.d()
            int r9 = r19 + r9
            int r10 = java.lang.Math.max(r10, r9)
            goto L_0x067d
        L_0x067b:
            r14 = r24
        L_0x067d:
            r19 = 1
            goto L_0x0682
        L_0x0680:
            r14 = r24
        L_0x0682:
            if (r2 == r15) goto L_0x06a9
            r13.N(r2)
            if (r7 == 0) goto L_0x06a4
            int r2 = r13.j()
            if (r2 <= r11) goto L_0x06a4
            int r2 = r13.j()
            r15 = r23
            v.d r9 = r13.i(r15)
            int r9 = r9.d()
            int r9 = r9 + r2
            int r2 = java.lang.Math.max(r11, r9)
            r11 = r2
            goto L_0x06a6
        L_0x06a4:
            r15 = r23
        L_0x06a6:
            r19 = 1
            goto L_0x06ab
        L_0x06a9:
            r15 = r23
        L_0x06ab:
            v.l r13 = (v.l) r13
            r2 = 0
            r9 = r19 | 0
        L_0x06b0:
            int r8 = r8 + 1
            r25 = r3
            r24 = r14
            r23 = r15
            r2 = r18
            r3 = 8
            goto L_0x0623
        L_0x06be:
            r18 = r2
            r15 = r23
            r14 = r24
            r3 = r25
            r2 = 0
            r13 = r11
            r8 = 0
            r11 = 2
        L_0x06ca:
            if (r8 >= r11) goto L_0x07b2
            r2 = r13
            r13 = r10
            r10 = r9
            r9 = 0
        L_0x06d0:
            if (r9 >= r4) goto L_0x078c
            java.util.ArrayList<v.f> r11 = r1.f26789a
            java.lang.Object r11 = r11.get(r9)
            v.f r11 = (v.f) r11
            r19 = r4
            boolean r4 = r11 instanceof v.i
            if (r4 == 0) goto L_0x06e4
            boolean r4 = r11 instanceof v.l
            if (r4 == 0) goto L_0x06e8
        L_0x06e4:
            boolean r4 = r11 instanceof v.h
            if (r4 == 0) goto L_0x06ed
        L_0x06e8:
            r20 = r0
            r0 = 8
            goto L_0x070d
        L_0x06ed:
            int r4 = r11.f26264i0
            r20 = r0
            r0 = 8
            if (r4 != r0) goto L_0x06f6
            goto L_0x070d
        L_0x06f6:
            if (r22 == 0) goto L_0x0709
            w.l r4 = r11.f26253d
            w.g r4 = r4.f26853e
            boolean r4 = r4.f26821j
            if (r4 == 0) goto L_0x0709
            w.n r4 = r11.f26255e
            w.g r4 = r4.f26853e
            boolean r4 = r4.f26821j
            if (r4 == 0) goto L_0x0709
            goto L_0x070d
        L_0x0709:
            boolean r4 = r11 instanceof v.l
            if (r4 == 0) goto L_0x0714
        L_0x070d:
            r25 = r3
            r26 = r5
            r21 = r12
            goto L_0x077d
        L_0x0714:
            int r4 = r11.u()
            int r0 = r11.l()
            r26 = r5
            int r5 = r11.f26252c0
            r21 = r12
            r12 = 1
            if (r8 != r12) goto L_0x0726
            r12 = 2
        L_0x0726:
            boolean r12 = r1.a(r3, r11, r12)
            r10 = r10 | r12
            int r12 = r11.u()
            r25 = r3
            int r3 = r11.l()
            if (r12 == r4) goto L_0x0754
            r11.S(r12)
            if (r6 == 0) goto L_0x0753
            int r4 = r11.p()
            if (r4 <= r13) goto L_0x0753
            int r4 = r11.p()
            v.d r10 = r11.i(r14)
            int r10 = r10.d()
            int r10 = r10 + r4
            int r13 = java.lang.Math.max(r13, r10)
        L_0x0753:
            r10 = 1
        L_0x0754:
            if (r3 == r0) goto L_0x0774
            r11.N(r3)
            if (r7 == 0) goto L_0x0773
            int r0 = r11.j()
            if (r0 <= r2) goto L_0x0773
            int r0 = r11.j()
            v.d r3 = r11.i(r15)
            int r3 = r3.d()
            int r3 = r3 + r0
            int r0 = java.lang.Math.max(r2, r3)
            r2 = r0
        L_0x0773:
            r10 = 1
        L_0x0774:
            boolean r0 = r11.E
            if (r0 == 0) goto L_0x077d
            int r0 = r11.f26252c0
            if (r5 == r0) goto L_0x077d
            r10 = 1
        L_0x077d:
            int r9 = r9 + 1
            r4 = r19
            r0 = r20
            r12 = r21
            r3 = r25
            r5 = r26
            r11 = 2
            goto L_0x06d0
        L_0x078c:
            r20 = r0
            r25 = r3
            r19 = r4
            r26 = r5
            r21 = r12
            if (r10 == 0) goto L_0x07b0
            int r8 = r8 + 1
            r0 = r20
            r4 = r21
            r3 = r26
            r1.b(r0, r8, r3, r4)
            r5 = r3
            r12 = r4
            r10 = r13
            r4 = r19
            r3 = r25
            r9 = 0
            r11 = 2
            r13 = r2
            r2 = 0
            goto L_0x06ca
        L_0x07b0:
            r0 = r20
        L_0x07b2:
            r1 = r18
            goto L_0x07b6
        L_0x07b5:
            r1 = r2
        L_0x07b6:
            r0.g0(r1)
            goto L_0x04bd
        L_0x07bb:
            v.g r0 = r7.f1141c
            int r3 = r0.u()
            v.g r0 = r7.f1141c
            int r4 = r0.l()
            v.g r0 = r7.f1141c
            boolean r5 = r0.F0
            boolean r6 = r0.G0
            r0 = r27
            r1 = r28
            r2 = r29
            r0.l(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        v.f e10 = e(view);
        if ((view instanceof Guideline) && !(e10 instanceof h)) {
            a aVar = (a) view.getLayoutParams();
            h hVar = new h();
            aVar.f1189q0 = hVar;
            aVar.f1163d0 = true;
            hVar.W(aVar.V);
        }
        if (view instanceof a) {
            a aVar2 = (a) view;
            aVar2.k();
            ((a) view.getLayoutParams()).f1165e0 = true;
            if (!this.f1140b.contains(aVar2)) {
                this.f1140b.add(aVar2);
            }
        }
        this.f1139a.put(view.getId(), view);
        this.f1146h = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1139a.remove(view.getId());
        v.f e10 = e(view);
        this.f1141c.f26307r0.remove(e10);
        e10.F();
        this.f1140b.remove(view);
        this.f1146h = true;
    }

    public void p(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f1151u == null) {
                this.f1151u = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f1151u.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public final void q(v.f fVar, a aVar, SparseArray<v.f> sparseArray, int i10, d.a aVar2) {
        View view = this.f1139a.get(i10);
        v.f fVar2 = sparseArray.get(i10);
        if (fVar2 != null && view != null && (view.getLayoutParams() instanceof a)) {
            aVar.f1161c0 = true;
            d.a aVar3 = d.a.BASELINE;
            if (aVar2 == aVar3) {
                a aVar4 = (a) view.getLayoutParams();
                aVar4.f1161c0 = true;
                aVar4.f1189q0.E = true;
            }
            fVar.i(aVar3).a(fVar2.i(aVar2), aVar.D, aVar.C, true);
            fVar.E = true;
            fVar.i(d.a.TOP).h();
            fVar.i(d.a.BOTTOM).h();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:145:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03c7  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03cf  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0504  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r() {
        /*
            r21 = this;
            r6 = r21
            int r0 = r21.getChildCount()
            r7 = 0
            r1 = 0
        L_0x0008:
            r8 = 1
            if (r1 >= r0) goto L_0x001a
            android.view.View r2 = r6.getChildAt(r1)
            boolean r2 = r2.isLayoutRequested()
            if (r2 == 0) goto L_0x0017
            r9 = 1
            goto L_0x001b
        L_0x0017:
            int r1 = r1 + 1
            goto L_0x0008
        L_0x001a:
            r9 = 0
        L_0x001b:
            if (r9 == 0) goto L_0x0580
            boolean r10 = r21.isInEditMode()
            int r11 = r21.getChildCount()
            r0 = 0
        L_0x0026:
            if (r0 >= r11) goto L_0x0039
            android.view.View r1 = r6.getChildAt(r0)
            v.f r1 = r6.e(r1)
            if (r1 != 0) goto L_0x0033
            goto L_0x0036
        L_0x0033:
            r1.F()
        L_0x0036:
            int r0 = r0 + 1
            goto L_0x0026
        L_0x0039:
            r0 = 0
            r12 = -1
            if (r10 == 0) goto L_0x00a3
            r1 = 0
        L_0x003e:
            if (r1 >= r11) goto L_0x00a3
            android.view.View r2 = r6.getChildAt(r1)
            android.content.res.Resources r3 = r21.getResources()     // Catch:{ NotFoundException -> 0x00a0 }
            int r4 = r2.getId()     // Catch:{ NotFoundException -> 0x00a0 }
            java.lang.String r3 = r3.getResourceName(r4)     // Catch:{ NotFoundException -> 0x00a0 }
            int r4 = r2.getId()     // Catch:{ NotFoundException -> 0x00a0 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NotFoundException -> 0x00a0 }
            r6.p(r7, r3, r4)     // Catch:{ NotFoundException -> 0x00a0 }
            r4 = 47
            int r4 = r3.indexOf(r4)     // Catch:{ NotFoundException -> 0x00a0 }
            if (r4 == r12) goto L_0x0069
            int r4 = r4 + 1
            java.lang.String r3 = r3.substring(r4)     // Catch:{ NotFoundException -> 0x00a0 }
        L_0x0069:
            int r2 = r2.getId()     // Catch:{ NotFoundException -> 0x00a0 }
            if (r2 != 0) goto L_0x0072
            v.g r2 = r6.f1141c     // Catch:{ NotFoundException -> 0x00a0 }
            goto L_0x009e
        L_0x0072:
            android.util.SparseArray<android.view.View> r4 = r6.f1139a     // Catch:{ NotFoundException -> 0x00a0 }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ NotFoundException -> 0x00a0 }
            android.view.View r4 = (android.view.View) r4     // Catch:{ NotFoundException -> 0x00a0 }
            if (r4 != 0) goto L_0x008d
            android.view.View r4 = r6.findViewById(r2)     // Catch:{ NotFoundException -> 0x00a0 }
            if (r4 == 0) goto L_0x008d
            if (r4 == r6) goto L_0x008d
            android.view.ViewParent r2 = r4.getParent()     // Catch:{ NotFoundException -> 0x00a0 }
            if (r2 != r6) goto L_0x008d
            r6.onViewAdded(r4)     // Catch:{ NotFoundException -> 0x00a0 }
        L_0x008d:
            if (r4 != r6) goto L_0x0092
            v.g r2 = r6.f1141c     // Catch:{ NotFoundException -> 0x00a0 }
            goto L_0x009e
        L_0x0092:
            if (r4 != 0) goto L_0x0096
            r2 = r0
            goto L_0x009e
        L_0x0096:
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()     // Catch:{ NotFoundException -> 0x00a0 }
            androidx.constraintlayout.widget.ConstraintLayout$a r2 = (androidx.constraintlayout.widget.ConstraintLayout.a) r2     // Catch:{ NotFoundException -> 0x00a0 }
            v.f r2 = r2.f1189q0     // Catch:{ NotFoundException -> 0x00a0 }
        L_0x009e:
            r2.f26266j0 = r3     // Catch:{ NotFoundException -> 0x00a0 }
        L_0x00a0:
            int r1 = r1 + 1
            goto L_0x003e
        L_0x00a3:
            int r1 = r6.f1150t
            if (r1 == r12) goto L_0x00c5
            r1 = 0
        L_0x00a8:
            if (r1 >= r11) goto L_0x00c5
            android.view.View r2 = r6.getChildAt(r1)
            int r3 = r2.getId()
            int r4 = r6.f1150t
            if (r3 != r4) goto L_0x00c2
            boolean r3 = r2 instanceof androidx.constraintlayout.widget.c
            if (r3 == 0) goto L_0x00c2
            androidx.constraintlayout.widget.c r2 = (androidx.constraintlayout.widget.c) r2
            androidx.constraintlayout.widget.b r2 = r2.getConstraintSet()
            r6.f1148r = r2
        L_0x00c2:
            int r1 = r1 + 1
            goto L_0x00a8
        L_0x00c5:
            androidx.constraintlayout.widget.b r1 = r6.f1148r
            if (r1 == 0) goto L_0x00cc
            r1.b(r6, r8)
        L_0x00cc:
            v.g r1 = r6.f1141c
            java.util.ArrayList<v.f> r1 = r1.f26307r0
            r1.clear()
            java.util.ArrayList<androidx.constraintlayout.widget.a> r1 = r6.f1140b
            int r1 = r1.size()
            r13 = 2
            if (r1 <= 0) goto L_0x0173
            r2 = 0
        L_0x00dd:
            if (r2 >= r1) goto L_0x0173
            java.util.ArrayList<androidx.constraintlayout.widget.a> r3 = r6.f1140b
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.widget.a r3 = (androidx.constraintlayout.widget.a) r3
            boolean r4 = r3.isInEditMode()
            if (r4 == 0) goto L_0x00f2
            java.lang.String r4 = r3.f1213e
            r3.setIds(r4)
        L_0x00f2:
            v.i r4 = r3.f1212d
            if (r4 != 0) goto L_0x00f8
            goto L_0x016d
        L_0x00f8:
            v.j r4 = (v.j) r4
            r4.f26305s0 = r7
            v.f[] r4 = r4.f26304r0
            java.util.Arrays.fill(r4, r0)
            r4 = 0
        L_0x0102:
            int r5 = r3.f1210b
            if (r4 >= r5) goto L_0x0166
            int[] r5 = r3.f1209a
            r5 = r5[r4]
            android.view.View r14 = r6.d(r5)
            if (r14 != 0) goto L_0x0133
            java.util.HashMap<java.lang.Integer, java.lang.String> r15 = r3.f1216h
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r15.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r15 = r3.h(r6, r5)
            if (r15 == 0) goto L_0x0133
            int[] r14 = r3.f1209a
            r14[r4] = r15
            java.util.HashMap<java.lang.Integer, java.lang.String> r14 = r3.f1216h
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r14.put(r0, r5)
            android.view.View r14 = r6.d(r15)
        L_0x0133:
            if (r14 == 0) goto L_0x0161
            v.i r0 = r3.f1212d
            v.f r5 = r6.e(r14)
            v.j r0 = (v.j) r0
            r0.getClass()
            if (r5 == r0) goto L_0x0161
            if (r5 != 0) goto L_0x0145
            goto L_0x0161
        L_0x0145:
            int r14 = r0.f26305s0
            int r14 = r14 + r8
            v.f[] r15 = r0.f26304r0
            int r7 = r15.length
            if (r14 <= r7) goto L_0x0158
            int r7 = r15.length
            int r7 = r7 * 2
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r15, r7)
            v.f[] r7 = (v.f[]) r7
            r0.f26304r0 = r7
        L_0x0158:
            v.f[] r7 = r0.f26304r0
            int r14 = r0.f26305s0
            r7[r14] = r5
            int r14 = r14 + r8
            r0.f26305s0 = r14
        L_0x0161:
            int r4 = r4 + 1
            r0 = 0
            r7 = 0
            goto L_0x0102
        L_0x0166:
            v.i r0 = r3.f1212d
            v.g r3 = r6.f1141c
            r0.a(r3)
        L_0x016d:
            int r2 = r2 + 1
            r0 = 0
            r7 = 0
            goto L_0x00dd
        L_0x0173:
            r0 = 0
        L_0x0174:
            if (r0 >= r11) goto L_0x01ad
            android.view.View r1 = r6.getChildAt(r0)
            boolean r2 = r1 instanceof androidx.constraintlayout.widget.d
            if (r2 == 0) goto L_0x01aa
            androidx.constraintlayout.widget.d r1 = (androidx.constraintlayout.widget.d) r1
            int r2 = r1.f1330a
            if (r2 != r12) goto L_0x018f
            boolean r2 = r1.isInEditMode()
            if (r2 != 0) goto L_0x018f
            int r2 = r1.f1332c
            r1.setVisibility(r2)
        L_0x018f:
            int r2 = r1.f1330a
            android.view.View r2 = r6.findViewById(r2)
            r1.f1331b = r2
            if (r2 == 0) goto L_0x01aa
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r2 = (androidx.constraintlayout.widget.ConstraintLayout.a) r2
            r2.f1167f0 = r8
            android.view.View r2 = r1.f1331b
            r3 = 0
            r2.setVisibility(r3)
            r1.setVisibility(r3)
        L_0x01aa:
            int r0 = r0 + 1
            goto L_0x0174
        L_0x01ad:
            android.util.SparseArray<v.f> r0 = r6.f1152v
            r0.clear()
            android.util.SparseArray<v.f> r0 = r6.f1152v
            v.g r1 = r6.f1141c
            r2 = 0
            r0.put(r2, r1)
            android.util.SparseArray<v.f> r0 = r6.f1152v
            int r1 = r21.getId()
            v.g r2 = r6.f1141c
            r0.put(r1, r2)
            r0 = 0
        L_0x01c6:
            if (r0 >= r11) goto L_0x01dc
            android.view.View r1 = r6.getChildAt(r0)
            v.f r2 = r6.e(r1)
            android.util.SparseArray<v.f> r3 = r6.f1152v
            int r1 = r1.getId()
            r3.put(r1, r2)
            int r0 = r0 + 1
            goto L_0x01c6
        L_0x01dc:
            r7 = 0
        L_0x01dd:
            if (r7 >= r11) goto L_0x0580
            android.view.View r0 = r6.getChildAt(r7)
            v.f r14 = r6.e(r0)
            if (r14 != 0) goto L_0x01eb
            goto L_0x0269
        L_0x01eb:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r15 = r1
            androidx.constraintlayout.widget.ConstraintLayout$a r15 = (androidx.constraintlayout.widget.ConstraintLayout.a) r15
            v.g r1 = r6.f1141c
            java.util.ArrayList<v.f> r2 = r1.f26307r0
            r2.add(r14)
            v.f r2 = r14.V
            if (r2 == 0) goto L_0x0207
            v.m r2 = (v.m) r2
            java.util.ArrayList<v.f> r2 = r2.f26307r0
            r2.remove(r14)
            r14.F()
        L_0x0207:
            r14.V = r1
            android.util.SparseArray<v.f> r3 = r6.f1152v
            r16 = 4
            v.d$a r5 = v.d.a.RIGHT
            v.d$a r4 = v.d.a.LEFT
            v.d$a r2 = v.d.a.BOTTOM
            v.d$a r1 = v.d.a.TOP
            r15.a()
            int r13 = r0.getVisibility()
            r14.f26264i0 = r13
            boolean r13 = r15.f1167f0
            if (r13 == 0) goto L_0x0228
            r14.F = r8
            r13 = 8
            r14.f26264i0 = r13
        L_0x0228:
            r14.f26262h0 = r0
            boolean r13 = r0 instanceof androidx.constraintlayout.widget.a
            if (r13 == 0) goto L_0x0237
            androidx.constraintlayout.widget.a r0 = (androidx.constraintlayout.widget.a) r0
            v.g r13 = r6.f1141c
            boolean r13 = r13.f26294w0
            r0.j(r14, r13)
        L_0x0237:
            boolean r0 = r15.f1163d0
            if (r0 == 0) goto L_0x0277
            v.h r14 = (v.h) r14
            int r0 = r15.f1183n0
            int r1 = r15.f1185o0
            float r2 = r15.f1187p0
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x0254
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0269
            r14.f26298r0 = r2
            r14.f26299s0 = r12
            r14.f26300t0 = r12
            goto L_0x0269
        L_0x0254:
            if (r0 == r12) goto L_0x025f
            if (r0 <= r12) goto L_0x0269
            r14.f26298r0 = r3
            r14.f26299s0 = r0
            r14.f26300t0 = r12
            goto L_0x0269
        L_0x025f:
            if (r1 == r12) goto L_0x0269
            if (r1 <= r12) goto L_0x0269
            r14.f26298r0 = r3
            r14.f26299s0 = r12
            r14.f26300t0 = r1
        L_0x0269:
            r19 = r7
            r18 = r9
            r20 = r10
            r17 = r11
            r0 = 2
            r3 = -1
            r4 = 0
            r5 = 1
            goto L_0x0571
        L_0x0277:
            int r0 = r15.f1169g0
            int r13 = r15.f1171h0
            int r8 = r15.f1173i0
            int r12 = r15.f1175j0
            int r6 = r15.f1177k0
            r17 = r11
            int r11 = r15.f1179l0
            r18 = r9
            float r9 = r15.f1181m0
            r19 = r7
            int r7 = r15.f1186p
            r20 = r10
            r10 = -1
            if (r7 == r10) goto L_0x02b5
            java.lang.Object r0 = r3.get(r7)
            v.f r0 = (v.f) r0
            if (r0 == 0) goto L_0x02af
            float r3 = r15.f1190r
            int r6 = r15.f1188q
            v.d$a r7 = v.d.a.CENTER
            v.d r8 = r14.i(r7)
            v.d r0 = r0.i(r7)
            r7 = 0
            r9 = 1
            r8.a(r0, r6, r7, r9)
            r14.D = r3
        L_0x02af:
            r10 = r1
            r11 = r2
            r12 = r4
            r6 = r5
            goto L_0x03d1
        L_0x02b5:
            r7 = -1
            if (r0 == r7) goto L_0x02cf
            java.lang.Object r0 = r3.get(r0)
            v.f r0 = (v.f) r0
            if (r0 == 0) goto L_0x02e8
            int r10 = r15.leftMargin
            v.d r13 = r14.i(r4)
            v.d r0 = r0.i(r4)
            r7 = 1
            r13.a(r0, r10, r6, r7)
            goto L_0x02e8
        L_0x02cf:
            r0 = -1
            r7 = 1
            if (r13 == r0) goto L_0x02e9
            java.lang.Object r0 = r3.get(r13)
            v.f r0 = (v.f) r0
            if (r0 == 0) goto L_0x02e8
            int r10 = r15.leftMargin
            v.d r13 = r14.i(r4)
            v.d r0 = r0.i(r5)
            r13.a(r0, r10, r6, r7)
        L_0x02e8:
            r0 = -1
        L_0x02e9:
            if (r8 == r0) goto L_0x0302
            java.lang.Object r6 = r3.get(r8)
            v.f r6 = (v.f) r6
            if (r6 == 0) goto L_0x031a
            int r7 = r15.rightMargin
            v.d r8 = r14.i(r5)
            v.d r6 = r6.i(r4)
            r10 = 1
            r8.a(r6, r7, r11, r10)
            goto L_0x031a
        L_0x0302:
            r10 = 1
            if (r12 == r0) goto L_0x031a
            java.lang.Object r0 = r3.get(r12)
            v.f r0 = (v.f) r0
            if (r0 == 0) goto L_0x031a
            int r6 = r15.rightMargin
            v.d r7 = r14.i(r5)
            v.d r0 = r0.i(r5)
            r7.a(r0, r6, r11, r10)
        L_0x031a:
            int r0 = r15.f1172i
            r6 = -1
            if (r0 == r6) goto L_0x0338
            java.lang.Object r0 = r3.get(r0)
            v.f r0 = (v.f) r0
            if (r0 == 0) goto L_0x0355
            int r6 = r15.topMargin
            int r7 = r15.f1196x
            v.d r8 = r14.i(r1)
            v.d r0 = r0.i(r1)
            r10 = 1
            r8.a(r0, r6, r7, r10)
            goto L_0x0355
        L_0x0338:
            int r0 = r15.f1174j
            r6 = -1
            if (r0 == r6) goto L_0x0355
            java.lang.Object r0 = r3.get(r0)
            v.f r0 = (v.f) r0
            if (r0 == 0) goto L_0x0355
            int r6 = r15.topMargin
            int r7 = r15.f1196x
            v.d r8 = r14.i(r1)
            v.d r0 = r0.i(r2)
            r10 = 1
            r8.a(r0, r6, r7, r10)
        L_0x0355:
            int r0 = r15.f1176k
            r6 = -1
            if (r0 == r6) goto L_0x0373
            java.lang.Object r0 = r3.get(r0)
            v.f r0 = (v.f) r0
            if (r0 == 0) goto L_0x0390
            int r6 = r15.bottomMargin
            int r7 = r15.f1198z
            v.d r8 = r14.i(r2)
            v.d r0 = r0.i(r1)
            r10 = 1
            r8.a(r0, r6, r7, r10)
            goto L_0x0390
        L_0x0373:
            int r0 = r15.f1178l
            r6 = -1
            if (r0 == r6) goto L_0x0390
            java.lang.Object r0 = r3.get(r0)
            v.f r0 = (v.f) r0
            if (r0 == 0) goto L_0x0390
            int r6 = r15.bottomMargin
            int r7 = r15.f1198z
            v.d r8 = r14.i(r2)
            v.d r0 = r0.i(r2)
            r10 = 1
            r8.a(r0, r6, r7, r10)
        L_0x0390:
            int r6 = r15.f1180m
            r7 = -1
            if (r6 == r7) goto L_0x03a5
            v.d$a r8 = v.d.a.BASELINE
            r0 = r21
            r10 = r1
            r1 = r14
            r11 = r2
            r2 = r15
            r12 = r4
            r4 = r6
            r6 = r5
            r5 = r8
            r0.q(r1, r2, r3, r4, r5)
            goto L_0x03c2
        L_0x03a5:
            r10 = r1
            r11 = r2
            r12 = r4
            r6 = r5
            int r4 = r15.f1182n
            if (r4 == r7) goto L_0x03b6
            r0 = r21
            r1 = r14
            r2 = r15
            r5 = r10
            r0.q(r1, r2, r3, r4, r5)
            goto L_0x03c2
        L_0x03b6:
            int r4 = r15.f1184o
            if (r4 == r7) goto L_0x03c2
            r0 = r21
            r1 = r14
            r2 = r15
            r5 = r11
            r0.q(r1, r2, r3, r4, r5)
        L_0x03c2:
            r0 = 0
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 < 0) goto L_0x03c9
            r14.f26258f0 = r9
        L_0x03c9:
            float r1 = r15.F
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x03d1
            r14.f26260g0 = r1
        L_0x03d1:
            if (r20 == 0) goto L_0x03e2
            int r0 = r15.T
            r1 = -1
            if (r0 != r1) goto L_0x03dc
            int r2 = r15.U
            if (r2 == r1) goto L_0x03e2
        L_0x03dc:
            int r1 = r15.U
            r14.f26248a0 = r0
            r14.f26250b0 = r1
        L_0x03e2:
            boolean r0 = r15.f1157a0
            r1 = -2
            r2 = 3
            if (r0 != 0) goto L_0x0416
            int r0 = r15.width
            r3 = -1
            if (r0 != r3) goto L_0x040d
            boolean r0 = r15.W
            if (r0 == 0) goto L_0x03f7
            int[] r0 = r14.U
            r3 = 0
            r0[r3] = r2
            goto L_0x03fc
        L_0x03f7:
            r3 = 0
            int[] r0 = r14.U
            r0[r3] = r16
        L_0x03fc:
            v.d r0 = r14.i(r12)
            int r4 = r15.leftMargin
            r0.f26235g = r4
            v.d r0 = r14.i(r6)
            int r4 = r15.rightMargin
            r0.f26235g = r4
            goto L_0x042a
        L_0x040d:
            r3 = 0
            int[] r0 = r14.U
            r0[r3] = r2
            r14.S(r3)
            goto L_0x042a
        L_0x0416:
            r3 = 0
            int[] r0 = r14.U
            r4 = 1
            r0[r3] = r4
            int r0 = r15.width
            r14.S(r0)
            int r0 = r15.width
            if (r0 != r1) goto L_0x042a
            int[] r0 = r14.U
            r4 = 2
            r0[r3] = r4
        L_0x042a:
            boolean r0 = r15.f1159b0
            if (r0 != 0) goto L_0x045d
            int r0 = r15.height
            r3 = -1
            if (r0 != r3) goto L_0x0453
            boolean r0 = r15.X
            if (r0 == 0) goto L_0x043d
            int[] r0 = r14.U
            r4 = 1
            r0[r4] = r2
            goto L_0x0442
        L_0x043d:
            r4 = 1
            int[] r0 = r14.U
            r0[r4] = r16
        L_0x0442:
            v.d r0 = r14.i(r10)
            int r1 = r15.topMargin
            r0.f26235g = r1
            v.d r0 = r14.i(r11)
            int r1 = r15.bottomMargin
            r0.f26235g = r1
            goto L_0x0471
        L_0x0453:
            r4 = 1
            int[] r0 = r14.U
            r0[r4] = r2
            r0 = 0
            r14.N(r0)
            goto L_0x0471
        L_0x045d:
            r3 = -1
            r4 = 1
            int[] r0 = r14.U
            r0[r4] = r4
            int r0 = r15.height
            r14.N(r0)
            int r0 = r15.height
            if (r0 != r1) goto L_0x0471
            int[] r0 = r14.U
            r1 = 2
            r0[r4] = r1
        L_0x0471:
            java.lang.String r0 = r15.G
            if (r0 == 0) goto L_0x0509
            int r1 = r0.length()
            if (r1 != 0) goto L_0x047d
            goto L_0x0509
        L_0x047d:
            int r1 = r0.length()
            r4 = 44
            int r4 = r0.indexOf(r4)
            if (r4 <= 0) goto L_0x04ab
            int r5 = r1 + -1
            if (r4 >= r5) goto L_0x04ab
            r5 = 0
            java.lang.String r6 = r0.substring(r5, r4)
            java.lang.String r5 = "W"
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x049c
            r5 = 0
            goto L_0x04a7
        L_0x049c:
            java.lang.String r5 = "H"
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x04a6
            r5 = 1
            goto L_0x04a7
        L_0x04a6:
            r5 = -1
        L_0x04a7:
            int r4 = r4 + 1
            r10 = r5
            goto L_0x04ad
        L_0x04ab:
            r4 = 0
            r10 = -1
        L_0x04ad:
            r5 = 58
            int r5 = r0.indexOf(r5)
            if (r5 < 0) goto L_0x04ef
            int r1 = r1 + -1
            if (r5 >= r1) goto L_0x04ef
            java.lang.String r1 = r0.substring(r4, r5)
            int r5 = r5 + 1
            java.lang.String r0 = r0.substring(r5)
            int r4 = r1.length()
            if (r4 <= 0) goto L_0x04fe
            int r4 = r0.length()
            if (r4 <= 0) goto L_0x04fe
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x04fe }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x04fe }
            r4 = 0
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x04fe
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x04fe
            r4 = 1
            if (r10 != r4) goto L_0x04e9
            float r0 = r0 / r1
            float r0 = java.lang.Math.abs(r0)     // Catch:{ NumberFormatException -> 0x04fe }
            goto L_0x04ff
        L_0x04e9:
            float r1 = r1 / r0
            float r0 = java.lang.Math.abs(r1)     // Catch:{ NumberFormatException -> 0x04fe }
            goto L_0x04ff
        L_0x04ef:
            java.lang.String r0 = r0.substring(r4)
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x04fe
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x04fe }
            goto L_0x04ff
        L_0x04fe:
            r0 = 0
        L_0x04ff:
            r1 = 0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x050c
            r14.Y = r0
            r14.Z = r10
            goto L_0x050c
        L_0x0509:
            r1 = 0
            r14.Y = r1
        L_0x050c:
            float r0 = r15.H
            float[] r1 = r14.f26272m0
            r4 = 0
            r1[r4] = r0
            float r0 = r15.I
            r5 = 1
            r1[r5] = r0
            int r0 = r15.J
            r14.f26268k0 = r0
            int r0 = r15.K
            r14.f26270l0 = r0
            int r0 = r15.Z
            if (r0 < 0) goto L_0x0528
            if (r0 > r2) goto L_0x0528
            r14.f26279q = r0
        L_0x0528:
            int r0 = r15.L
            int r1 = r15.N
            int r2 = r15.P
            float r6 = r15.R
            r14.f26281r = r0
            r14.f26284u = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r1) goto L_0x053a
            r2 = 0
        L_0x053a:
            r14.f26285v = r2
            r14.f26286w = r6
            r2 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 <= 0) goto L_0x054e
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x054e
            if (r0 != 0) goto L_0x054e
            r0 = 2
            r14.f26281r = r0
        L_0x054e:
            int r0 = r15.M
            int r6 = r15.O
            int r7 = r15.Q
            float r8 = r15.S
            r14.f26282s = r0
            r14.f26287x = r6
            if (r7 != r1) goto L_0x055d
            r7 = 0
        L_0x055d:
            r14.f26288y = r7
            r14.f26289z = r8
            r1 = 0
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0570
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0570
            if (r0 != 0) goto L_0x0570
            r0 = 2
            r14.f26282s = r0
            goto L_0x0571
        L_0x0570:
            r0 = 2
        L_0x0571:
            int r7 = r19 + 1
            r6 = r21
            r11 = r17
            r9 = r18
            r10 = r20
            r8 = 1
            r12 = -1
            r13 = 2
            goto L_0x01dd
        L_0x0580:
            r18 = r9
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.r():boolean");
    }

    public void requestLayout() {
        this.f1146h = true;
        super.requestLayout();
    }

    public void setConstraintSet(b bVar) {
        this.f1148r = bVar;
    }

    public void setId(int i10) {
        this.f1139a.remove(getId());
        super.setId(i10);
        this.f1139a.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 != this.f1145g) {
            this.f1145g = i10;
            requestLayout();
        }
    }

    public void setMaxWidth(int i10) {
        if (i10 != this.f1144f) {
            this.f1144f = i10;
            requestLayout();
        }
    }

    public void setMinHeight(int i10) {
        if (i10 != this.f1143e) {
            this.f1143e = i10;
            requestLayout();
        }
    }

    public void setMinWidth(int i10) {
        if (i10 != this.f1142d) {
            this.f1142d = i10;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(c cVar) {
        y.b bVar = this.f1149s;
        if (bVar != null) {
            bVar.getClass();
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f1147i = i10;
        g gVar = this.f1141c;
        gVar.E0 = i10;
        t.c.f25279p = gVar.f0(512);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f(attributeSet, i10, 0);
    }

    public static class a extends ViewGroup.MarginLayoutParams {
        public int A = Integer.MIN_VALUE;
        public int B = Integer.MIN_VALUE;
        public int C = Integer.MIN_VALUE;
        public int D = 0;
        public float E = 0.5f;
        public float F = 0.5f;
        public String G = null;
        public float H = -1.0f;
        public float I = -1.0f;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = 0;
        public int P = 0;
        public int Q = 0;
        public float R = 1.0f;
        public float S = 1.0f;
        public int T = -1;
        public int U = -1;
        public int V = -1;
        public boolean W = false;
        public boolean X = false;
        public String Y = null;
        public int Z = 0;

        /* renamed from: a  reason: collision with root package name */
        public int f1156a = -1;

        /* renamed from: a0  reason: collision with root package name */
        public boolean f1157a0 = true;

        /* renamed from: b  reason: collision with root package name */
        public int f1158b = -1;

        /* renamed from: b0  reason: collision with root package name */
        public boolean f1159b0 = true;

        /* renamed from: c  reason: collision with root package name */
        public float f1160c = -1.0f;

        /* renamed from: c0  reason: collision with root package name */
        public boolean f1161c0 = false;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1162d = true;

        /* renamed from: d0  reason: collision with root package name */
        public boolean f1163d0 = false;

        /* renamed from: e  reason: collision with root package name */
        public int f1164e = -1;

        /* renamed from: e0  reason: collision with root package name */
        public boolean f1165e0 = false;

        /* renamed from: f  reason: collision with root package name */
        public int f1166f = -1;

        /* renamed from: f0  reason: collision with root package name */
        public boolean f1167f0 = false;

        /* renamed from: g  reason: collision with root package name */
        public int f1168g = -1;

        /* renamed from: g0  reason: collision with root package name */
        public int f1169g0 = -1;

        /* renamed from: h  reason: collision with root package name */
        public int f1170h = -1;

        /* renamed from: h0  reason: collision with root package name */
        public int f1171h0 = -1;

        /* renamed from: i  reason: collision with root package name */
        public int f1172i = -1;

        /* renamed from: i0  reason: collision with root package name */
        public int f1173i0 = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f1174j = -1;

        /* renamed from: j0  reason: collision with root package name */
        public int f1175j0 = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f1176k = -1;

        /* renamed from: k0  reason: collision with root package name */
        public int f1177k0 = Integer.MIN_VALUE;

        /* renamed from: l  reason: collision with root package name */
        public int f1178l = -1;

        /* renamed from: l0  reason: collision with root package name */
        public int f1179l0 = Integer.MIN_VALUE;

        /* renamed from: m  reason: collision with root package name */
        public int f1180m = -1;

        /* renamed from: m0  reason: collision with root package name */
        public float f1181m0 = 0.5f;

        /* renamed from: n  reason: collision with root package name */
        public int f1182n = -1;

        /* renamed from: n0  reason: collision with root package name */
        public int f1183n0;

        /* renamed from: o  reason: collision with root package name */
        public int f1184o = -1;

        /* renamed from: o0  reason: collision with root package name */
        public int f1185o0;

        /* renamed from: p  reason: collision with root package name */
        public int f1186p = -1;

        /* renamed from: p0  reason: collision with root package name */
        public float f1187p0;

        /* renamed from: q  reason: collision with root package name */
        public int f1188q = 0;

        /* renamed from: q0  reason: collision with root package name */
        public v.f f1189q0 = new v.f();

        /* renamed from: r  reason: collision with root package name */
        public float f1190r = 0.0f;

        /* renamed from: s  reason: collision with root package name */
        public int f1191s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f1192t = -1;

        /* renamed from: u  reason: collision with root package name */
        public int f1193u = -1;

        /* renamed from: v  reason: collision with root package name */
        public int f1194v = -1;

        /* renamed from: w  reason: collision with root package name */
        public int f1195w = Integer.MIN_VALUE;

        /* renamed from: x  reason: collision with root package name */
        public int f1196x = Integer.MIN_VALUE;

        /* renamed from: y  reason: collision with root package name */
        public int f1197y = Integer.MIN_VALUE;

        /* renamed from: z  reason: collision with root package name */
        public int f1198z = Integer.MIN_VALUE;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a  reason: collision with other inner class name */
        public static class C0013a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f1199a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1199a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(103, 49);
                sparseIntArray.append(104, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(108, 21);
                sparseIntArray.append(111, 22);
                sparseIntArray.append(109, 23);
                sparseIntArray.append(106, 24);
                sparseIntArray.append(110, 25);
                sparseIntArray.append(107, 26);
                sparseIntArray.append(105, 55);
                sparseIntArray.append(112, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(101, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(102, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(114, 66);
            }
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.f27962b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = C0013a.f1199a.get(index);
                switch (i11) {
                    case 1:
                        this.V = obtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f1186p);
                        this.f1186p = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.f1186p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.f1188q = obtainStyledAttributes.getDimensionPixelSize(index, this.f1188q);
                        break;
                    case 4:
                        float f10 = obtainStyledAttributes.getFloat(index, this.f1190r) % 360.0f;
                        this.f1190r = f10;
                        if (f10 >= 0.0f) {
                            break;
                        } else {
                            this.f1190r = (360.0f - f10) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f1156a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1156a);
                        break;
                    case 6:
                        this.f1158b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1158b);
                        break;
                    case 7:
                        this.f1160c = obtainStyledAttributes.getFloat(index, this.f1160c);
                        break;
                    case b4.f10106f /*8*/:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f1164e);
                        this.f1164e = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            this.f1164e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f1166f);
                        this.f1166f = resourceId3;
                        if (resourceId3 != -1) {
                            break;
                        } else {
                            this.f1166f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f1168g);
                        this.f1168g = resourceId4;
                        if (resourceId4 != -1) {
                            break;
                        } else {
                            this.f1168g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f1170h);
                        this.f1170h = resourceId5;
                        if (resourceId5 != -1) {
                            break;
                        } else {
                            this.f1170h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f1172i);
                        this.f1172i = resourceId6;
                        if (resourceId6 != -1) {
                            break;
                        } else {
                            this.f1172i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f1174j);
                        this.f1174j = resourceId7;
                        if (resourceId7 != -1) {
                            break;
                        } else {
                            this.f1174j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f1176k);
                        this.f1176k = resourceId8;
                        if (resourceId8 != -1) {
                            break;
                        } else {
                            this.f1176k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f1178l);
                        this.f1178l = resourceId9;
                        if (resourceId9 != -1) {
                            break;
                        } else {
                            this.f1178l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f1180m);
                        this.f1180m = resourceId10;
                        if (resourceId10 != -1) {
                            break;
                        } else {
                            this.f1180m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f1191s);
                        this.f1191s = resourceId11;
                        if (resourceId11 != -1) {
                            break;
                        } else {
                            this.f1191s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f1192t);
                        this.f1192t = resourceId12;
                        if (resourceId12 != -1) {
                            break;
                        } else {
                            this.f1192t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f1193u);
                        this.f1193u = resourceId13;
                        if (resourceId13 != -1) {
                            break;
                        } else {
                            this.f1193u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f1194v);
                        this.f1194v = resourceId14;
                        if (resourceId14 != -1) {
                            break;
                        } else {
                            this.f1194v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.f1195w = obtainStyledAttributes.getDimensionPixelSize(index, this.f1195w);
                        break;
                    case 22:
                        this.f1196x = obtainStyledAttributes.getDimensionPixelSize(index, this.f1196x);
                        break;
                    case 23:
                        this.f1197y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1197y);
                        break;
                    case 24:
                        this.f1198z = obtainStyledAttributes.getDimensionPixelSize(index, this.f1198z);
                        break;
                    case 25:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.W = obtainStyledAttributes.getBoolean(index, this.W);
                        break;
                    case 28:
                        this.X = obtainStyledAttributes.getBoolean(index, this.X);
                        break;
                    case 29:
                        this.E = obtainStyledAttributes.getFloat(index, this.E);
                        break;
                    case 30:
                        this.F = obtainStyledAttributes.getFloat(index, this.F);
                        break;
                    case 31:
                        int i12 = obtainStyledAttributes.getInt(index, 0);
                        this.L = i12;
                        if (i12 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        }
                    case 32:
                        int i13 = obtainStyledAttributes.getInt(index, 0);
                        this.M = i13;
                        if (i13 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        }
                    case 33:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.N) != -2) {
                                break;
                            } else {
                                this.N = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.P) != -2) {
                                break;
                            } else {
                                this.P = -2;
                                break;
                            }
                        }
                    case 35:
                        this.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.R));
                        this.L = 2;
                        break;
                    case 36:
                        try {
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.O) != -2) {
                                break;
                            } else {
                                this.O = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.Q) != -2) {
                                break;
                            } else {
                                this.Q = -2;
                                break;
                            }
                        }
                    case 38:
                        this.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.S));
                        this.M = 2;
                        break;
                    default:
                        switch (i11) {
                            case 44:
                                b.h(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.H = obtainStyledAttributes.getFloat(index, this.H);
                                break;
                            case 46:
                                this.I = obtainStyledAttributes.getFloat(index, this.I);
                                break;
                            case 47:
                                this.J = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.K = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.T = obtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                                break;
                            case 50:
                                this.U = obtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                                break;
                            case 51:
                                this.Y = obtainStyledAttributes.getString(index);
                                break;
                            case ModuleDescriptor.MODULE_VERSION /*52*/:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f1182n);
                                this.f1182n = resourceId15;
                                if (resourceId15 != -1) {
                                    break;
                                } else {
                                    this.f1182n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f1184o);
                                this.f1184o = resourceId16;
                                if (resourceId16 != -1) {
                                    break;
                                } else {
                                    this.f1184o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 54:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i11) {
                                    case 64:
                                        b.g(this, obtainStyledAttributes, index, 0);
                                        break;
                                    case 65:
                                        b.g(this, obtainStyledAttributes, index, 1);
                                        break;
                                    case 66:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 67:
                                        this.f1162d = obtainStyledAttributes.getBoolean(index, this.f1162d);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public void a() {
            this.f1163d0 = false;
            this.f1157a0 = true;
            this.f1159b0 = true;
            int i10 = this.width;
            if (i10 == -2 && this.W) {
                this.f1157a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            int i11 = this.height;
            if (i11 == -2 && this.X) {
                this.f1159b0 = false;
                if (this.M == 0) {
                    this.M = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f1157a0 = false;
                if (i10 == 0 && this.L == 1) {
                    this.width = -2;
                    this.W = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f1159b0 = false;
                if (i11 == 0 && this.M == 1) {
                    this.height = -2;
                    this.X = true;
                }
            }
            if (this.f1160c != -1.0f || this.f1156a != -1 || this.f1158b != -1) {
                this.f1163d0 = true;
                this.f1157a0 = true;
                this.f1159b0 = true;
                if (!(this.f1189q0 instanceof h)) {
                    this.f1189q0 = new h();
                }
                ((h) this.f1189q0).W(this.V);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0055  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0086  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r11) {
            /*
                r10 = this;
                int r0 = r10.leftMargin
                int r1 = r10.rightMargin
                super.resolveLayoutDirection(r11)
                int r11 = r10.getLayoutDirection()
                r2 = 0
                r3 = 1
                if (r3 != r11) goto L_0x0011
                r11 = 1
                goto L_0x0012
            L_0x0011:
                r11 = 0
            L_0x0012:
                r4 = -1
                r10.f1173i0 = r4
                r10.f1175j0 = r4
                r10.f1169g0 = r4
                r10.f1171h0 = r4
                r10.f1177k0 = r4
                r10.f1179l0 = r4
                int r5 = r10.f1195w
                r10.f1177k0 = r5
                int r5 = r10.f1197y
                r10.f1179l0 = r5
                float r5 = r10.E
                r10.f1181m0 = r5
                int r6 = r10.f1156a
                r10.f1183n0 = r6
                int r7 = r10.f1158b
                r10.f1185o0 = r7
                float r8 = r10.f1160c
                r10.f1187p0 = r8
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r11 == 0) goto L_0x0098
                int r11 = r10.f1191s
                if (r11 == r4) goto L_0x0043
                r10.f1173i0 = r11
            L_0x0041:
                r2 = 1
                goto L_0x004a
            L_0x0043:
                int r11 = r10.f1192t
                if (r11 == r4) goto L_0x004a
                r10.f1175j0 = r11
                goto L_0x0041
            L_0x004a:
                int r11 = r10.f1193u
                if (r11 == r4) goto L_0x0051
                r10.f1171h0 = r11
                r2 = 1
            L_0x0051:
                int r11 = r10.f1194v
                if (r11 == r4) goto L_0x0058
                r10.f1169g0 = r11
                r2 = 1
            L_0x0058:
                int r11 = r10.A
                if (r11 == r9) goto L_0x005e
                r10.f1179l0 = r11
            L_0x005e:
                int r11 = r10.B
                if (r11 == r9) goto L_0x0064
                r10.f1177k0 = r11
            L_0x0064:
                r11 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L_0x006c
                float r2 = r11 - r5
                r10.f1181m0 = r2
            L_0x006c:
                boolean r2 = r10.f1163d0
                if (r2 == 0) goto L_0x00bc
                int r2 = r10.V
                if (r2 != r3) goto L_0x00bc
                boolean r2 = r10.f1162d
                if (r2 == 0) goto L_0x00bc
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L_0x0086
                float r11 = r11 - r8
                r10.f1187p0 = r11
                r10.f1183n0 = r4
                r10.f1185o0 = r4
                goto L_0x00bc
            L_0x0086:
                if (r6 == r4) goto L_0x008f
                r10.f1185o0 = r6
                r10.f1183n0 = r4
                r10.f1187p0 = r2
                goto L_0x00bc
            L_0x008f:
                if (r7 == r4) goto L_0x00bc
                r10.f1183n0 = r7
                r10.f1185o0 = r4
                r10.f1187p0 = r2
                goto L_0x00bc
            L_0x0098:
                int r11 = r10.f1191s
                if (r11 == r4) goto L_0x009e
                r10.f1171h0 = r11
            L_0x009e:
                int r11 = r10.f1192t
                if (r11 == r4) goto L_0x00a4
                r10.f1169g0 = r11
            L_0x00a4:
                int r11 = r10.f1193u
                if (r11 == r4) goto L_0x00aa
                r10.f1173i0 = r11
            L_0x00aa:
                int r11 = r10.f1194v
                if (r11 == r4) goto L_0x00b0
                r10.f1175j0 = r11
            L_0x00b0:
                int r11 = r10.A
                if (r11 == r9) goto L_0x00b6
                r10.f1177k0 = r11
            L_0x00b6:
                int r11 = r10.B
                if (r11 == r9) goto L_0x00bc
                r10.f1179l0 = r11
            L_0x00bc:
                int r11 = r10.f1193u
                if (r11 != r4) goto L_0x0106
                int r11 = r10.f1194v
                if (r11 != r4) goto L_0x0106
                int r11 = r10.f1192t
                if (r11 != r4) goto L_0x0106
                int r11 = r10.f1191s
                if (r11 != r4) goto L_0x0106
                int r11 = r10.f1168g
                if (r11 == r4) goto L_0x00db
                r10.f1173i0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e9
                if (r1 <= 0) goto L_0x00e9
                r10.rightMargin = r1
                goto L_0x00e9
            L_0x00db:
                int r11 = r10.f1170h
                if (r11 == r4) goto L_0x00e9
                r10.f1175j0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e9
                if (r1 <= 0) goto L_0x00e9
                r10.rightMargin = r1
            L_0x00e9:
                int r11 = r10.f1164e
                if (r11 == r4) goto L_0x00f8
                r10.f1169g0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x0106
                if (r0 <= 0) goto L_0x0106
                r10.leftMargin = r0
                goto L_0x0106
            L_0x00f8:
                int r11 = r10.f1166f
                if (r11 == r4) goto L_0x0106
                r10.f1171h0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x0106
                if (r0 <= 0) goto L_0x0106
                r10.leftMargin = r0
            L_0x0106:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.resolveLayoutDirection(int):void");
        }

        public a(int i10, int i11) {
            super(i10, i11);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
