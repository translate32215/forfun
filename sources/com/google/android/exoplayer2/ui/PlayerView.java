package com.google.android.exoplayer2.ui;

import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ba.s;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.b;
import com.startapp.startappsdk.R;
import h6.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import q5.a;
import r6.l;
import t6.e;
import t6.f;
import v6.j;
import w6.o;
import w6.p;
import x4.a1;
import x4.c1;
import x4.e0;
import x4.g;
import x4.m;
import x4.o0;
import x4.p0;
import x4.q0;
import x4.r0;
import z5.g0;

public class PlayerView extends FrameLayout {
    public static final /* synthetic */ int J = 0;
    public boolean A;
    public j<? super m> B;
    public CharSequence C;
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean I;

    /* renamed from: a  reason: collision with root package name */
    public final a f5342a;

    /* renamed from: b  reason: collision with root package name */
    public final AspectRatioFrameLayout f5343b;

    /* renamed from: c  reason: collision with root package name */
    public final View f5344c;

    /* renamed from: d  reason: collision with root package name */
    public final View f5345d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f5346e;

    /* renamed from: f  reason: collision with root package name */
    public final SubtitleView f5347f;

    /* renamed from: g  reason: collision with root package name */
    public final View f5348g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f5349h;

    /* renamed from: i  reason: collision with root package name */
    public final b f5350i;

    /* renamed from: r  reason: collision with root package name */
    public final FrameLayout f5351r;

    /* renamed from: s  reason: collision with root package name */
    public final FrameLayout f5352s;

    /* renamed from: t  reason: collision with root package name */
    public r0 f5353t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5354u;

    /* renamed from: v  reason: collision with root package name */
    public b.d f5355v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f5356w;

    /* renamed from: x  reason: collision with root package name */
    public Drawable f5357x;

    /* renamed from: y  reason: collision with root package name */
    public int f5358y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f5359z;

    public final class a implements r0.a, k, p, View.OnLayoutChangeListener, e, b.d {

        /* renamed from: a  reason: collision with root package name */
        public final c1.b f5360a = new c1.b();

        /* renamed from: b  reason: collision with root package name */
        public Object f5361b;

        public a() {
        }

        public void C(int i10) {
            PlayerView playerView = PlayerView.this;
            int i11 = PlayerView.J;
            playerView.l();
            PlayerView.this.n();
            PlayerView playerView2 = PlayerView.this;
            if (!playerView2.e() || !playerView2.F) {
                playerView2.f(false);
            } else {
                playerView2.d();
            }
        }

        public void D(boolean z10, int i10) {
            PlayerView playerView = PlayerView.this;
            int i11 = PlayerView.J;
            playerView.l();
            PlayerView playerView2 = PlayerView.this;
            if (!playerView2.e() || !playerView2.F) {
                playerView2.f(false);
            } else {
                playerView2.d();
            }
        }

        public /* synthetic */ void F(c1 c1Var, int i10) {
            q0.s(this, c1Var, i10);
        }

        public /* synthetic */ void M(boolean z10) {
            q0.q(this, z10);
        }

        public /* synthetic */ void P(boolean z10) {
            q0.b(this, z10);
        }

        public void Q(g0 g0Var, l lVar) {
            r0 r0Var = PlayerView.this.f5353t;
            r0Var.getClass();
            c1 z10 = r0Var.z();
            if (z10.q()) {
                this.f5361b = null;
            } else if (!r0Var.x().b()) {
                this.f5361b = z10.g(r0Var.o(), this.f5360a, true).f27463b;
            } else {
                Object obj = this.f5361b;
                if (obj != null) {
                    int b10 = z10.b(obj);
                    if (b10 == -1 || r0Var.D() != z10.f(b10, this.f5360a).f27464c) {
                        this.f5361b = null;
                    } else {
                        return;
                    }
                }
            }
            PlayerView.this.o(false);
        }

        public /* synthetic */ void V(boolean z10) {
            q0.c(this, z10);
        }

        public /* synthetic */ void X(m mVar) {
            q0.l(this, mVar);
        }

