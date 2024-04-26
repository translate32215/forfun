package com.startapp;

import android.text.TextUtils;
import com.startapp.sdk.ads.video.tracking.VideoTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoTrackingParams;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.adsbase.a;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class rc {

    /* renamed from: a  reason: collision with root package name */
    public VideoTrackingLink[] f11667a;

    /* renamed from: b  reason: collision with root package name */
    public VideoTrackingParams f11668b;

    /* renamed from: c  reason: collision with root package name */
    public String f11669c;

    /* renamed from: d  reason: collision with root package name */
    public int f11670d;

    /* renamed from: e  reason: collision with root package name */
    public String f11671e = "";

    /* renamed from: f  reason: collision with root package name */
    public VASTErrorCodes f11672f;

    public rc(VideoTrackingLink[] videoTrackingLinkArr, VideoTrackingParams videoTrackingParams, String str, int i10) {
        this.f11667a = videoTrackingLinkArr;
        this.f11668b = videoTrackingParams;
        this.f11669c = str;
        this.f11670d = i10;
    }

    public qc a() {
        Object obj;
        Object obj2 = null;
        if (!((this.f11667a == null || this.f11668b == null) ? false : true)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        VideoTrackingLink[] videoTrackingLinkArr = this.f11667a;
        int length = videoTrackingLinkArr.length;
        int i10 = 0;
        while (i10 < length) {
            VideoTrackingLink videoTrackingLink = videoTrackingLinkArr[i10];
            if (videoTrackingLink.c() == null || (this.f11668b.b() > 0 && !videoTrackingLink.d())) {
                obj = obj2;
            } else {
                StringBuilder sb2 = new StringBuilder();
                VideoTrackingLink.TrackingSource b10 = videoTrackingLink.b();
                if (b10 == null) {
                    if (wb.d(videoTrackingLink.c())) {
                        b10 = VideoTrackingLink.TrackingSource.STARTAPP;
                    } else {
                        b10 = VideoTrackingLink.TrackingSource.EXTERNAL;
                    }
                }
                VideoTrackingParams videoTrackingParams = this.f11668b;
                videoTrackingParams.internalParamsIndicator = b10 == VideoTrackingLink.TrackingSource.STARTAPP;
                VideoTrackingParams c10 = videoTrackingParams.a(videoTrackingLink.d()).c(videoTrackingLink.a());
                String c11 = videoTrackingLink.c();
                String str = this.f11669c;
                String replace = c11.replace("[ASSETURI]", str != null ? TextUtils.htmlEncode(str) : "");
                int i11 = this.f11670d;
                long convert = TimeUnit.SECONDS.convert((long) i11, TimeUnit.MILLISECONDS);
                long j10 = (long) (i11 % 1000);
                Locale locale = Locale.US;
                String replace2 = replace.replace("[CONTENTPLAYHEAD]", TextUtils.htmlEncode(String.format(locale, "%02d:%02d:%02d.%03d", new Object[]{Long.valueOf(convert / 3600), Long.valueOf((convert % 3600) / 60), Long.valueOf(convert % 60), Long.valueOf(j10)}))).replace("[CACHEBUSTING]", TextUtils.htmlEncode(String.valueOf(new SecureRandom().nextInt(90000000) + 10000000)));
                String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", locale).format(new Date());
                int length2 = format.length() - 2;
                String replace3 = replace2.replace("[TIMESTAMP]", TextUtils.htmlEncode(format.substring(0, length2) + ":" + format.substring(length2)));
                VASTErrorCodes vASTErrorCodes = this.f11672f;
                if (vASTErrorCodes != null) {
                    replace3 = replace3.replace("[ERRORCODE]", String.valueOf(vASTErrorCodes.a()));
                }
                sb2.append(replace3);
                sb2.append(c10.e());
                if (c10.internalParamsIndicator) {
                    obj = null;
                    sb2.append(a.c(a.a(c11, (String) null)));
                } else {
                    obj = null;
                }
                arrayList.add(sb2.toString());
            }
            i10++;
            obj2 = obj;
        }
        return new qc(arrayList, this.f11671e);
    }
}
