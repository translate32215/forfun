package com.startapp.sdk.ads.video.player;

/* compiled from: Sta */
public interface VideoPlayerInterface {

    /* compiled from: Sta */
    public enum VideoPlayerErrorType {
        UNKNOWN,
        SERVER_DIED,
        BUFFERING_TIMEOUT
    }

    /* compiled from: Sta */
    public interface a {
    }

    /* compiled from: Sta */
    public interface b {
    }

    /* compiled from: Sta */
    public interface c {
    }

    /* compiled from: Sta */
    public interface d {
    }

    /* compiled from: Sta */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public VideoPlayerErrorType f12030a;

        /* renamed from: b  reason: collision with root package name */
        public String f12031b;

        /* renamed from: c  reason: collision with root package name */
        public int f12032c;

        public e(VideoPlayerErrorType videoPlayerErrorType, String str, int i10) {
            this.f12030a = videoPlayerErrorType;
            this.f12031b = str;
            this.f12032c = i10;
        }
    }
}
