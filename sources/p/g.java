package p;

import android.content.ComponentName;
import android.content.Context;
import android.util.SparseArray;
import com.adcolony.sdk.j0;
import com.adcolony.sdk.o;
import com.adcolony.sdk.q0;
import com.adcolony.sdk.r0;
import j.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import jd.a;
import n0.d;
import org.json.JSONArray;
import org.json.JSONObject;
import s.i;
import s4.j;
import s4.k;
import t4.c;
import u4.b;

/* compiled from: CustomTabsSession */
public class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public Object f23740a;

    /* renamed from: b  reason: collision with root package name */
    public Object f23741b;

    /* renamed from: c  reason: collision with root package name */
    public Object f23742c;

    /* renamed from: d  reason: collision with root package name */
    public Object f23743d;

    public g(a aVar, a aVar2, a aVar3, a aVar4) {
        this.f23740a = aVar;
        this.f23741b = aVar2;
        this.f23742c = aVar3;
        this.f23743d = aVar4;
    }

    public g a(String str) {
        if (str == null) {
            return this;
        }
        this.f23740a = str;
        r0.e((JSONObject) this.f23743d, "app_id", str);
        return this;
    }

    public g b(String... strArr) {
        if (strArr == null) {
            return this;
        }
        this.f23741b = strArr;
        this.f23742c = new JSONArray();
        for (String put : strArr) {
            ((JSONArray) this.f23742c).put(put);
        }
        return this;
    }

    public void c(Context context) {
        String str;
        ExecutorService executorService = j0.f4565a;
        try {
            str = context.getPackageName();
        } catch (Exception unused) {
            str = "unknown";
        }
        r0.e((JSONObject) this.f23743d, "bundle_id", str);
    }

    public void d(T t10) {
        if (!(((i) this.f23741b).e(t10) >= 0)) {
            ((i) this.f23741b).put(t10, null);
        }
    }

    public void e(Context context) {
        c(context);
        if (r0.c((JSONObject) this.f23743d, "use_forced_controller")) {
            q0.f4714d0 = ((JSONObject) this.f23743d).optBoolean("use_forced_controller");
        }
        if (r0.c((JSONObject) this.f23743d, "use_staging_launch_server") && ((JSONObject) this.f23743d).optBoolean("use_staging_launch_server")) {
            o.R = "https://adc3-launch-staging.adcolony.com/v4/launch";
        }
        String l10 = j0.l(context, "IABUSPrivacy_String");
        String l11 = j0.l(context, "IABTCF_TCString");
        int i10 = -1;
        boolean z10 = false;
        try {
            i10 = j0.k(context).getInt("IABTCF_gdprApplies", -1);
        } catch (ClassCastException unused) {
            f.a(0, 1, f.a("Key IABTCF_gdprApplies in SharedPreferences ", "does not have an int value."), true);
        }
        if (l10 != null) {
            r0.e((JSONObject) this.f23743d, "ccpa_consent_string", l10);
        }
        if (l11 != null) {
            r0.e((JSONObject) this.f23743d, "gdpr_consent_string", l11);
        }
        if (i10 == 0 || i10 == 1) {
            JSONObject jSONObject = (JSONObject) this.f23743d;
            if (i10 == 1) {
                z10 = true;
            }
            r0.k(jSONObject, "gdpr_required", z10);
        }
    }

    public void f(T t10, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t10)) {
            if (!hashSet.contains(t10)) {
                hashSet.add(t10);
                ArrayList arrayList2 = (ArrayList) ((i) this.f23741b).getOrDefault(t10, null);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        f(arrayList2.get(i10), arrayList, hashSet);
                    }
                }
                hashSet.remove(t10);
                arrayList.add(t10);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    public ArrayList<T> g() {
        ArrayList<T> arrayList = (ArrayList) ((d) this.f23740a).b();
        return arrayList == null ? new ArrayList<>() : arrayList;
    }

    public Object get() {
        return new j((Executor) ((a) this.f23740a).get(), (c) ((a) this.f23741b).get(), (k) ((a) this.f23742c).get(), (b) ((a) this.f23743d).get());
    }

    public JSONObject h() {
        JSONObject jSONObject = new JSONObject();
        r0.e(jSONObject, "name", ((JSONObject) this.f23743d).optString("mediation_network"));
        r0.e(jSONObject, "version", ((JSONObject) this.f23743d).optString("mediation_network_version"));
        return jSONObject;
    }

    public JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        r0.e(jSONObject, "name", ((JSONObject) this.f23743d).optString("plugin"));
        r0.e(jSONObject, "version", ((JSONObject) this.f23743d).optString("plugin_version"));
        return jSONObject;
    }

    public void j(ArrayList<T> arrayList) {
        arrayList.clear();
        ((d) this.f23740a).a(arrayList);
    }

    public g(int i10) {
        if (i10 != 2) {
            boolean z10 = true;
            if (i10 != 3) {
                this.f23740a = new t.d(10, 1);
                this.f23741b = new i();
                this.f23742c = new ArrayList();
                this.f23743d = new HashSet();
                return;
            }
            this.f23740a = "";
            this.f23742c = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            this.f23743d = jSONObject;
            r0.e(jSONObject, "origin_store", "google");
            if (com.adcolony.sdk.f.f()) {
                o d10 = com.adcolony.sdk.f.d();
                if (d10.f4672p == null ? false : z10) {
                    a((String) d10.o().f23740a);
                    b((String[]) d10.o().f23741b);
                    return;
                }
                return;
            }
            return;
        }
        this.f23740a = new s.a();
        this.f23741b = new SparseArray();
        this.f23742c = new s.f(10);
        this.f23743d = new s.a();
    }

    public g(a.b bVar, a.a aVar, ComponentName componentName) {
        this.f23740a = new Object();
        this.f23741b = bVar;
        this.f23742c = aVar;
        this.f23743d = componentName;
    }
}
