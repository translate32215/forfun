package t2;

import android.content.ContentValues;
import com.adcolony.sdk.r0;
import com.adcolony.sdk.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class o0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f25541a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, ArrayList<a>> f25542b = new ConcurrentHashMap();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f25543a;

        /* renamed from: b  reason: collision with root package name */
        public final p0 f25544b;

        public a(String str, p0 p0Var, t tVar) {
            this.f25543a = str;
            this.f25544b = p0Var;
        }
    }

    public o0(int i10, t tVar) {
        this.f25541a = i10;
    }

    public JSONObject a() {
        String str;
        JSONObject jSONObject = new JSONObject();
        r0.j(jSONObject, "version", this.f25541a);
        for (Map.Entry next : this.f25542b.entrySet()) {
            JSONObject jSONObject2 = new JSONObject();
            Iterator it = ((ArrayList) next.getValue()).iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                JSONArray jSONArray = new JSONArray();
                p0 p0Var = aVar.f25544b;
                p0Var.getClass();
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (i10 < p0Var.f25548b.size()) {
                    if (i10 < 0 || i10 >= p0Var.f25548b.size()) {
                        str = null;
                    } else {
                        ContentValues contentValues = p0Var.f25548b.get(i10);
                        StringBuilder sb2 = new StringBuilder();
                        int i11 = 0;
                        while (i11 < p0Var.f25547a.size()) {
                            if (((i11 < 0 || i11 >= p0Var.f25547a.size()) ? -1 : p0Var.f25547a.get(i11).f25551c) == 3) {
                                sb2.append("\"");
                                sb2.append(contentValues.get(p0Var.a(i11)));
                                sb2.append("\"");
                            } else {
                                sb2.append(contentValues.getAsString(p0Var.a(i11)));
                            }
                            sb2.append(i11 == p0Var.f25547a.size() + -1 ? "" : ',');
                            i11++;
                        }
                        str = sb2.toString();
                    }
                    arrayList.add(str);
                    i10++;
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    jSONArray.put((String) it2.next());
                }
                r0.f(jSONObject2, aVar.f25543a, jSONArray);
            }
            r0.g(jSONObject, (String) next.getKey(), jSONObject2);
        }
        return jSONObject;
    }
}
