package k8;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class w5 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f20522a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20523b;

    public w5(Object obj, int i10) {
        this.f20522a = obj;
        this.f20523b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w5)) {
            return false;
        }
        w5 w5Var = (w5) obj;
        if (this.f20522a == w5Var.f20522a && this.f20523b == w5Var.f20523b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f20522a) * 65535) + this.f20523b;
    }
}
