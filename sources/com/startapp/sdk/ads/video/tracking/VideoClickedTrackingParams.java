package com.startapp.sdk.ads.video.tracking;

import com.startapp.b1;

/* compiled from: Sta */
public class VideoClickedTrackingParams extends VideoTrackingParams {
    private static final long serialVersionUID = 940417627850369979L;
    private boolean isVideoFinished;

    public VideoClickedTrackingParams(String str, int i10, int i11, boolean z10, String str2) {
        super(str, i10, i11, str2);
        this.isVideoFinished = z10;
    }

    public String e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f());
        StringBuilder a10 = b1.a("&co=");
        a10.append(this.isVideoFinished ? "POSTROLL" : "VIDEO");
        sb2.append(a10.toString());
        sb2.append(g());
        return b(sb2.toString());
    }
}
