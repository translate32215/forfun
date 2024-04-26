package com.startapp.sdk.ads.video.tracking;

import androidx.activity.e;
import com.startapp.b1;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;

/* compiled from: Sta */
public class VideoTrackingParams extends TrackingParams {
    private static final long serialVersionUID = 1;
    private int completed;
    public boolean internalParamsIndicator;
    private String replayParameter;
    private boolean shouldAppendOffset;
    private String videoPlayingMode;

    public VideoTrackingParams(String str, int i10, int i11, String str2) {
        super(str);
        a(i11);
        this.completed = i10;
        this.videoPlayingMode = str2;
    }

    public VideoTrackingParams a(boolean z10) {
        this.shouldAppendOffset = z10;
        return this;
    }

    public String b(String str) {
        if (this.internalParamsIndicator) {
            return e.a(new StringBuilder(), super.e(), str);
        }
        return c();
    }

    public VideoTrackingParams c(String str) {
        this.replayParameter = str;
        return this;
    }

    public String e() {
        return b(f() + g());
    }

    public String f() {
        StringBuilder a10 = b1.a("&cp=");
        a10.append(this.completed);
        return a10.toString();
    }

    public String g() {
        StringBuilder a10 = b1.a("&vpm=");
        a10.append(this.videoPlayingMode);
        return a10.toString();
    }

    public String c() {
        if (!this.shouldAppendOffset) {
            return "";
        }
        String str = this.replayParameter;
        if (str != null) {
            return str.replace("%startapp_replay_count%", new Integer(b()).toString());
        }
        return super.c();
    }
}
