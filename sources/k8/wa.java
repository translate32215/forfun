package k8;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class wa implements va {

    /* renamed from: a  reason: collision with root package name */
    public static final w4<Boolean> f20534a;

    /* renamed from: b  reason: collision with root package name */
    public static final w4<Boolean> f20535b;

    static {
        u4 u4Var = new u4(p4.a("com.google.android.gms.measurement"));
        f20534a = u4Var.b("measurement.sdk.collection.enable_extend_user_property_size", true);
        u4Var.b("measurement.sdk.collection.last_deep_link_referrer2", true);
        f20535b = u4Var.b("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        u4Var.a("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }

    public final boolean d() {
        return f20535b.b().booleanValue();
    }

    public final boolean zza() {
        return f20534a.b().booleanValue();
    }
}
