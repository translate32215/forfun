package qa;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import oa.g;
import oa.h;

/* compiled from: JsonDataEncoderBuilder */
public final class e implements pa.a<e> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f24248e = new a((d) null);

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, oa.e<?>> f24249a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, g<?>> f24250b;

    /* renamed from: c  reason: collision with root package name */
    public oa.e<Object> f24251c = a.f24244a;

    /* renamed from: d  reason: collision with root package name */
    public boolean f24252d = false;

    /* compiled from: JsonDataEncoderBuilder */
    public static final class a implements g<Date> {

        /* renamed from: a  reason: collision with root package name */
        public static final DateFormat f24253a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f24253a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public a(d dVar) {
        }

        public void a(Object obj, Object obj2) throws IOException {
            ((h) obj2).c(f24253a.format((Date) obj));
        }
    }

    public e() {
        HashMap hashMap = new HashMap();
        this.f24249a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f24250b = hashMap2;
        Class<String> cls = String.class;
        hashMap2.put(cls, b.f24245a);
        hashMap.remove(cls);
        Class<Boolean> cls2 = Boolean.class;
        hashMap2.put(cls2, c.f24246a);
        hashMap.remove(cls2);
        Class<Date> cls3 = Date.class;
        hashMap2.put(cls3, f24248e);
        hashMap.remove(cls3);
    }

    public pa.a a(Class cls, oa.e eVar) {
        this.f24249a.put(cls, eVar);
        this.f24250b.remove(cls);
        return this;
    }
}
