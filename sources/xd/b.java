package xd;

import java.util.Random;
import ud.k;

/* compiled from: PlatformRandom.kt */
public final class b extends a {

    /* renamed from: c  reason: collision with root package name */
    public final a f27935c = new a();

    /* compiled from: PlatformRandom.kt */
    public static final class a extends ThreadLocal<Random> {
        public Object initialValue() {
            return new Random();
        }
    }

    public Random b() {
        Object obj = this.f27935c.get();
        k.e(obj, "implStorage.get()");
        return (Random) obj;
    }
}
