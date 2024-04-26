package ub;

import android.text.TextUtils;
import java.util.HashSet;
import mb.h;
import ob.a;
import ob.e;
import org.json.JSONObject;
import sb.a;
import tb.d;
import ub.b;

public class f extends a {
    public f(b.C0259b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(bVar, hashSet, jSONObject, j10);
    }

    /* renamed from: a */
    public void onPostExecute(String str) {
        a aVar;
        if (!TextUtils.isEmpty(str) && (aVar = a.f23656c) != null) {
            for (h next : aVar.a()) {
                if (this.f26168c.contains(next.f21786h)) {
                    sb.a aVar2 = next.f21783e;
                    if (this.f26170e >= aVar2.f25194e) {
                        aVar2.f25193d = a.C0243a.AD_STATE_VISIBLE;
                        e.f23667a.b(aVar2.f(), "setNativeViewHierarchy", str);
                    }
                }
            }
        }
        b.a aVar3 = this.f26171a;
        if (aVar3 != null) {
            c cVar = (c) aVar3;
            cVar.f26175c = null;
            cVar.a();
        }
    }

    public Object doInBackground(Object[] objArr) {
        if (qb.a.g(this.f26169d, ((d) this.f26172b).f25883a)) {
            return null;
        }
        b.C0259b bVar = this.f26172b;
        JSONObject jSONObject = this.f26169d;
        ((d) bVar).f25883a = jSONObject;
        return jSONObject.toString();
    }
}
