package com.startapp.sdk.adsbase.cache;

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
public class CacheMetaData implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static volatile CacheMetaData f12244a = new CacheMetaData();
    private static final long serialVersionUID = -5733696220222242321L;
    @ob(complex = true)
    private ACMConfig ACM = new ACMConfig();
    private String cacheMetaDataUpdateVersion = "4.10.5";
    private float sendCacheSizeProb = 20.0f;

    public static CacheMetaData b() {
        return f12244a;
    }

    public ACMConfig a() {
        return this.ACM;
    }

    public float c() {
        return this.sendCacheSizeProb;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CacheMetaData cacheMetaData = (CacheMetaData) obj;
        if (Float.compare(cacheMetaData.sendCacheSizeProb, this.sendCacheSizeProb) != 0 || !wb.a(this.ACM, cacheMetaData.ACM) || !wb.a(this.cacheMetaDataUpdateVersion, cacheMetaData.cacheMetaDataUpdateVersion)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.ACM, Float.valueOf(this.sendCacheSizeProb), this.cacheMetaDataUpdateVersion};
        Map<Activity, Integer> map = wb.f12765a;
        return Arrays.deepHashCode(objArr);
    }

    public static void a(Context context, CacheMetaData cacheMetaData) {
        cacheMetaData.cacheMetaDataUpdateVersion = "4.10.5";
        f12244a = cacheMetaData;
        z2.a(context, "StartappCacheMetadata", (Serializable) cacheMetaData);
    }

    public static void a(Context context) {
        CacheMetaData cacheMetaData = (CacheMetaData) z2.a(context, "StartappCacheMetadata", CacheMetaData.class);
        CacheMetaData cacheMetaData2 = new CacheMetaData();
        if (cacheMetaData != null) {
            boolean b10 = wb.b(cacheMetaData, cacheMetaData2);
            if (!(!"4.10.5".equals(cacheMetaData.cacheMetaDataUpdateVersion)) && b10) {
                i4 i4Var = new i4(j4.f10588e);
                i4Var.f10537d = "metadata_null";
                i4Var.a();
            }
            f12244a = cacheMetaData;
            return;
        }
        f12244a = cacheMetaData2;
    }
}
