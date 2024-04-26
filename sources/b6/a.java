package b6;

import com.google.android.exoplayer2.upstream.e;
import x4.b0;

/* compiled from: BaseMediaChunk */
public abstract class a extends m {

    /* renamed from: k  reason: collision with root package name */
    public final long f3566k;

    /* renamed from: l  reason: collision with root package name */
    public final long f3567l;

    /* renamed from: m  reason: collision with root package name */
    public c f3568m;

    /* renamed from: n  reason: collision with root package name */
    public int[] f3569n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(e eVar, u6.e eVar2, b0 b0Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(eVar, eVar2, b0Var, i10, obj, j10, j11, j14);
        this.f3566k = j12;
        this.f3567l = j13;
    }

    public final int e(int i10) {
        int[] iArr = this.f3569n;
        v6.a.f(iArr);
        return iArr[i10];
    }
}
