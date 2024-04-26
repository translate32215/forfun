package com.startapp;

import android.os.AsyncTask;
import com.startapp.networkTest.data.IspInfo;
import com.startapp.networkTest.data.WifiInfo;
import com.startapp.networkTest.net.WebApiClient;
import com.startapp.networkTest.threads.ThreadManager;
import java.util.HashMap;

/* compiled from: Sta */
public class g3 {

    /* renamed from: e  reason: collision with root package name */
    private static final String f10417e = "g3";

    /* renamed from: f  reason: collision with root package name */
    private static final String f10418f = "ispinfo";

    /* renamed from: g  reason: collision with root package name */
    private static final String f10419g = "anonymize";

    /* renamed from: h  reason: collision with root package name */
    private static g3 f10420h;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public boolean f10421a = false;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f10422b = false;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<String, IspInfo> f10423c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private IspInfo f10424d;

    /* compiled from: Sta */
    public class a extends AsyncTask<WifiInfo, Void, IspInfo> {
        public a() {
        }

        /* renamed from: a */
        public IspInfo doInBackground(WifiInfo... wifiInfoArr) {
            return g3.this.a(wifiInfoArr[0]);
        }

        public void onPreExecute() {
            super.onPreExecute();
            boolean unused = g3.this.f10421a = true;
        }

        /* renamed from: a */
        public void onPostExecute(IspInfo ispInfo) {
            super.onPostExecute(ispInfo);
            boolean unused = g3.this.f10421a = false;
        }
    }

    /* compiled from: Sta */
    public class b extends AsyncTask<Void, Void, IspInfo> {
        public b() {
        }

        /* renamed from: a */
        public IspInfo doInBackground(Void... voidArr) {
            return g3.this.a((WifiInfo) null);
        }

        public void onPreExecute() {
            super.onPreExecute();
            boolean unused = g3.this.f10422b = true;
        }

        /* renamed from: a */
        public void onPostExecute(IspInfo ispInfo) {
            super.onPostExecute(ispInfo);
            boolean unused = g3.this.f10422b = false;
        }
    }

    private g3() {
    }

    public static g3 a() {
        if (f10420h == null) {
            f10420h = new g3();
        }
        return f10420h;
    }

    public IspInfo b(WifiInfo wifiInfo, boolean z10) {
        String str;
        h5 h5Var;
        IspInfo ispInfo = new IspInfo();
        if (z10) {
            try {
                str = a5.b().GEOIP_URL() + f10418f;
            } catch (Throwable th) {
                x2.a(th);
            }
        } else {
            str = a5.b().GEOIP_URL() + f10418f + "?" + f10419g + "=false";
        }
        kd a10 = WebApiClient.a(WebApiClient.RequestMethod.GET, str);
        if (a10.f10805b.length() > 0 && (h5Var = (h5) r5.a(a10.f10805b, h5.class)) != null) {
            ispInfo.AutonomousSystemNumber = la.a(h5Var.AutonomousSystemNumber);
            ispInfo.AutonomousSystemOrganization = la.a(h5Var.AutonomousSystemOrganization);
            ispInfo.IpAddress = la.a(h5Var.IpAddress);
            ispInfo.IspName = la.a(h5Var.IspName);
            ispInfo.IspOrganizationalName = la.a(h5Var.IspOrganizationalName);
            ispInfo.SuccessfulIspLookup = true;
            if (wifiInfo != null) {
                synchronized (this.f10423c) {
                    this.f10423c.put(wifiInfo.WifiBSSID_Full, ispInfo);
                }
            } else {
                this.f10424d = ispInfo;
            }
        }
        return ispInfo;
    }

    public IspInfo a(WifiInfo wifiInfo, boolean z10) {
        IspInfo ispInfo;
        synchronized (this.f10423c) {
            ispInfo = this.f10423c.get(wifiInfo.WifiBSSID_Full);
        }
        if (ispInfo != null) {
            return ispInfo;
        }
        if (z10 && !this.f10421a) {
            new a().executeOnExecutor(ThreadManager.b().a(), new WifiInfo[]{wifiInfo});
        }
        return new IspInfo();
    }

    public IspInfo a(boolean z10, boolean z11) {
        IspInfo ispInfo = this.f10424d;
        if ((z10 && !this.f10422b && ispInfo == null) || (z10 && !this.f10422b && z11)) {
            new b().executeOnExecutor(ThreadManager.b().a(), new Void[0]);
        }
        return ispInfo == null ? new IspInfo() : ispInfo;
    }

    public IspInfo a(WifiInfo wifiInfo) {
        return b(wifiInfo, true);
    }
}
