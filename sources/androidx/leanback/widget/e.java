package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.leanback.widget.e0;
import androidx.leanback.widget.t1;
import androidx.leanback.widget.y;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import java.util.ArrayList;

/* compiled from: BaseGridView */
public abstract class e extends RecyclerView {
    public final p T0;
    public boolean U0 = true;
    public boolean V0 = true;
    public RecyclerView.j W0;
    public d X0;
    public c Y0;
    public b Z0;

    /* renamed from: a1  reason: collision with root package name */
    public RecyclerView.t f2348a1;

    /* renamed from: b1  reason: collision with root package name */
    public C0029e f2349b1;

    /* renamed from: c1  reason: collision with root package name */
    public int f2350c1 = 4;

    /* compiled from: BaseGridView */
    public class a implements RecyclerView.t {
        public a() {
        }

        public void a(RecyclerView.a0 a0Var) {
            p pVar = e.this.T0;
            pVar.getClass();
            int g10 = a0Var.g();
            if (g10 != -1) {
                s1 s1Var = pVar.f2465d0;
                View view = a0Var.f2842a;
                int i10 = s1Var.f2521a;
                if (i10 == 1) {
                    s1Var.c(g10);
                } else if ((i10 == 2 || i10 == 3) && s1Var.f2523c != null) {
                    String num = Integer.toString(g10);
                    SparseArray sparseArray = new SparseArray();
                    view.saveHierarchyState(sparseArray);
                    s1Var.f2523c.c(num, sparseArray);
                }
            }
            RecyclerView.t tVar = e.this.f2348a1;
            if (tVar != null) {
                tVar.a(a0Var);
            }
        }
    }

    /* compiled from: BaseGridView */
    public interface b {
        boolean a(KeyEvent keyEvent);
    }

    /* compiled from: BaseGridView */
    public interface c {
        boolean a(MotionEvent motionEvent);
    }

    /* compiled from: BaseGridView */
    public interface d {
        boolean a(MotionEvent motionEvent);
    }

    /* renamed from: androidx.leanback.widget.e$e  reason: collision with other inner class name */
    /* compiled from: BaseGridView */
    public interface C0029e {
    }

    public e(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p pVar = new p(this);
        this.T0 = pVar;
        setLayoutManager(pVar);
        setPreserveFocusAfterLayout(false);
        setDescendantFocusability(262144);
        setHasFixedSize(true);
        setChildrenDrawingOrderEnabled(true);
        setWillNotDraw(true);
        setOverScrollMode(2);
        ((x) getItemAnimator()).f3144g = false;
        super.setRecyclerListener(new a());
    }

