package e8;

import android.location.Location;
import g7.k;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class q5 implements k {

    /* renamed from: a  reason: collision with root package name */
    public final Date f16085a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16086b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<String> f16087c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f16088d;

    /* renamed from: e  reason: collision with root package name */
    public final Location f16089e;

    /* renamed from: f  reason: collision with root package name */
    public final int f16090f;

    /* renamed from: g  reason: collision with root package name */
    public final n1 f16091g;

    /* renamed from: h  reason: collision with root package name */
    public final List<String> f16092h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final boolean f16093i;

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, Boolean> f16094j = new HashMap();

    public q5(Date date, int i10, Set<String> set, Location location, boolean z10, int i11, n1 n1Var, List<String> list, boolean z11, int i12, String str) {
        this.f16085a = date;
        this.f16086b = i10;
        this.f16087c = set;
        this.f16089e = location;
        this.f16088d = z10;
        this.f16090f = i11;
        this.f16091g = n1Var;
        this.f16093i = z11;
        if (list != null) {
            for (String next : list) {
                if (next.startsWith("custom:")) {
                    String[] split = next.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.f16094j.put(split[1], Boolean.TRUE);
                        } else if ("false".equals(split[2])) {
                            this.f16094j.put(split[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.f16092h.add(next);
                }
            }
        }
    }

    @Deprecated
    public final boolean a() {
        return this.f16093i;
    }

    @Deprecated
    public final Date b() {
        return this.f16085a;
    }

    public final boolean c() {
        return this.f16088d;
    }

    public final Set<String> d() {
        return this.f16087c;
    }

    public final int e() {
        return this.f16090f;
    }

    public final Location f() {
        return this.f16089e;
    }

    @Deprecated
    public final int g() {
        return this.f16086b;
    }
}
