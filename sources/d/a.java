package d;

import android.content.Context;
import android.content.Intent;
import ud.k;

/* compiled from: ActivityResultContract.kt */
public abstract class a<I, O> {

    /* renamed from: d.a$a  reason: collision with other inner class name */
    /* compiled from: ActivityResultContract.kt */
    public static final class C0125a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f12939a;

        public C0125a(T t10) {
            this.f12939a = t10;
        }
    }

    public abstract Intent a(Context context, I i10);

    public C0125a<O> b(Context context, I i10) {
        k.f(context, "context");
        return null;
    }

    public abstract O c(int i10, Intent intent);
}
