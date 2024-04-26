package u8;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import q.c;
import v.e;

/* compiled from: MotionTiming */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public long f26163a = 0;

    /* renamed from: b  reason: collision with root package name */
    public long f26164b = 300;

    /* renamed from: c  reason: collision with root package name */
    public TimeInterpolator f26165c = null;

    /* renamed from: d  reason: collision with root package name */
    public int f26166d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f26167e = 1;

    public h(long j10, long j11) {
        this.f26163a = j10;
        this.f26164b = j11;
    }

    public void a(Animator animator) {
        animator.setStartDelay(this.f26163a);
        animator.setDuration(this.f26164b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f26166d);
            valueAnimator.setRepeatMode(this.f26167e);
        }
    }

    public TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f26165c;
        return timeInterpolator != null ? timeInterpolator : a.f26149b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f26163a == hVar.f26163a && this.f26164b == hVar.f26164b && this.f26166d == hVar.f26166d && this.f26167e == hVar.f26167e) {
            return b().getClass().equals(hVar.b().getClass());
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f26163a;
        long j11 = this.f26164b;
        return ((((b().getClass().hashCode() + (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31) + this.f26166d) * 31) + this.f26167e;
    }

    public String toString() {
        StringBuilder a10 = c.a(10);
        a10.append(h.class.getName());
        a10.append('{');
        a10.append(Integer.toHexString(System.identityHashCode(this)));
        a10.append(" delay: ");
        a10.append(this.f26163a);
        a10.append(" duration: ");
        a10.append(this.f26164b);
        a10.append(" interpolator: ");
        a10.append(b().getClass());
        a10.append(" repeatCount: ");
        a10.append(this.f26166d);
        a10.append(" repeatMode: ");
        return e.a(a10, this.f26167e, "}\n");
    }

    public h(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f26163a = j10;
        this.f26164b = j11;
        this.f26165c = timeInterpolator;
    }
}
