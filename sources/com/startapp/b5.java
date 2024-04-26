package com.startapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.startapp.a5;
import com.startapp.networkTest.controller.LocationController;
import com.startapp.networkTest.enums.AnonymizationLevel;
import java.util.Set;
import java.util.UUID;

/* compiled from: Sta */
public class b5 {
    private static final String A = "P3INS_PFK_LAST_EXPORT_TIME";
    private static final String B = "P3INS_PFK_QOE_MANAGER_ENABLED";
    private static final String C = "P3INS_PFK_REGISTRATION_TIMESTAMP";
    private static final String D = "P3INS_PFK_IS_ALREADY_REGISTERED";
    private static final String E = "P3INS_PFK_SEND_REGISTRATION_TIMESTAMP_ENABLED";
    private static final String F = "P3INS_PFK_UPLOAD_EXTRA";
    private static final String G = "P3INS_PFK_VOWIFI_TEST_MANAGER_ENABLED";
    private static final String H = "P3INS_PFK_CT_CRITERIA_SERVER_LIST";
    private static final String I = "P3INS_PFK_LTR_CRITERIA_SERVER_LIST";
    private static final String J = "P3INS_PFK_CDN_CT_SERVER_LIST";
    private static final String K = "P3INS_PFK_CDN_CT_CRITERIA";
    private static final String L = "P3INS_PFK_CDN_LTR_SERVER_LIST";
    private static final String M = "P3INS_PFK_CDN_LTR_CRITERIA";
    private static final String N = "P3INS_PFK_CONNECTIVITY_TEST_CDNCONFIG_LAST_MODIFIED";
    private static final String O = "P3INS_PFK_CONNECTIVITY_TEST_CDNCONFIG_LAST_CHECK";
    private static final String P = "P3INS_PFK_WIFI_SCAN_TIMESTAMP";
    private static final String Q = "P3INS_PFK_WIFI_SCAN_ENABLED";
    private static final String R = "p3inspreferences";

    /* renamed from: b  reason: collision with root package name */
    private static final String f10108b = "p3ins_pfk_ul_params";

    /* renamed from: c  reason: collision with root package name */
    private static final String f10109c = "p3ins_pfk_ul_paramsetid";

    /* renamed from: d  reason: collision with root package name */
    private static final String f10110d = "p3ins_pfk_ul_allowed";

    /* renamed from: e  reason: collision with root package name */
    private static final String f10111e = "p3ins_pfk_db_retry";

    /* renamed from: f  reason: collision with root package name */
    private static final String f10112f = "p3ins_pfk_last_upload_time";

    /* renamed from: g  reason: collision with root package name */
    private static final String f10113g = "p3ins_pfk_guid";

    /* renamed from: h  reason: collision with root package name */
    private static final String f10114h = "P3INS_PFK_GUID_TIMESTAMP";

    /* renamed from: i  reason: collision with root package name */
    private static final String f10115i = "P3INS_PFK_CONNECTIVITY_TEST_ENABLED";

    /* renamed from: j  reason: collision with root package name */
    private static final String f10116j = "P3INS_PFK_CONNECTIVITY_KEEPALIVE_ENABLED";

    /* renamed from: k  reason: collision with root package name */
    private static final String f10117k = "P3INS_PFK_CONNECTIVITY_TEST_TRUSTSTORE_LAST_CHECK";

    /* renamed from: l  reason: collision with root package name */
    private static final String f10118l = "P3INS_PFK_CONNECTIVITY_TEST_TRUSTSTORE_LAST_MODIFIED";

    /* renamed from: m  reason: collision with root package name */
    private static final String f10119m = "P3INS_PFK_CONNECTIVITY_TEST_TIMESTAMP";

    /* renamed from: n  reason: collision with root package name */
    private static final String f10120n = "P3INS_PFK_APPUSAGE_SERVICE_ENABLED";

    /* renamed from: o  reason: collision with root package name */
    private static final String f10121o = "P3INS_PFK_APPUSAGE_LAST_SCREEN_SESSION_COUNTER";

    /* renamed from: p  reason: collision with root package name */
    private static final String f10122p = "P3INS_PFK_APPUSAGE_INSTALLED_APP_SNAPSHOT_ENABLED";

    /* renamed from: q  reason: collision with root package name */
    private static final String f10123q = "P3INS_PFK_APPUSAGE_INSTALLED_APP_SNAPSHOT_INTERVAL";

    /* renamed from: r  reason: collision with root package name */
    private static final String f10124r = "P3INS_PFK_APPUSAGE_INSTALLED_APP_SNAPSHOT_LAST_TIMESTAMP";