    public boolean dispatchGenericFocusedEvent(MotionEvent motionEvent) {
        c cVar = this.Y0;
        if (cVar == null || !cVar.a(motionEvent)) {
            return super.dispatchGenericFocusedEvent(motionEvent);
        }
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        b bVar = this.Z0;
        if ((bVar != null && bVar.a(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        C0029e eVar = this.f2349b1;
        if (eVar == null) {
            return false;
        }
        ((e0.b) eVar).f2366a.getClass();
        return false;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        d dVar = this.X0;
        if (dVar == null || !dVar.a(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public View focusSearch(int i10) {
        if (isFocused()) {
            p pVar = this.T0;
            View v10 = pVar.v(pVar.D);
            if (v10 != null) {
                return focusSearch(v10, i10);
            }
        }
        return super.focusSearch(i10);
    }

    public void g0(int i10) {
        p pVar = this.T0;
        if ((pVar.f2479z & 64) != 0) {
            pVar.Q1(i10, 0, false, 0);
        } else {
            super.g0(i10);
        }
    }

    public int getChildDrawingOrder(int i10, int i11) {
        int indexOfChild;
        p pVar = this.T0;
        View v10 = pVar.v(pVar.D);
        if (v10 == null || i11 < (indexOfChild = indexOfChild(v10))) {
            return i11;
        }
        if (i11 < i10 - 1) {
            indexOfChild = ((indexOfChild + i10) - 1) - i11;
        }
        return indexOfChild;
    }

    public int getExtraLayoutSpace() {
        return this.T0.f2463b0;
    }

    public int getFocusScrollStrategy() {
        return this.T0.X;
    }

    @Deprecated
    public int getHorizontalMargin() {
        return this.T0.P;
    }

    public int getHorizontalSpacing() {
        return this.T0.P;
    }

    public int getInitialPrefetchItemCount() {
        return this.f2350c1;
    }

    public int getItemAlignmentOffset() {
        return this.T0.Z.f2563c.f2583b;
    }

    public float getItemAlignmentOffsetPercent() {
        return this.T0.Z.f2563c.f2584c;
    }

    public int getItemAlignmentViewId() {
        return this.T0.Z.f2563c.f2582a;
    }

    public C0029e getOnUnhandledKeyListener() {
        return this.f2349b1;
    }

    public final int getSaveChildrenLimitNumber() {
        return this.T0.f2465d0.f2522b;
    }

    public final int getSaveChildrenPolicy() {
        return this.T0.f2465d0.f2521a;
    }

    public int getSelectedPosition() {
        return this.T0.D;
    }

    public int getSelectedSubPosition() {
        return this.T0.E;
    }

    @Deprecated
    public int getVerticalMargin() {
        return this.T0.Q;
    }

    public int getVerticalSpacing() {
        return this.T0.Q;
    }

    public int getWindowAlignment() {
        return this.T0.Y.f2531c.f2538f;
    }

    public int getWindowAlignmentOffset() {
        return this.T0.Y.f2531c.f2539g;
    }

    public float getWindowAlignmentOffsetPercent() {
        return this.T0.Y.f2531c.f2540h;
    }

    public boolean hasOverlappingRendering() {
        return this.V0;
    }

    public void k0(int i10) {
        p pVar = this.T0;
        if ((pVar.f2479z & 64) != 0) {
            pVar.Q1(i10, 0, false, 0);
        } else {
            super.k0(i10);
        }
    }

    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        p pVar = this.T0;
        pVar.getClass();
        if (z10) {
            int i11 = pVar.D;
            while (true) {
                View v10 = pVar.v(i11);
                if (v10 != null) {
                    if (v10.getVisibility() != 0 || !v10.hasFocusable()) {
                        i11++;
                    } else {
                        v10.requestFocus();
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        p pVar = this.T0;
        int i12 = pVar.X;
        if (i12 == 1 || i12 == 2) {
            int A = pVar.A();
            int i13 = -1;
            if ((i10 & 2) != 0) {
                i11 = 0;
                i13 = 1;
            } else {
                i11 = A - 1;
                A = -1;
            }
            t1.a aVar = pVar.Y.f2531c;
            int i14 = aVar.f2542j;
            int b10 = aVar.b() + i14;
            while (i11 != A) {
                View z10 = pVar.z(i11);
                if (z10.getVisibility() == 0 && pVar.f2472s.e(z10) >= i14 && pVar.f2472s.b(z10) <= b10 && z10.requestFocus(i10, rect)) {
                    return true;
                }
                i11 += i13;
            }
            return false;
        }
        View v10 = pVar.v(pVar.D);
        if (v10 != null) {
            return v10.requestFocus(i10, rect);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRtlPropertiesChanged(int r7) {
        /*
            r6 = this;
            androidx.leanback.widget.p r0 = r6.T0
            int r1 = r0.f2471r
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x000d
            if (r7 != r2) goto L_0x0012
            r1 = 262144(0x40000, float:3.67342E-40)
            goto L_0x0013
        L_0x000d:
            if (r7 != r2) goto L_0x0012
            r1 = 524288(0x80000, float:7.34684E-40)
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            int r4 = r0.f2479z
            r5 = 786432(0xc0000, float:1.102026E-39)
            r5 = r5 & r4
            if (r5 != r1) goto L_0x001b
            goto L_0x0030
        L_0x001b:
            r5 = -786433(0xfffffffffff3ffff, float:NaN)
            r4 = r4 & r5
            r1 = r1 | r4
            r0.f2479z = r1
            r1 = r1 | 256(0x100, float:3.59E-43)
            r0.f2479z = r1
            androidx.leanback.widget.t1 r0 = r0.Y
            androidx.leanback.widget.t1$a r0 = r0.f2530b
            if (r7 != r2) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r2 = 0
        L_0x002e:
            r0.f2544l = r2
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.e.onRtlPropertiesChanged(int):void");
    }

    public void q0(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e1.a.f13532f);
        boolean z10 = obtainStyledAttributes.getBoolean(4, false);
        boolean z11 = obtainStyledAttributes.getBoolean(3, false);
        p pVar = this.T0;
        pVar.f2479z = (z10 ? 2048 : 0) | (pVar.f2479z & -6145) | (z11 ? 4096 : 0);
        boolean z12 = obtainStyledAttributes.getBoolean(6, true);
        boolean z13 = obtainStyledAttributes.getBoolean(5, true);
        p pVar2 = this.T0;
        pVar2.f2479z = (z12 ? 8192 : 0) | (pVar2.f2479z & -24577) | (z13 ? 16384 : 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, obtainStyledAttributes.getDimensionPixelSize(8, 0));
        if (pVar2.f2471r == 1) {
            pVar2.Q = dimensionPixelSize;
            pVar2.R = dimensionPixelSize;
        } else {
            pVar2.Q = dimensionPixelSize;
            pVar2.S = dimensionPixelSize;
        }
        p pVar3 = this.T0;
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, obtainStyledAttributes.getDimensionPixelSize(7, 0));
        if (pVar3.f2471r == 0) {
            pVar3.P = dimensionPixelSize2;
            pVar3.R = dimensionPixelSize2;
        } else {
            pVar3.P = dimensionPixelSize2;
            pVar3.S = dimensionPixelSize2;
        }
        if (obtainStyledAttributes.hasValue(0)) {
            setGravity(obtainStyledAttributes.getInt(0, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public final boolean r0() {
        return isChildrenDrawingOrderEnabled();
    }

    public void setAnimateChildLayout(boolean z10) {
        if (this.U0 != z10) {
            this.U0 = z10;
            if (!z10) {
                this.W0 = getItemAnimator();
                super.setItemAnimator((RecyclerView.j) null);
                return;
            }
            super.setItemAnimator(this.W0);
        }
    }

    public void setChildrenVisibility(int i10) {
        p pVar = this.T0;
        pVar.J = i10;
        if (i10 != -1) {
            int A = pVar.A();
            for (int i11 = 0; i11 < A; i11++) {
                pVar.z(i11).setVisibility(pVar.J);
            }
        }
    }

    public void setExtraLayoutSpace(int i10) {
        p pVar = this.T0;
        int i11 = pVar.f2463b0;
        if (i11 != i10) {
            if (i11 >= 0) {
                pVar.f2463b0 = i10;
                pVar.I0();
                return;
            }
            throw new IllegalArgumentException("ExtraLayoutSpace must >= 0");
        }
    }

    public void setFocusDrawingOrderEnabled(boolean z10) {
        super.setChildrenDrawingOrderEnabled(z10);
    }

    public void setFocusScrollStrategy(int i10) {
        if (i10 == 0 || i10 == 1 || i10 == 2) {
            this.T0.X = i10;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Invalid scrollStrategy");
    }

    public final void setFocusSearchDisabled(boolean z10) {
        setDescendantFocusability(z10 ? 393216 : 262144);
        p pVar = this.T0;
        pVar.f2479z = (z10 ? 32768 : 0) | (pVar.f2479z & -32769);
    }

    public void setGravity(int i10) {
        this.T0.T = i10;
        requestLayout();
    }

    public void setHasOverlappingRendering(boolean z10) {
        this.V0 = z10;
    }

    @Deprecated
    public void setHorizontalMargin(int i10) {
        setHorizontalSpacing(i10);
    }

    public void setHorizontalSpacing(int i10) {
        p pVar = this.T0;
        if (pVar.f2471r == 0) {
            pVar.P = i10;
            pVar.R = i10;
        } else {
            pVar.P = i10;
            pVar.S = i10;
        }
        requestLayout();
    }

    public void setInitialPrefetchItemCount(int i10) {
        this.f2350c1 = i10;
    }

    public void setItemAlignmentOffset(int i10) {
        p pVar = this.T0;
        pVar.Z.f2563c.f2583b = i10;
        pVar.R1();
        requestLayout();
    }

    public void setItemAlignmentOffsetPercent(float f10) {
        p pVar = this.T0;
        y.a aVar = pVar.Z.f2563c;
        aVar.getClass();
        if ((f10 < 0.0f || f10 > 100.0f) && f10 != -1.0f) {
            throw new IllegalArgumentException();
        }
        aVar.f2584c = f10;
        pVar.R1();
        requestLayout();
    }

    public void setItemAlignmentOffsetWithPadding(boolean z10) {
        p pVar = this.T0;
        pVar.Z.f2563c.f2585d = z10;
        pVar.R1();
        requestLayout();
    }

    public void setItemAlignmentViewId(int i10) {
        p pVar = this.T0;
        pVar.Z.f2563c.f2582a = i10;
        pVar.R1();
    }

    @Deprecated
    public void setItemMargin(int i10) {
        setItemSpacing(i10);
    }

    public void setItemSpacing(int i10) {
        p pVar = this.T0;
        pVar.P = i10;
        pVar.Q = i10;
        pVar.S = i10;
        pVar.R = i10;
        requestLayout();
    }

    public void setLayoutEnabled(boolean z10) {
        p pVar = this.T0;
        int i10 = pVar.f2479z;
        int i11 = 0;
        if (((i10 & 512) != 0) != z10) {
            int i12 = i10 & -513;
            if (z10) {
                i11 = 512;
            }
            pVar.f2479z = i12 | i11;
            pVar.I0();
        }
    }

    public void setOnChildLaidOutListener(i0 i0Var) {
        this.T0.C = i0Var;
    }

    public void setOnChildSelectedListener(j0 j0Var) {
        this.T0.A = j0Var;
    }

    public void setOnChildViewHolderSelectedListener(k0 k0Var) {
        p pVar = this.T0;
        if (k0Var == null) {
            pVar.B = null;
            return;
        }
        ArrayList<k0> arrayList = pVar.B;
        if (arrayList == null) {
            pVar.B = new ArrayList<>();
        } else {
            arrayList.clear();
        }
        pVar.B.add(k0Var);
    }

    public void setOnKeyInterceptListener(b bVar) {
        this.Z0 = bVar;
    }

    public void setOnMotionInterceptListener(c cVar) {
        this.Y0 = cVar;
    }

    public void setOnTouchInterceptListener(d dVar) {
        this.X0 = dVar;
    }

    public void setOnUnhandledKeyListener(C0029e eVar) {
        this.f2349b1 = eVar;
    }

    public void setPruneChild(boolean z10) {
        p pVar = this.T0;
        int i10 = pVar.f2479z;
        int i11 = 65536;
        if (((i10 & 65536) != 0) != z10) {
            int i12 = i10 & -65537;
            if (!z10) {
                i11 = 0;
            }
            pVar.f2479z = i12 | i11;
            if (z10) {
                pVar.I0();
            }
        }
    }

    public void setRecyclerListener(RecyclerView.t tVar) {
        this.f2348a1 = tVar;
    }

    public final void setSaveChildrenLimitNumber(int i10) {
        s1 s1Var = this.T0.f2465d0;
        s1Var.f2522b = i10;
        s1Var.a();
    }

    public final void setSaveChildrenPolicy(int i10) {
        s1 s1Var = this.T0.f2465d0;
        s1Var.f2521a = i10;
        s1Var.a();
    }

    public void setScrollEnabled(boolean z10) {
        int i10;
        p pVar = this.T0;
        int i11 = pVar.f2479z;
        int i12 = 0;
        if (((i11 & 131072) != 0) != z10) {
            int i13 = i11 & -131073;
            if (z10) {
                i12 = 131072;
            }
            int i14 = i13 | i12;
            pVar.f2479z = i14;
            if ((i14 & 131072) != 0 && pVar.X == 0 && (i10 = pVar.D) != -1) {
                pVar.K1(i10, pVar.E, true, pVar.I);
            }
        }
    }

    public void setSelectedPosition(int i10) {
        this.T0.Q1(i10, 0, false, 0);
    }

    public void setSelectedPositionSmooth(int i10) {
        this.T0.Q1(i10, 0, true, 0);
    }

    @Deprecated
    public void setVerticalMargin(int i10) {
        setVerticalSpacing(i10);
    }

    public void setVerticalSpacing(int i10) {
        p pVar = this.T0;
        if (pVar.f2471r == 1) {
            pVar.Q = i10;
            pVar.R = i10;
        } else {
            pVar.Q = i10;
            pVar.S = i10;
        }
        requestLayout();
    }

    public void setWindowAlignment(int i10) {
        this.T0.Y.f2531c.f2538f = i10;
        requestLayout();
    }

    public void setWindowAlignmentOffset(int i10) {
        this.T0.Y.f2531c.f2539g = i10;
        requestLayout();
    }

    public void setWindowAlignmentOffsetPercent(float f10) {
        t1.a aVar = this.T0.Y.f2531c;
        aVar.getClass();
        if ((f10 < 0.0f || f10 > 100.0f) && f10 != -1.0f) {
            throw new IllegalArgumentException();
        }
        aVar.f2540h = f10;
        requestLayout();
    }

    public void setWindowAlignmentPreferKeyLineOverHighEdge(boolean z10) {
        t1.a aVar = this.T0.Y.f2531c;
        aVar.f2537e = z10 ? aVar.f2537e | 2 : aVar.f2537e & -3;
        requestLayout();
    }

    public void setWindowAlignmentPreferKeyLineOverLowEdge(boolean z10) {
        t1.a aVar = this.T0.Y.f2531c;
        aVar.f2537e = z10 ? aVar.f2537e | 1 : aVar.f2537e & -2;
        requestLayout();
    }
}
