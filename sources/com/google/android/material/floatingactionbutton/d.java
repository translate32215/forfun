package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.StateSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.startapp.startappsdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import l9.n;
import o0.c0;

/* compiled from: FloatingActionButtonImpl */
public class d {
    public static final int[] A = {16843623, 16842908, 16842910};
    public static final int[] B = {16842908, 16842910};
    public static final int[] C = {16843623, 16842910};
    public static final int[] D = {16842910};
    public static final int[] E = new int[0];

    /* renamed from: y  reason: collision with root package name */
    public static final TimeInterpolator f9252y = u8.a.f26150c;

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f9253z = {16842919, 16842910};

    /* renamed from: a  reason: collision with root package name */
    public s9.i f9254a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9255b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9256c = true;

    /* renamed from: d  reason: collision with root package name */
    public float f9257d;

    /* renamed from: e  reason: collision with root package name */
    public float f9258e;

    /* renamed from: f  reason: collision with root package name */
    public float f9259f;

    /* renamed from: g  reason: collision with root package name */
    public final n f9260g;

    /* renamed from: h  reason: collision with root package name */
    public Animator f9261h;

    /* renamed from: i  reason: collision with root package name */
    public u8.g f9262i;

    /* renamed from: j  reason: collision with root package name */
    public u8.g f9263j;

    /* renamed from: k  reason: collision with root package name */
    public float f9264k;

    /* renamed from: l  reason: collision with root package name */
    public float f9265l = 1.0f;

    /* renamed from: m  reason: collision with root package name */
    public int f9266m;

    /* renamed from: n  reason: collision with root package name */
    public int f9267n = 0;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f9268o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f9269p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<f> f9270q;

    /* renamed from: r  reason: collision with root package name */
    public final FloatingActionButton f9271r;

    /* renamed from: s  reason: collision with root package name */
    public final r9.b f9272s;

    /* renamed from: t  reason: collision with root package name */
    public final Rect f9273t = new Rect();

    /* renamed from: u  reason: collision with root package name */
    public final RectF f9274u = new RectF();

    /* renamed from: v  reason: collision with root package name */
    public final RectF f9275v = new RectF();

    /* renamed from: w  reason: collision with root package name */
    public final Matrix f9276w = new Matrix();

    /* renamed from: x  reason: collision with root package name */
    public ViewTreeObserver.OnPreDrawListener f9277x;

    /* compiled from: FloatingActionButtonImpl */
    public class a extends u8.f {
        public a() {
        }

