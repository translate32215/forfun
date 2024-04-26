package z4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import z4.g;

/* compiled from: SonicAudioProcessor */
public final class b0 implements g {

    /* renamed from: b  reason: collision with root package name */
    public int f28311b;

    /* renamed from: c  reason: collision with root package name */
    public float f28312c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f28313d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    public g.a f28314e;

    /* renamed from: f  reason: collision with root package name */
    public g.a f28315f;

    /* renamed from: g  reason: collision with root package name */
    public g.a f28316g;

    /* renamed from: h  reason: collision with root package name */
    public g.a f28317h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f28318i;

    /* renamed from: j  reason: collision with root package name */
    public a0 f28319j;

    /* renamed from: k  reason: collision with root package name */
    public ByteBuffer f28320k;

    /* renamed from: l  reason: collision with root package name */
    public ShortBuffer f28321l;

    /* renamed from: m  reason: collision with root package name */
    public ByteBuffer f28322m;

    /* renamed from: n  reason: collision with root package name */
    public long f28323n;

    /* renamed from: o  reason: collision with root package name */
    public long f28324o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f28325p;

    public b0() {
        g.a aVar = g.a.f28348e;
        this.f28314e = aVar;
        this.f28315f = aVar;
        this.f28316g = aVar;
        this.f28317h = aVar;
        ByteBuffer byteBuffer = g.f28347a;
        this.f28320k = byteBuffer;
        this.f28321l = byteBuffer.asShortBuffer();
        this.f28322m = byteBuffer;
        this.f28311b = -1;
    }

    public boolean a() {
        return this.f28315f.f28349a != -1 && (Math.abs(this.f28312c - 1.0f) >= 1.0E-4f || Math.abs(this.f28313d - 1.0f) >= 1.0E-4f || this.f28315f.f28349a != this.f28314e.f28349a);
    }

    public void b() {
        this.f28312c = 1.0f;
        this.f28313d = 1.0f;
        g.a aVar = g.a.f28348e;
        this.f28314e = aVar;
        this.f28315f = aVar;
        this.f28316g = aVar;
        this.f28317h = aVar;
        ByteBuffer byteBuffer = g.f28347a;
        this.f28320k = byteBuffer;
        this.f28321l = byteBuffer.asShortBuffer();
        this.f28322m = byteBuffer;
        this.f28311b = -1;
        this.f28318i = false;
        this.f28319j = null;
        this.f28323n = 0;
        this.f28324o = 0;
        this.f28325p = false;
    }

    public ByteBuffer c() {
        int i10;
        a0 a0Var = this.f28319j;
        if (a0Var != null && (i10 = a0Var.f28295m * a0Var.f28284b * 2) > 0) {
            if (this.f28320k.capacity() < i10) {
                ByteBuffer order = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
                this.f28320k = order;
                this.f28321l = order.asShortBuffer();
            } else {
                this.f28320k.clear();
                this.f28321l.clear();
            }
            ShortBuffer shortBuffer = this.f28321l;
            int min = Math.min(shortBuffer.remaining() / a0Var.f28284b, a0Var.f28295m);
            shortBuffer.put(a0Var.f28294l, 0, a0Var.f28284b * min);
            int i11 = a0Var.f28295m - min;
            a0Var.f28295m = i11;
            short[] sArr = a0Var.f28294l;
            int i12 = a0Var.f28284b;
            System.arraycopy(sArr, min * i12, sArr, 0, i11 * i12);
            this.f28324o += (long) i10;
            this.f28320k.limit(i10);
            this.f28322m = this.f28320k;
        }
        ByteBuffer byteBuffer = this.f28322m;
        this.f28322m = g.f28347a;
        return byteBuffer;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f28319j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d() {
        /*
            r2 = this;
            boolean r0 = r2.f28325p
            if (r0 == 0) goto L_0x0014
            z4.a0 r0 = r2.f28319j
            if (r0 == 0) goto L_0x0012
            int r1 = r0.f28295m
            int r0 = r0.f28284b
            int r1 = r1 * r0
            int r1 = r1 * 2
            if (r1 != 0) goto L_0x0014
        L_0x0012:
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.b0.d():boolean");
    }

    public void e() {
        int i10;
        a0 a0Var = this.f28319j;
        if (a0Var != null) {
            int i11 = a0Var.f28293k;
            float f10 = a0Var.f28285c;
            float f11 = a0Var.f28286d;
            float f12 = a0Var.f28287e * f11;
            int i12 = a0Var.f28295m + ((int) ((((((float) i11) / (f10 / f11)) + ((float) a0Var.f28297o)) / f12) + 0.5f));
            a0Var.f28292j = a0Var.c(a0Var.f28292j, i11, (a0Var.f28290h * 2) + i11);
            int i13 = 0;
            while (true) {
                i10 = a0Var.f28290h * 2;
                int i14 = a0Var.f28284b;
                if (i13 >= i10 * i14) {
                    break;
                }
                a0Var.f28292j[(i14 * i11) + i13] = 0;
                i13++;
            }
            a0Var.f28293k = i10 + a0Var.f28293k;
            a0Var.f();
            if (a0Var.f28295m > i12) {
                a0Var.f28295m = i12;
            }
            a0Var.f28293k = 0;
            a0Var.f28300r = 0;
            a0Var.f28297o = 0;
        }
        this.f28325p = true;
    }

    public void f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            a0 a0Var = this.f28319j;
            a0Var.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f28323n += (long) remaining;
            int remaining2 = asShortBuffer.remaining();
            int i10 = a0Var.f28284b;
            int i11 = remaining2 / i10;
            short[] c10 = a0Var.c(a0Var.f28292j, a0Var.f28293k, i11);
            a0Var.f28292j = c10;
            asShortBuffer.get(c10, a0Var.f28293k * a0Var.f28284b, ((i10 * i11) * 2) / 2);
            a0Var.f28293k += i11;
            a0Var.f();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    public void flush() {
        if (a()) {
            g.a aVar = this.f28314e;
            this.f28316g = aVar;
            g.a aVar2 = this.f28315f;
            this.f28317h = aVar2;
            if (this.f28318i) {
                this.f28319j = new a0(aVar.f28349a, aVar.f28350b, this.f28312c, this.f28313d, aVar2.f28349a);
            } else {
                a0 a0Var = this.f28319j;
                if (a0Var != null) {
                    a0Var.f28293k = 0;
                    a0Var.f28295m = 0;
                    a0Var.f28297o = 0;
                    a0Var.f28298p = 0;
                    a0Var.f28299q = 0;
                    a0Var.f28300r = 0;
                    a0Var.f28301s = 0;
                    a0Var.f28302t = 0;
                    a0Var.f28303u = 0;
                    a0Var.f28304v = 0;
                }
            }
        }
        this.f28322m = g.f28347a;
        this.f28323n = 0;
        this.f28324o = 0;
        this.f28325p = false;
    }

    public g.a g(g.a aVar) throws g.b {
        if (aVar.f28351c == 2) {
            int i10 = this.f28311b;
            if (i10 == -1) {
                i10 = aVar.f28349a;
            }
            this.f28314e = aVar;
            g.a aVar2 = new g.a(i10, aVar.f28350b, 2);
            this.f28315f = aVar2;
            this.f28318i = true;
            return aVar2;
        }
        throw new g.b(aVar);
    }
}
