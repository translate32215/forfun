package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.ob;
import com.startapp.wb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: Sta */
public class AnalyticsCategoryFilterConfig implements Serializable {
    private static final long serialVersionUID = -706642555040875333L;
    @ob(type = ArrayList.class)
    private List<String> excludeAppActivity;
    @ob(type = ArrayList.class)
    private List<String> excludeValues;
    @ob(type = ArrayList.class)
    private List<String> fields;
    @ob(type = ArrayList.class)
    private List<String> includeAppActivity;
    @ob(type = ArrayList.class)
    private List<String> includeValues;
    private String interval;

    public List<String> a() {
        return this.excludeAppActivity;
    }

    public List<String> b() {
        return this.excludeValues;
    }

    public List<String> c() {
        return this.fields;
    }

    public List<String> d() {
        return this.includeAppActivity;
    }

    public List<String> e() {
        return this.includeValues;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnalyticsCategoryFilterConfig analyticsCategoryFilterConfig = (AnalyticsCategoryFilterConfig) obj;
        if (!wb.a(this.includeValues, analyticsCategoryFilterConfig.includeValues) || !wb.a(this.excludeValues, analyticsCategoryFilterConfig.excludeValues) || !wb.a(this.includeAppActivity, analyticsCategoryFilterConfig.includeAppActivity) || !wb.a(this.excludeAppActivity, analyticsCategoryFilterConfig.excludeAppActivity) || !wb.a(this.fields, analyticsCategoryFilterConfig.fields) || !wb.a(this.interval, analyticsCategoryFilterConfig.interval)) {
            return false;
        }
        return true;
    }

    public String f() {
        return this.interval;
    }

    public int hashCode() {
        Object[] objArr = {this.includeValues, this.excludeValues, this.includeAppActivity, this.excludeAppActivity, this.fields, this.interval};
        Map<Activity, Integer> map = wb.f12765a;
        return Arrays.deepHashCode(objArr);
    }
}
