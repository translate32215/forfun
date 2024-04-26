package com.google.gson.internal;

import android.support.v4.media.a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

/* compiled from: ConstructorConstructor */
public class k implements t<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Type f9957a;

    public k(h hVar, Type type) {
        this.f9957a = type;
    }

    public Object a() {
        Type type = this.f9957a;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            StringBuilder a10 = a.a("Invalid EnumSet type: ");
            a10.append(this.f9957a.toString());
            throw new com.google.gson.k(a10.toString());
        }
        StringBuilder a11 = a.a("Invalid EnumSet type: ");
        a11.append(this.f9957a.toString());
        throw new com.google.gson.k(a11.toString());
    }
}
