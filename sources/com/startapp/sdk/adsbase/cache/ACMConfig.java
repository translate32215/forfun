package com.startapp.sdk.adsbase.cache;

import android.app.Activity;
import com.startapp.ob;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.wb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class ACMConfig implements Serializable {
    private static final long serialVersionUID = 4666931462145537293L;
    private long adCacheTTL = 3600;
    @ob(type = EnumSet.class, value = StartAppAd.AdMode.class)
    private Set<StartAppAd.AdMode> autoLoad = EnumSet.of(StartAppAd.AdMode.FULLPAGE);
    @ob(complex = true)
    private FailuresHandler failuresHandler = new FailuresHandler();
    private boolean localCache = true;
    private int maxCacheSize = 7;
    private long returnAdCacheTTL = 3600;
    private boolean returnAdShouldLoadInBg = true;

    public long a() {
        return TimeUnit.SECONDS.toMillis(this.adCacheTTL);
    }

    public Set<StartAppAd.AdMode> b() {
        return this.autoLoad;
    }

    public FailuresHandler c() {
        return this.failuresHandler;
    }

    public int d() {
        return this.maxCacheSize;
    }

    public long e() {
        return TimeUnit.SECONDS.toMillis(this.returnAdCacheTTL);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ACMConfig aCMConfig = (ACMConfig) obj;
        if (this.adCacheTTL == aCMConfig.adCacheTTL && this.returnAdCacheTTL == aCMConfig.returnAdCacheTTL && this.localCache == aCMConfig.localCache && this.returnAdShouldLoadInBg == aCMConfig.returnAdShouldLoadInBg && this.maxCacheSize == aCMConfig.maxCacheSize && wb.a(this.autoLoad, aCMConfig.autoLoad) && wb.a(this.failuresHandler, aCMConfig.failuresHandler)) {
            return true;
        }
        return false;
    }

    public boolean f() {
        return this.localCache;
    }

    public boolean g() {
        return this.returnAdShouldLoadInBg;
    }

    public int hashCode() {
        Object[] objArr = {Long.valueOf(this.adCacheTTL), Long.valueOf(this.returnAdCacheTTL), this.autoLoad, Boolean.valueOf(this.localCache), Boolean.valueOf(this.returnAdShouldLoadInBg), this.failuresHandler, Integer.valueOf(this.maxCacheSize)};
        Map<Activity, Integer> map = wb.f12765a;
        return Arrays.deepHashCode(objArr);
    }
}
