package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Lifecycling */
public class x {

    /* renamed from: a  reason: collision with root package name */
    public static Map<Class<?>, Integer> f2737a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static Map<Class<?>, List<Constructor<? extends m>>> f2738b = new HashMap();

    public static m a(Constructor<? extends m> constructor, Object obj) {
        try {
            return (m) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    public static String b(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    public static int c(Class<?> cls) {
        Constructor<?> constructor;
        boolean z10;
        Integer num = (Integer) ((HashMap) f2737a).get(cls);
        if (num != null) {
            return num.intValue();
        }
        Class<s> cls2 = s.class;
        int i10 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package packageR = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = packageR != null ? packageR.getName() : "";
                if (!name.isEmpty()) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String b10 = b(canonicalName);
                if (!name.isEmpty()) {
                    b10 = name + "." + b10;
                }
                constructor = Class.forName(b10).getDeclaredConstructor(new Class[]{cls});
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(e10);
            }
            if (constructor != null) {
                ((HashMap) f2738b).put(cls, Collections.singletonList(constructor));
            } else {
                f fVar = f.f2648c;
                Boolean bool = fVar.f2650b.get(cls);
                if (bool != null) {
                    z10 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                fVar.f2650b.put(cls, Boolean.FALSE);
                                z10 = false;
                                break;
                            } else if (((d0) declaredMethods[i11].getAnnotation(d0.class)) != null) {
                                fVar.a(cls, declaredMethods);
                                z10 = true;
                                break;
                            } else {
                                i11++;
                            }
                        }
                    } catch (NoClassDefFoundError e11) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e11);
                    }
                }
                if (!z10) {
                    Class<? super Object> superclass = cls.getSuperclass();
                    if (superclass != null && cls2.isAssignableFrom(superclass)) {
                        if (c(superclass) != 1) {
                            arrayList = new ArrayList((Collection) ((HashMap) f2738b).get(superclass));
                        }
                    }
                    Class[] interfaces = cls.getInterfaces();
                    int length2 = interfaces.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length2) {
                            Class cls3 = interfaces[i12];
                            if (cls3 != null && cls2.isAssignableFrom(cls3)) {
                                if (c(cls3) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.addAll((Collection) ((HashMap) f2738b).get(cls3));
                            }
                            i12++;
                        } else if (arrayList != null) {
                            ((HashMap) f2738b).put(cls, arrayList);
                        }
                    }
                }
            }
            i10 = 2;
        }
        ((HashMap) f2737a).put(cls, Integer.valueOf(i10));
        return i10;
    }
}
