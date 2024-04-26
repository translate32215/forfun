package z4;

/* compiled from: AuxEffectInfo */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final int f28409a;

    /* renamed from: b  reason: collision with root package name */
    public final float f28410b;

    public o(int i10, float f10) {
        this.f28409a = i10;
        this.f28410b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f28409a == oVar.f28409a && Float.compare(oVar.f28410b, this.f28410b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f28410b) + ((527 + this.f28409a) * 31);
    }
}
