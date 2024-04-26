package x4;

import a5.g;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import h6.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import r6.l;
import r6.n;
import v6.e0;
import v6.o;
import w6.j;
import w6.m;
import w6.p;
import w6.s;
import x4.b;
import x4.b1;
import x4.c;
import x4.r0;
import y4.t;
import y4.v;
import y4.x;
import z4.d;
import z4.f;
import z5.g0;
import z5.w;

/* compiled from: SimpleExoPlayer */
public class a1 extends d implements r0.d, r0.c {
    public float A;
    public boolean B = false;
    public List<h6.b> C;
    public m D;
    public x6.a E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public b5.a J;

    /* renamed from: b  reason: collision with root package name */
    public final v0[] f27348b;

    /* renamed from: c  reason: collision with root package name */
    public final w f27349c;

    /* renamed from: d  reason: collision with root package name */
    public final c f27350d;

    /* renamed from: e  reason: collision with root package name */
    public final CopyOnWriteArraySet<p> f27351e;

    /* renamed from: f  reason: collision with root package name */
    public final CopyOnWriteArraySet<f> f27352f;

    /* renamed from: g  reason: collision with root package name */
    public final CopyOnWriteArraySet<k> f27353g;

    /* renamed from: h  reason: collision with root package name */
    public final CopyOnWriteArraySet<q5.f> f27354h;

    /* renamed from: i  reason: collision with root package name */
    public final CopyOnWriteArraySet<b5.b> f27355i;

    /* renamed from: j  reason: collision with root package name */
    public final v f27356j;

    /* renamed from: k  reason: collision with root package name */
    public final b f27357k;

    /* renamed from: l  reason: collision with root package name */
    public final c f27358l;

    /* renamed from: m  reason: collision with root package name */
    public final b1 f27359m;

    /* renamed from: n  reason: collision with root package name */
    public final d1 f27360n;

    /* renamed from: o  reason: collision with root package name */
    public final e1 f27361o;

    /* renamed from: p  reason: collision with root package name */
    public final long f27362p;

    /* renamed from: q  reason: collision with root package name */
    public AudioTrack f27363q;

    /* renamed from: r  reason: collision with root package name */
    public Surface f27364r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f27365s;

    /* renamed from: t  reason: collision with root package name */
    public int f27366t;

    /* renamed from: u  reason: collision with root package name */
    public SurfaceHolder f27367u;

    /* renamed from: v  reason: collision with root package name */
    public TextureView f27368v;

    /* renamed from: w  reason: collision with root package name */
    public int f27369w;

    /* renamed from: x  reason: collision with root package name */
    public int f27370x;

    /* renamed from: y  reason: collision with root package name */
    public int f27371y;

    /* renamed from: z  reason: collision with root package name */
    public d f27372z;

    /* compiled from: SimpleExoPlayer */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f27373a;

        /* renamed from: b  reason: collision with root package name */
        public final y0 f27374b;

        /* renamed from: c  reason: collision with root package name */
        public v6.b f27375c;

        /* renamed from: d  reason: collision with root package name */
        public n f27376d;

        /* renamed from: e  reason: collision with root package name */
        public w f27377e;

        /* renamed from: f  reason: collision with root package name */
        public j f27378f;

        /* renamed from: g  reason: collision with root package name */
        public u6.b f27379g;

        /* renamed from: h  reason: collision with root package name */
        public v f27380h;

        /* renamed from: i  reason: collision with root package name */
        public Looper f27381i;

        /* renamed from: j  reason: collision with root package name */
        public d f27382j;

        /* renamed from: k  reason: collision with root package name */
        public int f27383k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f27384l;

        /* renamed from: m  reason: collision with root package name */
        public z0 f27385m;

        /* renamed from: n  reason: collision with root package name */
        public d0 f27386n;

        /* renamed from: o  reason: collision with root package name */
        public long f27387o;

