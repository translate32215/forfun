package com.startapp;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.CellIdentity;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import com.startapp.networkTest.data.RadioInfo;
import com.startapp.networkTest.data.radio.ApnInfo;
import com.startapp.networkTest.data.radio.NetworkRegistrationInfo;
import com.startapp.networkTest.enums.CellConnectionStatus;
import com.startapp.networkTest.enums.CellNetworkTypes;
import com.startapp.networkTest.enums.ConnectionTypes;
import com.startapp.networkTest.enums.DuplexMode;
import com.startapp.networkTest.enums.NetworkGenerations;
import com.startapp.networkTest.enums.NetworkTypes;
import com.startapp.networkTest.enums.PreferredNetworkTypes;
import com.startapp.networkTest.enums.ServiceStates;
import com.startapp.networkTest.enums.ThreeStateShort;
import com.startapp.networkTest.enums.radio.SignalStrengths;
import com.startapp.networkTest.enums.wifi.WifiDetailedStates;
import com.startapp.networkTest.threads.ThreadManager;
import com.startapp.networkTest.utils.LteFrequencyUtil;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;

/* compiled from: Sta */
public class j8 {
    private static final String S = "j8";
    private static final boolean T = false;
    private static final int U = 16;
    private static final int V = 17;
    private static final int W = 18;
    private static final int X = 19;
    /* access modifiers changed from: private */
    public Field A;
    /* access modifiers changed from: private */
    public Method B;
    /* access modifiers changed from: private */
    public Field C;
    private Field D;
    private Field E;
    private Field F;
    private Field G;
    private Method H;
    private Method I;
    private Method J;
    /* access modifiers changed from: private */
    public Method K;
    private Method L;
    private Method M;
    private Method N;
    private ContentResolver O;
    /* access modifiers changed from: private */
    public int[] P;
    public final List<k8> Q;
    /* access modifiers changed from: private */
    public boolean R;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f10606a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public TelephonyManager f10607b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public SparseArray<TelephonyManager> f10608c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Context f10609d;

    /* renamed from: e  reason: collision with root package name */
    private p f10610e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<p> f10611f;

    /* renamed from: g  reason: collision with root package name */
    private ConnectivityManager f10612g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public j f10613h;

    /* renamed from: i  reason: collision with root package name */
    private SubscriptionManager.OnSubscriptionsChangedListener f10614i;

    /* renamed from: j  reason: collision with root package name */
    private y6 f10615j;

    /* renamed from: k  reason: collision with root package name */
    private k f10616k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public List<CellInfo> f10617l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public Method f10618m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public Method f10619n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public Method f10620o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public Method f10621p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public Method f10622q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public Method f10623r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public Method f10624s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public Method f10625t;

    /* renamed from: u  reason: collision with root package name */
    private Method f10626u;

    /* renamed from: v  reason: collision with root package name */
    private Method f10627v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public Field f10628w;

    /* renamed from: x  reason: collision with root package name */
    private Field f10629x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public Field f10630y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public Field f10631z;

    /* compiled from: Sta */
    public class a extends SubscriptionManager.OnSubscriptionsChangedListener {
        public a() {
        }

        public void onSubscriptionsChanged() {
            super.onSubscriptionsChanged();
            if (!j8.this.R) {
                new i().executeOnExecutor(ThreadManager.b().c(), new Void[0]);
            }
        }
    }

    /* compiled from: Sta */
    public class b implements Callable<com.startapp.networkTest.data.radio.CellInfo[]> {
        public b() {
        }

        /* renamed from: a */
        public com.startapp.networkTest.data.radio.CellInfo[] call() {
            try {
                return j8.this.c();
            } catch (Throwable th) {
                x2.a(th);
                return new com.startapp.networkTest.data.radio.CellInfo[0];
            }
        }
    }

    /* compiled from: Sta */
    public class c implements Callable<ApnInfo[]> {
        public c() {
        }

        /* renamed from: a */
        public ApnInfo[] call() throws Exception {
            try {
                return j8.this.a();
            } catch (Throwable th) {
                x2.a(th);
                return new ApnInfo[0];
            }
        }
    }

    /* compiled from: Sta */
    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k8 f10635a;

        public d(k8 k8Var) {
            this.f10635a = k8Var;
        }

