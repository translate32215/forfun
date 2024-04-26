package e8;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class dc0 {

    /* renamed from: d  reason: collision with root package name */
    public static final dc0 f14249d = new dc0(1.0f, 1.0f);

    /* renamed from: a  reason: collision with root package name */
    public final float f14250a;

    /* renamed from: b  reason: collision with root package name */
    public final float f14251b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14252c;

    public dc0(float f10, float f11) {
        this.f14250a = f10;
        this.f14251b = f11;
        this.f14252c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dc0.class == obj.getClass()) {
            dc0 dc0 = (dc0) obj;
            return this.f14250a == dc0.f14250a && this.f14251b == dc0.f14251b;
        }
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f14251b) + ((Float.floatToRawIntBits(this.f14250a) + 527) * 31);
    }
}
