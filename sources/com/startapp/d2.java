package com.startapp;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import com.startapp.networkTest.controller.LocationController;
import com.startapp.networkTest.enums.CtCriteriaTypes;
import com.startapp.networkTest.enums.voice.CallStates;
import com.startapp.networkTest.results.ConnectivityTestResult;
import com.startapp.networkTest.results.LatencyResult;
import com.startapp.networkTest.speedtest.SpeedtestEngineError;
import com.startapp.networkTest.speedtest.SpeedtestEngineStatus;
import com.startapp.networkTest.threads.ThreadManager;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

/* compiled from: Sta */
public class d2 {

    /* renamed from: n  reason: collision with root package name */
    private static final boolean f10265n = false;

    /* renamed from: o  reason: collision with root package name */
    private static final String f10266o = "d2";

    /* renamed from: p  reason: collision with root package name */
    private static final int f10267p = 30000;

    /* renamed from: q  reason: collision with root package name */
    private static final String f10268q = "\r\n";
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Context f10269a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public j8 f10270b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public nd f10271c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public LocationController f10272d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public b5 f10273e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public w7 f10274f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public String f10275g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public String f10276h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public String f10277i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public String f10278j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public Random f10279k = new Random();
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public float f10280l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public boolean f10281m;

    /* compiled from: Sta */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10282a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.startapp.networkTest.enums.CtCriteriaTypes[] r0 = com.startapp.networkTest.enums.CtCriteriaTypes.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10282a = r0
                com.startapp.networkTest.enums.CtCriteriaTypes r1 = com.startapp.networkTest.enums.CtCriteriaTypes.NoChange     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10282a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.networkTest.enums.CtCriteriaTypes r1 = com.startapp.networkTest.enums.CtCriteriaTypes.Random     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10282a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.startapp.networkTest.enums.CtCriteriaTypes r1 = com.startapp.networkTest.enums.CtCriteriaTypes.DNSSuccessful     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10282a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.startapp.networkTest.enums.CtCriteriaTypes r1 = com.startapp.networkTest.enums.CtCriteriaTypes.TCPSuccessful     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f10282a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.startapp.networkTest.enums.CtCriteriaTypes r1 = com.startapp.networkTest.enums.CtCriteriaTypes.FullSuccessful     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f10282a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.startapp.networkTest.enums.CtCriteriaTypes r1 = com.startapp.networkTest.enums.CtCriteriaTypes.TotalTests     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.d2.a.<clinit>():void");
        }
    }

    public d2(Context context) {
        this.f10269a = context;
        this.f10273e = new b5(context);
        y4 b10 = a5.b();
        this.f10275g = b10.PROJECT_ID();
        this.f10276h = b10.CONNECTIVITY_TEST_HOSTNAME();
        this.f10277i = b10.CONNECTIVITY_TEST_FILENAME();
        this.f10278j = b10.CONNECTIVITY_TEST_IP();
        this.f10280l = b10.CONNECTIVITY_TEST_MIN_BATTERY_LEVEL();
        this.f10281m = b10.CONNECTIVITY_TEST_ENABLED_IN_ROAMING();
        this.f10272d = new LocationController(context);
        this.f10270b = new j8(context);
        this.f10271c = new nd(context);
    }

    public void b() {
        this.f10272d.f();
        this.f10270b.y();
        this.f10271c.g();
    }

    public void a() {
        this.f10272d.a(LocationController.ProviderMode.Passive);
        this.f10270b.x();
        this.f10271c.f();
    }

    /* compiled from: Sta */
    public class b extends AsyncTask<Void, String, ConnectivityTestResult> implements e4 {

        /* renamed from: a  reason: collision with root package name */
        private ConnectivityTestResult f10283a;

        /* renamed from: b  reason: collision with root package name */
        private k0 f10284b;

        /* compiled from: Sta */
        public class a implements Comparator<h2> {
            public a() {
            }

            /* renamed from: a */
            public int compare(h2 h2Var, h2 h2Var2) {
                return h2Var.DNSSuccess - h2Var2.DNSSuccess;
            }
        }

        /* renamed from: com.startapp.d2$b$b  reason: collision with other inner class name */
        /* compiled from: Sta */
        public class C0114b implements Comparator<h2> {
            public C0114b() {
            }

            /* renamed from: a */
            public int compare(h2 h2Var, h2 h2Var2) {
                return h2Var.TCPSuccess - h2Var2.TCPSuccess;
            }
        }

        /* compiled from: Sta */
        public class c implements Comparator<h2> {
            public c() {
            }

            /* renamed from: a */
            public int compare(h2 h2Var, h2 h2Var2) {
                return h2Var.successfulTests - h2Var2.successfulTests;
            }
        }

        /* compiled from: Sta */
        public class d implements Comparator<h2> {
            public d() {
            }

            /* renamed from: a */
            public int compare(h2 h2Var, h2 h2Var2) {
                return h2Var.totalTests - h2Var2.totalTests;
            }
        }

        /* compiled from: Sta */
        public class e {

            /* renamed from: a  reason: collision with root package name */
            public final int f10290a;

            /* renamed from: b  reason: collision with root package name */
            public final String f10291b;

            /* renamed from: c  reason: collision with root package name */
            public final boolean f10292c;

            public e(int i10, String str, boolean z10) {
                this.f10290a = i10;
                this.f10291b = str;
                this.f10292c = z10;
            }
        }

        public b() {
        }

        private e a(InputStream inputStream) throws IOException {
            boolean z10;
            byte[] bArr = new byte[1024];
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int read = inputStream.read();
                z10 = true;
                i10++;
                if (read == 10) {
                    z10 = false;
                    break;
                } else if (read < 0) {
                    break;
                } else {
                    int i12 = i11 + 1;
                    bArr[i11] = (byte) read;
                    if (i12 == bArr.length) {
                        bArr = Arrays.copyOf(bArr, i12 + 1024);
                    }
                    i11 = i12;
                }
            }
            if (i11 > 0 && bArr[i11 - 1] == 13) {
                i11--;
            }
            return new e(i10, new String(bArr, 0, i11, "UTF-8"), z10);
        }

        private CallStates b() {
            TelephonyManager telephonyManager = (TelephonyManager) d2.this.f10269a.getSystemService("phone");
            if (telephonyManager == null) {
                return CallStates.Unknown;
            }
            if (Build.VERSION.SDK_INT >= 31 && d2.this.f10269a.checkSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
                return CallStates.Unknown;
            }
            int callState = telephonyManager.getCallState();
            if (callState == 0) {
                return CallStates.Idle;
            }
            if (callState == 1) {
                return CallStates.Ringing;
            }
            if (callState != 2) {
                return CallStates.Unknown;
            }
            return CallStates.Offhook;
        }

        public void a(float f10, int i10) {
        }

        public void b(float f10, int i10) {
        }

        public void c(float f10, int i10) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:148:0x04be A[Catch:{ Exception -> 0x06b6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:149:0x04e1 A[Catch:{ Exception -> 0x06b6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:158:0x0565  */
        /* JADX WARNING: Removed duplicated region for block: B:196:0x0634  */
        /* JADX WARNING: Removed duplicated region for block: B:197:0x063b  */
        /* JADX WARNING: Removed duplicated region for block: B:207:0x0652  */
        /* JADX WARNING: Removed duplicated region for block: B:212:0x0660 A[SYNTHETIC, Splitter:B:212:0x0660] */
        /* JADX WARNING: Removed duplicated region for block: B:217:0x0673 A[SYNTHETIC, Splitter:B:217:0x0673] */
        /* JADX WARNING: Removed duplicated region for block: B:232:0x069e A[SYNTHETIC, Splitter:B:232:0x069e] */
        /* JADX WARNING: Removed duplicated region for block: B:256:0x0703 A[SYNTHETIC, Splitter:B:256:0x0703] */
        /* JADX WARNING: Removed duplicated region for block: B:269:0x0729  */
        /* JADX WARNING: Removed duplicated region for block: B:279:0x07dc  */
        /* JADX WARNING: Removed duplicated region for block: B:282:0x07ec  */
        /* JADX WARNING: Removed duplicated region for block: B:285:0x07fb  */
        /* JADX WARNING: Removed duplicated region for block: B:329:0x08d1 A[DONT_GENERATE] */
        /* JADX WARNING: Removed duplicated region for block: B:335:0x08eb  */
        /* JADX WARNING: Removed duplicated region for block: B:341:0x08d4 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:343:0x0627 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:348:0x0645 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.startapp.networkTest.results.ConnectivityTestResult doInBackground(java.lang.Void... r38) {
            /*
                r37 = this;
                r1 = r37
                java.lang.String r2 = "\r\n"
                com.startapp.a1 r0 = new com.startapp.a1
                com.startapp.d2 r3 = com.startapp.d2.this
                android.content.Context r3 = r3.f10269a
                r0.<init>(r3)
                com.startapp.networkTest.data.BatteryInfo r3 = r0.a()
                com.startapp.d2 r0 = com.startapp.d2.this
                float r0 = r0.f10280l
                r4 = 0
                r5 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r0 == 0) goto L_0x002d
                float r0 = r3.BatteryLevel
                com.startapp.d2 r5 = com.startapp.d2.this
                float r5 = r5.f10280l
                int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x002d
                return r4
            L_0x002d:
                com.startapp.d2 r0 = com.startapp.d2.this
                android.content.Context r0 = r0.f10269a
                com.startapp.x9 r5 = com.startapp.p2.i(r0)
                com.startapp.d2 r0 = com.startapp.d2.this
                boolean r0 = r0.f10281m
                if (r0 != 0) goto L_0x005c
                com.startapp.d2 r0 = com.startapp.d2.this
                com.startapp.j8 r0 = r0.f10270b
                com.startapp.networkTest.enums.ConnectionTypes r0 = r0.d()
                com.startapp.networkTest.enums.ConnectionTypes r6 = com.startapp.networkTest.enums.ConnectionTypes.Mobile
                if (r0 != r6) goto L_0x005c
                com.startapp.d2 r0 = com.startapp.d2.this
                com.startapp.j8 r0 = r0.f10270b
                int r6 = r5.SubscriptionId
                boolean r0 = r0.j((int) r6)
                if (r0 == 0) goto L_0x005c
                return r4
            L_0x005c:
                com.startapp.b5 r0 = com.startapp.a5.c()     // Catch:{ all -> 0x0085 }
                long r7 = r0.w()     // Catch:{ all -> 0x0085 }
                long r9 = com.startapp.ua.d()     // Catch:{ all -> 0x0085 }
                com.startapp.y4 r0 = com.startapp.a5.b()     // Catch:{ all -> 0x0085 }
                long r11 = r0.CONNECTIVITY_TEST_TRUSTSTORE_UPDATE_INTERVAL()     // Catch:{ all -> 0x0085 }
                long r11 = r11 + r7
                int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r0 < 0) goto L_0x0079
                int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r0 <= 0) goto L_0x0089
            L_0x0079:
                com.startapp.d2 r0 = com.startapp.d2.this     // Catch:{ all -> 0x0085 }
                android.content.Context r0 = r0.f10269a     // Catch:{ all -> 0x0085 }
                boolean r0 = com.startapp.mb.a((android.content.Context) r0)     // Catch:{ all -> 0x0085 }
                r7 = r0
                goto L_0x008a
            L_0x0085:
                r0 = move-exception
                com.startapp.x2.a((java.lang.Throwable) r0)
            L_0x0089:
                r7 = 0
            L_0x008a:
                com.startapp.b5 r0 = com.startapp.a5.c()     // Catch:{ all -> 0x00ab }
                long r8 = r0.t()     // Catch:{ all -> 0x00ab }
                long r10 = com.startapp.ua.d()     // Catch:{ all -> 0x00ab }
                com.startapp.y4 r0 = com.startapp.a5.b()     // Catch:{ all -> 0x00ab }
                long r12 = r0.CONNECTIVITY_TEST_CDNCONFIG_UPDATE_INTERVAL()     // Catch:{ all -> 0x00ab }
                long r12 = r12 + r8
                int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                if (r0 < 0) goto L_0x00a7
                int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r0 <= 0) goto L_0x00af
            L_0x00a7:
                com.startapp.w1.a()     // Catch:{ all -> 0x00ab }
                goto L_0x00af
            L_0x00ab:
                r0 = move-exception
                com.startapp.x2.a((java.lang.Throwable) r0)
            L_0x00af:
                boolean r0 = com.startapp.a5.h()
                if (r0 == 0) goto L_0x08eb
                com.startapp.d2 r0 = com.startapp.d2.this
                com.startapp.nd r0 = r0.f10271c
                if (r0 != 0) goto L_0x00bf
                goto L_0x08eb
            L_0x00bf:
                com.startapp.networkTest.results.ConnectivityTestResult r0 = new com.startapp.networkTest.results.ConnectivityTestResult
                com.startapp.d2 r8 = com.startapp.d2.this
                java.lang.String r8 = r8.f10275g
                com.startapp.d2 r9 = com.startapp.d2.this
                com.startapp.b5 r9 = r9.f10273e
                java.lang.String r9 = r9.p()
                r0.<init>(r8, r9)
                r1.f10283a = r0
                com.startapp.d2 r8 = com.startapp.d2.this
                com.startapp.networkTest.controller.LocationController r8 = r8.f10272d
                com.startapp.networkTest.data.LocationInfo r8 = r8.c()
                r0.LocationInfo = r8
                com.startapp.b5 r0 = com.startapp.a5.c()
                java.lang.String[] r0 = r0.i()
                com.startapp.b5 r8 = com.startapp.a5.c()
                java.lang.String r8 = r8.h()
                com.startapp.networkTest.enums.CtCriteriaTypes r8 = com.startapp.networkTest.enums.CtCriteriaTypes.valueOf(r8)
                com.startapp.networkTest.results.ConnectivityTestResult r9 = r1.f10283a
                int r10 = com.startapp.networkTest.startapp.NetworkTester.isAppInForeground()
                r9.IsAppInForeground = r10
                com.startapp.networkTest.results.ConnectivityTestResult r9 = r1.f10283a
                java.lang.String r10 = "20220530140220"
                r9.Version = r10
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                com.startapp.d2 r11 = com.startapp.d2.this
                java.lang.String r11 = r11.f10277i
                r10.append(r11)
                java.lang.String r11 = "?id="
                r10.append(r11)
                com.startapp.d2 r11 = com.startapp.d2.this
                java.util.Random r11 = r11.f10279k
                long r11 = r11.nextLong()
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9.ServerFilename = r10
                com.startapp.networkTest.results.ConnectivityTestResult r9 = r1.f10283a
                r9.BatteryInfo = r3
                com.startapp.d2 r3 = com.startapp.d2.this
                android.content.Context r3 = r3.f10269a
                com.startapp.q2 r3 = com.startapp.p2.b((android.content.Context) r3)
                r9.DeviceInfo = r3
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f10283a
                com.startapp.d2 r9 = com.startapp.d2.this
                android.content.Context r9 = r9.f10269a
                com.startapp.h6 r9 = com.startapp.p2.e(r9)
                r3.MemoryInfo = r9
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f10283a
                com.startapp.d2 r9 = com.startapp.d2.this
                com.startapp.j8 r9 = r9.f10270b
                com.startapp.networkTest.data.RadioInfo r9 = r9.h()
                r3.RadioInfo = r9
                com.startapp.y4 r3 = com.startapp.a5.b()
                boolean r3 = r3.CT_COLLECT_CELLINFO()
                if (r3 == 0) goto L_0x0177
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f10283a
                java.util.ArrayList r9 = new java.util.ArrayList
                com.startapp.d2 r10 = com.startapp.d2.this
                com.startapp.j8 r10 = r10.f10270b
                com.startapp.networkTest.data.radio.CellInfo[] r10 = r10.c()
                java.util.List r10 = java.util.Arrays.asList(r10)
                r9.<init>(r10)
                r3.CellInfo = r9
            L_0x0177:
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f10283a
                java.util.ArrayList r9 = new java.util.ArrayList
                com.startapp.d2 r10 = com.startapp.d2.this
                com.startapp.j8 r10 = r10.f10270b
                com.startapp.networkTest.data.radio.ApnInfo[] r10 = r10.a()
                java.util.List r10 = java.util.Arrays.asList(r10)
                r9.<init>(r10)
                r3.ApnInfo = r9
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f10283a
                java.util.ArrayList r9 = new java.util.ArrayList
                com.startapp.d2 r10 = com.startapp.d2.this
                com.startapp.j8 r10 = r10.f10270b
                com.startapp.d2 r11 = com.startapp.d2.this
                com.startapp.j8 r11 = r11.f10270b
                com.startapp.y6 r11 = r11.b()
                int r11 = r11.DefaultDataSimId
                com.startapp.networkTest.data.radio.NetworkRegistrationInfo[] r10 = r10.g((int) r11)
                java.util.List r10 = java.util.Arrays.asList(r10)
                r9.<init>(r10)
                r3.NetworkRegistrationInfo = r9
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f10283a
                com.startapp.d2 r9 = com.startapp.d2.this
                com.startapp.j8 r9 = r9.f10270b
                com.startapp.d2 r10 = com.startapp.d2.this
                com.startapp.j8 r10 = r10.f10270b
                com.startapp.y6 r10 = r10.b()
                int r10 = r10.DefaultDataSimId
                com.startapp.networkTest.enums.NetworkTypes r9 = r9.i((int) r10)
                r3.VoiceNetworkType = r9
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f10283a
                com.startapp.networkTest.enums.voice.CallStates r9 = r37.b()
                r3.CallState = r9
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f10283a
                com.startapp.d2 r9 = com.startapp.d2.this
                android.content.Context r9 = r9.f10269a
                com.startapp.ia r9 = com.startapp.p2.k(r9)
                r3.StorageInfo = r9
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f10283a
                com.startapp.d2 r9 = com.startapp.d2.this
                com.startapp.nd r9 = r9.f10271c
                com.startapp.networkTest.data.WifiInfo r9 = r9.c()
                r3.WifiInfo = r9
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f10283a
                com.startapp.d2 r9 = com.startapp.d2.this
                com.startapp.nd r9 = r9.f10271c
                com.startapp.db r9 = com.startapp.p2.a((com.startapp.nd) r9)
                r3.TrafficInfo = r9
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f10283a
                com.startapp.d2 r9 = com.startapp.d2.this
                android.content.Context r9 = r9.f10269a
                com.startapp.networkTest.enums.ScreenStates r9 = com.startapp.p2.h(r9)
                r3.ScreenState = r9
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f10283a
                com.startapp.d2 r9 = com.startapp.d2.this
                android.content.Context r9 = r9.f10269a
                com.startapp.networkTest.enums.IdleStates r9 = com.startapp.p2.d(r9)
                r3.IdleStateOnStart = r9
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f10283a
                r3.SimInfo = r5
                com.startapp.networkTest.data.TimeInfo r5 = com.startapp.ua.e()
                r3.TimeInfo = r5
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f10283a
                com.startapp.networkTest.data.TimeInfo r5 = r3.TimeInfo
                java.lang.String r5 = r5.TimestampTableau
                r3.TestTimestamp = r5
                com.startapp.b5 r5 = com.startapp.a5.c()
                long r9 = r5.F()
                r3.TruststoreTimestamp = r9
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f10283a
                com.startapp.networkTest.data.TimeInfo r5 = r3.TimeInfo
                java.lang.String r9 = r3.GUID
                java.lang.String r5 = com.startapp.u3.a(r5, r9)
                r3.CtId = r5
                com.startapp.d2 r3 = com.startapp.d2.this
                com.startapp.b5 r3 = r3.f10273e
                boolean r3 = r3.l()
                r5 = 1
                if (r3 == 0) goto L_0x025e
                com.startapp.d2 r3 = com.startapp.d2.this
                com.startapp.b5 r3 = r3.f10273e
                boolean r3 = r3.m()
                if (r3 != 0) goto L_0x025e
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f10283a
                r3.IsKeepAlive = r5
            L_0x025e:
                long r9 = android.os.SystemClock.elapsedRealtime()
                long r11 = android.os.SystemClock.uptimeMillis()
                javax.net.ssl.HostnameVerifier r3 = javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier()
                com.startapp.c5 r13 = new com.startapp.c5
                com.startapp.d2 r14 = com.startapp.d2.this
                android.content.Context r14 = r14.f10269a
                r13.<init>(r14, r7)
                java.util.List r7 = r1.a((java.lang.String[]) r0, (com.startapp.networkTest.enums.CtCriteriaTypes) r8)
                java.util.LinkedList r8 = new java.util.LinkedList
                r8.<init>()
                com.startapp.d2 r0 = com.startapp.d2.this
                java.lang.String r0 = r0.f10276h
                com.startapp.d2 r14 = com.startapp.d2.this
                java.lang.String r14 = r14.f10278j
                r18 = r4
                r19 = r18
                r20 = r19
                r4 = 0
                r16 = 0
                r17 = 0
                r33 = r9
                r9 = r0
                r35 = r11
                r12 = r14
                r10 = r33
                r14 = r35
            L_0x029f:
                int r0 = r7.size()
                java.lang.String r5 = ""
                java.lang.String r6 = "; "
                if (r4 < r0) goto L_0x02ca
                boolean r0 = r7.isEmpty()
                if (r0 == 0) goto L_0x02b6
                int r0 = r9.length()
                if (r0 <= 0) goto L_0x02b6
                goto L_0x02ca
            L_0x02b6:
                r27 = r7
                r9 = r16
                r12 = r17
                r7 = r18
                r0 = r19
                r4 = r20
                r16 = 0
                r17 = 0
                r21 = 0
                goto L_0x0420
            L_0x02ca:
                r23 = r10
                com.startapp.x6 r10 = new com.startapp.x6
                r10.<init>()
                long r23 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x089f }
                long r14 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x089f }
                com.startapp.h2 r11 = new com.startapp.h2     // Catch:{ all -> 0x0894 }
                r11.<init>()     // Catch:{ all -> 0x0894 }
                int r16 = r16 + 1
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f10283a     // Catch:{ all -> 0x0884 }
                r25 = r11
                boolean r11 = r37.a()     // Catch:{ all -> 0x0882 }
                r0.LocalhostPingSuccess = r11     // Catch:{ all -> 0x0882 }
                long r26 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0882 }
                boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x0882 }
                if (r0 != 0) goto L_0x036e
                java.lang.Object r0 = r7.get(r4)     // Catch:{ all -> 0x0361 }
                r11 = r0
                com.startapp.h2 r11 = (com.startapp.h2) r11     // Catch:{ all -> 0x0361 }
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f10283a     // Catch:{ all -> 0x0350 }
                r28 = r14
                java.lang.String r14 = r11.address     // Catch:{ all -> 0x034c }
                r0.ServerHostname = r14     // Catch:{ all -> 0x034c }
                int r0 = r11.totalTests     // Catch:{ all -> 0x034c }
                r14 = 1
                int r0 = r0 + r14
                r11.totalTests = r0     // Catch:{ all -> 0x034c }
                int r0 = r4 + 1
                r10.Try = r0     // Catch:{ all -> 0x034c }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x034c }
                r0.<init>()     // Catch:{ all -> 0x034c }
                com.startapp.networkTest.results.ConnectivityTestResult r14 = r1.f10283a     // Catch:{ all -> 0x034c }
                java.lang.String r14 = r14.ServerHostname     // Catch:{ all -> 0x034c }
                r0.append(r14)     // Catch:{ all -> 0x034c }
                com.startapp.networkTest.results.ConnectivityTestResult r14 = r1.f10283a     // Catch:{ all -> 0x034c }
                java.lang.String r14 = r14.ServerFilename     // Catch:{ all -> 0x034c }
                r0.append(r14)     // Catch:{ all -> 0x034c }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x034c }
                r10.HostFile = r0     // Catch:{ all -> 0x034c }
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f10283a     // Catch:{ all -> 0x034c }
                com.startapp.t2 r14 = new com.startapp.t2     // Catch:{ all -> 0x034c }
                r14.<init>()     // Catch:{ all -> 0x034c }
                com.startapp.networkTest.results.ConnectivityTestResult r15 = r1.f10283a     // Catch:{ all -> 0x034c }
                java.lang.String r15 = r15.ServerHostname     // Catch:{ all -> 0x034c }
                r30 = r11
                r11 = 30000(0x7530, float:4.2039E-41)
                java.lang.String r14 = r14.a((java.lang.String) r15, (int) r11)     // Catch:{ all -> 0x034a }
                r0.ServerIp = r14     // Catch:{ all -> 0x034a }
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f10283a     // Catch:{ all -> 0x034a }
                long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x034a }
                long r14 = r14 - r26
                r0.DurationDNS = r14     // Catch:{ all -> 0x034a }
                r11 = r30
                r14 = 1
                goto L_0x03b4
            L_0x034a:
                r0 = move-exception
                goto L_0x0355
            L_0x034c:
                r0 = move-exception
                r30 = r11
                goto L_0x0355
            L_0x0350:
                r0 = move-exception
                r30 = r11
                r28 = r14
            L_0x0355:
                r20 = r30
                r14 = 1
                r21 = 0
                r33 = r8
                r8 = r7
                r7 = r33
                goto L_0x08aa
            L_0x0361:
                r0 = move-exception
                r28 = r14
                r14 = 1
            L_0x0365:
                r21 = 0
                r33 = r8
                r8 = r7
                r7 = r33
                goto L_0x0891
            L_0x036e:
                r28 = r14
                int r0 = r12.length()     // Catch:{ all -> 0x0880 }
                if (r0 <= 0) goto L_0x0391
                int r0 = r9.length()     // Catch:{ all -> 0x038e }
                if (r0 <= 0) goto L_0x0391
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f10283a     // Catch:{ all -> 0x038e }
                r0.ServerIp = r12     // Catch:{ all -> 0x038e }
                r0.ServerHostname = r9     // Catch:{ all -> 0x038e }
                r14 = 0
                r0.DurationDNS = r14     // Catch:{ all -> 0x038e }
                int r4 = r4 + -1
                r9 = r5
                r12 = r9
            L_0x038a:
                r11 = r25
                r14 = 0
                goto L_0x03b4
            L_0x038e:
                r0 = move-exception
                r14 = 0
                goto L_0x0365
            L_0x0391:
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f10283a     // Catch:{ all -> 0x0880 }
                r0.ServerHostname = r9     // Catch:{ all -> 0x0880 }
                int r4 = r4 + -1
                com.startapp.t2 r9 = new com.startapp.t2     // Catch:{ all -> 0x0876 }
                r9.<init>()     // Catch:{ all -> 0x0876 }
                com.startapp.networkTest.results.ConnectivityTestResult r11 = r1.f10283a     // Catch:{ all -> 0x0876 }
                java.lang.String r11 = r11.ServerHostname     // Catch:{ all -> 0x0876 }
                r14 = 30000(0x7530, float:4.2039E-41)
                java.lang.String r9 = r9.a((java.lang.String) r11, (int) r14)     // Catch:{ all -> 0x0876 }
                r0.ServerIp = r9     // Catch:{ all -> 0x0876 }
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f10283a     // Catch:{ all -> 0x0876 }
                long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0876 }
                long r14 = r14 - r26
                r0.DurationDNS = r14     // Catch:{ all -> 0x0876 }
                r9 = r5
                goto L_0x038a
            L_0x03b4:
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f10283a     // Catch:{ all -> 0x0867 }
                r25 = r14
                long r14 = r0.DurationDNS     // Catch:{ all -> 0x0858 }
                r26 = 30000(0x7530, double:1.4822E-319)
                int r30 = (r14 > r26 ? 1 : (r14 == r26 ? 0 : -1))
                if (r30 > 0) goto L_0x083a
                java.lang.String r0 = r0.ServerIp     // Catch:{ all -> 0x0858 }
                r10.ServerIp = r0     // Catch:{ all -> 0x0858 }
                r10.DurationDNS = r14     // Catch:{ all -> 0x0858 }
                int r0 = r11.DNSSuccess     // Catch:{ all -> 0x0858 }
                r14 = 1
                int r0 = r0 + r14
                r11.DNSSuccess = r0     // Catch:{ all -> 0x0858 }
                int r17 = r17 + 1
                r0 = 30000(0x7530, float:4.2039E-41)
                javax.net.SocketFactory r14 = android.net.SSLCertificateSocketFactory.getDefault(r0)     // Catch:{ all -> 0x0858 }
                android.net.SSLCertificateSocketFactory r14 = (android.net.SSLCertificateSocketFactory) r14     // Catch:{ all -> 0x0858 }
                r15 = 1
                javax.net.ssl.TrustManager[] r0 = new javax.net.ssl.TrustManager[r15]     // Catch:{ all -> 0x0829 }
                r21 = 0
                r0[r21] = r13     // Catch:{ all -> 0x0823 }
                r14.setTrustManagers(r0)     // Catch:{ all -> 0x0823 }
                java.net.InetSocketAddress r0 = new java.net.InetSocketAddress     // Catch:{ all -> 0x0823 }
                com.startapp.networkTest.results.ConnectivityTestResult r15 = r1.f10283a     // Catch:{ all -> 0x0823 }
                java.lang.String r15 = r15.ServerIp     // Catch:{ all -> 0x0823 }
                r26 = r4
                r4 = 443(0x1bb, float:6.21E-43)
                r0.<init>(r15, r4)     // Catch:{ all -> 0x0814 }
                java.net.Socket r4 = r14.createSocket()     // Catch:{ all -> 0x0814 }
                javax.net.ssl.SSLSocket r4 = (javax.net.ssl.SSLSocket) r4     // Catch:{ all -> 0x0814 }
                long r18 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0809 }
                r15 = 30000(0x7530, float:4.2039E-41)
                r4.connect(r0, r15)     // Catch:{ all -> 0x0809 }
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f10283a     // Catch:{ all -> 0x0809 }
                long r30 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0809 }
                r20 = r14
                long r14 = r30 - r18
                r0.DurationTcpConnect = r14     // Catch:{ all -> 0x0807 }
                int r0 = r11.TCPSuccess     // Catch:{ all -> 0x0807 }
                r14 = 1
                int r0 = r0 + r14
                r11.TCPSuccess = r0     // Catch:{ all -> 0x0807 }
                r27 = r7
                r9 = r16
                r12 = r17
                r0 = r20
                r14 = r28
                r16 = 1
                r17 = 1
                r7 = r4
                r4 = r11
                r10 = r23
            L_0x0420:
                if (r17 == 0) goto L_0x071d
                long r18 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x06d1 }
                r20 = r12
                com.startapp.networkTest.results.ConnectivityTestResult r12 = r1.f10283a     // Catch:{ Exception -> 0x06c6 }
                java.lang.String r12 = r12.ServerHostname     // Catch:{ Exception -> 0x06c6 }
                r0.setHostname(r7, r12)     // Catch:{ Exception -> 0x06c6 }
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f10283a     // Catch:{ all -> 0x0476 }
                java.lang.String r0 = r0.ServerHostname     // Catch:{ all -> 0x0476 }
                javax.net.ssl.SSLSession r12 = r7.getSession()     // Catch:{ all -> 0x0476 }
                boolean r0 = r3.verify(r0, r12)     // Catch:{ all -> 0x0476 }
                if (r0 != 0) goto L_0x0471
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0476 }
                r0.<init>()     // Catch:{ all -> 0x0476 }
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f10283a     // Catch:{ all -> 0x0476 }
                java.lang.String r12 = r3.SslException     // Catch:{ all -> 0x0476 }
                r0.append(r12)     // Catch:{ all -> 0x0476 }
                java.lang.String r12 = "Expected "
                r0.append(r12)     // Catch:{ all -> 0x0476 }
                com.startapp.networkTest.results.ConnectivityTestResult r12 = r1.f10283a     // Catch:{ all -> 0x0476 }
                java.lang.String r12 = r12.ServerHostname     // Catch:{ all -> 0x0476 }
                r0.append(r12)     // Catch:{ all -> 0x0476 }
                java.lang.String r12 = " found "
                r0.append(r12)     // Catch:{ all -> 0x0476 }
                javax.net.ssl.SSLSession r12 = r7.getSession()     // Catch:{ all -> 0x0476 }
                java.security.Principal r12 = r12.getPeerPrincipal()     // Catch:{ all -> 0x0476 }
                r0.append(r12)     // Catch:{ all -> 0x0476 }
                r0.append(r6)     // Catch:{ all -> 0x0476 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0476 }
                r3.SslException = r0     // Catch:{ all -> 0x0476 }
                r17 = r9
                goto L_0x049d
            L_0x0471:
                r3 = r17
                r17 = r9
                goto L_0x049e
            L_0x0476:
                r0 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x06c6 }
                r3.<init>()     // Catch:{ Exception -> 0x06c6 }
                com.startapp.networkTest.results.ConnectivityTestResult r12 = r1.f10283a     // Catch:{ Exception -> 0x06c6 }
                r17 = r9
                java.lang.String r9 = r12.SslException     // Catch:{ Exception -> 0x06c2 }
                r3.append(r9)     // Catch:{ Exception -> 0x06c2 }
                java.lang.String r9 = "Cannot validate hostname: "
                r3.append(r9)     // Catch:{ Exception -> 0x06c2 }
                java.lang.String r9 = r0.getMessage()     // Catch:{ Exception -> 0x06c2 }
                r3.append(r9)     // Catch:{ Exception -> 0x06c2 }
                r3.append(r6)     // Catch:{ Exception -> 0x06c2 }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x06c2 }
                r12.SslException = r3     // Catch:{ Exception -> 0x06c2 }
                com.startapp.x2.a((java.lang.Throwable) r0)     // Catch:{ Exception -> 0x06c2 }
            L_0x049d:
                r3 = 0
            L_0x049e:
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f10283a     // Catch:{ Exception -> 0x06c2 }
                long r23 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x06c2 }
                r30 = r8
                long r8 = r23 - r18
                r0.DurationSSL = r8     // Catch:{ Exception -> 0x06c0 }
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f10283a     // Catch:{ Exception -> 0x06b6 }
                com.startapp.networkTest.enums.CtTestTypes r8 = r13.b()     // Catch:{ Exception -> 0x06b6 }
                r0.TestType = r8     // Catch:{ Exception -> 0x06b6 }
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f10283a     // Catch:{ Exception -> 0x06b6 }
                com.startapp.networkTest.enums.CtTestTypes r0 = r0.TestType     // Catch:{ Exception -> 0x06b6 }
                com.startapp.networkTest.enums.CtTestTypes r8 = com.startapp.networkTest.enums.CtTestTypes.SSLOwnTs     // Catch:{ Exception -> 0x06b6 }
                boolean r0 = r0.equals(r8)     // Catch:{ Exception -> 0x06b6 }
                if (r0 != 0) goto L_0x04e1
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x06b6 }
                r0.<init>()     // Catch:{ Exception -> 0x06b6 }
                com.startapp.networkTest.results.ConnectivityTestResult r8 = r1.f10283a     // Catch:{ Exception -> 0x06b6 }
                java.lang.String r9 = r8.SslException     // Catch:{ Exception -> 0x06b6 }
                r0.append(r9)     // Catch:{ Exception -> 0x06b6 }
                java.lang.String r9 = "We couldn't use our own truststore, used: "
                r0.append(r9)     // Catch:{ Exception -> 0x06b6 }
                com.startapp.networkTest.results.ConnectivityTestResult r9 = r1.f10283a     // Catch:{ Exception -> 0x06b6 }
                com.startapp.networkTest.enums.CtTestTypes r9 = r9.TestType     // Catch:{ Exception -> 0x06b6 }
                r0.append(r9)     // Catch:{ Exception -> 0x06b6 }
                r0.append(r6)     // Catch:{ Exception -> 0x06b6 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x06b6 }
                r8.SslException = r0     // Catch:{ Exception -> 0x06b6 }
                r0 = 0
                goto L_0x04e2
            L_0x04e1:
                r0 = r3
            L_0x04e2:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x06b6 }
                r8.<init>()     // Catch:{ Exception -> 0x06b6 }
                com.startapp.networkTest.results.ConnectivityTestResult r9 = r1.f10283a     // Catch:{ Exception -> 0x06b6 }
                java.lang.String r12 = r9.SslException     // Catch:{ Exception -> 0x06b6 }
                r8.append(r12)     // Catch:{ Exception -> 0x06b6 }
                java.lang.String r12 = r13.a()     // Catch:{ Exception -> 0x06b6 }
                r8.append(r12)     // Catch:{ Exception -> 0x06b6 }
                r8.append(r6)     // Catch:{ Exception -> 0x06b6 }
                java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x06b6 }
                r9.SslException = r8     // Catch:{ Exception -> 0x06b6 }
                r8 = 2048(0x800, float:2.87E-42)
                byte[] r8 = new byte[r8]     // Catch:{ Exception -> 0x06ae }
                java.io.PrintWriter r9 = new java.io.PrintWriter     // Catch:{ Exception -> 0x06ae }
                java.io.OutputStream r12 = r7.getOutputStream()     // Catch:{ Exception -> 0x06ae }
                r9.<init>(r12)     // Catch:{ Exception -> 0x06ae }
                long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x06ae }
                r18 = r0
                java.lang.String r0 = "GET "
                r9.print(r0)     // Catch:{ Exception -> 0x06ae }
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f10283a     // Catch:{ Exception -> 0x06ae }
                java.lang.String r0 = r0.ServerFilename     // Catch:{ Exception -> 0x06ae }
                r9.print(r0)     // Catch:{ Exception -> 0x06ae }
                java.lang.String r0 = " HTTP/1.1"
                r9.print(r0)     // Catch:{ Exception -> 0x06ae }
                r9.print(r2)     // Catch:{ Exception -> 0x06ae }
                java.lang.String r0 = "HOST: "
                r9.print(r0)     // Catch:{ Exception -> 0x06ae }
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f10283a     // Catch:{ Exception -> 0x06ae }
                java.lang.String r0 = r0.ServerHostname     // Catch:{ Exception -> 0x06ae }
                r9.print(r0)     // Catch:{ Exception -> 0x06ae }
                r9.print(r2)     // Catch:{ Exception -> 0x06ae }
                java.lang.String r0 = "Connection: close"
                r9.print(r0)     // Catch:{ Exception -> 0x06ae }
                r9.print(r2)     // Catch:{ Exception -> 0x06ae }
                r9.print(r2)     // Catch:{ Exception -> 0x06ae }
                r9.print(r2)     // Catch:{ Exception -> 0x06ae }
                r9.flush()     // Catch:{ Exception -> 0x06ae }
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f10283a     // Catch:{ Exception -> 0x06ae }
                long r23 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x06ae }
                long r12 = r23 - r12
                r0.DurationHttpGetCommand = r12     // Catch:{ Exception -> 0x06ae }
                long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x06ae }
                r23 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                java.io.InputStream r2 = r7.getInputStream()     // Catch:{ Exception -> 0x06ae }
                r9 = -1
                r25 = 0
            L_0x055f:
                com.startapp.d2$b$e r0 = r1.a((java.io.InputStream) r2)     // Catch:{ all -> 0x0691 }
                if (r0 == 0) goto L_0x0627
                r28 = r3
                int r3 = r0.f10290a     // Catch:{ all -> 0x0624 }
                r31 = r10
                long r10 = (long) r3
                long r25 = r25 + r10
                java.lang.String r3 = r0.f10291b     // Catch:{ all -> 0x0621 }
                java.lang.String r3 = r3.toUpperCase()     // Catch:{ all -> 0x0621 }
                java.lang.String r10 = "HTTP"
                boolean r10 = r3.startsWith(r10)     // Catch:{ all -> 0x0621 }
                if (r10 == 0) goto L_0x05bd
                java.lang.String r0 = " "
                java.lang.String[] r0 = r3.split(r0)     // Catch:{ all -> 0x0621 }
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f10283a     // Catch:{ all -> 0x0621 }
                r10 = 1
                r0 = r0[r10]     // Catch:{ all -> 0x0621 }
                int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0621 }
                r3.HTTPStatus = r0     // Catch:{ all -> 0x0621 }
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f10283a     // Catch:{ all -> 0x0621 }
                int r0 = r0.HTTPStatus     // Catch:{ all -> 0x0621 }
                r3 = 200(0xc8, float:2.8E-43)
                if (r0 == r3) goto L_0x061b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0621 }
                r0.<init>()     // Catch:{ all -> 0x0621 }
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f10283a     // Catch:{ all -> 0x0621 }
                java.lang.String r10 = r3.ErrorReason     // Catch:{ all -> 0x0621 }
                r0.append(r10)     // Catch:{ all -> 0x0621 }
                java.lang.String r10 = "Request failed! Unexcepted HTTP code: "
                r0.append(r10)     // Catch:{ all -> 0x0621 }
                com.startapp.networkTest.results.ConnectivityTestResult r10 = r1.f10283a     // Catch:{ all -> 0x0621 }
                int r10 = r10.HTTPStatus     // Catch:{ all -> 0x0621 }
                r0.append(r10)     // Catch:{ all -> 0x0621 }
                r0.append(r6)     // Catch:{ all -> 0x0621 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0621 }
                r3.ErrorReason = r0     // Catch:{ all -> 0x0621 }
                r3 = r28
                r10 = r31
                r18 = 0
                goto L_0x055f
            L_0x05bd:
                java.lang.String r10 = "CONTENT-LENGTH:"
                boolean r10 = r3.startsWith(r10)     // Catch:{ all -> 0x0621 }
                r11 = 15
                if (r10 == 0) goto L_0x05d9
                java.lang.String r0 = r3.substring(r11)     // Catch:{ all -> 0x05d4 }
                java.lang.String r0 = r0.trim()     // Catch:{ all -> 0x05d4 }
                int r9 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x05d4 }
                goto L_0x061b
            L_0x05d4:
                r0 = move-exception
                com.startapp.x2.b(r0)     // Catch:{ all -> 0x0621 }
                goto L_0x061b
            L_0x05d9:
                java.lang.String r10 = "X-AMZ-CF-ID:"
                boolean r10 = r3.startsWith(r10)     // Catch:{ all -> 0x0621 }
                if (r10 == 0) goto L_0x05f0
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f10283a     // Catch:{ all -> 0x0621 }
                java.lang.String r0 = r0.f10291b     // Catch:{ all -> 0x0621 }
                java.lang.String r0 = r0.substring(r11)     // Catch:{ all -> 0x0621 }
                java.lang.String r0 = r0.trim()     // Catch:{ all -> 0x0621 }
                r3.AmazonId = r0     // Catch:{ all -> 0x0621 }
                goto L_0x061b
            L_0x05f0:
                boolean r10 = r0.f10292c     // Catch:{ all -> 0x0621 }
                if (r10 != 0) goto L_0x062b
                boolean r10 = r3.equals(r5)     // Catch:{ all -> 0x0621 }
                if (r10 == 0) goto L_0x05fb
                goto L_0x062b
            L_0x05fb:
                java.lang.String r10 = "X-AMZ-CF-POP:"
                boolean r3 = r3.startsWith(r10)     // Catch:{ all -> 0x0621 }
                if (r3 == 0) goto L_0x061b
                com.startapp.networkTest.results.ConnectivityTestResult r3 = r1.f10283a     // Catch:{ all -> 0x0621 }
                java.lang.String r0 = r0.f10291b     // Catch:{ all -> 0x0621 }
                java.lang.String r0 = r0.toLowerCase()     // Catch:{ all -> 0x0621 }
                r10 = 13
                java.lang.String r0 = r0.substring(r10)     // Catch:{ all -> 0x0621 }
                java.lang.String r0 = r0.trim()     // Catch:{ all -> 0x0621 }
                java.lang.String r0 = com.startapp.s9.b(r0)     // Catch:{ all -> 0x0621 }
                r3.AirportCode = r0     // Catch:{ all -> 0x0621 }
            L_0x061b:
                r3 = r28
                r10 = r31
                goto L_0x055f
            L_0x0621:
                r0 = move-exception
                goto L_0x0696
            L_0x0624:
                r0 = move-exception
                goto L_0x0694
            L_0x0627:
                r28 = r3
                r31 = r10
            L_0x062b:
                r10 = r25
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f10283a     // Catch:{ all -> 0x068e }
                r0.HeaderBytesRead = r10     // Catch:{ all -> 0x068e }
                r3 = -1
                if (r9 == r3) goto L_0x063b
                int r0 = (int) r10
                int r0 = r0 + r9
                r9 = r4
                long r3 = (long) r0
                r23 = r3
                goto L_0x063c
            L_0x063b:
                r9 = r4
            L_0x063c:
                r25 = r10
            L_0x063e:
                int r0 = r2.read(r8)     // Catch:{ all -> 0x0621 }
                r3 = -1
                if (r0 != r3) goto L_0x0652
                int r0 = (r25 > r23 ? 1 : (r25 == r23 ? 0 : -1))
                if (r0 < 0) goto L_0x064a
                goto L_0x065c
            L_0x064a:
                java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0621 }
                java.lang.String r2 = "Could not read all bytes"
                r0.<init>(r2)     // Catch:{ all -> 0x0621 }
                throw r0     // Catch:{ all -> 0x0621 }
            L_0x0652:
                long r4 = (long) r0
                long r25 = r25 + r4
                int r4 = (r25 > r23 ? 1 : (r25 == r23 ? 0 : -1))
                if (r4 < 0) goto L_0x065a
                goto L_0x065c
            L_0x065a:
                if (r0 > 0) goto L_0x063e
            L_0x065c:
                r2 = r25
                if (r18 == 0) goto L_0x066d
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f10283a     // Catch:{ all -> 0x066b }
                r4 = 1
                r0.Success = r4     // Catch:{ all -> 0x066b }
                int r0 = r9.successfulTests     // Catch:{ all -> 0x066b }
                int r0 = r0 + r4
                r9.successfulTests = r0     // Catch:{ all -> 0x066b }
                goto L_0x066d
            L_0x066b:
                r0 = move-exception
                goto L_0x0698
            L_0x066d:
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x0680
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f10283a     // Catch:{ Exception -> 0x06ac }
                long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x06ac }
                long r4 = r4 - r12
                r0.DurationHttpReceive = r4     // Catch:{ Exception -> 0x06ac }
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f10283a     // Catch:{ Exception -> 0x06ac }
                r0.BytesRead = r2     // Catch:{ Exception -> 0x06ac }
            L_0x0680:
                r7.close()     // Catch:{ all -> 0x0684 }
                goto L_0x0689
            L_0x0684:
                r0 = move-exception
                r2 = r0
                com.startapp.x2.a((java.lang.Throwable) r2)
            L_0x0689:
                r0 = r28
                r6 = 1
                goto L_0x0727
            L_0x068e:
                r0 = move-exception
                r2 = r10
                goto L_0x0698
            L_0x0691:
                r0 = move-exception
                r28 = r3
            L_0x0694:
                r31 = r10
            L_0x0696:
                r2 = r25
            L_0x0698:
                r4 = 0
                int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r8 <= 0) goto L_0x06ab
                com.startapp.networkTest.results.ConnectivityTestResult r4 = r1.f10283a     // Catch:{ Exception -> 0x06ac }
                long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x06ac }
                long r8 = r8 - r12
                r4.DurationHttpReceive = r8     // Catch:{ Exception -> 0x06ac }
                com.startapp.networkTest.results.ConnectivityTestResult r4 = r1.f10283a     // Catch:{ Exception -> 0x06ac }
                r4.BytesRead = r2     // Catch:{ Exception -> 0x06ac }
            L_0x06ab:
                throw r0     // Catch:{ Exception -> 0x06ac }
            L_0x06ac:
                r0 = move-exception
                goto L_0x06b3
            L_0x06ae:
                r0 = move-exception
                r28 = r3
                r31 = r10
            L_0x06b3:
                r22 = 1
                goto L_0x06bd
            L_0x06b6:
                r0 = move-exception
                r28 = r3
                r31 = r10
                r22 = 0
            L_0x06bd:
                r21 = r22
                goto L_0x06dc
            L_0x06c0:
                r0 = move-exception
                goto L_0x06cb
            L_0x06c2:
                r0 = move-exception
                r30 = r8
                goto L_0x06cb
            L_0x06c6:
                r0 = move-exception
                r30 = r8
                r17 = r9
            L_0x06cb:
                r31 = r10
                goto L_0x06da
            L_0x06ce:
                r0 = move-exception
                r2 = r0
                goto L_0x0711
            L_0x06d1:
                r0 = move-exception
                r30 = r8
                r17 = r9
                r31 = r10
                r20 = r12
            L_0x06da:
                r28 = 0
            L_0x06dc:
                com.startapp.d2 r2 = com.startapp.d2.this     // Catch:{ all -> 0x06ce }
                java.lang.String r3 = r0.toString()     // Catch:{ all -> 0x06ce }
                java.lang.String r2 = r2.a((java.lang.String) r3)     // Catch:{ all -> 0x06ce }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x06ce }
                r3.<init>()     // Catch:{ all -> 0x06ce }
                com.startapp.networkTest.results.ConnectivityTestResult r4 = r1.f10283a     // Catch:{ all -> 0x06ce }
                java.lang.String r5 = r4.ErrorReason     // Catch:{ all -> 0x06ce }
                r3.append(r5)     // Catch:{ all -> 0x06ce }
                r3.append(r2)     // Catch:{ all -> 0x06ce }
                r3.append(r6)     // Catch:{ all -> 0x06ce }
                java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x06ce }
                r4.ErrorReason = r2     // Catch:{ all -> 0x06ce }
                com.startapp.x2.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x06ce }
                if (r7 == 0) goto L_0x070c
                r7.close()     // Catch:{ all -> 0x0707 }
                goto L_0x070c
            L_0x0707:
                r0 = move-exception
                r2 = r0
                com.startapp.x2.a((java.lang.Throwable) r2)
            L_0x070c:
                r6 = r21
                r0 = r28
                goto L_0x0727
            L_0x0711:
                if (r7 == 0) goto L_0x071c
                r7.close()     // Catch:{ all -> 0x0717 }
                goto L_0x071c
            L_0x0717:
                r0 = move-exception
                r3 = r0
                com.startapp.x2.a((java.lang.Throwable) r3)
            L_0x071c:
                throw r2
            L_0x071d:
                r30 = r8
                r17 = r9
                r31 = r10
                r20 = r12
                r0 = 0
                r6 = 0
            L_0x0727:
                if (r6 == 0) goto L_0x0761
                com.startapp.networkTest.results.ConnectivityTestResult r2 = r1.f10283a
                com.startapp.networkTest.data.RadioInfo r3 = r2.RadioInfo
                com.startapp.networkTest.enums.ConnectionTypes r3 = r3.ConnectionType
                com.startapp.networkTest.enums.ConnectionTypes r4 = com.startapp.networkTest.enums.ConnectionTypes.WiFi
                if (r3 != r4) goto L_0x0742
                com.startapp.g3 r3 = com.startapp.g3.a()
                com.startapp.networkTest.results.ConnectivityTestResult r4 = r1.f10283a
                com.startapp.networkTest.data.WifiInfo r4 = r4.WifiInfo
                com.startapp.networkTest.data.IspInfo r3 = r3.a(r4)
                r2.IspInfo = r3
                goto L_0x0761
            L_0x0742:
                com.startapp.y4 r2 = com.startapp.a5.b()
                boolean r2 = r2.GEOIP_MOBILE_ENABLED()
                if (r2 == 0) goto L_0x0761
                com.startapp.networkTest.results.ConnectivityTestResult r2 = r1.f10283a
                com.startapp.networkTest.data.RadioInfo r3 = r2.RadioInfo
                com.startapp.networkTest.enums.ConnectionTypes r3 = r3.ConnectionType
                com.startapp.networkTest.enums.ConnectionTypes r4 = com.startapp.networkTest.enums.ConnectionTypes.Mobile
                if (r3 != r4) goto L_0x0761
                com.startapp.g3 r3 = com.startapp.g3.a()
                r4 = 0
                com.startapp.networkTest.data.IspInfo r3 = r3.a(r4)
                r2.IspInfo = r3
            L_0x0761:
                com.startapp.networkTest.results.ConnectivityTestResult r2 = r1.f10283a
                com.startapp.d2 r3 = com.startapp.d2.this
                com.startapp.j8 r3 = r3.f10270b
                com.startapp.networkTest.data.RadioInfo r3 = r3.h()
                r2.RadioInfoOnEnd = r3
                com.startapp.networkTest.results.ConnectivityTestResult r2 = r1.f10283a
                long r3 = android.os.SystemClock.uptimeMillis()
                long r3 = r3 - r14
                r2.DurationOverallNoSleep = r3
                com.startapp.networkTest.results.ConnectivityTestResult r2 = r1.f10283a
                long r3 = android.os.SystemClock.elapsedRealtime()
                long r3 = r3 - r31
                r2.DurationOverall = r3
                com.startapp.networkTest.results.ConnectivityTestResult r2 = r1.f10283a
                com.startapp.d2 r3 = com.startapp.d2.this
                android.content.Context r3 = r3.f10269a
                com.startapp.networkTest.enums.IdleStates r3 = com.startapp.p2.d(r3)
                r2.IdleStateOnEnd = r3
                com.startapp.networkTest.results.ConnectivityTestResult r2 = r1.f10283a
                java.util.ArrayList r3 = new java.util.ArrayList
                r7 = r30
                r3.<init>(r7)
                r2.MultiCdnInfo = r3
                com.startapp.networkTest.results.ConnectivityTestResult r2 = r1.f10283a
                r3 = r17
                long r3 = (long) r3
                r5 = r20
                long r5 = (long) r5
                r7 = 4611686018427387904(0x4000000000000000, double:2.0)
                r9 = 4621819117588971520(0x4024000000000000, double:10.0)
                double r7 = java.lang.Math.pow(r9, r7)
                long r7 = java.lang.Math.round(r7)
                long r7 = r7 * r5
                long r7 = r7 + r3
                r3 = r16
                long r3 = (long) r3
                r5 = 4616189618054758400(0x4010000000000000, double:4.0)
                double r5 = java.lang.Math.pow(r9, r5)
                long r5 = java.lang.Math.round(r5)
                long r5 = r5 * r3
                long r5 = r5 + r7
                long r3 = (long) r0
                r7 = 4618441417868443648(0x4018000000000000, double:6.0)
                double r7 = java.lang.Math.pow(r9, r7)
                long r7 = java.lang.Math.round(r7)
                long r7 = r7 * r3
                long r7 = r7 + r5
                r2.ServerMultiSuccess = r7
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f10283a
                java.lang.String r0 = r0.AirportCode
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x07e6
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f10283a
                java.lang.String r2 = r0.ServerIp
                java.lang.String r2 = com.startapp.s9.a(r2)
                r0.AirportCode = r2
            L_0x07e6:
                int r0 = r27.size()
                if (r0 <= 0) goto L_0x07f1
                r8 = r27
                r1.a((java.util.List<com.startapp.h2>) r8)
            L_0x07f1:
                com.startapp.y4 r0 = com.startapp.a5.b()
                boolean r0 = r0.CLEAR_CT_LOCATION_INFO()
                if (r0 == 0) goto L_0x0804
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f10283a
                com.startapp.networkTest.data.LocationInfo r2 = new com.startapp.networkTest.data.LocationInfo
                r2.<init>()
                r0.LocationInfo = r2
            L_0x0804:
                com.startapp.networkTest.results.ConnectivityTestResult r0 = r1.f10283a
                return r0
            L_0x0807:
                r0 = move-exception
                goto L_0x080c
            L_0x0809:
                r0 = move-exception
                r20 = r14
            L_0x080c:
                r33 = r8
                r8 = r7
                r7 = r33
                r18 = r4
                goto L_0x081c
            L_0x0814:
                r0 = move-exception
                r20 = r14
                r33 = r8
                r8 = r7
                r7 = r33
            L_0x081c:
                r19 = r20
                r14 = r25
                r4 = r26
                goto L_0x0873
            L_0x0823:
                r0 = move-exception
                r26 = r4
                r20 = r14
                goto L_0x0830
            L_0x0829:
                r0 = move-exception
                r26 = r4
                r20 = r14
                r21 = 0
            L_0x0830:
                r33 = r8
                r8 = r7
                r7 = r33
                r19 = r20
                r14 = r25
                goto L_0x0873
            L_0x083a:
                r26 = r4
                r21 = 0
                r33 = r8
                r8 = r7
                r7 = r33
                r4 = -1
                r0.DurationDNS = r4     // Catch:{ all -> 0x084f }
                java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException     // Catch:{ all -> 0x084f }
                java.lang.String r4 = "DNS Timeout"
                r0.<init>(r4)     // Catch:{ all -> 0x084f }
                throw r0     // Catch:{ all -> 0x084f }
            L_0x084f:
                r0 = move-exception
                r20 = r11
                r14 = r25
                r4 = r26
                goto L_0x08aa
            L_0x0858:
                r0 = move-exception
                r26 = r4
                r21 = 0
                r33 = r8
                r8 = r7
                r7 = r33
                r20 = r11
                r14 = r25
                goto L_0x08aa
            L_0x0867:
                r0 = move-exception
                r26 = r4
                r25 = r14
                r21 = 0
                r33 = r8
                r8 = r7
                r7 = r33
            L_0x0873:
                r20 = r11
                goto L_0x08aa
            L_0x0876:
                r0 = move-exception
                r21 = 0
                r33 = r8
                r8 = r7
                r7 = r33
                r9 = r5
                goto L_0x0890
            L_0x0880:
                r0 = move-exception
                goto L_0x0889
            L_0x0882:
                r0 = move-exception
                goto L_0x0887
            L_0x0884:
                r0 = move-exception
                r25 = r11
            L_0x0887:
                r28 = r14
            L_0x0889:
                r21 = 0
                r33 = r8
                r8 = r7
                r7 = r33
            L_0x0890:
                r14 = 0
            L_0x0891:
                r20 = r25
                goto L_0x08aa
            L_0x0894:
                r0 = move-exception
                r28 = r14
                r21 = 0
                r33 = r8
                r8 = r7
                r7 = r33
                goto L_0x08a9
            L_0x089f:
                r0 = move-exception
                r21 = 0
                r33 = r8
                r8 = r7
                r7 = r33
                r28 = r14
            L_0x08a9:
                r14 = 0
            L_0x08aa:
                com.startapp.d2 r5 = com.startapp.d2.this     // Catch:{ all -> 0x08e4 }
                java.lang.String r11 = r0.toString()     // Catch:{ all -> 0x08e4 }
                java.lang.String r5 = r5.a((java.lang.String) r11)     // Catch:{ all -> 0x08e4 }
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x08e4 }
                r11.<init>()     // Catch:{ all -> 0x08e4 }
                com.startapp.networkTest.results.ConnectivityTestResult r15 = r1.f10283a     // Catch:{ all -> 0x08e4 }
                java.lang.String r1 = r15.ErrorReason     // Catch:{ all -> 0x08e4 }
                r11.append(r1)     // Catch:{ all -> 0x08e4 }
                r11.append(r5)     // Catch:{ all -> 0x08e4 }
                r11.append(r6)     // Catch:{ all -> 0x08e4 }
                java.lang.String r1 = r11.toString()     // Catch:{ all -> 0x08e4 }
                r15.ErrorReason = r1     // Catch:{ all -> 0x08e4 }
                com.startapp.x2.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x08e4 }
                if (r14 == 0) goto L_0x08d4
                r7.add(r10)
            L_0x08d4:
                r1 = 1
                int r4 = r4 + r1
                r1 = r37
                r10 = r23
                r14 = r28
                r5 = 1
                r33 = r8
                r8 = r7
                r7 = r33
                goto L_0x029f
            L_0x08e4:
                r0 = move-exception
                if (r14 == 0) goto L_0x08ea
                r7.add(r10)
            L_0x08ea:
                throw r0
            L_0x08eb:
                r1 = r4
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.d2.b.doInBackground(java.lang.Void[]):com.startapp.networkTest.results.ConnectivityTestResult");
        }

        /* renamed from: a */
        public void onPostExecute(ConnectivityTestResult connectivityTestResult) {
            d2.this.f10273e.f(SystemClock.elapsedRealtime());
            if (d2.this.f10274f != null) {
                d2.this.f10274f.onConnectivityTestResult(connectivityTestResult);
            }
            if (connectivityTestResult != null) {
                boolean z10 = false;
                if (d2.this.f10273e.m() && connectivityTestResult.ServerIp.length() > 0) {
                    k0 k0Var = new k0(this, d2.this.f10269a);
                    this.f10284b = k0Var;
                    k0Var.g(connectivityTestResult.CtId);
                    this.f10284b.b(connectivityTestResult.AirportCode);
                    this.f10284b.e(String.valueOf(connectivityTestResult.TimeInfo.TimestampMillis + connectivityTestResult.DurationDNS + connectivityTestResult.DurationTcpConnect + connectivityTestResult.DurationHttpReceive));
                    this.f10284b.a(a5.b().LTR_LOCATIONPROVIDER());
                    this.f10284b.a(connectivityTestResult.ServerIp, 10, 200, d2.f10267p, 56, true);
                    z10 = true;
                }
                if (!z10 && d2.this.f10274f != null) {
                    d2.this.f10274f.a();
                }
            } else if (d2.this.f10274f != null) {
                d2.this.f10274f.a();
            }
        }

        public void a(SpeedtestEngineStatus speedtestEngineStatus, SpeedtestEngineError speedtestEngineError, long j10) {
            if (speedtestEngineStatus == SpeedtestEngineStatus.END || speedtestEngineStatus == SpeedtestEngineStatus.ABORTED) {
                this.f10284b.c();
                if (d2.this.f10274f != null) {
                    d2.this.f10274f.onLatencyTestResult((LatencyResult) this.f10284b.a());
                    d2.this.f10274f.a();
                }
            }
        }

        private List<h2> a(String[] strArr, CtCriteriaTypes ctCriteriaTypes) {
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            Set<String> f10 = a5.c().f();
            LinkedList<h2> linkedList3 = new LinkedList<>();
            if (f10 != null) {
                for (String a10 : f10) {
                    h2 h2Var = (h2) r5.a(a10, h2.class);
                    if (h2Var != null) {
                        linkedList3.add(h2Var);
                    }
                }
            }
            for (String str : strArr) {
                h2 h2Var2 = new h2();
                h2Var2.address = str;
                linkedList2.add(h2Var2);
            }
            for (h2 h2Var3 : linkedList3) {
                for (int i10 = 0; i10 < linkedList2.size(); i10++) {
                    if (((h2) linkedList2.get(i10)).address.equals(h2Var3.address)) {
                        linkedList2.set(i10, h2Var3);
                    }
                }
            }
            switch (a.f10282a[ctCriteriaTypes.ordinal()]) {
                case 1:
                    return linkedList2;
                case 2:
                    Collections.shuffle(linkedList2, new Random(System.nanoTime()));
                    return new LinkedList(linkedList2);
                case 3:
                    Collections.sort(linkedList2, new a());
                    return new LinkedList(linkedList2);
                case 4:
                    Collections.sort(linkedList2, new C0114b());
                    return new LinkedList(linkedList2);
                case 5:
                    Collections.sort(linkedList2, new c());
                    return new LinkedList(linkedList2);
                case 6:
                    Collections.sort(linkedList2, new d());
                    return new LinkedList(linkedList2);
                default:
                    return linkedList;
            }
        }

        private void a(List<h2> list) {
            HashSet hashSet = new HashSet();
            for (h2 h2Var : list) {
                hashSet.add(h2Var.toString());
            }
            a5.c().a((Set<String>) hashSet);
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x004a A[SYNTHETIC, Splitter:B:25:0x004a] */
        /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean a() {
            /*
                r4 = this;
                java.lang.String r0 = "ping -W 3 -c 1 -s 56 127.0.0.1"
                r1 = 0
                java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x0044 }
                java.lang.Process r0 = r2.exec(r0)     // Catch:{ all -> 0x0044 }
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0044 }
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0044 }
                java.io.InputStream r0 = r0.getInputStream()     // Catch:{ all -> 0x0044 }
                r3.<init>(r0)     // Catch:{ all -> 0x0044 }
                r2.<init>(r3)     // Catch:{ all -> 0x0044 }
                r2.readLine()     // Catch:{ all -> 0x0041 }
                java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x0041 }
                if (r0 == 0) goto L_0x003d
                int r1 = r0.length()     // Catch:{ all -> 0x0041 }
                if (r1 <= 0) goto L_0x003d
                java.lang.String r1 = " "
                java.lang.String[] r0 = r0.split(r1)     // Catch:{ all -> 0x0041 }
                int r0 = r0.length     // Catch:{ all -> 0x0041 }
                r1 = 8
                if (r0 != r1) goto L_0x003d
                r0 = 1
                r2.close()     // Catch:{ all -> 0x0038 }
                goto L_0x003c
            L_0x0038:
                r1 = move-exception
                com.startapp.x2.b(r1)
            L_0x003c:
                return r0
            L_0x003d:
                r2.close()     // Catch:{ all -> 0x004e }
                goto L_0x0052
            L_0x0041:
                r0 = move-exception
                r1 = r2
                goto L_0x0045
            L_0x0044:
                r0 = move-exception
            L_0x0045:
                com.startapp.x2.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0054 }
                if (r1 == 0) goto L_0x0052
                r1.close()     // Catch:{ all -> 0x004e }
                goto L_0x0052
            L_0x004e:
                r0 = move-exception
                com.startapp.x2.b(r0)
            L_0x0052:
                r0 = 0
                return r0
            L_0x0054:
                r0 = move-exception
                if (r1 == 0) goto L_0x005f
                r1.close()     // Catch:{ all -> 0x005b }
                goto L_0x005f
            L_0x005b:
                r1 = move-exception
                com.startapp.x2.b(r1)
            L_0x005f:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.d2.b.a():boolean");
        }
    }

    public void a(w7 w7Var) {
        this.f10274f = w7Var;
        new b().executeOnExecutor(ThreadManager.b().a(), new Void[0]);
    }

    /* access modifiers changed from: private */
    public String a(String str) {
        return (str == null || str.isEmpty()) ? "" : str.replaceAll("(?:[0-9]{1,3}\\.){3}[0-9]{1,3}", "XXX").replaceAll("([A-Fa-f0-9]{1,4}::?){1,7}[A-Fa-f0-9]{1,4}", "XXX");
    }
}
