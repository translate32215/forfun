package com.startapp.sdk.ads.video.tracking;

import com.startapp.b1;

/* compiled from: Sta */
public class VideoPausedTrackingParams extends VideoTrackingParams {
    private static final long serialVersionUID = 1;
    private int pauseNum;
    private PauseOrigin pauseOrigin;

    /* compiled from: Sta */
    public enum PauseOrigin {
        INAPP,
        EXTERNAL
    }

    public VideoPausedTrackingParams(String str, int i10, int i11, int i12, PauseOrigin pauseOrigin2, String str2) {
        super(str, i10, i11, str2);
        this.pauseNum = i12;
        this.pauseOrigin = pauseOrigin2;
    }

    public String e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f());
        StringBuilder a10 = b1.a("&po=");
        a10.append(this.pauseOrigin.toString());
        sb2.append(a10.toString());
        StringBuilder a11 = b1.a("&pn=");
        a11.append(this.pauseNum);
        sb2.append(a11.toString());
        sb2.append(g());
        return b(sb2.toString());
    }
}
