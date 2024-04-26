package k8;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class d7 implements l7 {

    /* renamed from: a  reason: collision with root package name */
    public final l7[] f20127a;

    public d7(l7... l7VarArr) {
        this.f20127a = l7VarArr;
    }

    public final k7 a(Class<?> cls) {
        l7[] l7VarArr = this.f20127a;
        for (int i10 = 0; i10 < 2; i10++) {
            l7 l7Var = l7VarArr[i10];
            if (l7Var.b(cls)) {
                return l7Var.a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    public final boolean b(Class<?> cls) {
        l7[] l7VarArr = this.f20127a;
        for (int i10 = 0; i10 < 2; i10++) {
            if (l7VarArr[i10].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
