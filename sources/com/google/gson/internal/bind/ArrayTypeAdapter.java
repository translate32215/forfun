package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.b;
import com.google.gson.t;
import ib.a;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import jb.c;

public final class ArrayTypeAdapter<E> extends TypeAdapter<Object> {

    /* renamed from: c  reason: collision with root package name */
    public static final t f9852c = new t() {
        public <T> TypeAdapter<T> a(Gson gson, a<T> aVar) {
            Type type;
            Type type2 = aVar.f19349b;
            boolean z10 = type2 instanceof GenericArrayType;
            if (!z10 && (!(type2 instanceof Class) || !((Class) type2).isArray())) {
                return null;
            }
            if (z10) {
                type = ((GenericArrayType) type2).getGenericComponentType();
            } else {
                type = ((Class) type2).getComponentType();
            }
            return new ArrayTypeAdapter(gson, gson.c(new a(type)), b.e(type));
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final Class<E> f9853a;

    /* renamed from: b  reason: collision with root package name */
    public final TypeAdapter<E> f9854b;

    public ArrayTypeAdapter(Gson gson, TypeAdapter<E> typeAdapter, Class<E> cls) {
        this.f9854b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.f9853a = cls;
    }

    public Object b(jb.a aVar) throws IOException {
        if (aVar.m0() == jb.b.NULL) {
            aVar.i0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.G()) {
            arrayList.add(this.f9854b.b(aVar));
        }
        aVar.s();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f9853a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(newInstance, i10, arrayList.get(i10));
        }
        return newInstance;
    }

    public void c(c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.M();
            return;
        }
        cVar.d();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f9854b.c(cVar, Array.get(obj, i10));
        }
        cVar.s();
    }
}
