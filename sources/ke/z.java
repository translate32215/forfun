package ke;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import ke.r;
import le.c;
import q.b;
import q.h;

/* compiled from: Request */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final s f20880a;

    /* renamed from: b  reason: collision with root package name */
    public final String f20881b;

    /* renamed from: c  reason: collision with root package name */
    public final r f20882c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final c0 f20883d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<Class<?>, Object> f20884e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public volatile c f20885f;

    public z(a aVar) {
        Map<Class<?>, Object> map;
        this.f20880a = aVar.f20886a;
        this.f20881b = aVar.f20887b;
        this.f20882c = new r(aVar.f20888c);
        this.f20883d = aVar.f20889d;
        Map<Class<?>, Object> map2 = aVar.f20890e;
        byte[] bArr = c.f21261a;
        if (map2.isEmpty()) {
            map = Collections.emptyMap();
        } else {
            map = Collections.unmodifiableMap(new LinkedHashMap(map2));
        }
        this.f20884e = map;
    }

    public c a() {
        c cVar = this.f20885f;
        if (cVar != null) {
            return cVar;
        }
        c a10 = c.a(this.f20882c);
        this.f20885f = a10;
        return a10;
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("Request{method=");
        a10.append(this.f20881b);
        a10.append(", url=");
        a10.append(this.f20880a);
        a10.append(", tags=");
        a10.append(this.f20884e);
        a10.append('}');
        return a10.toString();
    }

    /* compiled from: Request */
    public static class a {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public s f20886a;

        /* renamed from: b  reason: collision with root package name */
        public String f20887b;

        /* renamed from: c  reason: collision with root package name */
        public r.a f20888c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public c0 f20889d;

        /* renamed from: e  reason: collision with root package name */
        public Map<Class<?>, Object> f20890e;

        public a() {
            this.f20890e = Collections.emptyMap();
            this.f20887b = "GET";
            this.f20888c = new r.a();
        }

        public z a() {
            if (this.f20886a != null) {
                return new z(this);
            }
            throw new IllegalStateException("url == null");
        }

        public a b(String str, String str2) {
            r.a aVar = this.f20888c;
            aVar.getClass();
            r.a(str);
            r.b(str2, str);
            aVar.c(str);
            aVar.f20780a.add(str);
            aVar.f20780a.add(str2.trim());
            return this;
        }

        public a c(String str, @Nullable c0 c0Var) {
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (c0Var == null || h.f(str)) {
                if (c0Var == null) {
                    if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                        throw new IllegalArgumentException(b.a("method ", str, " must have a request body."));
                    }
                }
                this.f20887b = str;
                this.f20889d = c0Var;
                return this;
            } else {
                throw new IllegalArgumentException(b.a("method ", str, " must not have a request body."));
            }
        }

        public <T> a d(Class<? super T> cls, @Nullable T t10) {
            if (cls != null) {
                if (t10 == null) {
                    this.f20890e.remove(cls);
                } else {
                    if (this.f20890e.isEmpty()) {
                        this.f20890e = new LinkedHashMap();
                    }
                    this.f20890e.put(cls, cls.cast(t10));
                }
                return this;
            }
            throw new NullPointerException("type == null");
        }

        public a e(s sVar) {
            if (sVar != null) {
                this.f20886a = sVar;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        public a(z zVar) {
            Map<Class<?>, Object> map;
            this.f20890e = Collections.emptyMap();
            this.f20886a = zVar.f20880a;
            this.f20887b = zVar.f20881b;
            this.f20889d = zVar.f20883d;
            if (zVar.f20884e.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = new LinkedHashMap<>(zVar.f20884e);
            }
            this.f20890e = map;
            this.f20888c = zVar.f20882c.e();
        }
    }
}
