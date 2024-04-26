package q3;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: LazyHeaders */
public final class i implements g {

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, List<h>> f24089b;

    /* renamed from: c  reason: collision with root package name */
    public volatile Map<String, String> f24090c;

    /* compiled from: LazyHeaders */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final Map<String, List<h>> f24091b;

        /* renamed from: a  reason: collision with root package name */
        public Map<String, List<h>> f24092a = f24091b;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb2 = new StringBuilder(property.length());
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = property.charAt(i10);
                    if ((charAt > 31 || charAt == 9) && charAt < 127) {
                        sb2.append(charAt);
                    } else {
                        sb2.append('?');
                    }
                }
                property = sb2.toString();
            }
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(property)));
            }
            f24091b = Collections.unmodifiableMap(hashMap);
        }
    }

    /* compiled from: LazyHeaders */
    public static final class b implements h {

        /* renamed from: a  reason: collision with root package name */
        public final String f24093a;

        public b(String str) {
            this.f24093a = str;
        }

        public String a() {
            return this.f24093a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f24093a.equals(((b) obj).f24093a);
            }
            return false;
        }

        public int hashCode() {
            return this.f24093a.hashCode();
        }

        public String toString() {
            StringBuilder a10 = android.support.v4.media.a.a("StringHeaderFactory{value='");
            a10.append(this.f24093a);
            a10.append('\'');
            a10.append('}');
            return a10.toString();
        }
    }

    public i(Map<String, List<h>> map) {
        this.f24089b = Collections.unmodifiableMap(map);
    }

    public Map<String, String> a() {
        if (this.f24090c == null) {
            synchronized (this) {
                if (this.f24090c == null) {
                    this.f24090c = Collections.unmodifiableMap(b());
                }
            }
        }
        return this.f24090c;
    }

    public final Map<String, String> b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f24089b.entrySet()) {
            List list = (List) next.getValue();
            StringBuilder sb2 = new StringBuilder();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                String a10 = ((h) list.get(i10)).a();
                if (!TextUtils.isEmpty(a10)) {
                    sb2.append(a10);
                    if (i10 != list.size() - 1) {
                        sb2.append(',');
                    }
                }
            }
            String sb3 = sb2.toString();
            if (!TextUtils.isEmpty(sb3)) {
                hashMap.put(next.getKey(), sb3);
            }
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f24089b.equals(((i) obj).f24089b);
        }
        return false;
    }

    public int hashCode() {
        return this.f24089b.hashCode();
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("LazyHeaders{headers=");
        a10.append(this.f24089b);
        a10.append('}');
        return a10.toString();
    }
}
