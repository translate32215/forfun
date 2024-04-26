package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import jb.a;
import jb.c;

final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Gson f9890a;

    /* renamed from: b  reason: collision with root package name */
    public final TypeAdapter<T> f9891b;

    /* renamed from: c  reason: collision with root package name */
    public final Type f9892c;

    public TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
        this.f9890a = gson;
        this.f9891b = typeAdapter;
        this.f9892c = type;
    }

    public T b(a aVar) throws IOException {
        return this.f9891b.b(aVar);
    }

    public void c(c cVar, T t10) throws IOException {
        TypeAdapter<T> typeAdapter = this.f9891b;
        Type type = this.f9892c;
        if (t10 != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t10.getClass();
        }
        if (type != this.f9892c) {
            typeAdapter = this.f9890a.c(new ib.a(type));
            if (typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter) {
                TypeAdapter<T> typeAdapter2 = this.f9891b;
                if (!(typeAdapter2 instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                    typeAdapter = typeAdapter2;
                }
            }
        }
        typeAdapter.c(cVar, t10);
    }
}
