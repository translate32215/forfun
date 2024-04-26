package x4;

import v6.a;
import v6.e0;

/* compiled from: PlaybackParameters */
public final class o0 {

    /* renamed from: d  reason: collision with root package name */
    public static final o0 f27699d = new o0(1.0f, 1.0f);

    /* renamed from: a  reason: collision with root package name */
    public final float f27700a;

    /* renamed from: b  reason: collision with root package name */
    public final float f27701b;

    /* renamed from: c  reason: collision with root package name */
    public final int f27702c;

    public o0(float f10, float f11) {
        boolean z10 = true;
        a.a(f10 > 0.0f);
        a.a(f11 <= 0.0f ? false : z10);
        this.f27700a = f10;
        this.f27701b = f11;
        this.f27702c = Math.round(f10 * 1000.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0.class != obj.getClass()) {
            return false;
        }
        o0 o0Var = (o0) obj;
        if (this.f27700a == o0Var.f27700a && this.f27701b == o0Var.f27701b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToRawIntBits(this.f27701b) + ((Float.floatToRawIntBits(this.f27700a) + 527) * 31);
    }

    public String toString() {
        return e0.n("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f27700a), Float.valueOf(this.f27701b));
    }
}
