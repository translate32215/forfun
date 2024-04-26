package c0;

import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: ActivityRecreator */
public class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f3934a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3935b;

    public d(Object obj, Object obj2) {
        this.f3934a = obj;
        this.f3935b = obj2;
    }

    public void run() {
        try {
            Method method = e.f3939d;
            if (method != null) {
                method.invoke(this.f3934a, new Object[]{this.f3935b, Boolean.FALSE, "AppCompat recreation"});
                return;
            }
            e.f3940e.invoke(this.f3934a, new Object[]{this.f3935b, Boolean.FALSE});
        } catch (RuntimeException e10) {
            if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                throw e10;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
