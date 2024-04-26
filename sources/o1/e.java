package o1;

import ae.b;
import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.Arrays;
import o1.d;
import td.a;
import ud.k;

/* compiled from: NavArgsLazy.kt */
public final class e<Args extends d> implements kd.d<Args> {

    /* renamed from: a  reason: collision with root package name */
    public final b<Args> f22673a;

    /* renamed from: b  reason: collision with root package name */
    public final a<Bundle> f22674b;

    /* renamed from: c  reason: collision with root package name */
    public Args f22675c;

    public e(b<Args> bVar, a<Bundle> aVar) {
        this.f22673a = bVar;
        this.f22674b = aVar;
    }

    public Object getValue() {
        Args args = this.f22675c;
        if (args != null) {
            return args;
        }
        Bundle d10 = this.f22674b.d();
        Class<Bundle>[] clsArr = f.f22679a;
        s.a<b<? extends d>, Method> aVar = f.f22680b;
        Method method = aVar.get(this.f22673a);
        if (method == null) {
            Class<Args> a10 = sd.a.a(this.f22673a);
            Class<Bundle>[] clsArr2 = f.f22679a;
            method = a10.getMethod("fromBundle", (Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
            aVar.put(this.f22673a, method);
            k.e(method, "navArgsClass.java.getMet…hod\n                    }");
        }
        Args invoke = method.invoke((Object) null, new Object[]{d10});
        if (invoke != null) {
            Args args2 = (d) invoke;
            this.f22675c = args2;
            return args2;
        }
        throw new NullPointerException("null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
    }
}
