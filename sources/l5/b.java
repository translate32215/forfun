package l5;

import d5.j;
import d5.p;
import d5.q;
import d5.r;
import d5.s;
import d5.x;
import java.util.Arrays;
import l5.h;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import v6.e0;
import v6.v;

/* compiled from: FlacReader */
public final class b extends h {

    /* renamed from: n  reason: collision with root package name */
    public s f21053n;

    /* renamed from: o  reason: collision with root package name */
    public a f21054o;

    /* compiled from: FlacReader */
    public static final class a implements f {

        /* renamed from: a  reason: collision with root package name */
        public s f21055a;

        /* renamed from: b  reason: collision with root package name */
        public s.a f21056b;

        /* renamed from: c  reason: collision with root package name */
        public long f21057c = -1;

        /* renamed from: d  reason: collision with root package name */
        public long f21058d = -1;

        public a(s sVar, s.a aVar) {
            this.f21055a = sVar;
            this.f21056b = aVar;
        }

        public x a() {
            v6.a.d(this.f21057c != -1);
            return new r(this.f21055a, this.f21057c);
        }

        public long b(j jVar) {
            long j10 = this.f21058d;
            if (j10 < 0) {
                return -1;
            }
            long j11 = -(j10 + 2);
            this.f21058d = -1;
            return j11;
        }

        public void c(long j10) {
            long[] jArr = this.f21056b.f13053a;
            this.f21058d = jArr[e0.f(jArr, j10, true, true)];
        }
    }

    public long c(v vVar) {
        byte[] bArr = vVar.f26518a;
        if (!(bArr[0] == -1)) {
            return -1;
        }
        int i10 = (bArr[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            vVar.E(4);
            vVar.y();
        }
        int c10 = p.c(vVar, i10);
        vVar.D(0);
        return (long) c10;
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public boolean d(v vVar, long j10, h.b bVar) {
        byte[] bArr = vVar.f26518a;
        s sVar = this.f21053n;
        if (sVar == null) {
            s sVar2 = new s(bArr, 17);
            this.f21053n = sVar2;
            bVar.f21089a = sVar2.e(Arrays.copyOfRange(bArr, 9, vVar.f26520c), (q5.a) null);
            return true;
        } else if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            s.a b10 = q.b(vVar);
            s b11 = sVar.b(b10);
            this.f21053n = b11;
            this.f21054o = new a(b11, b10);
            return true;
        } else {
            if (!(bArr[0] == -1)) {
                return true;
            }
            a aVar = this.f21054o;
            if (aVar != null) {
                aVar.f21057c = j10;
                bVar.f21090b = aVar;
            }
            bVar.f21089a.getClass();
            return false;
        }
    }

    public void e(boolean z10) {
        super.e(z10);
        if (z10) {
            this.f21053n = null;
            this.f21054o = null;
        }
    }
}