        /* renamed from: p  reason: collision with root package name */
        public long f27388p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f27389q;

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0069  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0074  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(android.content.Context r21, x4.y0 r22) {
            /*
                r20 = this;
                r1 = r20
                r0 = r21
                d5.g r2 = new d5.g
                r2.<init>()
                r6.f r3 = new r6.f
                r6.a$b r4 = new r6.a$b
                r4.<init>()
                r3.<init>(r0, r4)
                z5.g r4 = new z5.g
                r4.<init>(r0, r2)
                x4.j r2 = new x4.j
                r2.<init>()
                ba.t<java.lang.String, java.lang.Integer> r5 = u6.g.f26067n
                java.lang.Class<u6.g> r5 = u6.g.class
                monitor-enter(r5)
                u6.g r6 = u6.g.f26073t     // Catch:{ all -> 0x01b0 }
                r7 = 0
                r8 = 1
                if (r6 != 0) goto L_0x0153
                android.content.Context r10 = r21.getApplicationContext()     // Catch:{ all -> 0x01b0 }
                int r6 = v6.e0.f26436a     // Catch:{ all -> 0x01b0 }
                java.lang.String r6 = "phone"
                java.lang.Object r6 = r0.getSystemService(r6)     // Catch:{ all -> 0x01b0 }
                android.telephony.TelephonyManager r6 = (android.telephony.TelephonyManager) r6     // Catch:{ all -> 0x01b0 }
                if (r6 == 0) goto L_0x004c
                java.lang.String r6 = r6.getNetworkCountryIso()     // Catch:{ all -> 0x01b0 }
                boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x01b0 }
                if (r9 != 0) goto L_0x004c
                if (r6 != 0) goto L_0x0045
                goto L_0x005d
            L_0x0045:
                java.util.Locale r9 = java.util.Locale.US     // Catch:{ all -> 0x01b0 }
                java.lang.String r6 = r6.toUpperCase(r9)     // Catch:{ all -> 0x01b0 }
                goto L_0x005d
            L_0x004c:
                java.util.Locale r6 = java.util.Locale.getDefault()     // Catch:{ all -> 0x01b0 }
                java.lang.String r6 = r6.getCountry()     // Catch:{ all -> 0x01b0 }
                if (r6 != 0) goto L_0x0057
                goto L_0x005d
            L_0x0057:
                java.util.Locale r9 = java.util.Locale.US     // Catch:{ all -> 0x01b0 }
                java.lang.String r6 = r6.toUpperCase(r9)     // Catch:{ all -> 0x01b0 }
            L_0x005d:
                ba.t<java.lang.String, java.lang.Integer> r9 = u6.g.f26067n     // Catch:{ all -> 0x01b0 }
                ba.u<K, ? extends ba.q<V>> r9 = r9.f3812d     // Catch:{ all -> 0x01b0 }
                java.lang.Object r6 = r9.get(r6)     // Catch:{ all -> 0x01b0 }
                ba.s r6 = (ba.s) r6     // Catch:{ all -> 0x01b0 }
                if (r6 != 0) goto L_0x006d
                ba.a<java.lang.Object> r6 = ba.s.f3795b     // Catch:{ all -> 0x01b0 }
                ba.s<java.lang.Object> r6 = ba.o0.f3765e     // Catch:{ all -> 0x01b0 }
            L_0x006d:
                boolean r9 = r6.isEmpty()     // Catch:{ all -> 0x01b0 }
                r11 = 2
                if (r9 == 0) goto L_0x008c
                java.lang.Integer r6 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x01b0 }
                java.lang.Integer r9 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x01b0 }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x01b0 }
                java.lang.Integer r13 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x01b0 }
                java.lang.Integer r14 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x01b0 }
                ba.s r6 = ba.s.D(r6, r9, r12, r13, r14)     // Catch:{ all -> 0x01b0 }
            L_0x008c:
                java.util.HashMap r12 = new java.util.HashMap     // Catch:{ all -> 0x01b0 }
                r9 = 6
                r12.<init>(r9)     // Catch:{ all -> 0x01b0 }
                java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x01b0 }
                r13 = 1000000(0xf4240, double:4.940656E-318)
                java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x01b0 }
                r12.put(r9, r13)     // Catch:{ all -> 0x01b0 }
                java.lang.Integer r9 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x01b0 }
                ba.s<java.lang.Long> r13 = u6.g.f26068o     // Catch:{ all -> 0x01b0 }
                java.lang.Object r14 = r6.get(r7)     // Catch:{ all -> 0x01b0 }
                java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x01b0 }
                int r14 = r14.intValue()     // Catch:{ all -> 0x01b0 }
                ba.o0 r13 = (ba.o0) r13     // Catch:{ all -> 0x01b0 }
                java.lang.Object r14 = r13.get(r14)     // Catch:{ all -> 0x01b0 }
                java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ all -> 0x01b0 }
                r12.put(r9, r14)     // Catch:{ all -> 0x01b0 }
                r9 = 3
                java.lang.Integer r14 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01b0 }
                ba.s<java.lang.Long> r15 = u6.g.f26069p     // Catch:{ all -> 0x01b0 }
                java.lang.Object r16 = r6.get(r8)     // Catch:{ all -> 0x01b0 }
                java.lang.Integer r16 = (java.lang.Integer) r16     // Catch:{ all -> 0x01b0 }
                int r8 = r16.intValue()     // Catch:{ all -> 0x01b0 }
                ba.o0 r15 = (ba.o0) r15     // Catch:{ all -> 0x01b0 }
                java.lang.Object r8 = r15.get(r8)     // Catch:{ all -> 0x01b0 }
                java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ all -> 0x01b0 }
                r12.put(r14, r8)     // Catch:{ all -> 0x01b0 }
                r8 = 4
                java.lang.Integer r14 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x01b0 }
                ba.s<java.lang.Long> r15 = u6.g.f26070q     // Catch:{ all -> 0x01b0 }
                java.lang.Object r11 = r6.get(r11)     // Catch:{ all -> 0x01b0 }
                java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ all -> 0x01b0 }
                int r11 = r11.intValue()     // Catch:{ all -> 0x01b0 }
                ba.o0 r15 = (ba.o0) r15     // Catch:{ all -> 0x01b0 }
                java.lang.Object r11 = r15.get(r11)     // Catch:{ all -> 0x01b0 }
                java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x01b0 }
                r12.put(r14, r11)     // Catch:{ all -> 0x01b0 }
                r11 = 5
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x01b0 }
                ba.s<java.lang.Long> r14 = u6.g.f26071r     // Catch:{ all -> 0x01b0 }
                java.lang.Object r9 = r6.get(r9)     // Catch:{ all -> 0x01b0 }
                java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x01b0 }
                int r9 = r9.intValue()     // Catch:{ all -> 0x01b0 }
                ba.o0 r14 = (ba.o0) r14     // Catch:{ all -> 0x01b0 }
                java.lang.Object r9 = r14.get(r9)     // Catch:{ all -> 0x01b0 }
                java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x01b0 }
                r12.put(r11, r9)     // Catch:{ all -> 0x01b0 }
                r9 = 9
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01b0 }
                ba.s<java.lang.Long> r11 = u6.g.f26072s     // Catch:{ all -> 0x01b0 }
                java.lang.Object r8 = r6.get(r8)     // Catch:{ all -> 0x01b0 }
                java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x01b0 }
                int r8 = r8.intValue()     // Catch:{ all -> 0x01b0 }
                ba.o0 r11 = (ba.o0) r11     // Catch:{ all -> 0x01b0 }
                java.lang.Object r8 = r11.get(r8)     // Catch:{ all -> 0x01b0 }
                java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ all -> 0x01b0 }
                r12.put(r9, r8)     // Catch:{ all -> 0x01b0 }
                r8 = 7
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x01b0 }
                java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x01b0 }
                java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x01b0 }
                int r6 = r6.intValue()     // Catch:{ all -> 0x01b0 }
                java.lang.Object r6 = r13.get(r6)     // Catch:{ all -> 0x01b0 }
                java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x01b0 }
                r12.put(r8, r6)     // Catch:{ all -> 0x01b0 }
                r6 = 2000(0x7d0, float:2.803E-42)
                v6.b r13 = v6.b.f26424a     // Catch:{ all -> 0x01b0 }
                u6.g r7 = new u6.g     // Catch:{ all -> 0x01b0 }
                r14 = 1
                r9 = r7
                r11 = r12
                r12 = r6
                r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x01b0 }
                u6.g.f26073t = r7     // Catch:{ all -> 0x01b0 }
            L_0x0153:
                u6.g r6 = u6.g.f26073t     // Catch:{ all -> 0x01b0 }
                monitor-exit(r5)
                y4.v r5 = new y4.v
                v6.b r7 = v6.b.f26424a
                r5.<init>(r7)
                r20.<init>()
                r1.f27373a = r0
                r0 = r22
                r1.f27374b = r0
                r1.f27376d = r3
                r1.f27377e = r4
                r1.f27378f = r2
                r1.f27379g = r6
                r1.f27380h = r5
                android.os.Looper r0 = v6.e0.t()
                r1.f27381i = r0
                z4.d r0 = z4.d.f28337f
                r1.f27382j = r0
                r0 = 1
                r1.f27383k = r0
                r1.f27384l = r0
                x4.z0 r0 = x4.z0.f27810c
                r1.f27385m = r0
                r2 = 20
                long r14 = x4.f.b(r2)
                r2 = 500(0x1f4, double:2.47E-321)
                long r16 = x4.f.b(r2)
                r18 = 1065336439(0x3f7fbe77, float:0.999)
                x4.i r0 = new x4.i
                r9 = 1064849900(0x3f7851ec, float:0.97)
                r10 = 1065604874(0x3f83d70a, float:1.03)
                r11 = 1000(0x3e8, double:4.94E-321)
                r13 = 869711765(0x33d6bf95, float:1.0E-7)
                r19 = 0
                r8 = r0
                r8.<init>(r9, r10, r11, r13, r14, r16, r18, r19)
                r1.f27386n = r0
                r1.f27375c = r7
                r1.f27387o = r2
                r2 = 2000(0x7d0, double:9.88E-321)
                r1.f27388p = r2
                return
            L_0x01b0:
                r0 = move-exception
                monitor-exit(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: x4.a1.b.<init>(android.content.Context, x4.y0):void");
        }
    }

    /* compiled from: SimpleExoPlayer */
    public final class c implements s, z4.k, k, q5.f, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, c.b, b.C0277b, b1.b, r0.a {
        public c(a aVar) {
        }

        public void A(b0 b0Var, g gVar) {
            a1.this.getClass();
            a1.this.f27356j.A(b0Var, gVar);
        }

        public void C(int i10) {
            a1.I(a1.this);
        }

        public void D(boolean z10, int i10) {
            a1.I(a1.this);
        }

        public /* synthetic */ void F(c1 c1Var, int i10) {
            q0.s(this, c1Var, i10);
        }

        public void G(Surface surface) {
            a1.this.f27356j.G(surface);
            a1 a1Var = a1.this;
            if (a1Var.f27364r == surface) {
                Iterator<p> it = a1Var.f27351e.iterator();
                while (it.hasNext()) {
                    it.next().d();
                }
            }
        }

        public void I(b0 b0Var, g gVar) {
            a1.this.getClass();
            a1.this.f27356j.I(b0Var, gVar);
        }

        public void J(a5.d dVar) {
            a1.this.f27356j.J(dVar);
            a1.this.getClass();
            a1.this.getClass();
        }

        public void K(String str) {
            a1.this.f27356j.K(str);
        }

        public void L(String str, long j10, long j11) {
            a1.this.f27356j.L(str, j10, j11);
        }

        public /* synthetic */ void M(boolean z10) {
            q0.q(this, z10);
        }

        public /* synthetic */ void P(boolean z10) {
            q0.b(this, z10);
        }

        public /* synthetic */ void Q(g0 g0Var, l lVar) {
            q0.u(this, g0Var, lVar);
        }

        public void S(int i10, long j10, long j11) {
            a1.this.f27356j.S(i10, j10, j11);
        }

        public void T(int i10, long j10) {
            a1.this.f27356j.T(i10, j10);
        }

        public void V(boolean z10) {
            a1.I(a1.this);
        }

        public void W(long j10, int i10) {
            a1.this.f27356j.W(j10, i10);
        }

        public /* synthetic */ void X(m mVar) {
            q0.l(this, mVar);
        }

        public /* synthetic */ void Z(boolean z10) {
            q0.e(this, z10);
        }

        public void a(int i10, int i11, int i12, float f10) {
            a1.this.f27356j.a(i10, i11, i12, f10);
            Iterator<p> it = a1.this.f27351e.iterator();
            while (it.hasNext()) {
                it.next().a(i10, i11, i12, f10);
            }
        }

        public /* synthetic */ void b(int i10) {
            q0.k(this, i10);
        }

        public /* synthetic */ void c(boolean z10, int i10) {
            q0.m(this, z10, i10);
        }

        public void d(a5.d dVar) {
            a1.this.getClass();
            a1.this.f27356j.d(dVar);
        }

        public /* synthetic */ void e(boolean z10) {
            q0.f(this, z10);
        }

        public /* synthetic */ void f(o0 o0Var) {
            q0.i(this, o0Var);
        }

        public /* synthetic */ void g(int i10) {
            q0.n(this, i10);
        }

        public void h(String str) {
            a1.this.f27356j.h(str);
        }

        public void i(q5.a aVar) {
            v vVar = a1.this.f27356j;
            x.a Y = vVar.Y();
            t tVar = new t(Y, aVar);
            vVar.f28080e.put(1007, Y);
            o<x, x.b> oVar = vVar.f28081f;
            oVar.b(1007, tVar);
            oVar.a();
            Iterator<q5.f> it = a1.this.f27354h.iterator();
            while (it.hasNext()) {
                it.next().i(aVar);
            }
        }

        public void j(a5.d dVar) {
            a1.this.f27356j.j(dVar);
            a1.this.getClass();
            a1.this.getClass();
        }

        public /* synthetic */ void k(r0 r0Var, r0.b bVar) {
            q0.a(this, r0Var, bVar);
        }

        public /* synthetic */ void l(List list) {
            q0.r(this, list);
        }

        public void m(String str, long j10, long j11) {
            a1.this.f27356j.m(str, j10, j11);
        }

        public /* synthetic */ void n(int i10) {
            q0.o(this, i10);
        }

        public /* synthetic */ void o(c1 c1Var, Object obj, int i10) {
            q0.t(this, c1Var, obj, i10);
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            a1.this.T(new Surface(surfaceTexture), true);
            a1.this.N(i10, i11);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            a1.this.T((Surface) null, true);
            a1.this.N(0, 0);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            a1.this.N(i10, i11);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public void p(boolean z10) {
            a1.this.getClass();
        }

        public /* synthetic */ void q() {
            q0.p(this);
        }

        public /* synthetic */ void r(e0 e0Var, int i10) {
            q0.g(this, e0Var, i10);
        }

        public void s(boolean z10) {
            a1 a1Var = a1.this;
            if (a1Var.B != z10) {
                a1Var.B = z10;
                a1Var.f27356j.s(z10);
                Iterator<f> it = a1Var.f27352f.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            a1.this.N(i11, i12);
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            a1.this.T(surfaceHolder.getSurface(), false);
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            a1.this.T((Surface) null, false);
            a1.this.N(0, 0);
        }

        public void t(List<h6.b> list) {
            a1 a1Var = a1.this;
            a1Var.C = list;
            Iterator<k> it = a1Var.f27353g.iterator();
            while (it.hasNext()) {
                it.next().t(list);
            }
        }

        public void v(Exception exc) {
            a1.this.f27356j.v(exc);
        }

        public void w(long j10) {
            a1.this.f27356j.w(j10);
        }

        public void z(a5.d dVar) {
            a1.this.getClass();
            a1.this.f27356j.z(dVar);
        }
    }

    public a1(b bVar) {
        int i10;
        b bVar2 = bVar;
        Context applicationContext = bVar2.f27373a.getApplicationContext();
        v vVar = bVar2.f27380h;
        this.f27356j = vVar;
        this.f27372z = bVar2.f27382j;
        this.f27366t = bVar2.f27383k;
        this.f27362p = bVar2.f27388p;
        c cVar = new c((a) null);
        this.f27350d = cVar;
        this.f27351e = new CopyOnWriteArraySet<>();
        this.f27352f = new CopyOnWriteArraySet<>();
        this.f27353g = new CopyOnWriteArraySet<>();
        this.f27354h = new CopyOnWriteArraySet<>();
        this.f27355i = new CopyOnWriteArraySet<>();
        Handler handler = new Handler(bVar2.f27381i);
        v0[] a10 = bVar2.f27374b.a(handler, cVar, cVar, cVar, cVar);
        this.f27348b = a10;
        this.A = 1.0f;
        if (e0.f26436a < 21) {
            AudioTrack audioTrack = this.f27363q;
            if (!(audioTrack == null || audioTrack.getAudioSessionId() == 0)) {
                this.f27363q.release();
                this.f27363q = null;
            }
            if (this.f27363q == null) {
                this.f27363q = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
            }
            this.f27371y = this.f27363q.getAudioSessionId();
        } else {
            UUID uuid = f.f27566a;
            AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
            if (audioManager == null) {
                i10 = -1;
            } else {
                i10 = audioManager.generateAudioSessionId();
            }
            this.f27371y = i10;
        }
        this.C = Collections.emptyList();
        this.F = true;
        n nVar = bVar2.f27376d;
        w wVar = bVar2.f27377e;
        j jVar = bVar2.f27378f;
        u6.b bVar3 = bVar2.f27379g;
        boolean z10 = bVar2.f27384l;
        Handler handler2 = handler;
        j jVar2 = jVar;
        boolean z11 = z10;
        w wVar2 = r0;
        w wVar3 = new w(a10, nVar, wVar, jVar2, bVar3, vVar, z11, bVar2.f27385m, bVar2.f27386n, bVar2.f27387o, false, bVar2.f27375c, bVar2.f27381i, this);
        w wVar4 = wVar2;
        this.f27349c = wVar4;
        c cVar2 = cVar;
        wVar4.u(cVar2);
        b bVar4 = bVar;
        Handler handler3 = handler2;
        b bVar5 = new b(bVar4.f27373a, handler3, cVar2);
        this.f27357k = bVar5;
        bVar5.a(false);
        c cVar3 = new c(bVar4.f27373a, handler3, cVar2);
        this.f27358l = cVar3;
        cVar3.c((d) null);
        b1 b1Var = new b1(bVar4.f27373a, handler3, cVar2);
        this.f27359m = b1Var;
        b1Var.c(e0.A(this.f27372z.f28340c));
        d1 d1Var = new d1(bVar4.f27373a);
        this.f27360n = d1Var;
        d1Var.f27490c = false;
        d1Var.a();
        e1 e1Var = new e1(bVar4.f27373a);
        this.f27361o = e1Var;
        e1Var.f27564c = false;
        e1Var.a();
        this.J = L(b1Var);
        P(1, 102, Integer.valueOf(this.f27371y));
        P(2, 102, Integer.valueOf(this.f27371y));
        P(1, 3, this.f27372z);
        P(2, 4, Integer.valueOf(this.f27366t));
        P(1, 101, Boolean.valueOf(this.B));
    }

    public static void I(a1 a1Var) {
        int W = a1Var.W();
        boolean z10 = true;
        if (W != 1) {
            if (W == 2 || W == 3) {
                a1Var.Y();
                boolean z11 = a1Var.f27349c.f27756x.f27693o;
                d1 d1Var = a1Var.f27360n;
                if (!a1Var.k() || z11) {
                    z10 = false;
                }
                d1Var.f27491d = z10;
                d1Var.a();
                e1 e1Var = a1Var.f27361o;
                e1Var.f27565d = a1Var.k();
                e1Var.a();
                return;
            } else if (W != 4) {
                throw new IllegalStateException();
            }
        }
        d1 d1Var2 = a1Var.f27360n;
        d1Var2.f27491d = false;
        d1Var2.a();
        e1 e1Var2 = a1Var.f27361o;
        e1Var2.f27565d = false;
        e1Var2.a();
    }

    public static b5.a L(b1 b1Var) {
        b1Var.getClass();
        return new b5.a(0, e0.f26436a >= 28 ? b1Var.f27444d.getStreamMinVolume(b1Var.f27446f) : 0, b1Var.f27444d.getStreamMaxVolume(b1Var.f27446f));
    }

    public static int M(boolean z10, int i10) {
        return (!z10 || i10 == 1) ? 1 : 2;
    }

    public Looper A() {
        return this.f27349c.f27746n;
    }

    public boolean B() {
        Y();
        return this.f27349c.f27750r;
    }

    public long C() {
        Y();
        return this.f27349c.C();
    }

    public int D() {
        Y();
        return this.f27349c.D();
    }

    public l E() {
        Y();
        return this.f27349c.E();
    }

    public int F(int i10) {
        Y();
        return this.f27349c.f27735c[i10].g();
    }

    public long G() {
        Y();
        return this.f27349c.G();
    }

    public r0.c H() {
        return this;
    }

    public void J(Surface surface) {
        Y();
        if (surface != null && surface == this.f27364r) {
            Y();
            O();
            T((Surface) null, false);
            N(0, 0);
        }
    }

    public void K(SurfaceView surfaceView) {
        SurfaceHolder surfaceHolder;
        Y();
        if (!(surfaceView instanceof j)) {
            if (surfaceView == null) {
                surfaceHolder = null;
            } else {
                surfaceHolder = surfaceView.getHolder();
            }
            Y();
            if (surfaceHolder != null && surfaceHolder == this.f27367u) {
                S((SurfaceHolder) null);
            }
        } else if (surfaceView.getHolder() == this.f27367u) {
            Q((w6.l) null);
            this.f27367u = null;
        }
    }

    public final void N(int i10, int i11) {
        if (i10 != this.f27369w || i11 != this.f27370x) {
            this.f27369w = i10;
            this.f27370x = i11;
            v vVar = this.f27356j;
            x.a e02 = vVar.e0();
            y4.g gVar = new y4.g(e02, i10, i11);
            vVar.f28080e.put(1029, e02);
            o<x, x.b> oVar = vVar.f28081f;
            oVar.b(1029, gVar);
            oVar.a();
            Iterator<p> it = this.f27351e.iterator();
            while (it.hasNext()) {
                it.next().h(i10, i11);
            }
        }
    }

    public final void O() {
        TextureView textureView = this.f27368v;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f27350d) {
                Log.w("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f27368v.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
            this.f27368v = null;
        }
        SurfaceHolder surfaceHolder = this.f27367u;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f27350d);
            this.f27367u = null;
        }
    }

    public final void P(int i10, int i11, Object obj) {
        for (v0 v0Var : this.f27348b) {
            if (v0Var.g() == i10) {
                s0 I2 = this.f27349c.I(v0Var);
                v6.a.d(!I2.f27721i);
                I2.f27717e = i11;
                v6.a.d(!I2.f27721i);
                I2.f27718f = obj;
                I2.d();
            }
        }
    }

    public final void Q(w6.l lVar) {
        P(2, 8, lVar);
    }

    public void R(Surface surface) {
        Y();
        O();
        if (surface != null) {
            Q((w6.l) null);
        }
        int i10 = 0;
        T(surface, false);
        if (surface != null) {
            i10 = -1;
        }
        N(i10, i10);
    }

    public void S(SurfaceHolder surfaceHolder) {
        Y();
        O();
        if (surfaceHolder != null) {
            Q((w6.l) null);
        }
        this.f27367u = surfaceHolder;
        if (surfaceHolder == null) {
            T((Surface) null, false);
            N(0, 0);
            return;
        }
        surfaceHolder.addCallback(this.f27350d);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            T((Surface) null, false);
            N(0, 0);
            return;
        }
        T(surface, false);
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        N(surfaceFrame.width(), surfaceFrame.height());
    }

