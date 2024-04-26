package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import ib.a;
import java.io.IOException;
import java.lang.reflect.Field;

/* compiled from: ReflectiveTypeAdapterFactory */
public class c extends ReflectiveTypeAdapterFactory.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Field f9941d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f9942e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TypeAdapter f9943f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Gson f9944g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ a f9945h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f9946i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory, String str, boolean z10, boolean z11, Field field, boolean z12, TypeAdapter typeAdapter, Gson gson, a aVar, boolean z13) {
        super(str, z10, z11);
        this.f9941d = field;
        this.f9942e = z12;
        this.f9943f = typeAdapter;
        this.f9944g = gson;
        this.f9945h = aVar;
        this.f9946i = z13;
    }

    public void a(jb.a aVar, Object obj) throws IOException, IllegalAccessException {
        Object b10 = this.f9943f.b(aVar);
        if (b10 != null || !this.f9946i) {
            this.f9941d.set(obj, b10);
        }
    }

    public void b(jb.c cVar, Object obj) throws IOException, IllegalAccessException {
        TypeAdapter typeAdapter;
        Object obj2 = this.f9941d.get(obj);
        if (this.f9942e) {
            typeAdapter = this.f9943f;
        } else {
            typeAdapter = new TypeAdapterRuntimeTypeWrapper(this.f9944g, this.f9943f, this.f9945h.f19349b);
        }
        typeAdapter.c(cVar, obj2);
    }

    public boolean c(Object obj) throws IOException, IllegalAccessException {
        if (this.f9877b && this.f9941d.get(obj) != obj) {
            return true;
        }
        return false;
    }
}
