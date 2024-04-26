package com.startapp;

import com.startapp.sdk.ads.video.VideoMode;
import com.startapp.sdk.ads.video.player.NativeVideoPlayer;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface;
import com.startapp.sdk.adsbase.AdsCommonMetaData;

/* compiled from: Sta */
public class dd implements VideoPlayerInterface.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VideoMode f10304a;

    public dd(VideoMode videoMode) {
        this.f10304a = videoMode;
    }

    public void a(int i10) {
        VideoMode videoMode;
        VideoPlayerInterface videoPlayerInterface;
        VideoPlayerInterface videoPlayerInterface2 = this.f10304a.K;
        int duration = videoPlayerInterface2 != null ? ((NativeVideoPlayer) videoPlayerInterface2).f12016g.getDuration() : 0;
        VideoMode videoMode2 = this.f10304a;
        if (videoMode2.f11941e0 && videoMode2.f11942f0 && duration > 0) {
            videoMode2.f11940d0 = i10;
            int currentPosition = (((NativeVideoPlayer) videoMode2.K).f12016g.getCurrentPosition() * 100) / duration;
            if (this.f10304a.F()) {
                VideoMode videoMode3 = this.f10304a;
                if (videoMode3.f11943g0 || !videoMode3.D()) {
                    int i11 = this.f10304a.f11940d0;
                    if (i11 == 100 || i11 - currentPosition > AdsCommonMetaData.f12098h.G().h()) {
                        VideoMode videoMode4 = this.f10304a;
                        videoMode4.O();
                        videoMode4.Q();
                        return;
                    }
                    return;
                }
                this.f10304a.P();
                return;
            }
            int i12 = this.f10304a.f11940d0;
            if (i12 < 100 && i12 - currentPosition <= AdsCommonMetaData.f12098h.G().i() && (videoPlayerInterface = videoMode.K) != null) {
                ((NativeVideoPlayer) videoPlayerInterface).f12016g.pause();
                (videoMode = this.f10304a).N();
            }
        }
    }
}
