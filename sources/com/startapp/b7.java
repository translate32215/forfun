package com.startapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.startapp.networkTest.controller.LocationController;
import com.startapp.networkTest.data.LocationInfo;
import com.startapp.networkTest.data.RadioInfo;
import com.startapp.networkTest.data.TimeInfo;
import com.startapp.networkTest.enums.NetworkTypes;
import com.startapp.networkTest.enums.TriggerEvents;
import com.startapp.networkTest.enums.voice.CallStates;
import com.startapp.networkTest.results.NetworkInformationResult;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: Sta */
public class b7 {

    /* renamed from: n  reason: collision with root package name */
    private static final String f10140n = "b7";

    /* renamed from: o  reason: collision with root package name */
    private static final boolean f10141o = false;

    /* renamed from: p  reason: collision with root package name */
    private static final int f10142p = 30000;

    /* renamed from: q  reason: collision with root package name */
    private static final String f10143q = "p3insnir";

    /* renamed from: r  reason: collision with root package name */
    private static final String f10144r = "P3INS_PFK_NIR_FIRSTCELLID_LATITUDE";

    /* renamed from: s  reason: collision with root package name */
    private static final String f10145s = "P3INS_PFK_NIR_FIRSTCELLID_LONGITUDE";

    /* renamed from: t  reason: collision with root package name */
    private static final String f10146t = "P3INS_PFK_NIR_FIRSTCELLID_GSMCELLID";

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f10147a;

    /* renamed from: b  reason: collision with root package name */
    private Context f10148b;

    /* renamed from: c  reason: collision with root package name */
    private b5 f10149c;

    /* renamed from: d  reason: collision with root package name */
    private String f10150d;

    /* renamed from: e  reason: collision with root package name */
    private j8 f10151e;

    /* renamed from: f  reason: collision with root package name */
    private nd f10152f;

    /* renamed from: g  reason: collision with root package name */
    private LocationController f10153g;

    /* renamed from: h  reason: collision with root package name */
    private TelephonyManager f10154h;

    /* renamed from: i  reason: collision with root package name */
    private b f10155i;

    /* renamed from: j  reason: collision with root package name */
    private c f10156j;

    /* renamed from: k  reason: collision with root package name */
    private int f10157k = 0;

    /* renamed from: l  reason: collision with root package name */
    private int f10158l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f10159m;

    /* compiled from: Sta */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public String f10160a;

        /* renamed from: b  reason: collision with root package name */
        public double f10161b;

        /* renamed from: c  reason: collision with root package name */
        public double f10162c;

