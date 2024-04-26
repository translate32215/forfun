package com.startapp.sdk.ads.video.player;

import android.media.MediaPlayer;
import android.widget.VideoView;
import com.startapp.cd;
import com.startapp.dd;
import com.startapp.ed;
import com.startapp.i4;
import com.startapp.sdk.ads.video.VideoMode;
import com.startapp.sdk.ads.video.d;
import com.startapp.sdk.ads.video.i;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface;

/* compiled from: Sta */
public class NativeVideoPlayer extends a implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener {

    /* renamed from: f  reason: collision with root package name */
    public MediaPlayer f12015f;

    /* renamed from: g  reason: collision with root package name */
    public final VideoView f12016g;

    /* compiled from: Sta */
    public enum MediaErrorExtra {
        MEDIA_ERROR_IO,
        MEDIA_ERROR_MALFORMED,
        MEDIA_ERROR_UNSUPPORTED,
        MEDIA_ERROR_TIMED_OUT
    }

    /* compiled from: Sta */
    public enum MediaErrorType {
        MEDIA_ERROR_UNKNOWN,
        MEDIA_ERROR_SERVER_DIED
    }

    /* compiled from: Sta */
    public class a implements MediaPlayer.OnBufferingUpdateListener {
        public a() {
        }

        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
            VideoPlayerInterface.a aVar = NativeVideoPlayer.this.f12037e;
            if (aVar != null) {
                ((dd) aVar).a(i10);
            }
        }
    }

    public NativeVideoPlayer(VideoView videoView) {
        this.f12016g = videoView;
        videoView.setOnPreparedListener(this);
        videoView.setOnCompletionListener(this);
        videoView.setOnErrorListener(this);
    }

    public void a(String str) {
        this.f12033a = str;
        if (str != null) {
            try {
                this.f12016g.setVideoPath(str);
            } catch (Throwable th) {
                i4.a(th);
                onError(this.f12015f, 1, 0);
            }
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        VideoPlayerInterface.b bVar = this.f12036d;
        if (bVar != null) {
            ((i) bVar).a();
        }
    }

    public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        MediaErrorType mediaErrorType;
        VideoPlayerInterface.VideoPlayerErrorType videoPlayerErrorType;
        MediaErrorExtra mediaErrorExtra;
        if (this.f12035c == null) {
            return false;
        }
        int currentPosition = mediaPlayer != null ? mediaPlayer.getCurrentPosition() : -1;
        VideoPlayerInterface.c cVar = this.f12035c;
        if (i10 == 100) {
            mediaErrorType = MediaErrorType.MEDIA_ERROR_SERVER_DIED;
        } else {
            mediaErrorType = MediaErrorType.MEDIA_ERROR_UNKNOWN;
        }
        if (mediaErrorType == MediaErrorType.MEDIA_ERROR_SERVER_DIED) {
            videoPlayerErrorType = VideoPlayerInterface.VideoPlayerErrorType.SERVER_DIED;
        } else {
            videoPlayerErrorType = VideoPlayerInterface.VideoPlayerErrorType.UNKNOWN;
        }
        if (i11 == -1010) {
            mediaErrorExtra = MediaErrorExtra.MEDIA_ERROR_UNSUPPORTED;
        } else if (i11 == -1007) {
            mediaErrorExtra = MediaErrorExtra.MEDIA_ERROR_MALFORMED;
        } else if (i11 != -110) {
            mediaErrorExtra = MediaErrorExtra.MEDIA_ERROR_IO;
        } else {
            mediaErrorExtra = MediaErrorExtra.MEDIA_ERROR_TIMED_OUT;
        }
        String str = mediaErrorExtra.toString();
        VideoPlayerInterface.e eVar = new VideoPlayerInterface.e(videoPlayerErrorType, str, currentPosition);
        ed edVar = (ed) cVar;
        VideoMode videoMode = edVar.f10336a;
        if (videoMode.K != null) {
            videoMode.f11942f0 = false;
            if (!videoMode.f11941e0 || videoMode.f11945i0 > videoMode.f11946j0 || currentPosition <= 0 || !str.equals("MEDIA_ERROR_IO")) {
                edVar.f10336a.a(eVar);
            } else {
                VideoMode videoMode2 = edVar.f10336a;
                videoMode2.f11945i0++;
                videoMode2.N();
                VideoMode videoMode3 = edVar.f10336a;
                ((NativeVideoPlayer) videoMode3.K).a(videoMode3.y().c());
                ((NativeVideoPlayer) edVar.f10336a.K).f12016g.seekTo(eVar.f12032c);
            }
        }
        return true;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        MediaPlayer mediaPlayer2;
        this.f12015f = mediaPlayer;
        VideoPlayerInterface.d dVar = this.f12034b;
        if (dVar != null) {
            cd cdVar = (cd) dVar;
            VideoMode videoMode = cdVar.f10255a;
            videoMode.f11942f0 = true;
            if (videoMode.U && videoMode.V) {
                videoMode.B();
            }
            if (cdVar.f10255a.D()) {
                cdVar.f10255a.P();
            }
        }
        if (com.startapp.sdk.adsbase.a.c(this.f12033a) && (mediaPlayer2 = this.f12015f) != null) {
            mediaPlayer2.setOnBufferingUpdateListener(new a());
        } else if (!com.startapp.sdk.adsbase.a.c(this.f12033a)) {
            d.b.f11993a.f11991b = this.f12037e;
        }
    }
}
