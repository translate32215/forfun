package com.startapp.sdk.ads.splash;

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
public class SplashMetaData implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static volatile SplashMetaData f11907a = new SplashMetaData();

    /* renamed from: b  reason: collision with root package name */
    public static Object f11908b = new Object();
    private static final long serialVersionUID = 5949259263399692883L;
    @ob(complex = true)
    private SplashConfig SplashConfig = new SplashConfig();
    private String splashMetadataUpdateVersion = "4.10.5";

    public SplashConfig a() {
        return this.SplashConfig;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SplashMetaData splashMetaData = (SplashMetaData) obj;
        if (!wb.a(this.SplashConfig, splashMetaData.SplashConfig) || !wb.a(this.splashMetadataUpdateVersion, splashMetaData.splashMetadataUpdateVersion)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.SplashConfig, this.splashMetadataUpdateVersion};
        Map<Activity, Integer> map = wb.f12765a;
        return Arrays.deepHashCode(objArr);
    }

    public static void a(Context context, SplashMetaData splashMetaData) {
        synchronized (f11908b) {
            splashMetaData.splashMetadataUpdateVersion = "4.10.5";
            f11907a = splashMetaData;
            z2.a(context, "StartappSplashMetadata", (Serializable) splashMetaData);
        }
    }

    public static void a(Context context) {
        SplashMetaData splashMetaData = (SplashMetaData) z2.a(context, "StartappSplashMetadata", SplashMetaData.class);
        SplashMetaData splashMetaData2 = new SplashMetaData();
        if (splashMetaData != null) {
            boolean b10 = wb.b(splashMetaData, splashMetaData2);
            if (!(!"4.10.5".equals(splashMetaData.splashMetadataUpdateVersion)) && b10) {
                i4 i4Var = new i4(j4.f10588e);
                i4Var.f10537d = "metadata_null";
                i4Var.a();
            }
            f11907a = splashMetaData;
            return;
        }
        f11907a = splashMetaData2;
    }
}
