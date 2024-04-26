package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.yq;
import com.startapp.b4;
import e8.z70;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ar implements z70 {

    /* renamed from: a  reason: collision with root package name */
    public static final z70 f5973a = new ar();

    public final boolean a(int i10) {
        yq.g gVar;
        switch (i10) {
            case 0:
                gVar = yq.g.UNKNOWN;
                break;
            case 1:
                gVar = yq.g.URL_PHISHING;
                break;
            case 2:
                gVar = yq.g.URL_MALWARE;
                break;
            case 3:
                gVar = yq.g.URL_UNWANTED;
                break;
            case 4:
                gVar = yq.g.CLIENT_SIDE_PHISHING_URL;
                break;
            case 5:
                gVar = yq.g.CLIENT_SIDE_MALWARE_URL;
                break;
            case 6:
                gVar = yq.g.DANGEROUS_DOWNLOAD_RECOVERY;
                break;
            case 7:
                gVar = yq.g.DANGEROUS_DOWNLOAD_WARNING;
                break;
            case b4.f10106f /*8*/:
                gVar = yq.g.OCTAGON_AD;
                break;
            case 9:
                gVar = yq.g.OCTAGON_AD_SB_MATCH;
                break;
            default:
                gVar = null;
                break;
        }
        return gVar != null;
    }
}
