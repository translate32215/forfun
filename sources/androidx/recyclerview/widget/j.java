package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.WeakHashMap;
import o0.c0;

/* compiled from: FastScroller */
public class j extends RecyclerView.l implements RecyclerView.p {
    public static final int[] D = {16842919};
    public static final int[] E = new int[0];
    public int A;
    public final Runnable B;
    public final RecyclerView.q C;

    /* renamed from: a  reason: collision with root package name */
    public final int f3068a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3069b;

    /* renamed from: c  reason: collision with root package name */
    public final StateListDrawable f3070c;

    /* renamed from: d  reason: collision with root package name */
    public final Drawable f3071d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3072e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3073f;

    /* renamed from: g  reason: collision with root package name */
    public final StateListDrawable f3074g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f3075h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3076i;

    /* renamed from: j  reason: collision with root package name */
    public final int f3077j;

    /* renamed from: k  reason: collision with root package name */
    public int f3078k;

    /* renamed from: l  reason: collision with root package name */
    public int f3079l;

    /* renamed from: m  reason: collision with root package name */
    public float f3080m;

    /* renamed from: n  reason: collision with root package name */
    public int f3081n;

    /* renamed from: o  reason: collision with root package name */
    public int f3082o;

    /* renamed from: p  reason: collision with root package name */
    public float f3083p;

    /* renamed from: q  reason: collision with root package name */
    public int f3084q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f3085r = 0;

    /* renamed from: s  reason: collision with root package name */
    public RecyclerView f3086s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3087t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3088u = false;

    /* renamed from: v  reason: collision with root package name */
    public int f3089v = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f3090w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f3091x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    public final int[] f3092y = new int[2];

    /* renamed from: z  reason: collision with root package name */
    public final ValueAnimator f3093z;

