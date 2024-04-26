package e8;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Log;
import androidx.appcompat.widget.o;
import androidx.leanback.widget.s;
import j4.e;

@TargetApi(16)
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class be0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f13988a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f13989b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f13990c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f13991d;

    /* renamed from: e  reason: collision with root package name */
    public final String f13992e;

    /* renamed from: f  reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f13993f;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0057, code lost:
        if ((e8.eg0.f14479a >= 21 && r4.isFeatureSupported("secure-playback")) != false) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public be0(java.lang.String r2, java.lang.String r3, android.media.MediaCodecInfo.CodecCapabilities r4, boolean r5, boolean r6) {
        /*
            r1 = this;
            r1.<init>()
            r2.getClass()
            r1.f13988a = r2
            r1.f13992e = r3
            r1.f13993f = r4
            r2 = 1
            r3 = 0
            if (r5 != 0) goto L_0x0027
            if (r4 == 0) goto L_0x0027
            int r5 = e8.eg0.f14479a
            r0 = 19
            if (r5 < r0) goto L_0x0022
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r4.isFeatureSupported(r5)
            if (r5 == 0) goto L_0x0022
            r5 = 1
            goto L_0x0023
        L_0x0022:
            r5 = 0
        L_0x0023:
            if (r5 == 0) goto L_0x0027
            r5 = 1
            goto L_0x0028
        L_0x0027:
            r5 = 0
        L_0x0028:
            r1.f13989b = r5
            r5 = 21
            if (r4 == 0) goto L_0x0041
            int r0 = e8.eg0.f14479a
            if (r0 < r5) goto L_0x003c
            java.lang.String r0 = "tunneled-playback"
            boolean r0 = r4.isFeatureSupported(r0)
            if (r0 == 0) goto L_0x003c
            r0 = 1
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            if (r0 == 0) goto L_0x0041
            r0 = 1
            goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            r1.f13990c = r0
            if (r6 != 0) goto L_0x005b
            if (r4 == 0) goto L_0x005a
            int r6 = e8.eg0.f14479a
            if (r6 < r5) goto L_0x0056
            java.lang.String r5 = "secure-playback"
            boolean r4 = r4.isFeatureSupported(r5)
            if (r4 == 0) goto L_0x0056
            r4 = 1
            goto L_0x0057
        L_0x0056:
            r4 = 0
        L_0x0057:
            if (r4 == 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r2 = 0
        L_0x005b:
            r1.f13991d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.be0.<init>(java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):void");
    }

    @TargetApi(21)
    public static boolean b(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        if (d10 == -1.0d || d10 <= 0.0d) {
            return videoCapabilities.isSizeSupported(i10, i11);
        }
        return videoCapabilities.areSizeAndRateSupported(i10, i11, d10);
    }

    @TargetApi(21)
    public final boolean a(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f13993f;
        if (codecCapabilities == null) {
            c("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            c("sizeAndRate.vCaps");
            return false;
        } else if (b(videoCapabilities, i10, i11, d10)) {
            return true;
        } else {
            if (i10 >= i11 || !b(videoCapabilities, i11, i10, d10)) {
                StringBuilder sb2 = new StringBuilder(69);
                sb2.append("sizeAndRate.support, ");
                sb2.append(i10);
                sb2.append("x");
                sb2.append(i11);
                sb2.append("x");
                sb2.append(d10);
                c(sb2.toString());
                return false;
            }
            StringBuilder sb3 = new StringBuilder(69);
            sb3.append("sizeAndRate.rotated, ");
            sb3.append(i10);
            sb3.append("x");
            sb3.append(i11);
            sb3.append("x");
            sb3.append(d10);
            String sb4 = sb3.toString();
            String str = this.f13988a;
            String str2 = this.f13992e;
            String str3 = eg0.f14483e;
            StringBuilder a10 = e.a(o.a(str3, o.a(str2, o.a(str, o.a(sb4, 25)))), "AssumedSupport [", sb4, "] [", str);
            s.a(a10, ", ", str2, "] [", str3);
            a10.append("]");
            Log.d("MediaCodecInfo", a10.toString());
            return true;
        }
    }

    public final void c(String str) {
        String str2 = this.f13988a;
        String str3 = this.f13992e;
        String str4 = eg0.f14483e;
        StringBuilder a10 = e.a(o.a(str4, o.a(str3, o.a(str2, o.a(str, 20)))), "NoSupport [", str, "] [", str2);
        s.a(a10, ", ", str3, "] [", str4);
        a10.append("]");
        Log.d("MediaCodecInfo", a10.toString());
    }
}
