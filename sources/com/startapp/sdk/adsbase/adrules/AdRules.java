package com.startapp.sdk.adsbase.adrules;

import android.app.Activity;
import com.startapp.e;
import com.startapp.ob;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.wb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Sta */
public class AdRules implements Serializable {
    private static final long serialVersionUID = 9050956736420299872L;

    /* renamed from: a  reason: collision with root package name */
    public transient Set<Class<? extends AdRule>> f12229a = new HashSet();
    private boolean applyOnBannerRefresh = true;
    @ob(innerValue = AdRule.class, key = AdPreferences.Placement.class, type = HashMap.class, value = ArrayList.class)
    private Map<AdPreferences.Placement, List<AdRule>> placements = new HashMap();
    @ob(type = ArrayList.class, value = AdRule.class)
    private List<AdRule> session = new ArrayList();
    @ob(innerValue = AdRule.class, type = HashMap.class, value = ArrayList.class)
    private Map<String, List<AdRule>> tags = new HashMap();

    public boolean a() {
        return this.applyOnBannerRefresh;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdRules adRules = (AdRules) obj;
        if (this.applyOnBannerRefresh != adRules.applyOnBannerRefresh || !wb.a(this.session, adRules.session) || !wb.a(this.placements, adRules.placements) || !wb.a(this.tags, adRules.tags)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.session, this.placements, this.tags, Boolean.valueOf(this.applyOnBannerRefresh)};
        Map<Activity, Integer> map = wb.f12765a;
        return Arrays.deepHashCode(objArr);
    }

    public synchronized AdRulesResult a(AdPreferences.Placement placement, String str) {
        AdRulesResult a10;
        this.f12229a.clear();
        a10 = a(this.tags.get(str), e.f10308d.f10311c.get(str), AdRuleLevel.TAG);
        if (a10.b()) {
            AdRuleLevel adRuleLevel = AdRuleLevel.PLACEMENT;
            placement.toString();
            a10 = a(this.placements.get(placement), e.f10308d.f10310b.get(placement), adRuleLevel);
            if (a10.b()) {
                a10 = a(this.session, e.f10308d.f10309a, AdRuleLevel.SESSION);
            }
        }
        return a10;
    }

    public final AdRulesResult a(List list, List list2, AdRuleLevel adRuleLevel) {
        if (list == null) {
            return new AdRulesResult(true, "");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AdRule adRule = (AdRule) it.next();
            if (adRule.f12224a || !this.f12229a.contains(adRule.getClass())) {
                if (!adRule.a(list2)) {
                    return new AdRulesResult(false, adRule.getClass().getSimpleName() + "_" + adRuleLevel + "");
                }
                this.f12229a.add(adRule.getClass());
            }
        }
        return new AdRulesResult(true, "");
    }
}