    /* compiled from: FastScroller */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            j jVar = j.this;
            int i10 = jVar.A;
            if (i10 == 1) {
                jVar.f3093z.cancel();
            } else if (i10 != 2) {
                return;
            }
            jVar.A = 3;
            ValueAnimator valueAnimator = jVar.f3093z;
            valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
            jVar.f3093z.setDuration((long) 500);
            jVar.f3093z.start();
        }
    }

    /* compiled from: FastScroller */
    public class b extends RecyclerView.q {
        public b() {
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
            j jVar = j.this;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = jVar.f3086s.computeVerticalScrollRange();
            int i12 = jVar.f3085r;
            jVar.f3087t = computeVerticalScrollRange - i12 > 0 && i12 >= jVar.f3068a;
            int computeHorizontalScrollRange = jVar.f3086s.computeHorizontalScrollRange();
            int i13 = jVar.f3084q;
            boolean z10 = computeHorizontalScrollRange - i13 > 0 && i13 >= jVar.f3068a;
            jVar.f3088u = z10;
            boolean z11 = jVar.f3087t;
            if (z11 || z10) {
                if (z11) {
                    float f10 = (float) i12;
                    jVar.f3079l = (int) ((((f10 / 2.0f) + ((float) computeVerticalScrollOffset)) * f10) / ((float) computeVerticalScrollRange));
                    jVar.f3078k = Math.min(i12, (i12 * i12) / computeVerticalScrollRange);
                }
                if (jVar.f3088u) {
                    float f11 = (float) computeHorizontalScrollOffset;
                    float f12 = (float) i13;
                    jVar.f3082o = (int) ((((f12 / 2.0f) + f11) * f12) / ((float) computeHorizontalScrollRange));
                    jVar.f3081n = Math.min(i13, (i13 * i13) / computeHorizontalScrollRange);
                }
                int i14 = jVar.f3089v;
                if (i14 == 0 || i14 == 1) {
                    jVar.j(1);
                }
            } else if (jVar.f3089v != 0) {
                jVar.j(0);
            }
        }
    }

    /* compiled from: FastScroller */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3096a = false;

        public c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f3096a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f3096a) {
                this.f3096a = false;
            } else if (((Float) j.this.f3093z.getAnimatedValue()).floatValue() == 0.0f) {
                j jVar = j.this;
                jVar.A = 0;
                jVar.j(0);
            } else {
                j jVar2 = j.this;
                jVar2.A = 2;
                jVar2.f3086s.invalidate();
            }
        }
    }

    /* compiled from: FastScroller */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            j.this.f3070c.setAlpha(floatValue);
            j.this.f3071d.setAlpha(floatValue);
            j.this.f3086s.invalidate();
        }
    }

    public j(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        boolean z10 = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f3093z = ofFloat;
        this.A = 0;
        this.B = new a();
        b bVar = new b();
        this.C = bVar;
        this.f3070c = stateListDrawable;
        this.f3071d = drawable;
        this.f3074g = stateListDrawable2;
        this.f3075h = drawable2;
        this.f3072e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f3073f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f3076i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f3077j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f3068a = i11;
        this.f3069b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.f3086s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                RecyclerView.m mVar = recyclerView2.f2828u;
                if (mVar != null) {
                    mVar.e("Cannot remove item decoration during a scroll  or layout");
                }
                recyclerView2.f2834x.remove(this);
                if (recyclerView2.f2834x.isEmpty()) {
                    recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2 ? true : z10);
                }
                recyclerView2.R();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.f3086s;
                recyclerView3.f2836y.remove(this);
                if (recyclerView3.f2838z == this) {
                    recyclerView3.f2838z = null;
                }
                List<RecyclerView.q> list = this.f3086s.f2829u0;
                if (list != null) {
                    list.remove(bVar);
                }
                f();
            }
            this.f3086s = recyclerView;
            recyclerView.g(this);
            this.f3086s.f2836y.add(this);
            this.f3086s.h(bVar);
        }
    }

    public boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f3089v;
        if (i10 == 1) {
            boolean h10 = h(motionEvent.getX(), motionEvent.getY());
            boolean g10 = g(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (h10 || g10)) {
                if (g10) {
                    this.f3090w = 1;
                    this.f3083p = (float) ((int) motionEvent.getX());
                } else if (h10) {
                    this.f3090w = 2;
                    this.f3080m = (float) ((int) motionEvent.getY());
                }
                j(2);
                return true;
            }
        } else if (i10 == 2) {
            return true;
        }
        return false;
    }

    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f3089v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean h10 = h(motionEvent.getX(), motionEvent.getY());
                boolean g10 = g(motionEvent.getX(), motionEvent.getY());
                if (h10 || g10) {
                    if (g10) {
                        this.f3090w = 1;
                        this.f3083p = (float) ((int) motionEvent.getX());
                    } else if (h10) {
                        this.f3090w = 2;
                        this.f3080m = (float) ((int) motionEvent.getY());
                    }
                    j(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f3089v == 2) {
                this.f3080m = 0.0f;
                this.f3083p = 0.0f;
                j(1);
                this.f3090w = 0;
            } else if (motionEvent.getAction() == 2 && this.f3089v == 2) {
                k();
                if (this.f3090w == 1) {
                    float x10 = motionEvent.getX();
                    int[] iArr = this.f3092y;
                    int i10 = this.f3069b;
                    iArr[0] = i10;
                    iArr[1] = this.f3084q - i10;
                    float max = Math.max((float) iArr[0], Math.min((float) iArr[1], x10));
                    if (Math.abs(((float) this.f3082o) - max) >= 2.0f) {
                        int i11 = i(this.f3083p, max, iArr, this.f3086s.computeHorizontalScrollRange(), this.f3086s.computeHorizontalScrollOffset(), this.f3084q);
                        if (i11 != 0) {
                            this.f3086s.scrollBy(i11, 0);
                        }
                        this.f3083p = max;
                    }
                }
                if (this.f3090w == 2) {
                    float y10 = motionEvent.getY();
                    int[] iArr2 = this.f3091x;
                    int i12 = this.f3069b;
                    iArr2[0] = i12;
                    iArr2[1] = this.f3085r - i12;
                    float max2 = Math.max((float) iArr2[0], Math.min((float) iArr2[1], y10));
                    if (Math.abs(((float) this.f3079l) - max2) >= 2.0f) {
                        int i13 = i(this.f3080m, max2, iArr2, this.f3086s.computeVerticalScrollRange(), this.f3086s.computeVerticalScrollOffset(), this.f3085r);
                        if (i13 != 0) {
                            this.f3086s.scrollBy(0, i13);
                        }
                        this.f3080m = max2;
                    }
                }
            }
        }
    }

    public void c(boolean z10) {
    }

    public void e(Canvas canvas, RecyclerView recyclerView, RecyclerView.x xVar) {
        if (this.f3084q != this.f3086s.getWidth() || this.f3085r != this.f3086s.getHeight()) {
            this.f3084q = this.f3086s.getWidth();
            this.f3085r = this.f3086s.getHeight();
            j(0);
        } else if (this.A != 0) {
            if (this.f3087t) {
                int i10 = this.f3084q;
                int i11 = this.f3072e;
                int i12 = i10 - i11;
                int i13 = this.f3079l;
                int i14 = this.f3078k;
                int i15 = i13 - (i14 / 2);
                this.f3070c.setBounds(0, 0, i11, i14);
                this.f3071d.setBounds(0, 0, this.f3073f, this.f3085r);
                RecyclerView recyclerView2 = this.f3086s;
                WeakHashMap<View, String> weakHashMap = c0.f22553a;
                boolean z10 = true;
                if (c0.e.d(recyclerView2) != 1) {
                    z10 = false;
                }
                if (z10) {
                    this.f3071d.draw(canvas);
                    canvas.translate((float) this.f3072e, (float) i15);
                    canvas.scale(-1.0f, 1.0f);
                    this.f3070c.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate((float) (-this.f3072e), (float) (-i15));
                } else {
                    canvas.translate((float) i12, 0.0f);
                    this.f3071d.draw(canvas);
                    canvas.translate(0.0f, (float) i15);
                    this.f3070c.draw(canvas);
                    canvas.translate((float) (-i12), (float) (-i15));
                }
            }
            if (this.f3088u) {
                int i16 = this.f3085r;
                int i17 = this.f3076i;
                int i18 = i16 - i17;
                int i19 = this.f3082o;
                int i20 = this.f3081n;
                int i21 = i19 - (i20 / 2);
                this.f3074g.setBounds(0, 0, i20, i17);
                this.f3075h.setBounds(0, 0, this.f3084q, this.f3077j);
                canvas.translate(0.0f, (float) i18);
                this.f3075h.draw(canvas);
                canvas.translate((float) i21, 0.0f);
                this.f3074g.draw(canvas);
                canvas.translate((float) (-i21), (float) (-i18));
            }
        }
    }

    public final void f() {
        this.f3086s.removeCallbacks(this.B);
    }

    public boolean g(float f10, float f11) {
        if (f11 >= ((float) (this.f3085r - this.f3076i))) {
            int i10 = this.f3082o;
            int i11 = this.f3081n;
            return f10 >= ((float) (i10 - (i11 / 2))) && f10 <= ((float) ((i11 / 2) + i10));
        }
    }

    public boolean h(float f10, float f11) {
        RecyclerView recyclerView = this.f3086s;
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        if (c0.e.d(recyclerView) == 1) {
            if (f10 > ((float) this.f3072e)) {
                return false;
            }
        } else if (f10 < ((float) (this.f3084q - this.f3072e))) {
            return false;
        }
        int i10 = this.f3079l;
        int i11 = this.f3078k / 2;
        if (f11 < ((float) (i10 - i11)) || f11 > ((float) (i11 + i10))) {
            return false;
        }
        return true;
    }

    public final int i(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / ((float) i13)) * ((float) i14));
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    public void j(int i10) {
        if (i10 == 2 && this.f3089v != 2) {
            this.f3070c.setState(D);
            f();
        }
        if (i10 == 0) {
            this.f3086s.invalidate();
        } else {
            k();
        }
        if (this.f3089v == 2 && i10 != 2) {
            this.f3070c.setState(E);
            f();
            this.f3086s.postDelayed(this.B, (long) 1200);
        } else if (i10 == 1) {
            f();
            this.f3086s.postDelayed(this.B, (long) 1500);
        }
        this.f3089v = i10;
    }

    public void k() {
        int i10 = this.A;
        if (i10 != 0) {
            if (i10 == 3) {
                this.f3093z.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f3093z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f3093z.setDuration(500);
        this.f3093z.setStartDelay(0);
        this.f3093z.start();
    }
}
