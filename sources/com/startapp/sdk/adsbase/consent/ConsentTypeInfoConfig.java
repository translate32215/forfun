package com.startapp.sdk.adsbase.consent;

import android.app.Activity;
import com.startapp.wb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public final class ConsentTypeInfoConfig implements Serializable {
    private static final long serialVersionUID = -2671083367770989563L;
    private Integer falseClick;
    private Integer impression;
    private Integer trueClick;

    public Integer a() {
        return this.falseClick;
    }

    public Integer b() {
        return this.impression;
    }

    public Integer c() {
        return this.trueClick;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ConsentTypeInfoConfig.class != obj.getClass()) {
            return false;
        }
        ConsentTypeInfoConfig consentTypeInfoConfig = (ConsentTypeInfoConfig) obj;
        if (!wb.a(this.impression, consentTypeInfoConfig.impression) || !wb.a(this.trueClick, consentTypeInfoConfig.trueClick) || !wb.a(this.falseClick, consentTypeInfoConfig.falseClick)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.impression, this.trueClick, this.falseClick};
        Map<Activity, Integer> map = wb.f12765a;
        return Arrays.deepHashCode(objArr);
    }
}
