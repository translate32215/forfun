package d5;

import com.google.android.exoplayer2.upstream.c;
import java.io.IOException;
import java.util.Arrays;
import v6.v;
import x4.b0;

/* compiled from: TrackOutput */
public interface a0 {

    /* compiled from: TrackOutput */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f12996a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f12997b;

        /* renamed from: c  reason: collision with root package name */
        public final int f12998c;

        /* renamed from: d  reason: collision with root package name */
        public final int f12999d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f12996a = i10;
            this.f12997b = bArr;
            this.f12998c = i11;
            this.f12999d = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f12996a == aVar.f12996a && this.f12998c == aVar.f12998c && this.f12999d == aVar.f12999d && Arrays.equals(this.f12997b, aVar.f12997b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((((Arrays.hashCode(this.f12997b) + (this.f12996a * 31)) * 31) + this.f12998c) * 31) + this.f12999d;
        }
    }

    int a(c cVar, int i10, boolean z10, int i11) throws IOException;

    void b(v vVar, int i10);

    void c(b0 b0Var);

    void d(long j10, int i10, int i11, int i12, a aVar);

    void e(v vVar, int i10, int i11);

    int f(c cVar, int i10, boolean z10) throws IOException;
}
