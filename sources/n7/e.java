package n7;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n7.e;
import o7.a;
import o7.b;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public class e<T extends e> {

    /* renamed from: a  reason: collision with root package name */
    public Map f22355a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public Map f22356b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public List f22357c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public List f22358d = new ArrayList();

    public Map<String, String> a() {
        HashMap hashMap = new HashMap(this.f22355a);
        int i10 = 1;
        for (b a10 : this.f22357c) {
            hashMap.putAll(a10.a(k.a("&promo", i10)));
            i10++;
        }
        int i11 = 1;
        for (a a11 : this.f22358d) {
            hashMap.putAll(a11.a(k.a("&pr", i11)));
            i11++;
        }
        int i12 = 1;
        for (Map.Entry entry : this.f22356b.entrySet()) {
            String a12 = k.a("&il", i12);
            int i13 = 1;
            for (a a13 : (List) entry.getValue()) {
                hashMap.putAll(a13.a(a12.concat(k.a("pi", i13))));
                i13++;
            }
            if (!TextUtils.isEmpty((CharSequence) entry.getKey())) {
                hashMap.put(a12.concat("nm"), (String) entry.getKey());
            }
            i12++;
        }
        return hashMap;
    }

    public final T b(String str, String str2) {
        this.f22355a.put(str, str2);
        return this;
    }
}
