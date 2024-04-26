package com.google.gson.internal;

import android.support.v4.media.a;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* compiled from: ConstructorConstructor */
public class g implements t<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f9947a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Class f9948b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Type f9949c;

    public g(h hVar, Class cls, Type type) {
        b0 b0Var;
        this.f9948b = cls;
        this.f9949c = type;
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            b0Var = new x(cls2.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get((Object) null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                b0Var = new y(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                    declaredMethod3.setAccessible(true);
                    b0Var = new z(declaredMethod3);
                } catch (Exception unused3) {
                    b0Var = new a0();
                }
            }
        }
        this.f9947a = b0Var;
    }

    public Object a() {
        try {
            return this.f9947a.b(this.f9948b);
        } catch (Exception e10) {
            StringBuilder a10 = a.a("Unable to invoke no-args constructor for ");
            a10.append(this.f9949c);
            a10.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
            throw new RuntimeException(a10.toString(), e10);
        }
    }
}
