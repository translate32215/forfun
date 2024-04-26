package com.startapp;

import android.os.Handler;
import com.startapp.sdk.ads.video.VideoMode;
import com.startapp.sdk.ads.video.player.NativeVideoPlayer;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface;
import com.startapp.sdk.adsbase.AdsCommonMetaData;

/* compiled from: Sta */
public class vc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public boolean f12708a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12709b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ VideoMode f12710c;

    public vc(VideoMode videoMode) {
        this.f12710c = videoMode;
        this.f12709b = videoMode.d(AdsCommonMetaData.k().G().k());
    }

    public void run() {
        try {
            VideoPlayerInterface videoPlayerInterface = this.f12710c.K;
            int currentPosition = videoPlayerInterface != null ? ((NativeVideoPlayer) videoPlayerInterface).f12016g.getCurrentPosition() : 0;
            int i10 = currentPosition + 50;
            long c10 = this.f12710c.c(i10);
            long j10 = 0;
            int i11 = (c10 > 0 ? 1 : (c10 == 0 ? 0 : -1));
            if (i11 >= 0 && !this.f12708a) {
                if (i11 != 0) {
                    VideoMode videoMode = this.f12710c;
                    if (((long) videoMode.Q) < videoMode.y().g()) {
                        wb.a(this.f12710c.f10440v, true, "videoApi.setSkipTimer", Long.valueOf(c10));
                    }
                }
                this.f12708a = true;
                wb.a(this.f12710c.f10440v, true, "videoApi.setSkipTimer", 0);
            }
            VideoMode videoMode2 = this.f12710c;
            if (videoMode2.f11941e0 && currentPosition >= this.f12709b) {
                videoMode2.u();
            }
            int i12 = i10 / 1000;
            wb.a(this.f12710c.f10440v, true, "videoApi.setVideoCurrentPosition", Integer.valueOf(i12));
            if (i12 < ((NativeVideoPlayer) this.f12710c.K).f12016g.getDuration() / 1000) {
                VideoMode videoMode3 = this.f12710c;
                Handler handler = videoMode3.f11949m0;
                VideoPlayerInterface videoPlayerInterface2 = videoMode3.K;
                if (videoPlayerInterface2 != null) {
                    j10 = (long) (1000 - (((NativeVideoPlayer) videoPlayerInterface2).f12016g.getCurrentPosition() % 1000));
                }
                handler.postDelayed(this, j10);
            }
        } catch (Throwable th) {
            i4.a(th);
        }
    }
}
