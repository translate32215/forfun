package e8;

import android.location.Location;
import g7.c;
import java.util.Date;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class n5 implements c {

    /* renamed from: a  reason: collision with root package name */
    public final Date f15588a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15589b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<String> f15590c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f15591d;

    /* renamed from: e  reason: collision with root package name */
    public final Location f15592e;

    /* renamed from: f  reason: collision with root package name */
    public final int f15593f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f15594g;

    public n5(Date date, int i10, Set<String> set, Location location, boolean z10, int i11, boolean z11, int i12, String str) {
        this.f15588a = date;
        this.f15589b = i10;
        this.f15590c = set;
        this.f15592e = location;
        this.f15591d = z10;
        this.f15593f = i11;
        this.f15594g = z11;
    }

    @Deprecated
    public final boolean a() {
        return this.f15594g;
    }

    @Deprecated
    public final Date b() {
        return this.f15588a;
    }

    public final boolean c() {
        return this.f15591d;
    }

    public final Set<String> d() {
        return this.f15590c;
    }

    public final int e() {
        return this.f15593f;
    }

    public final Location f() {
        return this.f15592e;
    }

    @Deprecated
    public final int g() {
        return this.f15589b;
    }
}