    public final void T(Surface surface, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (v0 v0Var : this.f27348b) {
            if (v0Var.g() == 2) {
                s0 I2 = this.f27349c.I(v0Var);
                v6.a.d(!I2.f27721i);
                I2.f27717e = 1;
                v6.a.d(true ^ I2.f27721i);
                I2.f27718f = surface;
                I2.d();
                arrayList.add(I2);
            }
        }
        Surface surface2 = this.f27364r;
        if (!(surface2 == null || surface2 == surface)) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((s0) it.next()).a(this.f27362p);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                w wVar = this.f27349c;
                m b10 = m.b(new a0(3));
                n0 n0Var = wVar.f27756x;
                n0 a10 = n0Var.a(n0Var.f27680b);
                a10.f27694p = a10.f27696r;
                a10.f27695q = 0;
                n0 e10 = a10.g(1).e(b10);
                wVar.f27751s++;
                wVar.f27739g.f27772g.O(6).sendToTarget();
                wVar.Q(e10, false, 4, 0, 1, false);
            }
            if (this.f27365s) {
                this.f27364r.release();
            }
        }
        this.f27364r = surface;
        this.f27365s = z10;
    }

    public void U(SurfaceView surfaceView) {
        Y();
        SurfaceHolder surfaceHolder = null;
        if (surfaceView instanceof j) {
            w6.l videoDecoderOutputBufferRenderer = ((j) surfaceView).getVideoDecoderOutputBufferRenderer();
            Y();
            O();
            T((Surface) null, false);
            N(0, 0);
            this.f27367u = surfaceView.getHolder();
            Q(videoDecoderOutputBufferRenderer);
            return;
        }
        if (surfaceView != null) {
            surfaceHolder = surfaceView.getHolder();
        }
        S(surfaceHolder);
    }

    public void V(TextureView textureView) {
        Y();
        O();
        if (textureView != null) {
            Q((w6.l) null);
        }
        this.f27368v = textureView;
        if (textureView == null) {
            T((Surface) null, true);
            N(0, 0);
            return;
        }
        if (textureView.getSurfaceTextureListener() != null) {
            Log.w("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f27350d);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            T((Surface) null, true);
            N(0, 0);
            return;
        }
        T(new Surface(surfaceTexture), true);
        N(textureView.getWidth(), textureView.getHeight());
    }

    public int W() {
        Y();
        return this.f27349c.f27756x.f27682d;
    }

    public final void X(boolean z10, int i10, int i11) {
        int i12 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        this.f27349c.P(z11, i12, i11);
    }

    public final void Y() {
        if (Looper.myLooper() == this.f27349c.f27746n) {
            return;
        }
        if (!this.F) {
            v6.p.d("SimpleExoPlayer", "Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread", this.G ? null : new IllegalStateException());
            this.G = true;
            return;
        }
        throw new IllegalStateException("Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
    }

    public m a() {
        Y();
        return this.f27349c.f27756x.f27683e;
    }

    public void b() {
        Y();
        boolean k10 = k();
        int e10 = this.f27358l.e(k10, 2);
        X(k10, e10, M(k10, e10));
        this.f27349c.b();
    }

    public void c(boolean z10) {
        Y();
        int e10 = this.f27358l.e(z10, W());
        X(z10, e10, M(z10, e10));
    }

    public r0.d d() {
        return this;
    }

    public boolean e() {
        Y();
        return this.f27349c.e();
    }

    public o0 f() {
        Y();
        return this.f27349c.f27756x.f27691m;
    }

    public long g() {
        Y();
        return this.f27349c.g();
    }

    public long h() {
        Y();
        return f.c(this.f27349c.f27756x.f27695q);
    }

    public void i(int i10, long j10) {
        Y();
        v vVar = this.f27356j;
        if (!vVar.f28083h) {
            x.a Y = vVar.Y();
            vVar.f28083h = true;
            y4.l lVar = new y4.l(Y, 0);
            vVar.f28080e.put(-1, Y);
            o<x, x.b> oVar = vVar.f28081f;
            oVar.b(-1, lVar);
            oVar.a();
        }
        this.f27349c.i(i10, j10);
    }

    public boolean k() {
        Y();
        return this.f27349c.f27756x.f27689k;
    }

    public void l(boolean z10) {
        Y();
        this.f27349c.l(z10);
    }

    public List<q5.a> m() {
        Y();
        return this.f27349c.f27756x.f27687i;
    }

    public long n0() {
        Y();
        return this.f27349c.n0();
    }

    public int o() {
        Y();
        return this.f27349c.o();
    }

    public void q(r0.a aVar) {
        this.f27349c.q(aVar);
    }

    public int r() {
        Y();
        return this.f27349c.r();
    }

    public void s(int i10) {
        Y();
        this.f27349c.s(i10);
    }

    public void u(r0.a aVar) {
        aVar.getClass();
        this.f27349c.u(aVar);
    }

    public int v() {
        Y();
        return this.f27349c.v();
    }

    public int w() {
        Y();
        return this.f27349c.f27756x.f27690l;
    }

    public g0 x() {
        Y();
        return this.f27349c.f27756x.f27685g;
    }

    public int y() {
        Y();
        return this.f27349c.f27749q;
    }

    public c1 z() {
        Y();
        return this.f27349c.f27756x.f27679a;
    }
}
