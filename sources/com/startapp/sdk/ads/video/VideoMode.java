package com.startapp.sdk.ads.video;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import com.startapp.a0;
import com.startapp.a6;
import com.startapp.ad;
import com.startapp.b1;
import com.startapp.bd;
import com.startapp.cd;
import com.startapp.dd;
import com.startapp.de;
import com.startapp.ec;
import com.startapp.ed;
import com.startapp.fd;
import com.startapp.g5;
import com.startapp.g6;
import com.startapp.i4;
import com.startapp.j0;
import com.startapp.j4;
import com.startapp.k;
import com.startapp.n5;
import com.startapp.q7;
import com.startapp.qb;
import com.startapp.rc;
import com.startapp.rd;
import com.startapp.re;
import com.startapp.sc;
import com.startapp.sdk.ads.video.d;
import com.startapp.sdk.ads.video.player.NativeVideoPlayer;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface;
import com.startapp.sdk.ads.video.tracking.AbsoluteTrackingLink;
import com.startapp.sdk.ads.video.tracking.ActionTrackingLink;
import com.startapp.sdk.ads.video.tracking.FractionTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoClickedTrackingParams;
import com.startapp.sdk.ads.video.tracking.VideoPausedTrackingParams;
import com.startapp.sdk.ads.video.tracking.VideoProgressTrackingParams;
import com.startapp.sdk.ads.video.tracking.VideoTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoTrackingParams;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationView;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.se;
import com.startapp.uc;
import com.startapp.vc;
import com.startapp.wb;
import com.startapp.wc;
import com.startapp.xc;
import com.startapp.xe;
import com.startapp.yc;
import com.startapp.z;
import com.startapp.zc;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Sta */
public class VideoMode extends g5 {
    public VideoPlayerInterface K;
    public VideoView L;
    public RelativeLayout M;
    public RelativeLayout N;
    public ProgressBar O;
    public boolean P = false;
    public int Q = 0;
    public int R = 0;
    public int S = 0;
    public boolean T;
    public boolean U = false;
    public boolean V = false;
    public boolean W = false;
    public boolean X = false;
    public HashMap<Integer, Boolean> Y = new HashMap<>();
    public HashMap<Integer, Boolean> Z = new HashMap<>();

    /* renamed from: a0  reason: collision with root package name */
    public int f11937a0 = 1;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f11938b0 = false;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f11939c0 = false;

    /* renamed from: d0  reason: collision with root package name */
    public int f11940d0 = 0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f11941e0 = false;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f11942f0 = false;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f11943g0 = false;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f11944h0 = false;

    /* renamed from: i0  reason: collision with root package name */
    public int f11945i0 = 0;

    /* renamed from: j0  reason: collision with root package name */
    public int f11946j0;

    /* renamed from: k0  reason: collision with root package name */
    public String f11947k0 = null;

    /* renamed from: l0  reason: collision with root package name */
    public Handler f11948l0 = new Handler();

    /* renamed from: m0  reason: collision with root package name */
    public Handler f11949m0 = new Handler();

    /* renamed from: n0  reason: collision with root package name */
    public Handler f11950n0 = new Handler();

    /* renamed from: o0  reason: collision with root package name */
    public Handler f11951o0 = new Handler();

    /* renamed from: p0  reason: collision with root package name */
    public final Map<Integer, List<FractionTrackingLink>> f11952p0 = new HashMap();

    /* renamed from: q0  reason: collision with root package name */
    public final Map<Integer, List<AbsoluteTrackingLink>> f11953q0 = new HashMap();

    /* renamed from: r0  reason: collision with root package name */
    public long f11954r0;

    /* renamed from: s0  reason: collision with root package name */
    public long f11955s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f11956t0 = false;

    /* renamed from: u0  reason: collision with root package name */
    public final BroadcastReceiver f11957u0 = new d();

    /* renamed from: v0  reason: collision with root package name */
    public final Runnable f11958v0 = new e();

    /* compiled from: Sta */
    public enum HtmlMode {
        POST_ROLL
    }

    /* compiled from: Sta */
    public enum VideoFinishedReason {
        COMPLETE,
        CLICKED,
        SKIPPED
    }

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f11965a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Handler f11966b;

        public a(int i10, Handler handler) {
            this.f11965a = i10;
            this.f11966b = handler;
        }

