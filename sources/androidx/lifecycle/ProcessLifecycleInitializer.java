package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.o;
import androidx.lifecycle.q;
import java.util.Collections;
import java.util.List;
import z1.a;
import z1.b;

public final class ProcessLifecycleInitializer implements b<t> {
    public List<Class<? extends b<?>>> a() {
        return Collections.emptyList();
    }

    public Object b(Context context) {
        if (a.c(context).f28210b.contains(ProcessLifecycleInitializer.class)) {
            if (!q.f2706a.getAndSet(true)) {
                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new q.a());
            }
            e0 e0Var = e0.f2637i;
            e0Var.getClass();
            e0Var.f2642e = new Handler();
            e0Var.f2643f.f(o.b.ON_CREATE);
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new f0(e0Var));
            return e0Var;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
    }
}
