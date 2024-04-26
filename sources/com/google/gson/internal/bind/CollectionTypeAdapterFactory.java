package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.h;
import com.google.gson.t;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import jb.a;
import jb.b;
import jb.c;

public final class CollectionTypeAdapterFactory implements t {

    /* renamed from: a  reason: collision with root package name */
    public final h f9855a;

    public static final class Adapter<E> extends TypeAdapter<Collection<E>> {

        /* renamed from: a  reason: collision with root package name */
        public final TypeAdapter<E> f9856a;

        /* renamed from: b  reason: collision with root package name */
        public final com.google.gson.internal.t<? extends Collection<E>> f9857b;

        public Adapter(Gson gson, Type type, TypeAdapter<E> typeAdapter, com.google.gson.internal.t<? extends Collection<E>> tVar) {
            this.f9856a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f9857b = tVar;
        }

        public Object b(a aVar) throws IOException {
            if (aVar.m0() == b.NULL) {
                aVar.i0();
                return null;
            }
            Collection collection = (Collection) this.f9857b.a();
            aVar.a();
            while (aVar.G()) {
                collection.add(this.f9856a.b(aVar));
            }
            aVar.s();
            return collection;
        }

        public void c(c cVar, Object obj) throws IOException {
            Collection<Object> collection = (Collection) obj;
            if (collection == null) {
                cVar.M();
                return;
            }
            cVar.d();
            for (Object c10 : collection) {
                this.f9856a.c(cVar, c10);
            }
            cVar.s();
        }
    }

    public CollectionTypeAdapterFactory(h hVar) {
        this.f9855a = hVar;
    }

    public <T> TypeAdapter<T> a(Gson gson, ib.a<T> aVar) {
        Type type;
        Type type2 = aVar.f19349b;
        Class<? super T> cls = aVar.f19348a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type f10 = com.google.gson.internal.b.f(type2, cls, Collection.class);
        if (f10 instanceof WildcardType) {
            f10 = ((WildcardType) f10).getUpperBounds()[0];
        }
        if (f10 instanceof ParameterizedType) {
            type = ((ParameterizedType) f10).getActualTypeArguments()[0];
        } else {
            type = Object.class;
        }
        return new Adapter(gson, type, gson.c(new ib.a(type)), this.f9855a.a(aVar));
    }
}