        public Object evaluate(float f10, Object obj, Object obj2) {
            d.this.f9265l = f10;
            ((Matrix) obj).getValues(this.f26158a);
            ((Matrix) obj2).getValues(this.f26159b);
            for (int i10 = 0; i10 < 9; i10++) {
                float[] fArr = this.f26159b;
                float f11 = fArr[i10];
                float[] fArr2 = this.f26158a;
                fArr[i10] = ((f11 - fArr2[i10]) * f10) + fArr2[i10];
            }
            this.f26160c.setValues(this.f26159b);
            return this.f26160c;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f9279a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ float f9280b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ float f9281c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ float f9282d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ float f9283e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ float f9284f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ float f9285g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ Matrix f9286h;

        public b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
            this.f9279a = f10;
            this.f9280b = f11;
            this.f9281c = f12;
            this.f9282d = f13;
            this.f9283e = f14;
            this.f9284f = f15;
            this.f9285g = f16;
            this.f9286h = matrix;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            d.this.f9271r.setAlpha(u8.a.b(this.f9279a, this.f9280b, 0.0f, 0.2f, floatValue));
            d.this.f9271r.setScaleX(u8.a.a(this.f9281c, this.f9282d, floatValue));
            d.this.f9271r.setScaleY(u8.a.a(this.f9283e, this.f9282d, floatValue));
            d.this.f9265l = u8.a.a(this.f9284f, this.f9285g, floatValue);
            d.this.a(u8.a.a(this.f9284f, this.f9285g, floatValue), this.f9286h);
            d.this.f9271r.setImageMatrix(this.f9286h);
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    public class c extends i {
        public c(d dVar) {
            super((b) null);
        }

        public float a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$d  reason: collision with other inner class name */
    /* compiled from: FloatingActionButtonImpl */
    public class C0096d extends i {
        public C0096d() {
            super((b) null);
        }

        public float a() {
            d dVar = d.this;
            return dVar.f9257d + dVar.f9258e;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    public class e extends i {
        public e() {
            super((b) null);
        }

        public float a() {
            d dVar = d.this;
            return dVar.f9257d + dVar.f9259f;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    public interface f {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl */
    public interface g {
    }

    /* compiled from: FloatingActionButtonImpl */
    public class h extends i {
        public h() {
            super((b) null);
        }

        public float a() {
            return d.this.f9257d;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    public abstract class i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public boolean f9291a;

        public i(b bVar) {
        }

        public abstract float a();

        public void onAnimationEnd(Animator animator) {
            d.this.getClass();
            this.f9291a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f9291a) {
                d.this.getClass();
                a();
                this.f9291a = true;
            }
            d dVar = d.this;
            valueAnimator.getAnimatedFraction();
            dVar.getClass();
        }
    }

    public d(FloatingActionButton floatingActionButton, r9.b bVar) {
        this.f9271r = floatingActionButton;
        this.f9272s = bVar;
        n nVar = new n();
        this.f9260g = nVar;
        nVar.a(f9253z, d(new e()));
        nVar.a(A, d(new C0096d()));
        nVar.a(B, d(new C0096d()));
        nVar.a(C, d(new C0096d()));
        nVar.a(D, d(new h()));
        nVar.a(E, d(new c(this)));
        this.f9264k = floatingActionButton.getRotation();
    }

    public final void a(float f10, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f9271r.getDrawable();
        if (drawable != null && this.f9266m != 0) {
            RectF rectF = this.f9274u;
            RectF rectF2 = this.f9275v;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i10 = this.f9266m;
            rectF2.set(0.0f, 0.0f, (float) i10, (float) i10);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i11 = this.f9266m;
            matrix.postScale(f10, f10, ((float) i11) / 2.0f, ((float) i11) / 2.0f);
        }
    }

    public final AnimatorSet b(u8.g gVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f9271r, View.ALPHA, new float[]{f10});
        gVar.d("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f9271r, View.SCALE_X, new float[]{f11});
        gVar.d("scale").a(ofFloat2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 26) {
            ofFloat2.setEvaluator(new k9.a(this));
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f9271r, View.SCALE_Y, new float[]{f11});
        gVar.d("scale").a(ofFloat3);
        if (i10 == 26) {
            ofFloat3.setEvaluator(new k9.a(this));
        }
        arrayList.add(ofFloat3);
        a(f12, this.f9276w);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f9271r, new u8.e(), new a(), new Matrix[]{new Matrix(this.f9276w)});
        gVar.d("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        e.b.b(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f10, float f11, float f12) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new b(this.f9271r.getAlpha(), f10, this.f9271r.getScaleX(), f11, this.f9271r.getScaleY(), this.f9265l, f12, new Matrix(this.f9276w)));
        arrayList.add(ofFloat);
        e.b.b(animatorSet, arrayList);
        animatorSet.setDuration((long) m9.a.c(this.f9271r.getContext(), R.attr.motionDurationLong1, this.f9271r.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(m9.a.d(this.f9271r.getContext(), R.attr.motionEasingStandard, u8.a.f26149b));
        return animatorSet;
    }

    public final ValueAnimator d(i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f9252y);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    public float e() {
        return this.f9257d;
    }

    public void f(Rect rect) {
        int i10 = 0;
        if (this.f9255b) {
            i10 = (0 - this.f9271r.getSizeDimension()) / 2;
        }
        float e10 = this.f9256c ? e() + this.f9259f : 0.0f;
        int max = Math.max(i10, (int) Math.ceil((double) e10));
        int max2 = Math.max(i10, (int) Math.ceil((double) (e10 * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    public boolean g() {
        if (this.f9271r.getVisibility() == 0) {
            if (this.f9267n == 1) {
                return true;
            }
            return false;
        } else if (this.f9267n != 2) {
            return true;
        } else {
            return false;
        }
    }

    public boolean h() {
        if (this.f9271r.getVisibility() != 0) {
            if (this.f9267n == 2) {
                return true;
            }
            return false;
        } else if (this.f9267n != 1) {
            return true;
        } else {
            return false;
        }
    }

    public void i() {
        n nVar = this.f9260g;
        ValueAnimator valueAnimator = nVar.f21160c;
        if (valueAnimator != null) {
            valueAnimator.end();
            nVar.f21160c = null;
        }
    }

    public void j() {
    }

    public void k(int[] iArr) {
        n.b bVar;
        ValueAnimator valueAnimator;
        n nVar = this.f9260g;
        int size = nVar.f21158a.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                bVar = null;
                break;
            }
            bVar = nVar.f21158a.get(i10);
            if (StateSet.stateSetMatches(bVar.f21163a, iArr)) {
                break;
            }
            i10++;
        }
        n.b bVar2 = nVar.f21159b;
        if (bVar != bVar2) {
            if (!(bVar2 == null || (valueAnimator = nVar.f21160c) == null)) {
                valueAnimator.cancel();
                nVar.f21160c = null;
            }
            nVar.f21159b = bVar;
            if (bVar != null) {
                ValueAnimator valueAnimator2 = bVar.f21164b;
                nVar.f21160c = valueAnimator2;
                valueAnimator2.start();
            }
        }
    }

    public void l(float f10, float f11, float f12) {
        u();
        throw null;
    }

    public void m() {
        ArrayList<f> arrayList = this.f9270q;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void n() {
        ArrayList<f> arrayList = this.f9270q;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public final void o(float f10) {
        this.f9265l = f10;
        Matrix matrix = this.f9276w;
        a(f10, matrix);
        this.f9271r.setImageMatrix(matrix);
    }

    public void p(ColorStateList colorStateList) {
    }

    public boolean q() {
        return true;
    }

    public final boolean r() {
        return c0.r(this.f9271r) && !this.f9271r.isInEditMode();
    }

    public final boolean s() {
        return !this.f9255b || this.f9271r.getSizeDimension() >= 0;
    }

    public void t() {
        if (Build.VERSION.SDK_INT != 19) {
            return;
        }
        if (this.f9264k % 90.0f != 0.0f) {
            if (this.f9271r.getLayerType() != 1) {
                this.f9271r.setLayerType(1, (Paint) null);
            }
        } else if (this.f9271r.getLayerType() != 0) {
            this.f9271r.setLayerType(0, (Paint) null);
        }
    }

    public final void u() {
        Rect rect = this.f9273t;
        f(rect);
        q.a.f(null, "Didn't initialize content background");
        if (q()) {
            InsetDrawable insetDrawable = new InsetDrawable((Drawable) null, rect.left, rect.top, rect.right, rect.bottom);
            FloatingActionButton.b bVar = (FloatingActionButton.b) this.f9272s;
            bVar.getClass();
            d.super.setBackgroundDrawable(insetDrawable);
        } else {
            ((FloatingActionButton.b) this.f9272s).getClass();
        }
        r9.b bVar2 = this.f9272s;
        int i10 = rect.left;
        FloatingActionButton.this.getClass();
        throw null;
    }
}