        public /* synthetic */ void Z(boolean z10) {
            q0.e(this, z10);
        }

        public void a(int i10, int i11, int i12, float f10) {
            float f11 = (i11 == 0 || i10 == 0) ? 1.0f : (((float) i10) * f10) / ((float) i11);
            PlayerView playerView = PlayerView.this;
            View view = playerView.f5345d;
            if (view instanceof TextureView) {
                if (i12 == 90 || i12 == 270) {
                    f11 = 1.0f / f11;
                }
                if (playerView.H != 0) {
                    view.removeOnLayoutChangeListener(this);
                }
                PlayerView playerView2 = PlayerView.this;
                playerView2.H = i12;
                if (i12 != 0) {
                    playerView2.f5345d.addOnLayoutChangeListener(this);
                }
                PlayerView playerView3 = PlayerView.this;
                PlayerView.a((TextureView) playerView3.f5345d, playerView3.H);
            }
            PlayerView playerView4 = PlayerView.this;
            AspectRatioFrameLayout aspectRatioFrameLayout = playerView4.f5343b;
            View view2 = playerView4.f5345d;
            if (aspectRatioFrameLayout != null) {
                if (view2 instanceof f) {
                    f11 = 0.0f;
                }
                aspectRatioFrameLayout.setAspectRatio(f11);
            }
        }

        public /* synthetic */ void b(int i10) {
            q0.k(this, i10);
        }

        public /* synthetic */ void c(boolean z10, int i10) {
            q0.m(this, z10, i10);
        }

        public void d() {
            View view = PlayerView.this.f5344c;
            if (view != null) {
                view.setVisibility(4);
            }
        }

        public /* synthetic */ void e(boolean z10) {
            q0.f(this, z10);
        }

        public /* synthetic */ void f(o0 o0Var) {
            q0.i(this, o0Var);
        }

        public void g(int i10) {
            PlayerView playerView = PlayerView.this;
            int i11 = PlayerView.J;
            if (playerView.e()) {
                PlayerView playerView2 = PlayerView.this;
                if (playerView2.F) {
                    playerView2.d();
                }
            }
        }

        public /* synthetic */ void h(int i10, int i11) {
            o.a(this, i10, i11);
        }

        public /* synthetic */ void k(r0 r0Var, r0.b bVar) {
            q0.a(this, r0Var, bVar);
        }

        public /* synthetic */ void l(List list) {
            q0.r(this, list);
        }

        public /* synthetic */ void n(int i10) {
            q0.o(this, i10);
        }

        public /* synthetic */ void o(c1 c1Var, Object obj, int i10) {
            q0.t(this, c1Var, obj, i10);
        }

        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            PlayerView.a((TextureView) view, PlayerView.this.H);
        }

        public /* synthetic */ void p(boolean z10) {
            q0.d(this, z10);
        }

        public /* synthetic */ void q() {
            q0.p(this);
        }

        public /* synthetic */ void r(e0 e0Var, int i10) {
            q0.g(this, e0Var, i10);
        }

        public void t(List<h6.b> list) {
            SubtitleView subtitleView = PlayerView.this.f5347f;
            if (subtitleView != null) {
                subtitleView.setCues(list);
            }
        }

