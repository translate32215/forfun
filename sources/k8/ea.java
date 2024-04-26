package k8;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class ea implements da {

    /* renamed from: a  reason: collision with root package name */
    public static final w4<Boolean> f20194a;

    /* renamed from: b  reason: collision with root package name */
    public static final w4<Boolean> f20195b;

    static {
        u4 u4Var = new u4(p4.a("com.google.android.gms.measurement"));
        f20194a = u4Var.b("measurement.client.consent.suppress_1p_in_ga4f_install", true);
        f20195b = u4Var.b("measurement.client.consent.gmpappid_worker_thread_fix", true);
    }

    public final boolean d() {
        return f20194a.b().booleanValue();
    }

    public final boolean e() {
        return f20195b.b().booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
