package z4;

import a5.d;
import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import androidx.emoji2.text.f;
import c5.g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import m3.t;
import p5.i;
import p5.l;
import p5.n;
import p5.p;
import v6.e0;
import v6.r;
import v6.s;
import x4.b0;
import x4.m;
import x4.o0;
import x4.v0;
import x4.x0;
import z4.k;
import z4.l;

/* compiled from: MediaCodecAudioRenderer */
public class v extends l implements r {
    public final Context V0;
    public final k.a W0;
    public final l X0;
    public int Y0;
    public boolean Z0;

    /* renamed from: a1  reason: collision with root package name */
    public b0 f28476a1;

    /* renamed from: b1  reason: collision with root package name */
    public long f28477b1;

    /* renamed from: c1  reason: collision with root package name */
    public boolean f28478c1;

    /* renamed from: d1  reason: collision with root package name */
    public boolean f28479d1;

    /* renamed from: e1  reason: collision with root package name */
    public boolean f28480e1;

    /* renamed from: f1  reason: collision with root package name */
    public v0.a f28481f1;

    /* compiled from: MediaCodecAudioRenderer */
    public final class b implements l.c {
        public b(a aVar) {
        }
    }

    public v(Context context, n nVar, boolean z10, Handler handler, k kVar, l lVar) {
        super(1, i.a.f23876a, nVar, z10, 44100.0f);
        this.V0 = context.getApplicationContext();
        this.X0 = lVar;
        this.W0 = new k.a(handler, kVar);
        lVar.r(new b((a) null));
    }

    public void C() {
        this.f28480e1 = true;
        try {
            this.X0.flush();
            try {
                super.C();
            } finally {
                this.W0.a(this.Q0);
            }
        } catch (Throwable th) {
            super.C();
            throw th;
        } finally {
            this.W0.a(this.Q0);
        }
    }

    public void D(boolean z10, boolean z11) throws m {
        d dVar = new d();
        this.Q0 = dVar;
        k.a aVar = this.W0;
        Handler handler = aVar.f28365a;
        if (handler != null) {
            handler.post(new f0.i(aVar, dVar));
        }
        x0 x0Var = this.f27494c;
        x0Var.getClass();
        if (x0Var.f27763a) {
            this.X0.c();
        } else {
            this.X0.p();
        }
    }