        public void run() {
            VideoMode videoMode;
            q7 q7Var;
            VideoMode videoMode2 = VideoMode.this;
            if (videoMode2.K != null) {
                videoMode2.O();
                int i10 = this.f11965a;
                if (i10 > 0 && (q7Var = videoMode.H) != null) {
                    float f10 = (float) i10;
                    float f11 = (videoMode = VideoMode.this).P ? 0.0f : 1.0f;
                    g6 g6Var = q7Var.f11621c;
                    if (g6Var != null) {
                        if (f10 > 0.0f) {
                            g6Var.a(f11);
                            se.a(g6Var.f10451a);
                            JSONObject jSONObject = new JSONObject();
                            de.a(jSONObject, "duration", Float.valueOf(f10));
                            de.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f11));
                            de.a(jSONObject, "deviceVolume", Float.valueOf(xe.a().f12807a));
                            re.f11684a.a(g6Var.f10451a.f11678e.c(), "start", jSONObject);
                        } else {
                            throw new IllegalArgumentException("Invalid Media duration");
                        }
                    }
                }
                VideoMode videoMode3 = VideoMode.this;
                videoMode3.W = true;
                videoMode3.Q();
                this.f11966b.post(VideoMode.this.f11958v0);
            }
        }
    }

    /* compiled from: Sta */
    public class b implements Runnable {
        public b() {
        }

        public void run() {
            try {
                VideoPlayerInterface videoPlayerInterface = VideoMode.this.K;
                if (videoPlayerInterface == null) {
                    return;
                }
                if (((NativeVideoPlayer) videoPlayerInterface).f12016g.getCurrentPosition() > 0) {
                    VideoMode.this.f(0);
                    VideoMode.this.e(0);
                    VideoMode videoMode = VideoMode.this;
                    if (videoMode.E == 0) {
                        videoMode.I();
                        a6.a((Context) VideoMode.this.f10351b).a(new Intent("com.startapp.android.ShowDisplayBroadcastListener").putExtra("dParam", VideoMode.this.a()));
                        return;
                    }
                    return;
                }
                VideoMode videoMode2 = VideoMode.this;
                if (!videoMode2.X) {
                    videoMode2.f11948l0.postDelayed(this, 100);
                }
            } catch (Throwable th) {
                i4.a(th);
                VideoMode.this.b();
            }
        }
    }

    /* compiled from: Sta */
    public class c implements Runnable {

        /* compiled from: Sta */
        public class a implements Runnable {
            public a() {
            }

            public void run() {
                try {
                    VideoMode.this.Q();
                    VideoMode.this.getClass();
                    VideoMode videoMode = VideoMode.this;
                    videoMode.a(new VideoPlayerInterface.e(VideoPlayerInterface.VideoPlayerErrorType.BUFFERING_TIMEOUT, "Buffering timeout reached", videoMode.Q));
                } catch (Throwable th) {
                    i4.a(th);
                }
            }
        }

        public c() {
        }

        public void run() {
            g6 g6Var;
            try {
                VideoMode.this.O.setVisibility(0);
                q7 q7Var = VideoMode.this.H;
                if (!(q7Var == null || (g6Var = q7Var.f11621c) == null)) {
                    se.a(g6Var.f10451a);
                    re.f11684a.a(g6Var.f10451a.f11678e.c(), "bufferStart", (JSONObject) null);
                }
                VideoMode.this.f11951o0.postDelayed(new a(), AdsCommonMetaData.f12098h.G().c());
            } catch (Throwable th) {
                VideoMode.this.Q();
                i4.a(th);
            }
        }
    }

    /* compiled from: Sta */
    public class d extends BroadcastReceiver {
        public d() {
        }

        public void onReceive(Context context, Intent intent) {
            if (!VideoMode.this.f11957u0.isInitialStickyBroadcast()) {
                VideoMode videoMode = VideoMode.this;
                videoMode.P = !videoMode.P;
                videoMode.K();
                VideoMode videoMode2 = VideoMode.this;
                videoMode2.a(videoMode2.P);
            }
        }
    }

    /* compiled from: Sta */
    public class e implements Runnable {
        public e() {
        }

        public void run() {
            VideoMode.this.B();
        }
    }

    /* compiled from: Sta */
    public class f extends g5.g {
        public f() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            VideoMode.this.j();
            VideoMode.this.w();
        }
    }

    public final void A() {
        String e10 = y().e();
        if (e10 != null) {
            this.f10440v.setWebViewClient(new f());
            wb.a(this.f10440v, e10);
            return;
        }
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(this.K != null);
        wb.a(this.f10440v, true, "videoApi.setReplayEnabled", objArr);
        wb.a(this.f10440v, true, "videoApi.setMode", HtmlMode.POST_ROLL + "_" + y().f());
        wb.a(this.f10440v, true, "videoApi.setCloseable", Boolean.TRUE);
    }

    public void B() {
        if (this.W) {
            b((View) this.L);
            if (!H()) {
                wb.a(this.f10440v, true, "videoApi.setClickableVideo", Boolean.valueOf(y().k()));
                wb.a(this.f10440v, true, "videoApi.setMode", "PLAYER");
                Object[] objArr = new Object[1];
                objArr[0] = Boolean.valueOf(y().l() || this.f11939c0);
                wb.a(this.f10440v, true, "videoApi.setCloseable", objArr);
                wb.a(this.f10440v, true, "videoApi.setSkippable", Boolean.valueOf(G()));
            }
        }
    }

    public final void C() {
        FractionTrackingLink[] c10 = y().h().c();
        if (c10 != null) {
            for (FractionTrackingLink fractionTrackingLink : c10) {
                List list = this.f11952p0.get(Integer.valueOf(fractionTrackingLink.e()));
                if (list == null) {
                    list = new ArrayList();
                    this.f11952p0.put(Integer.valueOf(fractionTrackingLink.e()), list);
                }
                list.add(fractionTrackingLink);
            }
        }
        AbsoluteTrackingLink[] a10 = y().h().a();
        if (a10 != null) {
            for (AbsoluteTrackingLink absoluteTrackingLink : a10) {
                List list2 = this.f11953q0.get(Integer.valueOf(absoluteTrackingLink.e()));
                if (list2 == null) {
                    list2 = new ArrayList();
                    this.f11953q0.put(Integer.valueOf(absoluteTrackingLink.e()), list2);
                }
                list2.add(absoluteTrackingLink);
            }
        }
    }

    public boolean D() {
        if (!this.f11941e0) {
            if (!E() || !this.U) {
                return false;
            }
            return true;
        } else if (this.f11940d0 < AdsCommonMetaData.f12098h.G().i() || !E() || !this.U) {
            return false;
        } else {
            return true;
        }
    }

    public boolean E() {
        VideoPlayerInterface videoPlayerInterface = this.K;
        if (videoPlayerInterface != null) {
            if (((NativeVideoPlayer) videoPlayerInterface).f12015f != null) {
                return true;
            }
        }
        return false;
    }

    public boolean F() {
        ProgressBar progressBar = this.O;
        return progressBar != null && progressBar.isShown();
    }

    public final boolean G() {
        return this.E > 0 || y().m() || this.f11938b0;
    }

    public boolean H() {
        return this.Q == -1;
    }

    public void I() {
        this.B.b();
        a(y().h().d(), new VideoTrackingParams(this.f10365p, 0, this.E, this.f11947k0), 0, "impression");
        a(y().h().b(), new VideoTrackingParams(this.f10365p, 0, this.E, this.f11947k0), 0, "creativeView");
        q7 q7Var = this.H;
        if (q7Var != null) {
            q7Var.b();
        }
    }

    public final void J() {
        wb.a(this.f10440v, true, "videoApi.setSkipTimer", Long.valueOf(c(this.Q + 50)));
    }

    public void K() {
        VideoPlayerInterface videoPlayerInterface = this.K;
        if (videoPlayerInterface != null) {
            try {
                boolean z10 = this.P;
                MediaPlayer mediaPlayer = ((NativeVideoPlayer) videoPlayerInterface).f12015f;
                if (mediaPlayer != null) {
                    if (z10) {
                        mediaPlayer.setVolume(0.0f, 0.0f);
                    } else {
                        mediaPlayer.setVolume(1.0f, 1.0f);
                    }
                }
            } catch (Throwable th) {
                i4.a(th);
            }
        }
        Object[] objArr = new Object[1];
        objArr[0] = this.P ? "OFF" : "ON";
        wb.a(this.f10440v, true, "videoApi.setSound", objArr);
    }

    public void L() {
        if (this.K != null) {
            boolean p10 = AdsCommonMetaData.f12098h.G().p();
            String c10 = y().c();
            if (c10 != null) {
                VideoPlayerInterface videoPlayerInterface = this.K;
                if (videoPlayerInterface != null) {
                    ((NativeVideoPlayer) videoPlayerInterface).a(c10);
                }
                if (p10 && c10.endsWith(".temp")) {
                    this.f11941e0 = true;
                    this.f11944h0 = true;
                    this.f11940d0 = AdsCommonMetaData.f12098h.G().i();
                }
            } else if (p10) {
                String i10 = y().i();
                d dVar = d.b.f11993a;
                if (i10 != null && i10.equals(dVar.f11992c)) {
                    dVar.f11990a = false;
                }
                VideoPlayerInterface videoPlayerInterface2 = this.K;
                if (videoPlayerInterface2 != null) {
                    ((NativeVideoPlayer) videoPlayerInterface2).a(i10);
                }
                this.f11941e0 = true;
                N();
            } else {
                a(VideoFinishedReason.SKIPPED);
            }
            if (this.f11947k0 == null) {
                this.f11947k0 = this.f11941e0 ? "2" : "1";
            }
        }
    }

    public int M() {
        int i10;
        VideoPlayerInterface videoPlayerInterface = this.K;
        if (videoPlayerInterface == null) {
            i10 = 0;
        } else if (((NativeVideoPlayer) videoPlayerInterface).f12016g.getCurrentPosition() != ((NativeVideoPlayer) this.K).f12016g.getDuration() || H()) {
            i10 = ((NativeVideoPlayer) this.K).f12016g.getDuration() - ((NativeVideoPlayer) this.K).f12016g.getCurrentPosition();
        } else {
            i10 = ((NativeVideoPlayer) this.K).f12016g.getDuration();
        }
        int i11 = i10 / 1000;
        if (i11 > 0 && i10 % 1000 < 100) {
            i11--;
        }
        wb.a(this.f10440v, true, "videoApi.setVideoRemainingTimer", Integer.valueOf(i11));
        return i10;
    }

    public void N() {
        if (!F()) {
            this.f11951o0.postDelayed(new c(), AdsCommonMetaData.f12098h.G().g());
        }
    }

    public void O() {
        VideoPlayerInterface videoPlayerInterface = this.K;
        if (videoPlayerInterface != null) {
            ((NativeVideoPlayer) videoPlayerInterface).f12016g.start();
            this.f10440v.setBackgroundColor(33554431);
            a((View) null);
        }
    }

    public void P() {
        this.f11943g0 = true;
        VideoPlayerInterface videoPlayerInterface = this.K;
        int i10 = 0;
        wb.a(this.f10440v, true, "videoApi.setVideoDuration", Integer.valueOf(videoPlayerInterface != null ? ((NativeVideoPlayer) videoPlayerInterface).f12016g.getDuration() / 1000 : 0));
        M();
        J();
        wb.a(this.f10440v, true, "videoApi.setVideoCurrentPosition", Integer.valueOf(this.Q / 1000));
        if (H()) {
            VideoPlayerInterface videoPlayerInterface2 = this.K;
            if (videoPlayerInterface2 != null) {
                ((NativeVideoPlayer) videoPlayerInterface2).f12016g.pause();
                return;
            }
            return;
        }
        VideoPlayerInterface videoPlayerInterface3 = this.K;
        int duration = videoPlayerInterface3 != null ? ((NativeVideoPlayer) videoPlayerInterface3).f12016g.getDuration() : 0;
        Handler handler = new Handler();
        a aVar = new a(duration, handler);
        long currentTimeMillis = System.currentTimeMillis() - this.f11954r0;
        long j10 = 0;
        if (this.Q == 0 && this.E == 0 && currentTimeMillis < 500) {
            j10 = Math.max(200, 500 - currentTimeMillis);
        }
        handler.postDelayed(aVar, j10);
        if (this.Q == 0) {
            this.f11948l0.postDelayed(new b(), 100);
        }
        VideoPlayerInterface videoPlayerInterface4 = this.K;
        if (videoPlayerInterface4 != null) {
            i10 = ((NativeVideoPlayer) videoPlayerInterface4).f12016g.getDuration();
        }
        this.S = i10;
        for (Integer intValue : this.f11952p0.keySet()) {
            int intValue2 = intValue.intValue();
            a(d(intValue2), this.f11948l0, new wc(this, intValue2));
        }
        for (Integer intValue3 : this.f11953q0.keySet()) {
            int intValue4 = intValue3.intValue();
            a(intValue4, this.f11948l0, new xc(this, intValue4));
        }
        if (!this.f11941e0) {
            a(d(AdsCommonMetaData.f12098h.G().k()), this.f11950n0, new yc(this));
        }
        this.f11949m0.post(new uc(this));
        J();
        this.f11949m0.post(new vc(this));
        this.f10352c.f12186b.setVisibility(4);
        K();
    }

    public void Q() {
        g6 g6Var;
        this.f11951o0.removeCallbacksAndMessages((Object) null);
        if (F()) {
            this.O.setVisibility(8);
            q7 q7Var = this.H;
            if (q7Var != null && (g6Var = q7Var.f11621c) != null) {
                se.a(g6Var.f10451a);
                re.f11684a.a(g6Var.f10451a.f11678e.c(), "bufferFinish", (JSONObject) null);
            }
        }
    }

    public void R() {
        if (F()) {
            Q();
        }
        a(VideoFinishedReason.SKIPPED);
        a(y().h().p(), new VideoTrackingParams(this.f10365p, b(this.R), this.E, this.f11947k0), this.R, "skipped");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004a A[Catch:{ all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.os.Bundle r4) {
        /*
            r3 = this;
            java.lang.String r0 = "currentPosition"
            super.a((android.os.Bundle) r4)
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0085 }
            r3.f11954r0 = r1     // Catch:{ all -> 0x0085 }
            r1 = 100
            com.startapp.sdk.adsbase.AdsCommonMetaData r2 = com.startapp.sdk.adsbase.AdsCommonMetaData.f12098h     // Catch:{ all -> 0x0085 }
            com.startapp.sdk.adsbase.VideoConfig r2 = r2.G()     // Catch:{ all -> 0x0085 }
            int r2 = r2.h()     // Catch:{ all -> 0x0085 }
            int r1 = r1 / r2
            r3.f11946j0 = r1     // Catch:{ all -> 0x0085 }
            r3.z()     // Catch:{ all -> 0x0085 }
            r3.C()     // Catch:{ all -> 0x0085 }
            com.startapp.sdk.ads.video.VideoAdDetails r1 = r3.y()     // Catch:{ all -> 0x0085 }
            boolean r1 = r1.n()     // Catch:{ all -> 0x0085 }
            if (r1 != 0) goto L_0x003f
            com.startapp.sdk.adsbase.AdsCommonMetaData r1 = com.startapp.sdk.adsbase.AdsCommonMetaData.f12098h     // Catch:{ all -> 0x0085 }
            com.startapp.sdk.adsbase.VideoConfig r1 = r1.G()     // Catch:{ all -> 0x0085 }
            java.lang.String r1 = r1.l()     // Catch:{ all -> 0x0085 }
            java.lang.String r2 = "muted"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0085 }
            if (r1 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r1 = 0
            goto L_0x0040
        L_0x003f:
            r1 = 1
        L_0x0040:
            r3.P = r1     // Catch:{ all -> 0x0085 }
            if (r4 == 0) goto L_0x008f
            boolean r1 = r4.containsKey(r0)     // Catch:{ all -> 0x0085 }
            if (r1 == 0) goto L_0x008f
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x0085 }
            r3.Q = r0     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = "latestPosition"
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x0085 }
            r3.R = r0     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = "fractionProgressImpressionsSent"
            java.io.Serializable r0 = r4.getSerializable(r0)     // Catch:{ all -> 0x0085 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x0085 }
            r3.Y = r0     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = "absoluteProgressImpressionsSent"
            java.io.Serializable r0 = r4.getSerializable(r0)     // Catch:{ all -> 0x0085 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x0085 }
            r3.Z = r0     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = "isMuted"
            boolean r0 = r4.getBoolean(r0)     // Catch:{ all -> 0x0085 }
            r3.P = r0     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = "shouldSetBg"
            boolean r0 = r4.getBoolean(r0)     // Catch:{ all -> 0x0085 }
            r3.T = r0     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = "pauseNum"
            int r4 = r4.getInt(r0)     // Catch:{ all -> 0x0085 }
            r3.f11937a0 = r4     // Catch:{ all -> 0x0085 }
            goto L_0x008f
        L_0x0085:
            r4 = move-exception
            com.startapp.i4.a((java.lang.Throwable) r4)
            r3.x()
            r3.b()
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.video.VideoMode.a(android.os.Bundle):void");
    }

    public void b(WebView webView) {
        this.C = false;
        webView.setOnTouchListener(new g5.d());
        a0.a(webView, (Paint) null);
    }

    public long c(int i10) {
        if (this.f11938b0 || this.E > 0) {
            return 0;
        }
        long g10 = y().g() - ((long) i10);
        if (g10 <= 0) {
            return 0;
        }
        return (g10 / 1000) + 1;
    }

    public int d(int i10) {
        return (this.S * i10) / 100;
    }

    public void e() {
        g6 g6Var;
        if (!H() && !this.f10351b.isFinishing() && !this.f11939c0 && !this.f11938b0) {
            VideoPausedTrackingParams.PauseOrigin pauseOrigin = VideoPausedTrackingParams.PauseOrigin.EXTERNAL;
            VideoPlayerInterface videoPlayerInterface = this.K;
            if (videoPlayerInterface != null) {
                int currentPosition = ((NativeVideoPlayer) videoPlayerInterface).f12016g.getCurrentPosition();
                this.Q = currentPosition;
                this.R = currentPosition;
                ((NativeVideoPlayer) this.K).f12016g.pause();
                q7 q7Var = this.H;
                if (!(q7Var == null || (g6Var = q7Var.f11621c) == null)) {
                    se.a(g6Var.f10451a);
                    re.f11684a.a(g6Var.f10451a.f11678e.c(), "pause", (JSONObject) null);
                }
            }
            a(y().h().j(), new VideoPausedTrackingParams(this.f10365p, b(this.R), this.E, this.f11937a0, pauseOrigin, this.f11947k0), this.R, "paused");
        }
        VideoPlayerInterface videoPlayerInterface2 = this.K;
        if (videoPlayerInterface2 != null) {
            NativeVideoPlayer nativeVideoPlayer = (NativeVideoPlayer) videoPlayerInterface2;
            if (nativeVideoPlayer.f12015f != null) {
                nativeVideoPlayer.f12015f = null;
            }
            d.b.f11993a.f11991b = null;
            this.K = null;
        }
        this.f11948l0.removeCallbacksAndMessages((Object) null);
        this.f11949m0.removeCallbacksAndMessages((Object) null);
        this.f11950n0.removeCallbacksAndMessages((Object) null);
        Q();
        this.T = true;
        if (this.f11956t0) {
            this.f10351b.unregisterReceiver(this.f11957u0);
            this.f11956t0 = false;
        }
        super.e();
    }

    public void f() {
        g6 g6Var;
        super.f();
        this.f10351b.registerReceiver(this.f11957u0, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        this.f11956t0 = true;
        if (!this.f10351b.isFinishing()) {
            if (this.L == null) {
                Context a10 = j0.a(this.f10351b);
                if (a10 == null) {
                    a10 = this.f10351b;
                }
                this.f11955s0 = SystemClock.uptimeMillis();
                this.N = (RelativeLayout) this.f10351b.findViewById(1475346432);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                VideoView videoView = new VideoView(a10);
                this.L = videoView;
                videoView.setId(100);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.addRule(13);
                ProgressBar progressBar = new ProgressBar(a10, (AttributeSet) null, 16843399);
                this.O = progressBar;
                progressBar.setVisibility(4);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams3.addRule(14);
                layoutParams3.addRule(15);
                RelativeLayout relativeLayout = new RelativeLayout(a10);
                this.M = relativeLayout;
                relativeLayout.setId(1475346436);
                this.f10351b.setContentView(this.M);
                this.M.addView(this.L, layoutParams2);
                this.M.addView(this.N, layoutParams);
                this.M.addView(this.O, layoutParams3);
                if (AdsConstants.f12105g.booleanValue()) {
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams4.addRule(12);
                    layoutParams4.addRule(14);
                    RelativeLayout relativeLayout2 = this.M;
                    TextView textView = new TextView(a10);
                    textView.setBackgroundColor(-16777216);
                    int i10 = a0.f10005a;
                    textView.setAlpha(0.5f);
                    textView.setTextColor(-7829368);
                    textView.setSingleLine(false);
                    textView.setText("url=" + y().i());
                    relativeLayout2.addView(textView, layoutParams4);
                }
                this.f10352c.f12186b.setVisibility(4);
            }
            if (this.K == null) {
                this.K = new NativeVideoPlayer(this.L);
            }
            this.V = false;
            this.M.setBackgroundColor(-16777216);
            L();
            if (H()) {
                this.f10352c.f12186b.setVisibility(0);
                this.L.setVisibility(4);
            } else {
                int i11 = this.Q;
                if (i11 != 0) {
                    ((NativeVideoPlayer) this.K).f12016g.seekTo(i11);
                    VideoPausedTrackingParams.PauseOrigin pauseOrigin = VideoPausedTrackingParams.PauseOrigin.EXTERNAL;
                    q7 q7Var = this.H;
                    if (!(q7Var == null || (g6Var = q7Var.f11621c) == null)) {
                        se.a(g6Var.f10451a);
                        re.f11684a.a(g6Var.f10451a.f11678e.c(), "resume", (JSONObject) null);
                    }
                    a(y().h().n(), new VideoPausedTrackingParams(this.f10365p, b(this.R), this.E, this.f11937a0, pauseOrigin, this.f11947k0), this.R, "resumed");
                    this.f11937a0++;
                }
            }
            VideoPlayerInterface videoPlayerInterface = this.K;
            com.startapp.sdk.ads.video.player.a aVar = (com.startapp.sdk.ads.video.player.a) videoPlayerInterface;
            aVar.f12034b = new cd(this);
            aVar.f12036d = new i(this);
            dd ddVar = new dd(this);
            aVar.f12035c = new ed(this);
            videoPlayerInterface.getClass();
            VideoPlayerInterface videoPlayerInterface2 = this.K;
            ((com.startapp.sdk.ads.video.player.a) videoPlayerInterface2).f12037e = ddVar;
            videoPlayerInterface2.getClass();
            VideoView videoView2 = this.L;
            fd fdVar = new fd(this);
            int i12 = a0.f10005a;
            videoView2.addOnLayoutChangeListener(new z(fdVar));
        }
    }

    public void h() {
        if (!this.X) {
            a6.a((Context) this.f10351b).a(new Intent("com.startapp.android.HideDisplayBroadcastListener"));
        }
    }

    public void i() {
        if (this.X) {
            return;
        }
        if (H() || this.L == null) {
            a(y().h().l(), new VideoTrackingParams(this.f10365p, b(this.R), this.E, this.f11947k0), this.R, "postrollClosed");
            super.i();
            return;
        }
        VideoPlayerInterface videoPlayerInterface = this.K;
        int currentPosition = videoPlayerInterface != null ? ((NativeVideoPlayer) videoPlayerInterface).f12016g.getCurrentPosition() : 0;
        a(y().h().i(), new VideoTrackingParams(this.f10365p, b(currentPosition), this.E, this.f11947k0), currentPosition, "closed");
    }

    public long k() {
        return (SystemClock.uptimeMillis() - this.f11955s0) / 1000;
    }

    public n5 l() {
        Activity activity = this.f10351b;
        Runnable runnable = this.I;
        return new sc(activity, runnable, runnable, new bd(this), new ad(this), new zc(this), new TrackingParams(this.f10365p), a(0));
    }

    public long m() {
        Long l10 = this.f10366q;
        if (l10 != null) {
            return TimeUnit.SECONDS.toMillis(l10.longValue());
        }
        return TimeUnit.SECONDS.toMillis(MetaData.f12393k.q());
    }

    public TrackingParams n() {
        return new VideoTrackingParams(this.f10365p, 0, this.E, this.f11947k0);
    }

    public void onClick(View view) {
        this.I.run();
    }

    public boolean p() {
        return this.f10361l.getType() == Ad.AdType.REWARDED_VIDEO;
    }

    public void q() {
    }

    public void r() {
        this.U = true;
        if (this.V && E()) {
            B();
        } else if (H()) {
            b((View) this.f10440v);
        }
        if (D()) {
            P();
        }
        if (H()) {
            A();
        }
    }

    public boolean s() {
        return false;
    }

    public void t() {
        a(y().h().o(), new VideoTrackingParams(this.f10365p, AdsCommonMetaData.f12098h.G().k(), this.E, this.f11947k0), d(AdsCommonMetaData.f12098h.G().k()), "rewarded");
    }

    public final void x() {
        Intent intent = new Intent("com.startapp.android.ShowFailedDisplayBroadcastListener");
        intent.putExtra("showFailedReason", NotDisplayedReason.VIDEO_ERROR);
        a6.a((Context) this.f10351b).a(intent);
        this.X = true;
    }

    public VideoAdDetails y() {
        return ((VideoEnabledAd) this.f10361l).w();
    }

    public final void z() {
        if (!this.f10357h.equals("back")) {
            return;
        }
        if (AdsCommonMetaData.f12098h.G().a().equals(VideoConfig.BackMode.BOTH)) {
            this.f11938b0 = true;
            this.f11939c0 = true;
        } else if (AdsCommonMetaData.f12098h.G().a().equals(VideoConfig.BackMode.SKIP)) {
            this.f11938b0 = true;
            this.f11939c0 = false;
        } else if (AdsCommonMetaData.f12098h.G().a().equals(VideoConfig.BackMode.CLOSE)) {
            this.f11938b0 = false;
            this.f11939c0 = true;
        } else if (AdsCommonMetaData.f12098h.G().a().equals(VideoConfig.BackMode.DISABLED)) {
            this.f11938b0 = false;
            this.f11939c0 = false;
        } else {
            this.f11938b0 = false;
            this.f11939c0 = false;
        }
    }

    public final void b(View view) {
        wb.a(this.f10440v, true, "videoApi.setVideoFrame", Integer.valueOf(qb.b(this.f10351b, view.getLeft())), Integer.valueOf(qb.b(this.f10351b, view.getTop())), Integer.valueOf(qb.b(this.f10351b, view.getWidth())), Integer.valueOf(qb.b(this.f10351b, view.getHeight())));
    }

    public boolean c() {
        if (H()) {
            i();
            return false;
        }
        VideoPlayerInterface videoPlayerInterface = this.K;
        if (videoPlayerInterface == null) {
            return false;
        }
        long c10 = c(((NativeVideoPlayer) videoPlayerInterface).f12016g.getCurrentPosition() + 50);
        if (G() && c10 == 0) {
            R();
            return true;
        } else if (!y().l() && !this.f11939c0) {
            return true;
        } else {
            i();
            return false;
        }
    }

    public void b(Bundle bundle) {
        super.b(bundle);
        bundle.putInt("currentPosition", this.Q);
        bundle.putInt("latestPosition", this.R);
        bundle.putSerializable("fractionProgressImpressionsSent", this.Y);
        bundle.putSerializable("absoluteProgressImpressionsSent", this.Z);
        bundle.putBoolean("isMuted", this.P);
        bundle.putBoolean("shouldSetBg", this.T);
        bundle.putInt("pauseNum", this.f11937a0);
    }

    public void a(View view) {
        VideoAdDetails y10;
        ec ecVar;
        wb.b bVar = wb.b.STANDALONE;
        vb.c cVar = vb.c.OTHER;
        if (MetaData.f12393k.S() && (y10 = y()) != null) {
            q7 q7Var = new q7(this.f10440v.getContext(), y10.a(), true);
            this.H = q7Var;
            if (q7Var.c()) {
                try {
                    AdInformationView adInformationView = this.f10352c.f12186b;
                    if (adInformationView != null) {
                        this.H.a(adInformationView, cVar, (String) null);
                    }
                    if (view != null) {
                        this.H.a(view, vb.c.CLOSE_AD, (String) null);
                    }
                    this.H.a(this.f10440v, vb.c.VIDEO_CONTROLS, (String) null);
                    this.H.a(this.N, cVar, (String) null);
                } catch (RuntimeException unused) {
                }
                this.H.a(this.L);
                this.H.e();
                q7 q7Var2 = this.H;
                boolean G = G();
                long g10 = y().m() ? y().g() : 0;
                if (q7Var2.f11620b != null && q7Var2.f11623e.compareAndSet(false, true)) {
                    if (G) {
                        ecVar = new ec(true, Float.valueOf((float) g10), true, bVar);
                    } else {
                        ecVar = new ec(false, (Float) null, true, bVar);
                    }
                    k kVar = q7Var2.f11620b;
                    kVar.getClass();
                    se.a(kVar.f10739a);
                    se.c(kVar.f10739a);
                    rd rdVar = kVar.f10739a;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("skippable", ecVar.f10332a);
                        if (ecVar.f10332a) {
                            jSONObject.put("skipOffset", ecVar.f10333b);
                        }
                        jSONObject.put("autoPlay", ecVar.f10334c);
                        jSONObject.put("position", ecVar.f10335d);
                    } catch (JSONException e10) {
                        Log.e("OMIDLIB", "VastProperties: JSON error", e10);
                    }
                    if (!rdVar.f11683j) {
                        re.f11684a.a(rdVar.f11678e.c(), "publishLoadedEvent", jSONObject);
                        rdVar.f11683j = true;
                        return;
                    }
                    throw new IllegalStateException("Loaded event can only be sent once");
                }
            }
        }
    }

    public void b() {
        super.b();
        if (this.f11944h0) {
            String c10 = y().c();
            if (c10 != null && c10.endsWith(".temp")) {
                new File(c10).delete();
            }
        }
    }

    public final int b(int i10) {
        int i11 = this.S;
        if (i11 > 0) {
            return (i10 * 100) / i11;
        }
        return 0;
    }

    public void e(int i10) {
        List list;
        if (this.Z.get(Integer.valueOf(i10)) == null) {
            if (this.f11953q0.containsKey(Integer.valueOf(i10)) && (list = this.f11953q0.get(Integer.valueOf(i10))) != null) {
                a((VideoTrackingLink[]) list.toArray(new AbsoluteTrackingLink[0]), new VideoProgressTrackingParams(this.f10365p, i10, this.E, this.f11947k0), i10, "absolute");
            }
            this.Z.put(Integer.valueOf(i10), Boolean.TRUE);
        }
    }

    public void a(VideoFinishedReason videoFinishedReason) {
        q7 q7Var;
        g6 g6Var;
        q7 q7Var2;
        g6 g6Var2;
        if (!(videoFinishedReason != VideoFinishedReason.COMPLETE || (q7Var2 = this.H) == null || (g6Var2 = q7Var2.f11621c) == null)) {
            se.a(g6Var2.f10451a);
            re.f11684a.a(g6Var2.f10451a.f11678e.c(), "complete", (JSONObject) null);
        }
        VideoFinishedReason videoFinishedReason2 = VideoFinishedReason.SKIPPED;
        if (!(videoFinishedReason != videoFinishedReason2 || (q7Var = this.H) == null || (g6Var = q7Var.f11621c) == null)) {
            se.a(g6Var.f10451a);
            re.f11684a.a(g6Var.f10451a.f11678e.c(), "skipped", (JSONObject) null);
        }
        if (videoFinishedReason == videoFinishedReason2 || videoFinishedReason == VideoFinishedReason.CLICKED) {
            this.f11948l0.removeCallbacksAndMessages((Object) null);
            this.f11950n0.removeCallbacksAndMessages((Object) null);
            VideoPlayerInterface videoPlayerInterface = this.K;
            if (videoPlayerInterface != null) {
                this.R = ((NativeVideoPlayer) videoPlayerInterface).f12016g.getCurrentPosition();
                ((NativeVideoPlayer) this.K).f12016g.pause();
            }
        } else {
            this.R = this.S;
            u();
        }
        this.f11949m0.removeCallbacksAndMessages((Object) null);
        this.Y.clear();
        this.Z.clear();
        if (videoFinishedReason == VideoFinishedReason.CLICKED) {
            this.Q = -1;
            return;
        }
        if (y().j()) {
            A();
            this.f10352c.f12186b.setVisibility(0);
        } else {
            b();
        }
        this.Q = -1;
        if (y().j()) {
            a(y().h().m(), new VideoTrackingParams(this.f10365p, b(this.R), this.E, this.f11947k0), this.R, "postrollImression");
        }
    }

    public void f(int i10) {
        g6 g6Var;
        if (this.Y.get(Integer.valueOf(i10)) == null) {
            if (this.f11952p0.containsKey(Integer.valueOf(i10))) {
                List list = this.f11952p0.get(Integer.valueOf(i10));
                if (list != null) {
                    a((VideoTrackingLink[]) list.toArray(new FractionTrackingLink[0]), new VideoProgressTrackingParams(this.f10365p, i10, this.E, this.f11947k0), (this.S * i10) / 100, "fraction");
                }
                q7 q7Var = this.H;
                if (q7Var != null) {
                    if (i10 == 25) {
                        g6 g6Var2 = q7Var.f11621c;
                        if (g6Var2 != null) {
                            se.a(g6Var2.f10451a);
                            re.f11684a.a(g6Var2.f10451a.f11678e.c(), "firstQuartile", (JSONObject) null);
                        }
                    } else if (i10 == 50) {
                        g6 g6Var3 = q7Var.f11621c;
                        if (g6Var3 != null) {
                            se.a(g6Var3.f10451a);
                            re.f11684a.a(g6Var3.f10451a.f11678e.c(), "midpoint", (JSONObject) null);
                        }
                    } else if (i10 == 75 && (g6Var = q7Var.f11621c) != null) {
                        se.a(g6Var.f10451a);
                        re.f11684a.a(g6Var.f10451a.f11678e.c(), "thirdQuartile", (JSONObject) null);
                    }
                }
            }
            this.Y.put(Integer.valueOf(i10), Boolean.TRUE);
        }
    }

    public final void a(int i10, Handler handler, Runnable runnable) {
        int i11 = this.Q;
        if (i11 < i10) {
            handler.postDelayed(runnable, (long) (i10 - i11));
        }
    }

    public void a(VideoPlayerInterface.e eVar) {
        VASTErrorCodes vASTErrorCodes;
        int i10;
        VideoPlayerInterface videoPlayerInterface;
        i4 i4Var = new i4(j4.f10588e);
        StringBuilder a10 = b1.a("Video player error: ");
        a10.append(eVar.f12030a);
        i4Var.f10537d = a10.toString();
        i4Var.f10538e = eVar.f12031b;
        i4Var.f10540g = a();
        i4Var.a();
        int ordinal = eVar.f12030a.ordinal();
        boolean z10 = true;
        if (ordinal == 1) {
            vASTErrorCodes = VASTErrorCodes.GeneralLinearError;
        } else if (ordinal == 2) {
            vASTErrorCodes = VASTErrorCodes.TimeoutMediaFileURI;
        } else if (ordinal != 3) {
            vASTErrorCodes = VASTErrorCodes.UndefinedError;
        } else {
            vASTErrorCodes = VASTErrorCodes.MediaFileDisplayError;
        }
        rc rcVar = new rc(y().h().e(), new VideoTrackingParams(this.f10365p, b(this.R), this.E, this.f11947k0), y().i(), this.R);
        rcVar.f11672f = vASTErrorCodes;
        rcVar.f11671e = "error";
        VideoUtil.a((Context) this.f10351b, rcVar.a());
        if (!this.f11941e0 || (videoPlayerInterface = this.K) == null) {
            i10 = this.Q;
        } else {
            i10 = ((NativeVideoPlayer) videoPlayerInterface).f12016g.getCurrentPosition();
        }
        if (i10 == 0) {
            com.startapp.sdk.adsbase.a.a((Context) this.f10351b, this.f10358i, this.f10365p, this.E, "VIDEO_ERROR", (JSONObject) null);
            if (!this.f11941e0) {
                VideoUtil.b(this.f10351b);
            } else if (!eVar.f12030a.equals(VideoPlayerInterface.VideoPlayerErrorType.BUFFERING_TIMEOUT)) {
                VideoUtil.b(this.f10351b);
            }
        }
        if (this.f10361l.getType() != Ad.AdType.REWARDED_VIDEO) {
            z10 = false;
        }
        if ((!z10 || this.D) && y().j()) {
            a(VideoFinishedReason.SKIPPED);
            return;
        }
        x();
        b();
    }

    public boolean a(String str, boolean z10) {
        String str2;
        ActionTrackingLink[] actionTrackingLinkArr;
        boolean H = H();
        if (H) {
            str2 = y().d();
        } else {
            str2 = y().b();
        }
        if (!TextUtils.isEmpty(str2)) {
            z10 = true;
            str = str2;
        }
        if (!H) {
            a(VideoFinishedReason.CLICKED);
        }
        if (H) {
            actionTrackingLinkArr = y().h().k();
        } else {
            actionTrackingLinkArr = y().h().h();
        }
        a(actionTrackingLinkArr, new VideoClickedTrackingParams(this.f10365p, b(this.R), this.E, H, this.f11947k0), this.R, "clicked");
        q7 q7Var = this.H;
        if (q7Var != null) {
            wb.a aVar = wb.a.CLICK;
            g6 g6Var = q7Var.f11621c;
            if (g6Var != null) {
                se.a(g6Var.f10451a);
                JSONObject jSONObject = new JSONObject();
                de.a(jSONObject, "interactionType", aVar);
                re.f11684a.a(g6Var.f10451a.f11678e.c(), "adUserInteraction", jSONObject);
            }
        }
        return super.a(str, z10);
    }

    public void a(boolean z10) {
        ActionTrackingLink[] actionTrackingLinkArr;
        if (this.K != null) {
            if (z10) {
                actionTrackingLinkArr = y().h().f();
            } else {
                actionTrackingLinkArr = y().h().g();
            }
            a(actionTrackingLinkArr, new VideoTrackingParams(this.f10365p, b(((NativeVideoPlayer) this.K).f12016g.getCurrentPosition()), this.E, this.f11947k0), ((NativeVideoPlayer) this.K).f12016g.getCurrentPosition(), "sound");
            q7 q7Var = this.H;
            if (q7Var != null) {
                float f10 = z10 ? 0.0f : 1.0f;
                g6 g6Var = q7Var.f11621c;
                if (g6Var != null) {
                    g6Var.a(f10);
                    se.a(g6Var.f10451a);
                    JSONObject jSONObject = new JSONObject();
                    de.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f10));
                    de.a(jSONObject, "deviceVolume", Float.valueOf(xe.a().f12807a));
                    re.f11684a.a(g6Var.f10451a.f11678e.c(), "volumeChange", jSONObject);
                }
            }
        }
    }

    public final void a(VideoTrackingLink[] videoTrackingLinkArr, VideoTrackingParams videoTrackingParams, int i10, String str) {
        rc rcVar = new rc(videoTrackingLinkArr, videoTrackingParams, y().i(), i10);
        rcVar.f11671e = str;
        VideoUtil.a((Context) this.f10351b, rcVar.a());
    }
}