        public void run() {
            j8.this.a(this.f10635a);
        }
    }

    /* compiled from: Sta */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k8 f10637a;

        public e(k8 k8Var) {
            this.f10637a = k8Var;
        }

        public void run() {
            j8.this.b(this.f10637a);
        }
    }

    /* compiled from: Sta */
    public static /* synthetic */ class f {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10639a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f10640b;

        /* JADX WARNING: Can't wrap try/catch for region: R(52:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Can't wrap try/catch for region: R(53:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Can't wrap try/catch for region: R(54:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x009b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00a7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00b3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00bf */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00cb */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00d7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00e3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00ef */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00fb */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0107 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0113 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x011f */
        static {
            /*
                com.startapp.networkTest.enums.NetworkGenerations[] r0 = com.startapp.networkTest.enums.NetworkGenerations.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10640b = r0
                r1 = 1
                com.startapp.networkTest.enums.NetworkGenerations r2 = com.startapp.networkTest.enums.NetworkGenerations.Gen2     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f10640b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.networkTest.enums.NetworkGenerations r3 = com.startapp.networkTest.enums.NetworkGenerations.Gen3     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f10640b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.startapp.networkTest.enums.NetworkGenerations r4 = com.startapp.networkTest.enums.NetworkGenerations.Gen4     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f10640b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.startapp.networkTest.enums.NetworkGenerations r5 = com.startapp.networkTest.enums.NetworkGenerations.Gen5     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.startapp.networkTest.enums.NetworkTypes[] r4 = com.startapp.networkTest.enums.NetworkTypes.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f10639a = r4
                com.startapp.networkTest.enums.NetworkTypes r5 = com.startapp.networkTest.enums.NetworkTypes.GPRS     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f10639a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.startapp.networkTest.enums.NetworkTypes r4 = com.startapp.networkTest.enums.NetworkTypes.EDGE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f10639a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.GSM     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f10639a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.Cdma1xRTT     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f10639a     // Catch:{ NoSuchFieldError -> 0x006d }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.CDMA     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f10639a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.IDEN     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f10639a     // Catch:{ NoSuchFieldError -> 0x0083 }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.UMTS     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f10639a     // Catch:{ NoSuchFieldError -> 0x008f }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.EVDO_0     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = f10639a     // Catch:{ NoSuchFieldError -> 0x009b }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.EVDO_A     // Catch:{ NoSuchFieldError -> 0x009b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009b }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009b }
            L_0x009b:
                int[] r0 = f10639a     // Catch:{ NoSuchFieldError -> 0x00a7 }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.EVDO_B     // Catch:{ NoSuchFieldError -> 0x00a7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a7 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a7 }
            L_0x00a7:
                int[] r0 = f10639a     // Catch:{ NoSuchFieldError -> 0x00b3 }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.HSPA     // Catch:{ NoSuchFieldError -> 0x00b3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b3 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b3 }
            L_0x00b3:
                int[] r0 = f10639a     // Catch:{ NoSuchFieldError -> 0x00bf }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.HSDPA     // Catch:{ NoSuchFieldError -> 0x00bf }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bf }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00bf }
            L_0x00bf:
                int[] r0 = f10639a     // Catch:{ NoSuchFieldError -> 0x00cb }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.HSPAP     // Catch:{ NoSuchFieldError -> 0x00cb }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cb }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cb }
            L_0x00cb:
                int[] r0 = f10639a     // Catch:{ NoSuchFieldError -> 0x00d7 }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.HSUPA     // Catch:{ NoSuchFieldError -> 0x00d7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d7 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d7 }
            L_0x00d7:
                int[] r0 = f10639a     // Catch:{ NoSuchFieldError -> 0x00e3 }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.EHRPD     // Catch:{ NoSuchFieldError -> 0x00e3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e3 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e3 }
            L_0x00e3:
                int[] r0 = f10639a     // Catch:{ NoSuchFieldError -> 0x00ef }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.TD_SCDMA     // Catch:{ NoSuchFieldError -> 0x00ef }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ef }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00ef }
            L_0x00ef:
                int[] r0 = f10639a     // Catch:{ NoSuchFieldError -> 0x00fb }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.LTE     // Catch:{ NoSuchFieldError -> 0x00fb }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fb }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fb }
            L_0x00fb:
                int[] r0 = f10639a     // Catch:{ NoSuchFieldError -> 0x0107 }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.LTE_CA     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = f10639a     // Catch:{ NoSuchFieldError -> 0x0113 }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.NR     // Catch:{ NoSuchFieldError -> 0x0113 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0113 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0113 }
            L_0x0113:
                int[] r0 = f10639a     // Catch:{ NoSuchFieldError -> 0x011f }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.WiFi     // Catch:{ NoSuchFieldError -> 0x011f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011f }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x011f }
            L_0x011f:
                int[] r0 = f10639a     // Catch:{ NoSuchFieldError -> 0x012b }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.Unknown     // Catch:{ NoSuchFieldError -> 0x012b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012b }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012b }
            L_0x012b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.j8.f.<clinit>():void");
        }
    }

    /* compiled from: Sta */
    public class i extends AsyncTask<Void, Void, Void> {
        public i() {
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            j8.this.z();
            return null;
        }

        public void onPreExecute() {
            boolean unused = j8.this.R = true;
            j8.this.d(false);
            int[] unused2 = j8.this.P = new int[0];
        }

        /* renamed from: a */
        public void onPostExecute(Void voidR) {
            j8 j8Var = j8.this;
            j8Var.a(j8Var.P);
            if (Build.VERSION.SDK_INT >= 29) {
                j8.this.w();
            }
            j8.this.b(false);
            boolean unused = j8.this.R = false;
        }
    }

    /* compiled from: Sta */
    public class j {

        /* renamed from: a  reason: collision with root package name */
        private SparseArray<o> f10657a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        private SparseArray<n> f10658b = new SparseArray<>();

        /* renamed from: c  reason: collision with root package name */
        private SparseArray<h> f10659c = new SparseArray<>();

        /* renamed from: d  reason: collision with root package name */
        private HashMap<String, l> f10660d = new HashMap<>();

        /* renamed from: e  reason: collision with root package name */
        private SparseArray<NetworkRegistrationInfo[]> f10661e = new SparseArray<>();

        /* renamed from: f  reason: collision with root package name */
        private SparseArray<m> f10662f = new SparseArray<>();

        /* renamed from: g  reason: collision with root package name */
        private Map<String, String> f10663g = new HashMap();

        public j() {
        }

        public void a(int i10, o oVar) {
            this.f10657a.put(i10, oVar);
        }

        public NetworkRegistrationInfo[] b(int i10) {
            return this.f10661e.get(i10);
        }

        public m c(int i10) {
            return this.f10662f.get(i10);
        }

        public n d(int i10) {
            n nVar = this.f10658b.get(i10);
            return nVar == null ? new n(j8.this, (a) null) : nVar;
        }

        public o e(int i10) {
            o oVar = this.f10657a.get(i10);
            return oVar == null ? new o(j8.this, (a) null) : oVar;
        }

        public void a(int i10, n nVar) {
            this.f10658b.put(i10, nVar);
        }

        public void a(int i10, h hVar) {
            this.f10659c.put(i10, hVar);
        }

        public void a(int i10, NetworkRegistrationInfo[] networkRegistrationInfoArr) {
            this.f10661e.put(i10, networkRegistrationInfoArr);
        }

        public void a(String str, l lVar) {
            this.f10660d.put(str, lVar);
        }

        public void a(int i10, String str, String str2) {
            Map<String, String> map = this.f10663g;
            map.put(i10 + str, str2);
        }

        public void a(int i10, m mVar) {
            this.f10662f.put(i10, mVar);
        }

        public h a(int i10) {
            return this.f10659c.get(i10);
        }

        public l a(String str) {
            return this.f10660d.get(str);
        }

        public String a(int i10, String str) {
            Map<String, String> map = this.f10663g;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append(str != null ? str.split(",")[0] : "");
            String str2 = map.get(sb2.toString());
            return str2 == null ? "" : str2;
        }
    }

    public j8(Context context) {
        this.f10609d = context;
        this.f10607b = (TelephonyManager) context.getSystemService("phone");
        this.f10612g = (ConnectivityManager) context.getSystemService("connectivity");
        z();
        a(this.P);
        if (Build.VERSION.SDK_INT >= 29) {
            w();
        }
        this.f10606a = new Handler(Looper.getMainLooper());
        this.Q = new CopyOnWriteArrayList();
        this.f10615j = new y6();
        this.f10613h = new j();
        this.O = this.f10609d.getContentResolver();
        s();
        t();
        u();
        r();
        v();
    }

    private static int b(int i10) {
        if (i10 == 99 || i10 < -5 || i10 > 91) {
            return 0;
        }
        return i10 - 116;
    }

    /* access modifiers changed from: private */
    public static int c(int i10) {
        if (i10 == 99 || i10 < 0 || i10 > 31) {
            return 0;
        }
        return (i10 * 2) - 113;
    }

    /* access modifiers changed from: private */
    public void z() {
        y6 f10 = p2.f(this.f10609d);
        this.f10615j = f10;
        ArrayList<x9> arrayList = f10.SimInfos;
        x9[] x9VarArr = (x9[]) arrayList.toArray(new x9[arrayList.size()]);
        int[] iArr = new int[x9VarArr.length];
        for (int i10 = 0; i10 < x9VarArr.length; i10++) {
            iArr[i10] = x9VarArr[i10].SubscriptionId;
        }
        this.P = iArr;
    }

    public void x() {
        try {
            c(true);
            b(this.f10609d);
        } catch (Throwable th) {
            x2.a(th);
        }
    }

    public void y() {
        try {
            d(true);
            c(this.f10609d);
        } catch (Throwable th) {
            x2.a(th);
        }
    }

    /* compiled from: Sta */
    public class h {

        /* renamed from: a  reason: collision with root package name */
        public CellLocation f10653a;

        /* renamed from: b  reason: collision with root package name */
        public long f10654b;

        private h() {
            this.f10654b = 0;
        }

        public /* synthetic */ h(j8 j8Var, a aVar) {
            this();
        }
    }

    /* access modifiers changed from: private */
    public void d(boolean z10) {
        SubscriptionManager subscriptionManager;
        if (z10 && this.f10614i != null && this.f10609d.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0 && Build.VERSION.SDK_INT >= 22 && (subscriptionManager = (SubscriptionManager) this.f10609d.getSystemService("telephony_subscription_service")) != null) {
            subscriptionManager.removeOnSubscriptionsChangedListener(this.f10614i);
        }
        TelephonyManager telephonyManager = this.f10607b;
        if (telephonyManager != null) {
            p pVar = this.f10610e;
            if (pVar != null) {
                telephonyManager.listen(pVar, 0);
            }
            Iterator<p> it = this.f10611f.iterator();
            while (it.hasNext()) {
                p next = it.next();
                TelephonyManager telephonyManager2 = null;
                SparseArray<TelephonyManager> sparseArray = this.f10608c;
                if (sparseArray != null && sparseArray.size() > 0) {
                    telephonyManager2 = this.f10608c.get(next.a());
                }
                if (telephonyManager2 == null) {
                    telephonyManager2 = this.f10607b;
                }
                telephonyManager2.listen(next, 0);
            }
        }
    }

    @TargetApi(18)
    private void e(CellInfo cellInfo, com.startapp.networkTest.data.radio.CellInfo cellInfo2, long j10) {
        CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
        cellInfo2.IsRegistered = cellInfoWcdma.isRegistered();
        cellInfo2.CellNetworkType = CellNetworkTypes.Wcdma;
        cellInfo2.CellInfoAge = j10 - (cellInfoWcdma.getTimeStamp() / 1000000);
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        if (cellIdentity.getMcc() != Integer.MAX_VALUE) {
            cellInfo2.Mcc = cellIdentity.getMcc();
        }
        if (cellIdentity.getMnc() != Integer.MAX_VALUE) {
            cellInfo2.Mnc = cellIdentity.getMnc();
        }
        if (cellIdentity.getCid() != Integer.MAX_VALUE) {
            int cid = cellIdentity.getCid();
            cellInfo2.Cid = cid;
            cellInfo2.CellId = (long) cid;
        }
        if (cellIdentity.getLac() != Integer.MAX_VALUE) {
            cellInfo2.Lac = cellIdentity.getLac();
        }
        if (cellIdentity.getPsc() != Integer.MAX_VALUE) {
            cellInfo2.Psc = cellIdentity.getPsc();
        }
        if (Build.VERSION.SDK_INT >= 24 && cellIdentity.getUarfcn() != Integer.MAX_VALUE) {
            cellInfo2.Arfcn = cellIdentity.getUarfcn();
        }
        cellInfo2.Dbm = cellInfoWcdma.getCellSignalStrength().getDbm();
    }

    private boolean k(int i10) {
        return this.f10615j.getSimInfoSubId(i10).SubscriptionId != -1;
    }

    @TargetApi(17)
    private boolean m() {
        return Settings.Global.getInt(this.O, "airplane_mode_on", 0) != 0;
    }

    private List<g> q() {
        Network[] allNetworks;
        ArrayList arrayList = new ArrayList();
        if (this.f10612g != null && Build.VERSION.SDK_INT >= 21 && this.f10609d.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && (allNetworks = this.f10612g.getAllNetworks()) != null && allNetworks.length > 0) {
            for (Network network : allNetworks) {
                NetworkCapabilities networkCapabilities = this.f10612g.getNetworkCapabilities(network);
                if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                    g gVar = new g(this, (a) null);
                    NetworkInfo networkInfo = this.f10612g.getNetworkInfo(network);
                    LinkProperties linkProperties = this.f10612g.getLinkProperties(network);
                    ArrayList arrayList2 = new ArrayList();
                    if (networkCapabilities.hasCapability(4)) {
                        arrayList2.add("ims");
                    }
                    if (networkCapabilities.hasCapability(1)) {
                        arrayList2.add("supl");
                    }
                    if (networkCapabilities.hasCapability(9)) {
                        arrayList2.add("xcap");
                    }
                    if (networkCapabilities.hasCapability(2)) {
                        arrayList2.add("dun");
                    }
                    if (networkCapabilities.hasCapability(5)) {
                        arrayList2.add("cbs");
                    }
                    if (networkCapabilities.hasCapability(3)) {
                        arrayList2.add("fota");
                    }
                    if (networkCapabilities.hasCapability(10)) {
                        arrayList2.add("emergency");
                    }
                    if (networkCapabilities.hasCapability(7)) {
                        arrayList2.add("ia");
                    }
                    if (networkCapabilities.hasCapability(0)) {
                        arrayList2.add("mms");
                    }
                    if (networkCapabilities.hasCapability(8)) {
                        arrayList2.add("rcs");
                    }
                    if (networkCapabilities.hasCapability(23)) {
                        arrayList2.add("mcx");
                    }
                    gVar.f10644d = TextUtils.join(",", arrayList2);
                    if (networkInfo != null) {
                        gVar.f10642b = networkInfo.getExtraInfo();
                        gVar.f10641a = networkInfo.getSubtype();
                        gVar.f10651k = WifiDetailedStates.a(networkInfo.getDetailedState());
                    }
                    if (linkProperties != null) {
                        gVar.f10645e = b0.a(networkCapabilities);
                        gVar.f10647g = b0.b(networkCapabilities);
                        gVar.f10646f = b0.a(linkProperties);
                        String interfaceName = linkProperties.getInterfaceName();
                        if (interfaceName != null) {
                            try {
                                gVar.f10648h = eb.b(interfaceName);
                                gVar.f10649i = eb.a(interfaceName);
                            } catch (Throwable th) {
                                x2.a(th);
                            }
                            gVar.f10650j = interfaceName;
                        }
                    }
                    arrayList.add(gVar);
                }
            }
        }
        return arrayList;
    }

    @TargetApi(17)
    private void r() {
        try {
            Field declaredField = CellSignalStrengthLte.class.getDeclaredField("mSignalStrength");
            this.D = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e10) {
            x2.b(e10);
        }
        try {
            Field declaredField2 = CellSignalStrengthLte.class.getDeclaredField("mRsrq");
            this.E = declaredField2;
            declaredField2.setAccessible(true);
        } catch (NoSuchFieldException e11) {
            x2.b(e11);
        }
        try {
            Field declaredField3 = CellSignalStrengthLte.class.getDeclaredField("mRssnr");
            this.F = declaredField3;
            declaredField3.setAccessible(true);
        } catch (NoSuchFieldException e12) {
            x2.b(e12);
        }
        try {
            Field declaredField4 = CellSignalStrengthLte.class.getDeclaredField("mCqi");
            this.G = declaredField4;
            declaredField4.setAccessible(true);
        } catch (NoSuchFieldException e13) {
            x2.b(e13);
        }
    }

    private void s() {
        if (Build.VERSION.SDK_INT >= 25) {
            try {
                Field declaredField = ServiceState.class.getDeclaredField("mIsUsingCarrierAggregation");
                this.C = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable th) {
                x2.b(th);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                this.B = SignalStrength.class.getDeclaredMethod("isUsingCarrierAggregation", new Class[0]);
            } catch (Throwable th2) {
                x2.b(th2);
            }
        }
    }

    @TargetApi(18)
    private void t() {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                this.f10619n = SignalStrength.class.getDeclaredMethod("getLteSignalStrength", new Class[0]);
            } catch (Throwable th) {
                x2.b(th);
            }
            try {
                this.f10622q = SignalStrength.class.getDeclaredMethod("getLteCqi", new Class[0]);
            } catch (Throwable th2) {
                x2.b(th2);
            }
            try {
                this.f10623r = SignalStrength.class.getDeclaredMethod("getLteRsrp", new Class[0]);
            } catch (Throwable th3) {
                x2.b(th3);
            }
            try {
                this.f10624s = SignalStrength.class.getDeclaredMethod("getLteRsrq", new Class[0]);
            } catch (Throwable th4) {
                x2.b(th4);
            }
            try {
                this.f10625t = SignalStrength.class.getDeclaredMethod("getLteRssnr", new Class[0]);
            } catch (Throwable th5) {
                x2.b(th5);
            }
            try {
                this.f10620o = SignalStrength.class.getDeclaredMethod("getLteDbm", new Class[0]);
            } catch (Throwable th6) {
                x2.b(th6);
            }
            try {
                this.f10618m = SignalStrength.class.getDeclaredMethod("getDbm", new Class[0]);
            } catch (Throwable th7) {
                x2.b(th7);
            }
        }
        try {
            this.f10621p = SignalStrength.class.getDeclaredMethod("getGsmEcno", new Class[0]);
        } catch (Throwable th8) {
            x2.b(th8);
        }
        try {
            Field declaredField = SignalStrength.class.getDeclaredField("mWcdmaRscp");
            this.f10628w = declaredField;
            declaredField.setAccessible(true);
        } catch (Throwable th9) {
            x2.b(th9);
        }
        try {
            Field declaredField2 = SignalStrength.class.getDeclaredField("mWcdmaEcio");
            this.f10629x = declaredField2;
            declaredField2.setAccessible(true);
        } catch (Throwable th10) {
            x2.b(th10);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Field declaredField3 = SignalStrength.class.getDeclaredField("mNrRsrp");
                this.f10630y = declaredField3;
                declaredField3.setAccessible(true);
            } catch (Throwable th11) {
                x2.b(th11);
            }
            try {
                Field declaredField4 = SignalStrength.class.getDeclaredField("mNrRsrq");
                this.f10631z = declaredField4;
                declaredField4.setAccessible(true);
            } catch (Throwable th12) {
                x2.b(th12);
            }
            try {
                Field declaredField5 = SignalStrength.class.getDeclaredField("mNrRssnr");
                this.A = declaredField5;
                declaredField5.setAccessible(true);
            } catch (Throwable th13) {
                x2.b(th13);
            }
        }
    }

    private void u() {
        try {
            this.H = this.f10607b.getClass().getDeclaredMethod("getDataEnabled", new Class[0]);
        } catch (Throwable th) {
            x2.b(th);
        }
        try {
            this.I = this.f10607b.getClass().getDeclaredMethod("getDataEnabled", new Class[]{Integer.TYPE});
        } catch (Throwable th2) {
            x2.b(th2);
        }
        try {
            this.J = this.f10607b.getClass().getDeclaredMethod("isNetworkRoaming", new Class[]{Integer.TYPE});
        } catch (Throwable th3) {
            x2.b(th3);
        }
        try {
            this.K = this.f10607b.getClass().getDeclaredMethod("getNetworkType", new Class[]{Integer.TYPE});
        } catch (Throwable th4) {
            x2.b(th4);
        }
        try {
            this.L = this.f10607b.getClass().getDeclaredMethod("getNetworkOperatorName", new Class[]{Integer.TYPE});
        } catch (Throwable th5) {
            x2.b(th5);
        }
        try {
            this.M = this.f10607b.getClass().getDeclaredMethod("getNetworkOperator", new Class[]{Integer.TYPE});
        } catch (Throwable th6) {
            x2.b(th6);
        }
        try {
            this.N = this.f10607b.getClass().getDeclaredMethod("getNetworkOperatorForSubscription", new Class[]{Integer.TYPE});
        } catch (Throwable th7) {
            x2.b(th7);
        }
        try {
            Method declaredMethod = this.f10607b.getClass().getDeclaredMethod("getVoiceNetworkType", (Class[]) null);
            if (!Modifier.isAbstract(declaredMethod.getModifiers())) {
                this.f10626u = declaredMethod;
                declaredMethod.setAccessible(true);
            }
        } catch (Throwable th8) {
            x2.b(th8);
        }
        try {
            Method declaredMethod2 = this.f10607b.getClass().getDeclaredMethod("getVoiceNetworkType", new Class[]{Integer.TYPE});
            if (!Modifier.isAbstract(declaredMethod2.getModifiers())) {
                this.f10627v = declaredMethod2;
                declaredMethod2.setAccessible(true);
            }
        } catch (Throwable th9) {
            x2.b(th9);
        }
    }

    @TargetApi(22)
    private void v() {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f10614i = new a();
        }
    }

    /* access modifiers changed from: private */
    @TargetApi(24)
    public void w() {
        this.f10608c = new SparseArray<>();
        int i10 = 0;
        while (true) {
            int[] iArr = this.P;
            if (i10 < iArr.length) {
                this.f10608c.put(iArr[i10], this.f10607b.createForSubscriptionId(iArr[i10]));
                i10++;
            } else {
                return;
            }
        }
    }

    public Future<com.startapp.networkTest.data.radio.CellInfo[]> f() {
        return ThreadManager.b().a().submit(new b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:128:0x033b  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0382  */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.startapp.networkTest.data.RadioInfo g() {
        /*
            r16 = this;
            r1 = r16
            com.startapp.networkTest.data.RadioInfo r2 = new com.startapp.networkTest.data.RadioInfo
            r2.<init>()
            android.telephony.TelephonyManager r0 = r1.f10607b
            if (r0 == 0) goto L_0x0385
            android.content.Context r0 = r1.f10609d
            android.util.SparseArray r0 = r1.a((android.content.Context) r0)
            r3 = 0
            java.lang.Object r0 = r0.get(r3)
            com.startapp.networkTest.enums.PreferredNetworkTypes r0 = (com.startapp.networkTest.enums.PreferredNetworkTypes) r0
            if (r0 == 0) goto L_0x001c
            r2.PreferredNetwork = r0
        L_0x001c:
            r4 = 3
            r5 = 1
            android.telephony.TelephonyManager r0 = r1.f10607b     // Catch:{ all -> 0x0046 }
            int r0 = r0.getDataState()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0041
            if (r0 == r5) goto L_0x003c
            r6 = 2
            if (r0 == r6) goto L_0x0037
            if (r0 == r4) goto L_0x0032
            com.startapp.networkTest.enums.radio.DataConnectionStates r0 = com.startapp.networkTest.enums.radio.DataConnectionStates.Unknown     // Catch:{ all -> 0x0046 }
            r2.MobileDataConnectionState = r0     // Catch:{ all -> 0x0046 }
            goto L_0x004a
        L_0x0032:
            com.startapp.networkTest.enums.radio.DataConnectionStates r0 = com.startapp.networkTest.enums.radio.DataConnectionStates.Suspended     // Catch:{ all -> 0x0046 }
            r2.MobileDataConnectionState = r0     // Catch:{ all -> 0x0046 }
            goto L_0x004a
        L_0x0037:
            com.startapp.networkTest.enums.radio.DataConnectionStates r0 = com.startapp.networkTest.enums.radio.DataConnectionStates.Connected     // Catch:{ all -> 0x0046 }
            r2.MobileDataConnectionState = r0     // Catch:{ all -> 0x0046 }
            goto L_0x004a
        L_0x003c:
            com.startapp.networkTest.enums.radio.DataConnectionStates r0 = com.startapp.networkTest.enums.radio.DataConnectionStates.Connecting     // Catch:{ all -> 0x0046 }
            r2.MobileDataConnectionState = r0     // Catch:{ all -> 0x0046 }
            goto L_0x004a
        L_0x0041:
            com.startapp.networkTest.enums.radio.DataConnectionStates r0 = com.startapp.networkTest.enums.radio.DataConnectionStates.Disconnected     // Catch:{ all -> 0x0046 }
            r2.MobileDataConnectionState = r0     // Catch:{ all -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r0 = move-exception
            com.startapp.x2.a((java.lang.Throwable) r0)
        L_0x004a:
            boolean r0 = r16.m()
            if (r0 == 0) goto L_0x0053
            com.startapp.networkTest.enums.FlightModeStates r0 = com.startapp.networkTest.enums.FlightModeStates.Enabled
            goto L_0x0055
        L_0x0053:
            com.startapp.networkTest.enums.FlightModeStates r0 = com.startapp.networkTest.enums.FlightModeStates.Disabled
        L_0x0055:
            r2.FlightMode = r0
            com.startapp.networkTest.enums.ThreeState r0 = com.startapp.networkTest.enums.ThreeState.Unknown
            r2.MobileDataEnabled = r0
            java.lang.reflect.Method r0 = r1.H
            if (r0 == 0) goto L_0x007c
            android.telephony.TelephonyManager r6 = r1.f10607b     // Catch:{ all -> 0x0077 }
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x0077 }
            java.lang.Object r0 = r0.invoke(r6, r7)     // Catch:{ all -> 0x0077 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0077 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0072
            com.startapp.networkTest.enums.ThreeState r0 = com.startapp.networkTest.enums.ThreeState.Enabled     // Catch:{ all -> 0x0077 }
            goto L_0x0074
        L_0x0072:
            com.startapp.networkTest.enums.ThreeState r0 = com.startapp.networkTest.enums.ThreeState.Disabled     // Catch:{ all -> 0x0077 }
        L_0x0074:
            r2.MobileDataEnabled = r0     // Catch:{ all -> 0x0077 }
            goto L_0x0092
        L_0x0077:
            r0 = move-exception
            com.startapp.x2.a((java.lang.Throwable) r0)
            goto L_0x0092
        L_0x007c:
            android.content.ContentResolver r0 = r1.O     // Catch:{ all -> 0x008e }
            java.lang.String r6 = "mobile_data"
            int r0 = android.provider.Settings.Global.getInt(r0, r6)     // Catch:{ all -> 0x008e }
            if (r0 != r5) goto L_0x0089
            com.startapp.networkTest.enums.ThreeState r0 = com.startapp.networkTest.enums.ThreeState.Enabled     // Catch:{ all -> 0x008e }
            goto L_0x008b
        L_0x0089:
            com.startapp.networkTest.enums.ThreeState r0 = com.startapp.networkTest.enums.ThreeState.Disabled     // Catch:{ all -> 0x008e }
        L_0x008b:
            r2.MobileDataEnabled = r0     // Catch:{ all -> 0x008e }
            goto L_0x0092
        L_0x008e:
            r0 = move-exception
            com.startapp.x2.a((java.lang.Throwable) r0)
        L_0x0092:
            android.telephony.TelephonyManager r0 = r1.f10607b
            boolean r0 = r0.isNetworkRoaming()
            r2.IsRoaming = r0
            com.startapp.networkTest.enums.ThreeStateShort r0 = r16.o()
            r2.IsMetered = r0
            com.startapp.networkTest.enums.ThreeStateShort r0 = r16.n()
            int r0 = com.startapp.f2.a((com.startapp.networkTest.enums.ThreeStateShort) r0)
            r2.IsVpn = r0
            com.startapp.networkTest.enums.ConnectionTypes r0 = r16.d()
            r2.ConnectionType = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r6 = 30
            if (r0 < r6) goto L_0x00be
            android.content.Context r0 = r1.f10609d
            boolean r0 = com.startapp.c8.b(r0)
            if (r0 == 0) goto L_0x00cf
        L_0x00be:
            android.telephony.TelephonyManager r0 = r1.f10607b     // Catch:{ SecurityException -> 0x00cb }
            int r0 = r0.getNetworkType()     // Catch:{ SecurityException -> 0x00cb }
            com.startapp.networkTest.enums.NetworkTypes r0 = d((int) r0)     // Catch:{ SecurityException -> 0x00cb }
            r2.NetworkType = r0     // Catch:{ SecurityException -> 0x00cb }
            goto L_0x00cf
        L_0x00cb:
            r0 = move-exception
            com.startapp.x2.b(r0)
        L_0x00cf:
            android.telephony.TelephonyManager r0 = r1.f10607b
            java.lang.String r0 = r0.getNetworkOperatorName()
            java.lang.String r0 = com.startapp.la.a((java.lang.String) r0)
            r2.OperatorName = r0
            android.telephony.TelephonyManager r0 = r1.f10607b
            java.lang.String r0 = r0.getNetworkOperator()
            if (r0 == 0) goto L_0x00f6
            int r6 = r0.length()
            r7 = 4
            if (r6 <= r7) goto L_0x00f6
            java.lang.String r6 = r0.substring(r3, r4)
            r2.MCC = r6
            java.lang.String r0 = r0.substring(r4)
            r2.MNC = r0
        L_0x00f6:
            r0 = -1
            com.startapp.networkTest.data.radio.NetworkRegistrationInfo[] r4 = r1.g((int) r0)
            com.startapp.j8$j r6 = r1.f10613h
            com.startapp.j8$h r6 = r6.a((int) r0)
            if (r6 != 0) goto L_0x0109
            com.startapp.j8$h r6 = new com.startapp.j8$h
            r7 = 0
            r6.<init>(r1, r7)
        L_0x0109:
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 29
            if (r7 >= r8) goto L_0x0119
            android.content.Context r7 = r1.f10609d
            java.lang.String r8 = "android.permission.ACCESS_COARSE_LOCATION"
            int r7 = r7.checkCallingOrSelfPermission(r8)
            if (r7 == 0) goto L_0x012d
        L_0x0119:
            android.content.Context r7 = r1.f10609d
            java.lang.String r8 = "android.permission.ACCESS_FINE_LOCATION"
            int r7 = r7.checkCallingOrSelfPermission(r8)
            if (r7 != 0) goto L_0x013a
            android.content.Context r7 = r1.f10609d
            java.lang.String r8 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            int r7 = r7.checkCallingOrSelfPermission(r8)
            if (r7 != 0) goto L_0x013a
        L_0x012d:
            android.telephony.CellLocation r5 = r6.f10653a
            if (r5 != 0) goto L_0x013c
            android.telephony.TelephonyManager r5 = r1.f10607b
            android.telephony.CellLocation r5 = r5.getCellLocation()
            r6.f10653a = r5
            goto L_0x013c
        L_0x013a:
            r2.MissingPermission = r5
        L_0x013c:
            android.telephony.CellLocation r5 = r6.f10653a
            r7 = 0
            r9 = 2147483647(0x7fffffff, float:NaN)
            r10 = 2147483647(0x7fffffff, double:1.060997895E-314)
            java.lang.String r12 = ""
            if (r5 == 0) goto L_0x022e
            java.lang.Class r5 = r5.getClass()
            java.lang.Class<android.telephony.gsm.GsmCellLocation> r13 = android.telephony.gsm.GsmCellLocation.class
            boolean r5 = r5.equals(r13)
            if (r5 == 0) goto L_0x019a
            android.telephony.CellLocation r5 = r6.f10653a
            android.telephony.gsm.GsmCellLocation r5 = (android.telephony.gsm.GsmCellLocation) r5
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            int r14 = r5.getLac()
            r13.append(r14)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            r2.GsmLAC = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            int r14 = r5.getCid()
            r13.append(r14)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            r2.GsmCellId = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            int r5 = r5.getPsc()
            r13.append(r5)
            r13.append(r12)
            java.lang.String r5 = r13.toString()
            r2.PrimaryScramblingCode = r5
            goto L_0x0215
        L_0x019a:
            android.telephony.CellLocation r5 = r6.f10653a
            java.lang.Class r5 = r5.getClass()
            java.lang.Class<android.telephony.cdma.CdmaCellLocation> r13 = android.telephony.cdma.CdmaCellLocation.class
            boolean r5 = r5.equals(r13)
            if (r5 == 0) goto L_0x0215
            android.telephony.CellLocation r5 = r6.f10653a
            android.telephony.cdma.CdmaCellLocation r5 = (android.telephony.cdma.CdmaCellLocation) r5
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            int r14 = r5.getBaseStationId()
            r13.append(r14)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            r2.CdmaBaseStationId = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            int r14 = r5.getBaseStationLatitude()
            r13.append(r14)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            r2.CdmaBaseStationLatitude = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            int r14 = r5.getBaseStationLongitude()
            r13.append(r14)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            r2.CdmaBaseStationLongitude = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            int r14 = r5.getNetworkId()
            r13.append(r14)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            r2.CdmaNetworkId = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            int r5 = r5.getSystemId()
            r13.append(r5)
            r13.append(r12)
            java.lang.String r5 = r13.toString()
            r2.CdmaSystemId = r5
        L_0x0215:
            long r13 = r6.f10654b
            int r5 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0255
            long r13 = android.os.SystemClock.elapsedRealtime()
            long r5 = r6.f10654b
            long r13 = r13 - r5
            int r5 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x022a
            r5 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x022b
        L_0x022a:
            int r5 = (int) r13
        L_0x022b:
            r2.GsmCellIdAge = r5
            goto L_0x0255
        L_0x022e:
            if (r4 == 0) goto L_0x0255
            int r5 = r4.length
            r6 = 0
        L_0x0232:
            if (r6 >= r5) goto L_0x0255
            r13 = r4[r6]
            java.lang.String r14 = r13.Domain
            java.lang.String r15 = "CS"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0252
            java.lang.String r14 = r13.CellId
            r2.GsmCellId = r14
            java.lang.String r15 = r13.Tac
            r2.GsmLAC = r15
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L_0x0252
            int r13 = r13.Age
            r2.GsmCellIdAge = r13
        L_0x0252:
            int r6 = r6 + 1
            goto L_0x0232
        L_0x0255:
            com.startapp.j8$j r5 = r1.f10613h
            com.startapp.j8$n r5 = r5.d(r0)
            com.startapp.networkTest.enums.ServiceStates r6 = r5.f10676a
            r2.ServiceState = r6
            com.startapp.networkTest.enums.DuplexMode r6 = r5.f10678c
            r2.DuplexMode = r6
            com.startapp.networkTest.enums.ThreeStateShort r6 = r5.f10679d
            r2.ManualSelection = r6
            com.startapp.networkTest.enums.ThreeStateShort r6 = r5.f10681f
            r2.CarrierAggregation = r6
            int r6 = r5.f10680e
            r2.ARFCN = r6
            long r13 = r5.f10677b
            int r6 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x0287
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r13 = r5.f10677b
            long r6 = r6 - r13
            int r5 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x0284
            r5 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0285
        L_0x0284:
            int r5 = (int) r6
        L_0x0285:
            r2.ServiceStateAge = r5
        L_0x0287:
            java.lang.String r5 = r1.c((com.startapp.networkTest.data.radio.NetworkRegistrationInfo[]) r4)
            r2.NrState = r5
            com.startapp.networkTest.enums.ThreeStateShort r5 = r1.d((com.startapp.networkTest.data.radio.NetworkRegistrationInfo[]) r4)
            r2.NrAvailable = r5
            com.startapp.networkTest.enums.NetworkTypes r5 = r2.NetworkType
            com.startapp.networkTest.enums.NetworkTypes r6 = com.startapp.networkTest.enums.NetworkTypes.Unknown
            if (r5 != r6) goto L_0x029f
            com.startapp.networkTest.enums.NetworkTypes r5 = r1.b((com.startapp.networkTest.data.radio.NetworkRegistrationInfo[]) r4)
            r2.NetworkType = r5
        L_0x029f:
            com.startapp.j8$j r5 = r1.f10613h
            com.startapp.j8$o r5 = r5.e(r0)
            int r6 = r5.f10692j
            r2.RSCP = r6
            int r6 = r5.f10685c
            r2.CdmaEcIo = r6
            int r6 = r5.f10683a
            r2.RXLevel = r6
            int r7 = r5.f10684b
            r2.NativeDbm = r7
            int r7 = r5.f10691i
            r2.EcN0 = r7
            int r7 = r5.f10686d
            r2.LteCqi = r7
            int r7 = r5.f10687e
            r2.LteRsrp = r7
            int r8 = r5.f10689g
            r2.LteRsrq = r8
            int r8 = r5.f10688f
            r2.LteRssnr = r8
            int r8 = r5.f10690h
            r2.LteRssi = r8
            int r8 = r5.f10694l
            r2.NrCsiRsrp = r8
            int r8 = r5.f10695m
            r2.NrCsiRsrq = r8
            int r8 = r5.f10696n
            r2.NrCsiSinr = r8
            int r8 = r5.f10697o
            r2.NrSsRsrp = r8
            int r8 = r5.f10698p
            r2.NrSsRsrq = r8
            int r8 = r5.f10699q
            r2.NrSsSinr = r8
            com.startapp.networkTest.enums.NetworkTypes r8 = r2.NetworkType
            com.startapp.networkTest.enums.NetworkTypes r13 = com.startapp.networkTest.enums.NetworkTypes.LTE
            if (r8 == r13) goto L_0x02ef
            com.startapp.networkTest.enums.NetworkTypes r13 = com.startapp.networkTest.enums.NetworkTypes.LTE_CA
            if (r8 != r13) goto L_0x02f3
        L_0x02ef:
            if (r6 <= r0) goto L_0x02f3
            r2.RXLevel = r7
        L_0x02f3:
            com.startapp.networkTest.enums.NetworkTypes r0 = com.startapp.networkTest.enums.NetworkTypes.LTE_CA
            if (r8 != r0) goto L_0x02fb
            com.startapp.networkTest.enums.ThreeStateShort r0 = com.startapp.networkTest.enums.ThreeStateShort.Yes
            r2.CarrierAggregation = r0
        L_0x02fb:
            com.startapp.networkTest.enums.ThreeStateShort r0 = r2.CarrierAggregation
            com.startapp.networkTest.enums.ThreeStateShort r6 = com.startapp.networkTest.enums.ThreeStateShort.Unknown
            if (r0 != r6) goto L_0x0307
            com.startapp.networkTest.enums.ThreeStateShort r0 = r1.a((com.startapp.networkTest.data.radio.NetworkRegistrationInfo[]) r4)
            r2.CarrierAggregation = r0
        L_0x0307:
            com.startapp.networkTest.enums.NetworkTypes r0 = r2.NetworkType
            com.startapp.networkTest.enums.NetworkTypes r4 = com.startapp.networkTest.enums.NetworkTypes.NR
            if (r0 != r4) goto L_0x0376
            java.lang.String r0 = r2.MCC     // Catch:{ NumberFormatException -> 0x031c }
            int r4 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x031c }
            java.lang.String r0 = r2.MNC     // Catch:{ NumberFormatException -> 0x031a }
            int r3 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x031a }
            goto L_0x0321
        L_0x031a:
            r0 = move-exception
            goto L_0x031e
        L_0x031c:
            r0 = move-exception
            r4 = 0
        L_0x031e:
            com.startapp.x2.b(r0)
        L_0x0321:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r4)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.startapp.j8$j r3 = r1.f10613h
            com.startapp.j8$l r0 = r3.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x0376
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            long r6 = r0.f10668a
            r3.append(r6)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            r2.GsmCellId = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r4 = r0.f10669b
            java.lang.String r3 = v.e.a(r3, r4, r12)
            r2.GsmLAC = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r4 = r0.f10670c
            java.lang.String r3 = v.e.a(r3, r4, r12)
            r2.PrimaryScramblingCode = r3
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r6 = r0.f10671d
            r12 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r6 / r12
            long r3 = r3 - r6
            int r0 = (int) r3
            r2.GsmCellIdAge = r0
        L_0x0376:
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5.f10693k
            long r3 = r3 - r5
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0382
            goto L_0x0383
        L_0x0382:
            int r9 = (int) r3
        L_0x0383:
            r2.RXLevelAge = r9
        L_0x0385:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.j8.g():com.startapp.networkTest.data.RadioInfo");
    }

    public RadioInfo h() {
        try {
            return h(this.f10615j.DefaultDataSimId);
        } catch (Throwable th) {
            x2.a(th);
            return new RadioInfo();
        }
    }

    public RadioInfo i() {
        try {
            return h(this.f10615j.DefaultSmsSimId);
        } catch (Throwable th) {
            x2.a(th);
            return new RadioInfo();
        }
    }

    public RadioInfo j() {
        try {
            return h(this.f10615j.DefaultVoiceSimId);
        } catch (Throwable th) {
            x2.a(th);
            return new RadioInfo();
        }
    }

    public boolean l() {
        NetworkInfo activeNetworkInfo;
        if (this.f10612g == null || this.f10609d.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || (activeNetworkInfo = this.f10612g.getActiveNetworkInfo()) == null) {
            return false;
        }
        return activeNetworkInfo.isConnected();
    }

    public ThreeStateShort n() {
        ConnectivityManager connectivityManager;
        NetworkCapabilities networkCapabilities;
        ThreeStateShort threeStateShort = ThreeStateShort.Unknown;
        if (Build.VERSION.SDK_INT < 23 || this.f10609d.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || (connectivityManager = this.f10612g) == null || (networkCapabilities = this.f10612g.getNetworkCapabilities(connectivityManager.getActiveNetwork())) == null) {
            return threeStateShort;
        }
        return networkCapabilities.hasTransport(4) ? ThreeStateShort.Yes : ThreeStateShort.No;
    }

    public ThreeStateShort o() {
        if (this.f10609d.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
            return this.f10612g.isActiveNetworkMetered() ? ThreeStateShort.Yes : ThreeStateShort.No;
        }
        return ThreeStateShort.Unknown;
    }

    public boolean p() {
        return this.f10607b.isNetworkRoaming();
    }

    /* compiled from: Sta */
    public class k extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public final String f10665a;

        /* renamed from: b  reason: collision with root package name */
        public final String f10666b;

        private k() {
            this.f10665a = "android.intent.action.ANY_DATA_STATE";
            this.f10666b = "com.samsung.ims.action.IMS_REGISTRATION";
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null) {
                try {
                    String action = intent.getAction();
                    Bundle extras = intent.getExtras();
                    int i10 = -1;
                    if (action.equalsIgnoreCase("android.intent.action.ANY_DATA_STATE") && extras != null) {
                        String string = extras.getString("reason", "");
                        String string2 = extras.getString("apnType", "");
                        if (extras.get("subscription") instanceof Integer) {
                            i10 = extras.getInt("subscription", -1);
                        } else if (extras.get("subscription") instanceof Long) {
                            i10 = (int) extras.getLong("subscription", -1);
                        }
                        if (string2.equalsIgnoreCase("default")) {
                            string2 = "supl";
                        }
                        j8.this.f10613h.a(i10, string2, string);
                    } else if (action.equalsIgnoreCase("com.samsung.ims.action.IMS_REGISTRATION") && extras != null) {
                        String string3 = extras.getString("SERVICE");
                        int i11 = extras.getInt("PHONE_ID", -1);
                        int i12 = extras.getInt("SIP_ERROR", -1);
                        extras.getBoolean("VOWIFI", false);
                        extras.getBoolean("REGISTERED", false);
                        m mVar = new m(j8.this, (a) null);
                        mVar.f10673a = i12;
                        if (string3 != null) {
                            mVar.f10674b = string3.replaceAll("\\[", "").replaceAll("\\]", "").replace(", ", ",");
                        }
                        Iterator<x9> it = p2.f(j8.this.f10609d).SimInfos.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            x9 next = it.next();
                            if (next.SimSlotIndex == i11) {
                                i10 = next.SubscriptionId;
                                break;
                            }
                        }
                        j8.this.f10613h.a(i10, mVar);
                    }
                } catch (Throwable th) {
                    x2.a(th);
                }
            }
        }

        public /* synthetic */ k(j8 j8Var, a aVar) {
            this();
        }
    }

    /* compiled from: Sta */
    public class m {

        /* renamed from: a  reason: collision with root package name */
        public int f10673a;

        /* renamed from: b  reason: collision with root package name */
        public String f10674b;

        private m() {
            this.f10673a = -1;
            this.f10674b = "";
        }

        public /* synthetic */ m(j8 j8Var, a aVar) {
            this();
        }
    }

    /* compiled from: Sta */
    public class p extends PhoneStateListener {

        /* renamed from: a  reason: collision with root package name */
        private Field f10701a;

        /* renamed from: b  reason: collision with root package name */
        private int f10702b = -1;

        /* compiled from: Sta */
        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ServiceState f10704a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ int f10705b;

            public a(ServiceState serviceState, int i10) {
                this.f10704a = serviceState;
                this.f10705b = i10;
            }

            public void run() {
                for (k8 a10 : j8.this.Q) {
                    a10.a(this.f10704a, this.f10705b);
                }
            }
        }

        /* compiled from: Sta */
        public class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ CellLocation f10707a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ int f10708b;

            public b(CellLocation cellLocation, int i10) {
                this.f10707a = cellLocation;
                this.f10708b = i10;
            }

            public void run() {
                for (k8 a10 : j8.this.Q) {
                    a10.a(this.f10707a, this.f10708b);
                }
            }
        }

        public p() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x001b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int a() {
            /*
                r4 = this;
                java.lang.reflect.Field r0 = r4.f10701a
                r1 = -1
                if (r0 == 0) goto L_0x0014
                java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0010 }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0010 }
                int r0 = r0.intValue()     // Catch:{ all -> 0x0010 }
                goto L_0x0015
            L_0x0010:
                r0 = move-exception
                com.startapp.x2.a((java.lang.Throwable) r0)
            L_0x0014:
                r0 = -1
            L_0x0015:
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 29
                if (r2 < r3) goto L_0x0024
                if (r0 == r1) goto L_0x0022
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 != r1) goto L_0x0024
            L_0x0022:
                int r0 = r4.f10702b
            L_0x0024:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.j8.p.a():int");
        }

        public void onCellInfoChanged(List<CellInfo> list) {
            a(list);
        }

        public void onCellLocationChanged(CellLocation cellLocation) {
            a(cellLocation, a());
        }

        public void onServiceStateChanged(ServiceState serviceState) {
            a(serviceState, a());
        }

        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            a(signalStrength, a());
        }

        public p(int i10) {
            this.f10702b = i10;
            try {
                Field declaredField = p.class.getSuperclass().getDeclaredField("mSubId");
                this.f10701a = declaredField;
                declaredField.setAccessible(true);
                this.f10701a.set(this, Integer.valueOf(i10));
            } catch (Throwable th) {
                x2.b(th);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x007f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void a(java.util.List<android.telephony.CellInfo> r10) {
            /*
                r9 = this;
                if (r10 != 0) goto L_0x0003
                return
            L_0x0003:
                com.startapp.j8 r0 = com.startapp.j8.this
                java.util.List unused = r0.f10617l = r10
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L_0x009f
                java.util.Iterator r10 = r10.iterator()
            L_0x0012:
                boolean r0 = r10.hasNext()
                if (r0 == 0) goto L_0x009f
                java.lang.Object r0 = r10.next()
                android.telephony.CellInfo r0 = (android.telephony.CellInfo) r0
                boolean r1 = r0.isRegistered()
                if (r1 == 0) goto L_0x0012
                boolean r1 = r0 instanceof android.telephony.CellInfoNr
                if (r1 == 0) goto L_0x0012
                android.telephony.CellInfoNr r0 = (android.telephony.CellInfoNr) r0
                android.telephony.CellIdentity r1 = r0.getCellIdentity()
                boolean r2 = r1 instanceof android.telephony.CellIdentityNr
                if (r2 == 0) goto L_0x0012
                android.telephony.CellIdentityNr r1 = (android.telephony.CellIdentityNr) r1
                r2 = 0
                java.lang.String r3 = r1.getMccString()     // Catch:{ NumberFormatException -> 0x0048 }
                int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0048 }
                java.lang.String r4 = r1.getMncString()     // Catch:{ NumberFormatException -> 0x0046 }
                int r2 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x0046 }
                goto L_0x004d
            L_0x0046:
                r4 = move-exception
                goto L_0x004a
            L_0x0048:
                r4 = move-exception
                r3 = 0
            L_0x004a:
                com.startapp.x2.b(r4)
            L_0x004d:
                long r4 = r1.getNci()
                int r6 = r1.getTac()
                int r1 = r1.getPci()
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = ""
                r7.append(r8)
                r7.append(r3)
                r7.append(r2)
                java.lang.String r2 = r7.toString()
                r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
                int r3 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r3 != 0) goto L_0x0076
                r4 = -1
            L_0x0076:
                r3 = -1
                r7 = 2147483647(0x7fffffff, float:NaN)
                if (r6 != r7) goto L_0x007d
                r6 = -1
            L_0x007d:
                if (r1 != r7) goto L_0x0080
                r1 = -1
            L_0x0080:
                com.startapp.j8$l r3 = new com.startapp.j8$l
                com.startapp.j8 r7 = com.startapp.j8.this
                r8 = 0
                r3.<init>(r7, r8)
                r3.f10668a = r4
                r3.f10669b = r6
                r3.f10670c = r1
                long r0 = r0.getTimeStamp()
                r3.f10671d = r0
                com.startapp.j8 r0 = com.startapp.j8.this
                com.startapp.j8$j r0 = r0.f10613h
                r0.a((java.lang.String) r2, (com.startapp.j8.l) r3)
                goto L_0x0012
            L_0x009f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.j8.p.a(java.util.List):void");
        }

        private void a(ServiceState serviceState, int i10) {
            ServiceStates serviceStates;
            DuplexMode duplexMode;
            n nVar = new n(j8.this, (a) null);
            if (Build.VERSION.SDK_INT >= 25) {
                if (j8.this.C != null) {
                    try {
                        nVar.f10681f = j8.this.C.getBoolean(serviceState) ? ThreeStateShort.Yes : ThreeStateShort.No;
                    } catch (Throwable th) {
                        x2.a(th);
                    }
                }
                if (nVar.f10681f == ThreeStateShort.Unknown && j8.this.B != null) {
                    try {
                        nVar.f10681f = ((Boolean) j8.this.B.invoke(serviceState, new Object[0])).booleanValue() ? ThreeStateShort.Yes : ThreeStateShort.No;
                    } catch (Throwable th2) {
                        x2.a(th2);
                    }
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    int duplexMode2 = serviceState.getDuplexMode();
                    if (duplexMode2 == 1) {
                        duplexMode = DuplexMode.FDD;
                    } else if (duplexMode2 != 2) {
                        duplexMode = DuplexMode.Unknown;
                    } else {
                        duplexMode = DuplexMode.TDD;
                    }
                    nVar.f10678c = duplexMode;
                    nVar.f10680e = serviceState.getChannelNumber();
                }
            }
            nVar.f10679d = serviceState.getIsManualSelection() ? ThreeStateShort.Yes : ThreeStateShort.No;
            int state = serviceState.getState();
            if (state == 0) {
                serviceStates = ServiceStates.InService;
            } else if (state == 1) {
                serviceStates = ServiceStates.OutOfService;
            } else if (state == 2) {
                serviceStates = ServiceStates.EmergencyOnly;
            } else if (state != 3) {
                serviceStates = ServiceStates.Unknown;
            } else {
                serviceStates = ServiceStates.PowerOff;
            }
            nVar.f10676a = serviceStates;
            nVar.f10677b = SystemClock.elapsedRealtime();
            NetworkRegistrationInfo[] c10 = j7.c(serviceState.toString());
            j8.this.f10613h.a(i10, nVar);
            j8.this.f10613h.a(i10, c10);
            j8.this.f10606a.post(new g9(new a(serviceState, i10)));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:39:0x010f, code lost:
            r0 = r5;
            r12 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0111, code lost:
            r5 = r17;
            r6 = r18;
            r7 = r19;
            r18 = r22;
            r17 = r24;
            r21 = true;
         */
        /* JADX WARNING: Removed duplicated region for block: B:101:0x0238 A[SYNTHETIC, Splitter:B:101:0x0238] */
        /* JADX WARNING: Removed duplicated region for block: B:137:0x02e6 A[Catch:{ all -> 0x0302 }] */
        /* JADX WARNING: Removed duplicated region for block: B:143:0x02ff  */
        /* JADX WARNING: Removed duplicated region for block: B:150:0x0310  */
        /* JADX WARNING: Removed duplicated region for block: B:172:0x035f A[Catch:{ all -> 0x0373 }] */
        /* JADX WARNING: Removed duplicated region for block: B:176:0x0388  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00d1  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00eb  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x01b9  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x020c A[Catch:{ all -> 0x022c }] */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x0227  */
        @android.annotation.TargetApi(29)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void a(android.telephony.SignalStrength r27, int r28) {
            /*
                r26 = this;
                r1 = r26
                r2 = r27
                r3 = r28
                java.lang.Integer r0 = com.startapp.networkTest.data.RadioInfo.INVALID
                int r4 = r0.intValue()
                int r5 = r0.intValue()
                int r6 = r0.intValue()
                int r7 = r0.intValue()
                int r8 = r0.intValue()
                int r9 = r0.intValue()
                int r10 = r0.intValue()
                int r11 = r0.intValue()
                int r12 = r0.intValue()
                int r13 = r0.intValue()
                int r14 = r0.intValue()
                int r15 = r0.intValue()
                int r16 = r0.intValue()
                int r17 = r0.intValue()
                int r18 = r0.intValue()
                int r19 = r0.intValue()
                com.startapp.j8 r0 = com.startapp.j8.this
                android.util.SparseArray r0 = r0.f10608c
                r20 = r4
                if (r0 == 0) goto L_0x005f
                com.startapp.j8 r0 = com.startapp.j8.this
                android.util.SparseArray r0 = r0.f10608c
                java.lang.Object r0 = r0.get(r3)
                android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
                goto L_0x0060
            L_0x005f:
                r0 = 0
            L_0x0060:
                if (r0 != 0) goto L_0x0068
                com.startapp.j8 r0 = com.startapp.j8.this
                android.telephony.TelephonyManager r0 = r0.f10607b
            L_0x0068:
                com.startapp.networkTest.enums.NetworkTypes r21 = com.startapp.networkTest.enums.NetworkTypes.Unknown
                com.startapp.j8 r4 = com.startapp.j8.this     // Catch:{ SecurityException -> 0x00c2, all -> 0x00b8 }
                android.util.SparseArray r4 = r4.f10608c     // Catch:{ SecurityException -> 0x00c2, all -> 0x00b8 }
                if (r4 != 0) goto L_0x00a4
                com.startapp.j8 r4 = com.startapp.j8.this     // Catch:{ SecurityException -> 0x00c2, all -> 0x00b8 }
                java.lang.reflect.Method r4 = r4.K     // Catch:{ SecurityException -> 0x00c2, all -> 0x00b8 }
                if (r4 == 0) goto L_0x00a4
                com.startapp.j8 r0 = com.startapp.j8.this     // Catch:{ SecurityException -> 0x00c2, all -> 0x00b8 }
                java.lang.reflect.Method r0 = r0.K     // Catch:{ SecurityException -> 0x00c2, all -> 0x00b8 }
                com.startapp.j8 r4 = com.startapp.j8.this     // Catch:{ SecurityException -> 0x00c2, all -> 0x00b8 }
                android.telephony.TelephonyManager r4 = r4.f10607b     // Catch:{ SecurityException -> 0x00c2, all -> 0x00b8 }
                r24 = r6
                r22 = r7
                r6 = 1
                java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ SecurityException -> 0x00b6, all -> 0x00b4 }
                java.lang.Integer r25 = java.lang.Integer.valueOf(r28)     // Catch:{ SecurityException -> 0x00b6, all -> 0x00b4 }
                r23 = 0
                r7[r23] = r25     // Catch:{ SecurityException -> 0x00b6, all -> 0x00b4 }
                java.lang.Object r0 = r0.invoke(r4, r7)     // Catch:{ SecurityException -> 0x00b6, all -> 0x00b4 }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ SecurityException -> 0x00b6, all -> 0x00b4 }
                int r0 = r0.intValue()     // Catch:{ SecurityException -> 0x00b6, all -> 0x00b4 }
                com.startapp.networkTest.enums.NetworkTypes r0 = com.startapp.j8.d((int) r0)     // Catch:{ SecurityException -> 0x00b6, all -> 0x00b4 }
                goto L_0x00b1
            L_0x00a4:
                r24 = r6
                r22 = r7
                r6 = 1
                int r0 = r0.getNetworkType()     // Catch:{ SecurityException -> 0x00b6, all -> 0x00b4 }
                com.startapp.networkTest.enums.NetworkTypes r0 = com.startapp.j8.d((int) r0)     // Catch:{ SecurityException -> 0x00b6, all -> 0x00b4 }
            L_0x00b1:
                r21 = r0
                goto L_0x00cb
            L_0x00b4:
                r0 = move-exception
                goto L_0x00be
            L_0x00b6:
                r0 = move-exception
                goto L_0x00c8
            L_0x00b8:
                r0 = move-exception
                r24 = r6
                r22 = r7
                r6 = 1
            L_0x00be:
                com.startapp.x2.a((java.lang.Throwable) r0)
                goto L_0x00cb
            L_0x00c2:
                r0 = move-exception
                r24 = r6
                r22 = r7
                r6 = 1
            L_0x00c8:
                com.startapp.x2.b(r0)
            L_0x00cb:
                r0 = r21
                com.startapp.networkTest.enums.NetworkTypes r4 = com.startapp.networkTest.enums.NetworkTypes.Unknown
                if (r0 != r4) goto L_0x00e1
                com.startapp.j8 r0 = com.startapp.j8.this
                com.startapp.j8$j r0 = r0.f10613h
                com.startapp.networkTest.data.radio.NetworkRegistrationInfo[] r0 = r0.b(r3)
                com.startapp.j8 r4 = com.startapp.j8.this
                com.startapp.networkTest.enums.NetworkTypes r0 = r4.b((com.startapp.networkTest.data.radio.NetworkRegistrationInfo[]) r0)
            L_0x00e1:
                com.startapp.networkTest.enums.NetworkGenerations r4 = com.startapp.j8.b((com.startapp.networkTest.enums.NetworkTypes) r0)
                int r0 = android.os.Build.VERSION.SDK_INT
                r7 = 29
                if (r0 < r7) goto L_0x01aa
                java.util.List r0 = r27.getCellSignalStrengths()
                java.util.Iterator r0 = r0.iterator()
            L_0x00f3:
                boolean r7 = r0.hasNext()
                if (r7 == 0) goto L_0x01aa
                java.lang.Object r7 = r0.next()
                android.telephony.CellSignalStrength r7 = (android.telephony.CellSignalStrength) r7
                com.startapp.networkTest.enums.NetworkGenerations r6 = com.startapp.networkTest.enums.NetworkGenerations.Gen2
                r25 = r0
                if (r4 != r6) goto L_0x011f
                boolean r0 = r7 instanceof android.telephony.CellSignalStrengthGsm
                if (r0 == 0) goto L_0x011f
                android.telephony.CellSignalStrengthGsm r7 = (android.telephony.CellSignalStrengthGsm) r7
                int r5 = r7.getDbm()
            L_0x010f:
                r0 = r5
                r12 = r0
            L_0x0111:
                r5 = r17
                r6 = r18
                r7 = r19
                r18 = r22
                r17 = r24
                r21 = 1
                goto L_0x01b7
            L_0x011f:
                com.startapp.networkTest.enums.NetworkGenerations r0 = com.startapp.networkTest.enums.NetworkGenerations.Gen3
                if (r4 != r0) goto L_0x0138
                boolean r0 = r7 instanceof android.telephony.CellSignalStrengthWcdma
                if (r0 == 0) goto L_0x0138
                android.telephony.CellSignalStrengthWcdma r7 = (android.telephony.CellSignalStrengthWcdma) r7
                int r12 = r7.getDbm()
                java.lang.Integer r0 = com.startapp.networkTest.data.RadioInfo.INVALID
                int r0 = r0.intValue()
                if (r5 != r0) goto L_0x0136
                r5 = r12
            L_0x0136:
                r0 = r5
                goto L_0x0111
            L_0x0138:
                com.startapp.networkTest.enums.NetworkGenerations r0 = com.startapp.networkTest.enums.NetworkGenerations.Gen4
                if (r4 != r0) goto L_0x0169
                boolean r0 = r7 instanceof android.telephony.CellSignalStrengthLte
                if (r0 == 0) goto L_0x0169
                android.telephony.CellSignalStrengthLte r7 = (android.telephony.CellSignalStrengthLte) r7
                int r5 = r7.getDbm()
                int r6 = r7.getCqi()
                int r0 = r7.getRsrp()
                int r8 = r7.getRssnr()
                int r9 = r7.getRsrq()
                int r10 = r7.getRssi()
                r12 = r5
                r7 = r19
                r21 = 1
                r5 = r17
                r17 = r6
                r6 = r18
                r18 = r0
                r0 = r12
                goto L_0x01b7
            L_0x0169:
                com.startapp.networkTest.enums.NetworkGenerations r0 = com.startapp.networkTest.enums.NetworkGenerations.Gen5
                if (r4 != r0) goto L_0x0191
                boolean r0 = r7 instanceof android.telephony.CellSignalStrengthNr
                if (r0 == 0) goto L_0x0191
                android.telephony.CellSignalStrengthNr r7 = (android.telephony.CellSignalStrengthNr) r7
                int r5 = r7.getDbm()
                int r14 = r7.getCsiRsrp()
                int r15 = r7.getCsiRsrq()
                int r16 = r7.getCsiSinr()
                int r17 = r7.getSsRsrp()
                int r18 = r7.getSsRsrq()
                int r19 = r7.getSsSinr()
                goto L_0x010f
            L_0x0191:
                if (r4 != r6) goto L_0x01a5
                boolean r0 = r7 instanceof android.telephony.CellSignalStrengthCdma
                if (r0 == 0) goto L_0x01a5
                android.telephony.CellSignalStrengthCdma r7 = (android.telephony.CellSignalStrengthCdma) r7
                int r0 = r7.getCdmaEcio()
                int r5 = r7.getDbm()
                r20 = r0
                goto L_0x010f
            L_0x01a5:
                r0 = r25
                r6 = 1
                goto L_0x00f3
            L_0x01aa:
                r0 = r5
                r5 = r17
                r6 = r18
                r7 = r19
                r18 = r22
                r17 = r24
                r21 = 0
            L_0x01b7:
                if (r21 != 0) goto L_0x0388
                boolean r0 = r27.isGsm()
                if (r0 == 0) goto L_0x01f6
                com.startapp.j8 r0 = com.startapp.j8.this
                java.lang.reflect.Field r0 = r0.f10628w
                if (r0 == 0) goto L_0x01da
                com.startapp.networkTest.enums.NetworkGenerations r0 = com.startapp.networkTest.enums.NetworkGenerations.Gen3
                if (r4 != r0) goto L_0x01da
                com.startapp.j8 r0 = com.startapp.j8.this     // Catch:{ all -> 0x01d6 }
                java.lang.reflect.Field r0 = r0.f10628w     // Catch:{ all -> 0x01d6 }
                int r13 = r0.getInt(r2)     // Catch:{ all -> 0x01d6 }
                goto L_0x01da
            L_0x01d6:
                r0 = move-exception
                com.startapp.x2.a((java.lang.Throwable) r0)
            L_0x01da:
                int r0 = r27.getGsmSignalStrength()
                if (r0 != 0) goto L_0x01ec
                java.lang.Integer r19 = com.startapp.networkTest.data.RadioInfo.INVALID
                r21 = r8
                int r8 = r19.intValue()
                if (r13 == r8) goto L_0x01ee
                r8 = r13
                goto L_0x0204
            L_0x01ec:
                r21 = r8
            L_0x01ee:
                if (r0 >= 0) goto L_0x01f1
                goto L_0x0202
            L_0x01f1:
                int r0 = com.startapp.j8.c((int) r0)
                goto L_0x0202
            L_0x01f6:
                r21 = r8
                int r0 = r27.getCdmaDbm()
                int r8 = r27.getCdmaEcio()
                r20 = r8
            L_0x0202:
                r8 = r13
                r13 = r0
            L_0x0204:
                com.startapp.j8 r0 = com.startapp.j8.this     // Catch:{ all -> 0x022c }
                java.lang.reflect.Method r0 = r0.f10618m     // Catch:{ all -> 0x022c }
                if (r0 == 0) goto L_0x0227
                com.startapp.j8 r0 = com.startapp.j8.this     // Catch:{ all -> 0x022c }
                java.lang.reflect.Method r0 = r0.f10618m     // Catch:{ all -> 0x022c }
                r19 = r8
                r22 = r9
                r8 = 0
                java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x0225 }
                java.lang.Object r0 = r0.invoke(r2, r9)     // Catch:{ all -> 0x0225 }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0225 }
                int r0 = r0.intValue()     // Catch:{ all -> 0x0225 }
                r12 = r0
                goto L_0x0234
            L_0x0225:
                r0 = move-exception
                goto L_0x0231
            L_0x0227:
                r19 = r8
                r22 = r9
                goto L_0x0234
            L_0x022c:
                r0 = move-exception
                r19 = r8
                r22 = r9
            L_0x0231:
                com.startapp.x2.a((java.lang.Throwable) r0)
            L_0x0234:
                com.startapp.networkTest.enums.NetworkGenerations r0 = com.startapp.networkTest.enums.NetworkGenerations.Gen4
                if (r4 != r0) goto L_0x0308
                com.startapp.j8 r0 = com.startapp.j8.this     // Catch:{ all -> 0x0254 }
                java.lang.reflect.Method r0 = r0.f10620o     // Catch:{ all -> 0x0254 }
                if (r0 == 0) goto L_0x0258
                com.startapp.j8 r0 = com.startapp.j8.this     // Catch:{ all -> 0x0254 }
                java.lang.reflect.Method r0 = r0.f10620o     // Catch:{ all -> 0x0254 }
                r8 = 0
                java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x0254 }
                java.lang.Object r0 = r0.invoke(r2, r9)     // Catch:{ all -> 0x0254 }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0254 }
                int r13 = r0.intValue()     // Catch:{ all -> 0x0254 }
                goto L_0x0258
            L_0x0254:
                r0 = move-exception
                com.startapp.x2.a((java.lang.Throwable) r0)
            L_0x0258:
                com.startapp.j8 r0 = com.startapp.j8.this
                java.lang.reflect.Method r0 = r0.f10619n
                if (r0 == 0) goto L_0x0278
                com.startapp.j8 r0 = com.startapp.j8.this     // Catch:{ all -> 0x0274 }
                java.lang.reflect.Method r0 = r0.f10619n     // Catch:{ all -> 0x0274 }
                r8 = 0
                java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x0274 }
                java.lang.Object r0 = r0.invoke(r2, r9)     // Catch:{ all -> 0x0274 }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0274 }
                int r10 = r0.intValue()     // Catch:{ all -> 0x0274 }
                goto L_0x0278
            L_0x0274:
                r0 = move-exception
                com.startapp.x2.a((java.lang.Throwable) r0)
            L_0x0278:
                com.startapp.j8 r0 = com.startapp.j8.this     // Catch:{ all -> 0x0296 }
                java.lang.reflect.Method r0 = r0.f10622q     // Catch:{ all -> 0x0296 }
                if (r0 == 0) goto L_0x029a
                com.startapp.j8 r0 = com.startapp.j8.this     // Catch:{ all -> 0x0296 }
                java.lang.reflect.Method r0 = r0.f10622q     // Catch:{ all -> 0x0296 }
                r8 = 0
                java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x0296 }
                java.lang.Object r0 = r0.invoke(r2, r9)     // Catch:{ all -> 0x0296 }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0296 }
                int r0 = r0.intValue()     // Catch:{ all -> 0x0296 }
                r17 = r0
                goto L_0x029a
            L_0x0296:
                r0 = move-exception
                com.startapp.x2.a((java.lang.Throwable) r0)
            L_0x029a:
                com.startapp.j8 r0 = com.startapp.j8.this     // Catch:{ all -> 0x02b8 }
                java.lang.reflect.Method r0 = r0.f10623r     // Catch:{ all -> 0x02b8 }
                if (r0 == 0) goto L_0x02bc
                com.startapp.j8 r0 = com.startapp.j8.this     // Catch:{ all -> 0x02b8 }
                java.lang.reflect.Method r0 = r0.f10623r     // Catch:{ all -> 0x02b8 }
                r8 = 0
                java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x02b8 }
                java.lang.Object r0 = r0.invoke(r2, r9)     // Catch:{ all -> 0x02b8 }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x02b8 }
                int r0 = r0.intValue()     // Catch:{ all -> 0x02b8 }
                r18 = r0
                goto L_0x02bc
            L_0x02b8:
                r0 = move-exception
                com.startapp.x2.a((java.lang.Throwable) r0)
            L_0x02bc:
                com.startapp.j8 r0 = com.startapp.j8.this     // Catch:{ all -> 0x02d8 }
                java.lang.reflect.Method r0 = r0.f10624s     // Catch:{ all -> 0x02d8 }
                if (r0 == 0) goto L_0x02dc
                com.startapp.j8 r0 = com.startapp.j8.this     // Catch:{ all -> 0x02d8 }
                java.lang.reflect.Method r0 = r0.f10624s     // Catch:{ all -> 0x02d8 }
                r8 = 0
                java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x02d8 }
                java.lang.Object r0 = r0.invoke(r2, r9)     // Catch:{ all -> 0x02d8 }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x02d8 }
                int r9 = r0.intValue()     // Catch:{ all -> 0x02d8 }
                goto L_0x02de
            L_0x02d8:
                r0 = move-exception
                com.startapp.x2.a((java.lang.Throwable) r0)
            L_0x02dc:
                r9 = r22
            L_0x02de:
                com.startapp.j8 r0 = com.startapp.j8.this     // Catch:{ all -> 0x0302 }
                java.lang.reflect.Method r0 = r0.f10625t     // Catch:{ all -> 0x0302 }
                if (r0 == 0) goto L_0x02ff
                com.startapp.j8 r0 = com.startapp.j8.this     // Catch:{ all -> 0x0302 }
                java.lang.reflect.Method r0 = r0.f10625t     // Catch:{ all -> 0x0302 }
                r22 = r9
                r8 = 0
                java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x02fd }
                java.lang.Object r0 = r0.invoke(r2, r9)     // Catch:{ all -> 0x02fd }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x02fd }
                int r0 = r0.intValue()     // Catch:{ all -> 0x02fd }
                r8 = r0
                goto L_0x030a
            L_0x02fd:
                r0 = move-exception
                goto L_0x0305
            L_0x02ff:
                r22 = r9
                goto L_0x0308
            L_0x0302:
                r0 = move-exception
                r22 = r9
            L_0x0305:
                com.startapp.x2.a((java.lang.Throwable) r0)
            L_0x0308:
                r8 = r21
            L_0x030a:
                r9 = r22
                com.startapp.networkTest.enums.NetworkGenerations r0 = com.startapp.networkTest.enums.NetworkGenerations.Gen5
                if (r4 != r0) goto L_0x0357
                com.startapp.j8 r0 = com.startapp.j8.this
                java.lang.reflect.Field r0 = r0.f10630y
                if (r0 == 0) goto L_0x0327
                com.startapp.j8 r0 = com.startapp.j8.this     // Catch:{ all -> 0x0323 }
                java.lang.reflect.Field r0 = r0.f10630y     // Catch:{ all -> 0x0323 }
                int r14 = r0.getInt(r2)     // Catch:{ all -> 0x0323 }
                goto L_0x0327
            L_0x0323:
                r0 = move-exception
                com.startapp.x2.a((java.lang.Throwable) r0)
            L_0x0327:
                com.startapp.j8 r0 = com.startapp.j8.this
                java.lang.reflect.Field r0 = r0.f10631z
                if (r0 == 0) goto L_0x033e
                com.startapp.j8 r0 = com.startapp.j8.this     // Catch:{ all -> 0x033a }
                java.lang.reflect.Field r0 = r0.f10631z     // Catch:{ all -> 0x033a }
                int r15 = r0.getInt(r2)     // Catch:{ all -> 0x033a }
                goto L_0x033e
            L_0x033a:
                r0 = move-exception
                com.startapp.x2.a((java.lang.Throwable) r0)
            L_0x033e:
                com.startapp.j8 r0 = com.startapp.j8.this
                java.lang.reflect.Field r0 = r0.A
                if (r0 == 0) goto L_0x0357
                com.startapp.j8 r0 = com.startapp.j8.this     // Catch:{ all -> 0x0353 }
                java.lang.reflect.Field r0 = r0.A     // Catch:{ all -> 0x0353 }
                int r0 = r0.getInt(r2)     // Catch:{ all -> 0x0353 }
                r16 = r0
                goto L_0x0357
            L_0x0353:
                r0 = move-exception
                com.startapp.x2.a((java.lang.Throwable) r0)
            L_0x0357:
                com.startapp.j8 r0 = com.startapp.j8.this     // Catch:{ all -> 0x0373 }
                java.lang.reflect.Method r0 = r0.f10621p     // Catch:{ all -> 0x0373 }
                if (r0 == 0) goto L_0x0377
                com.startapp.j8 r0 = com.startapp.j8.this     // Catch:{ all -> 0x0373 }
                java.lang.reflect.Method r0 = r0.f10621p     // Catch:{ all -> 0x0373 }
                r4 = 0
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0373 }
                java.lang.Object r0 = r0.invoke(r2, r4)     // Catch:{ all -> 0x0373 }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0373 }
                int r11 = r0.intValue()     // Catch:{ all -> 0x0373 }
                goto L_0x0377
            L_0x0373:
                r0 = move-exception
                com.startapp.x2.a((java.lang.Throwable) r0)
            L_0x0377:
                r3 = r16
                r0 = r17
                r2 = r18
                r4 = r19
                r17 = r6
                r18 = r7
                r16 = r11
                r11 = r20
                goto L_0x039c
            L_0x0388:
                r21 = r8
                r22 = r9
                r4 = r13
                r3 = r16
                r2 = r18
                r13 = r0
                r18 = r7
                r16 = r11
                r0 = r17
                r11 = r20
                r17 = r6
            L_0x039c:
                long r6 = android.os.SystemClock.elapsedRealtime()
                r19 = r6
                com.startapp.j8$o r6 = new com.startapp.j8$o
                com.startapp.j8 r7 = com.startapp.j8.this
                r1 = 0
                r6.<init>(r7, r1)
                r6.f10685c = r11
                r6.f10683a = r13
                r6.f10684b = r12
                r6.f10686d = r0
                r6.f10687e = r2
                r6.f10688f = r8
                r6.f10689g = r9
                r6.f10690h = r10
                r6.f10694l = r14
                r6.f10695m = r15
                r6.f10696n = r3
                r6.f10697o = r5
                r1 = r17
                r6.f10698p = r1
                r1 = r18
                r6.f10699q = r1
                r6.f10692j = r4
                r11 = r16
                r6.f10691i = r11
                r0 = r19
                r6.f10693k = r0
                r1 = r26
                com.startapp.j8 r0 = com.startapp.j8.this
                com.startapp.j8$j r0 = r0.f10613h
                r2 = r28
                r0.a((int) r2, (com.startapp.j8.o) r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.j8.p.a(android.telephony.SignalStrength, int):void");
        }

        private void a(CellLocation cellLocation, int i10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            h hVar = new h(j8.this, (a) null);
            hVar.f10653a = cellLocation;
            hVar.f10654b = elapsedRealtime;
            j8.this.f10613h.a(i10, hVar);
            j8.this.f10606a.post(new g9(new b(cellLocation, i10)));
        }
    }

    private void c(boolean z10) {
        SubscriptionManager subscriptionManager;
        if (z10 && this.f10614i != null && this.f10609d.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0 && Build.VERSION.SDK_INT >= 22 && (subscriptionManager = (SubscriptionManager) this.f10609d.getSystemService("telephony_subscription_service")) != null) {
            subscriptionManager.addOnSubscriptionsChangedListener(this.f10614i);
        }
        if (this.f10607b != null) {
            int i10 = ((Build.VERSION.SDK_INT >= 29 || this.f10609d.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) && !(this.f10609d.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0 && this.f10609d.checkCallingOrSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") == 0)) ? 257 : 1297;
            if (this.f10611f.size() == 0) {
                if (this.f10610e == null) {
                    this.f10610e = new p();
                }
                try {
                    this.f10607b.listen(this.f10610e, i10);
                } catch (Throwable th) {
                    x2.a(th);
                    this.f10607b.listen(this.f10610e, 257);
                }
            } else {
                Iterator<p> it = this.f10611f.iterator();
                while (it.hasNext()) {
                    p next = it.next();
                    TelephonyManager telephonyManager = null;
                    SparseArray<TelephonyManager> sparseArray = this.f10608c;
                    if (sparseArray != null && sparseArray.size() > 0) {
                        telephonyManager = this.f10608c.get(next.a());
                    }
                    if (telephonyManager == null) {
                        telephonyManager = this.f10607b;
                    }
                    try {
                        telephonyManager.listen(next, i10);
                    } catch (Throwable th2) {
                        x2.a(th2);
                        telephonyManager.listen(next, 257);
                    }
                }
            }
        }
    }

    private static CellConnectionStatus f(int i10) {
        if (i10 == 0) {
            return CellConnectionStatus.None;
        }
        if (i10 == 1) {
            return CellConnectionStatus.Primary;
        }
        if (i10 != 2) {
            return CellConnectionStatus.Unknown;
        }
        return CellConnectionStatus.Secondary;
    }

    public NetworkTypes k() {
        if (c8.b(this.f10609d)) {
            TelephonyManager telephonyManager = this.f10607b;
            if (telephonyManager == null || Build.VERSION.SDK_INT < 24) {
                Method method = this.f10626u;
                if (method != null) {
                    try {
                        return d(((Integer) method.invoke(telephonyManager, new Object[0])).intValue());
                    } catch (Throwable th) {
                        x2.a(th);
                    }
                }
            } else {
                try {
                    return d(telephonyManager.getVoiceNetworkType());
                } catch (SecurityException e10) {
                    x2.b(e10);
                }
            }
        }
        return NetworkTypes.Unknown;
    }

    /* access modifiers changed from: private */
    public void b(boolean z10) {
        try {
            c(z10);
        } catch (Throwable th) {
            x2.a(th);
        }
    }

    /* compiled from: Sta */
    public class l {

        /* renamed from: a  reason: collision with root package name */
        public long f10668a;

        /* renamed from: b  reason: collision with root package name */
        public int f10669b;

        /* renamed from: c  reason: collision with root package name */
        public int f10670c;

        /* renamed from: d  reason: collision with root package name */
        public long f10671d;

        private l() {
            this.f10668a = 0;
            this.f10669b = 0;
            this.f10670c = 0;
            this.f10671d = 0;
        }

        public /* synthetic */ l(j8 j8Var, a aVar) {
            this();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:194:0x042c  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0476  */
    @android.annotation.TargetApi(22)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.startapp.networkTest.data.RadioInfo h(int r14) {
        /*
            r13 = this;
            r0 = -1
            if (r14 == r0) goto L_0x047a
            boolean r1 = r13.k((int) r14)
            if (r1 == 0) goto L_0x047a
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 22
            if (r1 < r2) goto L_0x047a
            int[] r1 = r13.P
            int r1 = r1.length
            if (r1 != 0) goto L_0x0016
            goto L_0x047a
        L_0x0016:
            com.startapp.networkTest.data.RadioInfo r1 = new com.startapp.networkTest.data.RadioInfo
            r1.<init>()
            r1.SubscriptionId = r14
            com.startapp.y6 r2 = r13.f10615j
            int r3 = r2.DefaultVoiceSimId
            r4 = 1
            r5 = 0
            if (r14 != r3) goto L_0x0027
            r3 = 1
            goto L_0x0028
        L_0x0027:
            r3 = 0
        L_0x0028:
            r1.IsDefaultVoiceSim = r3
            int r2 = r2.DefaultDataSimId
            if (r14 != r2) goto L_0x0030
            r2 = 1
            goto L_0x0031
        L_0x0030:
            r2 = 0
        L_0x0031:
            r1.IsDefaultDataSim = r2
            android.content.Context r2 = r13.f10609d
            com.startapp.networkTest.enums.PreferredNetworkTypes r2 = r13.a((android.content.Context) r2, (int) r14)
            r1.PreferredNetwork = r2
            com.startapp.networkTest.enums.PreferredNetworkTypes r3 = com.startapp.networkTest.enums.PreferredNetworkTypes.Unknown
            if (r2 != r3) goto L_0x0057
            android.content.Context r2 = r13.f10609d
            android.util.SparseArray r2 = r13.a((android.content.Context) r2)
            com.startapp.y6 r3 = r13.f10615j
            com.startapp.x9 r3 = r3.getSimInfoSubId(r14)
            int r3 = r3.SimSlotIndex
            java.lang.Object r2 = r2.get(r3)
            com.startapp.networkTest.enums.PreferredNetworkTypes r2 = (com.startapp.networkTest.enums.PreferredNetworkTypes) r2
            if (r2 == 0) goto L_0x0057
            r1.PreferredNetwork = r2
        L_0x0057:
            android.telephony.TelephonyManager r2 = r13.f10607b
            if (r2 == 0) goto L_0x0479
            android.util.SparseArray<android.telephony.TelephonyManager> r2 = r13.f10608c
            r3 = 0
            if (r2 == 0) goto L_0x006f
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x006f
            android.util.SparseArray<android.telephony.TelephonyManager> r2 = r13.f10608c
            java.lang.Object r2 = r2.get(r14)
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2
            goto L_0x0070
        L_0x006f:
            r2 = r3
        L_0x0070:
            r6 = 3
            android.telephony.TelephonyManager r7 = r13.f10607b     // Catch:{ all -> 0x0099 }
            int r7 = r7.getDataState()     // Catch:{ all -> 0x0099 }
            if (r7 == 0) goto L_0x0094
            if (r7 == r4) goto L_0x008f
            r8 = 2
            if (r7 == r8) goto L_0x008a
            if (r7 == r6) goto L_0x0085
            com.startapp.networkTest.enums.radio.DataConnectionStates r7 = com.startapp.networkTest.enums.radio.DataConnectionStates.Unknown     // Catch:{ all -> 0x0099 }
            r1.MobileDataConnectionState = r7     // Catch:{ all -> 0x0099 }
            goto L_0x009d
        L_0x0085:
            com.startapp.networkTest.enums.radio.DataConnectionStates r7 = com.startapp.networkTest.enums.radio.DataConnectionStates.Suspended     // Catch:{ all -> 0x0099 }
            r1.MobileDataConnectionState = r7     // Catch:{ all -> 0x0099 }
            goto L_0x009d
        L_0x008a:
            com.startapp.networkTest.enums.radio.DataConnectionStates r7 = com.startapp.networkTest.enums.radio.DataConnectionStates.Connected     // Catch:{ all -> 0x0099 }
            r1.MobileDataConnectionState = r7     // Catch:{ all -> 0x0099 }
            goto L_0x009d
        L_0x008f:
            com.startapp.networkTest.enums.radio.DataConnectionStates r7 = com.startapp.networkTest.enums.radio.DataConnectionStates.Connecting     // Catch:{ all -> 0x0099 }
            r1.MobileDataConnectionState = r7     // Catch:{ all -> 0x0099 }
            goto L_0x009d
        L_0x0094:
            com.startapp.networkTest.enums.radio.DataConnectionStates r7 = com.startapp.networkTest.enums.radio.DataConnectionStates.Disconnected     // Catch:{ all -> 0x0099 }
            r1.MobileDataConnectionState = r7     // Catch:{ all -> 0x0099 }
            goto L_0x009d
        L_0x0099:
            r7 = move-exception
            com.startapp.x2.a((java.lang.Throwable) r7)
        L_0x009d:
            boolean r7 = r13.m()
            if (r7 == 0) goto L_0x00a6
            com.startapp.networkTest.enums.FlightModeStates r7 = com.startapp.networkTest.enums.FlightModeStates.Enabled
            goto L_0x00a8
        L_0x00a6:
            com.startapp.networkTest.enums.FlightModeStates r7 = com.startapp.networkTest.enums.FlightModeStates.Disabled
        L_0x00a8:
            r1.FlightMode = r7
            com.startapp.networkTest.enums.ThreeState r7 = com.startapp.networkTest.enums.ThreeState.Unknown
            r1.MobileDataEnabled = r7
            if (r2 == 0) goto L_0x00c9
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 26
            if (r7 < r8) goto L_0x00c9
            boolean r7 = r2.isDataEnabled()     // Catch:{ SecurityException -> 0x00c4 }
            if (r7 == 0) goto L_0x00bf
            com.startapp.networkTest.enums.ThreeState r7 = com.startapp.networkTest.enums.ThreeState.Enabled     // Catch:{ SecurityException -> 0x00c4 }
            goto L_0x00c1
        L_0x00bf:
            com.startapp.networkTest.enums.ThreeState r7 = com.startapp.networkTest.enums.ThreeState.Disabled     // Catch:{ SecurityException -> 0x00c4 }
        L_0x00c1:
            r1.MobileDataEnabled = r7     // Catch:{ SecurityException -> 0x00c4 }
            goto L_0x00ef
        L_0x00c4:
            r7 = move-exception
            com.startapp.x2.b(r7)
            goto L_0x00ef
        L_0x00c9:
            java.lang.reflect.Method r7 = r13.I
            if (r7 == 0) goto L_0x00ef
            android.telephony.TelephonyManager r8 = r13.f10607b     // Catch:{ all -> 0x00eb }
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ all -> 0x00eb }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x00eb }
            r9[r5] = r10     // Catch:{ all -> 0x00eb }
            java.lang.Object r7 = r7.invoke(r8, r9)     // Catch:{ all -> 0x00eb }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x00eb }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x00eb }
            if (r7 == 0) goto L_0x00e6
            com.startapp.networkTest.enums.ThreeState r7 = com.startapp.networkTest.enums.ThreeState.Enabled     // Catch:{ all -> 0x00eb }
            goto L_0x00e8
        L_0x00e6:
            com.startapp.networkTest.enums.ThreeState r7 = com.startapp.networkTest.enums.ThreeState.Disabled     // Catch:{ all -> 0x00eb }
        L_0x00e8:
            r1.MobileDataEnabled = r7     // Catch:{ all -> 0x00eb }
            goto L_0x00ef
        L_0x00eb:
            r7 = move-exception
            com.startapp.x2.a((java.lang.Throwable) r7)
        L_0x00ef:
            if (r2 == 0) goto L_0x00f8
            boolean r7 = r2.isNetworkRoaming()
            r1.IsRoaming = r7
            goto L_0x0117
        L_0x00f8:
            java.lang.reflect.Method r7 = r13.J
            if (r7 == 0) goto L_0x0117
            android.telephony.TelephonyManager r8 = r13.f10607b     // Catch:{ all -> 0x0113 }
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ all -> 0x0113 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x0113 }
            r9[r5] = r10     // Catch:{ all -> 0x0113 }
            java.lang.Object r7 = r7.invoke(r8, r9)     // Catch:{ all -> 0x0113 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0113 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0113 }
            r1.IsRoaming = r7     // Catch:{ all -> 0x0113 }
            goto L_0x0117
        L_0x0113:
            r7 = move-exception
            com.startapp.x2.a((java.lang.Throwable) r7)
        L_0x0117:
            com.startapp.networkTest.enums.ThreeStateShort r7 = r13.o()
            r1.IsMetered = r7
            com.startapp.networkTest.enums.ThreeStateShort r7 = r13.n()
            int r7 = com.startapp.f2.a((com.startapp.networkTest.enums.ThreeStateShort) r7)
            r1.IsVpn = r7
            com.startapp.networkTest.enums.ConnectionTypes r7 = r13.d()
            r1.ConnectionType = r7
            if (r2 == 0) goto L_0x014d
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 30
            if (r7 < r8) goto L_0x013d
            android.content.Context r7 = r13.f10609d
            boolean r7 = com.startapp.c8.b(r7)
            if (r7 == 0) goto L_0x014d
        L_0x013d:
            int r7 = r2.getNetworkType()     // Catch:{ SecurityException -> 0x0148 }
            com.startapp.networkTest.enums.NetworkTypes r7 = d((int) r7)     // Catch:{ SecurityException -> 0x0148 }
            r1.NetworkType = r7     // Catch:{ SecurityException -> 0x0148 }
            goto L_0x0170
        L_0x0148:
            r7 = move-exception
            com.startapp.x2.b(r7)
            goto L_0x0170
        L_0x014d:
            java.lang.reflect.Method r7 = r13.K
            if (r7 == 0) goto L_0x0170
            android.telephony.TelephonyManager r8 = r13.f10607b     // Catch:{ all -> 0x016c }
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ all -> 0x016c }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x016c }
            r9[r5] = r10     // Catch:{ all -> 0x016c }
            java.lang.Object r7 = r7.invoke(r8, r9)     // Catch:{ all -> 0x016c }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x016c }
            int r7 = r7.intValue()     // Catch:{ all -> 0x016c }
            com.startapp.networkTest.enums.NetworkTypes r7 = d((int) r7)     // Catch:{ all -> 0x016c }
            r1.NetworkType = r7     // Catch:{ all -> 0x016c }
            goto L_0x0170
        L_0x016c:
            r7 = move-exception
            com.startapp.x2.a((java.lang.Throwable) r7)
        L_0x0170:
            if (r2 == 0) goto L_0x017d
            java.lang.String r7 = r2.getNetworkOperatorName()
            java.lang.String r7 = com.startapp.la.a((java.lang.String) r7)
            r1.OperatorName = r7
            goto L_0x019c
        L_0x017d:
            java.lang.reflect.Method r7 = r13.L
            if (r7 == 0) goto L_0x019c
            android.telephony.TelephonyManager r8 = r13.f10607b     // Catch:{ all -> 0x0198 }
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ all -> 0x0198 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x0198 }
            r9[r5] = r10     // Catch:{ all -> 0x0198 }
            java.lang.Object r7 = r7.invoke(r8, r9)     // Catch:{ all -> 0x0198 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0198 }
            java.lang.String r7 = com.startapp.la.a((java.lang.String) r7)     // Catch:{ all -> 0x0198 }
            r1.OperatorName = r7     // Catch:{ all -> 0x0198 }
            goto L_0x019c
        L_0x0198:
            r7 = move-exception
            com.startapp.x2.a((java.lang.Throwable) r7)
        L_0x019c:
            java.lang.String r7 = ""
            if (r2 == 0) goto L_0x01a5
            java.lang.String r2 = r2.getNetworkOperator()
            goto L_0x01d9
        L_0x01a5:
            java.lang.reflect.Method r2 = r13.N
            if (r2 == 0) goto L_0x01bf
            android.telephony.TelephonyManager r8 = r13.f10607b     // Catch:{ all -> 0x01ba }
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ all -> 0x01ba }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x01ba }
            r9[r5] = r10     // Catch:{ all -> 0x01ba }
            java.lang.Object r2 = r2.invoke(r8, r9)     // Catch:{ all -> 0x01ba }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01ba }
            goto L_0x01d9
        L_0x01ba:
            r2 = move-exception
            com.startapp.x2.a((java.lang.Throwable) r2)
            goto L_0x01d8
        L_0x01bf:
            java.lang.reflect.Method r2 = r13.M
            if (r2 == 0) goto L_0x01d8
            android.telephony.TelephonyManager r8 = r13.f10607b     // Catch:{ all -> 0x01d4 }
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ all -> 0x01d4 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x01d4 }
            r9[r5] = r10     // Catch:{ all -> 0x01d4 }
            java.lang.Object r2 = r2.invoke(r8, r9)     // Catch:{ all -> 0x01d4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01d4 }
            goto L_0x01d9
        L_0x01d4:
            r2 = move-exception
            com.startapp.x2.a((java.lang.Throwable) r2)
        L_0x01d8:
            r2 = r7
        L_0x01d9:
            int r8 = r2.length()
            r9 = 4
            if (r8 <= r9) goto L_0x01ec
            java.lang.String r5 = r2.substring(r5, r6)
            r1.MCC = r5
            java.lang.String r2 = r2.substring(r6)
            r1.MNC = r2
        L_0x01ec:
            com.startapp.networkTest.data.radio.NetworkRegistrationInfo[] r2 = r13.g((int) r14)
            com.startapp.j8$j r5 = r13.f10613h
            com.startapp.j8$h r5 = r5.a((int) r14)
            if (r5 != 0) goto L_0x01fd
            com.startapp.j8$h r5 = new com.startapp.j8$h
            r5.<init>(r13, r3)
        L_0x01fd:
            int r3 = android.os.Build.VERSION.SDK_INT
            r6 = 29
            if (r3 >= r6) goto L_0x020d
            android.content.Context r3 = r13.f10609d
            java.lang.String r6 = "android.permission.ACCESS_COARSE_LOCATION"
            int r3 = r3.checkCallingOrSelfPermission(r6)
            if (r3 == 0) goto L_0x0221
        L_0x020d:
            android.content.Context r3 = r13.f10609d
            java.lang.String r6 = "android.permission.ACCESS_FINE_LOCATION"
            int r3 = r3.checkCallingOrSelfPermission(r6)
            if (r3 != 0) goto L_0x022e
            android.content.Context r3 = r13.f10609d
            java.lang.String r6 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            int r3 = r3.checkCallingOrSelfPermission(r6)
            if (r3 != 0) goto L_0x022e
        L_0x0221:
            android.telephony.CellLocation r3 = r5.f10653a
            if (r3 != 0) goto L_0x0230
            android.telephony.TelephonyManager r3 = r13.f10607b
            android.telephony.CellLocation r3 = r3.getCellLocation()
            r5.f10653a = r3
            goto L_0x0230
        L_0x022e:
            r1.MissingPermission = r4
        L_0x0230:
            android.telephony.CellLocation r3 = r5.f10653a
            r8 = 0
            r10 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r3 == 0) goto L_0x031d
            java.lang.Class r3 = r3.getClass()
            java.lang.Class<android.telephony.gsm.GsmCellLocation> r4 = android.telephony.gsm.GsmCellLocation.class
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0289
            android.telephony.CellLocation r3 = r5.f10653a
            android.telephony.gsm.GsmCellLocation r3 = (android.telephony.gsm.GsmCellLocation) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r6 = r3.getLac()
            r4.append(r6)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            r1.GsmLAC = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r6 = r3.getCid()
            r4.append(r6)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            r1.GsmCellId = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r3 = r3.getPsc()
            r4.append(r3)
            r4.append(r7)
            java.lang.String r3 = r4.toString()
            r1.PrimaryScramblingCode = r3
            goto L_0x0304
        L_0x0289:
            android.telephony.CellLocation r3 = r5.f10653a
            java.lang.Class r3 = r3.getClass()
            java.lang.Class<android.telephony.cdma.CdmaCellLocation> r4 = android.telephony.cdma.CdmaCellLocation.class
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0304
            android.telephony.CellLocation r3 = r5.f10653a
            android.telephony.cdma.CdmaCellLocation r3 = (android.telephony.cdma.CdmaCellLocation) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r6 = r3.getBaseStationId()
            r4.append(r6)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            r1.CdmaBaseStationId = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r6 = r3.getBaseStationLatitude()
            r4.append(r6)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            r1.CdmaBaseStationLatitude = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r6 = r3.getBaseStationLongitude()
            r4.append(r6)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            r1.CdmaBaseStationLongitude = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r6 = r3.getNetworkId()
            r4.append(r6)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            r1.CdmaNetworkId = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r3 = r3.getSystemId()
            r4.append(r3)
            r4.append(r7)
            java.lang.String r3 = r4.toString()
            r1.CdmaSystemId = r3
        L_0x0304:
            long r3 = r5.f10654b
            int r6 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0344
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5.f10654b
            long r3 = r3 - r5
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x0319
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x031a
        L_0x0319:
            int r3 = (int) r3
        L_0x031a:
            r1.GsmCellIdAge = r3
            goto L_0x0344
        L_0x031d:
            if (r2 == 0) goto L_0x0344
            int r3 = r2.length
            r4 = 0
        L_0x0321:
            if (r4 >= r3) goto L_0x0344
            r5 = r2[r4]
            java.lang.String r6 = r5.Domain
            java.lang.String r12 = "CS"
            boolean r6 = r6.equals(r12)
            if (r6 == 0) goto L_0x0341
            java.lang.String r6 = r5.CellId
            r1.GsmCellId = r6
            java.lang.String r12 = r5.Tac
            r1.GsmLAC = r12
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0341
            int r5 = r5.Age
            r1.GsmCellIdAge = r5
        L_0x0341:
            int r4 = r4 + 1
            goto L_0x0321
        L_0x0344:
            com.startapp.j8$j r3 = r13.f10613h
            com.startapp.j8$n r3 = r3.d(r14)
            com.startapp.networkTest.enums.ServiceStates r4 = r3.f10676a
            r1.ServiceState = r4
            com.startapp.networkTest.enums.DuplexMode r4 = r3.f10678c
            r1.DuplexMode = r4
            com.startapp.networkTest.enums.ThreeStateShort r4 = r3.f10679d
            r1.ManualSelection = r4
            com.startapp.networkTest.enums.ThreeStateShort r4 = r3.f10681f
            r1.CarrierAggregation = r4
            int r4 = r3.f10680e
            r1.ARFCN = r4
            long r4 = r3.f10677b
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0376
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r8 = r3.f10677b
            long r4 = r4 - r8
            int r3 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x0373
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0374
        L_0x0373:
            int r3 = (int) r4
        L_0x0374:
            r1.ServiceStateAge = r3
        L_0x0376:
            java.lang.String r3 = r13.c((com.startapp.networkTest.data.radio.NetworkRegistrationInfo[]) r2)
            r1.NrState = r3
            com.startapp.networkTest.enums.ThreeStateShort r3 = r13.d((com.startapp.networkTest.data.radio.NetworkRegistrationInfo[]) r2)
            r1.NrAvailable = r3
            com.startapp.networkTest.enums.NetworkTypes r3 = r1.NetworkType
            com.startapp.networkTest.enums.NetworkTypes r4 = com.startapp.networkTest.enums.NetworkTypes.Unknown
            if (r3 != r4) goto L_0x038e
            com.startapp.networkTest.enums.NetworkTypes r3 = r13.b((com.startapp.networkTest.data.radio.NetworkRegistrationInfo[]) r2)
            r1.NetworkType = r3
        L_0x038e:
            com.startapp.j8$j r3 = r13.f10613h
            com.startapp.j8$o r14 = r3.e(r14)
            int r3 = r14.f10692j
            r1.RSCP = r3
            int r3 = r14.f10685c
            r1.CdmaEcIo = r3
            int r3 = r14.f10683a
            r1.RXLevel = r3
            int r4 = r14.f10684b
            r1.NativeDbm = r4
            int r4 = r14.f10691i
            r1.EcN0 = r4
            int r4 = r14.f10686d
            r1.LteCqi = r4
            int r4 = r14.f10687e
            r1.LteRsrp = r4
            int r5 = r14.f10689g
            r1.LteRsrq = r5
            int r5 = r14.f10688f
            r1.LteRssnr = r5
            int r5 = r14.f10690h
            r1.LteRssi = r5
            int r5 = r14.f10694l
            r1.NrCsiRsrp = r5
            int r5 = r14.f10695m
            r1.NrCsiRsrq = r5
            int r5 = r14.f10696n
            r1.NrCsiSinr = r5
            int r5 = r14.f10697o
            r1.NrSsRsrp = r5
            int r5 = r14.f10698p
            r1.NrSsRsrq = r5
            int r5 = r14.f10699q
            r1.NrSsSinr = r5
            com.startapp.networkTest.enums.NetworkTypes r5 = r1.NetworkType
            com.startapp.networkTest.enums.NetworkTypes r6 = com.startapp.networkTest.enums.NetworkTypes.LTE
            if (r5 == r6) goto L_0x03de
            com.startapp.networkTest.enums.NetworkTypes r6 = com.startapp.networkTest.enums.NetworkTypes.LTE_CA
            if (r5 != r6) goto L_0x03e2
        L_0x03de:
            if (r3 <= r0) goto L_0x03e2
            r1.RXLevel = r4
        L_0x03e2:
            com.startapp.networkTest.enums.NetworkTypes r0 = com.startapp.networkTest.enums.NetworkTypes.LTE_CA
            if (r5 != r0) goto L_0x03ea
            com.startapp.networkTest.enums.ThreeStateShort r0 = com.startapp.networkTest.enums.ThreeStateShort.Yes
            r1.CarrierAggregation = r0
        L_0x03ea:
            com.startapp.networkTest.enums.ThreeStateShort r0 = r1.CarrierAggregation
            com.startapp.networkTest.enums.ThreeStateShort r3 = com.startapp.networkTest.enums.ThreeStateShort.Unknown
            if (r0 != r3) goto L_0x03f6
            com.startapp.networkTest.enums.ThreeStateShort r0 = r13.a((com.startapp.networkTest.data.radio.NetworkRegistrationInfo[]) r2)
            r1.CarrierAggregation = r0
        L_0x03f6:
            com.startapp.networkTest.enums.NetworkTypes r0 = r1.NetworkType
            com.startapp.networkTest.enums.NetworkTypes r2 = com.startapp.networkTest.enums.NetworkTypes.NR
            if (r0 != r2) goto L_0x0467
            java.lang.String r0 = r1.MCC     // Catch:{ NumberFormatException -> 0x040b }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x040b }
            java.lang.String r2 = r1.MNC     // Catch:{ NumberFormatException -> 0x0409 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0409 }
            goto L_0x0412
        L_0x0409:
            r2 = move-exception
            goto L_0x040e
        L_0x040b:
            r0 = move-exception
            r2 = r0
            r0 = 0
        L_0x040e:
            com.startapp.x2.b(r2)
            r2 = 0
        L_0x0412:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            com.startapp.j8$j r2 = r13.f10613h
            com.startapp.j8$l r0 = r2.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x0467
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r3 = r0.f10668a
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r1.GsmCellId = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = r0.f10669b
            java.lang.String r2 = v.e.a(r2, r3, r7)
            r1.GsmLAC = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = r0.f10670c
            java.lang.String r2 = v.e.a(r2, r3, r7)
            r1.PrimaryScramblingCode = r2
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r0.f10671d
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 / r6
            long r2 = r2 - r4
            int r0 = (int) r2
            r1.GsmCellIdAge = r0
        L_0x0467:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r14.f10693k
            long r2 = r2 - r4
            int r14 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r14 <= 0) goto L_0x0476
            r14 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0477
        L_0x0476:
            int r14 = (int) r2
        L_0x0477:
            r1.RXLevelAge = r14
        L_0x0479:
            return r1
        L_0x047a:
            com.startapp.networkTest.data.RadioInfo r14 = r13.g()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.j8.h(int):com.startapp.networkTest.data.RadioInfo");
    }

    public NetworkTypes i(int i10) {
        if (k(i10) && c8.b(this.f10609d)) {
            SparseArray<TelephonyManager> sparseArray = this.f10608c;
            if (sparseArray == null || sparseArray.get(i10) == null || Build.VERSION.SDK_INT < 24) {
                Method method = this.f10627v;
                if (method != null) {
                    try {
                        return d(((Integer) method.invoke(this.f10607b, new Object[]{Integer.valueOf(i10)})).intValue());
                    } catch (Throwable th) {
                        x2.a(th);
                    }
                }
            } else {
                try {
                    return d(this.f10608c.get(i10).getVoiceNetworkType());
                } catch (SecurityException e10) {
                    x2.b(e10);
                }
            }
        }
        return k();
    }

    public boolean j(int i10) {
        Method method = this.J;
        if (method == null) {
            return p();
        }
        try {
            return ((Boolean) method.invoke(this.f10607b, new Object[]{Integer.valueOf(i10)})).booleanValue();
        } catch (Throwable th) {
            x2.a(th);
            return p();
        }
    }

    /* access modifiers changed from: private */
    public void a(int[] iArr) {
        this.f10611f = new ArrayList<>();
        for (int pVar : iArr) {
            this.f10611f.add(new p(pVar));
        }
    }

    private void b(Context context) {
        if (this.f10616k == null) {
            this.f10616k = new k(this, (a) null);
        }
        this.f10616k.getClass();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.ANY_DATA_STATE");
        this.f10616k.getClass();
        intentFilter.addAction("com.samsung.ims.action.IMS_REGISTRATION");
        context.registerReceiver(this.f10616k, intentFilter);
    }

    /* compiled from: Sta */
    public class n {

        /* renamed from: a  reason: collision with root package name */
        public ServiceStates f10676a;

        /* renamed from: b  reason: collision with root package name */
        public long f10677b;

        /* renamed from: c  reason: collision with root package name */
        public DuplexMode f10678c;

        /* renamed from: d  reason: collision with root package name */
        public ThreeStateShort f10679d;

        /* renamed from: e  reason: collision with root package name */
        public int f10680e;

        /* renamed from: f  reason: collision with root package name */
        public ThreeStateShort f10681f;

        private n() {
            this.f10676a = ServiceStates.Unknown;
            this.f10677b = 0;
            this.f10678c = DuplexMode.Unknown;
            ThreeStateShort threeStateShort = ThreeStateShort.Unknown;
            this.f10679d = threeStateShort;
            this.f10680e = -1;
            this.f10681f = threeStateShort;
        }

        public /* synthetic */ n(j8 j8Var, a aVar) {
            this();
        }
    }

    @TargetApi(18)
    public com.startapp.networkTest.data.radio.CellInfo[] a(boolean z10) {
        List<CellInfo> list;
        if (this.f10609d.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0 || (this.f10609d.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0 && Build.VERSION.SDK_INT >= 29)) {
            return new com.startapp.networkTest.data.radio.CellInfo[0];
        }
        ArrayList arrayList = new ArrayList();
        TelephonyManager telephonyManager = this.f10607b;
        if (telephonyManager != null && Build.VERSION.SDK_INT >= W) {
            List<CellInfo> list2 = null;
            if (z10 || (list = this.f10617l) == null) {
                try {
                    list2 = telephonyManager.getAllCellInfo();
                } catch (Throwable th) {
                    x2.a(th);
                }
                list = (this.f10617l == null || (list2 != null && !list2.isEmpty())) ? list2 : this.f10617l;
            }
            if (list == null) {
                return new com.startapp.networkTest.data.radio.CellInfo[0];
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            for (CellInfo next : list) {
                com.startapp.networkTest.data.radio.CellInfo cellInfo = new com.startapp.networkTest.data.radio.CellInfo();
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 28) {
                    cellInfo.CellConnectionStatus = f(next.getCellConnectionStatus());
                }
                if (next instanceof CellInfoGsm) {
                    b(next, cellInfo, uptimeMillis);
                } else if (next instanceof CellInfoLte) {
                    c(next, cellInfo, uptimeMillis);
                } else if (next instanceof CellInfoWcdma) {
                    e(next, cellInfo, uptimeMillis);
                } else if (next instanceof CellInfoCdma) {
                    a(next, cellInfo, uptimeMillis);
                } else if (i10 >= 29 && (next instanceof CellInfoNr)) {
                    try {
                        d(next, cellInfo, uptimeMillis);
                    } catch (Throwable th2) {
                        x2.a(th2);
                    }
                }
                arrayList.add(cellInfo);
            }
        }
        return (com.startapp.networkTest.data.radio.CellInfo[]) arrayList.toArray(new com.startapp.networkTest.data.radio.CellInfo[arrayList.size()]);
    }

    @TargetApi(17)
    private void b(CellInfo cellInfo, com.startapp.networkTest.data.radio.CellInfo cellInfo2, long j10) {
        CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
        cellInfo2.IsRegistered = cellInfoGsm.isRegistered();
        cellInfo2.CellNetworkType = CellNetworkTypes.Gsm;
        cellInfo2.CellInfoAge = j10 - (cellInfoGsm.getTimeStamp() / 1000000);
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        if (cellIdentity.getMcc() != Integer.MAX_VALUE) {
            cellInfo2.Mcc = cellIdentity.getMcc();
        }
        if (cellIdentity.getMnc() != Integer.MAX_VALUE) {
            cellInfo2.Mnc = cellIdentity.getMnc();
        }
        if (cellIdentity.getCid() != Integer.MAX_VALUE) {
            int cid = cellIdentity.getCid();
            cellInfo2.Cid = cid;
            cellInfo2.CellId = (long) cid;
        }
        if (cellIdentity.getLac() != Integer.MAX_VALUE) {
            cellInfo2.Lac = cellIdentity.getLac();
        }
        if (cellIdentity.getPsc() != Integer.MAX_VALUE) {
            cellInfo2.Psc = cellIdentity.getPsc();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            if (cellIdentity.getArfcn() != Integer.MAX_VALUE) {
                cellInfo2.Arfcn = cellIdentity.getArfcn();
            }
            if (cellIdentity.getBsic() != Integer.MAX_VALUE) {
                cellInfo2.GsmBsic = cellIdentity.getBsic();
            }
        }
        cellInfo2.Dbm = cellInfoGsm.getCellSignalStrength().getDbm();
    }

    /* compiled from: Sta */
    public class g {

        /* renamed from: a  reason: collision with root package name */
        public int f10641a;

        /* renamed from: b  reason: collision with root package name */
        public String f10642b;

        /* renamed from: c  reason: collision with root package name */
        public String f10643c;

        /* renamed from: d  reason: collision with root package name */
        public String f10644d;

        /* renamed from: e  reason: collision with root package name */
        public String f10645e;

        /* renamed from: f  reason: collision with root package name */
        public String f10646f;

        /* renamed from: g  reason: collision with root package name */
        public int f10647g;

        /* renamed from: h  reason: collision with root package name */
        public long f10648h;

        /* renamed from: i  reason: collision with root package name */
        public long f10649i;

        /* renamed from: j  reason: collision with root package name */
        public String f10650j;

        /* renamed from: k  reason: collision with root package name */
        public WifiDetailedStates f10651k;

        private g() {
            this.f10641a = -1;
            this.f10642b = "";
            this.f10643c = "";
            this.f10644d = "";
            this.f10645e = "";
            this.f10646f = "";
            this.f10647g = -1;
            this.f10648h = -1;
            this.f10649i = -1;
            this.f10650j = "";
            this.f10651k = WifiDetailedStates.Unknown;
        }

        public /* synthetic */ g(j8 j8Var, a aVar) {
            this();
        }
    }

    @TargetApi(29)
    private void d(CellInfo cellInfo, com.startapp.networkTest.data.radio.CellInfo cellInfo2, long j10) {
        CellInfoNr cellInfoNr = (CellInfoNr) cellInfo;
        cellInfo2.IsRegistered = cellInfoNr.isRegistered();
        cellInfo2.CellNetworkType = CellNetworkTypes.Nr;
        cellInfo2.CellInfoAge = j10 - (cellInfoNr.getTimeStamp() / 1000000);
        CellIdentity cellIdentity = cellInfoNr.getCellIdentity();
        if (cellIdentity instanceof CellIdentityNr) {
            CellIdentityNr cellIdentityNr = (CellIdentityNr) cellIdentity;
            cellInfo2.Arfcn = cellIdentityNr.getNrarfcn();
            cellInfo2.LtePci = cellIdentityNr.getPci();
            cellInfo2.LteTac = cellIdentityNr.getTac();
            cellInfo2.CellId = cellIdentityNr.getNci();
            if (cellIdentityNr.getMccString() != null) {
                try {
                    cellInfo2.Mcc = Integer.parseInt(cellIdentityNr.getMccString());
                } catch (NumberFormatException e10) {
                    x2.b(e10);
                }
            }
            if (cellIdentityNr.getMncString() != null) {
                try {
                    cellInfo2.Mnc = Integer.parseInt(cellIdentityNr.getMncString());
                } catch (NumberFormatException e11) {
                    x2.b(e11);
                }
            }
        }
        CellSignalStrength cellSignalStrength = cellInfoNr.getCellSignalStrength();
        if (cellSignalStrength instanceof CellSignalStrengthNr) {
            CellSignalStrengthNr cellSignalStrengthNr = (CellSignalStrengthNr) cellSignalStrength;
            cellInfo2.Dbm = cellSignalStrengthNr.getDbm();
            cellInfo2.NrCsiRsrp = cellSignalStrengthNr.getCsiRsrp();
            cellInfo2.NrCsiRsrq = cellSignalStrengthNr.getCsiRsrq();
            cellInfo2.NrCsiSinr = cellSignalStrengthNr.getCsiSinr();
            cellInfo2.NrSsRsrp = cellSignalStrengthNr.getSsRsrp();
            cellInfo2.NrSsRsrq = cellSignalStrengthNr.getSsRsrq();
            cellInfo2.NrSsSinr = cellSignalStrengthNr.getSsSinr();
        }
    }

    /* compiled from: Sta */
    public class o {

        /* renamed from: a  reason: collision with root package name */
        public int f10683a;

        /* renamed from: b  reason: collision with root package name */
        public int f10684b;

        /* renamed from: c  reason: collision with root package name */
        public int f10685c;

        /* renamed from: d  reason: collision with root package name */
        public int f10686d;

        /* renamed from: e  reason: collision with root package name */
        public int f10687e;

        /* renamed from: f  reason: collision with root package name */
        public int f10688f;

        /* renamed from: g  reason: collision with root package name */
        public int f10689g;

        /* renamed from: h  reason: collision with root package name */
        public int f10690h;

        /* renamed from: i  reason: collision with root package name */
        public int f10691i;

        /* renamed from: j  reason: collision with root package name */
        public int f10692j;

        /* renamed from: k  reason: collision with root package name */
        public long f10693k;

        /* renamed from: l  reason: collision with root package name */
        public int f10694l;

        /* renamed from: m  reason: collision with root package name */
        public int f10695m;

        /* renamed from: n  reason: collision with root package name */
        public int f10696n;

        /* renamed from: o  reason: collision with root package name */
        public int f10697o;

        /* renamed from: p  reason: collision with root package name */
        public int f10698p;

        /* renamed from: q  reason: collision with root package name */
        public int f10699q;

        private o() {
            Integer num = RadioInfo.INVALID;
            this.f10683a = num.intValue();
            this.f10684b = num.intValue();
            this.f10685c = num.intValue();
            this.f10686d = num.intValue();
            this.f10687e = num.intValue();
            this.f10688f = num.intValue();
            this.f10689g = num.intValue();
            this.f10690h = num.intValue();
            this.f10691i = num.intValue();
            this.f10692j = num.intValue();
            this.f10694l = num.intValue();
            this.f10695m = num.intValue();
            this.f10696n = num.intValue();
            this.f10697o = num.intValue();
            this.f10698p = num.intValue();
            this.f10699q = num.intValue();
        }

        public /* synthetic */ o(j8 j8Var, a aVar) {
            this();
        }
    }

    public Future<ApnInfo[]> e() {
        return ThreadManager.b().a().submit(new c());
    }

    private void c(Context context) {
        k kVar;
        if (context != null && (kVar = this.f10616k) != null) {
            try {
                context.unregisterReceiver(kVar);
            } catch (Throwable th) {
                x2.a(th);
            }
        }
    }

    private static PreferredNetworkTypes e(int i10) {
        switch (i10) {
            case 0:
                return PreferredNetworkTypes.WCDMA_PREF;
            case 1:
                return PreferredNetworkTypes.GSM_ONLY;
            case 2:
                return PreferredNetworkTypes.WCDMA_ONLY;
            case 3:
                return PreferredNetworkTypes.GSM_UMTS;
            case 4:
                return PreferredNetworkTypes.CDMA;
            case 5:
                return PreferredNetworkTypes.CDMA_NO_EVDO;
            case 6:
                return PreferredNetworkTypes.EVDO_NO_CDMA;
            case 7:
                return PreferredNetworkTypes.GLOBAL;
            case b4.f10106f:
                return PreferredNetworkTypes.LTE_CDMA_EVDO;
            case 9:
                return PreferredNetworkTypes.LTE_GSM_WCDMA;
            case 10:
                return PreferredNetworkTypes.LTE_CDMA_EVDO_GSM_WCDMA;
            case 11:
                return PreferredNetworkTypes.LTE_ONLY;
            case 12:
                return PreferredNetworkTypes.LTE_WCDMA;
            case 13:
                return PreferredNetworkTypes.TDSCDMA_ONLY;
            case 14:
                return PreferredNetworkTypes.TDSCDMA_WCDMA;
            case 15:
                return PreferredNetworkTypes.LTE_TDSCDMA;
            case U /*16*/:
                return PreferredNetworkTypes.TDSCDMA_GSM;
            case V /*17*/:
                return PreferredNetworkTypes.LTE_TDSCDMA_GSM;
            case W /*18*/:
                return PreferredNetworkTypes.TDSCDMA_GSM_WCDMA;
            case X /*19*/:
                return PreferredNetworkTypes.LTE_TDSCDMA_WCDMA;
            case 20:
                return PreferredNetworkTypes.LTE_TDSCDMA_GSM_WCDMA;
            case 21:
                return PreferredNetworkTypes.TDSCDMA_CDMA_EVDO_GSM_WCDMA;
            case 22:
                return PreferredNetworkTypes.LTE_TDSCDMA_CDMA_EVDO_GSM_WCDMA;
            case 23:
                return PreferredNetworkTypes.NR_ONLY;
            case 24:
                return PreferredNetworkTypes.NR_LTE;
            case 25:
                return PreferredNetworkTypes.NR_LTE_CDMA_EVDO;
            case 26:
                return PreferredNetworkTypes.NR_LTE_GSM_WCDMA;
            case 27:
                return PreferredNetworkTypes.NR_LTE_CDMA_EVDO_GSM_WCDMA;
            case 28:
                return PreferredNetworkTypes.NR_LTE_WCDMA;
            case 29:
                return PreferredNetworkTypes.NR_LTE_TDSCDMA;
            case 30:
                return PreferredNetworkTypes.NR_LTE_TDSCDMA_GSM;
            case 31:
                return PreferredNetworkTypes.NR_LTE_TDSCDMA_WCDMA;
            case 32:
                return PreferredNetworkTypes.NR_LTE_TDSCDMA_GSM_WCDMA;
            case 33:
                return PreferredNetworkTypes.NR_LTE_TDSCDMA_CDMA_EVDO_GSM_WCDMA;
            default:
                return PreferredNetworkTypes.Unknown;
        }
    }

    @TargetApi(18)
    public com.startapp.networkTest.data.radio.CellInfo[] c() {
        return a(true);
    }

    @TargetApi(17)
    private void c(CellInfo cellInfo, com.startapp.networkTest.data.radio.CellInfo cellInfo2, long j10) {
        CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
        cellInfo2.IsRegistered = cellInfoLte.isRegistered();
        cellInfo2.CellNetworkType = CellNetworkTypes.Lte;
        cellInfo2.CellInfoAge = j10 - (cellInfoLte.getTimeStamp() / 1000000);
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        if (cellIdentity.getMcc() != Integer.MAX_VALUE) {
            cellInfo2.Mcc = cellIdentity.getMcc();
        }
        if (cellIdentity.getMnc() != Integer.MAX_VALUE) {
            cellInfo2.Mnc = cellIdentity.getMnc();
        }
        if (cellIdentity.getCi() != Integer.MAX_VALUE) {
            int ci = cellIdentity.getCi();
            cellInfo2.Cid = ci;
            cellInfo2.CellId = (long) ci;
        }
        if (cellIdentity.getPci() != Integer.MAX_VALUE) {
            cellInfo2.LtePci = cellIdentity.getPci();
        }
        if (cellIdentity.getTac() != Integer.MAX_VALUE) {
            cellInfo2.LteTac = cellIdentity.getTac();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24 && cellIdentity.getEarfcn() != Integer.MAX_VALUE) {
            int earfcn = cellIdentity.getEarfcn();
            cellInfo2.Arfcn = earfcn;
            d6 a10 = LteFrequencyUtil.a(earfcn);
            if (a10 != null) {
                cellInfo2.LteBand = a10.band;
                cellInfo2.LteUploadEarfcn = a10.upload_earfcn;
                cellInfo2.LteDownloadEarfcn = a10.download_earfcn;
                cellInfo2.LteUploadFrequency = a10.upload_frequency;
                cellInfo2.LteDonwloadFrequency = a10.download_frequency;
            }
        }
        CellSignalStrengthLte cellSignalStrength = cellInfoLte.getCellSignalStrength();
        cellInfo2.Dbm = cellSignalStrength.getDbm();
        if (cellSignalStrength.getTimingAdvance() != Integer.MAX_VALUE) {
            cellInfo2.LteTimingAdvance = cellSignalStrength.getTimingAdvance();
        }
        if (i10 >= 29) {
            int cqi = cellSignalStrength.getCqi();
            if (cqi != Integer.MAX_VALUE) {
                cellInfo2.LteCqi = cqi;
            }
            cellInfo2.LteRssnr = cellSignalStrength.getRssnr();
            cellInfo2.LteRsrq = cellSignalStrength.getRsrq();
            cellInfo2.LteRssi = cellSignalStrength.getRssi();
            return;
        }
        Field field = this.G;
        if (field != null) {
            try {
                int i11 = field.getInt(cellSignalStrength);
                if (i11 != Integer.MAX_VALUE) {
                    cellInfo2.LteCqi = i11;
                }
            } catch (Throwable th) {
                x2.a(th);
            }
        }
        Field field2 = this.E;
        if (field2 != null) {
            try {
                cellInfo2.LteRsrq = field2.getInt(cellSignalStrength);
            } catch (Throwable th2) {
                x2.a(th2);
            }
        }
        Field field3 = this.F;
        if (field3 != null) {
            try {
                cellInfo2.LteRssnr = field3.getInt(cellSignalStrength);
            } catch (Throwable th3) {
                x2.a(th3);
            }
        }
        Field field4 = this.D;
        if (field4 != null) {
            try {
                cellInfo2.LteRssi = field4.getInt(cellSignalStrength);
            } catch (Throwable th4) {
                x2.a(th4);
            }
        }
    }

    public static NetworkGenerations b(NetworkTypes networkTypes) {
        switch (f.f10639a[networkTypes.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return NetworkGenerations.Gen2;
            case 7:
            case b4.f10106f:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case U /*16*/:
                return NetworkGenerations.Gen3;
            case V /*17*/:
            case W /*18*/:
                return NetworkGenerations.Gen4;
            case X /*19*/:
                return NetworkGenerations.Gen5;
            default:
                return NetworkGenerations.Unknown;
        }
    }

    @TargetApi(17)
    private void a(CellInfo cellInfo, com.startapp.networkTest.data.radio.CellInfo cellInfo2, long j10) {
        CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
        cellInfo2.IsRegistered = cellInfoCdma.isRegistered();
        cellInfo2.CellNetworkType = CellNetworkTypes.Gsm;
        cellInfo2.CellInfoAge = j10 - (cellInfoCdma.getTimeStamp() / 1000000);
        CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
        cellInfo2.CdmaBaseStationLatitude = cellIdentity.getLatitude();
        cellInfo2.CdmaBaseStationLongitude = cellIdentity.getLongitude();
        if (cellIdentity.getSystemId() != Integer.MAX_VALUE) {
            cellInfo2.CdmaSystemId = cellIdentity.getSystemId();
        }
        if (cellIdentity.getNetworkId() != Integer.MAX_VALUE) {
            cellInfo2.CdmaNetworkId = cellIdentity.getNetworkId();
        }
        if (cellIdentity.getBasestationId() != Integer.MAX_VALUE) {
            cellInfo2.CdmaBaseStationId = cellIdentity.getBasestationId();
        }
        CellSignalStrengthCdma cellSignalStrength = cellInfoCdma.getCellSignalStrength();
        cellInfo2.Dbm = cellSignalStrength.getDbm();
        cellInfo2.CdmaDbm = cellSignalStrength.getCdmaDbm();
        cellInfo2.CdmaEcio = cellSignalStrength.getCdmaEcio();
        cellInfo2.EvdoDbm = cellSignalStrength.getEvdoDbm();
        cellInfo2.EvdoEcio = cellSignalStrength.getEvdoEcio();
        cellInfo2.EvdoSnr = cellSignalStrength.getEvdoSnr();
    }

    public void b(k8 k8Var) {
        if (k8Var == null) {
            return;
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            this.Q.remove(k8Var);
        } else {
            this.f10606a.post(new g9(new e(k8Var)));
        }
    }

    public ConnectionTypes d() {
        NetworkInfo activeNetworkInfo;
        ConnectionTypes connectionTypes = ConnectionTypes.Unknown;
        if (this.f10612g == null || this.f10609d.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || (activeNetworkInfo = this.f10612g.getActiveNetworkInfo()) == null) {
            return connectionTypes;
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            return ConnectionTypes.Mobile;
        }
        if (type == 1) {
            return ConnectionTypes.WiFi;
        }
        if (type == 6) {
            return ConnectionTypes.WiMAX;
        }
        if (type == 7) {
            return ConnectionTypes.Bluetooth;
        }
        if (type != 9) {
            return connectionTypes;
        }
        return ConnectionTypes.Ethernet;
    }

    public y6 b() {
        return this.f10615j;
    }

    public NetworkTypes b(NetworkRegistrationInfo[] networkRegistrationInfoArr) {
        if (networkRegistrationInfoArr != null) {
            for (NetworkRegistrationInfo networkRegistrationInfo : networkRegistrationInfoArr) {
                if (networkRegistrationInfo.Domain.equals("PS")) {
                    return a(networkRegistrationInfo.NetworkTechnology);
                }
            }
        }
        return NetworkTypes.Unknown;
    }

    public static NetworkTypes d(int i10) {
        switch (i10) {
            case 1:
                return NetworkTypes.GPRS;
            case 2:
                return NetworkTypes.EDGE;
            case 3:
                return NetworkTypes.UMTS;
            case 4:
                return NetworkTypes.CDMA;
            case 5:
                return NetworkTypes.EVDO_0;
            case 6:
                return NetworkTypes.EVDO_A;
            case 7:
                return NetworkTypes.Cdma1xRTT;
            case b4.f10106f:
                return NetworkTypes.HSDPA;
            case 9:
                return NetworkTypes.HSUPA;
            case 10:
                return NetworkTypes.HSPA;
            case 11:
                return NetworkTypes.IDEN;
            case 12:
                return NetworkTypes.EVDO_B;
            case 13:
                return NetworkTypes.LTE;
            case 14:
                return NetworkTypes.EHRPD;
            case 15:
                return NetworkTypes.HSPAP;
            case U /*16*/:
                return NetworkTypes.GSM;
            case V /*17*/:
                return NetworkTypes.TD_SCDMA;
            case W /*18*/:
                return NetworkTypes.WiFi;
            case X /*19*/:
                return NetworkTypes.LTE_CA;
            case 20:
                return NetworkTypes.NR;
            default:
                return NetworkTypes.Unknown;
        }
    }

    @TargetApi(21)
    public ApnInfo[] a() {
        m c10;
        ArrayList arrayList = new ArrayList();
        for (g next : q()) {
            ApnInfo apnInfo = new ApnInfo();
            apnInfo.Apn = next.f10642b;
            apnInfo.TxBytes = next.f10648h;
            apnInfo.RxBytes = next.f10649i;
            apnInfo.ApnTypes = next.f10644d;
            apnInfo.Capabilities = next.f10645e;
            apnInfo.SubscriptionId = next.f10647g;
            apnInfo.PcscfAddresses = next.f10646f;
            apnInfo.MobileDataConnectionState = next.f10651k;
            apnInfo.NetworkType = d(next.f10641a);
            apnInfo.Reason = this.f10613h.a(next.f10647g, next.f10644d);
            if (apnInfo.ApnTypes.contains("ims") && (c10 = this.f10613h.c(next.f10647g)) != null) {
                apnInfo.SamsungSipError = c10.f10673a;
                apnInfo.SamsungImsServices = c10.f10674b;
            }
            arrayList.add(apnInfo);
        }
        return (ApnInfo[]) arrayList.toArray(new ApnInfo[arrayList.size()]);
    }

    public ThreeStateShort d(NetworkRegistrationInfo[] networkRegistrationInfoArr) {
        if (networkRegistrationInfoArr != null) {
            for (NetworkRegistrationInfo networkRegistrationInfo : networkRegistrationInfoArr) {
                if (networkRegistrationInfo.Domain.equals("PS") && networkRegistrationInfo.TransportType.equals("WWAN")) {
                    return networkRegistrationInfo.NrAvailable;
                }
            }
        }
        return ThreeStateShort.Unknown;
    }

    public String c(NetworkRegistrationInfo[] networkRegistrationInfoArr) {
        if (networkRegistrationInfoArr == null) {
            return "Unknown";
        }
        for (NetworkRegistrationInfo networkRegistrationInfo : networkRegistrationInfoArr) {
            if (networkRegistrationInfo.Domain.equals("PS") && networkRegistrationInfo.TransportType.equals("WWAN")) {
                return networkRegistrationInfo.NrState;
            }
        }
        return "Unknown";
    }

    private boolean a(com.startapp.networkTest.data.radio.CellInfo cellInfo, RadioInfo radioInfo) {
        try {
            if (radioInfo.MCC.isEmpty() || radioInfo.MNC.isEmpty() || !cellInfo.IsRegistered || cellInfo.Mcc != Integer.parseInt(radioInfo.MCC) || cellInfo.Mnc != Integer.parseInt(radioInfo.MNC)) {
                return false;
            }
            NetworkTypes i10 = i(radioInfo.SubscriptionId);
            NetworkTypes networkTypes = NetworkTypes.Unknown;
            if (i10 == networkTypes) {
                i10 = radioInfo.NetworkType;
            }
            if (i10 == networkTypes || cellInfo.CellNetworkType == a(i10)) {
                return true;
            }
            return false;
        } catch (NumberFormatException e10) {
            x2.b(e10);
            return false;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.startapp.networkTest.enums.NetworkTypes a(java.lang.String r1) {
        /*
            r1.getClass()
            int r0 = r1.hashCode()
            switch(r0) {
                case -2039427040: goto L_0x0101;
                case -908593671: goto L_0x00f6;
                case 2500: goto L_0x00eb;
                case 70881: goto L_0x00e0;
                case 75709: goto L_0x00d5;
                case 2063797: goto L_0x00ca;
                case 2123197: goto L_0x00bf;
                case 2194666: goto L_0x00b4;
                case 2227260: goto L_0x00a6;
                case 2608919: goto L_0x0098;
                case 3195620: goto L_0x008a;
                case 69034058: goto L_0x007c;
                case 69045140: goto L_0x006e;
                case 69050395: goto L_0x0060;
                case 70083979: goto L_0x0052;
                case 836263277: goto L_0x0044;
                case 882856261: goto L_0x0036;
                case 893165057: goto L_0x0028;
                case 893165074: goto L_0x001a;
                case 893165075: goto L_0x000c;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x010c
        L_0x000c:
            java.lang.String r0 = "CDMA - EvDo rev. B"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0016
            goto L_0x010c
        L_0x0016:
            r1 = 19
            goto L_0x010d
        L_0x001a:
            java.lang.String r0 = "CDMA - EvDo rev. A"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0024
            goto L_0x010c
        L_0x0024:
            r1 = 18
            goto L_0x010d
        L_0x0028:
            java.lang.String r0 = "CDMA - EvDo rev. 0"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0032
            goto L_0x010c
        L_0x0032:
            r1 = 17
            goto L_0x010d
        L_0x0036:
            java.lang.String r0 = "CDMA - eHRPD"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0040
            goto L_0x010c
        L_0x0040:
            r1 = 16
            goto L_0x010d
        L_0x0044:
            java.lang.String r0 = "CDMA - 1xRTT"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x004e
            goto L_0x010c
        L_0x004e:
            r1 = 15
            goto L_0x010d
        L_0x0052:
            java.lang.String r0 = "IWLAN"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x005c
            goto L_0x010c
        L_0x005c:
            r1 = 14
            goto L_0x010d
        L_0x0060:
            java.lang.String r0 = "HSUPA"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x006a
            goto L_0x010c
        L_0x006a:
            r1 = 13
            goto L_0x010d
        L_0x006e:
            java.lang.String r0 = "HSPAP"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0078
            goto L_0x010c
        L_0x0078:
            r1 = 12
            goto L_0x010d
        L_0x007c:
            java.lang.String r0 = "HSDPA"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0086
            goto L_0x010c
        L_0x0086:
            r1 = 11
            goto L_0x010d
        L_0x008a:
            java.lang.String r0 = "iDEN"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0094
            goto L_0x010c
        L_0x0094:
            r1 = 10
            goto L_0x010d
        L_0x0098:
            java.lang.String r0 = "UMTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x00a2
            goto L_0x010c
        L_0x00a2:
            r1 = 9
            goto L_0x010d
        L_0x00a6:
            java.lang.String r0 = "HSPA"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x00b0
            goto L_0x010c
        L_0x00b0:
            r1 = 8
            goto L_0x010d
        L_0x00b4:
            java.lang.String r0 = "GPRS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x00bd
            goto L_0x010c
        L_0x00bd:
            r1 = 7
            goto L_0x010d
        L_0x00bf:
            java.lang.String r0 = "EDGE"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x00c8
            goto L_0x010c
        L_0x00c8:
            r1 = 6
            goto L_0x010d
        L_0x00ca:
            java.lang.String r0 = "CDMA"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x00d3
            goto L_0x010c
        L_0x00d3:
            r1 = 5
            goto L_0x010d
        L_0x00d5:
            java.lang.String r0 = "LTE"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x00de
            goto L_0x010c
        L_0x00de:
            r1 = 4
            goto L_0x010d
        L_0x00e0:
            java.lang.String r0 = "GSM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x00e9
            goto L_0x010c
        L_0x00e9:
            r1 = 3
            goto L_0x010d
        L_0x00eb:
            java.lang.String r0 = "NR"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x00f4
            goto L_0x010c
        L_0x00f4:
            r1 = 2
            goto L_0x010d
        L_0x00f6:
            java.lang.String r0 = "TD_SCDMA"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x00ff
            goto L_0x010c
        L_0x00ff:
            r1 = 1
            goto L_0x010d
        L_0x0101:
            java.lang.String r0 = "LTE_CA"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x010a
            goto L_0x010c
        L_0x010a:
            r1 = 0
            goto L_0x010d
        L_0x010c:
            r1 = -1
        L_0x010d:
            switch(r1) {
                case 0: goto L_0x014c;
                case 1: goto L_0x0149;
                case 2: goto L_0x0146;
                case 3: goto L_0x0143;
                case 4: goto L_0x0140;
                case 5: goto L_0x013d;
                case 6: goto L_0x013a;
                case 7: goto L_0x0137;
                case 8: goto L_0x0134;
                case 9: goto L_0x0131;
                case 10: goto L_0x012e;
                case 11: goto L_0x012b;
                case 12: goto L_0x0128;
                case 13: goto L_0x0125;
                case 14: goto L_0x0122;
                case 15: goto L_0x011f;
                case 16: goto L_0x011c;
                case 17: goto L_0x0119;
                case 18: goto L_0x0116;
                case 19: goto L_0x0113;
                default: goto L_0x0110;
            }
        L_0x0110:
            com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.Unknown
            return r1
        L_0x0113:
            com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.EVDO_B
            return r1
        L_0x0116:
            com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.EVDO_A
            return r1
        L_0x0119:
            com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.EVDO_0
            return r1
        L_0x011c:
            com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.EHRPD
            return r1
        L_0x011f:
            com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.Cdma1xRTT
            return r1
        L_0x0122:
            com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.WiFi
            return r1
        L_0x0125:
            com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.HSUPA
            return r1
        L_0x0128:
            com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.HSPAP
            return r1
        L_0x012b:
            com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.HSDPA
            return r1
        L_0x012e:
            com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.IDEN
            return r1
        L_0x0131:
            com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.UMTS
            return r1
        L_0x0134:
            com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.HSPA
            return r1
        L_0x0137:
            com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.GPRS
            return r1
        L_0x013a:
            com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.EDGE
            return r1
        L_0x013d:
            com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.CDMA
            return r1
        L_0x0140:
            com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.LTE
            return r1
        L_0x0143:
            com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.GSM
            return r1
        L_0x0146:
            com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.NR
            return r1
        L_0x0149:
            com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.TD_SCDMA
            return r1
        L_0x014c:
            com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.LTE_CA
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.j8.a(java.lang.String):com.startapp.networkTest.enums.NetworkTypes");
    }

    private static CellNetworkTypes a(NetworkTypes networkTypes) {
        if (networkTypes == NetworkTypes.CDMA) {
            return CellNetworkTypes.Cdma;
        }
        int i10 = f.f10640b[b(networkTypes).ordinal()];
        if (i10 == 1) {
            return CellNetworkTypes.Gsm;
        }
        if (i10 == 2) {
            return CellNetworkTypes.Wcdma;
        }
        if (i10 == 3) {
            return CellNetworkTypes.Lte;
        }
        if (i10 != 4) {
            return CellNetworkTypes.Unknown;
        }
        return CellNetworkTypes.Nr;
    }

    public static SignalStrengths a(RadioInfo radioInfo) {
        int i10;
        if (radioInfo == null) {
            return SignalStrengths.Unknown;
        }
        int i11 = radioInfo.RXLevel;
        NetworkGenerations b10 = b(radioInfo.NetworkType);
        NetworkGenerations networkGenerations = NetworkGenerations.Gen5;
        if (b10 == networkGenerations && (i10 = radioInfo.NrCsiRsrp) < -1) {
            i11 = i10;
        }
        if (i11 == 0) {
            return SignalStrengths.Unknown;
        }
        y4 b11 = a5.b();
        int[] STATSMANAGER_SIGNAL_STRENGTH_MAPPING_2G = b11.STATSMANAGER_SIGNAL_STRENGTH_MAPPING_2G();
        int[] STATSMANAGER_SIGNAL_STRENGTH_MAPPING_3G = b11.STATSMANAGER_SIGNAL_STRENGTH_MAPPING_3G();
        int[] STATSMANAGER_SIGNAL_STRENGTH_MAPPING_4G = b11.STATSMANAGER_SIGNAL_STRENGTH_MAPPING_4G();
        int[] STATSMANAGER_SIGNAL_STRENGTH_MAPPING_5G = b11.STATSMANAGER_SIGNAL_STRENGTH_MAPPING_5G();
        if (b10 == NetworkGenerations.Gen2) {
            if (i11 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_2G[0]) {
                return SignalStrengths.Excellent;
            }
            if (i11 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_2G[1]) {
                return SignalStrengths.Good;
            }
            if (i11 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_2G[2]) {
                return SignalStrengths.Fair;
            }
            if (i11 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_2G[3]) {
                return SignalStrengths.Poor;
            }
            return SignalStrengths.Bad;
        } else if (b10 == NetworkGenerations.Gen3) {
            if (i11 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_3G[0]) {
                return SignalStrengths.Excellent;
            }
            if (i11 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_3G[1]) {
                return SignalStrengths.Good;
            }
            if (i11 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_3G[2]) {
                return SignalStrengths.Fair;
            }
            if (i11 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_3G[3]) {
                return SignalStrengths.Poor;
            }
            return SignalStrengths.Bad;
        } else if (b10 == NetworkGenerations.Gen4) {
            if (i11 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_4G[0]) {
                return SignalStrengths.Excellent;
            }
            if (i11 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_4G[1]) {
                return SignalStrengths.Good;
            }
            if (i11 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_4G[2]) {
                return SignalStrengths.Fair;
            }
            if (i11 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_4G[3]) {
                return SignalStrengths.Poor;
            }
            return SignalStrengths.Bad;
        } else if (b10 != networkGenerations) {
            return SignalStrengths.Unknown;
        } else {
            if (i11 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_5G[0]) {
                return SignalStrengths.Excellent;
            }
            if (i11 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_5G[1]) {
                return SignalStrengths.Good;
            }
            if (i11 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_5G[2]) {
                return SignalStrengths.Fair;
            }
            if (i11 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_5G[3]) {
                return SignalStrengths.Poor;
            }
            return SignalStrengths.Bad;
        }
    }

    public NetworkRegistrationInfo[] g(int i10) {
        NetworkRegistrationInfo[] b10 = this.f10613h.b(i10);
        if (b10 == null) {
            return new NetworkRegistrationInfo[0];
        }
        n d10 = this.f10613h.d(i10);
        for (NetworkRegistrationInfo networkRegistrationInfo : b10) {
            if (d10 != null && d10.f10677b > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - d10.f10677b;
                networkRegistrationInfo.Age = elapsedRealtime > 2147483647L ? Integer.MAX_VALUE : (int) elapsedRealtime;
            }
        }
        return b10;
    }

    private PreferredNetworkTypes a(Context context, int i10) {
        PreferredNetworkTypes preferredNetworkTypes = PreferredNetworkTypes.Unknown;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            return e(Settings.Global.getInt(contentResolver, "preferred_network_mode" + i10));
        } catch (Throwable th) {
            x2.a(th);
            return preferredNetworkTypes;
        }
    }

    private SparseArray<PreferredNetworkTypes> a(Context context) {
        SparseArray<PreferredNetworkTypes> sparseArray = new SparseArray<>();
        try {
            String[] split = Settings.Global.getString(context.getContentResolver(), "preferred_network_mode").split(",");
            for (int i10 = 0; i10 < split.length; i10++) {
                sparseArray.put(i10, e(Integer.valueOf(split[i10]).intValue()));
            }
        } catch (Throwable th) {
            x2.a(th);
        }
        return sparseArray;
    }

    public void a(k8 k8Var) {
        if (k8Var == null) {
            return;
        }
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            this.f10606a.post(new g9(new d(k8Var)));
        } else if (!this.Q.contains(k8Var)) {
            this.Q.add(k8Var);
        }
    }

    public ThreeStateShort a(NetworkRegistrationInfo[] networkRegistrationInfoArr) {
        if (networkRegistrationInfoArr != null) {
            for (NetworkRegistrationInfo networkRegistrationInfo : networkRegistrationInfoArr) {
                if (networkRegistrationInfo.Domain.equals("PS")) {
                    return networkRegistrationInfo.CarrierAggregation;
                }
            }
        }
        return ThreeStateShort.Unknown;
    }
}
