package k8;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class d9 implements c9 {

    /* renamed from: a  reason: collision with root package name */
    public static final w4<Boolean> f20130a;

    static {
        u4 u4Var = new u4(p4.a("com.google.android.gms.measurement"));
        f20130a = u4Var.b("measurement.androidId.delete_feature", true);
        u4Var.b("measurement.log_androidId_enabled", false);
    }

    public final boolean zza() {
        return f20130a.b().booleanValue();
    }
}
