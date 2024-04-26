package c8;

import android.content.Context;
import android.os.IBinder;
import s7.i;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f4360a;

    /* renamed from: b  reason: collision with root package name */
    public Object f4361b;

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    public c(String str) {
        this.f4360a = str;
    }

    public abstract T a(IBinder iBinder);

    public final T b(Context context) throws a {
        if (this.f4361b == null) {
            if (context != null) {
                Context a10 = i.a(context);
                if (a10 != null) {
                    try {
                        this.f4361b = a((IBinder) a10.getClassLoader().loadClass(this.f4360a).newInstance());
                    } catch (ClassNotFoundException e10) {
                        throw new a("Could not load creator class.", e10);
                    } catch (InstantiationException e11) {
                        throw new a("Could not instantiate creator.", e11);
                    } catch (IllegalAccessException e12) {
                        throw new a("Could not access creator.", e12);
                    }
                } else {
                    throw new a("Could not get remote context.");
                }
            } else {
                throw new NullPointerException("null reference");
            }
        }
        return this.f4361b;
    }
}
