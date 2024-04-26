package o7;

import java.util.HashMap;
import java.util.Map;
import n7.q;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public Map f23084a = new HashMap();

    public final Map a(String str) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f23084a.entrySet()) {
            hashMap.put(str.concat(String.valueOf((String) entry.getKey())), (String) entry.getValue());
        }
        return hashMap;
    }

    public String toString() {
        return q.zzb(this.f23084a);
    }
}
