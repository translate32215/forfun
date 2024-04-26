package com.startapp.sdk.adsbase.cache;

import android.app.Activity;
import com.startapp.b1;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.wb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* compiled from: Sta */
public class CacheKey implements Serializable {
    private static final long serialVersionUID = -5317700110100638162L;
    private String adTag;
    private String advertiserId;
    private Set<String> categories;
    private Set<String> categoriesExclude;
    private String country;
    private boolean forceFullpage;
    private boolean forceOfferWall2D;
    private boolean forceOfferWall3D;
    private boolean forceOverlay;
    private Double minCpm;
    private AdPreferences.Placement placement;
    private String productId;
    private String template;
    private boolean testMode;
    private Ad.AdType type;
    private boolean videoMuted;

    public CacheKey(AdPreferences.Placement placement2, AdPreferences adPreferences) {
        this.placement = placement2;
        this.categories = adPreferences.getCategories();
        this.categoriesExclude = adPreferences.getCategoriesExclude();
        this.videoMuted = adPreferences.isVideoMuted();
        this.minCpm = adPreferences.getMinCpm();
        this.forceOfferWall3D = adPreferences.isForceOfferWall3D();
        this.forceOfferWall2D = adPreferences.isForceOfferWall2D();
        this.forceFullpage = adPreferences.isForceFullpage();
        this.forceOverlay = adPreferences.isForceOverlay();
        this.testMode = adPreferences.isTestMode();
        this.adTag = adPreferences.getAdTag();
        this.productId = adPreferences.getCustomProductId();
        this.country = adPreferences.getCountry();
        this.advertiserId = adPreferences.getAdvertiserId();
        this.template = adPreferences.getTemplate();
        this.type = adPreferences.getType();
    }

    public AdPreferences.Placement a() {
        return this.placement;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CacheKey cacheKey = (CacheKey) obj;
        if (this.forceOfferWall3D != cacheKey.forceOfferWall3D || this.forceOfferWall2D != cacheKey.forceOfferWall2D || this.forceFullpage != cacheKey.forceFullpage || this.forceOverlay != cacheKey.forceOverlay || this.testMode != cacheKey.testMode || this.videoMuted != cacheKey.videoMuted || this.placement != cacheKey.placement || !wb.a(this.categories, cacheKey.categories) || !wb.a(this.categoriesExclude, cacheKey.categoriesExclude) || !wb.a(this.minCpm, cacheKey.minCpm) || !wb.a(this.adTag, cacheKey.adTag) || !wb.a(this.productId, cacheKey.productId) || !wb.a(this.country, cacheKey.country) || !wb.a(this.advertiserId, cacheKey.advertiserId) || !wb.a(this.template, cacheKey.template) || this.type != cacheKey.type) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.placement, this.categories, this.categoriesExclude, this.minCpm, Boolean.valueOf(this.forceOfferWall3D), Boolean.valueOf(this.forceOfferWall2D), Boolean.valueOf(this.forceFullpage), Boolean.valueOf(this.forceOverlay), Boolean.valueOf(this.testMode), Boolean.valueOf(this.videoMuted), this.adTag, this.productId, this.country, this.advertiserId, this.template, this.type};
        Map<Activity, Integer> map = wb.f12765a;
        return Arrays.deepHashCode(objArr);
    }

    public String toString() {
        StringBuilder a10 = b1.a("CacheKey [placement=");
        a10.append(this.placement);
        a10.append(", categories=");
        a10.append(this.categories);
        a10.append(", categoriesExclude=");
        a10.append(this.categoriesExclude);
        a10.append(", forceOfferWall3D=");
        a10.append(this.forceOfferWall3D);
        a10.append(", forceOfferWall2D=");
        a10.append(this.forceOfferWall2D);
        a10.append(", forceFullpage=");
        a10.append(this.forceFullpage);
        a10.append(", forceOverlay=");
        a10.append(this.forceOverlay);
        a10.append(", testMode=");
        a10.append(this.testMode);
        a10.append(", minCpm=");
        a10.append(this.minCpm);
        a10.append(", country=");
        a10.append(this.country);
        a10.append(", advertiserId=");
        a10.append(this.advertiserId);
        a10.append(", template=");
        a10.append(this.template);
        a10.append(", type=");
        a10.append(this.type);
        a10.append(", adTag=");
        a10.append(this.adTag);
        a10.append(", productId=");
        a10.append(this.productId);
        a10.append(", videoMuted=");
        a10.append(this.videoMuted);
        a10.append("]");
        return a10.toString();
    }
}
