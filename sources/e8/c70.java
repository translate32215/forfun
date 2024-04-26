package e8;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class c70 extends ou<Integer, Long> {

    /* renamed from: a  reason: collision with root package name */
    public long f14087a = -1;

    /* renamed from: b  reason: collision with root package name */
    public long f14088b = -1;

    public c70(String str) {
        c(str);
    }

    public final HashMap<Integer, Long> b() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, Long.valueOf(this.f14087a));
        hashMap.put(1, Long.valueOf(this.f14088b));
        return hashMap;
    }

    public final void c(String str) {
        HashMap a10 = ou.a(str);
        if (a10 != null) {
            this.f14087a = ((Long) a10.get(0)).longValue();
            this.f14088b = ((Long) a10.get(1)).longValue();
        }
    }
}
