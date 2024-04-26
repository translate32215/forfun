package h3;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import u2.d;

/* compiled from: Keyframe */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final d f18867a;

    /* renamed from: b  reason: collision with root package name */
    public final T f18868b;

    /* renamed from: c  reason: collision with root package name */
    public T f18869c;

    /* renamed from: d  reason: collision with root package name */
    public final Interpolator f18870d;

    /* renamed from: e  reason: collision with root package name */
    public final float f18871e;

    /* renamed from: f  reason: collision with root package name */
    public Float f18872f;

    /* renamed from: g  reason: collision with root package name */
    public float f18873g;

    /* renamed from: h  reason: collision with root package name */
    public float f18874h;

    /* renamed from: i  reason: collision with root package name */
    public int f18875i;

    /* renamed from: j  reason: collision with root package name */
    public int f18876j;

    /* renamed from: k  reason: collision with root package name */
    public float f18877k;

    /* renamed from: l  reason: collision with root package name */
    public float f18878l;

    /* renamed from: m  reason: collision with root package name */
    public PointF f18879m;

    /* renamed from: n  reason: collision with root package name */
    public PointF f18880n;

    public a(d dVar, T t10, T t11, Interpolator interpolator, float f10, Float f11) {
        this.f18873g = -3987645.8f;
        this.f18874h = -3987645.8f;
        this.f18875i = 784923401;
        this.f18876j = 784923401;
        this.f18877k = Float.MIN_VALUE;
        this.f18878l = Float.MIN_VALUE;
        this.f18879m = null;
        this.f18880n = null;
        this.f18867a = dVar;
        this.f18868b = t10;
        this.f18869c = t11;
        this.f18870d = interpolator;
        this.f18871e = f10;
        this.f18872f = f11;
    }

    public boolean a(float f10) {
        return f10 >= c() && f10 < b();
    }

    public float b() {
        if (this.f18867a == null) {
            return 1.0f;
        }
        if (this.f18878l == Float.MIN_VALUE) {
            if (this.f18872f == null) {
                this.f18878l = 1.0f;
            } else {
                this.f18878l = ((this.f18872f.floatValue() - this.f18871e) / this.f18867a.c()) + c();
            }
        }
        return this.f18878l;
    }

    public float c() {
        d dVar = this.f18867a;
        if (dVar == null) {
            return 0.0f;
        }
        if (this.f18877k == Float.MIN_VALUE) {
            this.f18877k = (this.f18871e - dVar.f25929k) / dVar.c();
        }
        return this.f18877k;
    }

    public boolean d() {
        return this.f18870d == null;
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("Keyframe{startValue=");
        a10.append(this.f18868b);
        a10.append(", endValue=");
        a10.append(this.f18869c);
        a10.append(", startFrame=");
        a10.append(this.f18871e);
        a10.append(", endFrame=");
        a10.append(this.f18872f);
        a10.append(", interpolator=");
        a10.append(this.f18870d);
        a10.append('}');
        return a10.toString();
    }

    public a(T t10) {
        this.f18873g = -3987645.8f;
        this.f18874h = -3987645.8f;
        this.f18875i = 784923401;
        this.f18876j = 784923401;
        this.f18877k = Float.MIN_VALUE;
        this.f18878l = Float.MIN_VALUE;
        this.f18879m = null;
        this.f18880n = null;
        this.f18867a = null;
        this.f18868b = t10;
        this.f18869c = t10;
        this.f18870d = null;
        this.f18871e = Float.MIN_VALUE;
        this.f18872f = Float.valueOf(Float.MAX_VALUE);
    }
}
