package k8;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class ha implements ga {

    /* renamed from: a  reason: collision with root package name */
    public static final w4<Boolean> f20249a;

    /* renamed from: b  reason: collision with root package name */
    public static final w4<Boolean> f20250b;

    /* renamed from: c  reason: collision with root package name */
    public static final w4<Boolean> f20251c;

    static {
        u4 u4Var = new u4(p4.a("com.google.android.gms.measurement"));
        u4Var.b("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f20249a = u4Var.b("measurement.audience.refresh_event_count_filters_timestamp", false);
        f20250b = u4Var.b("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f20251c = u4Var.b("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    public final boolean d() {
        return f20249a.b().booleanValue();
    }

    public final boolean e() {
        return f20250b.b().booleanValue();
    }

    public final boolean f() {
        return f20251c.b().booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
