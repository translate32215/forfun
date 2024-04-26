package k8;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class m9 implements l9 {
    public static final w4<Long> A;
    public static final w4<Long> B;
    public static final w4<Long> C;
    public static final w4<Long> D;
    public static final w4<Long> E;
    public static final w4<Long> F;
    public static final w4<Long> G;
    public static final w4<String> H;
    public static final w4<Long> I;

    /* renamed from: a  reason: collision with root package name */
    public static final w4<Long> f20334a;

    /* renamed from: b  reason: collision with root package name */
    public static final w4<Long> f20335b;

    /* renamed from: c  reason: collision with root package name */
    public static final w4<Long> f20336c;

    /* renamed from: d  reason: collision with root package name */
    public static final w4<String> f20337d;

    /* renamed from: e  reason: collision with root package name */
    public static final w4<String> f20338e;

    /* renamed from: f  reason: collision with root package name */
    public static final w4<Long> f20339f;

    /* renamed from: g  reason: collision with root package name */
    public static final w4<Long> f20340g;

    /* renamed from: h  reason: collision with root package name */
    public static final w4<Long> f20341h;

    /* renamed from: i  reason: collision with root package name */
    public static final w4<Long> f20342i;

    /* renamed from: j  reason: collision with root package name */
    public static final w4<Long> f20343j;

    /* renamed from: k  reason: collision with root package name */
    public static final w4<Long> f20344k;

    /* renamed from: l  reason: collision with root package name */
    public static final w4<Long> f20345l;

    /* renamed from: m  reason: collision with root package name */
    public static final w4<Long> f20346m;

    /* renamed from: n  reason: collision with root package name */
    public static final w4<Long> f20347n;

    /* renamed from: o  reason: collision with root package name */
    public static final w4<Long> f20348o;

    /* renamed from: p  reason: collision with root package name */
    public static final w4<Long> f20349p;

    /* renamed from: q  reason: collision with root package name */
    public static final w4<Long> f20350q;

    /* renamed from: r  reason: collision with root package name */
    public static final w4<Long> f20351r;

    /* renamed from: s  reason: collision with root package name */
    public static final w4<Long> f20352s;

    /* renamed from: t  reason: collision with root package name */
    public static final w4<Long> f20353t;

    /* renamed from: u  reason: collision with root package name */
    public static final w4<Long> f20354u;

    /* renamed from: v  reason: collision with root package name */
    public static final w4<Long> f20355v;

    /* renamed from: w  reason: collision with root package name */
    public static final w4<Long> f20356w;

    /* renamed from: x  reason: collision with root package name */
    public static final w4<Long> f20357x;

    /* renamed from: y  reason: collision with root package name */
    public static final w4<Long> f20358y;

    /* renamed from: z  reason: collision with root package name */
    public static final w4<Long> f20359z;

    static {
        u4 u4Var = new u4(p4.a("com.google.android.gms.measurement"));
        f20334a = u4Var.a("measurement.ad_id_cache_time", 10000);
        f20335b = u4Var.a("measurement.max_bundles_per_iteration", 100);
        f20336c = u4Var.a("measurement.config.cache_time", 86400000);
        new t4(u4Var, "measurement.log_tag", "FA");
        f20337d = new t4(u4Var, "measurement.config.url_authority", "app-measurement.com");
        f20338e = new t4(u4Var, "measurement.config.url_scheme", "https");
        f20339f = u4Var.a("measurement.upload.debug_upload_interval", 1000);
        f20340g = u4Var.a("measurement.lifetimevalue.max_currency_tracked", 4);
        f20341h = u4Var.a("measurement.store.max_stored_events_per_app", 100000);
        f20342i = u4Var.a("measurement.experiment.max_ids", 50);
        f20343j = u4Var.a("measurement.audience.filter_result_max_count", 200);
        f20344k = u4Var.a("measurement.alarm_manager.minimum_interval", 60000);
        f20345l = u4Var.a("measurement.upload.minimum_delay", 500);
        f20346m = u4Var.a("measurement.monitoring.sample_period_millis", 86400000);
        f20347n = u4Var.a("measurement.upload.realtime_upload_interval", 10000);
        f20348o = u4Var.a("measurement.upload.refresh_blacklisted_config_interval", 604800000);
        u4Var.a("measurement.config.cache_time.service", 3600000);
        f20349p = u4Var.a("measurement.service_client.idle_disconnect_millis", 5000);
        new t4(u4Var, "measurement.log_tag.service", "FA-SVC");
        f20350q = u4Var.a("measurement.upload.stale_data_deletion_interval", 86400000);
        f20351r = u4Var.a("measurement.sdk.attribution.cache.ttl", 604800000);
        f20352s = u4Var.a("measurement.upload.backoff_period", 43200000);
        f20353t = u4Var.a("measurement.upload.initial_upload_delay_time", 15000);
        f20354u = u4Var.a("measurement.upload.interval", 3600000);
        f20355v = u4Var.a("measurement.upload.max_bundle_size", 65536);
        f20356w = u4Var.a("measurement.upload.max_bundles", 100);
        f20357x = u4Var.a("measurement.upload.max_conversions_per_day", 500);
        f20358y = u4Var.a("measurement.upload.max_error_events_per_day", 1000);
        f20359z = u4Var.a("measurement.upload.max_events_per_bundle", 1000);
        A = u4Var.a("measurement.upload.max_events_per_day", 100000);
        B = u4Var.a("measurement.upload.max_public_events_per_day", 50000);
        C = u4Var.a("measurement.upload.max_queue_time", 2419200000L);
        D = u4Var.a("measurement.upload.max_realtime_events_per_day", 10);
        E = u4Var.a("measurement.upload.max_batch_size", 65536);
        F = u4Var.a("measurement.upload.retry_count", 6);
        G = u4Var.a("measurement.upload.retry_time", 1800000);
        H = new t4(u4Var, "measurement.upload.url", "https://app-measurement.com/a");
        I = u4Var.a("measurement.upload.window_interval", 3600000);
    }

    public final String A() {
        return f20338e.b();
    }

    public final long B() {
        return f20354u.b().longValue();
    }

    public final long C() {
        return F.b().longValue();
    }

    public final String D() {
        return H.b();
    }

    public final long E() {
        return G.b().longValue();
    }

    public final long F() {
        return f20359z.b().longValue();
    }

    public final long G() {
        return C.b().longValue();
    }

    public final long H() {
        return f20355v.b().longValue();
    }

    public final long a() {
        return f20343j.b().longValue();
    }

    public final long b() {
        return f20340g.b().longValue();
    }

    public final long c() {
        return f20347n.b().longValue();
    }

    public final long d() {
        return f20335b.b().longValue();
    }

    public final long e() {
        return f20336c.b().longValue();
    }

    public final long f() {
        return f20339f.b().longValue();
    }

    public final long g() {
        return f20357x.b().longValue();
    }

    public final long h() {
        return f20345l.b().longValue();
    }

    public final long i() {
        return f20346m.b().longValue();
    }

    public final long j() {
        return f20342i.b().longValue();
    }

    public final long k() {
        return f20351r.b().longValue();
    }

    public final long l() {
        return f20350q.b().longValue();
    }

    public final long m() {
        return I.b().longValue();
    }

    public final long n() {
        return A.b().longValue();
    }

    public final long o() {
        return D.b().longValue();
    }

    public final long p() {
        return f20356w.b().longValue();
    }

    public final long q() {
        return f20344k.b().longValue();
    }

    public final long r() {
        return f20352s.b().longValue();
    }

    public final long s() {
        return B.b().longValue();
    }

    public final long t() {
        return f20348o.b().longValue();
    }

    public final String u() {
        return f20337d.b();
    }

    public final long v() {
        return f20353t.b().longValue();
    }

    public final long w() {
        return E.b().longValue();
    }

    public final long x() {
        return f20349p.b().longValue();
    }

    public final long y() {
        return f20358y.b().longValue();
    }

    public final long z() {
        return f20341h.b().longValue();
    }

    public final long zza() {
        return f20334a.b().longValue();
    }
}
