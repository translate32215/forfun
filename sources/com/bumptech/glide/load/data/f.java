package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DataRewinderRegistry */
public class f {

    /* renamed from: b  reason: collision with root package name */
    public static final e.a<?> f4974b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, e.a<?>> f4975a = new HashMap();

    /* compiled from: DataRewinderRegistry */
    public class a implements e.a<Object> {
        public Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        public e<Object> b(Object obj) {
            return new b(obj);
        }
    }

    /* compiled from: DataRewinderRegistry */
    public static final class b implements e<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f4976a;

        public b(Object obj) {
            this.f4976a = obj;
        }

        public Object a() {
            return this.f4976a;
        }

        public void b() {
        }
    }
}
