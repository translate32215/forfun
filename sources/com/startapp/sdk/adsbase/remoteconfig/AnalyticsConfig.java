package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.ob;
import com.startapp.wb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class AnalyticsConfig implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final String f12385a = "https://infoevent.startappservice.com/tracking/infoEvent";
    private static final long serialVersionUID = 8823631221342981507L;
    @ob(complex = true)
    private AdCallbacksConfig adCallbacksConfig = new AdCallbacksConfig();
    @ob(type = ArrayList.class)
    private List<String> admHeaders = Collections.singletonList("Server-Timing");
    private double admPrb = 0.0d;
    @ob(type = HashMap.class, value = AnalyticsCategoryConfig.class)
    private Map<String, AnalyticsCategoryConfig> categories;
    public boolean dns = false;
    private int fuIef;
    public String hostPeriodic;
    public String hostSecured;
    private String noNetworkTimeout;
    private int retryNum = 3;
    private int retryTime = 10;
    private boolean sendHopsOnFirstSucceededSmartRedirect = false;
    private boolean sendViewabilityInfo = false;
    private float succeededSmartRedirectInfoProbability = 0.01f;

    public AnalyticsConfig() {
        String str = f12385a;
        this.hostSecured = str;
        this.hostPeriodic = str;
    }

    public AdCallbacksConfig a() {
        return this.adCallbacksConfig;
    }

    public List<String> b() {
        return this.admHeaders;
    }

    public double c() {
        return this.admPrb;
    }

    public Map<String, AnalyticsCategoryConfig> d() {
        return this.categories;
    }

    public int e() {
        return this.fuIef;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnalyticsConfig analyticsConfig = (AnalyticsConfig) obj;
        if (this.dns == analyticsConfig.dns && this.retryNum == analyticsConfig.retryNum && this.retryTime == analyticsConfig.retryTime && Float.compare(this.succeededSmartRedirectInfoProbability, analyticsConfig.succeededSmartRedirectInfoProbability) == 0 && this.sendHopsOnFirstSucceededSmartRedirect == analyticsConfig.sendHopsOnFirstSucceededSmartRedirect && this.sendViewabilityInfo == analyticsConfig.sendViewabilityInfo && Double.compare(this.admPrb, analyticsConfig.admPrb) == 0 && this.fuIef == analyticsConfig.fuIef && wb.a(this.hostSecured, analyticsConfig.hostSecured) && wb.a(this.hostPeriodic, analyticsConfig.hostPeriodic) && wb.a(this.noNetworkTimeout, analyticsConfig.noNetworkTimeout) && wb.a(this.categories, analyticsConfig.categories) && wb.a(this.admHeaders, analyticsConfig.admHeaders) && wb.a(this.adCallbacksConfig, analyticsConfig.adCallbacksConfig)) {
            return true;
        }
        return false;
    }

    public String f() {
        return this.noNetworkTimeout;
    }

    public int g() {
        return this.retryNum;
    }

    public long h() {
        return TimeUnit.SECONDS.toMillis((long) this.retryTime);
    }

    public int hashCode() {
        Object[] objArr = {this.hostSecured, this.hostPeriodic, Boolean.valueOf(this.dns), Integer.valueOf(this.retryNum), Integer.valueOf(this.retryTime), Float.valueOf(this.succeededSmartRedirectInfoProbability), Boolean.valueOf(this.sendHopsOnFirstSucceededSmartRedirect), this.noNetworkTimeout, this.categories, Boolean.valueOf(this.sendViewabilityInfo), Double.valueOf(this.admPrb), this.admHeaders, Integer.valueOf(this.fuIef), this.adCallbacksConfig};
        Map<Activity, Integer> map = wb.f12765a;
        return Arrays.deepHashCode(objArr);
    }

    public float i() {
        return this.succeededSmartRedirectInfoProbability;
    }

    public boolean j() {
        return this.sendHopsOnFirstSucceededSmartRedirect;
    }

    public boolean k() {
        return this.sendViewabilityInfo;
    }
}
