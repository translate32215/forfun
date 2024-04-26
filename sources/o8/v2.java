package o8;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import k8.h4;
import k8.p4;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class v2 {
    public static final u2<Long> A = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, c0.f23149a);
    public static final u2<Long> B = a("measurement.upload.retry_time", 1800000L, 1800000L, d0.f23157a);
    public static final u2<Integer> C = a("measurement.upload.retry_count", 6, 6, f0.f23193a);
    public static final u2<Long> D = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, g0.f23212a);
    public static final u2<Integer> E = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, h0.f23235a);
    public static final u2<Integer> F = a("measurement.audience.filter_result_max_count", 200, 200, j0.f23287a);
    public static final u2<Integer> G = a("measurement.upload.max_public_user_properties", 25, 25, (t2) null);
    public static final u2<Integer> H = a("measurement.upload.max_event_name_cardinality", 500, 500, (t2) null);
    public static final u2<Integer> I = a("measurement.upload.max_public_event_params", 25, 25, (t2) null);
    public static final u2<Long> J = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, k0.f23302a);
    public static final u2<Boolean> K;
    public static final u2<String> L = a("measurement.test.string_flag", "---", "---", m0.f23335a);
    public static final u2<Long> M = a("measurement.test.long_flag", -1L, -1L, n0.f23363a);
    public static final u2<Integer> N = a("measurement.test.int_flag", -2, -2, o0.f23371a);
    public static final u2<Double> O;
    public static final u2<Integer> P = a("measurement.experiment.max_ids", 50, 50, r0.f23418a);
    public static final u2<Integer> Q = a("measurement.max_bundles_per_iteration", 100, 100, s0.f23423a);
    public static final u2<Long> R = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, t0.f23443a);
    public static final u2<Boolean> S;
    public static final u2<Boolean> T;
    public static final u2<Boolean> U;
    public static final u2<Boolean> V;
    public static final u2<Boolean> W;
    public static final u2<Boolean> X;
    public static final u2<Boolean> Y;
    public static final u2<Boolean> Z;

    /* renamed from: a  reason: collision with root package name */
    public static final List<u2<?>> f23499a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a0  reason: collision with root package name */
    public static final u2<Boolean> f23500a0;

    /* renamed from: b  reason: collision with root package name */
    public static final u2<Long> f23501b = a("measurement.ad_id_cache_time", 10000L, 10000L, t.f23442a);

    /* renamed from: b0  reason: collision with root package name */
    public static final u2<Boolean> f23502b0;

    /* renamed from: c  reason: collision with root package name */
    public static final u2<Long> f23503c = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, e0.f23170a);

    /* renamed from: c0  reason: collision with root package name */
    public static final u2<Boolean> f23504c0;

    /* renamed from: d  reason: collision with root package name */
    public static final u2<Long> f23505d = a("measurement.config.cache_time", 86400000L, 3600000L, w.f23553a);

    /* renamed from: d0  reason: collision with root package name */
    public static final u2<Boolean> f23506d0;

    /* renamed from: e  reason: collision with root package name */
    public static final u2<String> f23507e = a("measurement.config.url_scheme", "https", "https", i0.f23254a);

    /* renamed from: e0  reason: collision with root package name */
    public static final u2<Boolean> f23508e0;

    /* renamed from: f  reason: collision with root package name */
    public static final u2<String> f23509f = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", u0.f23453a);

    /* renamed from: f0  reason: collision with root package name */
    public static final u2<Boolean> f23510f0;

    /* renamed from: g  reason: collision with root package name */
    public static final u2<Integer> f23511g = a("measurement.upload.max_bundles", 100, 100, g1.f23213a);

    /* renamed from: g0  reason: collision with root package name */
    public static final u2<Boolean> f23512g0;

    /* renamed from: h  reason: collision with root package name */
    public static final u2<Integer> f23513h = a("measurement.upload.max_batch_size", 65536, 65536, s1.f23424a);

    /* renamed from: h0  reason: collision with root package name */
    public static final u2<Boolean> f23514h0;

    /* renamed from: i  reason: collision with root package name */
    public static final u2<Integer> f23515i = a("measurement.upload.max_bundle_size", 65536, 65536, f2.f23195a);

    /* renamed from: i0  reason: collision with root package name */
    public static final u2<Boolean> f23516i0;

    /* renamed from: j  reason: collision with root package name */
    public static final u2<Integer> f23517j = a("measurement.upload.max_events_per_bundle", 1000, 1000, o2.f23373a);

    /* renamed from: j0  reason: collision with root package name */
    public static final u2<Boolean> f23518j0;

    /* renamed from: k  reason: collision with root package name */
    public static final u2<Integer> f23519k = a("measurement.upload.max_events_per_day", 100000, 100000, p2.f23385a);

    /* renamed from: k0  reason: collision with root package name */
    public static final u2<Boolean> f23520k0;

    /* renamed from: l  reason: collision with root package name */
    public static final u2<Integer> f23521l = a("measurement.upload.max_error_events_per_day", 1000, 1000, p0.f23383a);

    /* renamed from: l0  reason: collision with root package name */
    public static final u2<Boolean> f23522l0;

    /* renamed from: m  reason: collision with root package name */
    public static final u2<Integer> f23523m = a("measurement.upload.max_public_events_per_day", 50000, 50000, a1.f23091a);

    /* renamed from: m0  reason: collision with root package name */
    public static final u2<Boolean> f23524m0;

    /* renamed from: n  reason: collision with root package name */
    public static final u2<Integer> f23525n = a("measurement.upload.max_conversions_per_day", 10000, 10000, l1.f23319a);

    /* renamed from: n0  reason: collision with root package name */
    public static final u2<Integer> f23526n0 = a("measurement.service.storage_consent_support_version", 203600, 203600, v1.f23498a);

    /* renamed from: o  reason: collision with root package name */
    public static final u2<Integer> f23527o = a("measurement.upload.max_realtime_events_per_day", 10, 10, w1.f23555a);

    /* renamed from: o0  reason: collision with root package name */
    public static final u2<Boolean> f23528o0;

    /* renamed from: p  reason: collision with root package name */
    public static final u2<Integer> f23529p = a("measurement.store.max_stored_events_per_app", 100000, 100000, i2.f23256a);

    /* renamed from: p0  reason: collision with root package name */
    public static final u2<Boolean> f23530p0;

    /* renamed from: q  reason: collision with root package name */
    public static final u2<String> f23531q = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", q2.f23398a);

    /* renamed from: q0  reason: collision with root package name */
    public static final u2<Boolean> f23532q0;

    /* renamed from: r  reason: collision with root package name */
    public static final u2<Long> f23533r = a("measurement.upload.backoff_period", 43200000L, 43200000L, r2.f23420a);

    /* renamed from: r0  reason: collision with root package name */
    public static final u2<Boolean> f23534r0;

    /* renamed from: s  reason: collision with root package name */
    public static final u2<Long> f23535s = a("measurement.upload.window_interval", 3600000L, 3600000L, s2.f23425a);

    /* renamed from: s0  reason: collision with root package name */
    public static final u2<Boolean> f23536s0;

    /* renamed from: t  reason: collision with root package name */
    public static final u2<Long> f23537t = a("measurement.upload.interval", 3600000L, 3600000L, u.f23452a);

    /* renamed from: t0  reason: collision with root package name */
    public static final u2<Boolean> f23538t0;

    /* renamed from: u  reason: collision with root package name */
    public static final u2<Long> f23539u = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, v.f23496a);

    /* renamed from: u0  reason: collision with root package name */
    public static final u2<Boolean> f23540u0;

    /* renamed from: v  reason: collision with root package name */
    public static final u2<Long> f23541v = a("measurement.upload.debug_upload_interval", 1000L, 1000L, x.f23568a);

    /* renamed from: v0  reason: collision with root package name */
    public static final u2<Boolean> f23542v0;

    /* renamed from: w  reason: collision with root package name */
    public static final u2<Long> f23543w = a("measurement.upload.minimum_delay", 500L, 500L, y.f23607a);

    /* renamed from: w0  reason: collision with root package name */
    public static final u2<Boolean> f23544w0;

    /* renamed from: x  reason: collision with root package name */
    public static final u2<Long> f23545x = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, z.f23627a);

    /* renamed from: y  reason: collision with root package name */
    public static final u2<Long> f23546y = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, a0.f23090a);

    /* renamed from: z  reason: collision with root package name */
    public static final u2<Long> f23547z = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, b0.f23120a);

    static {
        Collections.synchronizedSet(new HashSet());
        Boolean bool = Boolean.FALSE;
        K = a("measurement.test.boolean_flag", bool, bool, l0.f23318a);
        Double valueOf = Double.valueOf(-3.0d);
        O = a("measurement.test.double_flag", valueOf, valueOf, q0.f23396a);
        S = a("measurement.validation.internal_limits_internal_event_params", bool, bool, v0.f23497a);
        Boolean bool2 = Boolean.TRUE;
        T = a("measurement.collection.firebase_global_collection_flag_enabled", bool2, bool2, w0.f23554a);
        U = a("measurement.collection.redundant_engagement_removal_enabled", bool, bool, x0.f23569a);
        a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, y0.f23608a);
        V = a("measurement.quality.checksum", bool, bool, (t2) null);
        W = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, z0.f23628a);
        X = a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, b1.f23121a);
        Y = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, c1.f23150a);
        Z = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, d1.f23158a);
        f23500a0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, e1.f23171a);
        f23502b0 = a("measurement.sdk.collection.enable_extend_user_property_size", bool2, bool2, f1.f23194a);
        f23504c0 = a("measurement.upload.file_lock_state_check", bool2, bool2, h1.f23236a);
        f23506d0 = a("measurement.ga.ga_app_id", bool, bool, i1.f23255a);
        f23508e0 = a("measurement.lifecycle.app_in_background_parameter", bool, bool, j1.f23288a);
        f23510f0 = a("measurement.integration.disable_firebase_instance_id", bool, bool, k1.f23303a);
        f23512g0 = a("measurement.lifecycle.app_backgrounded_engagement", bool, bool, m1.f23336a);
        f23514h0 = a("measurement.collection.service.update_with_analytics_fix", bool, bool, n1.f23364a);
        f23516i0 = a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, o1.f23372a);
        f23518j0 = a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, p1.f23384a);
        f23520k0 = a("measurement.scheduler.task_thread.cleanup_on_exit", bool, bool, q1.f23397a);
        f23522l0 = a("measurement.upload.file_truncate_fix", bool, bool, r1.f23419a);
        a("measurement.collection.synthetic_data_mitigation", bool, bool, t1.f23444a);
        f23524m0 = a("measurement.androidId.delete_feature", bool2, bool2, u1.f23454a);
        f23528o0 = a("measurement.client.properties.non_null_origin", bool2, bool2, x1.f23570a);
        a("measurement.client.click_identifier_control.dev", bool, bool, z1.f23629a);
        a("measurement.service.click_identifier_control", bool, bool, a2.f23092a);
        f23530p0 = a("measurement.config.persist_last_modified", bool2, bool2, b2.f23122a);
        f23532q0 = a("measurement.client.consent.suppress_1p_in_ga4f_install", bool2, bool2, c2.f23151a);
        f23534r0 = a("measurement.client.consent.gmpappid_worker_thread_fix", bool2, bool2, d2.f23159a);
        f23536s0 = a("measurement.module.pixie.ees", bool2, bool2, e2.f23172a);
        a("measurement.euid.client.dev", bool, bool, g2.f23214a);
        a("measurement.euid.service", bool, bool, h2.f23237a);
        f23538t0 = a("measurement.adid_zero.service", bool, bool, j2.f23289a);
        f23540u0 = a("measurement.adid_zero.remove_lair_if_adidzero_false", bool2, bool2, k2.f23304a);
        a("measurement.adid_zero.adid_uid", bool, bool, l2.f23320a);
        f23542v0 = a("measurement.service.refactor.package_side_screen", bool2, bool2, m2.f23337a);
        f23544w0 = a("measurement.config.fix_feature_flags_from_config", bool2, bool2, n2.f23365a);
    }

    public static <V> u2<V> a(String str, V v10, V v11, t2<V> t2Var) {
        u2<V> u2Var = new u2<>(str, v10, v11, t2Var);
        f23499a.add(u2Var);
        return u2Var;
    }

    public static Map<String, String> b(Context context) {
        h4 b10 = h4.b(context.getContentResolver(), p4.a("com.google.android.gms.measurement"));
        return b10 == null ? Collections.emptyMap() : b10.c();
    }
}
