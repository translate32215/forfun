package e8;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import androidx.appcompat.widget.o;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.f7;
import com.google.android.gms.internal.ads.k7;
import com.google.android.gms.internal.ads.n7;
import com.google.android.gms.internal.ads.q7;
import d7.l;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import l0.e;
import r7.m;
import x4.c0;

@TargetApi(16)
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class oa extends aa implements TextureView.SurfaceTextureListener, ua {
    public float A;

    /* renamed from: c  reason: collision with root package name */
    public final ia f15749c;

    /* renamed from: d  reason: collision with root package name */
    public final ka f15750d;

    /* renamed from: e  reason: collision with root package name */
    public final ja f15751e;

    /* renamed from: f  reason: collision with root package name */
    public f7 f15752f;

    /* renamed from: g  reason: collision with root package name */
    public Surface f15753g;

    /* renamed from: h  reason: collision with root package name */
    public n7 f15754h;

    /* renamed from: i  reason: collision with root package name */
    public String f15755i;

    /* renamed from: r  reason: collision with root package name */
    public String[] f15756r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f15757s;

    /* renamed from: t  reason: collision with root package name */
    public int f15758t = 1;

    /* renamed from: u  reason: collision with root package name */
    public ga f15759u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f15760v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f15761w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f15762x;

    /* renamed from: y  reason: collision with root package name */
    public int f15763y;

    /* renamed from: z  reason: collision with root package name */
    public int f15764z;

    public oa(Context context, ka kaVar, ia iaVar, boolean z10, boolean z11, ja jaVar) {
        super(context);
        this.f15749c = iaVar;
        this.f15750d = kaVar;
        this.f15760v = z10;
        this.f15751e = jaVar;
        setSurfaceTextureListener(this);
        kaVar.c(this);
    }

    public final void A() {
        String str;
        if (this.f15754h == null && (str = this.f15755i) != null && this.f15753g != null) {
            if (str.startsWith("cache:")) {
                q7 C = this.f15749c.C(this.f15755i);
                if (C instanceof nb) {
                    nb nbVar = (nb) C;
                    synchronized (nbVar) {
                        nbVar.f15605h = true;
                        nbVar.notify();
                    }
                    n7 n7Var = nbVar.f15601d;
                    n7Var.f7542s = null;
                    nbVar.f15601d = null;
                    this.f15754h = n7Var;
                    if (n7Var.f7538g == null) {
                        e.K("Precached video player has been released.");
                        return;
                    }
                } else if (C instanceof ob) {
                    ob obVar = (ob) C;
                    String x10 = x();
                    synchronized (obVar.f15774s) {
                        ByteBuffer byteBuffer = obVar.f15772i;
                        if (byteBuffer != null && !obVar.f15773r) {
                            byteBuffer.flip();
                            obVar.f15773r = true;
                        }
                        obVar.f15769f = true;
                    }
                    ByteBuffer byteBuffer2 = obVar.f15772i;
                    boolean z10 = obVar.f15777v;
                    String str2 = obVar.f15767d;
                    if (str2 == null) {
                        e.K("Stream cache URL is null.");
                        return;
                    }
                    n7 n7Var2 = new n7(this.f15749c.getContext(), this.f15751e, this.f15749c);
                    this.f15754h = n7Var2;
                    n7Var2.m(new Uri[]{Uri.parse(str2)}, x10, byteBuffer2, z10);
                } else {
                    String valueOf = String.valueOf(this.f15755i);
                    e.K(valueOf.length() != 0 ? "Stream cache miss: ".concat(valueOf) : new String("Stream cache miss: "));
                    return;
                }
            } else {
                this.f15754h = new n7(this.f15749c.getContext(), this.f15751e, this.f15749c);
                String x11 = x();
                Uri[] uriArr = new Uri[this.f15756r.length];
                int i10 = 0;
                while (true) {
                    String[] strArr = this.f15756r;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    uriArr[i10] = Uri.parse(strArr[i10]);
                    i10++;
                }
                n7 n7Var3 = this.f15754h;
                n7Var3.getClass();
                n7Var3.m(uriArr, x11, ByteBuffer.allocate(0), false);
            }
            this.f15754h.f7542s = this;
            w(this.f15753g, false);
            vb0 vb0 = this.f15754h.f7538g;
            if (vb0 != null) {
                int i11 = vb0.f17051k;
                this.f15758t = i11;
                if (i11 == 3) {
                    B();
                }
            }
        }
    }

    public final void B() {
        if (!this.f15761w) {
            this.f15761w = true;
            p.f5702i.post(new na(this, 0));
            a();
            this.f15750d.e();
            if (this.f15762x) {
                g();
            }
        }
    }

    public final void C() {
        n7 n7Var = this.f15754h;
        if (n7Var != null) {
            n7Var.o(false);
        }
    }

    public final void D(int i10, int i11) {
        float f10 = i11 > 0 ? ((float) i10) / ((float) i11) : 1.0f;
        if (this.A != f10) {
            this.A = f10;
            requestLayout();
        }
    }

    public final void a() {
        ma maVar = this.f13669b;
        float f10 = 0.0f;
        float f11 = maVar.f15479e ? 0.0f : maVar.f15480f;
        if (maVar.f15477c) {
            f10 = f11;
        }
        v(f10, false);
    }

    public final void b(int i10) {
        if (this.f15758t != i10) {
            this.f15758t = i10;
            if (i10 == 3) {
                B();
            } else if (i10 == 4) {
                if (this.f15751e.f15108a) {
                    C();
                }
                this.f15750d.f15261m = false;
                this.f13669b.a();
                p.f5702i.post(new pa(this, 0));
            }
        }
    }

    public final void c(int i10, int i11) {
        this.f15763y = i10;
        this.f15764z = i11;
        D(i10, i11);
    }

    public final void d(boolean z10, long j10) {
        if (this.f15749c != null) {
            o50 o50 = h9.f14885e;
            ((k9) o50).f15244a.execute(new qa(this, z10, j10));
        }
    }

    public final void e() {
        if (z()) {
            if (this.f15751e.f15108a) {
                C();
            }
            this.f15754h.f7538g.g(false);
            this.f15750d.f15261m = false;
            this.f13669b.a();
            p.f5702i.post(new na(this, 1));
        }
    }

    public final void f(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder a10 = j4.e.a(o.a(message, o.a(canonicalName, str.length() + 2)), str, "/", canonicalName, ":");
        a10.append(message);
        String sb2 = a10.toString();
        String valueOf = String.valueOf(sb2);
        e.K(valueOf.length() != 0 ? "ExoPlayerAdapter error: ".concat(valueOf) : new String("ExoPlayerAdapter error: "));
        this.f15757s = true;
        if (this.f15751e.f15108a) {
            C();
        }
        p.f5702i.post(new m(this, sb2));
    }

    public final void g() {
        n7 n7Var;
        if (z()) {
            if (this.f15751e.f15108a && (n7Var = this.f15754h) != null) {
                n7Var.o(true);
            }
            this.f15754h.f7538g.g(true);
            this.f15750d.b();
            ma maVar = this.f13669b;
            maVar.f15478d = true;
            maVar.b();
            this.f13668a.f14384c = true;
            p.f5702i.post(new pa(this, 1));
            return;
        }
        this.f15762x = true;
    }

    public final int getCurrentPosition() {
        if (z()) {
            return (int) this.f15754h.f7538g.e();
        }
        return 0;
    }

    public final int getDuration() {
        if (z()) {
            return (int) this.f15754h.f7538g.b();
        }
        return 0;
    }

    public final long getTotalBytes() {
        n7 n7Var = this.f15754h;
        if (n7Var != null) {
            return n7Var.k();
        }
        return -1;
    }

    public final int getVideoHeight() {
        return this.f15764z;
    }

    public final int getVideoWidth() {
        return this.f15763y;
    }

    public final void h(int i10) {
        if (z()) {
            vb0 vb0 = this.f15754h.f7538g;
            long j10 = (long) i10;
            int f10 = vb0.f();
            if (f10 < 0 || (!vb0.f17055o.a() && f10 >= vb0.f17055o.g())) {
                throw new c0(vb0.f17055o, f10, j10);
            }
            vb0.f17052l++;
            vb0.f17061u = f10;
            if (!vb0.f17055o.a()) {
                vb0.f17055o.c(f10, vb0.f17047g);
                if (j10 != -9223372036854775807L) {
                    sb0.b(j10);
                }
                long j11 = vb0.f17055o.e(0, vb0.f17048h, false).f15017c;
            }
            if (j10 == -9223372036854775807L) {
                vb0.f17062v = 0;
                vb0.f17045e.f8282f.obtainMessage(3, new zb0(vb0.f17055o, f10, -9223372036854775807L)).sendToTarget();
                return;
            }
            vb0.f17062v = j10;
            vb0.f17045e.f8282f.obtainMessage(3, new zb0(vb0.f17055o, f10, sb0.b(j10))).sendToTarget();
            Iterator<tb0> it = vb0.f17046f.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
        }
    }

    public final void i() {
        if (y()) {
            this.f15754h.f7538g.f17045e.f8282f.sendEmptyMessage(5);
            if (this.f15754h != null) {
                w((Surface) null, true);
                n7 n7Var = this.f15754h;
                if (n7Var != null) {
                    n7Var.f7542s = null;
                    n7Var.l();
                    this.f15754h = null;
                }
                this.f15758t = 1;
                this.f15757s = false;
                this.f15761w = false;
                this.f15762x = false;
            }
        }
        this.f15750d.f15261m = false;
        this.f13669b.a();
        this.f15750d.a();
    }

    public final void j(float f10, float f11) {
        ga gaVar = this.f15759u;
        if (gaVar != null) {
            gaVar.e(f10, f11);
        }
    }

    public final void k(f7 f7Var) {
        this.f15752f = f7Var;
    }

    public final String l() {
        String str = this.f15760v ? " spherical" : "";
        return str.length() != 0 ? "ExoPlayer/3".concat(str) : new String("ExoPlayer/3");
    }

    public final long m() {
        n7 n7Var = this.f15754h;
        if (n7Var == null) {
            return -1;
        }
        if (!n7Var.n()) {
            return (long) n7Var.f7543t;
        }
        return 0;
    }

    public final int n() {
        n7 n7Var = this.f15754h;
        if (n7Var != null) {
            return n7Var.f7544u;
        }
        return -1;
    }

    public final void o(String str, String[] strArr) {
        if (str != null) {
            if (strArr == null) {
                setVideoPath(str);
            }
            this.f15755i = str;
            this.f15756r = (String[]) Arrays.copyOf(strArr, strArr.length);
            A();
        }
    }

    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = this.A;
        if (f10 != 0.0f && this.f15759u == null) {
            float f11 = (float) measuredWidth;
            float f12 = f11 / ((float) measuredHeight);
            if (f10 > f12) {
                measuredHeight = (int) (f11 / f10);
            }
            if (f10 < f12) {
                measuredWidth = (int) (((float) measuredHeight) * f10);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        ga gaVar = this.f15759u;
        if (gaVar != null) {
            gaVar.i(measuredWidth, measuredHeight);
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12;
        n7 n7Var;
        SurfaceTexture surfaceTexture2;
        if (this.f15760v) {
            ga gaVar = new ga(getContext());
            this.f15759u = gaVar;
            gaVar.f14751u = i10;
            gaVar.f14750t = i11;
            gaVar.f14753w = surfaceTexture;
            gaVar.start();
            ga gaVar2 = this.f15759u;
            if (gaVar2.f14753w == null) {
                surfaceTexture2 = null;
            } else {
                try {
                    gaVar2.B.await();
                } catch (InterruptedException unused) {
                }
                surfaceTexture2 = gaVar2.f14752v;
            }
            if (surfaceTexture2 != null) {
                surfaceTexture = surfaceTexture2;
            } else {
                this.f15759u.c();
                this.f15759u = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f15753g = surface;
        if (this.f15754h == null) {
            A();
        } else {
            w(surface, true);
            if (!this.f15751e.f15108a && (n7Var = this.f15754h) != null) {
                n7Var.o(true);
            }
        }
        int i13 = this.f15763y;
        if (i13 == 0 || (i12 = this.f15764z) == 0) {
            D(i10, i11);
        } else {
            D(i13, i12);
        }
        p.f5702i.post(new na(this, 2));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        e();
        ga gaVar = this.f15759u;
        if (gaVar != null) {
            gaVar.c();
            this.f15759u = null;
        }
        if (this.f15754h != null) {
            C();
            Surface surface = this.f15753g;
            if (surface != null) {
                surface.release();
            }
            this.f15753g = null;
            w((Surface) null, true);
        }
        p.f5702i.post(new pa(this, 2));
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        ga gaVar = this.f15759u;
        if (gaVar != null) {
            gaVar.i(i10, i11);
        }
        p.f5702i.post(new w9(this, i10, i11));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f15750d.d(this);
        this.f13668a.a(surfaceTexture, this.f15752f);
    }

    public final void onWindowVisibilityChanged(int i10) {
        StringBuilder sb2 = new StringBuilder(57);
        sb2.append("AdExoPlayerView3 window visibility changed to ");
        sb2.append(i10);
        e.H(sb2.toString());
        p.f5702i.post(new u7.m(this, i10));
        super.onWindowVisibilityChanged(i10);
    }

    public final void p(int i10) {
        n7 n7Var = this.f15754h;
        if (n7Var != null) {
            ra raVar = n7Var.f7533b;
            synchronized (raVar) {
                raVar.f16254b = ((long) i10) * 1000;
            }
        }
    }

    public final void q(int i10) {
        n7 n7Var = this.f15754h;
        if (n7Var != null) {
            ra raVar = n7Var.f7533b;
            synchronized (raVar) {
                raVar.f16255c = ((long) i10) * 1000;
            }
        }
    }

    public final void r(int i10) {
        n7 n7Var = this.f15754h;
        if (n7Var != null) {
            ra raVar = n7Var.f7533b;
            synchronized (raVar) {
                raVar.f16256d = ((long) i10) * 1000;
            }
        }
    }

    public final void s(int i10) {
        n7 n7Var = this.f15754h;
        if (n7Var != null) {
            ra raVar = n7Var.f7533b;
            synchronized (raVar) {
                raVar.f16257e = ((long) i10) * 1000;
            }
        }
    }

    public final void setVideoPath(String str) {
        if (str != null) {
            this.f15755i = str;
            this.f15756r = new String[]{str};
            A();
        }
    }

    public final void t(int i10) {
        n7 n7Var = this.f15754h;
        if (n7Var != null) {
            for (WeakReference<k7> weakReference : n7Var.A) {
                k7 k7Var = (k7) weakReference.get();
                if (k7Var != null) {
                    k7Var.f7208o = i10;
                    for (Socket next : k7Var.f7209p) {
                        if (!next.isClosed()) {
                            try {
                                next.setReceiveBufferSize(k7Var.f7208o);
                            } catch (SocketException e10) {
                                e.D("Failed to update receive buffer size.", e10);
                            }
                        }
                    }
                }
            }
        }
    }

    public final long u() {
        n7 n7Var = this.f15754h;
        if (n7Var != null) {
            return n7Var.q();
        }
        return -1;
    }

    public final void v(float f10, boolean z10) {
        n7 n7Var = this.f15754h;
        if (n7Var == null) {
            e.K("Trying to set volume before player is initalized.");
        } else if (n7Var.f7538g != null) {
            ub0 ub0 = new ub0(n7Var.f7535d, 2, Float.valueOf(f10));
            if (z10) {
                n7Var.f7538g.d(ub0);
                return;
            }
            n7Var.f7538g.c(ub0);
        }
    }

    public final void w(Surface surface, boolean z10) {
        n7 n7Var = this.f15754h;
        if (n7Var != null) {
            vb0 vb0 = n7Var.f7538g;
            if (vb0 != null) {
                ub0 ub0 = new ub0(n7Var.f7534c, 1, surface);
                if (z10) {
                    vb0.d(ub0);
                    return;
                }
                vb0.c(ub0);
                return;
            }
            return;
        }
        e.K("Trying to set surface before player is initalized.");
    }

    public final String x() {
        return l.B.f13186c.H(this.f15749c.getContext(), this.f15749c.c().f14544a);
    }

    public final boolean y() {
        n7 n7Var = this.f15754h;
        return (n7Var == null || n7Var.f7538g == null || this.f15757s) ? false : true;
    }

    public final boolean z() {
        return y() && this.f15758t != 1;
    }
}
