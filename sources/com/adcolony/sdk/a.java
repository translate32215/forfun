package com.adcolony.sdk;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.adcolony.sdk.j0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import p.g;
import t2.f;
import t2.h0;
import t2.i;
import t2.l;
import t2.m;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ExecutorService f4411a = Executors.newSingleThreadExecutor();

    /* renamed from: com.adcolony.sdk.a$a  reason: collision with other inner class name */
    public static class C0064a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4412a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ i f4413b;

        public C0064a(String str, i iVar) {
            this.f4412a = str;
            this.f4413b = iVar;
        }

        public void run() {
            e eVar = f.d().f4675s.get(this.f4412a);
            this.f4413b.getClass();
        }
    }

    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4414a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f f4415b;

        public b(String str, f fVar) {
            this.f4414a = str;
            this.f4415b = fVar;
        }

        public void run() {
            if (f.f()) {
                e eVar = f.d().f4675s.get(this.f4414a);
            }
            this.f4415b.getClass();
        }
    }

    public static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f4416a;

        public c(d dVar) {
            this.f4416a = dVar;
        }

        public void run() {
            d dVar = this.f4416a;
            i iVar = dVar.f4462a;
            dVar.f4470i = true;
        }
    }

    public static class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o f4417a;

        public d(o oVar) {
            this.f4417a = oVar;
        }

        public void run() {
            ArrayList arrayList = new ArrayList();
            Iterator<h0> it = this.f4417a.m().f4599a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                h0 h0Var = (h0) it2.next();
                this.f4417a.d(h0Var.d());
                if (h0Var instanceof q0) {
                    q0 q0Var = (q0) h0Var;
                    if (!q0Var.I) {
                        q0Var.loadUrl("about:blank");
                        q0Var.clearCache(true);
                        q0Var.removeAllViews();
                        q0Var.K = true;
                    }
                }
            }
        }
    }

    public static void a(Context context, g gVar) {
        String str;
        o d10 = f.d();
        w i10 = d10.i();
        if (gVar != null && context != null) {
            ExecutorService executorService = j0.f4565a;
            try {
                str = context.getPackageName();
            } catch (Exception unused) {
                str = "unknown";
            }
            String o10 = j0.o();
            Context context2 = f.f4478a;
            int i11 = 0;
            if (context2 != null) {
                try {
                    i11 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
                } catch (Exception unused2) {
                    f.d().l().e(0, 0, "Failed to retrieve package info.", true);
                }
            }
            String d11 = i10.d();
            String a10 = d10.n().a();
            HashMap hashMap = new HashMap();
            hashMap.put("sessionId", "unknown");
            hashMap.put("advertiserId", "unknown");
            hashMap.put("countryLocale", Locale.getDefault().getDisplayLanguage() + " (" + Locale.getDefault().getDisplayCountry() + ")");
            hashMap.put("countryLocaleShort", f.d().i().e());
            f.d().i().getClass();
            hashMap.put("manufacturer", Build.MANUFACTURER);
            f.d().i().getClass();
            hashMap.put("model", Build.MODEL);
            f.d().i().getClass();
            hashMap.put("osVersion", Build.VERSION.RELEASE);
            hashMap.put("carrierName", d11);
            hashMap.put("networkType", a10);
            hashMap.put("platform", "android");
            hashMap.put("appName", str);
            hashMap.put("appVersion", o10);
            hashMap.put("appBuildNumber", Integer.valueOf(i11));
            hashMap.put("appId", "" + ((String) gVar.f23740a));
            hashMap.put("apiLevel", Integer.valueOf(Build.VERSION.SDK_INT));
            f.d().i().getClass();
            hashMap.put("sdkVersion", "4.5.0");
            hashMap.put("controllerVersion", "unknown");
            hashMap.put("zoneIds", (JSONArray) gVar.f23742c);
            JSONObject h10 = gVar.h();
            JSONObject i12 = gVar.i();
            if (!h10.optString("mediation_network").equals("")) {
                hashMap.put("mediationNetwork", h10.optString("mediation_network"));
                hashMap.put("mediationNetworkVersion", h10.optString("mediation_network_version"));
            }
            if (!i12.optString("plugin").equals("")) {
                hashMap.put("plugin", i12.optString("plugin"));
                hashMap.put("pluginVersion", i12.optString("plugin_version"));
            }
            m l10 = d10.l();
            l10.getClass();
            try {
                u uVar = new u(new s0(new URL("https://wd.adcolony.com/logs")), Executors.newSingleThreadScheduledExecutor(), hashMap);
                l10.f25518d = uVar;
                uVar.b(5, TimeUnit.SECONDS);
            } catch (MalformedURLException e10) {
                e10.printStackTrace();
            }
        }
    }

    public static boolean b(f fVar, String str) {
        if (fVar == null || !f.e()) {
            return false;
        }
        j0.h(new b(str, fVar));
        return false;
    }

    public static boolean c(i iVar, String str) {
        if (iVar == null || !f.e()) {
            return false;
        }
        j0.h(new C0064a(str, iVar));
        return false;
    }

    public static boolean d() {
        j0.b bVar = new j0.b(15.0d);
        o d10 = f.d();
        while (!d10.C) {
            if (bVar.a() == 0.0d) {
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException unused) {
            }
        }
        return d10.C;
    }

    public static boolean e() {
        if (!f.f4480c) {
            return false;
        }
        Context context = f.f4478a;
        if (context != null && (context instanceof l)) {
            ((Activity) context).finish();
        }
        o d10 = f.d();
        for (d cVar : d10.g().f4526b.values()) {
            j0.h(new c(cVar));
        }
        j0.h(new d(d10));
        f.d().B = true;
        return true;
    }
}
