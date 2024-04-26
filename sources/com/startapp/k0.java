package com.startapp;

import android.content.Context;
import android.os.AsyncTask;
import android.telephony.TelephonyManager;
import com.startapp.networkTest.controller.LocationController;
import com.startapp.networkTest.data.RadioInfo;
import com.startapp.networkTest.enums.LtrCriteriaTypes;
import com.startapp.networkTest.results.LatencyResult;
import com.startapp.networkTest.results.P3TestResult;
import com.startapp.networkTest.results.speedtest.MeasurementPointLatency;
import com.startapp.networkTest.speedtest.SpeedtestEngineError;
import com.startapp.networkTest.speedtest.SpeedtestEngineStatus;
import com.startapp.networkTest.threads.ThreadManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

/* compiled from: Sta */
public class k0 {

    /* renamed from: s  reason: collision with root package name */
    public static final String f10740s = "k0";

    /* renamed from: t  reason: collision with root package name */
    private static final boolean f10741t = false;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public e4 f10742a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Context f10743b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public j8 f10744c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public nd f10745d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public LocationController f10746e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public a1 f10747f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public P3TestResult f10748g;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<i8> f10749h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public String f10750i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public b5 f10751j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public String f10752k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public String f10753l = "";

    /* renamed from: m  reason: collision with root package name */
    private String f10754m = "";

    /* renamed from: n  reason: collision with root package name */
    private String f10755n = "";

    /* renamed from: o  reason: collision with root package name */
    private String f10756o = "";

    /* renamed from: p  reason: collision with root package name */
    private String f10757p = "";

    /* renamed from: q  reason: collision with root package name */
    private String f10758q = "";
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public String f10759r = "";

