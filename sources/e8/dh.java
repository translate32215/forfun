package e8;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class dh<AdT> implements bh<AdT> {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, lt<AdT>> f14273a;

    public dh(Map<String, lt<AdT>> map) {
        this.f14273a = map;
    }

    public final lt<AdT> a(int i10, String str) {
        return this.f14273a.get(str);
    }
}
