package com.startapp.networkTest.startapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.telephony.CellLocation;
import android.telephony.ServiceState;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import com.startapp.b7;
import com.startapp.k8;
import com.startapp.networkTest.controller.LocationController;
import com.startapp.networkTest.data.LocationInfo;
import com.startapp.networkTest.enums.LocationProviders;
import com.startapp.networkTest.enums.TriggerEvents;
import com.startapp.networkTest.results.NetworkInformationResult;
import com.startapp.networkTest.threads.ThreadManager;
import com.startapp.x2;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class CoverageMapperManager implements LocationController.c, k8 {
    private static final int A = 1000;
    private static final int B = 2000;

    /* renamed from: s  reason: collision with root package name */
    private static final String f11428s = "CoverageMapperManager";

    /* renamed from: t  reason: collision with root package name */
    private static final long f11429t = 1;

    /* renamed from: u  reason: collision with root package name */
    private static final long f11430u = 10000;

    /* renamed from: v  reason: collision with root package name */
    private static final long f11431v = 10000;

    /* renamed from: w  reason: collision with root package name */
    private static final int f11432w = 500;

    /* renamed from: x  reason: collision with root package name */
    private static final int f11433x = 10000;

    /* renamed from: y  reason: collision with root package name */
    private static final int f11434y = 1000;

    /* renamed from: z  reason: collision with root package name */
    private static final int f11435z = 1000;

    /* renamed from: a  reason: collision with root package name */
    private Context f11436a;

    /* renamed from: b  reason: collision with root package name */
    private b7 f11437b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11438c = false;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public long f11439d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public ScheduledFuture<?> f11440e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public ScheduledFuture<?> f11441f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public ScheduledFuture<?> f11442g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public long f11443h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public long f11444i;

    /* renamed from: j  reason: collision with root package name */
    private int f11445j = -1;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public long f11446k;

    /* renamed from: l  reason: collision with root package name */
    private int f11447l = -1;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public long f11448m;

    /* renamed from: n  reason: collision with root package name */
    private OnNetworkInfoResultListener f11449n;

    /* renamed from: o  reason: collision with root package name */
    private Runnable f11450o = new b();

    /* renamed from: p  reason: collision with root package name */
    private Runnable f11451p = new c();

    /* renamed from: q  reason: collision with root package name */
    private Runnable f11452q = new d();

    /* renamed from: r  reason: collision with root package name */
    private BroadcastReceiver f11453r = new e();

    /* compiled from: Sta */
    public interface OnNetworkInfoResultListener {
        void onNetworkInfoResult(NetworkInformationResult networkInformationResult);
    }

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LocationInfo f11454a;

        public a(LocationInfo locationInfo) {
            this.f11454a = locationInfo;
        }

        public void run() {
            CoverageMapperManager.this.a(this.f11454a, TriggerEvents.LocationUpdateGps, false);
        }
    }

    /* compiled from: Sta */
    public class b implements Runnable {
        public b() {
        }

        public void run() {
            CoverageMapperManager.this.a((LocationInfo) null, TriggerEvents.OutOfService, true);
            if (CoverageMapperManager.this.f11443h + 10000 < SystemClock.elapsedRealtime()) {
                CoverageMapperManager.this.f11440e.cancel(false);
            }
        }
    }

    /* compiled from: Sta */
    public class c implements Runnable {
        public c() {
        }

        public void run() {
            CoverageMapperManager.this.a((LocationInfo) null, TriggerEvents.CellIdChange, true);
            if (CoverageMapperManager.this.f11446k + CoverageMapperManager.f11429t < SystemClock.elapsedRealtime()) {
                CoverageMapperManager.this.f11441f.cancel(false);
            }
        }
    }

    /* compiled from: Sta */
    public class d implements Runnable {
        public d() {
        }

        public void run() {
            if (SystemClock.elapsedRealtime() > CoverageMapperManager.this.f11439d + 2000) {
                CoverageMapperManager.this.a((LocationInfo) null, TriggerEvents.Foreground, false);
            }
            if (CoverageMapperManager.this.f11448m + 10000 < SystemClock.elapsedRealtime()) {
                CoverageMapperManager.this.f11442g.cancel(false);
            }
        }
    }

    /* compiled from: Sta */
    public class e extends BroadcastReceiver {
        public e() {
        }

        public void onReceive(Context context, Intent intent) {
            long unused = CoverageMapperManager.this.f11444i = SystemClock.elapsedRealtime();
        }
    }

    public CoverageMapperManager(Context context) {
        this.f11437b = new b7(context);
        this.f11436a = context;
    }

    private void d() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f11444i + 10000 <= elapsedRealtime) {
            this.f11443h = elapsedRealtime;
            ScheduledFuture<?> scheduledFuture = this.f11440e;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.f11440e = ThreadManager.b().d().scheduleWithFixedDelay(this.f11450o, 0, 1000, TimeUnit.MILLISECONDS);
            }
        }
    }

    public void b() {
        if (!this.f11438c) {
            this.f11438c = true;
            this.f11437b.a((k8) this);
            this.f11437b.a((LocationController.c) this);
            this.f11437b.e();
            IntentFilter intentFilter = new IntentFilter("android.intent.action.AIRPLANE_MODE");
            intentFilter.addAction("android.intent.action.ACTION_SHUTDOWN");
            this.f11436a.registerReceiver(this.f11453r, intentFilter);
        }
    }

    public void c() {
        this.f11448m = SystemClock.elapsedRealtime();
        ScheduledFuture<?> scheduledFuture = this.f11442g;
        if (scheduledFuture == null || scheduledFuture.isDone()) {
            this.f11442g = ThreadManager.b().d().scheduleWithFixedDelay(this.f11452q, 0, 1000, TimeUnit.MILLISECONDS);
        }
    }

    public void e() {
        if (this.f11438c) {
            this.f11437b.b(this);
            this.f11437b.c();
            this.f11437b.f();
            try {
                this.f11436a.unregisterReceiver(this.f11453r);
            } catch (Throwable th) {
                x2.a(th);
            }
            this.f11438c = false;
        }
    }

    public void f() {
        ScheduledFuture<?> scheduledFuture = this.f11442g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public void a(OnNetworkInfoResultListener onNetworkInfoResultListener) {
        this.f11449n = onNetworkInfoResultListener;
    }

    public void a(LocationInfo locationInfo) {
        if (locationInfo.LocationProvider == LocationProviders.Gps) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime >= this.f11439d + 500) {
                this.f11439d = elapsedRealtime;
                ThreadManager.b().a().execute(new a(locationInfo));
            }
        }
    }

    public void a(ServiceState serviceState, int i10) {
        if (this.f11437b.b().b().DefaultDataSimId == i10) {
            int state = serviceState.getState();
            if (state == 1 && this.f11445j == 0) {
                d();
            }
            this.f11445j = state;
        }
    }

    public void a(CellLocation cellLocation, int i10) {
        int i11;
        if (this.f11437b.b().b().DefaultDataSimId == i10 && cellLocation != null) {
            if (cellLocation.getClass().equals(GsmCellLocation.class)) {
                i11 = ((GsmCellLocation) cellLocation).getCid();
            } else {
                i11 = cellLocation.getClass().equals(CdmaCellLocation.class) ? ((CdmaCellLocation) cellLocation).getBaseStationId() : -1;
            }
            int i12 = this.f11447l;
            if (i11 != i12 && i12 != -1 && i11 > 0 && i11 != Integer.MAX_VALUE) {
                this.f11447l = i11;
                a();
            } else if (i11 > 0 && i11 < Integer.MAX_VALUE) {
                this.f11447l = i11;
            }
        }
    }

    private void a() {
        this.f11446k = SystemClock.elapsedRealtime();
        ScheduledFuture<?> scheduledFuture = this.f11441f;
        if (scheduledFuture == null || scheduledFuture.isDone()) {
            this.f11441f = ThreadManager.b().d().scheduleWithFixedDelay(this.f11451p, 0, 1000, TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: private */
    public void a(LocationInfo locationInfo, TriggerEvents triggerEvents, boolean z10) {
        NetworkInformationResult networkInformationResult;
        if (locationInfo == null) {
            networkInformationResult = this.f11437b.a(triggerEvents, z10);
        } else {
            networkInformationResult = this.f11437b.a(locationInfo, triggerEvents, z10);
        }
        OnNetworkInfoResultListener onNetworkInfoResultListener = this.f11449n;
        if (onNetworkInfoResultListener != null) {
            onNetworkInfoResultListener.onNetworkInfoResult(networkInformationResult);
        }
    }
}
