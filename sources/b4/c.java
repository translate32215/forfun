package b4;

import com.bumptech.glide.load.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ResourceDecoderRegistry */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f3555a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, List<a<?, ?>>> f3556b = new HashMap();

    /* compiled from: ResourceDecoderRegistry */
    public static class a<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f3557a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f3558b;

        /* renamed from: c  reason: collision with root package name */
        public final f<T, R> f3559c;

        public a(Class<T> cls, Class<R> cls2, f<T, R> fVar) {
            this.f3557a = cls;
            this.f3558b = cls2;
            this.f3559c = fVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.f3557a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f3558b);
        }
    }

    public final synchronized List<a<?, ?>> a(String str) {
        List<a<?, ?>> list;
        if (!this.f3555a.contains(str)) {
            this.f3555a.add(str);
        }
        list = this.f3556b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f3556b.put(str, list);
        }
        return list;
    }

    public synchronized <T, R> List<Class<R>> b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f3555a) {
            List<a> list = this.f3556b.get(str);
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f3558b)) {
                        arrayList.add(aVar.f3558b);
                    }
                }
            }
        }
        return arrayList;
    }
}
