package com.startapp.sdk.adsbase.adinformation;

import android.app.Activity;
import android.content.Context;
import com.startapp.i4;
import com.startapp.j4;
import com.startapp.ob;
import com.startapp.sdk.adsbase.adinformation.AdInformationConfig;
import com.startapp.wb;
import com.startapp.z2;
import java.io.Serializable;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: Sta */
public class AdInformationMetaData implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static volatile AdInformationMetaData f12183a = new AdInformationMetaData();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f12184b = new Object();
    private static final long serialVersionUID = -6352184674890532240L;
    @ob(complex = true)
    private AdInformationConfig AdInformation = AdInformationConfig.a();
    private String adInformationMetadataUpdateVersion = "4.10.5";

    public AdInformationConfig a() {
        return this.AdInformation;
    }

    public String b() {
        return this.AdInformation.d();
    }

    public String c() {
        AdInformationConfig adInformationConfig = this.AdInformation;
        EnumMap<AdInformationConfig.ImageResourceType, ImageResourceConfig> enumMap = adInformationConfig.f12182a;
        AdInformationConfig.ImageResourceType imageResourceType = AdInformationConfig.ImageResourceType.INFO_L;
        return (!enumMap.containsKey(imageResourceType) || adInformationConfig.f12182a.get(imageResourceType).b().equals("")) ? "https://info.startappservice.com/InApp/resources/info_l.png" : adInformationConfig.f12182a.get(imageResourceType).b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdInformationMetaData adInformationMetaData = (AdInformationMetaData) obj;
        if (!wb.a(this.AdInformation, adInformationMetaData.AdInformation) || !wb.a(this.adInformationMetadataUpdateVersion, adInformationMetaData.adInformationMetadataUpdateVersion)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.AdInformation, this.adInformationMetadataUpdateVersion};
        Map<Activity, Integer> map = wb.f12765a;
        return Arrays.deepHashCode(objArr);
    }

    public static void a(Context context) {
        AdInformationMetaData adInformationMetaData = (AdInformationMetaData) z2.a(context, "StartappAdInfoMetadata", AdInformationMetaData.class);
        AdInformationMetaData adInformationMetaData2 = new AdInformationMetaData();
        if (adInformationMetaData != null) {
            boolean b10 = wb.b(adInformationMetaData, adInformationMetaData2);
            if (!(!"4.10.5".equals(adInformationMetaData.adInformationMetadataUpdateVersion)) && b10) {
                i4 i4Var = new i4(j4.f10588e);
                i4Var.f10537d = "metadata_null";
                i4Var.a();
            }
            AdInformationConfig adInformationConfig = adInformationMetaData.AdInformation;
            adInformationConfig.getClass();
            adInformationConfig.f12182a = new EnumMap<>(AdInformationConfig.ImageResourceType.class);
            f12183a = adInformationMetaData;
        } else {
            f12183a = adInformationMetaData2;
        }
        f12183a.AdInformation.a(context);
    }

    public static void a(Context context, AdInformationMetaData adInformationMetaData) {
        synchronized (f12184b) {
            adInformationMetaData.adInformationMetadataUpdateVersion = "4.10.5";
            f12183a = adInformationMetaData;
            AdInformationConfig.a(f12183a.AdInformation);
            f12183a.AdInformation.a(context);
            z2.a(context, "StartappAdInfoMetadata", (Serializable) adInformationMetaData);
        }
    }
}
