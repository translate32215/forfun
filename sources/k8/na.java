package k8;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class na implements ma {

    /* renamed from: a  reason: collision with root package name */
    public static final w4<Boolean> f20378a;

    static {
        u4 u4Var = new u4(p4.a("com.google.android.gms.measurement"));
        u4Var.b("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        f20378a = u4Var.b("measurement.collection.redundant_engagement_removal_enabled", false);
        u4Var.a("measurement.id.collection.redundant_engagement_removal_enabled", 0);
    }

    public final boolean zza() {
        return f20378a.b().booleanValue();
    }
}
