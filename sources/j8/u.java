package j8;

import java.lang.annotation.Annotation;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class u implements Annotation {

    /* renamed from: a  reason: collision with root package name */
    public final int f19676a;

    /* renamed from: b  reason: collision with root package name */
    public final x f19677b;

    public u(int i10, x xVar) {
        this.f19676a = i10;
        this.f19677b = xVar;
    }

    public final Class<? extends Annotation> annotationType() {
        return u.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f19676a == uVar.f19676a && this.f19677b.equals(uVar.f19677b);
    }

    public final int hashCode() {
        return (this.f19676a ^ 14552422) + (this.f19677b.hashCode() ^ 2041407134);
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf" + "(tag=" + this.f19676a + "intEncoding=" + this.f19677b + ')';
    }
}
