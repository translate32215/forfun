package com.startapp.sdk.ads.video;

import com.startapp.sdk.ads.video.VideoMode;
import com.startapp.sdk.ads.video.player.NativeVideoPlayer;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface;

/* compiled from: Sta */
public class i implements VideoPlayerInterface.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VideoMode f12007a;

    public i(VideoMode videoMode) {
        this.f12007a = videoMode;
    }

    public void a() {
        if (!this.f12007a.H()) {
            this.f12007a.a(VideoMode.VideoFinishedReason.COMPLETE);
        }
        VideoPlayerInterface videoPlayerInterface = this.f12007a.K;
        if (videoPlayerInterface != null) {
            ((NativeVideoPlayer) videoPlayerInterface).f12016g.stopPlayback();
        }
    }
}
