package r6;

import b6.e;
import b6.m;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import java.util.List;
import x4.b0;
import x4.c1;
import z5.f0;
import z5.r;

/* compiled from: ExoTrackSelection */
public interface h extends k {

    /* compiled from: ExoTrackSelection */
    public interface b {
        h[] a(a[] aVarArr, u6.b bVar, r.a aVar, c1 c1Var);
    }

    boolean a(int i10, long j10);

    void b(boolean z10);

    void d();

    void e();

    int g(long j10, List<? extends m> list);

    void h(long j10, long j11, long j12, List<? extends m> list, MediaChunkIterator[] mediaChunkIteratorArr);

    int i();

    b0 k();

    int l();

    int m();

    void n(float f10);

    Object p();

    void q();

    boolean r(long j10, e eVar, List<? extends m> list);

    void s();

    /* compiled from: ExoTrackSelection */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final f0 f24649a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f24650b;

        /* renamed from: c  reason: collision with root package name */
        public final int f24651c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f24652d;

        public a(f0 f0Var, int... iArr) {
            this.f24649a = f0Var;
            this.f24650b = iArr;
            this.f24651c = 0;
            this.f24652d = null;
        }

        public a(f0 f0Var, int[] iArr, int i10, Object obj) {
            this.f24649a = f0Var;
            this.f24650b = iArr;
            this.f24651c = i10;
            this.f24652d = obj;
        }
    }
}
