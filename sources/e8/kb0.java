package e8;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class kb0 extends ou<Integer, Long> {

    /* renamed from: a  reason: collision with root package name */
    public Long f15267a;

    /* renamed from: b  reason: collision with root package name */
    public Long f15268b;

    /* renamed from: c  reason: collision with root package name */
    public Long f15269c;

    /* renamed from: d  reason: collision with root package name */
    public Long f15270d;

    public kb0(String str) {
        c(str);
    }

    public final HashMap<Integer, Long> b() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f15267a);
        hashMap.put(1, this.f15268b);
        hashMap.put(2, this.f15269c);
        hashMap.put(3, this.f15270d);
        return hashMap;
    }

    public final void c(String str) {
        HashMap a10 = ou.a(str);
        if (a10 != null) {
            this.f15267a = (Long) a10.get(0);
            this.f15268b = (Long) a10.get(1);
            this.f15269c = (Long) a10.get(2);
            this.f15270d = (Long) a10.get(3);
        }
    }
}
