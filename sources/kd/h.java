package kd;

import java.io.Serializable;
import ud.k;

/* compiled from: Result.kt */
public final class h<T> implements Serializable {

    /* compiled from: Result.kt */
    public static final class a implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f20616a;

        public a(Throwable th) {
            this.f20616a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && k.a(this.f20616a, ((a) obj).f20616a);
        }

        public int hashCode() {
            return this.f20616a.hashCode();
        }

        public String toString() {
            StringBuilder a10 = android.support.v4.media.a.a("Failure(");
            a10.append(this.f20616a);
            a10.append(')');
            return a10.toString();
        }
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).f20616a;
        }
        return null;
    }
}