        public b(String str, double d10, double d11) {
            this.f10160a = str;
            this.f10161b = d10;
            this.f10162c = d11;
        }
    }

    /* compiled from: Sta */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        public String f10164a;

        /* renamed from: b  reason: collision with root package name */
        public String f10165b;

        /* renamed from: c  reason: collision with root package name */
        public String f10166c;

        /* renamed from: d  reason: collision with root package name */
        public NetworkTypes f10167d;

        /* renamed from: e  reason: collision with root package name */
        public String f10168e;

        /* renamed from: f  reason: collision with root package name */
        public String f10169f;

        /* renamed from: g  reason: collision with root package name */
        public int f10170g;

        private c() {
            this.f10164a = "";
            this.f10165b = "";
            this.f10166c = "";
            this.f10167d = NetworkTypes.Unknown;
            this.f10168e = "";
            this.f10169f = "";
        }

        public void a(String str, String str2, String str3, NetworkTypes networkTypes, String str4, String str5, int i10) {
            this.f10165b = str;
            this.f10164a = str2;
            this.f10166c = str3;
            this.f10167d = networkTypes;
            this.f10168e = str4;
            this.f10169f = str5;
            this.f10170g = i10;
        }
    }

    public b7(Context context) {
        int i10;
        this.f10148b = context;
        this.f10149c = new b5(context);
        this.f10150d = a5.b().PROJECT_ID();
        this.f10147a = context.getSharedPreferences(f10143q, 0);
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        this.f10154h = telephonyManager;
        if (!(Build.VERSION.SDK_INT < 24 || telephonyManager == null || (i10 = p2.i(context).SubscriptionId) == -1)) {
            this.f10154h = this.f10154h.createForSubscriptionId(i10);
        }
        this.f10151e = new j8(this.f10148b);
        this.f10152f = new nd(this.f10148b);
        this.f10153g = new LocationController(this.f10148b);
        this.f10156j = new c();
        this.f10159m = a5.b().NIR_COLLECT_CELLINFO();
        int NIR_COLLECT_CELLINFO_THRESHOLD = a5.b().NIR_COLLECT_CELLINFO_THRESHOLD();
        this.f10158l = NIR_COLLECT_CELLINFO_THRESHOLD;
        if (NIR_COLLECT_CELLINFO_THRESHOLD <= 0) {
            this.f10158l = 1;
        }
    }

    private void d() {
        String string = this.f10147a.getString(f10146t, "");
        if (!string.isEmpty()) {
            this.f10155i = new b(string, Double.longBitsToDouble(this.f10147a.getLong(f10144r, 0)), Double.longBitsToDouble(this.f10147a.getLong(f10145s, 0)));
        }
    }

    public NetworkInformationResult a(TriggerEvents triggerEvents, boolean z10) {
        return a(this.f10153g.c(), triggerEvents, z10);
    }

    public void b(k8 k8Var) {
        j8 j8Var = this.f10151e;
        if (j8Var != null) {
            j8Var.b(k8Var);
        }
    }

    public void c() {
        LocationController locationController = this.f10153g;
        if (locationController != null) {
            locationController.a((LocationController.c) null);
        }
    }

    public void e() {
        this.f10153g.a(LocationController.ProviderMode.Passive);
        this.f10151e.x();
        this.f10152f.f();
    }

    public void f() {
        this.f10153g.f();
        this.f10151e.y();
        this.f10152f.g();
    }

    public NetworkInformationResult a(LocationInfo locationInfo, TriggerEvents triggerEvents, boolean z10) {
        String str;
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        NetworkInformationResult networkInformationResult = new NetworkInformationResult(this.f10150d, this.f10149c.p());
        if (locationInfo != null) {
            networkInformationResult.LocationInfo = locationInfo;
        } else {
            networkInformationResult.LocationInfo = this.f10153g.c();
        }
        TimeInfo e10 = ua.e();
        networkInformationResult.TimeInfo = e10;
        networkInformationResult.Timestamp = e10.TimestampTableau;
        networkInformationResult.timestampMillis = e10.TimestampMillis;
        networkInformationResult.NirId = u3.a(e10, networkInformationResult.GUID);
        networkInformationResult.WifiInfo = this.f10152f.c();
        networkInformationResult.TriggerEvent = triggerEvents;
        networkInformationResult.ScreenState = p2.h(this.f10148b);
        networkInformationResult.CallState = a();
        if (this.f10159m) {
            int i10 = this.f10157k;
            this.f10157k = i10 + 1;
            if (i10 % this.f10158l == 0 || z10) {
                networkInformationResult.CellInfo = new ArrayList<>(Arrays.asList(this.f10151e.c()));
            }
        }
        networkInformationResult.RadioInfo = this.f10151e.h();
        String str2 = "";
        synchronized (this) {
            if (this.f10155i == null) {
                d();
            }
            if (!networkInformationResult.RadioInfo.GsmCellId.isEmpty()) {
                if (networkInformationResult.LocationInfo.LocationAge < 30000 && ((bVar4 = this.f10155i) == null || !bVar4.f10160a.equals(networkInformationResult.RadioInfo.GsmCellId))) {
                    String str3 = networkInformationResult.RadioInfo.GsmCellId;
                    LocationInfo locationInfo2 = networkInformationResult.LocationInfo;
                    b bVar5 = new b(str3, locationInfo2.LocationLatitude, locationInfo2.LocationLongitude);
                    this.f10155i = bVar5;
                    networkInformationResult.CellIdDeltaDistance = 0.0d;
                    a(bVar5);
                }
                str2 = networkInformationResult.RadioInfo.GsmCellId;
            } else if (!networkInformationResult.RadioInfo.CdmaBaseStationId.isEmpty()) {
                if (networkInformationResult.LocationInfo.LocationAge < 30000 && ((bVar3 = this.f10155i) == null || !bVar3.f10160a.equals(networkInformationResult.RadioInfo.CdmaBaseStationId))) {
                    String str4 = networkInformationResult.RadioInfo.CdmaBaseStationId;
                    LocationInfo locationInfo3 = networkInformationResult.LocationInfo;
                    b bVar6 = new b(str4, locationInfo3.LocationLatitude, locationInfo3.LocationLongitude);
                    this.f10155i = bVar6;
                    networkInformationResult.CellIdDeltaDistance = 0.0d;
                    a(bVar6);
                }
                str2 = networkInformationResult.RadioInfo.CdmaBaseStationId;
            }
            str = str2;
        }
        if ((!networkInformationResult.RadioInfo.GsmCellId.isEmpty() && networkInformationResult.CellIdDeltaDistance == -1.0d && (bVar2 = this.f10155i) != null && bVar2.f10160a.equals(networkInformationResult.RadioInfo.GsmCellId)) || (!networkInformationResult.RadioInfo.CdmaBaseStationId.isEmpty() && networkInformationResult.CellIdDeltaDistance == -1.0d && (bVar = this.f10155i) != null && bVar.f10160a.equals(networkInformationResult.RadioInfo.CdmaBaseStationId))) {
            b bVar7 = this.f10155i;
            double d10 = bVar7.f10161b;
            double d11 = bVar7.f10162c;
            LocationInfo locationInfo4 = networkInformationResult.LocationInfo;
            networkInformationResult.CellIdDeltaDistance = s2.a(d10, d11, locationInfo4.LocationLatitude, locationInfo4.LocationLongitude);
        }
        if (!str.isEmpty() && !str.equals(this.f10156j.f10164a)) {
            c cVar = this.f10156j;
            networkInformationResult.PrevNirId = cVar.f10165b;
            networkInformationResult.PrevCellId = cVar.f10164a;
            networkInformationResult.PrevLAC = cVar.f10166c;
            networkInformationResult.PrevNetworkType = cVar.f10167d;
            networkInformationResult.PrevMCC = cVar.f10168e;
            networkInformationResult.PrevMNC = cVar.f10169f;
            networkInformationResult.PrevRXLevel = cVar.f10170g;
        }
        c cVar2 = this.f10156j;
        String str5 = networkInformationResult.NirId;
        RadioInfo radioInfo = networkInformationResult.RadioInfo;
        cVar2.a(str5, str, radioInfo.GsmLAC, radioInfo.NetworkType, radioInfo.MCC, radioInfo.MNC, radioInfo.RXLevel);
        return networkInformationResult;
    }

    public j8 b() {
        return this.f10151e;
    }

    private CallStates a() {
        if (this.f10154h == null) {
            return CallStates.Unknown;
        }
        if (Build.VERSION.SDK_INT >= 31 && this.f10148b.checkSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
            return CallStates.Unknown;
        }
        int callState = this.f10154h.getCallState();
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

    @SuppressLint({"ApplySharedPref"})
    private void a(b bVar) {
        this.f10147a.edit().putString(f10146t, bVar.f10160a).commit();
        this.f10147a.edit().putLong(f10144r, Double.doubleToRawLongBits(bVar.f10161b)).commit();
        this.f10147a.edit().putLong(f10145s, Double.doubleToRawLongBits(bVar.f10162c)).commit();
    }

    public void a(LocationController.c cVar) {
        LocationController locationController = this.f10153g;
        if (locationController != null) {
            locationController.a(cVar);
        }
    }

    public void a(k8 k8Var) {
        j8 j8Var = this.f10151e;
        if (j8Var != null) {
            j8Var.a(k8Var);
        }
    }
}
