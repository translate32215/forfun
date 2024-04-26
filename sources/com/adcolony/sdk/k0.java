package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONObject;
import p.f;

@TargetApi(14)
public class k0 extends TextureView implements MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnSeekCompleteListener, TextureView.SurfaceTextureListener {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public String K;
    public String L;
    public g M;
    public h N;
    public SurfaceTexture O;
    public RectF P = new RectF();
    public b Q;
    public ProgressBar R;
    public MediaPlayer S;

    /* renamed from: a  reason: collision with root package name */
    public float f4576a;

    /* renamed from: a0  reason: collision with root package name */
    public JSONObject f4577a0 = new JSONObject();

    /* renamed from: b  reason: collision with root package name */
    public float f4578b;

    /* renamed from: b0  reason: collision with root package name */
    public ExecutorService f4579b0 = Executors.newSingleThreadExecutor();

    /* renamed from: c  reason: collision with root package name */
    public float f4580c;

    /* renamed from: c0  reason: collision with root package name */
    public g f4581c0;

    /* renamed from: d  reason: collision with root package name */
    public float f4582d;

    /* renamed from: e  reason: collision with root package name */
    public int f4583e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4584f = true;

    /* renamed from: g  reason: collision with root package name */
    public Paint f4585g = new Paint();

    /* renamed from: h  reason: collision with root package name */
    public Paint f4586h = new Paint(1);

    /* renamed from: i  reason: collision with root package name */
    public int f4587i;

    /* renamed from: r  reason: collision with root package name */
    public int f4588r;

    /* renamed from: s  reason: collision with root package name */
    public int f4589s;

    /* renamed from: t  reason: collision with root package name */
    public int f4590t;

    /* renamed from: u  reason: collision with root package name */
    public int f4591u;

    /* renamed from: v  reason: collision with root package name */
    public int f4592v;

    /* renamed from: w  reason: collision with root package name */
    public int f4593w;

    /* renamed from: x  reason: collision with root package name */
    public double f4594x;

    /* renamed from: y  reason: collision with root package name */
    public double f4595y;

