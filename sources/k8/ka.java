package k8;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class ka implements ja {

    /* renamed from: a  reason: collision with root package name */
    public static final w4<Boolean> f20296a;

    static {
        u4 u4Var = new u4(p4.a("com.google.android.gms.measurement"));
        f20296a = u4Var.b("measurement.client.sessions.check_on_reset_and_enable2", true);
        u4Var.b("measurement.client.sessions.check_on_startup", true);
        u4Var.b("measurement.client.sessions.start_session_before_view_screen", true);
    }

    public final boolean d() {
        return f20296a.b().booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
