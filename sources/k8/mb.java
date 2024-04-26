package k8;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class mb implements lb {

    /* renamed from: a  reason: collision with root package name */
    public static final w4<Boolean> f20360a;

    /* renamed from: b  reason: collision with root package name */
    public static final w4<Double> f20361b;

    /* renamed from: c  reason: collision with root package name */
    public static final w4<Long> f20362c;

    /* renamed from: d  reason: collision with root package name */
    public static final w4<Long> f20363d;

    /* renamed from: e  reason: collision with root package name */
    public static final w4<String> f20364e;

    static {
        u4 u4Var = new u4(p4.a("com.google.android.gms.measurement"));
        f20360a = u4Var.b("measurement.test.boolean_flag", false);
        f20361b = new s4(u4Var, Double.valueOf(-3.0d));
        f20362c = u4Var.a("measurement.test.int_flag", -2);
        f20363d = u4Var.a("measurement.test.long_flag", -1);
        f20364e = new t4(u4Var, "measurement.test.string_flag", "---");
    }

    public final boolean b() {
        return f20360a.b().booleanValue();
    }

    public final long d() {
        return f20362c.b().longValue();
    }

    public final long e() {
        return f20363d.b().longValue();
    }

    public final String f() {
        return f20364e.b();
    }

    public final double zza() {
        return f20361b.b().doubleValue();
    }
}