    /* renamed from: z  reason: collision with root package name */
    public long f4596z;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            try {
                Thread.sleep(150);
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
            if (k0.this.f4581c0 != null) {
                JSONObject jSONObject = new JSONObject();
                r0.j(jSONObject, "id", k0.this.f4591u);
                r0.e(jSONObject, "ad_session_id", k0.this.L);
                r0.k(jSONObject, "success", true);
                k0.this.f4581c0.a(jSONObject).b();
                k0.this.f4581c0 = null;
            }
        }
    }

    public class b extends View {
        public b(Context context) {
            super(context);
            setWillNotDraw(false);
            Class<b> cls = b.class;
            try {
                cls.getMethod("setLayerType", new Class[]{Integer.TYPE, Paint.class}).invoke(this, new Object[]{1, null});
            } catch (Exception unused) {
            }
        }

        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            k0 k0Var = k0.this;
            canvas.drawArc(k0Var.P, 270.0f, k0Var.f4578b, false, k0Var.f4585g);
            StringBuilder a10 = android.support.v4.media.a.a("");
            a10.append(k0.this.f4583e);
            String sb2 = a10.toString();
            float centerX = k0.this.P.centerX();
            double centerY = (double) k0.this.P.centerY();
            double d10 = (double) k0.this.f4586h.getFontMetrics().bottom;
            Double.isNaN(d10);
            Double.isNaN(d10);
            Double.isNaN(centerY);
            Double.isNaN(centerY);
            canvas.drawText(sb2, centerX, (float) ((d10 * 1.35d) + centerY), k0.this.f4586h);
            invalidate();
        }
    }

    public k0(Context context, g gVar, int i10, h hVar) {
        super(context);
        this.N = hVar;
        this.M = gVar;
        this.f4591u = i10;
        setSurfaceTextureListener(this);
    }

    public static boolean a(k0 k0Var, g gVar) {
        k0Var.getClass();
        JSONObject jSONObject = gVar.f4485b;
        return jSONObject.optInt("id") == k0Var.f4591u && jSONObject.optInt("container_id") == k0Var.N.f4512r && jSONObject.optString("ad_session_id").equals(k0Var.N.f4514t);
    }

    public final void b() {
        JSONObject jSONObject = new JSONObject();
        r0.e(jSONObject, "id", this.L);
        new g("AdSession.on_error", this.N.f4513s, jSONObject).b();
        this.A = true;
    }

    public boolean c() {
        if (!this.E) {
            f.a(0, 1, t2.b.a("ADCVideoView pause() called while MediaPlayer is not prepared."), true);
            return false;
        } else if (!this.C) {
            return false;
        } else {
            this.S.getCurrentPosition();
            this.f4595y = (double) this.S.getDuration();
            this.S.pause();
            this.D = true;
            return true;
        }
    }

    public boolean d() {
        if (!this.E) {
            return false;
        }
        if (!this.D && f.f4481d) {
            this.S.start();
            try {
                this.f4579b0.submit(new l0(this));
            } catch (RejectedExecutionException unused) {
                b();
            }
        } else if (!this.A && f.f4481d) {
            this.S.start();
            this.D = false;
            if (!this.f4579b0.isShutdown()) {
                try {
                    this.f4579b0.submit(new l0(this));
                } catch (RejectedExecutionException unused2) {
                    b();
                }
            }
            b bVar = this.Q;
            if (bVar != null) {
                bVar.invalidate();
            }
        }
        setWillNotDraw(false);
        return true;
    }

    public void e() {
        f.a(0, 2, t2.b.a("MediaPlayer stopped and released."), true);
        try {
            if (!this.A && this.E && this.S.isPlaying()) {
                this.S.stop();
            }
        } catch (IllegalStateException unused) {
            f.a(0, 1, t2.b.a("Caught IllegalStateException when calling stop on MediaPlayer"), true);
        }
        ProgressBar progressBar = this.R;
        if (progressBar != null) {
            this.N.removeView(progressBar);
        }
        this.A = true;
        this.E = false;
        this.S.release();
    }

    public final void f() {
        double d10 = (double) this.f4589s;
        double d11 = (double) this.f4592v;
        Double.isNaN(d10);
        Double.isNaN(d11);
        double d12 = d10 / d11;
        double d13 = (double) this.f4590t;
        double d14 = (double) this.f4593w;
        Double.isNaN(d13);
        Double.isNaN(d14);
        double min = Math.min(d12, d13 / d14);
        double d15 = (double) this.f4592v;
        Double.isNaN(d15);
        int i10 = (int) (d15 * min);
        double d16 = (double) this.f4593w;
        Double.isNaN(d16);
        int i11 = (int) (d16 * min);
        f.a(0, 2, "setMeasuredDimension to " + i10 + " by " + i11, true);
        setMeasuredDimension(i10, i11);
        if (this.G) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams.width = i10;
            layoutParams.height = i11;
            layoutParams.gravity = 17;
            layoutParams.setMargins(0, 0, 0, 0);
            setLayoutParams(layoutParams);
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        this.A = true;
        this.f4594x = this.f4595y;
        r0.j(this.f4577a0, "id", this.f4591u);
        r0.j(this.f4577a0, "container_id", this.N.f4512r);
        r0.e(this.f4577a0, "ad_session_id", this.L);
        r0.d(this.f4577a0, "elapsed", this.f4594x);
        r0.d(this.f4577a0, "duration", this.f4595y);
        new g("VideoView.on_progress", this.N.f4513s, this.f4577a0).b();
    }

    public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MediaPlayer error: " + i10 + "," + i11);
        f.a(0, 0, sb2.toString(), false);
        return true;
    }

    public void onMeasure(int i10, int i11) {
        f();
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        this.E = true;
        if (this.J) {
            this.N.removeView(this.R);
        }
        if (this.G) {
            this.f4592v = mediaPlayer.getVideoWidth();
            this.f4593w = mediaPlayer.getVideoHeight();
            f();
            f.d().l().e(0, 2, "MediaPlayer getVideoWidth = " + mediaPlayer.getVideoWidth(), true);
            f.a(0, 2, "MediaPlayer getVideoHeight = " + mediaPlayer.getVideoHeight(), true);
        }
        JSONObject jSONObject = new JSONObject();
        r0.j(jSONObject, "id", this.f4591u);
        r0.j(jSONObject, "container_id", this.N.f4512r);
        r0.e(jSONObject, "ad_session_id", this.L);
        new g("VideoView.on_ready", this.N.f4513s, jSONObject).b();
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
        ExecutorService executorService = this.f4579b0;
        if (executorService != null && !executorService.isShutdown()) {
            try {
                this.f4579b0.submit(new a());
            } catch (RejectedExecutionException unused) {
                b();
            }
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture == null || this.F) {
            f.a(0, 0, j.f.a("Null texture provided by system's onSurfaceTextureAvailable or ", "MediaPlayer has been destroyed."), true);
            return;
        }
        try {
            this.S.setSurface(new Surface(surfaceTexture));
        } catch (IllegalStateException unused) {
            f.d().l().e(0, 0, t2.b.a("IllegalStateException thrown when calling MediaPlayer.setSurface()"), false);
            b();
        }
        this.O = surfaceTexture;
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.O = surfaceTexture;
        if (!this.F) {
            return false;
        }
        surfaceTexture.release();
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.O = surfaceTexture;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.O = surfaceTexture;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        o d10 = f.d();
        i g10 = d10.g();
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        JSONObject jSONObject = new JSONObject();
        r0.j(jSONObject, "view_id", this.f4591u);
        r0.e(jSONObject, "ad_session_id", this.L);
        r0.j(jSONObject, "container_x", this.f4587i + x10);
        r0.j(jSONObject, "container_y", this.f4588r + y10);
        r0.j(jSONObject, "view_x", x10);
        r0.j(jSONObject, "view_y", y10);
        r0.j(jSONObject, "id", this.N.f4512r);
        if (action == 0) {
            new g("AdContainer.on_touch_began", this.N.f4513s, jSONObject).b();
        } else if (action == 1) {
            if (!this.N.C) {
                d10.f4669m = g10.f4528d.get(this.L);
            }
            new g("AdContainer.on_touch_ended", this.N.f4513s, jSONObject).b();
        } else if (action == 2) {
            new g("AdContainer.on_touch_moved", this.N.f4513s, jSONObject).b();
        } else if (action == 3) {
            new g("AdContainer.on_touch_cancelled", this.N.f4513s, jSONObject).b();
        } else if (action == 5) {
            int action2 = (motionEvent.getAction() & 65280) >> 8;
            r0.j(jSONObject, "container_x", ((int) motionEvent2.getX(action2)) + this.f4587i);
            r0.j(jSONObject, "container_y", ((int) motionEvent2.getY(action2)) + this.f4588r);
            r0.j(jSONObject, "view_x", (int) motionEvent2.getX(action2));
            r0.j(jSONObject, "view_y", (int) motionEvent2.getY(action2));
            new g("AdContainer.on_touch_began", this.N.f4513s, jSONObject).b();
        } else if (action == 6) {
            int action3 = (motionEvent.getAction() & 65280) >> 8;
            r0.j(jSONObject, "container_x", ((int) motionEvent2.getX(action3)) + this.f4587i);
            r0.j(jSONObject, "container_y", ((int) motionEvent2.getY(action3)) + this.f4588r);
            r0.j(jSONObject, "view_x", (int) motionEvent2.getX(action3));
            r0.j(jSONObject, "view_y", (int) motionEvent2.getY(action3));
            if (!this.N.C) {
                d10.f4669m = g10.f4528d.get(this.L);
            }
            new g("AdContainer.on_touch_ended", this.N.f4513s, jSONObject).b();
        }
        return true;
    }
}
