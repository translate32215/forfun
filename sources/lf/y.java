package lf;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import lf.c;
import lf.j;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: Platform */
public class y {

    /* renamed from: a  reason: collision with root package name */
    public static final y f21433a;

    /* compiled from: Platform */
    public static class a extends y {

        /* renamed from: lf.y$a$a  reason: collision with other inner class name */
        /* compiled from: Platform */
        public static class C0187a implements Executor {

            /* renamed from: a  reason: collision with root package name */
            public final Handler f21434a = new Handler(Looper.getMainLooper());

            public void execute(Runnable runnable) {
                this.f21434a.post(runnable);
            }
        }

        public List<? extends c.a> a(@Nullable Executor executor) {
            if (executor != null) {
                k kVar = new k(executor);
                if (Build.VERSION.SDK_INT < 24) {
                    return Collections.singletonList(kVar);
                }
                return Arrays.asList(new c.a[]{g.f21339a, kVar});
            }
            throw new AssertionError();
        }

        public int b() {
            return Build.VERSION.SDK_INT >= 24 ? 2 : 1;
        }

        public Executor c() {
            return new C0187a();
        }

        public List<? extends j.a> d() {
            if (Build.VERSION.SDK_INT >= 24) {
                return Collections.singletonList(u.f21394a);
            }
            return Collections.emptyList();
        }

        public int e() {
            return Build.VERSION.SDK_INT >= 24 ? 1 : 0;
        }

        @IgnoreJRERequirement
        public boolean g(Method method) {
            if (Build.VERSION.SDK_INT < 24) {
                return false;
            }
            return method.isDefault();
        }
    }

    @IgnoreJRERequirement
    /* compiled from: Platform */
    public static class b extends y {
        public List<? extends c.a> a(@Nullable Executor executor) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(g.f21339a);
            arrayList.add(new k(executor));
            return Collections.unmodifiableList(arrayList);
        }

        public int b() {
            return 2;
        }

        public List<? extends j.a> d() {
            return Collections.singletonList(u.f21394a);
        }

        public int e() {
            return 1;
        }

        public Object f(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) throws Throwable {
            Constructor<MethodHandles.Lookup> declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new Object[]{cls, -1}).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }

        public boolean g(Method method) {
            return method.isDefault();
        }
    }

    static {
        y yVar;
        try {
            Class.forName("android.os.Build");
            yVar = new a();
        } catch (ClassNotFoundException unused) {
            try {
                Class.forName("java.util.Optional");
                yVar = new b();
            } catch (ClassNotFoundException unused2) {
                yVar = new y();
            }
        }
        f21433a = yVar;
    }

    public List<? extends c.a> a(@Nullable Executor executor) {
        return Collections.singletonList(new k(executor));
    }

    public int b() {
        return 1;
    }

    @Nullable
    public Executor c() {
        return null;
    }

    public List<? extends j.a> d() {
        return Collections.emptyList();
    }

    public int e() {
        return 0;
    }

    @Nullable
    public Object f(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) throws Throwable {
        throw new UnsupportedOperationException();
    }

    public boolean g(Method method) {
        return false;
    }
}
