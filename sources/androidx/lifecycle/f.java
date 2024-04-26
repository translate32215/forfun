package androidx.lifecycle;

import androidx.lifecycle.o;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* compiled from: ClassesInfoCache */
public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static f f2648c = new f();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, a> f2649a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, Boolean> f2650b = new HashMap();

    @Deprecated
    /* compiled from: ClassesInfoCache */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Map<o.b, List<b>> f2651a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<b, o.b> f2652b;

        public a(Map<b, o.b> map) {
            this.f2652b = map;
            for (Map.Entry next : map.entrySet()) {
                o.b bVar = (o.b) next.getValue();
                List list = this.f2651a.get(bVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f2651a.put(bVar, list);
                }
                list.add((b) next.getKey());
            }
        }

        public static void a(List<b> list, t tVar, o.b bVar, Object obj) {
            if (list != null) {
                int size = list.size() - 1;
                while (size >= 0) {
                    b bVar2 = list.get(size);
                    bVar2.getClass();
                    try {
                        int i10 = bVar2.f2653a;
                        if (i10 == 0) {
                            bVar2.f2654b.invoke(obj, new Object[0]);
                        } else if (i10 == 1) {
                            bVar2.f2654b.invoke(obj, new Object[]{tVar});
                        } else if (i10 == 2) {
                            bVar2.f2654b.invoke(obj, new Object[]{tVar, bVar});
                        }
                        size--;
                    } catch (InvocationTargetException e10) {
                        throw new RuntimeException("Failed to call observer method", e10.getCause());
                    } catch (IllegalAccessException e11) {
                        throw new RuntimeException(e11);
                    }
                }
            }
        }
    }

    @Deprecated
    /* compiled from: ClassesInfoCache */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f2653a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f2654b;

        public b(int i10, Method method) {
            this.f2653a = i10;
            this.f2654b = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f2653a != bVar.f2653a || !this.f2654b.getName().equals(bVar.f2654b.getName())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f2654b.getName().hashCode() + (this.f2653a * 31);
        }
    }

    public final a a(Class<?> cls, Method[] methodArr) {
        int i10;
        a b10;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (b10 = b(superclass)) == null)) {
            hashMap.putAll(b10.f2652b);
        }
        for (Class b11 : cls.getInterfaces()) {
            for (Map.Entry next : b(b11).f2652b.entrySet()) {
                c(hashMap, (b) next.getKey(), (o.b) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e10) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
            }
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            d0 d0Var = (d0) method.getAnnotation(d0.class);
            if (d0Var != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else if (parameterTypes[0].isAssignableFrom(t.class)) {
                    i10 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                o.b value = d0Var.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(o.b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == o.b.ON_ANY) {
                        i10 = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    c(hashMap, new b(i10, method), value, cls);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.f2649a.put(cls, aVar);
        this.f2650b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    public a b(Class<?> cls) {
        a aVar = this.f2649a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return a(cls, (Method[]) null);
    }

    public final void c(Map<b, o.b> map, b bVar, o.b bVar2, Class<?> cls) {
        o.b bVar3 = map.get(bVar);
        if (bVar3 != null && bVar2 != bVar3) {
            Method method = bVar.f2654b;
            StringBuilder a10 = android.support.v4.media.a.a("Method ");
            a10.append(method.getName());
            a10.append(" in ");
            a10.append(cls.getName());
            a10.append(" already declared with different @OnLifecycleEvent value: previous value ");
            a10.append(bVar3);
            a10.append(", new value ");
            a10.append(bVar2);
            throw new IllegalArgumentException(a10.toString());
        } else if (bVar3 == null) {
            map.put(bVar, bVar2);
        }
    }
}
