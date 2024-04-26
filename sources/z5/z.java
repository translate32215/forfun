package z5;

import java.nio.ByteBuffer;
import u6.f;
import v6.v;

/* compiled from: SampleDataQueue */
public class z {

    /* renamed from: a  reason: collision with root package name */
    public final f f28714a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28715b;

    /* renamed from: c  reason: collision with root package name */
    public final v f28716c = new v(32);

    /* renamed from: d  reason: collision with root package name */
    public a f28717d;

    /* renamed from: e  reason: collision with root package name */
    public a f28718e;

    /* renamed from: f  reason: collision with root package name */
    public a f28719f;

    /* renamed from: g  reason: collision with root package name */
    public long f28720g;

    /* compiled from: SampleDataQueue */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f28721a;

        /* renamed from: b  reason: collision with root package name */
        public final long f28722b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f28723c;

        /* renamed from: d  reason: collision with root package name */
        public u6.a f28724d;

        /* renamed from: e  reason: collision with root package name */
        public a f28725e;

        public a(long j10, int i10) {
            this.f28721a = j10;
            this.f28722b = j10 + ((long) i10);
        }

        public int a(long j10) {
            return ((int) (j10 - this.f28721a)) + this.f28724d.f26039b;
        }
    }

    public z(f fVar) {
        this.f28714a = fVar;
        int i10 = fVar.f26060c;
        this.f28715b = i10;
        a aVar = new a(0, i10);
        this.f28717d = aVar;
        this.f28718e = aVar;
        this.f28719f = aVar;
    }

    public static a e(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= aVar.f28722b) {
            aVar = aVar.f28725e;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (aVar.f28722b - j10));
            byteBuffer.put(aVar.f28724d.f26038a, aVar.a(j10), min);
            i10 -= min;
            j10 += (long) min;
            if (j10 == aVar.f28722b) {
                aVar = aVar.f28725e;
            }
        }
        return aVar;
    }

    public static a f(a aVar, long j10, byte[] bArr, int i10) {
        while (j10 >= aVar.f28722b) {
            aVar = aVar.f28725e;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (aVar.f28722b - j10));
            System.arraycopy(aVar.f28724d.f26038a, aVar.a(j10), bArr, i10 - i11, min);
            i11 -= min;
            j10 += (long) min;
            if (j10 == aVar.f28722b) {
                aVar = aVar.f28725e;
            }
        }
        return aVar;
    }

    public final void a(a aVar) {
        if (aVar.f28723c) {
            a aVar2 = this.f28719f;
            int i10 = (((int) (aVar2.f28721a - aVar.f28721a)) / this.f28715b) + (aVar2.f28723c ? 1 : 0);
            u6.a[] aVarArr = new u6.a[i10];
            int i11 = 0;
            while (i11 < i10) {
                aVarArr[i11] = aVar.f28724d;
                aVar.f28724d = null;
                a aVar3 = aVar.f28725e;
                aVar.f28725e = null;
                i11++;
                aVar = aVar3;
            }
            this.f28714a.a(aVarArr);
        }
    }

    public void b(long j10) {
        if (j10 != -1) {
            while (true) {
                a aVar = this.f28717d;
                if (j10 >= aVar.f28722b) {
                    f fVar = this.f28714a;
                    u6.a aVar2 = aVar.f28724d;
                    synchronized (fVar) {
                        Object obj = fVar.f26062e;
                        ((u6.a[]) obj)[0] = aVar2;
                        fVar.a((u6.a[]) obj);
                    }
                    a aVar3 = this.f28717d;
                    aVar3.f28724d = null;
                    a aVar4 = aVar3.f28725e;
                    aVar3.f28725e = null;
                    this.f28717d = aVar4;
                } else if (this.f28718e.f28721a < aVar.f28721a) {
                    this.f28718e = aVar;
                    return;
                } else {
                    return;
                }
            }
        }
    }

    public final void c(int i10) {
        long j10 = this.f28720g + ((long) i10);
        this.f28720g = j10;
        a aVar = this.f28719f;
        if (j10 == aVar.f28722b) {
            this.f28719f = aVar.f28725e;
        }
    }

    public final int d(int i10) {
        u6.a aVar;
        a aVar2 = this.f28719f;
        if (!aVar2.f28723c) {
            f fVar = this.f28714a;
            synchronized (fVar) {
                fVar.f26064g++;
                int i11 = fVar.f26065h;
                if (i11 > 0) {
                    int i12 = i11 - 1;
                    fVar.f26065h = i12;
                    aVar = ((u6.a[]) fVar.f26066i)[i12];
                    aVar.getClass();
                    ((u6.a[]) fVar.f26066i)[fVar.f26065h] = null;
                } else {
                    aVar = new u6.a(new byte[fVar.f26060c], 0);
                }
            }
            a aVar3 = new a(this.f28719f.f28722b, this.f28715b);
            aVar2.f28724d = aVar;
            aVar2.f28725e = aVar3;
            aVar2.f28723c = true;
        }
        return Math.min(i10, (int) (this.f28719f.f28722b - this.f28720g));
    }
}
