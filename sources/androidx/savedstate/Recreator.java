package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import j.f;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import q.b;
import ud.k;
import w1.a;
import w1.c;

/* compiled from: Recreator.kt */
public final class Recreator implements r {

    /* renamed from: a  reason: collision with root package name */
    public final c f3163a;

    /* compiled from: Recreator.kt */
    public static final class a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public final Set<String> f3164a = new LinkedHashSet();

        public a(w1.a aVar) {
            aVar.d("androidx.savedstate.Restarter", this);
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f3164a));
            return bundle;
        }
    }

    public Recreator(c cVar) {
        k.f(cVar, "owner");
        this.f3163a = cVar;
    }

    public void d(t tVar, o.b bVar) {
        k.f(tVar, "source");
        k.f(bVar, "event");
        if (bVar == o.b.ON_CREATE) {
            tVar.c().c(this);
            Bundle a10 = this.f3163a.e().a("androidx.savedstate.Restarter");
            if (a10 != null) {
                ArrayList<String> stringArrayList = a10.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    for (String next : stringArrayList) {
                        try {
                            Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(a.C0269a.class);
                            k.e(asSubclass, "{\n                Class.…class.java)\n            }");
                            try {
                                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                declaredConstructor.setAccessible(true);
                                try {
                                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                                    k.e(newInstance, "{\n                constr…wInstance()\n            }");
                                    ((a.C0269a) newInstance).a(this.f3163a);
                                } catch (Exception e10) {
                                    throw new RuntimeException(f.a("Failed to instantiate ", next), e10);
                                }
                            } catch (NoSuchMethodException e11) {
                                StringBuilder a11 = android.support.v4.media.a.a("Class ");
                                a11.append(asSubclass.getSimpleName());
                                a11.append(" must have default constructor in order to be automatically recreated");
                                throw new IllegalStateException(a11.toString(), e11);
                            }
                        } catch (ClassNotFoundException e12) {
                            throw new RuntimeException(b.a("Class ", next, " wasn't found"), e12);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