    /* renamed from: s  reason: collision with root package name */
    private static final String f10125s = "P3INS_PFK_APPUSAGE_BROWSER_SESSION_TRACKING_ENABLED";

    /* renamed from: t  reason: collision with root package name */
    private static final String f10126t = "P3INS_PFK_VOICEMANAGER_PHONENUMBER_RECORD_TYPE";

    /* renamed from: u  reason: collision with root package name */
    private static final String f10127u = "P3INS_PFK_VOICE_SERVICE_ENABLED";

    /* renamed from: v  reason: collision with root package name */
    private static final String f10128v = "P3INS_PFK_MESSAGING_SERVICE_ENABLED";

    /* renamed from: w  reason: collision with root package name */
    private static final String f10129w = "P3INS_PFK_MESSAGINGMANAGER_PHONENUMBER_RECORD_TYPE";

    /* renamed from: x  reason: collision with root package name */
    private static final String f10130x = "P3INS_PFK_COVERAGE_SERVICE_ENABLED";

    /* renamed from: y  reason: collision with root package name */
    private static final String f10131y = "P3INS_PFK_COVERAGE_SERVICE_TRIGGER_PROVIDER_MODE";

    /* renamed from: z  reason: collision with root package name */
    private static final String f10132z = "P3INS_PFK_TRAFFIC_ANALYZER_ENABLED";

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f10133a;

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10134a;

        public a(String str) {
            this.f10134a = str;
        }

