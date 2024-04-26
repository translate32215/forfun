package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.g;
import com.google.gson.internal.h;
import com.google.gson.internal.q;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.o;
import com.google.gson.r;
import com.google.gson.t;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import jb.a;
import jb.b;
import jb.c;

public final class MapTypeAdapterFactory implements t {

    /* renamed from: a  reason: collision with root package name */
    public final h f9861a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9862b;

    public final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        public final TypeAdapter<K> f9863a;

        /* renamed from: b  reason: collision with root package name */
        public final TypeAdapter<V> f9864b;

        /* renamed from: c  reason: collision with root package name */
        public final com.google.gson.internal.t<? extends Map<K, V>> f9865c;

        public Adapter(Gson gson, Type type, TypeAdapter<K> typeAdapter, Type type2, TypeAdapter<V> typeAdapter2, com.google.gson.internal.t<? extends Map<K, V>> tVar) {
            this.f9863a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f9864b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.f9865c = tVar;
        }

        public Object b(a aVar) throws IOException {
            b m02 = aVar.m0();
            if (m02 == b.NULL) {
                aVar.i0();
                return null;
            }
            Map map = (Map) this.f9865c.a();
            if (m02 == b.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.G()) {
                    aVar.a();
                    K b10 = this.f9863a.b(aVar);
                    if (map.put(b10, this.f9864b.b(aVar)) == null) {
                        aVar.s();
                    } else {
                        throw new r("duplicate key: " + b10);
                    }
                }
                aVar.s();
            } else {
                aVar.d();
                while (aVar.G()) {
                    ((a.C0169a) q.f9959a).getClass();
                    if (aVar instanceof a) {
                        a aVar2 = (a) aVar;
                        aVar2.u0(b.NAME);
                        Map.Entry entry = (Map.Entry) ((Iterator) aVar2.v0()).next();
                        aVar2.x0(entry.getValue());
                        aVar2.x0(new o((String) entry.getKey()));
                    } else {
                        int i10 = aVar.f19708h;
                        if (i10 == 0) {
                            i10 = aVar.o();
                        }
                        if (i10 == 13) {
                            aVar.f19708h = 9;
                        } else if (i10 == 12) {
                            aVar.f19708h = 8;
                        } else if (i10 == 14) {
                            aVar.f19708h = 10;
                        } else {
                            StringBuilder a10 = android.support.v4.media.a.a("Expected a name but was ");
                            a10.append(aVar.m0());
                            a10.append(aVar.M());
                            throw new IllegalStateException(a10.toString());
                        }
                    }
                    K b11 = this.f9863a.b(aVar);
                    if (map.put(b11, this.f9864b.b(aVar)) != null) {
                        throw new r("duplicate key: " + b11);
                    }
                }
                aVar.t();
            }
            return map;
        }

        public void c(c cVar, Object obj) throws IOException {
            String str;
            Map map = (Map) obj;
            if (map == null) {
                cVar.M();
            } else if (!MapTypeAdapterFactory.this.f9862b) {
                cVar.i();
                for (Map.Entry entry : map.entrySet()) {
                    cVar.H(String.valueOf(entry.getKey()));
                    this.f9864b.c(cVar, entry.getValue());
                }
                cVar.t();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i10 = 0;
                boolean z10 = false;
                for (Map.Entry entry2 : map.entrySet()) {
                    TypeAdapter<K> typeAdapter = this.f9863a;
                    Object key = entry2.getKey();
                    typeAdapter.getClass();
                    try {
                        b bVar = new b();
                        typeAdapter.c(bVar, key);
                        j q02 = bVar.q0();
                        arrayList.add(q02);
                        arrayList2.add(entry2.getValue());
                        q02.getClass();
                        z10 |= (q02 instanceof g) || (q02 instanceof m);
                    } catch (IOException e10) {
                        throw new k((Throwable) e10);
                    }
                }
                if (z10) {
                    cVar.d();
                    int size = arrayList.size();
                    while (i10 < size) {
                        cVar.d();
                        TypeAdapters.C.c(cVar, (j) arrayList.get(i10));
                        this.f9864b.c(cVar, arrayList2.get(i10));
                        cVar.s();
                        i10++;
                    }
                    cVar.s();
                    return;
                }
                cVar.i();
                int size2 = arrayList.size();
                while (i10 < size2) {
                    j jVar = (j) arrayList.get(i10);
                    jVar.getClass();
                    if (jVar instanceof o) {
                        o h10 = jVar.h();
                        Object obj2 = h10.f9995a;
                        if (obj2 instanceof Number) {
                            str = String.valueOf(h10.x());
                        } else if (obj2 instanceof Boolean) {
                            str = Boolean.toString(h10.s());
                        } else if (obj2 instanceof String) {
                            str = h10.y();
                        } else {
                            throw new AssertionError();
                        }
                    } else if (jVar instanceof l) {
                        str = "null";
                    } else {
                        throw new AssertionError();
                    }
                    cVar.H(str);
                    this.f9864b.c(cVar, arrayList2.get(i10));
                    i10++;
                }
                cVar.t();
            }
        }
    }

    public MapTypeAdapterFactory(h hVar, boolean z10) {
        this.f9861a = hVar;
        this.f9862b = z10;
    }

    public <T> TypeAdapter<T> a(Gson gson, ib.a<T> aVar) {
        Type[] typeArr;
        TypeAdapter<Boolean> typeAdapter;
        Type type = aVar.f19349b;
        if (!Map.class.isAssignableFrom(aVar.f19348a)) {
            return null;
        }
        Class<?> e10 = com.google.gson.internal.b.e(type);
        Class<Object> cls = Object.class;
        Class<String> cls2 = String.class;
        if (type == Properties.class) {
            typeArr = new Type[]{cls2, cls2};
        } else {
            Type f10 = com.google.gson.internal.b.f(type, e10, Map.class);
            typeArr = f10 instanceof ParameterizedType ? ((ParameterizedType) f10).getActualTypeArguments() : new Type[]{cls, cls};
        }
        Type type2 = typeArr[0];
        if (type2 == Boolean.TYPE || type2 == Boolean.class) {
            typeAdapter = TypeAdapters.f9895c;
        } else {
            typeAdapter = gson.c(new ib.a(type2));
        }
        return new Adapter(gson, typeArr[0], typeAdapter, typeArr[1], gson.c(new ib.a(typeArr[1])), this.f9861a.a(aVar));
    }
}
