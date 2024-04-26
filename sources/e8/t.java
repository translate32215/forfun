package e8;

import a6.b;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.uk;
import f7.y;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class t {
    public static final l<String> A = new o("gads:video:codec_query_mime_types", "");
    public static final l<Long> A0 = l.h("gads:ad_overlay:delay_page_close_timeout_ms", 5000);
    public static final l<Boolean> A1;
    public static final l<Boolean> A2;
    public static final l<Boolean> A3;
    public static final l<Boolean> A4;
    public static final l<Integer> B = l.b("gads:video:codec_query_minimum_version", 16);
    public static final l<Boolean> B0;
    public static final l<Boolean> B1;
    public static final l<Boolean> B2;
    public static final l<Boolean> B3;
    public static final l<Boolean> B4;
    public static final l<Boolean> C;
    public static final l<Boolean> C0;
    public static final l<Boolean> C1;
    public static final l<String> C2;
    public static final l<Boolean> C3;
    public static final l<Integer> C4 = l.b("gads:mediation_no_fill_error:min_version", 999999999);
    public static final l<String> D = new o("gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_banner.js");
    public static final l<Boolean> D0;
    public static final l<Boolean> D1;
    public static final l<String> D2;
    public static final l<Boolean> D3;
    public static final l<Integer> D4 = l.b("gads:offline_database_version:version", 1);
    public static final l<String> E = new o("gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_expanded_banner.js");
    public static final l<Boolean> E0;
    public static final l<Boolean> E1;
    public static final l<Integer> E2 = l.b("gad:http_redirect_max_count:times", 8);
    public static final l<Integer> E3 = l.b("gads:rewarded_precache_pool:count", 0);
    public static final l<Boolean> E4;
    public static final l<String> F = new o("gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_interstitial.js");
    public static final l<Boolean> F0;
    public static final l<String> F1 = new o("gads:sdk_core_constants:caps", "");
    public static final l<Boolean> F2;
    public static final l<Integer> F3 = l.b("gads:interstitial_precache_pool:count", 0);
    public static final l<Boolean> F4;
    public static final l<String> G = new o("gad:mraid:version", "3.0");
    public static final l<String> G0 = new o("gads:spherical_video:vertex_shader", "");
    public static final l<String> G1 = new o("gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
    public static final l<Integer> G2 = l.b("gads:omid:destroy_webview_delay", 1000);
    public static final l<String> G3 = l.c("gads:rewarded_precache_pool:discard_strategy", "lru");
    public static final l<Boolean> G4;
    public static final l<Boolean> H;
    public static final l<String> H0 = new o("gads:spherical_video:fragment_shader", "");
    public static final l<String> H1 = new o("gads:native:video_url_with_protocol", "https://imasdk.googleapis.com/admob/sdkloader/native_video.html");
    public static final l<Boolean> H2;
    public static final l<String> H3 = l.c("gads:interstitial_precache_pool:discard_strategy", "lru");
    public static final l<Boolean> H4;
    public static final l<Boolean> I;
    public static final l<Boolean> I0;
    public static final l<Boolean> I1;
    public static final l<Boolean> I2;
    public static final l<String> I3 = l.c("gads:rewarded_precache_pool:cache_start_trigger", "onAdClosed");
    public static final l<Boolean> I4;
    public static final l<Integer> J = l.b("gads:content_vertical_fingerprint_number", 100);
    public static final l<Long> J0 = l.h("gads:position_watcher:throttle_ms", 200);
    public static final l<Integer> J1 = l.b("gads:native_video_load_timeout", 10);
    public static final l<Boolean> J2;
    public static final l<String> J3 = l.c("gads:interstitial_precache_pool:cache_start_trigger", "onAdClosed");
    public static final l<Integer> J4 = l.b("gads:remote_log_send_rate_ms", 60000);
    public static final l<Integer> K = l.b("gads:content_vertical_fingerprint_bits", 23);
    public static final l<Long> K0 = l.h("gads:position_watcher:scroll_aware_throttle_ms", 33);
    public static final l<Boolean> K1;
    public static final l<Integer> K2 = l.b("gads:app_open_beta:min_version", 999999999);
    public static final l<Integer> K3 = l.b("gads:rewarded_precache_pool:size", 1);
    public static final l<Integer> K4 = l.b("gads:remote_log_queue_max_entries", 500);
    public static final l<Integer> L = l.b("gads:content_vertical_fingerprint_ngram", 3);
    public static final l<Boolean> L0;
    public static final l<Boolean> L1;
    public static final l<Integer> L2 = l.b("gads:app_open_ad_open_beta_api:min_version", 202490999);
    public static final l<Integer> L3 = l.b("gads:interstitial_precache_pool:size", 1);
    public static final l<Integer> L4 = l.b("gads:app_event_queue_size", 20);
    public static final l<String> M = new o("gads:content_fetch_view_tag_id", "googlebot");
    public static final l<Boolean> M0;
    public static final l<Boolean> M1;
    public static final l<Boolean> M2;
    public static final l<Integer> M3 = l.b("gads:rewarded_precache_pool:ad_time_limit", 1200);
    public static final l<String> N = new o("gads:content_fetch_exclude_view_tag", "none");
    public static final l<Boolean> N0;
    public static final l<String> N1 = new o("gads:ad_choices_content_description", "Ad Choices Icon");
    public static final l<String> N2 = new o("gads:nonagon:rewardedvideo:ad_unit_exclusions", "(?!)");
    public static final l<Integer> N3 = l.b("gads:interstitial_precache_pool:ad_time_limit", 1200);
    public static final l<Boolean> O;
    public static final l<String> O0 = new o("gads:logged_adapter_version_classes", "");
    public static final l<Boolean> O1;
    public static final l<Boolean> O2;
    public static final l<String> O3 = l.c("gads:rewarded_precache_pool:schema", "customTargeting,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");
    public static final l<Boolean> P;
    public static final l<Long> P0 = l.h("gads:rtb_v1_1:signal_timeout_ms", 1000);
    public static final l<Boolean> P1;
    public static final l<Boolean> P2;
    public static final l<String> P3 = l.c("gads:interstitial_precache_pool:schema", "customTargeting,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");
    public static final l<Boolean> Q;
    public static final l<Boolean> Q0;
    public static final l<Boolean> Q1;
    public static final l<Boolean> Q2;
    public static final l<String> Q3 = l.c("gads:app_open_precache_pool:schema", "orientation,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");
    public static final l<Boolean> R;
    public static final l<Boolean> R0;
    public static final l<Boolean> R1;
    public static final l<Boolean> R2;
    public static final l<String> R3 = l.c("gads:app_open_precache_pool:discard_strategy", "oldest");
    public static final l<String> S = new o("gads:sai:click_ping_schema_v2", "^[^?]*(/aclk\\?|/pcs/click\\?).*");
    public static final l<Boolean> S0;
    public static final l<Boolean> S1;
    public static final l<Boolean> S2;
    public static final l<Integer> S3 = l.b("gads:app_open_precache_pool:count", 0);
    public static final l<String> T = new o("gads:sai:impression_ping_schema_v2", "^[^?]*(/adview|/pcs/view).*");
    public static final l<String> T0 = new o("gads:rtb_logging:regex", "(?!)");
    public static final l<Boolean> T1;
    public static final l<Integer> T2 = l.b("gads:nonagon:request_timeout:seconds", 60);
    public static final l<String> T3 = l.c("gads:app_open_precache_pool:cache_start_trigger", "onAdClosed");
    public static final l<Boolean> U;
    public static final l<Boolean> U0;
    public static final l<Boolean> U1;
    public static final l<Boolean> U2;
    public static final l<Integer> U3 = l.b("gads:app_open_precache_pool:size", 1);
    public static final l<String> V = new o("gads:sai:ad_event_id_macro_name", "[gw_fbsaeid]");
    public static final l<Boolean> V0;
    public static final l<Long> V1 = l.h("gads:fetch_app_settings_using_cld:refresh_interval_ms", 7200000);
    public static final l<Boolean> V2;
    public static final l<Integer> V3 = l.b("gads:app_open_precache_pool:ad_time_limit", 14400);
    public static final l<Long> W = l.h("gads:sai:timeout_ms", -1);
    public static final l<Boolean> W0;
    public static final l<Long> W1 = l.h("gads:parental_controls:timeout", 2000);
    public static final l<Boolean> W2;
    public static final l<Boolean> W3;
    public static final l<Integer> X = l.b("gads:sai:scion_thread_pool_size", 5);
    public static final l<Boolean> X0;
    public static final l<Boolean> X1;
    public static final l<Boolean> X2;
    public static final l<Boolean> X3;
    public static final l<Boolean> Y;
    public static final l<Boolean> Y0;
    public static final l<Boolean> Y1;
    public static final l<String> Y2 = l.c("gads:uri_query_to_map_bg_thread:types", "/result");
    public static final l<Boolean> Y3;
    public static final l<Integer> Z = l.b("gads:sai:app_measurement_min_client_dynamite_version", 20290);
    public static final l<Boolean> Z0;
    public static final l<Boolean> Z1;
    public static final l<Integer> Z2 = l.b("gads:uri_query_to_map_bg_thread:min_length", 1000);
    public static final l<Boolean> Z3;

    /* renamed from: a  reason: collision with root package name */
    public static final l<String> f16542a = new o("gads:sdk_core_location:client:html", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html");

    /* renamed from: a0  reason: collision with root package name */
    public static final l<Boolean> f16543a0;

    /* renamed from: a1  reason: collision with root package name */
    public static final l<Integer> f16544a1 = l.b("gads:adapter_initialization:min_sdk_version", 15301000);

    /* renamed from: a2  reason: collision with root package name */
    public static final l<Long> f16545a2 = l.h("gads:cache:bind_on_request_keep_alive", TimeUnit.SECONDS.toMillis(30));

    /* renamed from: a3  reason: collision with root package name */
    public static final l<Boolean> f16546a3;

    /* renamed from: a4  reason: collision with root package name */
    public static final l<Boolean> f16547a4;

    /* renamed from: b  reason: collision with root package name */
    public static final l<String> f16548b = new o("gads:video_exo_player:version", "3");

    /* renamed from: b0  reason: collision with root package name */
    public static final l<Boolean> f16549b0;

    /* renamed from: b1  reason: collision with root package name */
    public static final l<Long> f16550b1 = l.h("gads:adapter_initialization:timeout", 30);

    /* renamed from: b2  reason: collision with root package name */
    public static final l<Boolean> f16551b2;

    /* renamed from: b3  reason: collision with root package name */
    public static final l<Boolean> f16552b3;

    /* renamed from: b4  reason: collision with root package name */
    public static final l<String> f16553b4 = l.c("gads:csi:error_parsing:regex", "^(\\d+)");

    /* renamed from: c  reason: collision with root package name */
    public static final l<Integer> f16554c = l.b("gads:video_exo_player:connect_timeout", 8000);

    /* renamed from: c0  reason: collision with root package name */
    public static final l<Boolean> f16555c0;

    /* renamed from: c1  reason: collision with root package name */
    public static final l<Long> f16556c1 = l.h("gads:adapter_initialization:cld_timeout", 10);

    /* renamed from: c2  reason: collision with root package name */
    public static final l<Boolean> f16557c2;

    /* renamed from: c3  reason: collision with root package name */
    public static final l<Boolean> f16558c3;

    /* renamed from: c4  reason: collision with root package name */
    public static final l<Boolean> f16559c4;

    /* renamed from: d  reason: collision with root package name */
    public static final l<Integer> f16560d = l.b("gads:video_exo_player:read_timeout", 8000);

    /* renamed from: d0  reason: collision with root package name */
    public static final l<Boolean> f16561d0;

    /* renamed from: d1  reason: collision with root package name */
    public static final l<Boolean> f16562d1;

    /* renamed from: d2  reason: collision with root package name */
    public static final l<Long> f16563d2 = l.h("gads:cache:connection_timeout", 5000);

    /* renamed from: d3  reason: collision with root package name */
    public static final l<Boolean> f16564d3;

    /* renamed from: d4  reason: collision with root package name */
    public static final l<Integer> f16565d4 = l.b("gads:native_ads_signal:timeout", 1000);

    /* renamed from: e  reason: collision with root package name */
    public static final l<Integer> f16566e = l.b("gads:video_exo_player:loading_check_interval", 1048576);

    /* renamed from: e0  reason: collision with root package name */
    public static final l<Boolean> f16567e0;

    /* renamed from: e1  reason: collision with root package name */
    public static final l<Boolean> f16568e1;

    /* renamed from: e2  reason: collision with root package name */
    public static final l<Long> f16569e2 = l.h("gads:cache:read_only_connection_timeout", 5000);

    /* renamed from: e3  reason: collision with root package name */
    public static final l<Boolean> f16570e3;

    /* renamed from: e4  reason: collision with root package name */
    public static final l<Integer> f16571e4 = l.b("gads:signal_v2:min_version", 19677000);

    /* renamed from: f  reason: collision with root package name */
    public static final l<Integer> f16572f = l.b("gads:video_exo_player:exo_player_precache_limit", Integer.MAX_VALUE);

    /* renamed from: f0  reason: collision with root package name */
    public static final l<Boolean> f16573f0;

    /* renamed from: f1  reason: collision with root package name */
    public static final l<Boolean> f16574f1;

    /* renamed from: f2  reason: collision with root package name */
    public static final l<Boolean> f16575f2;

    /* renamed from: f3  reason: collision with root package name */
    public static final l<Boolean> f16576f3;

    /* renamed from: f4  reason: collision with root package name */
    public static final l<Boolean> f16577f4;

    /* renamed from: g  reason: collision with root package name */
    public static final l<Integer> f16578g = l.b("gads:video_exo_player:byte_buffer_precache_limit", Integer.MAX_VALUE);

    /* renamed from: g0  reason: collision with root package name */
    public static final l<Boolean> f16579g0;

    /* renamed from: g1  reason: collision with root package name */
    public static final l<Boolean> f16580g1;

    /* renamed from: g2  reason: collision with root package name */
    public static final l<Boolean> f16581g2;

    /* renamed from: g3  reason: collision with root package name */
    public static final l<Boolean> f16582g3;

    /* renamed from: g4  reason: collision with root package name */
    public static final l<Boolean> f16583g4;

    /* renamed from: h  reason: collision with root package name */
    public static final l<Integer> f16584h = l.b("gads:video_exo_player_socket_receive_buffer_size", 0);

    /* renamed from: h0  reason: collision with root package name */
    public static final l<Boolean> f16585h0;

    /* renamed from: h1  reason: collision with root package name */
    public static final l<Boolean> f16586h1;

    /* renamed from: h2  reason: collision with root package name */
    public static final l<Boolean> f16587h2;

    /* renamed from: h3  reason: collision with root package name */
    public static final l<Boolean> f16588h3;

    /* renamed from: h4  reason: collision with root package name */
    public static final l<Boolean> f16589h4;

    /* renamed from: i  reason: collision with root package name */
    public static final l<String> f16590i = new o("gads:video_exo_player:precache_exceptions", "");

    /* renamed from: i0  reason: collision with root package name */
    public static final l<String> f16591i0 = new o("gads:idless:cookie_modification", "=; Max-Age=-1; path=/; domain=.doubleclick.net");

    /* renamed from: i1  reason: collision with root package name */
    public static final l<Integer> f16592i1 = l.b("gads:gestures:a2:enabled", 0);

    /* renamed from: i2  reason: collision with root package name */
    public static final l<String> f16593i2 = new o("gads:http_assets_cache:regex", "(?i)https:\\/\\/(tpc\\.googlesyndication\\.com\\/(.*)|lh\\d+\\.googleusercontent\\.com\\/(.*))");

    /* renamed from: i3  reason: collision with root package name */
    public static final l<Boolean> f16594i3;

    /* renamed from: i4  reason: collision with root package name */
    public static final l<Boolean> f16595i4;

    /* renamed from: j  reason: collision with root package name */
    public static final l<Integer> f16596j = l.b("gads:video_exo_player:min_retry_count", -1);

    /* renamed from: j0  reason: collision with root package name */
    public static final l<Boolean> f16597j0;

    /* renamed from: j1  reason: collision with root package name */
    public static final l<Boolean> f16598j1;

    /* renamed from: j2  reason: collision with root package name */
    public static final l<Integer> f16599j2 = l.b("gads:http_assets_cache:time_out", 100);

    /* renamed from: j3  reason: collision with root package name */
    public static final l<Boolean> f16600j3;

    /* renamed from: j4  reason: collision with root package name */
    public static final l<Boolean> f16601j4;

    /* renamed from: k  reason: collision with root package name */
    public static final l<Boolean> f16602k;

    /* renamed from: k0  reason: collision with root package name */
    public static final l<Boolean> f16603k0;

    /* renamed from: k1  reason: collision with root package name */
    public static final b<Boolean> f16604k1 = y0.f17544b;

    /* renamed from: k2  reason: collision with root package name */
    public static final l<Boolean> f16605k2;

    /* renamed from: k3  reason: collision with root package name */
    public static final l<Boolean> f16606k3;

    /* renamed from: k4  reason: collision with root package name */
    public static final l<Boolean> f16607k4;

    /* renamed from: l  reason: collision with root package name */
    public static final l<Integer> f16608l = l.b("gads:video_stream_cache:limit_count", 5);

    /* renamed from: l0  reason: collision with root package name */
    public static final l<Boolean> f16609l0;

    /* renamed from: l1  reason: collision with root package name */
    public static final l<Boolean> f16610l1;

    /* renamed from: l2  reason: collision with root package name */
    public static final l<Boolean> f16611l2;

    /* renamed from: l3  reason: collision with root package name */
    public static final l<Boolean> f16612l3;

    /* renamed from: l4  reason: collision with root package name */
    public static final l<String> f16613l4;

    /* renamed from: m  reason: collision with root package name */
    public static final l<Integer> f16614m = l.b("gads:video_stream_cache:limit_space", 8388608);

    /* renamed from: m0  reason: collision with root package name */
    public static final l<Boolean> f16615m0;

    /* renamed from: m1  reason: collision with root package name */
    public static final l<Long> f16616m1 = l.h("gads:gestures:task_timeout", 2000);

    /* renamed from: m2  reason: collision with root package name */
    public static final l<Boolean> f16617m2;

    /* renamed from: m3  reason: collision with root package name */
    public static final l<Long> f16618m3 = l.h("gads:mobius_linking:sdk_side_cooldown_time_threshold:ms", 3600000);

    /* renamed from: m4  reason: collision with root package name */
    public static final l<Integer> f16619m4 = l.b("gads:policy_validator_layoutparam:flags", 808);

    /* renamed from: n  reason: collision with root package name */
    public static final l<Integer> f16620n = l.b("gads:video_stream_exo_cache:buffer_size", 8388608);

    /* renamed from: n0  reason: collision with root package name */
    public static final l<Boolean> f16621n0;

    /* renamed from: n1  reason: collision with root package name */
    public static final l<Boolean> f16622n1;

    /* renamed from: n2  reason: collision with root package name */
    public static final l<Boolean> f16623n2;

    /* renamed from: n3  reason: collision with root package name */
    public static final l<Integer> f16624n3 = l.b("gads:adoverlay:b68684796:targeting_sdk:lower_bound", 27);

    /* renamed from: n4  reason: collision with root package name */
    public static final l<Boolean> f16625n4;

    /* renamed from: o  reason: collision with root package name */
    public static final l<Long> f16626o = l.h("gads:video_stream_cache:limit_time_sec", 300);

    /* renamed from: o0  reason: collision with root package name */
    public static final l<Boolean> f16627o0;

    /* renamed from: o1  reason: collision with root package name */
    public static final l<Boolean> f16628o1;

    /* renamed from: o2  reason: collision with root package name */
    public static final l<Long> f16629o2 = l.h("gads:debug_hold_gesture:time_millis", 2000);

    /* renamed from: o3  reason: collision with root package name */
    public static final l<Integer> f16630o3 = l.b("gads:adoverlay:b68684796:targeting_sdk:upper_bound", 26);

    /* renamed from: o4  reason: collision with root package name */
    public static final l<Integer> f16631o4 = l.b("gads:policy_validator_overlay_width:dp", 350);

    /* renamed from: p  reason: collision with root package name */
    public static final l<Long> f16632p = l.h("gads:video_stream_cache:notify_interval_millis", 125);

    /* renamed from: p0  reason: collision with root package name */
    public static final l<Boolean> f16633p0;

    /* renamed from: p1  reason: collision with root package name */
    public static final l<Boolean> f16634p1;

    /* renamed from: p2  reason: collision with root package name */
    public static final l<String> f16635p2 = new o("gads:drx_debug:debug_device_linking_url", "https://www.google.com/dfp/linkDevice");

    /* renamed from: p3  reason: collision with root package name */
    public static final l<Integer> f16636p3 = l.b("gads:adoverlay:b68684796:sdk_int:lower_bound", 27);

    /* renamed from: p4  reason: collision with root package name */
    public static final l<Integer> f16637p4 = l.b("gads:policy_validator_overlay_height:dp", 140);

    /* renamed from: q  reason: collision with root package name */
    public static final l<Integer> f16638q = l.b("gads:video_stream_cache:connect_timeout_millis", 10000);

    /* renamed from: q0  reason: collision with root package name */
    public static final l<Boolean> f16639q0;

    /* renamed from: q1  reason: collision with root package name */
    public static final l<Boolean> f16640q1;

    /* renamed from: q2  reason: collision with root package name */
    public static final l<String> f16641q2 = new o("gads:drx_debug:in_app_preview_status_url", "https://www.google.com/dfp/inAppPreview");

    /* renamed from: q3  reason: collision with root package name */
    public static final l<Integer> f16642q3 = l.b("gads:adoverlay:b68684796:sdk_int:upper_bound", 26);

    /* renamed from: q4  reason: collision with root package name */
    public static final l<Boolean> f16643q4;

    /* renamed from: r  reason: collision with root package name */
    public static final l<String> f16644r = new o("gads:video:metric_frame_hash_times", "");

    /* renamed from: r0  reason: collision with root package name */
    public static final l<String> f16645r0 = new o("gads:webview_cookie_url", "googleads.g.doubleclick.net");

    /* renamed from: r1  reason: collision with root package name */
    public static final l<Boolean> f16646r1;

    /* renamed from: r2  reason: collision with root package name */
    public static final l<String> f16647r2 = new o("gads:drx_debug:debug_signal_status_url", "https://www.google.com/dfp/debugSignals");

    /* renamed from: r3  reason: collision with root package name */
    public static final l<Boolean> f16648r3;

    /* renamed from: r4  reason: collision with root package name */
    public static final l<Boolean> f16649r4;

    /* renamed from: s  reason: collision with root package name */
    public static final l<Long> f16650s = l.h("gads:video:metric_frame_hash_time_leniency", 500);

    /* renamed from: s0  reason: collision with root package name */
    public static final l<Boolean> f16651s0;

    /* renamed from: s1  reason: collision with root package name */
    public static final l<Boolean> f16652s1;

    /* renamed from: s2  reason: collision with root package name */
    public static final l<String> f16653s2 = new o("gads:drx_debug:send_debug_data_url", "https://www.google.com/dfp/sendDebugData");

    /* renamed from: s3  reason: collision with root package name */
    public static final l<Boolean> f16654s3;

    /* renamed from: s4  reason: collision with root package name */
    public static final l<Boolean> f16655s4;

    /* renamed from: t  reason: collision with root package name */
    public static final l<Boolean> f16656t;

    /* renamed from: t0  reason: collision with root package name */
    public static final l<Boolean> f16657t0;

    /* renamed from: t1  reason: collision with root package name */
    public static final l<String> f16658t1 = new o("gads:gestures:pk", "");

    /* renamed from: t2  reason: collision with root package name */
    public static final l<Integer> f16659t2 = l.b("gads:drx_debug:timeout_ms", 5000);

    /* renamed from: t3  reason: collision with root package name */
    public static final l<Boolean> f16660t3;

    /* renamed from: t4  reason: collision with root package name */
    public static final l<Boolean> f16661t4;

    /* renamed from: u  reason: collision with root package name */
    public static final l<Long> f16662u = l.h("gads:video:surface_update_min_spacing_ms", 1000);

    /* renamed from: u0  reason: collision with root package name */
    public static final l<Boolean> f16663u0;

    /* renamed from: u1  reason: collision with root package name */
    public static final l<Boolean> f16664u1;

    /* renamed from: u2  reason: collision with root package name */
    public static final l<Integer> f16665u2 = l.b("gad:pixel_dp_comparision_multiplier", 1);

    /* renamed from: u3  reason: collision with root package name */
    public static final l<String> f16666u3;

    /* renamed from: u4  reason: collision with root package name */
    public static final l<Boolean> f16667u4;

    /* renamed from: v  reason: collision with root package name */
    public static final l<Boolean> f16668v;

    /* renamed from: v0  reason: collision with root package name */
    public static final l<Long> f16669v0 = l.h("gads:app_activity_tracker:notify_background_listeners_delay_ms", 500);

    /* renamed from: v1  reason: collision with root package name */
    public static final l<Boolean> f16670v1;

    /* renamed from: v2  reason: collision with root package name */
    public static final l<Boolean> f16671v2;

    /* renamed from: v3  reason: collision with root package name */
    public static final l<Boolean> f16672v3;

    /* renamed from: v4  reason: collision with root package name */
    public static final l<String> f16673v4 = l.c("gads:server_transaction_source:list", "Network");

    /* renamed from: w  reason: collision with root package name */
    public static final l<Integer> f16674w = l.b("gads:video:spinner:scale", 4);

    /* renamed from: w0  reason: collision with root package name */
    public static final l<Long> f16675w0 = l.h("gads:app_activity_tracker:app_session_timeout_ms", TimeUnit.MINUTES.toMillis(5));

    /* renamed from: w1  reason: collision with root package name */
    public static final l<Boolean> f16676w1;

    /* renamed from: w2  reason: collision with root package name */
    public static final l<Boolean> f16677w2;

    /* renamed from: w3  reason: collision with root package name */
    public static final l<Integer> f16678w3 = l.b("gads:nativeads:image:sample:pixels", 1048576);

    /* renamed from: w4  reason: collision with root package name */
    public static final l<Boolean> f16679w4;

    /* renamed from: x  reason: collision with root package name */
    public static final l<Long> f16680x = l.h("gads:video:spinner:jank_threshold_ms", 50);

    /* renamed from: x0  reason: collision with root package name */
    public static final l<Boolean> f16681x0;

    /* renamed from: x1  reason: collision with root package name */
    public static final l<Boolean> f16682x1;

    /* renamed from: x2  reason: collision with root package name */
    public static final l<Boolean> f16683x2;

    /* renamed from: x3  reason: collision with root package name */
    public static final l<Boolean> f16684x3;

    /* renamed from: x4  reason: collision with root package name */
    public static final l<Boolean> f16685x4;

    /* renamed from: y  reason: collision with root package name */
    public static final l<Boolean> f16686y;

    /* renamed from: y0  reason: collision with root package name */
    public static final l<Long> f16687y0 = l.h("gads:adid_values_in_adrequest:timeout", 2000);

    /* renamed from: y1  reason: collision with root package name */
    public static final l<Boolean> f16688y1;

    /* renamed from: y2  reason: collision with root package name */
    public static final l<Integer> f16689y2 = l.b("gad:interstitial:close_button_padding_dip", 0);

    /* renamed from: y3  reason: collision with root package name */
    public static final l<Boolean> f16690y3;

    /* renamed from: y4  reason: collision with root package name */
    public static final l<Integer> f16691y4 = l.b("gads:ad_error_api:min_version", 999999999);

    /* renamed from: z  reason: collision with root package name */
    public static final l<Boolean> f16692z;

    /* renamed from: z0  reason: collision with root package name */
    public static final l<Boolean> f16693z0;

    /* renamed from: z1  reason: collision with root package name */
    public static final l<Boolean> f16694z1;

    /* renamed from: z2  reason: collision with root package name */
    public static final l<Boolean> f16695z2;

    /* renamed from: z3  reason: collision with root package name */
    public static final l<Integer> f16696z3 = l.b("gads:offline_signaling:log_maximum", 100);

    /* renamed from: z4  reason: collision with root package name */
    public static final l<Boolean> f16697z4;

    static {
        new o("gads:active_view_location:html", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html");
        b<Boolean> bVar = x0.f17425c;
        l.b("gads:http_url_connection_factory:timeout_millis", 10000);
        Boolean bool = Boolean.FALSE;
        f16602k = new k(1, "gads:video_exo_player:fmp4_extractor_enabled", bool);
        f16656t = new k(1, "gads:video:force_watermark", bool);
        f16668v = new k(1, "gads:video:spinner:enabled", bool);
        f16686y = new k(1, "gads:video:aggressive_media_codec_release", bool);
        f16692z = new k(1, "gads:memory_bundle:debug_info", bool);
        C = new k(1, "gads:video:set_black_background", bool);
        H = new k(1, "gads:mraid:expanded_interstitial_fix", bool);
        I = new k(1, "gads:mraid:initial_size_fallback", bool);
        O = new k(1, "gads:content_fetch_disable_get_title_from_webview", bool);
        P = new k(1, "gads:content_fetch_enable_new_content_score", bool);
        Q = new k(1, "gads:content_fetch_enable_serve_once", bool);
        Boolean bool2 = Boolean.TRUE;
        R = new k(1, "gads:sai:enabled", bool2);
        U = new k(1, "gads:sai:using_macro:enabled", bool);
        Y = new k(1, "gads:sai:app_measurement_enabled3", bool);
        f16543a0 = new k(1, "gads:sai:force_through_reflection", bool2);
        f16549b0 = new k(1, "gads:sai:gmscore_availability_check_disabled", bool);
        f16555c0 = new k(1, "gads:sai:logging_disabled_for_drx", bool);
        f16561d0 = new k(1, "gads:sai:app_measurement_npa_enabled", bool);
        f16567e0 = new k(1, "gads:idless:idless_disables_attestation", bool2);
        f16573f0 = new k(1, "gads:idless:app_measurement_idless_enabled", bool2);
        f16579g0 = new k(1, "gads:idless:internal_state_enabled", bool2);
        f16585h0 = new k(1, "gads:idless:idless_disables_offline_ads_signalling", bool2);
        f16597j0 = new k(1, "gads:interstitial:app_must_be_foreground:enabled", bool);
        f16603k0 = new k(1, "gads:interstitial:foreground_report:enabled", bool);
        f16609l0 = new k(1, "gads:interstitial:default_immersive", bool);
        f16615m0 = new k(1, "gads:webview:error_web_response:enabled", bool);
        f16621n0 = new k(1, "gads:webview:pause_interstitial:enabled", bool2);
        new k(1, "gads:rsku:webviewgone:kill_process:enabled", bool);
        f16627o0 = new k(1, "gads:webviewgone:kill_process:enabled", bool);
        new k(1, "gads:rsku:webviewgone:new_onshow:enabled", bool2);
        f16633p0 = new k(1, "gads:webviewgone:new_onshow:enabled", bool);
        f16639q0 = new k(1, "gads:webview:pause_resume:enabled", bool2);
        new k(1, "gads:new_rewarded_ad:enabled", bool2);
        f16651s0 = new k(1, "gads:rewarded:adapter_initialization_enabled", bool);
        l.h("gads:rewarded:adapter_timeout_ms", 20000);
        f16657t0 = new k(1, "gads:rewarded:ad_metadata_enabled", bool);
        f16663u0 = new k(1, "gads:rewarded:ssv_custom_data_enabled", bool2);
        f16681x0 = new k(1, "gads:adid_values_in_adrequest:enabled", bool);
        f16693z0 = new k(1, "gads:disable_adid_values_in_ms", bool);
        B0 = new k(1, "gads:custom_close_blocking:enabled", bool);
        C0 = new k(1, "gads:disabling_closable_area:enabled", bool);
        D0 = new k(1, "gads:use_system_ui_for_fullscreen:enabled", bool);
        E0 = new k(1, "gads:ad_overlay:collect_cutout_info:enabled", bool);
        new k(1, "gads:impression_optimization_enabled", bool);
        new o("gads:banner_ad_pool:schema", "customTargeting");
        l.b("gads:banner_ad_pool:max_queues", 3);
        l.b("gads:banner_ad_pool:max_pools", 3);
        F0 = new k(1, "gads:delay_banner_renderer:enabled", bool2);
        new k(1, "gads:interstitial_ad_pool:enabled", bool);
        new k(1, "gads:interstitial_ad_pool:enabled_for_rewarded", bool);
        new o("gads:interstitial_ad_pool:schema", "customTargeting");
        new o("gads:interstitial_ad_pool:request_exclusions", "com.google.ads.mediation.admob.AdMobAdapter/_ad");
        l.b("gads:interstitial_ad_pool:max_pools", 3);
        l.b("gads:interstitial_ad_pool:max_pool_depth", 2);
        l.b("gads:interstitial_ad_pool:time_limit_sec", 1200);
        new o("gads:interstitial_ad_pool:ad_unit_exclusions", "(?!)");
        l.b("gads:interstitial_ad_pool:top_off_latency_min_millis", 0);
        l.b("gads:interstitial_ad_pool:top_off_latency_range_millis", 0);
        l.h("gads:interstitial_ad_pool:discard_thresholds", 0);
        l.h("gads:interstitial_ad_pool:miss_thresholds", 0);
        new q("gads:interstitial_ad_pool:discard_asymptote", Float.valueOf(0.0f));
        new q("gads:interstitial_ad_pool:miss_asymptote", Float.valueOf(0.0f));
        I0 = new k(1, "gads:include_local_global_rectangles", bool);
        L0 = new k(1, "gads:position_watcher:enable_scroll_aware_ads", bool);
        M0 = new k(1, "gads:position_watcher:send_scroll_data", bool);
        new k(1, "gads:gen204_signals:enabled", bool);
        N0 = new k(1, "gads:extra_sdk_versions_for_crash_reports:enabled", bool2);
        Q0 = new k(1, "gads:rtb_signal:enabled", bool2);
        R0 = new k(1, "gads:rtb_v1_1:cld:enabled", bool2);
        S0 = new k(1, "gads:rtb_v1_1:cld:check_regex:enabled", bool2);
        U0 = new k(1, "gads:presentation_error:urls_enabled", bool);
        V0 = new k(1, "gads:rtb_interstitial:use_fullscreen_monitor", bool);
        W0 = new k(1, "gads:native_required_assets:enabled", bool);
        X0 = new k(1, "gads:native_required_assets:check_inner_mediaview:enabled", bool2);
        Y0 = new k(1, "gads:track_view_next_runloop:enabled", bool);
        Z0 = new k(1, "gads:v1_1:adapter_initialization:enabled", bool2);
        f16562d1 = new k(1, "gads:additional_video_csi:enabled", bool);
        f16568e1 = new k(1, "gads:csi:enabled_per_sampling", bool);
        f16574f1 = new k(1, "gads:initialization_csi:enabled", bool);
        new k(1, "gads:initialization_csi_control:enabled", bool);
        f16580g1 = new k(1, "gads:msa:experiments:enabled", bool);
        f16586h1 = new k(1, "gads:msa:experiments:ps:enabled", bool);
        f16598j1 = new k(1, "gads:gestures:clearTd:enabled", bool);
        f16610l1 = new k(1, "gads:gestures:errorlogging:enabled", bool);
        f16622n1 = new k(1, "gads:gestures:asig:enabled", bool);
        f16628o1 = new k(1, "gads:gestures:ans:enabled", bool);
        f16634p1 = new k(1, "gads:gestures:tos:enabled", bool);
        new k(1, "gads:gestures:brt:enabled", bool2);
        f16640q1 = new k(1, "gads:gestures:fpi:enabled", bool);
        f16646r1 = new k(1, "gads:signal:app_permissions:disabled", bool);
        f16652s1 = new k(1, "gads:gestures:hpk:enabled", bool2);
        f16664u1 = new k(1, "gads:gestures:bs:enabled", bool2);
        f16670v1 = new k(1, "gads:gestures:check_initialization_thread:enabled", bool);
        f16676w1 = new k(1, "gads:gestures:init_new_thread:enabled", bool2);
        f16682x1 = new k(1, "gads:gestures:pds:enabled", bool2);
        l.b("gads:gestures:as2percentage", 0);
        f16688y1 = new k(1, "gads:gestures:ns:enabled", bool2);
        f16694z1 = new k(1, "gads:gestures:vdd:enabled", bool);
        A1 = new k(1, "gads:native:asset_view_touch_events", bool);
        B1 = new k(1, "gads:native:set_touch_listener_on_asset_views", bool2);
        C1 = new k(1, "gads:ais:enabled", bool2);
        D1 = new k(1, "gads:stav:enabled", bool);
        E1 = new k(1, "gads:send_available_disk_space:enabled", bool);
        ti0.f16763j.f16767d.f16218b.add(new o("gads:sdk_core_constants:experiment_id", (String) null));
        new k(1, "gads:js_flags:disable_phenotype", bool);
        new o("gads:native:video_url", "//imasdk.googleapis.com/admob/sdkloader/native_video.html");
        I1 = new k(1, "gads:native:get_native_ad_view_signals", bool);
        l.b("gads:omid:native_webview_load_timeout", 2000);
        K1 = new k(1, "gads:omid:native_video_ad_user_action_event:enabled", bool);
        L1 = new k(1, "gads:enable_native_media_aspect_ratio", bool2);
        M1 = new k(1, "gads:native:media_content_main_image:enabled", bool2);
        new k(1, "gads:enable_store_active_view_state", bool);
        O1 = new k(1, "gads:enable_singleton_broadcast_receiver", bool);
        P1 = new k(1, "gads:native:media_view_match_parent:enabled", bool);
        Q1 = new k(1, "gads:native:count_impression_for_assets", bool);
        new k(1, "gads:instream_ad:enabled", bool2);
        R1 = new k(1, "gads:fluid_ad:use_wrap_content_height", bool);
        new k(1, "gads:auto_location_for_coarse_permission", bool);
        l.g("gads:auto_location_for_coarse_permission:experiment_id");
        l.h("gads:auto_location_timeout", 2000);
        l.g("gads:auto_location_timeout:experiment_id");
        l.h("gads:auto_location_interval", -1);
        l.g("gads:auto_location_interval:experiment_id");
        S1 = new k(1, "gads:rtb_v1_1:fetch_app_settings_using_cld:enabled", bool2);
        T1 = new k(1, "gads:get_request_signals_cld:enabled", bool2);
        U1 = new k(1, "gads:rtb_v1_1:use_manifest_appid_cld:enabled", bool2);
        l.b("gads:cache:ad_request_timeout_millis", 250);
        l.b("gads:cache:max_concurrent_downloads", 10);
        new k(1, "gads:cache:downloader_use_high_priority", bool);
        l.h("gads:cache:javascript_timeout_millis", 5000);
        X1 = new k(1, "gads:cache:bind_on_foreground", bool);
        Y1 = new k(1, "gads:cache:bind_on_init", bool);
        Z1 = new k(1, "gads:cache:bind_on_request", bool);
        f16551b2 = new k(1, "gads:cache:use_cache_data_source", bool);
        f16557c2 = new k(1, "gads:cache:connection_per_read", bool);
        f16575f2 = new k(1, "gads:cache:read_inner_data_source_if_gcache_miss", bool);
        f16581g2 = new k(1, "gads:cache:read_inner_data_source_if_gcache_not_downloaded", bool);
        f16587h2 = new k(1, "gads:http_assets_cache:enabled", bool);
        f16605k2 = new k(1, "gads:chrome_custom_tabs_browser:enabled", bool);
        f16611l2 = new k(1, "gads:chrome_custom_tabs:disabled", bool);
        f16617m2 = new k(1, "gads:chrome_custom_tabs_browser_v2:enabled", bool);
        f16623n2 = new k(1, "gads:chrome_custom_tabs_for_native_ads:enabled", bool);
        f16671v2 = new k(1, "gad:interstitial_for_multi_window", bool);
        f16677w2 = new k(1, "gad:interstitial_ad_stay_active_in_multi_window", bool);
        f16683x2 = new k(1, "gad:interstitial_multi_window_method", bool);
        f16695z2 = new k(1, "gads:clearcut_logging:enabled", bool);
        A2 = new k(1, "gads:clearcut_logging:write_to_file", bool);
        B2 = new k(1, "gad:publisher_testing:force_local_request:enabled", bool2);
        String str = "";
        C2 = new o("gad:publisher_testing:force_local_request:enabled_list", str);
        D2 = new o("gad:publisher_testing:force_local_request:disabled_list", str);
        F2 = new k(1, "gads:omid:enabled", bool2);
        new k(1, "gads:omid_1_3_activate:enabled", bool);
        H2 = new k(1, "gads:omid_1_3_create_html_session:enabled", bool);
        I2 = new k(1, "gads:omid_1_3_create_js_session:enabled", bool);
        new k(1, "gads:omid_1_3_friendly_obstruction:enabled", bool);
        J2 = new k(1, "gads:omid_1_3_fire_loaded_event:enabled", bool);
        new k(1, "gads:nonagon:banner:enabled", bool2);
        new o("gads:nonagon:banner:ad_unit_exclusions", "(?!)");
        new k(1, "gads:nonagon:app_open:enabled", bool2);
        new o("gads:nonagon:app_open:ad_unit_exclusions", "(?!)");
        new k(1, "gads:nonagon:interstitial:enabled", bool2);
        new o("gads:nonagon:interstitial:ad_unit_exclusions", "(?!)");
        new k(1, "gads:nonagon:rewardedvideo:enabled", bool2);
        M2 = new k(1, "gads:nonagon:mobile_ads_setting_manager:enabled", bool2);
        new k(1, "gads:nonagon:nativead:enabled", bool2);
        new o("gads:nonagon:nativead:app_name", "(?!)");
        O2 = new k(1, "gads:nonagon:banner:check_dp_size", bool2);
        P2 = new k(1, "gads:nonagon:rewarded:load_multiple_ads", bool2);
        new k(1, "gads:nonagon:return_last_error_code", bool);
        Q2 = new k(1, "gads:nonagon:return_no_fill_error_code", bool);
        R2 = l.a(1, "gads:nonagon:continue_on_no_fill", bool);
        l.a(1, "gads:nonagon:open_not_loaded_interstitial", bool2);
        S2 = l.a(1, "gads:nonagon:separate_timeout:enabled", bool2);
        U2 = l.a(1, "gads:nonagon:banner_recursive_renderer", bool);
        V2 = l.a(1, "gads:nonagon:app_stats_lock:enabled", bool);
        W2 = l.a(1, "gads:nonagon:app_stats_main_thread:enabled", bool);
        X2 = l.a(1, "gads:uri_query_to_map_bg_thread:enabled", bool);
        f16546a3 = l.a(1, "gads:nonagon:active_view_gmsg_background_thread:enabled", bool2);
        f16552b3 = l.a(1, "gads:active_view_gmsg_separate_pool:enabled", bool2);
        l.a(1, "gads:nonagon:service:enabled", bool2);
        f16558c3 = l.a(1, "gads:signals:ad_id_info:enabled", bool);
        f16564d3 = l.a(1, "gads:signals:app_index:enabled", bool);
        f16570e3 = l.a(1, "gads:signals:attestation_token:enabled", bool);
        f16576f3 = l.a(1, "gads:signals:cache:enabled", bool);
        l.a(1, "gads:signals:doritos:enabled", bool);
        f16582g3 = l.a(1, "gads:signals:doritos:v1:enabled", bool);
        l.a(1, "gads:signals:doritos:v2:immediate:enabled", bool);
        l.a(1, "gads:signals:network_prediction:enabled", bool);
        f16588h3 = l.a(1, "gads:signals:parental_control:enabled", bool);
        f16594i3 = l.a(1, "gads:signals:video_decoder:enabled", bool);
        f16600j3 = l.a(1, "gads:signals:app_version_name:enabled", bool);
        f16606k3 = l.a(1, "gads:signals:banner_hardware_acceleration:enabled", bool);
        f16612l3 = l.a(1, "gads:signals:native_hardware_acceleration:enabled", bool);
        l.a(1, "gads:attestation_token:enabled", bool);
        b<Boolean> bVar2 = z0.f17678a;
        f16648r3 = l.a(1, "gads:consent:shared_preference_reading:enabled", bool2);
        f16654s3 = l.a(1, "gads:consent:iab_consent_info:enabled", bool2);
        f16660t3 = l.a(1, "gads:fc_consent:shared_preference_reading:enabled", bool2);
        f16666u3 = l.c("gads:sp:json_string", str);
        f16672v3 = l.a(1, "gads:nativeads:image:sample:enabled", bool2);
        f16684x3 = l.a(1, "gads:nativeads:pub_image_scale_type:enabled", bool2);
        f16690y3 = l.a(1, "gads:offline_signaling:enabled", bool);
        A3 = l.a(1, "gads:nativeads:template_signal:enabled", bool2);
        B3 = l.a(1, "gads:nativeads:media_content_aspect_ratio:enabled", bool2);
        C3 = l.a(1, "gads:nativeads:media_content_metadata:enabled", bool2);
        D3 = l.a(1, "gads:precache_pool:verbose_logging", bool);
        W3 = l.a(1, "gads:memory_leak:b129558083", bool);
        X3 = l.a(1, "gads:unhandled_event_reporting:enabled", bool);
        Y3 = l.a(1, "gads:response_info:enabled", bool2);
        Z3 = l.a(1, "gads:csi:interstitial_failed_to_show:enabled", bool);
        f16547a4 = l.a(1, "gads:csi:mediation_failure:enabled", bool);
        f16559c4 = l.a(1, "gads:signal_collection_without_rendering:enabled", bool2);
        f16577f4 = l.a(2, "DISABLE_CRASH_REPORTING", bool);
        f16583g4 = l.a(1, "gads:paid_event_listener:enabled", bool);
        f16589h4 = l.a(1, "gads:interscroller_ad:enabled", bool2);
        f16595i4 = l.a(1, "gads:interscroller_ad:refresh:enabled", bool);
        f16601j4 = l.a(1, "gads:is_in_scroll_view_new_api:enabled", bool2);
        f16607k4 = l.a(1, "gads:policy_validator_for_all_pubs:enabled", bool);
        f16613l4 = l.c("gad:publisher_testing:policy_validator:enabled_list", str);
        f16625n4 = l.a(2, "NATIVE_AD_DEBUGGER_ENABLED", bool2);
        f16643q4 = l.a(1, "gads:use_wide_viewport:enabled", bool);
        f16649r4 = l.a(1, "gads:load_with_overview_mode:enabled", bool);
        f16655s4 = l.a(1, "gads:wire_banner_listener_after_request:enabled", bool);
        f16661t4 = l.a(1, "gads:wire_app_open_listener_after_request:enabled", bool);
        f16667u4 = l.a(1, "gads:wire_interstitial_listener_after_request:enabled", bool);
        f16679w4 = l.a(1, "gads:can_open_app_and_open_app_action:enabled", bool);
        f16685x4 = l.a(1, "gads:open_gmsg:set_uri_data_and_type:enabled", bool);
        f16697z4 = l.a(1, "gads:forward_bow_error_string:enabled", bool);
        A4 = l.a(1, "gads:continue_on_process_response:enabled", bool);
        B4 = l.a(1, "gads:mediation_status_reporting:enabled", bool2);
        E4 = l.a(1, "gads:offline_ads_notification:enabled", bool2);
        F4 = l.a(1, "gads:handle_click_recorded_event:enabled", bool);
        G4 = l.a(1, "gads:default_network_type_fine_to_unknown:enabled", bool2);
        H4 = l.a(1, "gads:new_remote_logging_utils:enabled", bool);
        I4 = l.a(1, "gads:remote_logging:enabled", bool);
    }

    public static void a(Context context) {
        y.b(new v(context, 0));
    }

    public static List<String> b() {
        return ti0.f16763j.f16767d.a();
    }

    public static List<String> c() {
        r rVar = ti0.f16763j.f16767d;
        List<String> a10 = rVar.a();
        for (l<String> a11 : rVar.f16219c) {
            String str = (String) ti0.f16763j.f16769f.a(a11);
            if (!TextUtils.isEmpty(str)) {
                ((ArrayList) a10).add(str);
            }
        }
        ArrayList arrayList = new ArrayList();
        uk.b(arrayList, d1.f14201a);
        ((ArrayList) a10).addAll(arrayList);
        return a10;
    }
}
