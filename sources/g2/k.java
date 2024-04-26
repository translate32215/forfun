package g2;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import j.f;

/* compiled from: WorkerFactory */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final String f18419a = e.e("WorkerFactory");

    public final ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        try {
            try {
                return (ListenableWorker) Class.forName(str).asSubclass(ListenableWorker.class).getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
            } catch (Exception e10) {
                e.c().b(f18419a, f.a("Could not instantiate ", str), e10);
                return null;
            }
        } catch (ClassNotFoundException unused) {
            e.c().b(f18419a, f.a("Class not found: ", str), new Throwable[0]);
            return null;
        }
    }
}
