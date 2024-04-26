package e8;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class db0 extends ou<Integer, Object> {

    /* renamed from: a  reason: collision with root package name */
    public Long f14242a;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f14243b;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f14244c;

    public db0(String str) {
        c(str);
    }

    public final HashMap<Integer, Object> b() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.f14242a);
        hashMap.put(1, this.f14243b);
        hashMap.put(2, this.f14244c);
        return hashMap;
    }

    public final void c(String str) {
        HashMap a10 = ou.a(str);
        if (a10 != null) {
            this.f14242a = (Long) a10.get(0);
            this.f14243b = (Boolean) a10.get(1);
            this.f14244c = (Boolean) a10.get(2);
        }
    }
}
