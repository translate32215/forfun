package x4;

import java.util.Collection;
import java.util.HashMap;
import z5.d0;

/* compiled from: PlaylistTimeline */
public final class t0 extends a {

    /* renamed from: e  reason: collision with root package name */
    public final int f27725e;

    /* renamed from: f  reason: collision with root package name */
    public final int f27726f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f27727g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f27728h;

    /* renamed from: i  reason: collision with root package name */
    public final c1[] f27729i;

    /* renamed from: j  reason: collision with root package name */
    public final Object[] f27730j;

    /* renamed from: k  reason: collision with root package name */
    public final HashMap<Object, Integer> f27731k = new HashMap<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t0(Collection<? extends j0> collection, d0 d0Var) {
        super(false, d0Var);
        int i10 = 0;
        int size = collection.size();
        this.f27727g = new int[size];
        this.f27728h = new int[size];
        this.f27729i = new c1[size];
        this.f27730j = new Object[size];
        int i11 = 0;
        int i12 = 0;
        for (j0 j0Var : collection) {
            this.f27729i[i12] = j0Var.b();
            this.f27728h[i12] = i10;
            this.f27727g[i12] = i11;
            i10 += this.f27729i[i12].p();
            i11 += this.f27729i[i12].i();
            this.f27730j[i12] = j0Var.a();
            this.f27731k.put(this.f27730j[i12], Integer.valueOf(i12));
            i12++;
        }
        this.f27725e = i10;
        this.f27726f = i11;
    }

    public int i() {
        return this.f27726f;
    }

    public int p() {
        return this.f27725e;
    }
}
