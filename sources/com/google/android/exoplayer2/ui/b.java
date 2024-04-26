package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.f;
import com.google.android.exoplayer2.ui.d;
import com.startapp.startappsdk.R;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import r6.l;
import v6.e0;
import x4.c1;
import x4.g;
import x4.h;
import x4.m;
import x4.o0;
import x4.p0;
import x4.q0;
import x4.r0;
import x4.z;
import z5.g0;

/* compiled from: PlayerControlView */
public class b extends FrameLayout {

    /* renamed from: r0  reason: collision with root package name */
    public static final /* synthetic */ int f5399r0 = 0;
    public final Runnable A;
    public final Runnable B;
    public final Drawable C;
    public final Drawable D;
    public final Drawable E;
    public final String F;
    public final String G;
    public final String H;
    public final Drawable I;
    public final Drawable J;
    public final float K;
    public final float L;
    public final String M;
    public final String N;
    public r0 O;
    public g P;
    public c Q;
    public p0 R;
    public boolean S;

    /* renamed from: a  reason: collision with root package name */
    public final C0079b f5400a;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f5401a0;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList<d> f5402b;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f5403b0;

    /* renamed from: c  reason: collision with root package name */
    public final View f5404c;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f5405c0;

    /* renamed from: d  reason: collision with root package name */
    public final View f5406d;

    /* renamed from: d0  reason: collision with root package name */
    public int f5407d0 = 5000;

    /* renamed from: e  reason: collision with root package name */
    public final View f5408e;

    /* renamed from: e0  reason: collision with root package name */
    public int f5409e0 = 200;

    /* renamed from: f  reason: collision with root package name */
    public final View f5410f;

    /* renamed from: f0  reason: collision with root package name */
    public int f5411f0 = 0;

    /* renamed from: g  reason: collision with root package name */
    public final View f5412g;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f5413g0 = true;

    /* renamed from: h  reason: collision with root package name */
    public final View f5414h;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f5415h0 = true;

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f5416i;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f5417i0 = true;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f5418j0 = true;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f5419k0 = false;

    /* renamed from: l0  reason: collision with root package name */
    public long f5420l0 = -9223372036854775807L;

    /* renamed from: m0  reason: collision with root package name */
    public long[] f5421m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean[] f5422n0;

    /* renamed from: o0  reason: collision with root package name */
    public long[] f5423o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean[] f5424p0;

    /* renamed from: q0  reason: collision with root package name */
    public long f5425q0;

    /* renamed from: r  reason: collision with root package name */
    public final ImageView f5426r;

    /* renamed from: s  reason: collision with root package name */
    public final View f5427s;

    /* renamed from: t  reason: collision with root package name */
    public final TextView f5428t;

    /* renamed from: u  reason: collision with root package name */
    public final TextView f5429u;

    /* renamed from: v  reason: collision with root package name */
    public final d f5430v;

    /* renamed from: w  reason: collision with root package name */
    public final StringBuilder f5431w;

    /* renamed from: x  reason: collision with root package name */
    public final Formatter f5432x;

    /* renamed from: y  reason: collision with root package name */
    public final c1.b f5433y;

    /* renamed from: z  reason: collision with root package name */
    public final c1.c f5434z;

    /* renamed from: com.google.android.exoplayer2.ui.b$b  reason: collision with other inner class name */
    /* compiled from: PlayerControlView */
    public final class C0079b implements r0.a, d.a, View.OnClickListener {
        public C0079b(a aVar) {
        }

        public /* synthetic */ void C(int i10) {
            q0.j(this, i10);
        }