        public void x(int i10) {
            PlayerView playerView = PlayerView.this;
            int i11 = PlayerView.J;
            playerView.m();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PlayerView(android.content.Context r21, android.util.AttributeSet r22) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r22
            r3 = 0
            r1.<init>(r0, r2, r3)
            com.google.android.exoplayer2.ui.PlayerView$a r4 = new com.google.android.exoplayer2.ui.PlayerView$a
            r4.<init>()
            r1.f5342a = r4
            boolean r5 = r20.isInEditMode()
            r6 = 0
            if (r5 == 0) goto L_0x0067
            r1.f5343b = r6
            r1.f5344c = r6
            r1.f5345d = r6
            r1.f5346e = r6
            r1.f5347f = r6
            r1.f5348g = r6
            r1.f5349h = r6
            r1.f5350i = r6
            r1.f5351r = r6
            r1.f5352s = r6
            android.widget.ImageView r2 = new android.widget.ImageView
            r2.<init>(r0)
            int r0 = v6.e0.f26436a
            r3 = 23
            r4 = 2131099761(0x7f060071, float:1.7811884E38)
            r5 = 2131230858(0x7f08008a, float:1.807778E38)
            if (r0 < r3) goto L_0x0050
            android.content.res.Resources r0 = r20.getResources()
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r5, r6)
            r2.setImageDrawable(r3)
            int r0 = r0.getColor(r4, r6)
            r2.setBackgroundColor(r0)
            goto L_0x0062
        L_0x0050:
            android.content.res.Resources r0 = r20.getResources()
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r5)
            r2.setImageDrawable(r3)
            int r0 = r0.getColor(r4)
            r2.setBackgroundColor(r0)
        L_0x0062:
            r1.addView(r2)
            goto L_0x024a
        L_0x0067:
            r5 = 2131623996(0x7f0e003c, float:1.887516E38)
            r7 = 1
            r1.A = r7
            r10 = 5000(0x1388, float:7.006E-42)
            if (r2 == 0) goto L_0x00f4
            android.content.res.Resources$Theme r11 = r21.getTheme()
            int[] r12 = s6.c.f24970d
            android.content.res.TypedArray r11 = r11.obtainStyledAttributes(r2, r12, r3, r3)
            r12 = 25
            boolean r13 = r11.hasValue(r12)     // Catch:{ all -> 0x00ef }
            int r12 = r11.getColor(r12, r3)     // Catch:{ all -> 0x00ef }
            r14 = 13
            int r5 = r11.getResourceId(r14, r5)     // Catch:{ all -> 0x00ef }
            r14 = 30
            boolean r14 = r11.getBoolean(r14, r7)     // Catch:{ all -> 0x00ef }
            r15 = 6
            int r15 = r11.getResourceId(r15, r3)     // Catch:{ all -> 0x00ef }
            r6 = 31
            boolean r6 = r11.getBoolean(r6, r7)     // Catch:{ all -> 0x00ef }
            r8 = 26
            int r8 = r11.getInt(r8, r7)     // Catch:{ all -> 0x00ef }
            r9 = 15
            int r9 = r11.getInt(r9, r3)     // Catch:{ all -> 0x00ef }
            r3 = 24
            int r10 = r11.getInt(r3, r10)     // Catch:{ all -> 0x00ef }
            r3 = 9
            boolean r3 = r11.getBoolean(r3, r7)     // Catch:{ all -> 0x00ef }
            r16 = r3
            r3 = 2
            boolean r17 = r11.getBoolean(r3, r7)     // Catch:{ all -> 0x00ef }
            r3 = 22
            r7 = 0
            int r3 = r11.getInteger(r3, r7)     // Catch:{ all -> 0x00ef }
            r7 = 10
            r19 = r3
            boolean r3 = r1.f5359z     // Catch:{ all -> 0x00ef }
            boolean r3 = r11.getBoolean(r7, r3)     // Catch:{ all -> 0x00ef }
            r1.f5359z = r3     // Catch:{ all -> 0x00ef }
            r3 = 8
            r7 = 1
            boolean r18 = r11.getBoolean(r3, r7)     // Catch:{ all -> 0x00ef }
            r3 = 32
            boolean r7 = r1.A     // Catch:{ all -> 0x00ef }
            boolean r3 = r11.getBoolean(r3, r7)     // Catch:{ all -> 0x00ef }
            r1.A = r3     // Catch:{ all -> 0x00ef }
            r11.recycle()
            r3 = r16
            r11 = r17
            r7 = r19
            r17 = r6
            r16 = r10
            r10 = r18
            goto L_0x0102
        L_0x00ef:
            r0 = move-exception
            r11.recycle()
            throw r0
        L_0x00f4:
            r3 = 1
            r7 = 0
            r8 = 1
            r9 = 0
            r10 = 1
            r11 = 1
            r12 = 0
            r13 = 0
            r14 = 1
            r15 = 0
            r16 = 5000(0x1388, float:7.006E-42)
            r17 = 1
        L_0x0102:
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r21)
            r6.inflate(r5, r1)
            r5 = 262144(0x40000, float:3.67342E-40)
            r1.setDescendantFocusability(r5)
            r5 = 2131427611(0x7f0b011b, float:1.8476843E38)
            android.view.View r5 = r1.findViewById(r5)
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r5 = (com.google.android.exoplayer2.ui.AspectRatioFrameLayout) r5
            r1.f5343b = r5
            if (r5 == 0) goto L_0x011e
            r5.setResizeMode(r9)
        L_0x011e:
            r6 = 2131427644(0x7f0b013c, float:1.847691E38)
            android.view.View r6 = r1.findViewById(r6)
            r1.f5344c = r6
            if (r6 == 0) goto L_0x012e
            if (r13 == 0) goto L_0x012e
            r6.setBackgroundColor(r12)
        L_0x012e:
            if (r5 == 0) goto L_0x0174
            if (r8 == 0) goto L_0x0174
            android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams
            r9 = -1
            r6.<init>(r9, r9)
            r9 = 2
            if (r8 == r9) goto L_0x0161
            r9 = 3
            if (r8 == r9) goto L_0x0151
            r9 = 4
            if (r8 == r9) goto L_0x0149
            android.view.SurfaceView r8 = new android.view.SurfaceView
            r8.<init>(r0)
            r1.f5345d = r8
            goto L_0x0168
        L_0x0149:
            w6.j r8 = new w6.j
            r8.<init>(r0)
            r1.f5345d = r8
            goto L_0x0168
        L_0x0151:
            t6.f r8 = new t6.f
            r8.<init>(r0)
            r8.setSingleTapListener(r4)
            boolean r9 = r1.A
            r8.setUseSensorRotation(r9)
            r1.f5345d = r8
            goto L_0x0168
        L_0x0161:
            android.view.TextureView r8 = new android.view.TextureView
            r8.<init>(r0)
            r1.f5345d = r8
        L_0x0168:
            android.view.View r8 = r1.f5345d
            r8.setLayoutParams(r6)
            android.view.View r6 = r1.f5345d
            r8 = 0
            r5.addView(r6, r8)
            goto L_0x0177
        L_0x0174:
            r5 = 0
            r1.f5345d = r5
        L_0x0177:
            r5 = 2131427603(0x7f0b0113, float:1.8476827E38)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            r1.f5351r = r5
            r5 = 2131427629(0x7f0b012d, float:1.847688E38)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            r1.f5352s = r5
            r5 = 2131427604(0x7f0b0114, float:1.8476829E38)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r1.f5346e = r5
            if (r14 == 0) goto L_0x019e
            if (r5 == 0) goto L_0x019e
            r5 = 1
            goto L_0x019f
        L_0x019e:
            r5 = 0
        L_0x019f:
            r1.f5356w = r5
            if (r15 == 0) goto L_0x01ad
            android.content.Context r5 = r20.getContext()
            android.graphics.drawable.Drawable r5 = d0.a.c(r5, r15)
            r1.f5357x = r5
        L_0x01ad:
            r5 = 2131427647(0x7f0b013f, float:1.8476916E38)
            android.view.View r5 = r1.findViewById(r5)
            com.google.android.exoplayer2.ui.SubtitleView r5 = (com.google.android.exoplayer2.ui.SubtitleView) r5
            r1.f5347f = r5
            if (r5 == 0) goto L_0x01c0
            r5.a()
            r5.b()
        L_0x01c0:
            r5 = 2131427608(0x7f0b0118, float:1.8476837E38)
            android.view.View r5 = r1.findViewById(r5)
            r1.f5348g = r5
            r6 = 8
            if (r5 == 0) goto L_0x01d0
            r5.setVisibility(r6)
        L_0x01d0:
            r1.f5358y = r7
            r5 = 2131427616(0x7f0b0120, float:1.8476853E38)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r1.f5349h = r5
            if (r5 == 0) goto L_0x01e2
            r5.setVisibility(r6)
        L_0x01e2:
            r5 = 2131427612(0x7f0b011c, float:1.8476845E38)
            android.view.View r6 = r1.findViewById(r5)
            com.google.android.exoplayer2.ui.b r6 = (com.google.android.exoplayer2.ui.b) r6
            r7 = 2131427613(0x7f0b011d, float:1.8476847E38)
            android.view.View r7 = r1.findViewById(r7)
            if (r6 == 0) goto L_0x01f8
            r1.f5350i = r6
            r8 = 0
            goto L_0x0222
        L_0x01f8:
            if (r7 == 0) goto L_0x021e
            com.google.android.exoplayer2.ui.b r6 = new com.google.android.exoplayer2.ui.b
            r8 = 0
            r9 = 0
            r6.<init>(r0, r9, r8, r2)
            r1.f5350i = r6
            r6.setId(r5)
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            r6.setLayoutParams(r0)
            android.view.ViewParent r0 = r7.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r0.indexOfChild(r7)
            r0.removeView(r7)
            r0.addView(r6, r2)
            goto L_0x0222
        L_0x021e:
            r8 = 0
            r9 = 0
            r1.f5350i = r9
        L_0x0222:
            com.google.android.exoplayer2.ui.b r0 = r1.f5350i
            if (r0 == 0) goto L_0x0229
            r7 = r16
            goto L_0x022a
        L_0x0229:
            r7 = 0
        L_0x022a:
            r1.D = r7
            r1.G = r3
            r1.E = r11
            r1.F = r10
            if (r17 == 0) goto L_0x0238
            if (r0 == 0) goto L_0x0238
            r3 = 1
            goto L_0x0239
        L_0x0238:
            r3 = 0
        L_0x0239:
            r1.f5354u = r3
            r20.d()
            r20.m()
            com.google.android.exoplayer2.ui.b r0 = r1.f5350i
            if (r0 == 0) goto L_0x024a
            java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.ui.b$d> r0 = r0.f5402b
            r0.add(r4)
        L_0x024a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.PlayerView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static void a(TextureView textureView, int i10) {
        Matrix matrix = new Matrix();
        float width = (float) textureView.getWidth();
        float height = (float) textureView.getHeight();
        if (!(width == 0.0f || height == 0.0f || i10 == 0)) {
            float f10 = width / 2.0f;
            float f11 = height / 2.0f;
            matrix.postRotate((float) i10, f10, f11);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f10, f11);
        }
        textureView.setTransform(matrix);
    }

    public final void b() {
        View view = this.f5344c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final void c() {
        ImageView imageView = this.f5346e;
        if (imageView != null) {
            imageView.setImageResource(17170445);
            this.f5346e.setVisibility(4);
        }
    }

    public void d() {
        b bVar = this.f5350i;
        if (bVar != null) {
            bVar.c();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        r0 r0Var = this.f5353t;
        if (r0Var != null && r0Var.e()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z10 = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        if (!z10 || !p() || this.f5350i.e()) {
            if ((p() && this.f5350i.a(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
                f(true);
            } else if (!z10 || !p()) {
                return false;
            } else {
                f(true);
                return false;
            }
        } else {
            f(true);
        }
        return true;
    }

    public final boolean e() {
        r0 r0Var = this.f5353t;
        return r0Var != null && r0Var.e() && this.f5353t.k();
    }

    public final void f(boolean z10) {
        if ((!e() || !this.F) && p()) {
            boolean z11 = this.f5350i.e() && this.f5350i.getShowTimeoutMs() <= 0;
            boolean h10 = h();
            if (z10 || z11 || h10) {
                j(h10);
            }
        }
    }

    @RequiresNonNull({"artworkView"})
    public final boolean g(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f10 = ((float) intrinsicWidth) / ((float) intrinsicHeight);
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f5343b;
                ImageView imageView = this.f5346e;
                if (aspectRatioFrameLayout != null) {
                    if (imageView instanceof f) {
                        f10 = 0.0f;
                    }
                    aspectRatioFrameLayout.setAspectRatio(f10);
                }
                this.f5346e.setImageDrawable(drawable);
                this.f5346e.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public List<a6.b> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f5352s;
        if (frameLayout != null) {
            arrayList.add(new a6.b((View) frameLayout, 3, "Transparent overlay does not impact viewability"));
        }
        b bVar = this.f5350i;
        if (bVar != null) {
            arrayList.add(new a6.b((View) bVar, 0, (String) null));
        }
        return s.z(arrayList);
    }

    @Deprecated
    public View[] getAdOverlayViews() {
        return new View[0];
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.f5351r;
        v6.a.g(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public boolean getControllerAutoShow() {
        return this.E;
    }

    public boolean getControllerHideOnTouch() {
        return this.G;
    }

    public int getControllerShowTimeoutMs() {
        return this.D;
    }

    public Drawable getDefaultArtwork() {
        return this.f5357x;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f5352s;
    }

    public r0 getPlayer() {
        return this.f5353t;
    }

    public int getResizeMode() {
        v6.a.f(this.f5343b);
        return this.f5343b.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f5347f;
    }

    public boolean getUseArtwork() {
        return this.f5356w;
    }

    public boolean getUseController() {
        return this.f5354u;
    }

    public View getVideoSurfaceView() {
        return this.f5345d;
    }

    public final boolean h() {
        r0 r0Var = this.f5353t;
        if (r0Var == null) {
            return true;
        }
        int W = r0Var.W();
        if (!this.E || (W != 1 && W != 4 && this.f5353t.k())) {
            return false;
        }
        return true;
    }

    public void i() {
        j(h());
    }

    public final void j(boolean z10) {
        if (p()) {
            this.f5350i.setShowTimeoutMs(z10 ? 0 : this.D);
            b bVar = this.f5350i;
            if (!bVar.e()) {
                bVar.setVisibility(0);
                Iterator<b.d> it = bVar.f5402b.iterator();
                while (it.hasNext()) {
                    it.next().x(bVar.getVisibility());
                }
                bVar.h();
                bVar.f();
            }
            bVar.d();
        }
    }

    public final boolean k() {
        if (!p() || this.f5353t == null) {
            return false;
        }
        if (!this.f5350i.e()) {
            f(true);
        } else if (this.G) {
            this.f5350i.c();
        }
        return true;
    }

    public final void l() {
        int i10;
        if (this.f5348g != null) {
            r0 r0Var = this.f5353t;
            boolean z10 = true;
            int i11 = 0;
            if (r0Var == null || r0Var.W() != 2 || ((i10 = this.f5358y) != 2 && (i10 != 1 || !this.f5353t.k()))) {
                z10 = false;
            }
            View view = this.f5348g;
            if (!z10) {
                i11 = 8;
            }
            view.setVisibility(i11);
        }
    }

    public final void m() {
        b bVar = this.f5350i;
        String str = null;
        if (bVar == null || !this.f5354u) {
            setContentDescription((CharSequence) null);
        } else if (bVar.getVisibility() == 0) {
            if (this.G) {
                str = getResources().getString(R.string.exo_controls_hide);
            }
            setContentDescription(str);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    public final void n() {
        j<? super m> jVar;
        TextView textView = this.f5349h;
        if (textView != null) {
            CharSequence charSequence = this.C;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f5349h.setVisibility(0);
                return;
            }
            r0 r0Var = this.f5353t;
            m a10 = r0Var != null ? r0Var.a() : null;
            if (a10 == null || (jVar = this.B) == null) {
                this.f5349h.setVisibility(8);
                return;
            }
            this.f5349h.setText((CharSequence) jVar.a(a10).second);
            this.f5349h.setVisibility(0);
        }
    }

    public final void o(boolean z10) {
        boolean z11;
        byte[] bArr;
        int i10;
        r0 r0Var = this.f5353t;
        if (r0Var != null && !r0Var.x().b()) {
            if (z10 && !this.f5359z) {
                b();
            }
            l E2 = r0Var.E();
            int i11 = 0;
            while (i11 < E2.f24663a) {
                if (r0Var.F(i11) != 2 || E2.f24664b[i11] == null) {
                    i11++;
                } else {
                    c();
                    return;
                }
            }
            b();
            if (this.f5356w) {
                v6.a.f(this.f5346e);
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                for (q5.a next : r0Var.m()) {
                    int i12 = 0;
                    int i13 = -1;
                    boolean z12 = false;
                    while (true) {
                        a.b[] bVarArr = next.f24150a;
                        if (i12 >= bVarArr.length) {
                            break;
                        }
                        a.b bVar = bVarArr[i12];
                        if (bVar instanceof v5.a) {
                            v5.a aVar = (v5.a) bVar;
                            bArr = aVar.f26380e;
                            i10 = aVar.f26379d;
                        } else if (bVar instanceof t5.a) {
                            t5.a aVar2 = (t5.a) bVar;
                            bArr = aVar2.f25746h;
                            i10 = aVar2.f25739a;
                        } else {
                            continue;
                            i12++;
                        }
                        if (i13 == -1 || i10 == 3) {
                            z12 = g(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                            if (i10 == 3) {
                                continue;
                                break;
                            } else {
                                i13 = i10;
                                i12++;
                            }
                        } else {
                            i12++;
                        }
                    }
                    if (z12) {
                        return;
                    }
                }
                if (g(this.f5357x)) {
                    return;
                }
            }
            c();
        } else if (!this.f5359z) {
            c();
            b();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!p() || this.f5353t == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.I = true;
            return true;
        } else if (action != 1 || !this.I) {
            return false;
        } else {
            this.I = false;
            performClick();
            return true;
        }
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!p() || this.f5353t == null) {
            return false;
        }
        f(true);
        return true;
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    public final boolean p() {
        if (!this.f5354u) {
            return false;
        }
        v6.a.f(this.f5350i);
        return true;
    }

    public boolean performClick() {
        super.performClick();
        return k();
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.b bVar) {
        v6.a.f(this.f5343b);
        this.f5343b.setAspectRatioListener(bVar);
    }

    public void setControlDispatcher(g gVar) {
        v6.a.f(this.f5350i);
        this.f5350i.setControlDispatcher(gVar);
    }

    public void setControllerAutoShow(boolean z10) {
        this.E = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.F = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        v6.a.f(this.f5350i);
        this.G = z10;
        m();
    }

    public void setControllerShowTimeoutMs(int i10) {
        v6.a.f(this.f5350i);
        this.D = i10;
        if (this.f5350i.e()) {
            i();
        }
    }

    public void setControllerVisibilityListener(b.d dVar) {
        v6.a.f(this.f5350i);
        b.d dVar2 = this.f5355v;
        if (dVar2 != dVar) {
            if (dVar2 != null) {
                this.f5350i.f5402b.remove(dVar2);
            }
            this.f5355v = dVar;
            if (dVar != null) {
                b bVar = this.f5350i;
                bVar.getClass();
                bVar.f5402b.add(dVar);
            }
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        v6.a.d(this.f5349h != null);
        this.C = charSequence;
        n();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f5357x != drawable) {
            this.f5357x = drawable;
            o(false);
        }
    }

    public void setErrorMessageProvider(j<? super m> jVar) {
        if (this.B != jVar) {
            this.B = jVar;
            n();
        }
    }

    @Deprecated
    public void setFastForwardIncrementMs(int i10) {
        v6.a.f(this.f5350i);
        this.f5350i.setFastForwardIncrementMs(i10);
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.f5359z != z10) {
            this.f5359z = z10;
            o(false);
        }
    }

    @Deprecated
    public void setPlaybackPreparer(p0 p0Var) {
        v6.a.f(this.f5350i);
        this.f5350i.setPlaybackPreparer(p0Var);
    }

    public void setPlayer(r0 r0Var) {
        v6.a.d(Looper.myLooper() == Looper.getMainLooper());
        v6.a.a(r0Var == null || r0Var.A() == Looper.getMainLooper());
        r0 r0Var2 = this.f5353t;
        if (r0Var2 != r0Var) {
            if (r0Var2 != null) {
                r0Var2.q(this.f5342a);
                r0.d d10 = r0Var2.d();
                if (d10 != null) {
                    a1 a1Var = (a1) d10;
                    a1Var.f27351e.remove(this.f5342a);
                    View view = this.f5345d;
                    if (view instanceof TextureView) {
                        TextureView textureView = (TextureView) view;
                        a1Var.Y();
                        if (textureView != null && textureView == a1Var.f27368v) {
                            a1Var.V((TextureView) null);
                        }
                    } else if (view instanceof f) {
                        ((f) view).setVideoComponent((r0.d) null);
                    } else if (view instanceof SurfaceView) {
                        a1Var.K((SurfaceView) view);
                    }
                }
                r0.c H2 = r0Var2.H();
                if (H2 != null) {
                    ((a1) H2).f27353g.remove(this.f5342a);
                }
            }
            SubtitleView subtitleView = this.f5347f;
            if (subtitleView != null) {
                subtitleView.setCues((List<h6.b>) null);
            }
            this.f5353t = r0Var;
            if (p()) {
                this.f5350i.setPlayer(r0Var);
            }
            l();
            n();
            o(true);
            if (r0Var != null) {
                r0.d d11 = r0Var.d();
                if (d11 != null) {
                    View view2 = this.f5345d;
                    if (view2 instanceof TextureView) {
                        ((a1) d11).V((TextureView) view2);
                    } else if (view2 instanceof f) {
                        ((f) view2).setVideoComponent(d11);
                    } else if (view2 instanceof SurfaceView) {
                        ((a1) d11).U((SurfaceView) view2);
                    }
                    a aVar = this.f5342a;
                    aVar.getClass();
                    ((a1) d11).f27351e.add(aVar);
                }
                r0.c H3 = r0Var.H();
                if (H3 != null) {
                    a aVar2 = this.f5342a;
                    a1 a1Var2 = (a1) H3;
                    aVar2.getClass();
                    a1Var2.f27353g.add(aVar2);
                    SubtitleView subtitleView2 = this.f5347f;
                    if (subtitleView2 != null) {
                        a1Var2.Y();
                        subtitleView2.setCues(a1Var2.C);
                    }
                }
                r0Var.u(this.f5342a);
                f(false);
                return;
            }
            d();
        }
    }

    public void setRepeatToggleModes(int i10) {
        v6.a.f(this.f5350i);
        this.f5350i.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        v6.a.f(this.f5343b);
        this.f5343b.setResizeMode(i10);
    }

    @Deprecated
    public void setRewindIncrementMs(int i10) {
        v6.a.f(this.f5350i);
        this.f5350i.setRewindIncrementMs(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.f5358y != i10) {
            this.f5358y = i10;
            l();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        v6.a.f(this.f5350i);
        this.f5350i.setShowFastForwardButton(z10);
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        v6.a.f(this.f5350i);
        this.f5350i.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        v6.a.f(this.f5350i);
        this.f5350i.setShowNextButton(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        v6.a.f(this.f5350i);
        this.f5350i.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        v6.a.f(this.f5350i);
        this.f5350i.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        v6.a.f(this.f5350i);
        this.f5350i.setShowShuffleButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f5344c;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setUseArtwork(boolean z10) {
        v6.a.d(!z10 || this.f5346e != null);
        if (this.f5356w != z10) {
            this.f5356w = z10;
            o(false);
        }
    }

    public void setUseController(boolean z10) {
        v6.a.d(!z10 || this.f5350i != null);
        if (this.f5354u != z10) {
            this.f5354u = z10;
            if (p()) {
                this.f5350i.setPlayer(this.f5353t);
            } else {
                b bVar = this.f5350i;
                if (bVar != null) {
                    bVar.c();
                    this.f5350i.setPlayer((r0) null);
                }
            }
            m();
        }
    }

    public void setUseSensorRotation(boolean z10) {
        if (this.A != z10) {
            this.A = z10;
            View view = this.f5345d;
            if (view instanceof f) {
                ((f) view).setUseSensorRotation(z10);
            }
        }
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f5345d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }
}
