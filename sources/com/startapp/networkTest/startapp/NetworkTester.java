package com.startapp.networkTest.startapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import com.startapp.a3;
import com.startapp.a5;
import com.startapp.d2;
import com.startapp.g9;
import com.startapp.networkTest.results.ConnectivityTestResult;
import com.startapp.networkTest.results.LatencyResult;
import com.startapp.networkTest.startapp.CoverageMapperManager;
import com.startapp.r5;
import com.startapp.w7;
import com.startapp.x2;

/* compiled from: Sta */
public final class NetworkTester {
    private static final String CTLT_CHECK_INTERVAL_KEY = "StartappCtLtCheckIntervalKey";
    private static final String CTLT_GUARD_DIFF_KEY = "StartappGuardDiffKey";
    private static final String CTLT_PREV_TIME_CHECK_KEY = "StartappCtLtPrevTimeCheckKey";
    public static final String LOG_TAG = "NetworkTester";
    private static final String P3WRAPPER_PREFS = "StartappP3WrapperPrefs";
    @SuppressLint({"StaticFieldLeak"})
    public static NetworkTester sInstance;
    public Thread mActiveThread;
    public ConnectivityTestListener mConnectivityTestListener;
    private Context mContext;
    public CoverageMapperManager mCoverageMapper;
    public a3 mForegroundTestManager;

    /* compiled from: Sta */
    public static final class Config {
        public String CONNECTIVITY_TEST_CDNCONFIG_URL = "https://d2to8y50b3n6dq.cloudfront.net/truststores/[PROJECTID]/cdnconfig.zip";
        public boolean CONNECTIVITY_TEST_ENABLED = true;
        public String CONNECTIVITY_TEST_FILENAME = "/favicon.ico";
        public String CONNECTIVITY_TEST_HOSTNAME = "d2to8y50b3n6dq.cloudfront.net";
        public boolean CT_COLLECT_CELLINFO = true;
        public boolean FOREGROUND_TEST_CT_ENABLED = true;
        public long FOREGROUND_TEST_CT_MIN_INTERVAL = 180000;
        public long FOREGROUND_TEST_CT_SCHEDULE_INTERVAL = 300000;
        public boolean FOREGROUND_TEST_NIR_ENABLED = true;
        public String GEOIP_URL = "https://geoip.api.c0nnectthed0ts.com/geoip/";
        public boolean NIR_COLLECT_CELLINFO = true;
        public int NIR_COLLECT_CELLINFO_THRESHOLD = 2;
        public String PROJECT_ID = "20050";
    }

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f11460a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b f11461b;

        /* renamed from: com.startapp.networkTest.startapp.NetworkTester$a$a  reason: collision with other inner class name */
        /* compiled from: Sta */
        public class C0118a implements w7 {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ boolean[] f11462a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Looper f11463b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ d2 f11464c;

            /* renamed from: com.startapp.networkTest.startapp.NetworkTester$a$a$a  reason: collision with other inner class name */
            /* compiled from: Sta */
            public class C0119a implements Runnable {
                public C0119a() {
                }

                public void run() {
                    a.this.f11461b.a(false);
                }
            }

            public C0118a(boolean[] zArr, Looper looper, d2 d2Var) {
                this.f11462a = zArr;
                this.f11463b = looper;
                this.f11464c = d2Var;
            }

            public void a() {
                this.f11464c.b();
                Looper looper = this.f11463b;
                if (looper != null) {
                    NetworkTester.sInstance.mActiveThread = null;
                    looper.quit();
                }
                ConnectivityTestListener connectivityTestListener = NetworkTester.sInstance.mConnectivityTestListener;
                if (connectivityTestListener != null) {
                    connectivityTestListener.onConnectivityTestFinished(new g9(new C0119a()));
                } else {
                    a.this.f11461b.a(false);
                }
            }

            public void onConnectivityTestResult(ConnectivityTestResult connectivityTestResult) {
                boolean[] zArr = this.f11462a;
                if (zArr[0]) {
                    Looper looper = this.f11463b;
                    if (looper != null) {
                        NetworkTester.sInstance.mActiveThread = null;
                        looper.quit();
                        a.this.f11461b.a(false);
                        return;
                    }
                    return;
                }
                zArr[0] = true;
                ConnectivityTestListener connectivityTestListener = NetworkTester.sInstance.mConnectivityTestListener;
                if (connectivityTestListener != null) {
                    connectivityTestListener.onConnectivityTestResult(connectivityTestResult);
                }
            }

            public void onLatencyTestResult(LatencyResult latencyResult) {
                boolean[] zArr = this.f11462a;
                if (zArr[1]) {
                    Looper looper = this.f11463b;
                    if (looper != null) {
                        NetworkTester.sInstance.mActiveThread = null;
                        looper.quit();
                        a.this.f11461b.a(false);
                        return;
                    }
                    return;
                }
                zArr[1] = true;
                ConnectivityTestListener connectivityTestListener = NetworkTester.sInstance.mConnectivityTestListener;
                if (connectivityTestListener != null) {
                    connectivityTestListener.onLatencyTestResult(latencyResult);
                }
            }
        }

        public a(Context context, b bVar) {
            this.f11460a = context;
            this.f11461b = bVar;
        }

