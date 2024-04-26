package k8;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class a9 implements z8 {

    /* renamed from: a  reason: collision with root package name */
    public static final w4<Boolean> f20067a;

    /* renamed from: b  reason: collision with root package name */
    public static final w4<Boolean> f20068b;

    /* renamed from: c  reason: collision with root package name */
    public static final w4<Boolean> f20069c;

    static {
        u4 u4Var = new u4((String) null, p4.a("com.google.android.gms.measurement"), true);
        f20067a = u4Var.b("measurement.adid_zero.service", false);
        f20068b = u4Var.b("measurement.adid_zero.adid_uid", false);
        f20069c = u4Var.b("measurement.adid_zero.remove_lair_if_adidzero_false", true);
    }

    public final boolean d() {
        return f20067a.b().booleanValue();
    }

    public final boolean e() {
        return f20068b.b().booleanValue();
    }

    public final boolean f() {
        return f20069c.b().booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
