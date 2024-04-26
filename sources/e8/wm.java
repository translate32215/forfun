package e8;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class wm implements bh<fh> {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, lt<fh>> f17369a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, lt<fn>> f17370b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, iu<fn>> f17371c;

    /* renamed from: d  reason: collision with root package name */
    public final ab0<bh<dg>> f17372d;

    /* renamed from: e  reason: collision with root package name */
    public final qn f17373e;

    public wm(Map<String, lt<fh>> map, Map<String, lt<fn>> map2, Map<String, iu<fn>> map3, ab0<bh<dg>> ab0, qn qnVar) {
        this.f17369a = map;
        this.f17370b = map2;
        this.f17371c = map3;
        this.f17372d = ab0;
        this.f17373e = qnVar;
    }

    public final lt<fh> a(int i10, String str) {
        lt a10;
        lt<fh> ltVar = this.f17369a.get(str);
        if (ltVar != null) {
            return ltVar;
        }
        if (i10 != 1) {
            if (i10 != 4) {
                return null;
            }
            iu iuVar = this.f17371c.get(str);
            if (iuVar != null) {
                return new nt(iuVar, eh.f14484a);
            }
            lt ltVar2 = this.f17370b.get(str);
            if (ltVar2 != null) {
                return new nt(ltVar2, hh.f14915a);
            }
            return null;
        } else if (this.f17373e.f16186d == null || (a10 = this.f17372d.get().a(i10, str)) == null) {
            return null;
        } else {
            return new nt(a10, hh.f14915a);
        }
    }
}
