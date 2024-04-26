package com.google.gson.internal;

import com.google.gson.f;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

/* compiled from: ConstructorConstructor */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Type, f<?>> f9950a;

    /* renamed from: b  reason: collision with root package name */
    public final hb.b f9951b = hb.b.f18970a;

    /* compiled from: ConstructorConstructor */
    public class a implements t<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f9952a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Type f9953b;

        public a(h hVar, f fVar, Type type) {
            this.f9952a = fVar;
            this.f9953b = type;
        }

        public T a() {
            return this.f9952a.a(this.f9953b);
        }
    }

    /* compiled from: ConstructorConstructor */
    public class b implements t<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f9954a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Type f9955b;

        public b(h hVar, f fVar, Type type) {
            this.f9954a = fVar;
            this.f9955b = type;
        }

        public T a() {
            return this.f9954a.a(this.f9955b);
        }
    }

    public h(Map<Type, f<?>> map) {
        this.f9950a = map;
    }

    public <T> t<T> a(ib.a<T> aVar) {
        i iVar;
        Type type = aVar.f19349b;
        Class<? super T> cls = aVar.f19348a;
        f fVar = this.f9950a.get(type);
        if (fVar != null) {
            return new a(this, fVar, type);
        }
        f fVar2 = this.f9950a.get(cls);
        if (fVar2 != null) {
            return new b(this, fVar2, type);
        }
        t<T> tVar = null;
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f9951b.a(declaredConstructor);
            }
            iVar = new i(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            iVar = null;
        }
        if (iVar != null) {
            return iVar;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                tVar = new j(this);
            } else if (EnumSet.class.isAssignableFrom(cls)) {
                tVar = new k(this, type);
            } else if (Set.class.isAssignableFrom(cls)) {
                tVar = new l(this);
            } else if (Queue.class.isAssignableFrom(cls)) {
                tVar = new m(this);
            } else {
                tVar = new n(this);
            }
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                tVar = new o(this);
            } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
                tVar = new c(this);
            } else if (SortedMap.class.isAssignableFrom(cls)) {
                tVar = new d(this);
            } else {
                if (type instanceof ParameterizedType) {
                    Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                    type2.getClass();
                    Type a10 = b.a(type2);
                    Class<?> e10 = b.e(a10);
                    a10.hashCode();
                    if (!String.class.isAssignableFrom(e10)) {
                        tVar = new e(this);
                    }
                }
                tVar = new f(this);
            }
        }
        if (tVar != null) {
            return tVar;
        }
        return new g(this, cls, type);
    }

    public String toString() {
        return this.f9950a.toString();
    }
}
