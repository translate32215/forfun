package ub;

import java.util.HashSet;
import mb.h;
import org.json.JSONObject;
import sb.a;
import ub.b;

public class e extends a {
    public e(b.C0259b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(bVar, hashSet, jSONObject, j10);
    }

    /* renamed from: a */
    public void onPostExecute(String str) {
        a.C0243a aVar;
        ob.a aVar2 = ob.a.f23656c;
        if (aVar2 != null) {
            for (h next : aVar2.a()) {
                if (this.f26168c.contains(next.f21786h)) {
                    a aVar3 = next.f21783e;
                    if (this.f26170e >= aVar3.f25194e && aVar3.f25193d != (aVar = a.C0243a.AD_STATE_NOTVISIBLE)) {
                        aVar3.f25193d = aVar;
                        ob.e.f23667a.b(aVar3.f(), "setNativeViewHierarchy", str);
                    }
                }
            }
        }
        b.a aVar4 = this.f26171a;
        if (aVar4 != null) {
            c cVar = (c) aVar4;
            cVar.f26175c = null;
            cVar.a();
        }
    }

    public Object doInBackground(Object[] objArr) {
        return this.f26169d.toString();
    }
}