        public void run() {
            Looper.prepare();
            Looper myLooper = Looper.myLooper();
            d2 d2Var = new d2(this.f11460a.getApplicationContext());
            d2Var.a();
            d2Var.a((w7) new C0118a(new boolean[2], myLooper, d2Var));
            Looper.loop();
        }
    }

    /* compiled from: Sta */
    public interface b {
        void a(boolean z10);
    }

    private NetworkTester() {
    }

    public static void init(Context context, Config config) {
        if (context == null) {
            throw new IllegalArgumentException("context is null");
        } else if (config != null) {
            String a10 = r5.a(config);
            if (a10 == null) {
                throw new IllegalArgumentException("Wrong format of config");
            } else if (sInstance == null) {
                NetworkTester networkTester = new NetworkTester();
                sInstance = networkTester;
                networkTester.mContext = context;
                a5.a(context, a10.getBytes());
                sInstance.mCoverageMapper = new CoverageMapperManager(context);
                sInstance.mForegroundTestManager = new a3(context, sInstance.mCoverageMapper);
            }
        } else {
            throw new IllegalArgumentException("config is null");
        }
    }

    public static int isAppInForeground() {
        a3 a3Var;
        NetworkTester networkTester = sInstance;
        if (networkTester == null || (a3Var = networkTester.mForegroundTestManager) == null) {
            return -1;
        }
        return a3Var.d();
    }

    public static boolean isPermissionGranted(Context context, String str) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                if (context.checkSelfPermission(str) == 0) {
                    return true;
                }
                return false;
            } else if (context.checkCallingOrSelfPermission(str) == 0) {
                return true;
            } else {
                return false;
            }
        } catch (Throwable th) {
            x2.a(th);
            return false;
        }
    }

    public static void runTests(Context context, b bVar) {
        CoverageMapperManager coverageMapperManager;
        CoverageMapperManager coverageMapperManager2;
        if (sInstance == null) {
            bVar.a(false);
        } else if (isPermissionGranted(context, "android.permission.ACCESS_FINE_LOCATION") || isPermissionGranted(context, "android.permission.ACCESS_COARSE_LOCATION")) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(P3WRAPPER_PREFS, 0);
            long j10 = sharedPreferences.getLong(CTLT_GUARD_DIFF_KEY, 120000);
            if (System.currentTimeMillis() - sharedPreferences.getLong(CTLT_PREV_TIME_CHECK_KEY, 0) < sharedPreferences.getLong(CTLT_CHECK_INTERVAL_KEY, j10) - j10) {
                bVar.a(false);
            } else if (!a5.h()) {
                bVar.a(false);
            } else if (sInstance.mActiveThread != null) {
                bVar.a(false);
            } else {
                sharedPreferences.edit().putLong(CTLT_PREV_TIME_CHECK_KEY, System.currentTimeMillis()).commit();
                NetworkTester networkTester = sInstance;
                if (!(networkTester == null || (coverageMapperManager = networkTester.mCoverageMapper) == null)) {
                    coverageMapperManager.b();
                }
                if (networkTester != null) {
                    networkTester.mActiveThread = new Thread(new g9(new a(context, bVar)));
                }
                sInstance.mActiveThread.start();
            }
        } else {
            NetworkTester networkTester2 = sInstance;
            if (!(networkTester2 == null || (coverageMapperManager2 = networkTester2.mCoverageMapper) == null)) {
                coverageMapperManager2.e();
            }
            bVar.a(false);
        }
    }

    public static void setOnConnectivityLatencyListener(ConnectivityTestListener connectivityTestListener) {
        NetworkTester networkTester = sInstance;
        if (networkTester != null) {
            networkTester.mConnectivityTestListener = connectivityTestListener;
        }
    }

    public static void setOnNetworkInfoListener(CoverageMapperManager.OnNetworkInfoResultListener onNetworkInfoResultListener) {
        CoverageMapperManager coverageMapperManager;
        NetworkTester networkTester = sInstance;
        if (networkTester != null && (coverageMapperManager = networkTester.mCoverageMapper) != null) {
            coverageMapperManager.a(onNetworkInfoResultListener);
        }
    }

    public static void startListening(long j10, long j11) {
        NetworkTester networkTester = sInstance;
        if (networkTester != null) {
            SharedPreferences sharedPreferences = networkTester.mContext.getSharedPreferences(P3WRAPPER_PREFS, 0);
            sharedPreferences.edit().putLong(CTLT_CHECK_INTERVAL_KEY, j10).commit();
            sharedPreferences.edit().putLong(CTLT_GUARD_DIFF_KEY, j11).commit();
            CoverageMapperManager coverageMapperManager = networkTester.mCoverageMapper;
            if (coverageMapperManager != null) {
                coverageMapperManager.b();
            }
            a3 a3Var = networkTester.mForegroundTestManager;
            if (a3Var != null) {
                a3Var.e();
            }
        }
    }

    public static void stopListening() {
        a3 a3Var;
        CoverageMapperManager coverageMapperManager;
        NetworkTester networkTester = sInstance;
        if (!(networkTester == null || (coverageMapperManager = networkTester.mCoverageMapper) == null)) {
            coverageMapperManager.e();
        }
        if (networkTester != null && (a3Var = networkTester.mForegroundTestManager) != null) {
            a3Var.h();
        }
    }
}
