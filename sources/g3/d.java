package g3;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import u2.c;

/* compiled from: LottieValueAnimator */
public class d extends a implements Choreographer.FrameCallback {

    /* renamed from: c  reason: collision with root package name */
    public float f18424c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    public boolean f18425d = false;

    /* renamed from: e  reason: collision with root package name */
    public long f18426e = 0;

    /* renamed from: f  reason: collision with root package name */
    public float f18427f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    public int f18428g = 0;

    /* renamed from: h  reason: collision with root package name */
    public float f18429h = -2.14748365E9f;

    /* renamed from: i  reason: collision with root package name */
    public float f18430i = 2.14748365E9f;

    /* renamed from: r  reason: collision with root package name */
    public u2.d f18431r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f18432s = false;

    public void c() {
        j();
        a(g());
    }

    public void cancel() {
        for (Animator.AnimatorListener onAnimationCancel : this.f18421b) {
            onAnimationCancel.onAnimationCancel(this);
        }
        j();
    }

    public float d() {
        u2.d dVar = this.f18431r;
        if (dVar == null) {
            return 0.0f;
        }
        float f10 = this.f18427f;
        float f11 = dVar.f25929k;
        return (f10 - f11) / (dVar.f25930l - f11);
    }

    public void doFrame(long j10) {
        h();
        u2.d dVar = this.f18431r;
        if (dVar != null && this.f18432s) {
            long j11 = this.f18426e;
            long j12 = 0;
            if (j11 != 0) {
                j12 = j10 - j11;
            }
            float abs = ((float) j12) / ((1.0E9f / dVar.f25931m) / Math.abs(this.f18424c));
            float f10 = this.f18427f;
            if (g()) {
                abs = -abs;
            }
            float f11 = f10 + abs;
            this.f18427f = f11;
            float f12 = f();
            float e10 = e();
            PointF pointF = f.f18435a;
            boolean z10 = !(f11 >= f12 && f11 <= e10);
            this.f18427f = f.b(this.f18427f, f(), e());
            this.f18426e = j10;
            b();
            if (z10) {
                if (getRepeatCount() == -1 || this.f18428g < getRepeatCount()) {
                    for (Animator.AnimatorListener onAnimationRepeat : this.f18421b) {
                        onAnimationRepeat.onAnimationRepeat(this);
                    }
                    this.f18428g++;
                    if (getRepeatMode() == 2) {
                        this.f18425d = !this.f18425d;
                        this.f18424c = -this.f18424c;
                    } else {
                        this.f18427f = g() ? e() : f();
                    }
                    this.f18426e = j10;
                } else {
                    this.f18427f = this.f18424c < 0.0f ? f() : e();
                    j();
                    a(g());
                }
            }
            if (this.f18431r != null) {
                float f13 = this.f18427f;
                if (f13 < this.f18429h || f13 > this.f18430i) {
                    throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.f18429h), Float.valueOf(this.f18430i), Float.valueOf(this.f18427f)}));
                }
            }
            c.a("LottieValueAnimator#doFrame");
        }
    }

    public float e() {
        u2.d dVar = this.f18431r;
        if (dVar == null) {
            return 0.0f;
        }
        float f10 = this.f18430i;
        return f10 == 2.14748365E9f ? dVar.f25930l : f10;
    }

    public float f() {
        u2.d dVar = this.f18431r;
        if (dVar == null) {
            return 0.0f;
        }
        float f10 = this.f18429h;
        return f10 == -2.14748365E9f ? dVar.f25929k : f10;
    }

    public final boolean g() {
        return this.f18424c < 0.0f;
    }

    public float getAnimatedFraction() {
        float f10;
        float e10;
        float f11;
        if (this.f18431r == null) {
            return 0.0f;
        }
        if (g()) {
            f10 = e() - this.f18427f;
            e10 = e();
            f11 = f();
        } else {
            f10 = this.f18427f - f();
            e10 = e();
            f11 = f();
        }
        return f10 / (e10 - f11);
    }

    public Object getAnimatedValue() {
        return Float.valueOf(d());
    }

    public long getDuration() {
        u2.d dVar = this.f18431r;
        if (dVar == null) {
            return 0;
        }
        return (long) dVar.b();
    }

    public void h() {
        if (this.f18432s) {
            Choreographer.getInstance().removeFrameCallback(this);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public boolean isRunning() {
        return this.f18432s;
    }

    public void j() {
        Choreographer.getInstance().removeFrameCallback(this);
        this.f18432s = false;
    }

    public void k(float f10) {
        if (this.f18427f != f10) {
            this.f18427f = f.b(f10, f(), e());
            this.f18426e = 0;
            b();
        }
    }

    public void l(float f10, float f11) {
        float f12;
        float f13;
        if (f10 <= f11) {
            u2.d dVar = this.f18431r;
            if (dVar == null) {
                f12 = -3.4028235E38f;
            } else {
                f12 = dVar.f25929k;
            }
            if (dVar == null) {
                f13 = Float.MAX_VALUE;
            } else {
                f13 = dVar.f25930l;
            }
            this.f18429h = f.b(f10, f12, f13);
            this.f18430i = f.b(f11, f12, f13);
            k((float) ((int) f.b(this.f18427f, f10, f11)));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", new Object[]{Float.valueOf(f10), Float.valueOf(f11)}));
    }

    public void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 != 2 && this.f18425d) {
            this.f18425d = false;
            this.f18424c = -this.f18424c;
        }
    }
}
