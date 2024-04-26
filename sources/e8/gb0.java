package e8;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class gb0 extends ou<Integer, Long> {

    /* renamed from: a  reason: collision with root package name */
    public Long f14762a;

    /* renamed from: b  reason: collision with root package name */
    public Long f14763b;

    public gb0(String str) {
        c(str);
    }

    public final HashMap<Integer, Long> b() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f14762a);
        hashMap.put(1, this.f14763b);
        return hashMap;
    }

    public final void c(String str) {
        HashMap a10 = ou.a(str);
        if (a10 != null) {
            this.f14762a = (Long) a10.get(0);
            this.f14763b = (Long) a10.get(1);
        }
    }
}
