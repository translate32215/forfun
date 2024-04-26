package z1;

import android.content.Context;
import android.os.Bundle;
import com.startapp.startappsdk.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: AppInitializer */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static volatile a f28207d;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f28208e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, Object> f28209a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Set<Class<? extends b<?>>> f28210b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public final Context f28211c;

    public a(Context context) {
        this.f28211c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f28207d == null) {
            synchronized (f28208e) {
                if (f28207d == null) {
                    f28207d = new a(context);
                }
            }
        }
        return f28207d;
    }

    public void a(Bundle bundle) {
        String string = this.f28211c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, (String) null))) {
                        Class<?> cls = Class.forName(str);
                        if (b.class.isAssignableFrom(cls)) {
                            this.f28210b.add(cls);
                        }
                    }
                }
                for (Class<? extends b<?>> b10 : this.f28210b) {
                    b(b10, hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new c((Throwable) e10);
            }
        }
    }

    public final <T> T b(Class<? extends b<?>> cls, Set<Class<?>> set) {
        T t10;
        if (a2.a.c()) {
            try {
                a2.a.a(cls.getSimpleName());
            } catch (Throwable th) {
                a2.a.b();
                throw th;
            }
        }
        if (!set.contains(cls)) {
            if (!this.f28209a.containsKey(cls)) {
                set.add(cls);
                b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends b<?>>> a10 = bVar.a();
                if (!a10.isEmpty()) {
                    for (Class next : a10) {
                        if (!this.f28209a.containsKey(next)) {
                            b(next, set);
                        }
                    }
                }
                t10 = bVar.b(this.f28211c);
                set.remove(cls);
                this.f28209a.put(cls, t10);
            } else {
                t10 = this.f28209a.get(cls);
            }
            a2.a.b();
            return t10;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
    }
}
