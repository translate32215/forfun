package k8;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class ab implements za {

    /* renamed from: a  reason: collision with root package name */
    public static final w4<Boolean> f20070a;

    /* renamed from: b  reason: collision with root package name */
    public static final w4<Boolean> f20071b;

    static {
        u4 u4Var = new u4(p4.a("com.google.android.gms.measurement"));
        u4Var.a("measurement.id.lifecycle.app_in_background_parameter", 0);
        f20070a = u4Var.b("measurement.lifecycle.app_backgrounded_engagement", false);
        u4Var.b("measurement.lifecycle.app_backgrounded_tracking", true);
        f20071b = u4Var.b("measurement.lifecycle.app_in_background_parameter", false);
        u4Var.a("measurement.id.lifecycle.app_backgrounded_tracking", 0);
    }

    public final boolean d() {
        return f20071b.b().booleanValue();
    }

    public final boolean zza() {
        return f20070a.b().booleanValue();
    }
}