    public final int D0(p5.k kVar, b0 b0Var) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(kVar.f23877a) || (i10 = e0.f26436a) >= 24 || (i10 == 23 && e0.J(this.V0))) {
            return b0Var.f27409u;
        }
        return -1;
    }

    public void E(long j10, boolean z10) throws m {
        super.E(j10, z10);
        this.X0.flush();
        this.f28477b1 = j10;
        this.f28478c1 = true;
        this.f28479d1 = true;
    }

    public final void E0() {
        long o10 = this.X0.o(d());
        if (o10 != Long.MIN_VALUE) {
            if (!this.f28479d1) {
                o10 = Math.max(this.f28477b1, o10);
            }
            this.f28477b1 = o10;
            this.f28479d1 = false;
        }
    }

    public void F() {
        try {
            O();
            o0();
            u0((g) null);
            if (this.f28480e1) {
                this.f28480e1 = false;
                this.X0.b();
            }
        } catch (Throwable th) {
            if (this.f28480e1) {
                this.f28480e1 = false;
                this.X0.b();
            }
            throw th;
        }
    }

    public void G() {
        this.X0.k0();
    }

    public void H() {
        E0();
        this.X0.g();
    }

    public a5.g L(p5.k kVar, b0 b0Var, b0 b0Var2) {
        int i10;
        a5.g c10 = kVar.c(b0Var, b0Var2);
        int i11 = c10.f96e;
        if (D0(kVar, b0Var2) > this.Y0) {
            i11 |= 64;
        }
        int i12 = i11;
        String str = kVar.f23877a;
        if (i12 != 0) {
            i10 = 0;
        } else {
            i10 = c10.f95d;
        }
        return new a5.g(str, b0Var, b0Var2, i10, i12);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void M(p5.k r9, p5.i r10, x4.b0 r11, android.media.MediaCrypto r12, float r13) {
        /*
            r8 = this;
            x4.b0[] r0 = r8.f27498g
            r0.getClass()
            int r1 = r8.D0(r9, r11)
            int r2 = r0.length
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L_0x000f
            goto L_0x0028
        L_0x000f:
            int r2 = r0.length
            r5 = 0
        L_0x0011:
            if (r5 >= r2) goto L_0x0028
            r6 = r0[r5]
            a5.g r7 = r9.c(r11, r6)
            int r7 = r7.f95d
            if (r7 == 0) goto L_0x0025
            int r6 = r8.D0(r9, r6)
            int r1 = java.lang.Math.max(r1, r6)
        L_0x0025:
            int r5 = r5 + 1
            goto L_0x0011
        L_0x0028:
            r8.Y0 = r1
            java.lang.String r0 = r9.f23877a
            int r1 = v6.e0.f26436a
            r2 = 24
            if (r1 >= r2) goto L_0x0060
            java.lang.String r5 = "OMX.SEC.aac.dec"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = v6.e0.f26438c
            java.lang.String r5 = "samsung"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = v6.e0.f26437b
            java.lang.String r5 = "zeroflte"
            boolean r5 = r0.startsWith(r5)
            if (r5 != 0) goto L_0x005e
            java.lang.String r5 = "herolte"
            boolean r5 = r0.startsWith(r5)
            if (r5 != 0) goto L_0x005e
            java.lang.String r5 = "heroqlte"
            boolean r0 = r0.startsWith(r5)
            if (r0 == 0) goto L_0x0060
        L_0x005e:
            r0 = 1
            goto L_0x0061
        L_0x0060:
            r0 = 0
        L_0x0061:
            r8.Z0 = r0
            java.lang.String r0 = r9.f23879c
            int r5 = r8.Y0
            android.media.MediaFormat r6 = new android.media.MediaFormat
            r6.<init>()
            java.lang.String r7 = "mime"
            r6.setString(r7, r0)
            int r0 = r11.G
            java.lang.String r7 = "channel-count"
            r6.setInteger(r7, r0)
            int r0 = r11.H
            java.lang.String r7 = "sample-rate"
            r6.setInteger(r7, r0)
            java.util.List<byte[]> r0 = r11.f27410v
            l0.e.k(r6, r0)
            java.lang.String r0 = "max-input-size"
            l0.e.i(r6, r0, r5)
            r0 = 23
            if (r1 < r0) goto L_0x00b6
            java.lang.String r5 = "priority"
            r6.setInteger(r5, r3)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x00b6
            if (r1 != r0) goto L_0x00ae
            java.lang.String r0 = v6.e0.f26439d
            java.lang.String r5 = "ZTE B2017G"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x00ac
            java.lang.String r5 = "AXON 7 mini"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00ae
        L_0x00ac:
            r0 = 1
            goto L_0x00af
        L_0x00ae:
            r0 = 0
        L_0x00af:
            if (r0 != 0) goto L_0x00b6
            java.lang.String r0 = "operating-rate"
            r6.setFloat(r0, r13)
        L_0x00b6:
            r13 = 28
            if (r1 > r13) goto L_0x00c9
            java.lang.String r13 = r11.f27408t
            java.lang.String r0 = "audio/ac4"
            boolean r13 = r0.equals(r13)
            if (r13 == 0) goto L_0x00c9
            java.lang.String r13 = "ac4-is-sync"
            r6.setInteger(r13, r4)
        L_0x00c9:
            java.lang.String r13 = "audio/raw"
            if (r1 < r2) goto L_0x00f1
            z4.l r0 = r8.X0
            int r1 = r11.G
            int r2 = r11.H
            x4.b0$b r5 = new x4.b0$b
            r5.<init>()
            r5.f27425k = r13
            r5.f27438x = r1
            r5.f27439y = r2
            r1 = 4
            r5.f27440z = r1
            x4.b0 r2 = r5.a()
            int r0 = r0.q(r2)
            r2 = 2
            if (r0 != r2) goto L_0x00f1
            java.lang.String r0 = "pcm-encoding"
            r6.setInteger(r0, r1)
        L_0x00f1:
            r0 = 0
            r10.c(r6, r0, r12, r3)
            java.lang.String r9 = r9.f23878b
            boolean r9 = r13.equals(r9)
            if (r9 == 0) goto L_0x0106
            java.lang.String r9 = r11.f27408t
            boolean r9 = r13.equals(r9)
            if (r9 != 0) goto L_0x0106
            r3 = 1
        L_0x0106:
            if (r3 == 0) goto L_0x0109
            goto L_0x010a
        L_0x0109:
            r11 = r0
        L_0x010a:
            r8.f28476a1 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.v.M(p5.k, p5.i, x4.b0, android.media.MediaCrypto, float):void");
    }

    public float X(float f10, b0 b0Var, b0[] b0VarArr) {
        int i10 = -1;
        for (b0 b0Var2 : b0VarArr) {
            int i11 = b0Var2.H;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return f10 * ((float) i10);
    }

    public List<p5.k> Y(n nVar, b0 b0Var, boolean z10) throws p.c {
        p5.k d10;
        String str = b0Var.f27408t;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.X0.h(b0Var) && (d10 = p.d("audio/raw", false, false)) != null) {
            return Collections.singletonList(d10);
        }
        List<p5.k> a10 = nVar.a(str, z10, false);
        Pattern pattern = p.f23924a;
        ArrayList arrayList = new ArrayList(a10);
        p.j(arrayList, new r0.b(b0Var));
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList2.addAll(nVar.a("audio/eac3", z10, false));
            arrayList = arrayList2;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public String a() {
        return "MediaCodecAudioRenderer";
    }

    public boolean d() {
        return this.J0 && this.X0.d();
    }

    public void e0(String str, long j10, long j11) {
        k.a aVar = this.W0;
        Handler handler = aVar.f28365a;
        if (handler != null) {
            handler.post(new i(aVar, str, j10, j11));
        }
    }

    public o0 f() {
        return this.X0.f();
    }

    public void f0(String str) {
        k.a aVar = this.W0;
        Handler handler = aVar.f28365a;
        if (handler != null) {
            handler.post(new f0.i(aVar, str));
        }
    }

    public a5.g g0(t tVar) throws m {
        a5.g g02 = super.g0(tVar);
        k.a aVar = this.W0;
        b0 b0Var = (b0) tVar.f21666b;
        Handler handler = aVar.f28365a;
        if (handler != null) {
            handler.post(new f(aVar, b0Var, g02));
        }
        return g02;
    }

    public void h0(b0 b0Var, MediaFormat mediaFormat) throws m {
        int i10;
        int i11;
        b0 b0Var2 = this.f28476a1;
        int[] iArr = null;
        if (b0Var2 != null) {
            b0Var = b0Var2;
        } else if (this.Q != null) {
            if ("audio/raw".equals(b0Var.f27408t)) {
                i10 = b0Var.I;
            } else if (e0.f26436a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i10 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i10 = e0.x(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i10 = "audio/raw".equals(b0Var.f27408t) ? b0Var.I : 2;
            }
            b0.b bVar = new b0.b();
            bVar.f27425k = "audio/raw";
            bVar.f27440z = i10;
            bVar.A = b0Var.J;
            bVar.B = b0Var.K;
            bVar.f27438x = mediaFormat.getInteger("channel-count");
            bVar.f27439y = mediaFormat.getInteger("sample-rate");
            b0 a10 = bVar.a();
            if (this.Z0 && a10.G == 6 && (i11 = b0Var.G) < 6) {
                iArr = new int[i11];
                for (int i12 = 0; i12 < b0Var.G; i12++) {
                    iArr[i12] = i12;
                }
            }
            b0Var = a10;
        }
        try {
            this.X0.k(b0Var, 0, iArr);
        } catch (l.a e10) {
            throw A(e10, e10.f28367a, false);
        }
    }

    public void i(o0 o0Var) {
        this.X0.i(o0Var);
    }

    public boolean isReady() {
        return this.X0.j() || super.isReady();
    }

    public void j0() {
        this.X0.t();
    }

    public void k0(a5.f fVar) {
        if (this.f28478c1 && !fVar.q()) {
            if (Math.abs(fVar.f88e - this.f28477b1) > 500000) {
                this.f28477b1 = fVar.f88e;
            }
            this.f28478c1 = false;
        }
    }

    public boolean m0(long j10, long j11, i iVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, b0 b0Var) throws m {
        byteBuffer.getClass();
        if (this.f28476a1 != null && (i11 & 2) != 0) {
            iVar.getClass();
            iVar.d(i10, false);
            return true;
        } else if (z10) {
            if (iVar != null) {
                iVar.d(i10, false);
            }
            this.Q0.f79f += i12;
            this.X0.t();
            return true;
        } else {
            try {
                if (!this.X0.n(byteBuffer, j12, i12)) {
                    return false;
                }
                if (iVar != null) {
                    iVar.d(i10, false);
                }
                this.Q0.f78e += i12;
                return true;
            } catch (l.b e10) {
                throw A(e10, e10.f28369b, e10.f28368a);
            } catch (l.d e11) {
                throw A(e11, b0Var, e11.f28370a);
            }
        }
    }

    public void n(int i10, Object obj) throws m {
        if (i10 == 2) {
            this.X0.u(((Float) obj).floatValue());
        } else if (i10 == 3) {
            this.X0.l((d) obj);
        } else if (i10 != 5) {
            switch (i10) {
                case 101:
                    this.X0.s(((Boolean) obj).booleanValue());
                    return;
                case 102:
                    this.X0.m(((Integer) obj).intValue());
                    return;
                case 103:
                    this.f28481f1 = (v0.a) obj;
                    return;
                default:
                    return;
            }
        } else {
            this.X0.a((o) obj);
        }
    }

    public void p0() throws m {
        try {
            this.X0.e();
        } catch (l.d e10) {
            throw A(e10, e10.f28371b, e10.f28370a);
        }
    }

    public r v() {
        return this;
    }

    public long x() {
        if (this.f27496e == 2) {
            E0();
        }
        return this.f28477b1;
    }

    public boolean x0(b0 b0Var) {
        return this.X0.h(b0Var);
    }

    public int y0(n nVar, b0 b0Var) throws p.c {
        if (!s.k(b0Var.f27408t)) {
            return 0;
        }
        int i10 = e0.f26436a >= 21 ? 32 : 0;
        boolean z10 = b0Var.M != null;
        boolean z02 = p5.l.z0(b0Var);
        if (z02 && this.X0.h(b0Var) && (!z10 || p.d("audio/raw", false, false) != null)) {
            return i10 | 12;
        }
        if ("audio/raw".equals(b0Var.f27408t) && !this.X0.h(b0Var)) {
            return 1;
        }
        l lVar = this.X0;
        int i11 = b0Var.G;
        int i12 = b0Var.H;
        b0.b bVar = new b0.b();
        bVar.f27425k = "audio/raw";
        bVar.f27438x = i11;
        bVar.f27439y = i12;
        bVar.f27440z = 2;
        if (!lVar.h(bVar.a())) {
            return 1;
        }
        List<p5.k> Y = Y(nVar, b0Var, false);
        if (Y.isEmpty()) {
            return 1;
        }
        if (!z02) {
            return 2;
        }
        p5.k kVar = Y.get(0);
        boolean e10 = kVar.e(b0Var);
        return ((!e10 || !kVar.f(b0Var)) ? 8 : 16) | (e10 ? 4 : 3) | i10;
    }
}
