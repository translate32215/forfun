package com.startapp.sdk.ads.video;

import com.startapp.ob;
import com.startapp.sdk.ads.video.tracking.VideoTrackingDetails;
import com.startapp.sdk.ads.video.vast.a;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.omsdk.AdVerification;
import com.startapp.sdk.omsdk.VerificationDetails;
import com.startapp.yb;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class VideoAdDetails implements Serializable {
    private static final long serialVersionUID = 7139790917892812511L;
    @ob(type = VerificationDetails.class)
    private VerificationDetails[] adVerifications;
    private String clickUrl;
    private boolean clickable;
    private boolean closeable;
    private boolean isVideoMuted;
    private String localVideoPath;
    @ob(type = PostRollType.class)
    private PostRollType postRoll;
    private String postRollClickThroughUrl;
    private String postRollHtml;
    private boolean skippable;
    private long skippableAfter;
    @ob(complex = true)
    private VideoTrackingDetails videoTrackingDetails;
    private String videoUrl;

    /* compiled from: Sta */
    public enum PostRollType {
        IMAGE,
        LAST_FRAME,
        NONE
    }

    public VideoAdDetails() {
    }

    public void a(String str) {
        this.localVideoPath = str;
    }

    public String b() {
        return this.clickUrl;
    }

    public String c() {
        return this.localVideoPath;
    }

    public String d() {
        return this.postRollHtml != null ? this.postRollClickThroughUrl : this.clickUrl;
    }

    public String e() {
        return this.postRollHtml;
    }

    public PostRollType f() {
        return this.postRoll;
    }

    public long g() {
        return this.skippableAfter;
    }

    public VideoTrackingDetails h() {
        return this.videoTrackingDetails;
    }

    public String i() {
        return this.videoUrl;
    }

    public boolean j() {
        return (this.postRoll == PostRollType.NONE && this.postRollHtml == null) ? false : true;
    }

    public boolean k() {
        return this.clickable;
    }

    public boolean l() {
        return this.closeable;
    }

    public boolean m() {
        return this.skippable;
    }

    public boolean n() {
        return this.isVideoMuted;
    }

    public void o() {
        this.skippableAfter = TimeUnit.SECONDS.toMillis(this.skippableAfter);
    }

    public String toString() {
        return super.toString();
    }

    public VideoAdDetails(yb ybVar, VideoConfig videoConfig, boolean z10) {
        this.videoTrackingDetails = new VideoTrackingDetails(ybVar);
        this.videoUrl = ybVar.k();
        Integer o10 = ybVar.o();
        boolean z11 = true;
        if (z10) {
            this.skippableAfter = o10 != null ? (long) o10.intValue() : videoConfig.m();
            this.skippable = true;
        } else {
            this.skippable = false;
        }
        String c10 = ybVar.c();
        this.clickUrl = c10;
        this.clickable = c10 == null ? false : z11;
        this.postRoll = PostRollType.NONE;
        a f10 = ybVar.f();
        if (f10 != null) {
            this.postRollHtml = f10.c().a();
            this.postRollClickThroughUrl = f10.a();
        }
        a(new AdVerification((VerificationDetails[]) ybVar.b().toArray(new VerificationDetails[0])));
    }

    public void a(boolean z10) {
        this.isVideoMuted = z10;
    }

    public AdVerification a() {
        return new AdVerification(this.adVerifications);
    }

    public void a(AdVerification adVerification) {
        if (adVerification.a() != null) {
            this.adVerifications = (VerificationDetails[]) adVerification.a().toArray(new VerificationDetails[0]);
        }
    }
}