        public /* synthetic */ void D(boolean z10, int i10) {
            q0.h(this, z10, i10);
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

        public /* synthetic */ void Q(g0 g0Var, l lVar) {
            q0.u(this, g0Var, lVar);
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

        public void a(d dVar, long j10) {
            b bVar = b.this;
            TextView textView = bVar.f5429u;
            if (textView != null) {
                textView.setText(e0.B(bVar.f5431w, bVar.f5432x, j10));
            }
        }

        public /* synthetic */ void b(int i10) {
            q0.k(this, i10);
        }

        public /* synthetic */ void c(boolean z10, int i10) {
            q0.m(this, z10, i10);
        }

        public void d(d dVar, long j10) {
            b bVar = b.this;
            bVar.f5405c0 = true;
            TextView textView = bVar.f5429u;
            if (textView != null) {
                textView.setText(e0.B(bVar.f5431w, bVar.f5432x, j10));
            }
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

        public void h(d dVar, long j10, boolean z10) {
            r0 r0Var;
            b bVar = b.this;
            int i10 = 0;
            bVar.f5405c0 = false;
            if (!z10 && (r0Var = bVar.O) != null) {
                c1 z11 = r0Var.z();
                if (bVar.f5403b0 && !z11.q()) {
                    int p10 = z11.p();
                    while (true) {
                        long b10 = z11.n(i10, bVar.f5434z).b();
                        if (j10 < b10) {
                            break;
                        } else if (i10 == p10 - 1) {
                            j10 = b10;
                            break;
                        } else {
                            j10 -= b10;
                            i10++;
                        }
                    }
                } else {
                    i10 = r0Var.D();
                }
                ((h) bVar.P).getClass();
                r0Var.i(i10, j10);
            }
        }

        public void k(r0 r0Var, r0.b bVar) {
            if (bVar.b(5, 6)) {
                b.this.k();
            }
            if (bVar.b(5, 6, 8)) {
                b.this.l();
            }
            if (bVar.a(9)) {
                b.this.m();
            }
            if (bVar.a(10)) {
                b.this.n();
            }
            if (bVar.b(9, 10, 12, 0)) {
                b.this.j();
            }
            if (bVar.b(12, 0)) {
                b.this.o();
            }
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

        /* JADX WARNING: Removed duplicated region for block: B:40:0x008b A[LOOP:0: B:26:0x006c->B:40:0x008b, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0089 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r9) {
            /*
                r8 = this;
                com.google.android.exoplayer2.ui.b r0 = com.google.android.exoplayer2.ui.b.this
                x4.r0 r1 = r0.O
                if (r1 != 0) goto L_0x0007
                return
            L_0x0007:
                android.view.View r2 = r0.f5406d
                if (r2 != r9) goto L_0x0014
                x4.g r9 = r0.P
                x4.h r9 = (x4.h) r9
                r9.b(r1)
                goto L_0x00aa
            L_0x0014:
                android.view.View r2 = r0.f5404c
                if (r2 != r9) goto L_0x0021
                x4.g r9 = r0.P
                x4.h r9 = (x4.h) r9
                r9.c(r1)
                goto L_0x00aa
            L_0x0021:
                android.view.View r2 = r0.f5412g
                if (r2 != r9) goto L_0x0037
                int r9 = r1.W()
                r0 = 4
                if (r9 == r0) goto L_0x00aa
                com.google.android.exoplayer2.ui.b r9 = com.google.android.exoplayer2.ui.b.this
                x4.g r9 = r9.P
                x4.h r9 = (x4.h) r9
                r9.a(r1)
                goto L_0x00aa
            L_0x0037:
                android.view.View r2 = r0.f5414h
                if (r2 != r9) goto L_0x0044
                x4.g r9 = r0.P
                x4.h r9 = (x4.h) r9
                r9.d(r1)
                goto L_0x00aa
            L_0x0044:
                android.view.View r2 = r0.f5408e
                if (r2 != r9) goto L_0x004c
                r0.b(r1)
                goto L_0x00aa
            L_0x004c:
                android.view.View r2 = r0.f5410f
                r3 = 0
                if (r2 != r9) goto L_0x005c
                x4.g r9 = r0.P
                x4.h r9 = (x4.h) r9
                r9.getClass()
                r1.c(r3)
                goto L_0x00aa
            L_0x005c:
                android.widget.ImageView r2 = r0.f5416i
                r4 = 1
                if (r2 != r9) goto L_0x0097
                x4.g r9 = r0.P
                int r0 = r1.y()
                com.google.android.exoplayer2.ui.b r2 = com.google.android.exoplayer2.ui.b.this
                int r2 = r2.f5411f0
                r5 = 1
            L_0x006c:
                r6 = 2
                if (r5 > r6) goto L_0x008e
                int r7 = r0 + r5
                int r7 = r7 % 3
                if (r7 == 0) goto L_0x0086
                if (r7 == r4) goto L_0x007f
                if (r7 == r6) goto L_0x007a
                goto L_0x0084
            L_0x007a:
                r6 = r2 & 2
                if (r6 == 0) goto L_0x0084
                goto L_0x0086
            L_0x007f:
                r6 = r2 & 1
                if (r6 == 0) goto L_0x0084
                goto L_0x0086
            L_0x0084:
                r6 = 0
                goto L_0x0087
            L_0x0086:
                r6 = 1
            L_0x0087:
                if (r6 == 0) goto L_0x008b
                r0 = r7
                goto L_0x008e
            L_0x008b:
                int r5 = r5 + 1
                goto L_0x006c
            L_0x008e:
                x4.h r9 = (x4.h) r9
                r9.getClass()
                r1.s(r0)
                goto L_0x00aa
            L_0x0097:
                android.widget.ImageView r2 = r0.f5426r
                if (r2 != r9) goto L_0x00aa
                x4.g r9 = r0.P
                boolean r0 = r1.B()
                r0 = r0 ^ r4
                x4.h r9 = (x4.h) r9
                r9.getClass()
                r1.l(r0)
            L_0x00aa:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.b.C0079b.onClick(android.view.View):void");
        }

        public /* synthetic */ void p(boolean z10) {
            q0.d(this, z10);
        }

        public /* synthetic */ void q() {
            q0.p(this);
        }

        public /* synthetic */ void r(x4.e0 e0Var, int i10) {
            q0.g(this, e0Var, i10);
        }
    }

    /* compiled from: PlayerControlView */
    public interface c {
        void a(long j10, long j11);
    }

    /* compiled from: PlayerControlView */
    public interface d {
        void x(int i10);
    }

    static {
        z.a("goog.exo.ui");
    }

    public b(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2) {
        super(context, (AttributeSet) null, i10);
        int i11 = 5000;
        int i12 = R.layout.exo_player_control_view;
        int i13 = 15000;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, s6.c.f24969c, 0, 0);
            try {
                i11 = obtainStyledAttributes.getInt(10, 5000);
                i13 = obtainStyledAttributes.getInt(6, 15000);
                this.f5407d0 = obtainStyledAttributes.getInt(21, this.f5407d0);
                i12 = obtainStyledAttributes.getResourceId(5, R.layout.exo_player_control_view);
                this.f5411f0 = obtainStyledAttributes.getInt(9, this.f5411f0);
                this.f5413g0 = obtainStyledAttributes.getBoolean(19, this.f5413g0);
                this.f5415h0 = obtainStyledAttributes.getBoolean(16, this.f5415h0);
                this.f5417i0 = obtainStyledAttributes.getBoolean(18, this.f5417i0);
                this.f5418j0 = obtainStyledAttributes.getBoolean(17, this.f5418j0);
                this.f5419k0 = obtainStyledAttributes.getBoolean(20, this.f5419k0);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(22, this.f5409e0));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f5402b = new CopyOnWriteArrayList<>();
        this.f5433y = new c1.b();
        this.f5434z = new c1.c();
        StringBuilder sb2 = new StringBuilder();
        this.f5431w = sb2;
        this.f5432x = new Formatter(sb2, Locale.getDefault());
        this.f5421m0 = new long[0];
        this.f5422n0 = new boolean[0];
        this.f5423o0 = new long[0];
        this.f5424p0 = new boolean[0];
        C0079b bVar = new C0079b((a) null);
        this.f5400a = bVar;
        this.P = new h((long) i13, (long) i11);
        this.A = new androidx.activity.c(this);
        this.B = new f(this);
        LayoutInflater.from(context).inflate(i12, this);
        setDescendantFocusability(262144);
        d dVar = (d) findViewById(R.id.exo_progress);
        View findViewById = findViewById(R.id.exo_progress_placeholder);
        if (dVar != null) {
            this.f5430v = dVar;
        } else if (findViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, (AttributeSet) null, 0, attributeSet2);
            defaultTimeBar.setId(R.id.exo_progress);
            defaultTimeBar.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            this.f5430v = defaultTimeBar;
        } else {
            this.f5430v = null;
        }
        this.f5428t = (TextView) findViewById(R.id.exo_duration);
        this.f5429u = (TextView) findViewById(R.id.exo_position);
        d dVar2 = this.f5430v;
        if (dVar2 != null) {
            dVar2.b(bVar);
        }
        View findViewById2 = findViewById(R.id.exo_play);
        this.f5408e = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(bVar);
        }
        View findViewById3 = findViewById(R.id.exo_pause);
        this.f5410f = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(bVar);
        }
        View findViewById4 = findViewById(R.id.exo_prev);
        this.f5404c = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(bVar);
        }
        View findViewById5 = findViewById(R.id.exo_next);
        this.f5406d = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(bVar);
        }
        View findViewById6 = findViewById(R.id.exo_rew);
        this.f5414h = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(bVar);
        }
        View findViewById7 = findViewById(R.id.exo_ffwd);
        this.f5412g = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(bVar);
        }
        ImageView imageView = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.f5416i = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(bVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_shuffle);
        this.f5426r = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(bVar);
        }
        View findViewById8 = findViewById(R.id.exo_vr);
        this.f5427s = findViewById8;
        setShowVrButton(false);
        i(false, false, findViewById8);
        Resources resources = context.getResources();
        this.K = ((float) resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled)) / 100.0f;
        this.L = ((float) resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled)) / 100.0f;
        this.C = resources.getDrawable(R.drawable.exo_controls_repeat_off);
        this.D = resources.getDrawable(R.drawable.exo_controls_repeat_one);
        this.E = resources.getDrawable(R.drawable.exo_controls_repeat_all);
        this.I = resources.getDrawable(R.drawable.exo_controls_shuffle_on);
        this.J = resources.getDrawable(R.drawable.exo_controls_shuffle_off);
        this.F = resources.getString(R.string.exo_controls_repeat_off_description);
        this.G = resources.getString(R.string.exo_controls_repeat_one_description);
        this.H = resources.getString(R.string.exo_controls_repeat_all_description);
        this.M = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.N = resources.getString(R.string.exo_controls_shuffle_off_description);
    }

    public boolean a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        r0 r0Var = this.O;
        if (r0Var != null) {
            if (keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88) {
                if (keyEvent.getAction() == 0) {
                    if (keyCode == 90) {
                        if (r0Var.W() != 4) {
                            ((h) this.P).a(r0Var);
                        }
                    } else if (keyCode == 89) {
                        ((h) this.P).d(r0Var);
                    } else if (keyEvent.getRepeatCount() == 0) {
                        if (keyCode == 79 || keyCode == 85) {
                            int W = r0Var.W();
                            if (W == 1 || W == 4 || !r0Var.k()) {
                                b(r0Var);
                            } else {
                                ((h) this.P).getClass();
                                r0Var.c(false);
                            }
                        } else if (keyCode == 87) {
                            ((h) this.P).b(r0Var);
                        } else if (keyCode == 88) {
                            ((h) this.P).c(r0Var);
                        } else if (keyCode == 126) {
                            b(r0Var);
                        } else if (keyCode == 127) {
                            ((h) this.P).getClass();
                            r0Var.c(false);
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void b(r0 r0Var) {
        int W = r0Var.W();
        if (W == 1) {
            p0 p0Var = this.R;
            if (p0Var != null) {
                p0Var.o();
            } else {
                ((h) this.P).getClass();
                r0Var.b();
            }
        } else if (W == 4) {
            int D2 = r0Var.D();
            ((h) this.P).getClass();
            r0Var.i(D2, -9223372036854775807L);
        }
        ((h) this.P).getClass();
        r0Var.c(true);
    }

    public void c() {
        if (e()) {
            setVisibility(8);
            Iterator<d> it = this.f5402b.iterator();
            while (it.hasNext()) {
                it.next().x(getVisibility());
            }
            removeCallbacks(this.A);
            removeCallbacks(this.B);
            this.f5420l0 = -9223372036854775807L;
        }
    }

    public final void d() {
        removeCallbacks(this.B);
        if (this.f5407d0 > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            int i10 = this.f5407d0;
            this.f5420l0 = uptimeMillis + ((long) i10);
            if (this.S) {
                postDelayed(this.B, (long) i10);
                return;
            }
            return;
        }
        this.f5420l0 = -9223372036854775807L;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.B);
        } else if (motionEvent.getAction() == 1) {
            d();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean e() {
        return getVisibility() == 0;
    }

    public final void f() {
        View view;
        View view2;
        boolean g10 = g();
        if (!g10 && (view2 = this.f5408e) != null) {
            view2.requestFocus();
        } else if (g10 && (view = this.f5410f) != null) {
            view.requestFocus();
        }
    }

    public final boolean g() {
        r0 r0Var = this.O;
        if (r0Var == null || r0Var.W() == 4 || this.O.W() == 1 || !this.O.k()) {
            return false;
        }
        return true;
    }

    public r0 getPlayer() {
        return this.O;
    }

    public int getRepeatToggleModes() {
        return this.f5411f0;
    }

    public boolean getShowShuffleButton() {
        return this.f5419k0;
    }

    public int getShowTimeoutMs() {
        return this.f5407d0;
    }

    public boolean getShowVrButton() {
        View view = this.f5427s;
        return view != null && view.getVisibility() == 0;
    }

    public final void h() {
        k();
        j();
        m();
        n();
        o();
    }

    public final void i(boolean z10, boolean z11, View view) {
        if (view != null) {
            view.setEnabled(z11);
            view.setAlpha(z11 ? this.K : this.L);
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r8 = this;
            boolean r0 = r8.e()
            if (r0 == 0) goto L_0x009e
            boolean r0 = r8.S
            if (r0 != 0) goto L_0x000c
            goto L_0x009e
        L_0x000c:
            x4.r0 r0 = r8.O
            r1 = 0
            if (r0 == 0) goto L_0x0077
            x4.c1 r2 = r0.z()
            boolean r3 = r2.q()
            if (r3 != 0) goto L_0x0077
            boolean r3 = r0.e()
            if (r3 != 0) goto L_0x0077
            int r3 = r0.D()
            x4.c1$c r4 = r8.f5434z
            r2.n(r3, r4)
            x4.c1$c r2 = r8.f5434z
            boolean r3 = r2.f27477h
            r4 = 1
            if (r3 != 0) goto L_0x0040
            boolean r2 = r2.c()
            if (r2 == 0) goto L_0x0040
            boolean r2 = r0.hasPrevious()
            if (r2 == 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r2 = 0
            goto L_0x0041
        L_0x0040:
            r2 = 1
        L_0x0041:
            if (r3 == 0) goto L_0x004f
            x4.g r5 = r8.P
            x4.h r5 = (x4.h) r5
            boolean r5 = r5.f()
            if (r5 == 0) goto L_0x004f
            r5 = 1
            goto L_0x0050
        L_0x004f:
            r5 = 0
        L_0x0050:
            if (r3 == 0) goto L_0x005e
            x4.g r6 = r8.P
            x4.h r6 = (x4.h) r6
            boolean r6 = r6.e()
            if (r6 == 0) goto L_0x005e
            r6 = 1
            goto L_0x005f
        L_0x005e:
            r6 = 0
        L_0x005f:
            x4.c1$c r7 = r8.f5434z
            boolean r7 = r7.c()
            if (r7 == 0) goto L_0x006d
            x4.c1$c r7 = r8.f5434z
            boolean r7 = r7.f27478i
            if (r7 != 0) goto L_0x0073
        L_0x006d:
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x0074
        L_0x0073:
            r1 = 1
        L_0x0074:
            r0 = r1
            r1 = r2
            goto L_0x007b
        L_0x0077:
            r0 = 0
            r3 = 0
            r5 = 0
            r6 = 0
        L_0x007b:
            boolean r2 = r8.f5417i0
            android.view.View r4 = r8.f5404c
            r8.i(r2, r1, r4)
            boolean r1 = r8.f5413g0
            android.view.View r2 = r8.f5414h
            r8.i(r1, r5, r2)
            boolean r1 = r8.f5415h0
            android.view.View r2 = r8.f5412g
            r8.i(r1, r6, r2)
            boolean r1 = r8.f5418j0
            android.view.View r2 = r8.f5406d
            r8.i(r1, r0, r2)
            com.google.android.exoplayer2.ui.d r0 = r8.f5430v
            if (r0 == 0) goto L_0x009e
            r0.setEnabled(r3)
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.b.j():void");
    }

    public final void k() {
        boolean z10;
        if (e() && this.S) {
            boolean g10 = g();
            View view = this.f5408e;
            int i10 = 8;
            boolean z11 = true;
            if (view != null) {
                z10 = (g10 && view.isFocused()) | false;
                this.f5408e.setVisibility(g10 ? 8 : 0);
            } else {
                z10 = false;
            }
            View view2 = this.f5410f;
            if (view2 != null) {
                if (g10 || !view2.isFocused()) {
                    z11 = false;
                }
                z10 |= z11;
                View view3 = this.f5410f;
                if (g10) {
                    i10 = 0;
                }
                view3.setVisibility(i10);
            }
            if (z10) {
                f();
            }
        }
    }

    public final void l() {
        long j10;
        int i10;
        if (e() && this.S) {
            r0 r0Var = this.O;
            long j11 = 0;
            if (r0Var != null) {
                j11 = this.f5425q0 + r0Var.g();
                j10 = this.f5425q0 + r0Var.C();
            } else {
                j10 = 0;
            }
            TextView textView = this.f5429u;
            if (textView != null && !this.f5405c0) {
                textView.setText(e0.B(this.f5431w, this.f5432x, j11));
            }
            d dVar = this.f5430v;
            if (dVar != null) {
                dVar.setPosition(j11);
                this.f5430v.setBufferedPosition(j10);
            }
            c cVar = this.Q;
            if (cVar != null) {
                cVar.a(j11, j10);
            }
            removeCallbacks(this.A);
            if (r0Var == null) {
                i10 = 1;
            } else {
                i10 = r0Var.W();
            }
            long j12 = 1000;
            if (r0Var != null && r0Var.n()) {
                d dVar2 = this.f5430v;
                long min = Math.min(dVar2 != null ? dVar2.getPreferredUpdateDelay() : 1000, 1000 - (j11 % 1000));
                float f10 = r0Var.f().f27700a;
                if (f10 > 0.0f) {
                    j12 = (long) (((float) min) / f10);
                }
                postDelayed(this.A, e0.j(j12, (long) this.f5409e0, 1000));
            } else if (i10 != 4 && i10 != 1) {
                postDelayed(this.A, 1000);
            }
        }
    }

    public final void m() {
        ImageView imageView;
        if (e() && this.S && (imageView = this.f5416i) != null) {
            if (this.f5411f0 == 0) {
                i(false, false, imageView);
                return;
            }
            r0 r0Var = this.O;
            if (r0Var == null) {
                i(true, false, imageView);
                this.f5416i.setImageDrawable(this.C);
                this.f5416i.setContentDescription(this.F);
                return;
            }
            i(true, true, imageView);
            int y10 = r0Var.y();
            if (y10 == 0) {
                this.f5416i.setImageDrawable(this.C);
                this.f5416i.setContentDescription(this.F);
            } else if (y10 == 1) {
                this.f5416i.setImageDrawable(this.D);
                this.f5416i.setContentDescription(this.G);
            } else if (y10 == 2) {
                this.f5416i.setImageDrawable(this.E);
                this.f5416i.setContentDescription(this.H);
            }
            this.f5416i.setVisibility(0);
        }
    }

    public final void n() {
        ImageView imageView;
        String str;
        if (e() && this.S && (imageView = this.f5426r) != null) {
            r0 r0Var = this.O;
            if (!this.f5419k0) {
                i(false, false, imageView);
            } else if (r0Var == null) {
                i(true, false, imageView);
                this.f5426r.setImageDrawable(this.J);
                this.f5426r.setContentDescription(this.N);
            } else {
                i(true, true, imageView);
                this.f5426r.setImageDrawable(r0Var.B() ? this.I : this.J);
                ImageView imageView2 = this.f5426r;
                if (r0Var.B()) {
                    str = this.M;
                } else {
                    str = this.N;
                }
                imageView2.setContentDescription(str);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o() {
        /*
            r21 = this;
            r0 = r21
            x4.r0 r1 = r0.O
            if (r1 != 0) goto L_0x0007
            return
        L_0x0007:
            boolean r2 = r0.f5401a0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r2 == 0) goto L_0x003b
            x4.c1 r2 = r1.z()
            x4.c1$c r7 = r0.f5434z
            int r8 = r2.p()
            r9 = 100
            if (r8 <= r9) goto L_0x0020
            goto L_0x0031
        L_0x0020:
            int r8 = r2.p()
            r9 = 0
        L_0x0025:
            if (r9 >= r8) goto L_0x0036
            x4.c1$c r10 = r2.n(r9, r7)
            long r10 = r10.f27485p
            int r12 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r12 != 0) goto L_0x0033
        L_0x0031:
            r2 = 0
            goto L_0x0037
        L_0x0033:
            int r9 = r9 + 1
            goto L_0x0025
        L_0x0036:
            r2 = 1
        L_0x0037:
            if (r2 == 0) goto L_0x003b
            r2 = 1
            goto L_0x003c
        L_0x003b:
            r2 = 0
        L_0x003c:
            r0.f5403b0 = r2
            r7 = 0
            r0.f5425q0 = r7
            x4.c1 r2 = r1.z()
            boolean r9 = r2.q()
            if (r9 != 0) goto L_0x011d
            int r1 = r1.D()
            boolean r9 = r0.f5403b0
            if (r9 == 0) goto L_0x0056
            r10 = 0
            goto L_0x0057
        L_0x0056:
            r10 = r1
        L_0x0057:
            if (r9 == 0) goto L_0x005f
            int r9 = r2.p()
            int r9 = r9 - r6
            goto L_0x0060
        L_0x005f:
            r9 = r1
        L_0x0060:
            r11 = r7
            r13 = 0
        L_0x0062:
            if (r10 > r9) goto L_0x011b
            if (r10 != r1) goto L_0x006c
            long r14 = x4.f.c(r11)
            r0.f5425q0 = r14
        L_0x006c:
            x4.c1$c r14 = r0.f5434z
            r2.n(r10, r14)
            x4.c1$c r14 = r0.f5434z
            long r7 = r14.f27485p
            int r17 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r17 != 0) goto L_0x0081
            boolean r1 = r0.f5403b0
            r1 = r1 ^ r6
            v6.a.d(r1)
            goto L_0x011b
        L_0x0081:
            int r7 = r14.f27482m
        L_0x0083:
            x4.c1$c r8 = r0.f5434z
            int r14 = r8.f27483n
            if (r7 > r14) goto L_0x010a
            x4.c1$b r8 = r0.f5433y
            r2.f(r7, r8)
            x4.c1$b r8 = r0.f5433y
            a6.a r8 = r8.f27467f
            int r8 = r8.f114b
            r14 = 0
        L_0x0095:
            if (r14 >= r8) goto L_0x00fd
            x4.c1$b r15 = r0.f5433y
            long r15 = r15.d(r14)
            r18 = -9223372036854775808
            int r20 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r20 != 0) goto L_0x00af
            x4.c1$b r15 = r0.f5433y
            long r5 = r15.f27465d
            int r15 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r15 != 0) goto L_0x00ae
            r5 = 0
            goto L_0x00f3
        L_0x00ae:
            r15 = r5
        L_0x00af:
            x4.c1$b r5 = r0.f5433y
            long r5 = r5.f27466e
            long r15 = r15 + r5
            r5 = 0
            int r17 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r17 < 0) goto L_0x00f3
            long[] r3 = r0.f5421m0
            int r4 = r3.length
            if (r13 != r4) goto L_0x00d5
            int r4 = r3.length
            if (r4 != 0) goto L_0x00c4
            r4 = 1
            goto L_0x00c7
        L_0x00c4:
            int r4 = r3.length
            int r4 = r4 * 2
        L_0x00c7:
            long[] r3 = java.util.Arrays.copyOf(r3, r4)
            r0.f5421m0 = r3
            boolean[] r3 = r0.f5422n0
            boolean[] r3 = java.util.Arrays.copyOf(r3, r4)
            r0.f5422n0 = r3
        L_0x00d5:
            long[] r3 = r0.f5421m0
            long r15 = r15 + r11
            long r15 = x4.f.c(r15)
            r3[r13] = r15
            boolean[] r3 = r0.f5422n0
            x4.c1$b r4 = r0.f5433y
            a6.a r4 = r4.f27467f
            a6.a$a[] r4 = r4.f116d
            r4 = r4[r14]
            boolean r4 = r4.b()
            r15 = 1
            r4 = r4 ^ r15
            r3[r13] = r4
            int r13 = r13 + 1
            goto L_0x00f4
        L_0x00f3:
            r15 = 1
        L_0x00f4:
            int r14 = r14 + 1
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            goto L_0x0095
        L_0x00fd:
            r5 = 0
            r15 = 1
            int r7 = r7 + 1
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            goto L_0x0083
        L_0x010a:
            r5 = 0
            r15 = 1
            long r3 = r8.f27485p
            long r11 = r11 + r3
            int r10 = r10 + 1
            r7 = r5
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            goto L_0x0062
        L_0x011b:
            r7 = r11
            goto L_0x011f
        L_0x011d:
            r5 = r7
            r13 = 0
        L_0x011f:
            long r1 = x4.f.c(r7)
            android.widget.TextView r3 = r0.f5428t
            if (r3 == 0) goto L_0x0132
            java.lang.StringBuilder r4 = r0.f5431w
            java.util.Formatter r5 = r0.f5432x
            java.lang.String r4 = v6.e0.B(r4, r5, r1)
            r3.setText(r4)
        L_0x0132:
            com.google.android.exoplayer2.ui.d r3 = r0.f5430v
            if (r3 == 0) goto L_0x0169
            r3.setDuration(r1)
            long[] r1 = r0.f5423o0
            int r1 = r1.length
            int r2 = r13 + r1
            long[] r3 = r0.f5421m0
            int r4 = r3.length
            if (r2 <= r4) goto L_0x0151
            long[] r3 = java.util.Arrays.copyOf(r3, r2)
            r0.f5421m0 = r3
            boolean[] r3 = r0.f5422n0
            boolean[] r3 = java.util.Arrays.copyOf(r3, r2)
            r0.f5422n0 = r3
        L_0x0151:
            long[] r3 = r0.f5423o0
            long[] r4 = r0.f5421m0
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r4, r13, r1)
            boolean[] r3 = r0.f5424p0
            boolean[] r4 = r0.f5422n0
            java.lang.System.arraycopy(r3, r5, r4, r13, r1)
            com.google.android.exoplayer2.ui.d r1 = r0.f5430v
            long[] r3 = r0.f5421m0
            boolean[] r4 = r0.f5422n0
            r1.a(r3, r4, r2)
        L_0x0169:
            r21.l()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.b.o():void");
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
        long j10 = this.f5420l0;
        if (j10 != -9223372036854775807L) {
            long uptimeMillis = j10 - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                c();
            } else {
                postDelayed(this.B, uptimeMillis);
            }
        } else if (e()) {
            d();
        }
        h();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.S = false;
        removeCallbacks(this.A);
        removeCallbacks(this.B);
    }

    public void setControlDispatcher(g gVar) {
        if (this.P != gVar) {
            this.P = gVar;
            j();
        }
    }

    @Deprecated
    public void setFastForwardIncrementMs(int i10) {
        g gVar = this.P;
        if (gVar instanceof h) {
            ((h) gVar).f27589c = (long) i10;
            j();
        }
    }

    @Deprecated
    public void setPlaybackPreparer(p0 p0Var) {
        this.R = p0Var;
    }

    public void setPlayer(r0 r0Var) {
        boolean z10 = true;
        v6.a.d(Looper.myLooper() == Looper.getMainLooper());
        if (!(r0Var == null || r0Var.A() == Looper.getMainLooper())) {
            z10 = false;
        }
        v6.a.a(z10);
        r0 r0Var2 = this.O;
        if (r0Var2 != r0Var) {
            if (r0Var2 != null) {
                r0Var2.q(this.f5400a);
            }
            this.O = r0Var;
            if (r0Var != null) {
                r0Var.u(this.f5400a);
            }
            h();
        }
    }

    public void setProgressUpdateListener(c cVar) {
        this.Q = cVar;
    }

    public void setRepeatToggleModes(int i10) {
        this.f5411f0 = i10;
        r0 r0Var = this.O;
        if (r0Var != null) {
            int y10 = r0Var.y();
            if (i10 == 0 && y10 != 0) {
                g gVar = this.P;
                r0 r0Var2 = this.O;
                ((h) gVar).getClass();
                r0Var2.s(0);
            } else if (i10 == 1 && y10 == 2) {
                g gVar2 = this.P;
                r0 r0Var3 = this.O;
                ((h) gVar2).getClass();
                r0Var3.s(1);
            } else if (i10 == 2 && y10 == 1) {
                g gVar3 = this.P;
                r0 r0Var4 = this.O;
                ((h) gVar3).getClass();
                r0Var4.s(2);
            }
        }
        m();
    }

    @Deprecated
    public void setRewindIncrementMs(int i10) {
        g gVar = this.P;
        if (gVar instanceof h) {
            ((h) gVar).f27588b = (long) i10;
            j();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        this.f5415h0 = z10;
        j();
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        this.f5401a0 = z10;
        o();
    }

    public void setShowNextButton(boolean z10) {
        this.f5418j0 = z10;
        j();
    }

    public void setShowPreviousButton(boolean z10) {
        this.f5417i0 = z10;
        j();
    }

    public void setShowRewindButton(boolean z10) {
        this.f5413g0 = z10;
        j();
    }

    public void setShowShuffleButton(boolean z10) {
        this.f5419k0 = z10;
        n();
    }

    public void setShowTimeoutMs(int i10) {
        this.f5407d0 = i10;
        if (e()) {
            d();
        }
    }

    public void setShowVrButton(boolean z10) {
        View view = this.f5427s;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.f5409e0 = e0.i(i10, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.f5427s;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            i(getShowVrButton(), onClickListener != null, this.f5427s);
        }
    }
}
