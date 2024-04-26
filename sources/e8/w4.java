package e8;

import androidx.appcompat.widget.p;
import d7.l;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import l0.e;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class w4 implements g4, t4 {

    /* renamed from: a  reason: collision with root package name */
    public final u4 f17215a;

    /* renamed from: b  reason: collision with root package name */
    public final HashSet<AbstractMap.SimpleEntry<String, f3<? super u4>>> f17216b = new HashSet<>();

    public w4(u4 u4Var) {
        this.f17215a = u4Var;
    }

    public final void F(String str, JSONObject jSONObject) {
        p.s(this, str, jSONObject);
    }

    public final void O(String str, Map map) {
        try {
            p.s(this, str, l.B.f13186c.F(map));
        } catch (JSONException unused) {
            e.K("Could not convert parameters to JSON.");
        }
    }

    public final void a(String str) {
        this.f17215a.a(str);
    }

    public final void e(String str, f3<? super u4> f3Var) {
        this.f17215a.e(str, f3Var);
        this.f17216b.remove(new AbstractMap.SimpleEntry(str, f3Var));
    }

    public final void g0() {
        Iterator<AbstractMap.SimpleEntry<String, f3<? super u4>>> it = this.f17216b.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry next = it.next();
            String valueOf = String.valueOf(((f3) next.getValue()).toString());
            e.H(valueOf.length() != 0 ? "Unregistering eventhandler: ".concat(valueOf) : new String("Unregistering eventhandler: "));
            this.f17215a.e((String) next.getKey(), (f3) next.getValue());
        }
        this.f17216b.clear();
    }

    public final void m(String str, JSONObject jSONObject) {
        p.r(this, str, jSONObject.toString());
    }

    public final void r(String str, f3<? super u4> f3Var) {
        this.f17215a.r(str, f3Var);
        this.f17216b.add(new AbstractMap.SimpleEntry(str, f3Var));
    }
}
