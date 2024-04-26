package com.google.gson.internal;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.a;
import com.google.gson.b;
import com.google.gson.t;
import fb.d;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import jb.c;

public final class Excluder implements t, Cloneable {

    /* renamed from: f  reason: collision with root package name */
    public static final Excluder f9833f = new Excluder();

    /* renamed from: a  reason: collision with root package name */
    public double f9834a = -1.0d;

    /* renamed from: b  reason: collision with root package name */
    public int f9835b = 136;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9836c = true;

    /* renamed from: d  reason: collision with root package name */
    public List<a> f9837d = Collections.emptyList();

    /* renamed from: e  reason: collision with root package name */
    public List<a> f9838e = Collections.emptyList();

    public <T> TypeAdapter<T> a(Gson gson, ib.a<T> aVar) {
        Class<? super T> cls = aVar.f19348a;
        boolean b10 = b(cls);
        final boolean z10 = b10 || c(cls, true);
        final boolean z11 = b10 || c(cls, false);
        if (!z10 && !z11) {
            return null;
        }
        final Gson gson2 = gson;
        final ib.a<T> aVar2 = aVar;
        return new TypeAdapter<T>() {

            /* renamed from: a  reason: collision with root package name */
            public TypeAdapter<T> f9839a;

            public T b(jb.a aVar) throws IOException {
                if (z11) {
                    aVar.s0();
                    return null;
                }
                TypeAdapter<T> typeAdapter = this.f9839a;
                if (typeAdapter == null) {
                    typeAdapter = gson2.d(Excluder.this, aVar2);
                    this.f9839a = typeAdapter;
                }
                return typeAdapter.b(aVar);
            }

            public void c(c cVar, T t10) throws IOException {
                if (z10) {
                    cVar.M();
                    return;
                }
                TypeAdapter<T> typeAdapter = this.f9839a;
                if (typeAdapter == null) {
                    typeAdapter = gson2.d(Excluder.this, aVar2);
                    this.f9839a = typeAdapter;
                }
                typeAdapter.c(cVar, t10);
            }
        };
    }

    public final boolean b(Class<?> cls) {
        if (this.f9834a != -1.0d && !g((fb.c) cls.getAnnotation(fb.c.class), (d) cls.getAnnotation(d.class))) {
            return true;
        }
        if ((this.f9836c || !f(cls)) && !e(cls)) {
            return false;
        }
        return true;
    }

    public final boolean c(Class<?> cls, boolean z10) {
        for (a a10 : z10 ? this.f9837d : this.f9838e) {
            if (a10.a(cls)) {
                return true;
            }
        }
        return false;
    }

    public Object clone() throws CloneNotSupportedException {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public boolean d(Field field, boolean z10) {
        if ((this.f9835b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f9834a != -1.0d && !g((fb.c) field.getAnnotation(fb.c.class), (d) field.getAnnotation(d.class))) || field.isSynthetic()) {
            return true;
        }
        if ((!this.f9836c && f(field.getType())) || e(field.getType())) {
            return true;
        }
        List<a> list = z10 ? this.f9837d : this.f9838e;
        if (list.isEmpty()) {
            return false;
        }
        b bVar = new b(field);
        for (a b10 : list) {
            if (b10.b(bVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean e(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    public final boolean f(Class<?> cls) {
        if (cls.isMemberClass()) {
            if (!((cls.getModifiers() & 8) != 0)) {
                return true;
            }
        }
        return false;
    }

    public final boolean g(fb.c cVar, d dVar) {
        if (!(cVar == null || cVar.value() <= this.f9834a)) {
            return false;
        }
        if (dVar == null || dVar.value() > this.f9834a) {
            return true;
        }
        return false;
    }
}
