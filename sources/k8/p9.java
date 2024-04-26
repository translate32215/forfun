package k8;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class p9 implements o9 {

    /* renamed from: a  reason: collision with root package name */
    public static final w4<Long> f20424a;

    static {
        u4 u4Var = new u4(p4.a("com.google.android.gms.measurement"));
        u4Var.b("measurement.client.consent_state_v1", true);
        u4Var.b("measurement.client.3p_consent_state_v1", true);
        u4Var.b("measurement.service.consent_state_v1_W36", true);
        f20424a = u4Var.a("measurement.service.storage_consent_support_version", 203600);
    }

    public final long zza() {
        return f20424a.b().longValue();
    }
}
