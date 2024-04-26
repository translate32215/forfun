package yd;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import ud.k;

/* compiled from: PlatformThreadLocalRandom.kt */
public final class a extends xd.a {
    public Random b() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        k.e(current, "current()");
        return current;
    }
}
