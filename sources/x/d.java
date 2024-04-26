package x;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o0.p;
import x.e;
import y.b;

/* compiled from: MotionLayout */
public class d extends ConstraintLayout implements p {

    /* renamed from: d0  reason: collision with root package name */
    public static final /* synthetic */ int f27233d0 = 0;
    public float A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public float G;
    public long H;
    public float I;
    public c J;
    public b K;
    public boolean L;
    public ArrayList<c> M;
    public ArrayList<c> N;
    public CopyOnWriteArrayList<c> O;
    public int P;
    public float Q;
    public boolean R;
    public b S;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f27234a0;

    /* renamed from: b0  reason: collision with root package name */
    public C0273d f27235b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f27236c0;

    /* compiled from: MotionLayout */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            d.this.S.a();
        }
    }

    /* compiled from: MotionLayout */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public float f27238a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        public float f27239b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        public int f27240c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f27241d = -1;

        public b() {
        }

        public void a() {
            androidx.constraintlayout.widget.b bVar;
            b.a aVar;
            int a10;
            androidx.constraintlayout.widget.b bVar2;
            C0273d dVar = C0273d.SETUP;
            int i10 = this.f27240c;
            if (!(i10 == -1 && this.f27241d == -1)) {
                if (i10 == -1) {
                    d.this.w(this.f27241d);
                } else {
                    int i11 = this.f27241d;
                    if (i11 == -1) {
                        d dVar2 = d.this;
                        dVar2.setState(dVar);
                        dVar2.C = i10;
                        dVar2.B = -1;
                        dVar2.D = -1;
                        y.b bVar3 = dVar2.f1149s;
                        if (bVar3 != null) {
                            float f10 = (float) -1;
                            int i12 = bVar3.f27947b;
                            if (i12 == i10) {
                                if (i10 == -1) {
                                    aVar = bVar3.f27949d.valueAt(0);
                                } else {
                                    aVar = bVar3.f27949d.get(i12);
                                }
                                int i13 = bVar3.f27948c;
                                if ((i13 == -1 || !aVar.f27952b.get(i13).a(f10, f10)) && bVar3.f27948c != (a10 = aVar.a(f10, f10))) {
                                    if (a10 == -1) {
                                        bVar2 = null;
                                    } else {
                                        bVar2 = aVar.f27952b.get(a10).f27960f;
                                    }
                                    if (a10 != -1) {
                                        int i14 = aVar.f27952b.get(a10).f27959e;
                                    }
                                    if (bVar2 != null) {
                                        bVar3.f27948c = a10;
                                        bVar2.a(bVar3.f27946a);
                                    }
                                }
                            } else {
                                bVar3.f27947b = i10;
                                b.a aVar2 = bVar3.f27949d.get(i10);
                                int a11 = aVar2.a(f10, f10);
                                if (a11 == -1) {
                                    bVar = aVar2.f27954d;
                                } else {
                                    bVar = aVar2.f27952b.get(a11).f27960f;
                                }
                                if (a11 != -1) {
                                    int i15 = aVar2.f27952b.get(a11).f27959e;
                                }
                                if (bVar == null) {
                                    Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i10 + ", dim =" + f10 + ", " + f10);
                                } else {
                                    bVar3.f27948c = a11;
                                    bVar.a(bVar3.f27946a);
                                }
                            }
                        }
                    } else {
                        d.this.v(i10, i11);
                    }
                }
                d.this.setState(dVar);
            }
            if (!Float.isNaN(this.f27239b)) {
                d dVar3 = d.this;
                float f11 = this.f27238a;
                float f12 = this.f27239b;
                if (!dVar3.isAttachedToWindow()) {
                    if (dVar3.S == null) {
                        dVar3.S = new b();
                    }
                    b bVar4 = dVar3.S;
                    bVar4.f27238a = f11;
                    bVar4.f27239b = f12;
                } else {
                    dVar3.setProgress(f11);
                    dVar3.setState(C0273d.MOVING);
                    dVar3.A = f12;
                }
                this.f27238a = Float.NaN;
                this.f27239b = Float.NaN;
                this.f27240c = -1;
                this.f27241d = -1;
            } else if (!Float.isNaN(this.f27238a)) {
                d.this.setProgress(this.f27238a);
            }
        }
    }

    /* compiled from: MotionLayout */
    public interface c {
        void a(d dVar, int i10, int i11);

        void b(d dVar, int i10, int i11, float f10);
    }

    /* renamed from: x.d$d  reason: collision with other inner class name */
    /* compiled from: MotionLayout */
    public enum C0273d {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public void dispatchDraw(Canvas canvas) {
        s(false);
        super.dispatchDraw(canvas);
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.C;
    }

    public ArrayList<e.a> getDefinedTransitions() {
        return null;
    }

    public b getDesignTool() {
        if (this.K == null) {
            this.K = new b(this);
        }
        return this.K;
    }

    public int getEndState() {
        return this.D;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.G;
    }

    public e getScene() {
        return null;
    }

    public int getStartState() {
        return this.B;
    }

    public float getTargetPosition() {
        return this.I;
    }

    public Bundle getTransitionState() {
        if (this.S == null) {
            this.S = new b();
        }
        b bVar = this.S;
        d dVar = d.this;
        bVar.f27241d = dVar.D;
        bVar.f27240c = dVar.B;
        bVar.f27239b = dVar.getVelocity();
        bVar.f27238a = d.this.getProgress();
        b bVar2 = this.S;
        bVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", bVar2.f27238a);
        bundle.putFloat("motion.velocity", bVar2.f27239b);
        bundle.putInt("motion.StartState", bVar2.f27240c);
        bundle.putInt("motion.EndState", bVar2.f27241d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        return (long) (this.E * 1000.0f);
    }

    public float getVelocity() {
        return this.A;
    }

    public void h(View view, View view2, int i10, int i11) {
        getNanoTime();
    }

    public void i(View view, int i10) {
    }

    public boolean isAttachedToWindow() {
        if (Build.VERSION.SDK_INT >= 19) {
            return super.isAttachedToWindow();
        }
        return getWindowToken() != null;
    }

    public void j(View view, int i10, int i11, int[] iArr, int i12) {
    }

    public void k(int i10) {
        this.f1149s = null;
    }

    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i10 != 0 || i11 != 0) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
        }
    }

    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
    }

    public boolean o(View view, View view2, int i10, int i11) {
        return false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        b bVar = this.S;
        if (bVar == null) {
            return;
        }
        if (this.f27234a0) {
            post(new a());
        } else {
            bVar.a();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.R = true;
        try {
            super.onLayout(z10, i10, i11, i12, i13);
        } finally {
            this.R = false;
        }
    }

    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    public void onRtlPropertiesChanged(int i10) {
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof c) {
            c cVar = (c) view;
            if (this.O == null) {
                this.O = new CopyOnWriteArrayList<>();
            }
            this.O.add(cVar);
            if (cVar.f27229i) {
                if (this.M == null) {
                    this.M = new ArrayList<>();
                }
                this.M.add(cVar);
            }
            if (cVar.f27230r) {
                if (this.N == null) {
                    this.N = new ArrayList<>();
                }
                this.N.add(cVar);
            }
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<c> arrayList = this.M;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<c> arrayList2 = this.N;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public void requestLayout() {
        int i10 = this.C;
        super.requestLayout();
    }

    public void s(boolean z10) {
        int i10;
        int i11;
        C0273d dVar = C0273d.FINISHED;
        if (this.H == -1) {
            this.H = getNanoTime();
        }
        float f10 = this.G;
        if (f10 > 0.0f && f10 < 1.0f) {
            this.C = -1;
        }
        boolean z11 = true;
        boolean z12 = false;
        if (this.L) {
            float signum = Math.signum(this.I - f10);
            long nanoTime = getNanoTime();
            float f11 = ((((float) (nanoTime - this.H)) * signum) * 1.0E-9f) / this.E;
            float f12 = this.G + f11;
            if ((signum > 0.0f && f12 >= this.I) || (signum <= 0.0f && f12 <= this.I)) {
                f12 = this.I;
            }
            this.G = f12;
            this.F = f12;
            this.H = nanoTime;
            this.A = f11;
            if (Math.abs(f11) > 1.0E-5f) {
                setState(C0273d.MOVING);
            }
            if ((signum > 0.0f && f12 >= this.I) || (signum <= 0.0f && f12 <= this.I)) {
                f12 = this.I;
            }
            if (f12 >= 1.0f || f12 <= 0.0f) {
                setState(dVar);
            }
            int childCount = getChildCount();
            this.L = false;
            getNanoTime();
            if (childCount <= 0) {
                boolean z13 = (signum > 0.0f && f12 >= this.I) || (signum <= 0.0f && f12 <= this.I);
                if (!this.L && z13) {
                    setState(dVar);
                }
                boolean z14 = (!z13) | this.L;
                this.L = z14;
                if (f12 <= 0.0f && (i11 = this.B) != -1 && this.C != i11) {
                    this.C = i11;
                    throw null;
                } else if (((double) f12) < 1.0d || this.C == (i10 = this.D)) {
                    if (z14) {
                        invalidate();
                    } else if ((signum > 0.0f && f12 == 1.0f) || (signum < 0.0f && f12 == 0.0f)) {
                        setState(dVar);
                    }
                    if (!this.L && signum > 0.0f) {
                        int i12 = (f12 > 1.0f ? 1 : (f12 == 1.0f ? 0 : -1));
                    }
                } else {
                    this.C = i10;
                    throw null;
                }
            } else {
                getChildAt(0);
                throw null;
            }
        }
        float f13 = this.G;
        if (f13 >= 1.0f) {
            int i13 = this.C;
            int i14 = this.D;
            if (i13 == i14) {
                z11 = false;
            }
            this.C = i14;
        } else {
            if (f13 <= 0.0f) {
                int i15 = this.C;
                int i16 = this.B;
                if (i15 == i16) {
                    z11 = false;
                }
                this.C = i16;
            }
            this.f27236c0 |= z12;
            if (z12 && !this.R) {
                requestLayout();
            }
            this.F = this.G;
        }
        z12 = z11;
        this.f27236c0 |= z12;
        requestLayout();
        this.F = this.G;
    }

    public void setDebugMode(int i10) {
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.f27234a0 = z10;
    }

    public void setInteractionEnabled(boolean z10) {
    }

    public void setInterpolatedProgress(float f10) {
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList<c> arrayList = this.N;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.N.get(i10).setProgress(f10);
            }
        }
    }

    public void setOnShow(float f10) {
        ArrayList<c> arrayList = this.M;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.M.get(i10).setProgress(f10);
            }
        }
    }

    public void setProgress(float f10) {
        C0273d dVar = C0273d.FINISHED;
        C0273d dVar2 = C0273d.MOVING;
        if (f10 < 0.0f || f10 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.S == null) {
                this.S = new b();
            }
            this.S.f27238a = f10;
        } else if (f10 <= 0.0f) {
            if (this.G == 1.0f && this.C == this.D) {
                setState(dVar2);
            }
            this.C = this.B;
            if (this.G == 0.0f) {
                setState(dVar);
            }
        } else if (f10 >= 1.0f) {
            if (this.G == 0.0f && this.C == this.B) {
                setState(dVar2);
            }
            this.C = this.D;
            if (this.G == 1.0f) {
                setState(dVar);
            }
        } else {
            this.C = -1;
            setState(dVar2);
        }
    }

    public void setScene(e eVar) {
        g();
        throw null;
    }

    public void setStartState(int i10) {
        if (!isAttachedToWindow()) {
            if (this.S == null) {
                this.S = new b();
            }
            b bVar = this.S;
            bVar.f27240c = i10;
            bVar.f27241d = i10;
            return;
        }
        this.C = i10;
    }

    public void setState(C0273d dVar) {
        C0273d dVar2 = C0273d.FINISHED;
        if (dVar != dVar2 || this.C != -1) {
            C0273d dVar3 = this.f27235b0;
            this.f27235b0 = dVar;
            C0273d dVar4 = C0273d.MOVING;
            if (dVar3 == dVar4 && dVar == dVar4) {
                t();
            }
            int ordinal = dVar3.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                if (dVar == dVar4) {
                    t();
                }
                if (dVar == dVar2) {
                    u();
                }
            } else if (ordinal == 2 && dVar == dVar2) {
                u();
            }
        }
    }

    public void setTransition(int i10) {
    }

    public void setTransition(e.a aVar) {
        throw null;
    }

    public void setTransitionDuration(int i10) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(c cVar) {
        this.J = cVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.S == null) {
            this.S = new b();
        }
        b bVar = this.S;
        bVar.getClass();
        bVar.f27238a = bundle.getFloat("motion.progress");
        bVar.f27239b = bundle.getFloat("motion.velocity");
        bVar.f27240c = bundle.getInt("motion.StartState");
        bVar.f27241d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.S.a();
        }
    }

    public final void t() {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        if ((this.J != null || ((copyOnWriteArrayList = this.O) != null && !copyOnWriteArrayList.isEmpty())) && this.Q != this.F) {
            if (this.P != -1) {
                c cVar = this.J;
                if (cVar != null) {
                    cVar.a(this, this.B, this.D);
                }
                CopyOnWriteArrayList<c> copyOnWriteArrayList2 = this.O;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<c> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().a(this, this.B, this.D);
                    }
                }
            }
            this.P = -1;
            float f10 = this.F;
            this.Q = f10;
            c cVar2 = this.J;
            if (cVar2 != null) {
                cVar2.b(this, this.B, this.D, f10);
            }
            CopyOnWriteArrayList<c> copyOnWriteArrayList3 = this.O;
            if (copyOnWriteArrayList3 != null) {
                Iterator<c> it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().b(this, this.B, this.D, this.F);
                }
            }
        }
    }

    public String toString() {
        Context context = getContext();
        return a.a(context, this.B) + "->" + a.a(context, this.D) + " (pos:" + this.G + " Dpos/Dt:" + this.A;
    }

    public void u() {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        CopyOnWriteArrayList<c> copyOnWriteArrayList2;
        if ((this.J != null || ((copyOnWriteArrayList2 = this.O) != null && !copyOnWriteArrayList2.isEmpty())) && this.P == -1) {
            this.P = this.C;
            throw null;
        } else if (this.J != null || ((copyOnWriteArrayList = this.O) != null && !copyOnWriteArrayList.isEmpty())) {
            throw null;
        }
    }

    public void v(int i10, int i11) {
        if (!isAttachedToWindow()) {
            if (this.S == null) {
                this.S = new b();
            }
            b bVar = this.S;
            bVar.f27240c = i10;
            bVar.f27241d = i11;
        }
    }

    public void w(int i10) {
        if (!isAttachedToWindow()) {
            if (this.S == null) {
                this.S = new b();
            }
            this.S.f27241d = i10;
            return;
        }
        int i11 = this.C;
        if (i11 != i10 && this.B != i10 && this.D != i10) {
            this.D = i10;
            if (i11 != -1) {
                v(i11, i10);
                this.G = 0.0f;
                return;
            }
            this.I = 1.0f;
            this.F = 0.0f;
            this.G = 0.0f;
            this.H = getNanoTime();
            getNanoTime();
            throw null;
        }
    }
}