        public void run() {
            a5.a d10 = a5.d();
            if (d10 != null) {
                d10.a(this.f10134a);
            }
        }
    }

    public b5(Context context) {
        this.f10133a = context.getSharedPreferences(R, 0);
    }

    private boolean O() {
        return this.f10133a.getBoolean(D, false);
    }

    public boolean A() {
        return this.f10133a.getBoolean(f10128v, a5.b().MESSAGING_SERVICE_ENABLED());
    }

    public boolean B() {
        return this.f10133a.getBoolean(B, a5.b().QOE_MANAGER_ENABLED());
    }

    public long C() {
        return this.f10133a.getLong(C, 0);
    }

    public boolean D() {
        return this.f10133a.getBoolean(E, a5.b().SEND_REGISTRATION_TIMESTAMP_ENABLED());
    }

    public boolean E() {
        return this.f10133a.getBoolean(f10132z, a5.b().TRAFFIC_ANALYZER_ENABLED());
    }

    public long F() {
        return this.f10133a.getLong(f10118l, 0);
    }

    public String G() {
        return this.f10133a.getString(F, "");
    }

    public String H() {
        return this.f10133a.getString(f10109c, "");
    }

    public String I() {
        return this.f10133a.getString(f10108b, "");
    }

    public long J() {
        return this.f10133a.getLong(f10111e, 0);
    }

    public boolean K() {
        return this.f10133a.getBoolean(G, a5.b().VOWIFI_TEST_MANAGER_ENABLED());
    }

    public AnonymizationLevel L() {
        return a(this.f10133a.getString(f10126t, a5.b().VOICEMANAGER_PHONENUMBER_RECORD_TYPE().toString()));
    }

    public boolean M() {
        return this.f10133a.getBoolean(f10127u, a5.b().VOICE_SERVICE_ENABLED());
    }

    public boolean N() {
        return this.f10133a.getBoolean(Q, a5.b().WIFI_SCAN_ENABLED());
    }

    public boolean P() {
        return this.f10133a.getBoolean(f10110d, true);
    }

    @SuppressLint({"ApplySharedPref"})
    public void a(long j10) {
        this.f10133a.edit().putLong(f10123q, j10).commit();
    }

    public boolean b() {
        return this.f10133a.getBoolean(f10125s, a5.b().APPUSAGE_BROWSER_SESSION_TRACKING_ENABLED());
    }

    public boolean c() {
        return this.f10133a.getBoolean(f10122p, a5.b().APPUSAGE_MANAGER_INSTALLED_APP_SNAPSHOT_ENABLED());
    }

    @SuppressLint({"ApplySharedPref"})
    public void d(boolean z10) {
        this.f10133a.edit().putBoolean(f10122p, z10).commit();
    }

    public boolean e() {
        return this.f10133a.getBoolean(f10120n, a5.b().APPUSAGE_SERVICE_ENABLED());
    }

    @SuppressLint({"ApplySharedPref"})
    public void f(boolean z10) {
        this.f10133a.edit().putBoolean(f10116j, z10).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    public void g(long j10) {
        this.f10133a.edit().putLong(A, j10).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    public void h(boolean z10) {
        this.f10133a.edit().putBoolean(f10130x, z10).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    public void i(long j10) {
        this.f10133a.edit().putLong(f10112f, j10).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    public void j(boolean z10) {
        this.f10133a.edit().putBoolean(B, z10).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    public void k(long j10) {
        this.f10133a.edit().putLong(C, j10).commit();
    }

    public boolean l() {
        return this.f10133a.getBoolean(f10116j, a5.b().CONNECTIVITY_KEEPALIVE_ENABLED());
    }

    public boolean m() {
        return this.f10133a.getBoolean(f10115i, a5.b().CONNECTIVITY_TEST_ENABLED());
    }

    public boolean n() {
        return this.f10133a.getBoolean(f10130x, a5.b().COVERAGE_MAPPER_SERVICE_ENABLED());
    }

    @SuppressLint({"ApplySharedPref"})
    public void o(boolean z10) {
        this.f10133a.edit().putBoolean(f10127u, z10).commit();
    }

    public String p() {
        return a(false);
    }

    public Set<String> q() {
        return this.f10133a.getStringSet(I, (Set) null);
    }

    public long r() {
        return this.f10133a.getLong(f10124r, 0);
    }

    public long s() {
        return this.f10133a.getLong(f10121o, 1);
    }

    public long t() {
        return this.f10133a.getLong(O, 0);
    }

    public long u() {
        return this.f10133a.getLong(f10119m, 2147483647L);
    }

    public long v() {
        return this.f10133a.getLong(A, 0);
    }

    public long w() {
        return this.f10133a.getLong(f10117k, 0);
    }

    public long x() {
        return this.f10133a.getLong(f10112f, 0);
    }

    public long y() {
        return this.f10133a.getLong(P, 2147483647L);
    }

    public AnonymizationLevel z() {
        return a(this.f10133a.getString(f10129w, a5.b().MESSAGINGMANAGER_PHONENUMBER_RECORD_TYPE().toString()));
    }

    public String a(boolean z10) {
        String string = this.f10133a.getString(f10113g, "");
        boolean z11 = true;
        if (string == null || string.length() == 0) {
            string = a();
        } else {
            long d10 = ua.d();
            long j10 = this.f10133a.getLong(f10114h, 0);
            long GUID_MAX_AGE = a5.b().GUID_MAX_AGE();
            if ((GUID_MAX_AGE != -1 || z10) && (d10 - j10 > GUID_MAX_AGE || z10)) {
                string = a();
            } else {
                z11 = false;
            }
        }
        if (z11) {
            new Handler(Looper.getMainLooper()).post(new g9(new a(string)));
            if (D()) {
                O();
            }
        }
        return string;
    }

    @SuppressLint({"ApplySharedPref"})
    public void b(AnonymizationLevel anonymizationLevel) {
        this.f10133a.edit().putString(f10126t, anonymizationLevel.toString()).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    public void c(long j10) {
        this.f10133a.edit().putLong(f10124r, j10).commit();
    }

    public long d() {
        return this.f10133a.getLong(f10123q, 86400000);
    }

    @SuppressLint({"ApplySharedPref"})
    public void e(boolean z10) {
        this.f10133a.edit().putBoolean(f10120n, z10).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    public void f(long j10) {
        this.f10133a.edit().putLong(f10119m, j10).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    public void g(boolean z10) {
        this.f10133a.edit().putBoolean(f10115i, z10).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    public void h(long j10) {
        this.f10133a.edit().putLong(f10117k, j10).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    public void i(boolean z10) {
        this.f10133a.edit().putBoolean(f10128v, z10).commit();
    }

    public String j() {
        return this.f10133a.getString(M, a5.b().LATENCY_TEST_CRITERIA().name());
    }

    @SuppressLint({"ApplySharedPref"})
    public void k(boolean z10) {
        this.f10133a.edit().putBoolean(E, z10).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    public void l(boolean z10) {
        this.f10133a.edit().putBoolean(f10132z, z10).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    public void m(boolean z10) {
        this.f10133a.edit().putBoolean(f10110d, z10).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    public void n(boolean z10) {
        this.f10133a.edit().putBoolean(G, z10).commit();
    }

    public LocationController.ProviderMode o() {
        return b(this.f10133a.getString(f10131y, a5.b().COVERAGE_MAPPER_SERVICE_TRIGGER_PROVIDER_MODE().toString()));
    }

    @SuppressLint({"ApplySharedPref"})
    public void p(boolean z10) {
        this.f10133a.edit().putBoolean(Q, z10).commit();
    }

    private LocationController.ProviderMode b(String str) {
        LocationController.ProviderMode providerMode = LocationController.ProviderMode.Gps;
        if (str.equals(providerMode.toString())) {
            return providerMode;
        }
        LocationController.ProviderMode providerMode2 = LocationController.ProviderMode.GpsAndNetwork;
        if (str.equals(providerMode2.toString())) {
            return providerMode2;
        }
        LocationController.ProviderMode providerMode3 = LocationController.ProviderMode.Network;
        if (str.equals(providerMode3.toString())) {
            return providerMode3;
        }
        LocationController.ProviderMode providerMode4 = LocationController.ProviderMode.Passive;
        if (str.equals(providerMode4.toString())) {
            return providerMode4;
        }
        LocationController.ProviderMode providerMode5 = LocationController.ProviderMode.RailNet;
        if (str.equals(providerMode5.toString())) {
            return providerMode5;
        }
        return null;
    }

    @SuppressLint({"ApplySharedPref"})
    public void c(boolean z10) {
        this.f10133a.edit().putBoolean(f10125s, z10).commit();
    }

    public void d(long j10) {
        this.f10133a.edit().putLong(f10121o, j10).apply();
    }

    @SuppressLint({"CommitPrefEdits", "ApplySharedPref"})
    public void e(String str) {
        this.f10133a.edit().putString(F, str).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    public void f(String str) {
        this.f10133a.edit().putString(f10109c, str).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    public void g(String str) {
        this.f10133a.edit().putString(f10108b, str).commit();
    }

    public String h() {
        return this.f10133a.getString(K, a5.b().CONNECTIVITY_TEST_CRITERIA().name());
    }

    public String[] i() {
        Set<String> stringSet = this.f10133a.getStringSet(J, (Set) null);
        if (stringSet == null || stringSet.isEmpty()) {
            return a5.b().CONNECTIVITY_TEST_HOSTNAME_ARRAY();
        }
        return (String[]) stringSet.toArray(new String[stringSet.size()]);
    }

    @SuppressLint({"ApplySharedPref"})
    public void j(long j10) {
        this.f10133a.edit().putLong(P, j10).commit();
    }

    public String[] k() {
        Set<String> stringSet = this.f10133a.getStringSet(L, (Set) null);
        if (stringSet == null || stringSet.isEmpty()) {
            return a5.b().LATENCY_TEST_HOSTNAME_ARRAY();
        }
        return (String[]) stringSet.toArray(new String[stringSet.size()]);
    }

    @SuppressLint({"ApplySharedPref"})
    public void l(long j10) {
        this.f10133a.edit().putLong(f10118l, j10).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    public void m(long j10) {
        this.f10133a.edit().putLong(f10111e, j10).commit();
    }

    public void c(String str) {
        this.f10133a.edit().putString(K, str).commit();
    }

    public void d(Set<String> set) {
        this.f10133a.edit().putStringSet(I, set).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    public void e(long j10) {
        this.f10133a.edit().putLong(O, j10).commit();
    }

    public Set<String> f() {
        return this.f10133a.getStringSet(H, (Set) null);
    }

    public long g() {
        return this.f10133a.getLong(N, 0);
    }

    public void c(Set<String> set) {
        this.f10133a.edit().putStringSet(L, set).commit();
    }

    public void d(String str) {
        this.f10133a.edit().putString(M, str).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    private void b(boolean z10) {
        this.f10133a.edit().putBoolean(D, z10).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    public void b(long j10) {
        this.f10133a.edit().putLong(N, j10).commit();
    }

    public void b(Set<String> set) {
        this.f10133a.edit().putStringSet(J, set).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    private String a() {
        String replace = UUID.randomUUID().toString().replace("-", "");
        SharedPreferences.Editor edit = this.f10133a.edit();
        edit.putString(f10113g, replace);
        edit.putLong(f10114h, ua.d());
        edit.commit();
        return replace;
    }

    @SuppressLint({"ApplySharedPref"})
    public void a(AnonymizationLevel anonymizationLevel) {
        this.f10133a.edit().putString(f10129w, anonymizationLevel.toString()).commit();
    }

    private AnonymizationLevel a(String str) {
        AnonymizationLevel anonymizationLevel = AnonymizationLevel.Anonymized;
        if (str.equals(anonymizationLevel.toString())) {
            return anonymizationLevel;
        }
        AnonymizationLevel anonymizationLevel2 = AnonymizationLevel.Full;
        if (str.equals(anonymizationLevel2.toString())) {
            return anonymizationLevel2;
        }
        AnonymizationLevel anonymizationLevel3 = AnonymizationLevel.None;
        str.equals(anonymizationLevel3.toString());
        return anonymizationLevel3;
    }

    public void a(Set<String> set) {
        this.f10133a.edit().putStringSet(H, set).commit();
    }
}
