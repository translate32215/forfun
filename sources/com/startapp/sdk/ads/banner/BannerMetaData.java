package com.startapp.sdk.ads.banner;

import android.app.Activity;
import android.content.Context;
import com.startapp.i4;
import com.startapp.j4;
import com.startapp.ob;
import com.startapp.wb;
import com.startapp.z2;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class BannerMetaData implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static Object f11747a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile BannerMetaData f11748b = new BannerMetaData();
    private static final long serialVersionUID = -6987543640616659467L;
    @ob(complex = true)
    private BannerOptions BannerOptions = new BannerOptions();
    private String bannerMetadataUpdateVersion = "4.10.5";

    public BannerOptions a() {
        return this.BannerOptions;
    }

    public BannerOptions b() {
        return new BannerOptions(this.BannerOptions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BannerMetaData bannerMetaData = (BannerMetaData) obj;
        if (!wb.a(this.BannerOptions, bannerMetaData.BannerOptions) || !wb.a(this.bannerMetadataUpdateVersion, bannerMetaData.bannerMetadataUpdateVersion)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.BannerOptions, this.bannerMetadataUpdateVersion};
        Map<Activity, Integer> map = wb.f12765a;
        return Arrays.deepHashCode(objArr);
    }

    public static void a(Context context, BannerMetaData bannerMetaData) {
        synchronized (f11747a) {
            bannerMetaData.bannerMetadataUpdateVersion = "4.10.5";
            f11748b = bannerMetaData;
            z2.a(context, "StartappBannerMetadata", (Serializable) bannerMetaData);
        }
    }

    public static void a(Context context) {
        BannerMetaData bannerMetaData = (BannerMetaData) z2.a(context, "StartappBannerMetadata", BannerMetaData.class);
        BannerMetaData bannerMetaData2 = new BannerMetaData();
        if (bannerMetaData != null) {
            boolean b10 = wb.b(bannerMetaData, bannerMetaData2);
            if (!(!"4.10.5".equals(bannerMetaData.bannerMetadataUpdateVersion)) && b10) {
                i4 i4Var = new i4(j4.f10588e);
                i4Var.f10537d = "metadata_null";
                i4Var.a();
            }
            f11748b = bannerMetaData;
            return;
        }
        f11748b = bannerMetaData2;
    }
}
