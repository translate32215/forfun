package com.startapp.sdk.adsbase.model;

import com.startapp.ob;
import com.startapp.sdk.adsbase.BaseResponse;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Sta */
public class GetAdResponse extends BaseResponse {
    private static final long serialVersionUID = 1;
    @ob(complex = true)
    private AdInformationOverrides adInfoOverrides = AdInformationOverrides.a();
    @ob(type = ArrayList.class, value = AdDetails.class)
    private List<AdDetails> adsDetails = new ArrayList();
    private boolean inAppBrowser;
    @ob(type = inAppBrowserPreLoad.class)
    private inAppBrowserPreLoad inAppBrowserPreLoad;
    private String productId;
    private String publisherId;

    /* compiled from: Sta */
    public enum inAppBrowserPreLoad {
    }

    public AdInformationOverrides c() {
        return this.adInfoOverrides;
    }

    public List<AdDetails> d() {
        return this.adsDetails;
    }
}
