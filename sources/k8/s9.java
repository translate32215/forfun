package k8;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class s9 implements r9 {

    /* renamed from: a  reason: collision with root package name */
    public static final w4<Boolean> f20470a;

    /* renamed from: b  reason: collision with root package name */
    public static final w4<Boolean> f20471b;

    static {
        u4 u4Var = new u4(p4.a("com.google.android.gms.measurement"));
        f20470a = u4Var.b("measurement.euid.client.dev", false);
        f20471b = u4Var.b("measurement.euid.service", false);
    }

    public final boolean d() {
        return f20471b.b().booleanValue();
    }

    public final boolean zza() {
        return f20470a.b().booleanValue();
    }
}
