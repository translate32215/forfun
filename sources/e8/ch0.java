package e8;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ch0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f14140a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14141b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14142c;

    public ch0(long j10, String str, int i10) {
        this.f14140a = j10;
        this.f14141b = str;
        this.f14142c = i10;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ch0)) {
            ch0 ch0 = (ch0) obj;
            if (ch0.f14140a == this.f14140a && ch0.f14142c == this.f14142c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f14140a;
    }
}