    /* compiled from: Sta */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10760a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.startapp.networkTest.enums.LtrCriteriaTypes[] r0 = com.startapp.networkTest.enums.LtrCriteriaTypes.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10760a = r0
                com.startapp.networkTest.enums.LtrCriteriaTypes r1 = com.startapp.networkTest.enums.LtrCriteriaTypes.CTItem     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10760a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.networkTest.enums.LtrCriteriaTypes r1 = com.startapp.networkTest.enums.LtrCriteriaTypes.NoChange     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10760a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.startapp.networkTest.enums.LtrCriteriaTypes r1 = com.startapp.networkTest.enums.LtrCriteriaTypes.Random     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10760a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.startapp.networkTest.enums.LtrCriteriaTypes r1 = com.startapp.networkTest.enums.LtrCriteriaTypes.FullSuccessful     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f10760a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.startapp.networkTest.enums.LtrCriteriaTypes r1 = com.startapp.networkTest.enums.LtrCriteriaTypes.TotalTests     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.k0.a.<clinit>():void");
        }
    }

    public k0(e4 e4Var, Context context) {
        if (e4Var != null) {
            this.f10742a = e4Var;
            this.f10743b = context;
            y4 b10 = a5.b();
            this.f10750i = b10.PROJECT_ID();
            this.f10751j = new b5(this.f10743b);
            a(context, b10);
            return;
        }
        throw new IllegalArgumentException("ISpeedtestListener is NULL");
    }

    /* compiled from: Sta */
    public class b extends AsyncTask<Void, Void, LatencyResult> {

        /* renamed from: a  reason: collision with root package name */
        private String f10761a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f10762b;

        /* renamed from: c  reason: collision with root package name */
        private int f10763c;

        /* renamed from: d  reason: collision with root package name */
        private int f10764d;

        /* renamed from: e  reason: collision with root package name */
        private int f10765e;

        /* renamed from: f  reason: collision with root package name */
        private String[] f10766f;

        /* renamed from: g  reason: collision with root package name */
        private LtrCriteriaTypes f10767g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f10768h;

        /* compiled from: Sta */
        public class a implements e8 {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ boolean[] f10770a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ int[] f10771b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ ArrayList f10772c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ y f10773d;

            public a(boolean[] zArr, int[] iArr, ArrayList arrayList, y yVar) {
                this.f10770a = zArr;
                this.f10771b = iArr;
                this.f10772c = arrayList;
                this.f10773d = yVar;
            }

            public void a(int i10, long j10, long j11) {
                int i11 = 0;
                int i12 = (j11 > 0 ? 1 : (j11 == 0 ? 0 : -1));
                if (i12 >= 0) {
                    this.f10770a[0] = true;
                    int[] iArr = this.f10771b;
                    iArr[0] = iArr[0] + 1;
                }
                int i13 = (int) j11;
                this.f10772c.add(b.this.a(j10, i13));
                if (k0.this.f10742a != null) {
                    e4 a10 = k0.this.f10742a;
                    float a11 = ((float) i10) / ((float) b.this.f10762b);
                    if (i12 >= 0) {
                        i11 = i13;
                    }
                    a10.b(a11, i11);
                }
                if (b.this.isCancelled()) {
                    this.f10773d.b();
                }
            }
        }

        /* renamed from: com.startapp.k0$b$b  reason: collision with other inner class name */
        /* compiled from: Sta */
        public class C0116b implements Comparator<e6> {
            public C0116b() {
            }

            /* renamed from: a */
            public int compare(e6 e6Var, e6 e6Var2) {
                return e6Var.successfulTests - e6Var2.successfulTests;
            }
        }

        /* compiled from: Sta */
        public class c implements Comparator<e6> {
            public c() {
            }

            /* renamed from: a */
            public int compare(e6 e6Var, e6 e6Var2) {
                return e6Var.totalTests - e6Var2.totalTests;
            }
        }

        public b(String str, int i10, int i11, int i12, int i13, boolean z10) {
            this.f10761a = str;
            this.f10762b = i10;
            this.f10763c = i11;
            this.f10764d = i12;
            this.f10765e = i13;
            this.f10768h = z10;
            if (i11 < 200) {
                this.f10763c = 200;
            }
            if (k0.this.f10742a != null) {
                k0.this.f10742a.a(SpeedtestEngineStatus.CONNECT, SpeedtestEngineError.OK, (long) (this.f10762b * this.f10764d));
            }
            b5 c10 = a5.c();
            this.f10766f = c10.k();
            this.f10767g = LtrCriteriaTypes.valueOf(c10.j());
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.util.List<com.startapp.e6>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v18, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v20, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v21, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v20, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v22, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v21, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v23, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v22, resolved type: android.net.NetworkInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v23, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v25, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v30, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v26, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v27, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v28, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v32, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v33, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v34, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v29, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v30, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v31, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v32, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v33, resolved type: boolean} */
        /* JADX WARNING: type inference failed for: r9v1, types: [java.util.List] */
        /* JADX WARNING: type inference failed for: r2v1, types: [java.util.List] */
        /* JADX WARNING: type inference failed for: r18v1 */
        /* JADX WARNING: type inference failed for: r9v3 */
        /* JADX WARNING: Code restructure failed: missing block: B:195:0x0371, code lost:
            if (r1 == null) goto L_0x0376;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:236:0x01b1, code lost:
            r19 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:237:0x01b1, code lost:
            r19 = r19;
         */
        /* JADX WARNING: Failed to insert additional move for type inference */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x025d A[Catch:{ all -> 0x0248, all -> 0x0315 }] */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x0265 A[Catch:{ all -> 0x0248, all -> 0x0315 }] */
        /* JADX WARNING: Removed duplicated region for block: B:142:0x02b1 A[Catch:{ all -> 0x02f4, all -> 0x0313 }] */
        /* JADX WARNING: Removed duplicated region for block: B:148:0x02db A[Catch:{ all -> 0x02f4, all -> 0x0313 }] */
        /* JADX WARNING: Removed duplicated region for block: B:156:0x02f1 A[Catch:{ all -> 0x02f4, all -> 0x0313 }] */
        /* JADX WARNING: Removed duplicated region for block: B:191:0x0368 A[SYNTHETIC, Splitter:B:191:0x0368] */
        /* JADX WARNING: Removed duplicated region for block: B:198:0x0378  */
        /* JADX WARNING: Removed duplicated region for block: B:199:0x03a9  */
        /* JADX WARNING: Removed duplicated region for block: B:202:0x03c3  */
        /* JADX WARNING: Removed duplicated region for block: B:205:0x043b  */
        /* JADX WARNING: Removed duplicated region for block: B:206:0x0442  */
        /* JADX WARNING: Removed duplicated region for block: B:210:0x046c A[LOOP:0: B:8:0x0028->B:210:0x046c, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:231:0x0463 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x014e A[SYNTHETIC, Splitter:B:25:0x014e] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x01e8  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x021a A[ADDED_TO_REGION, Catch:{ all -> 0x0338 }] */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x022d A[SYNTHETIC, Splitter:B:88:0x022d] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.startapp.networkTest.results.LatencyResult doInBackground(java.lang.Void... r30) {
            /*
                r29 = this;
                r7 = r29
                java.lang.String r8 = "ping6"
                boolean r0 = r29.isCancelled()
                r1 = 0
                if (r0 == 0) goto L_0x000c
                return r1
            L_0x000c:
                boolean r0 = r7.f10768h
                if (r0 == 0) goto L_0x001b
                java.lang.String[] r0 = r7.f10766f
                com.startapp.networkTest.enums.LtrCriteriaTypes r2 = r7.f10767g
                java.lang.String r3 = r7.f10761a
                java.util.List r0 = r7.a((java.lang.String[]) r0, (com.startapp.networkTest.enums.LtrCriteriaTypes) r2, (java.lang.String) r3)
                goto L_0x0025
            L_0x001b:
                java.lang.String[] r0 = r7.f10766f
                com.startapp.networkTest.enums.LtrCriteriaTypes r2 = com.startapp.networkTest.enums.LtrCriteriaTypes.CTItem
                java.lang.String r3 = r7.f10761a
                java.util.List r0 = r7.a((java.lang.String[]) r0, (com.startapp.networkTest.enums.LtrCriteriaTypes) r2, (java.lang.String) r3)
            L_0x0025:
                r9 = r0
                r0 = 0
                r10 = 0
            L_0x0028:
                int r0 = r9.size()
                if (r10 >= r0) goto L_0x0488
                long r11 = android.os.SystemClock.elapsedRealtime()
                long r13 = android.os.SystemClock.uptimeMillis()
                java.lang.Object r0 = r9.get(r10)
                r15 = r0
                com.startapp.e6 r15 = (com.startapp.e6) r15
                int r0 = r15.totalTests
                int r0 = r0 + 1
                r15.totalTests = r0
                java.lang.String r0 = r15.address
                r7.f10761a = r0
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                com.startapp.networkTest.results.LatencyResult r5 = new com.startapp.networkTest.results.LatencyResult
                com.startapp.k0 r0 = com.startapp.k0.this
                java.lang.String r0 = r0.f10750i
                com.startapp.k0 r1 = com.startapp.k0.this
                com.startapp.b5 r1 = r1.f10751j
                java.lang.String r1 = r1.p()
                r5.<init>(r0, r1)
                com.startapp.k0 r0 = com.startapp.k0.this
                com.startapp.a1 r0 = r0.f10747f
                com.startapp.networkTest.data.BatteryInfo r0 = r0.a()
                r5.BatteryInfoOnStart = r0
                com.startapp.k0 r0 = com.startapp.k0.this
                com.startapp.networkTest.controller.LocationController r0 = r0.f10746e
                com.startapp.networkTest.data.LocationInfo r0 = r0.c()
                r5.LocationInfoOnStart = r0
                com.startapp.k0 r0 = com.startapp.k0.this
                android.content.Context r0 = r0.f10743b
                com.startapp.networkTest.enums.ScreenStates r0 = com.startapp.p2.h(r0)
                r5.ScreenStateOnStart = r0
                com.startapp.networkTest.enums.MeasurementTypes r0 = com.startapp.networkTest.enums.MeasurementTypes.IPING
                r5.MeasurementType = r0
                com.startapp.networkTest.data.TimeInfo r0 = com.startapp.ua.e()
                r5.TimeInfoOnStart = r0
                java.lang.String r1 = r5.GUID
                java.lang.String r0 = com.startapp.u3.a(r0, r1)
                r5.LtrId = r0
                com.startapp.k0 r0 = com.startapp.k0.this
                android.content.Context r0 = r0.f10743b
                com.startapp.h6 r0 = com.startapp.p2.e(r0)
                r5.MemoryInfoOnStart = r0
                com.startapp.k0 r0 = com.startapp.k0.this
                com.startapp.j8 r0 = r0.f10744c
                com.startapp.networkTest.data.RadioInfo r0 = r0.h()
                r5.RadioInfoOnStart = r0
                com.startapp.k0 r0 = com.startapp.k0.this
                com.startapp.nd r0 = r0.f10745d
                com.startapp.networkTest.data.WifiInfo r0 = r0.c()
                r5.WifiInfoOnStart = r0
                com.startapp.k0 r0 = com.startapp.k0.this
                com.startapp.nd r0 = r0.f10745d
                com.startapp.db r0 = com.startapp.p2.a((com.startapp.nd) r0)
                r5.TrafficInfoOnStart = r0
                com.startapp.k0 r0 = com.startapp.k0.this
                android.content.Context r0 = r0.f10743b
                com.startapp.q2 r0 = com.startapp.p2.b((android.content.Context) r0)
                r5.DeviceInfo = r0
                int r0 = com.startapp.networkTest.startapp.NetworkTester.isAppInForeground()
                r5.IsAppInForeground = r0
                int r0 = r7.f10762b
                r5.Pings = r0
                int r0 = r7.f10763c
                r5.Pause = r0
                java.lang.String r1 = r7.f10761a
                r5.Server = r1
                com.startapp.networkTest.enums.IpVersions r0 = com.startapp.networkTest.enums.IpVersions.IPv4
                r5.IpVersion = r0
                java.lang.String r2 = "ping"
                java.net.InetAddress r3 = java.net.InetAddress.getByName(r1)     // Catch:{ UnknownHostException -> 0x0101 }
                java.lang.String r1 = r3.getHostAddress()     // Catch:{ UnknownHostException -> 0x00ff }
                boolean r0 = r3 instanceof java.net.Inet6Address     // Catch:{ UnknownHostException -> 0x00ff }
                if (r0 == 0) goto L_0x0106
                com.startapp.networkTest.enums.IpVersions r0 = com.startapp.networkTest.enums.IpVersions.IPv6     // Catch:{ UnknownHostException -> 0x00ff }
                r5.IpVersion = r0     // Catch:{ UnknownHostException -> 0x00ff }
                r17 = r3
                r2 = r8
                goto L_0x0108
            L_0x00ff:
                r0 = move-exception
                goto L_0x0103
            L_0x0101:
                r0 = move-exception
                r3 = 0
            L_0x0103:
                com.startapp.x2.b(r0)
            L_0x0106:
                r17 = r3
            L_0x0108:
                java.lang.String r0 = " -i "
                java.lang.StringBuilder r0 = t.f.a(r2, r0)
                int r3 = r7.f10763c
                double r3 = (double) r3
                r18 = 4652007308841189376(0x408f400000000000, double:1000.0)
                java.lang.Double.isNaN(r3)
                double r3 = r3 / r18
                r0.append(r3)
                java.lang.String r3 = " -W "
                r0.append(r3)
                int r3 = r7.f10764d
                double r3 = (double) r3
                java.lang.Double.isNaN(r3)
                double r3 = r3 / r18
                r0.append(r3)
                java.lang.String r3 = " -c "
                r0.append(r3)
                int r3 = r7.f10762b
                r0.append(r3)
                java.lang.String r3 = " -s "
                r0.append(r3)
                int r3 = r7.f10765e
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                boolean r0 = r2.equals(r8)
                java.lang.String r4 = ""
                if (r0 == 0) goto L_0x01e8
                com.startapp.k0 r0 = com.startapp.k0.this     // Catch:{ all -> 0x01df }
                android.content.Context r0 = r0.f10743b     // Catch:{ all -> 0x01df }
                java.lang.String r2 = "connectivity"
                java.lang.Object r0 = r0.getSystemService(r2)     // Catch:{ all -> 0x01df }
                android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ all -> 0x01df }
                if (r0 == 0) goto L_0x01bb
                com.startapp.k0 r2 = com.startapp.k0.this     // Catch:{ all -> 0x01df }
                android.content.Context r2 = r2.f10743b     // Catch:{ all -> 0x01df }
                r22 = r8
                java.lang.String r8 = "android.permission.ACCESS_NETWORK_STATE"
                int r2 = r2.checkCallingOrSelfPermission(r8)     // Catch:{ all -> 0x01b9 }
                if (r2 != 0) goto L_0x01bd
                int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x01b9 }
                r8 = 23
                if (r2 < r8) goto L_0x0185
                android.net.Network r2 = r0.getActiveNetwork()     // Catch:{ all -> 0x01b9 }
                android.net.LinkProperties r0 = r0.getLinkProperties(r2)     // Catch:{ all -> 0x01b9 }
                if (r0 == 0) goto L_0x01bd
                java.lang.String r0 = r0.getInterfaceName()     // Catch:{ all -> 0x01b9 }
                r30 = r9
                goto L_0x01c0
            L_0x0185:
                r8 = 21
                if (r2 < r8) goto L_0x01bd
                android.net.Network[] r2 = r0.getAllNetworks()     // Catch:{ all -> 0x01b9 }
                int r8 = r2.length     // Catch:{ all -> 0x01b9 }
                r16 = 0
                r16 = r4
                r30 = r9
                r9 = 0
            L_0x0195:
                if (r9 >= r8) goto L_0x01b6
                r18 = r8
                r8 = r2[r9]     // Catch:{ all -> 0x01dd }
                android.net.NetworkInfo r19 = r0.getNetworkInfo(r8)     // Catch:{ all -> 0x01dd }
                if (r19 == 0) goto L_0x01b1
                boolean r19 = r19.isConnected()     // Catch:{ all -> 0x01dd }
                if (r19 == 0) goto L_0x01b1
                android.net.LinkProperties r8 = r0.getLinkProperties(r8)     // Catch:{ all -> 0x01dd }
                if (r8 == 0) goto L_0x01b1
                java.lang.String r16 = r8.getInterfaceName()     // Catch:{ all -> 0x01dd }
            L_0x01b1:
                int r9 = r9 + 1
                r8 = r18
                goto L_0x0195
            L_0x01b6:
                r0 = r16
                goto L_0x01c0
            L_0x01b9:
                r0 = move-exception
                goto L_0x01e2
            L_0x01bb:
                r22 = r8
            L_0x01bd:
                r30 = r9
                r0 = r4
            L_0x01c0:
                if (r0 == 0) goto L_0x01ec
                boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x01dd }
                if (r2 != 0) goto L_0x01ec
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01dd }
                r2.<init>()     // Catch:{ all -> 0x01dd }
                r2.append(r3)     // Catch:{ all -> 0x01dd }
                java.lang.String r8 = " -I "
                r2.append(r8)     // Catch:{ all -> 0x01dd }
                r2.append(r0)     // Catch:{ all -> 0x01dd }
                java.lang.String r3 = r2.toString()     // Catch:{ all -> 0x01dd }
                goto L_0x01ec
            L_0x01dd:
                r0 = move-exception
                goto L_0x01e4
            L_0x01df:
                r0 = move-exception
                r22 = r8
            L_0x01e2:
                r30 = r9
            L_0x01e4:
                com.startapp.x2.a((java.lang.Throwable) r0)
                goto L_0x01ec
            L_0x01e8:
                r22 = r8
                r30 = r9
            L_0x01ec:
                java.lang.String r0 = " "
                java.lang.String r1 = q.b.a(r3, r0, r1)
                r2 = 1
                boolean[] r8 = new boolean[r2]
                r3 = 0
                r8[r3] = r3
                int[] r9 = new int[r2]
                r9[r3] = r3
                java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x0357 }
                java.lang.Process r1 = r2.exec(r1)     // Catch:{ all -> 0x0357 }
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0349 }
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0349 }
                r23 = r10
                java.io.InputStream r10 = r1.getInputStream()     // Catch:{ all -> 0x0345 }
                r3.<init>(r10)     // Catch:{ all -> 0x0345 }
                r2.<init>(r3)     // Catch:{ all -> 0x0345 }
                java.lang.String r3 = r2.readLine()     // Catch:{ all -> 0x0338 }
                if (r3 != 0) goto L_0x0224
                if (r17 == 0) goto L_0x0224
                int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0338 }
                r10 = 21
                if (r3 < r10) goto L_0x0224
                r3 = 1
                goto L_0x0225
            L_0x0224:
                r3 = 0
            L_0x0225:
                com.startapp.k0 r10 = com.startapp.k0.this     // Catch:{ all -> 0x032a }
                com.startapp.e4 r10 = r10.f10742a     // Catch:{ all -> 0x032a }
                if (r10 == 0) goto L_0x025d
                com.startapp.k0 r10 = com.startapp.k0.this     // Catch:{ all -> 0x0252 }
                com.startapp.e4 r10 = r10.f10742a     // Catch:{ all -> 0x0252 }
                r24 = r15
                com.startapp.networkTest.speedtest.SpeedtestEngineStatus r15 = com.startapp.networkTest.speedtest.SpeedtestEngineStatus.PING     // Catch:{ all -> 0x024e }
                r25 = r11
                com.startapp.networkTest.speedtest.SpeedtestEngineError r11 = com.startapp.networkTest.speedtest.SpeedtestEngineError.OK     // Catch:{ all -> 0x024c }
                int r12 = r7.f10762b     // Catch:{ all -> 0x0248 }
                r27 = r13
                int r13 = r7.f10764d     // Catch:{ all -> 0x0315 }
                int r12 = r12 * r13
                long r12 = (long) r12     // Catch:{ all -> 0x0315 }
                r10.a(r15, r11, r12)     // Catch:{ all -> 0x0315 }
                goto L_0x0263
            L_0x0248:
                r0 = move-exception
            L_0x0249:
                r27 = r13
                goto L_0x0259
            L_0x024c:
                r0 = move-exception
                goto L_0x0249
            L_0x024e:
                r0 = move-exception
                r25 = r11
                goto L_0x0249
            L_0x0252:
                r0 = move-exception
                r25 = r11
                r27 = r13
                r24 = r15
            L_0x0259:
                r18 = r1
                goto L_0x02f9
            L_0x025d:
                r25 = r11
                r27 = r13
                r24 = r15
            L_0x0263:
                if (r3 != 0) goto L_0x0318
                long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0315 }
                r12 = 0
            L_0x026a:
                int r13 = r7.f10762b     // Catch:{ all -> 0x0315 }
                if (r12 >= r13) goto L_0x0318
                boolean r13 = r29.isCancelled()     // Catch:{ all -> 0x0315 }
                if (r13 == 0) goto L_0x0285
                r2.close()     // Catch:{ all -> 0x0315 }
                r2.close()     // Catch:{ all -> 0x027b }
                goto L_0x0280
            L_0x027b:
                r0 = move-exception
                r2 = r0
                com.startapp.x2.b(r2)
            L_0x0280:
                r1.destroy()
                r0 = 0
                return r0
            L_0x0285:
                java.lang.String r13 = r2.readLine()     // Catch:{ all -> 0x0315 }
                long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0315 }
                long r14 = r14 - r10
                if (r13 == 0) goto L_0x02fc
                int r16 = r13.length()     // Catch:{ all -> 0x02f6 }
                if (r16 <= 0) goto L_0x02fc
                java.lang.String[] r13 = r13.split(r0)     // Catch:{ all -> 0x02f6 }
                r16 = r0
                int r0 = r13.length     // Catch:{ all -> 0x02f6 }
                r18 = r1
                r1 = 8
                if (r0 == r1) goto L_0x02ab
                int r0 = r13.length     // Catch:{ all -> 0x02f4 }
                r1 = 9
                if (r0 != r1) goto L_0x02a9
                goto L_0x02ab
            L_0x02a9:
                r0 = -1
                goto L_0x02ae
            L_0x02ab:
                int r0 = r13.length     // Catch:{ all -> 0x02f4 }
                int r0 = r0 + -2
            L_0x02ae:
                r1 = 6
                if (r0 == r1) goto L_0x02b8
                r1 = 7
                if (r0 != r1) goto L_0x02b5
                goto L_0x02b8
            L_0x02b5:
                r19 = r3
                goto L_0x0301
            L_0x02b8:
                r0 = r13[r0]     // Catch:{ all -> 0x02f4 }
                java.lang.String r1 = "time="
                java.lang.String r0 = r0.replace(r1, r4)     // Catch:{ all -> 0x02f4 }
                double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ all -> 0x02f4 }
                long r0 = java.lang.Math.round(r0)     // Catch:{ all -> 0x02f4 }
                int r1 = (int) r0     // Catch:{ all -> 0x02f4 }
                r0 = 0
                r13 = 1
                r8[r0] = r13     // Catch:{ all -> 0x02f4 }
                r13 = r9[r0]     // Catch:{ all -> 0x02f4 }
                int r13 = r13 + 1
                r9[r0] = r13     // Catch:{ all -> 0x02f4 }
                com.startapp.k0 r0 = com.startapp.k0.this     // Catch:{ all -> 0x02f4 }
                com.startapp.e4 r0 = r0.f10742a     // Catch:{ all -> 0x02f4 }
                if (r0 == 0) goto L_0x02f1
                com.startapp.k0 r0 = com.startapp.k0.this     // Catch:{ all -> 0x02f4 }
                com.startapp.e4 r0 = r0.f10742a     // Catch:{ all -> 0x02f4 }
                float r13 = (float) r12
                r19 = r3
                int r3 = r7.f10762b     // Catch:{ all -> 0x0313 }
                float r3 = (float) r3     // Catch:{ all -> 0x0313 }
                float r13 = r13 / r3
                if (r1 >= 0) goto L_0x02ec
                r3 = 0
                goto L_0x02ed
            L_0x02ec:
                r3 = r1
            L_0x02ed:
                r0.b(r13, r3)     // Catch:{ all -> 0x0313 }
                goto L_0x0302
            L_0x02f1:
                r19 = r3
                goto L_0x0302
            L_0x02f4:
                r0 = move-exception
                goto L_0x02f9
            L_0x02f6:
                r0 = move-exception
                r18 = r1
            L_0x02f9:
                r19 = r3
                goto L_0x0335
            L_0x02fc:
                r16 = r0
                r18 = r1
                goto L_0x02b5
            L_0x0301:
                r1 = -1
            L_0x0302:
                com.startapp.networkTest.results.speedtest.MeasurementPointLatency r0 = r7.a(r14, r1)     // Catch:{ all -> 0x0313 }
                r6.add(r0)     // Catch:{ all -> 0x0313 }
                int r12 = r12 + 1
                r0 = r16
                r1 = r18
                r3 = r19
                goto L_0x026a
            L_0x0313:
                r0 = move-exception
                goto L_0x0335
            L_0x0315:
                r0 = move-exception
                goto L_0x0259
            L_0x0318:
                r18 = r1
                r19 = r3
                r2.close()     // Catch:{ all -> 0x0320 }
                goto L_0x0325
            L_0x0320:
                r0 = move-exception
                r1 = r0
                com.startapp.x2.b(r1)
            L_0x0325:
                r1 = r18
                r3 = r19
                goto L_0x0373
            L_0x032a:
                r0 = move-exception
                r18 = r1
                r19 = r3
                r25 = r11
                r27 = r13
                r24 = r15
            L_0x0335:
                r3 = r19
                goto L_0x0342
            L_0x0338:
                r0 = move-exception
                r18 = r1
                r25 = r11
                r27 = r13
                r24 = r15
                r3 = 0
            L_0x0342:
                r1 = r18
                goto L_0x0363
            L_0x0345:
                r0 = move-exception
                r18 = r1
                goto L_0x034e
            L_0x0349:
                r0 = move-exception
                r18 = r1
                r23 = r10
            L_0x034e:
                r25 = r11
                r27 = r13
                r24 = r15
                r1 = r18
                goto L_0x0361
            L_0x0357:
                r0 = move-exception
                r23 = r10
                r25 = r11
                r27 = r13
                r24 = r15
                r1 = 0
            L_0x0361:
                r2 = 0
                r3 = 0
            L_0x0363:
                com.startapp.x2.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0475 }
                if (r2 == 0) goto L_0x0371
                r2.close()     // Catch:{ all -> 0x036c }
                goto L_0x0371
            L_0x036c:
                r0 = move-exception
                r2 = r0
                com.startapp.x2.b(r2)
            L_0x0371:
                if (r1 == 0) goto L_0x0376
            L_0x0373:
                r1.destroy()
            L_0x0376:
                if (r3 == 0) goto L_0x03a9
                com.startapp.networkTest.enums.MeasurementTypes r0 = com.startapp.networkTest.enums.MeasurementTypes.APIIPING
                r5.MeasurementType = r0
                com.startapp.y r0 = new com.startapp.y
                int r1 = r7.f10762b
                int r2 = r7.f10763c
                int r3 = r7.f10764d
                int r4 = r7.f10765e
                r16 = r0
                r18 = r1
                r19 = r2
                r20 = r3
                r21 = r4
                r16.<init>(r17, r18, r19, r20, r21)
                com.startapp.k0$b$a r10 = new com.startapp.k0$b$a
                r11 = 1
                r1 = r10
                r2 = r29
                r3 = r8
                r4 = r9
                r12 = r5
                r5 = r6
                r13 = r6
                r6 = r0
                r1.<init>(r3, r4, r5, r6)
                r0.a((com.startapp.e8) r10)
                r0.c()
                goto L_0x03ac
            L_0x03a9:
                r12 = r5
                r13 = r6
                r11 = 1
            L_0x03ac:
                com.startapp.networkTest.enums.SpeedtestEndStates r0 = com.startapp.networkTest.enums.SpeedtestEndStates.Finish
                r12.TestEndState = r0
                com.startapp.networkTest.speedtest.SpeedtestEngineError r0 = com.startapp.networkTest.speedtest.SpeedtestEngineError.OK
                r12.TestErrorReason = r0
                r0 = 0
                boolean r1 = r8[r0]
                r12.Success = r1
                r0 = r9[r0]
                r12.SuccessfulPings = r0
                int r0 = r13.size()
                if (r0 <= 0) goto L_0x03cb
                r12.calculateStats(r13)
                java.util.ArrayList<com.startapp.networkTest.results.speedtest.MeasurementPointLatency> r0 = r12.MeasurementPoints
                r12.calcRatShare(r0)
            L_0x03cb:
                com.startapp.k0 r0 = com.startapp.k0.this
                com.startapp.a1 r0 = r0.f10747f
                com.startapp.networkTest.data.BatteryInfo r0 = r0.a()
                r12.BatteryInfoOnEnd = r0
                com.startapp.k0 r0 = com.startapp.k0.this
                com.startapp.networkTest.controller.LocationController r0 = r0.f10746e
                com.startapp.networkTest.data.LocationInfo r0 = r0.c()
                r12.LocationInfoOnEnd = r0
                com.startapp.k0 r0 = com.startapp.k0.this
                android.content.Context r0 = r0.f10743b
                com.startapp.networkTest.enums.ScreenStates r0 = com.startapp.p2.h(r0)
                r12.ScreenStateOnEnd = r0
                com.startapp.k0 r0 = com.startapp.k0.this
                android.content.Context r0 = r0.f10743b
                com.startapp.h6 r0 = com.startapp.p2.e(r0)
                r12.MemoryInfoOnEnd = r0
                com.startapp.k0 r0 = com.startapp.k0.this
                com.startapp.j8 r0 = r0.f10744c
                com.startapp.networkTest.data.RadioInfo r0 = r0.h()
                r12.RadioInfoOnEnd = r0
                com.startapp.networkTest.data.TimeInfo r0 = com.startapp.ua.e()
                r12.TimeInfoOnEnd = r0
                com.startapp.k0 r0 = com.startapp.k0.this
                com.startapp.nd r0 = r0.f10745d
                com.startapp.networkTest.data.WifiInfo r0 = r0.c()
                r12.WifiInfoOnEnd = r0
                com.startapp.k0 r0 = com.startapp.k0.this
                com.startapp.nd r0 = r0.f10745d
                com.startapp.db r0 = com.startapp.p2.a((com.startapp.nd) r0)
                r12.TrafficInfoOnEnd = r0
                long r0 = android.os.SystemClock.uptimeMillis()
                long r0 = r0 - r27
                r12.DurationOverallNoSleep = r0
                long r0 = android.os.SystemClock.elapsedRealtime()
                long r0 = r0 - r25
                r12.DurationOverall = r0
                com.startapp.networkTest.enums.LtrCriteriaTypes r0 = r7.f10767g
                com.startapp.networkTest.enums.LtrCriteriaTypes r1 = com.startapp.networkTest.enums.LtrCriteriaTypes.CTItem
                if (r0 != r1) goto L_0x0442
                com.startapp.k0 r0 = com.startapp.k0.this
                java.lang.String r0 = r0.f10759r
                goto L_0x0448
            L_0x0442:
                java.lang.String r0 = r7.f10761a
                java.lang.String r0 = com.startapp.s9.a(r0)
            L_0x0448:
                r12.AirportCode = r0
                com.startapp.k0 r0 = com.startapp.k0.this
                java.lang.String r0 = r0.f10753l
                r12.Meta = r0
                com.startapp.k0 r0 = com.startapp.k0.this
                java.lang.String r0 = r0.f10752k
                java.lang.String r0 = com.startapp.la.a((java.lang.String) r0)
                r12.QuestionnaireName = r0
                r0 = 0
                boolean r0 = r8[r0]
                if (r0 == 0) goto L_0x046c
                r1 = r24
                int r0 = r1.successfulTests
                int r0 = r0 + r11
                r1.successfulTests = r0
                r1 = r12
                goto L_0x048a
            L_0x046c:
                int r10 = r23 + 1
                r9 = r30
                r1 = r12
                r8 = r22
                goto L_0x0028
            L_0x0475:
                r0 = move-exception
                r3 = r0
                if (r2 == 0) goto L_0x0482
                r2.close()     // Catch:{ all -> 0x047d }
                goto L_0x0482
            L_0x047d:
                r0 = move-exception
                r2 = r0
                com.startapp.x2.b(r2)
            L_0x0482:
                if (r1 == 0) goto L_0x0487
                r1.destroy()
            L_0x0487:
                throw r3
            L_0x0488:
                r30 = r9
            L_0x048a:
                com.startapp.networkTest.enums.LtrCriteriaTypes r0 = r7.f10767g
                com.startapp.networkTest.enums.LtrCriteriaTypes r2 = com.startapp.networkTest.enums.LtrCriteriaTypes.CTItem
                if (r0 == r2) goto L_0x0495
                r2 = r30
                r7.a((java.util.List<com.startapp.e6>) r2)
            L_0x0495:
                com.startapp.y4 r0 = com.startapp.a5.b()
                boolean r0 = r0.CLEAR_LTR_LOCATION_INFO()
                if (r0 == 0) goto L_0x04af
                if (r1 == 0) goto L_0x04af
                com.startapp.networkTest.data.LocationInfo r0 = new com.startapp.networkTest.data.LocationInfo
                r0.<init>()
                r1.LocationInfoOnStart = r0
                com.startapp.networkTest.data.LocationInfo r0 = new com.startapp.networkTest.data.LocationInfo
                r0.<init>()
                r1.LocationInfoOnEnd = r0
            L_0x04af:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.k0.b.doInBackground(java.lang.Void[]):com.startapp.networkTest.results.LatencyResult");
        }

        /* access modifiers changed from: private */
        public MeasurementPointLatency a(long j10, int i10) {
            MeasurementPointLatency measurementPointLatency = new MeasurementPointLatency();
            measurementPointLatency.Delta = j10;
            RadioInfo h10 = k0.this.f10744c.h();
            measurementPointLatency.ConnectionType = h10.ConnectionType;
            measurementPointLatency.NetworkType = h10.NetworkType;
            measurementPointLatency.NrAvailable = h10.NrAvailable;
            measurementPointLatency.NrState = h10.NrState;
            measurementPointLatency.RxLev = h10.RXLevel;
            measurementPointLatency.Rtt = i10;
            return measurementPointLatency;
        }

        /* renamed from: a */
        public void onPostExecute(LatencyResult latencyResult) {
            super.onPostExecute(latencyResult);
            P3TestResult unused = k0.this.f10748g = latencyResult;
            if (latencyResult != null) {
                if (k0.this.f10742a != null) {
                    k0.this.f10742a.a(SpeedtestEngineStatus.END, SpeedtestEngineError.OK, 0);
                }
            } else if (k0.this.f10742a != null) {
                k0.this.f10742a.a(SpeedtestEngineStatus.ABORTED, SpeedtestEngineError.OK, 0);
            }
        }

        private void a(List<e6> list) {
            HashSet hashSet = new HashSet();
            for (e6 e6Var : list) {
                hashSet.add(e6Var.toString());
            }
            a5.c().d((Set<String>) hashSet);
        }

        private List<e6> a(String[] strArr, LtrCriteriaTypes ltrCriteriaTypes, String str) {
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            Set<String> q10 = a5.c().q();
            LinkedList<e6> linkedList3 = new LinkedList<>();
            if (q10 != null) {
                for (String a10 : q10) {
                    e6 e6Var = (e6) r5.a(a10, e6.class);
                    if (e6Var != null) {
                        linkedList3.add(e6Var);
                    }
                }
            }
            for (String str2 : strArr) {
                e6 e6Var2 = new e6();
                e6Var2.address = str2;
                linkedList2.add(e6Var2);
            }
            for (e6 e6Var3 : linkedList3) {
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    if (strArr[i10].equals(e6Var3.address)) {
                        linkedList2.set(i10, e6Var3);
                    }
                }
            }
            int i11 = a.f10760a[ltrCriteriaTypes.ordinal()];
            if (i11 == 1) {
                e6 e6Var4 = new e6();
                e6Var4.address = str;
                linkedList.add(e6Var4);
                return linkedList;
            } else if (i11 == 2) {
                return linkedList2;
            } else {
                if (i11 == 3) {
                    Collections.shuffle(linkedList2, new Random(System.nanoTime()));
                    return new LinkedList(linkedList2);
                } else if (i11 == 4) {
                    Collections.sort(linkedList2, new C0116b());
                    return new LinkedList(linkedList2);
                } else if (i11 != 5) {
                    return linkedList;
                } else {
                    Collections.sort(linkedList2, new c());
                    return new LinkedList(linkedList2);
                }
            }
        }
    }

    public void b() {
        a(LocationController.ProviderMode.GpsAndNetwork);
    }

    public void c() {
        LocationController locationController = this.f10746e;
        if (locationController != null) {
            locationController.f();
        }
        j8 j8Var = this.f10744c;
        if (j8Var != null) {
            j8Var.y();
        }
        nd ndVar = this.f10745d;
        if (ndVar != null) {
            ndVar.g();
        }
    }

    public void d(String str) {
        this.f10757p = str;
    }

    public void e(String str) {
        this.f10753l = str;
    }

    public void f(String str) {
        this.f10758q = str;
    }

    public void g(String str) {
        this.f10752k = str;
    }

    public P3TestResult a() {
        return this.f10748g;
    }

    public void b(String str) {
        this.f10759r = str;
    }

    private void a(Context context, y4 y4Var) {
        this.f10744c = new j8(context);
        this.f10745d = new nd(context);
        this.f10746e = new LocationController(this.f10743b);
        this.f10747f = new a1(this.f10743b);
        this.f10749h = new ArrayList<>();
        if (y4Var.BANDWDITH_TEST_MANAGER_GET_IMEI_IMSI()) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        }
    }

    public void c(String str) {
        this.f10754m = str;
    }

    public void a(LocationController.ProviderMode providerMode) {
        LocationController locationController = this.f10746e;
        if (locationController != null) {
            locationController.a(providerMode);
        }
        j8 j8Var = this.f10744c;
        if (j8Var != null) {
            j8Var.x();
        }
        nd ndVar = this.f10745d;
        if (ndVar != null) {
            ndVar.f();
        }
    }

    public void a(String str) {
        ArrayList<i8> arrayList = this.f10749h;
        arrayList.add(new i8(arrayList.size() + 1, str));
    }

    public void a(String str, int i10, int i11, int i12, int i13, boolean z10) {
        this.f10749h = new ArrayList<>();
        new b(str, i10, i11, i12, i13, z10).executeOnExecutor(ThreadManager.b().a(), new Void[0]);
    }

    public void a(String str, int i10, int i11, int i12, int i13) {
        a(str, i10, i11, i12, i13, false);
    }
}
