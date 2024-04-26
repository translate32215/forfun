package com.startapp.sdk.adsbase;

import com.startapp.b1;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import j.f;

/* compiled from: Sta */
public class AdsConstants {

    /* renamed from: a  reason: collision with root package name */
    public static final String f12099a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f12100b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f12101c = "trackdownload";

    /* renamed from: d  reason: collision with root package name */
    public static final String f12102d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f12103e = "https://imp.startappservice.com/tracking/adImpression";

    /* renamed from: f  reason: collision with root package name */
    public static final Boolean f12104f;

    /* renamed from: g  reason: collision with root package name */
    public static final Boolean f12105g;

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f12106h = {"back_", "back_dark", "browser_icon_dark", "forward_", "forward_dark", "x_dark"};

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f12107i = {"empty_star", "filled_star", "half_star"};

    /* compiled from: Sta */
    public enum AdApiType {
        HTML,
        JSON
    }

    static {
        String str = "get";
        StringBuilder a10 = b1.a(str);
        a10.append("ads");
        f12099a = a10.toString();
        StringBuilder a11 = b1.a(str);
        a11.append("htmlad");
        f12100b = a11.toString();
        StringBuilder a12 = b1.a(str);
        a12.append("adsmetadata");
        f12102d = a12.toString();
        Boolean bool = Boolean.FALSE;
        f12104f = bool;
        f12105g = bool;
    }

    public static String a(AdApiType adApiType, AdPreferences.Placement placement) {
        String str;
        String str2;
        String str3;
        int ordinal = adApiType.ordinal();
        String str4 = null;
        if (ordinal == 0) {
            str3 = f12100b;
            str2 = MetaData.f12393k.a(placement);
        } else if (ordinal != 1) {
            str = null;
            return f.a(str4, str);
        } else {
            str3 = f12099a;
            str2 = MetaData.f12393k.a(placement);
        }
        str = str3;
        str4 = str2;
        return f.a(str4, str);
    }
}
