package com.startapp.sdk.adsbase.adrules;

import com.startapp.ob;
import java.io.Serializable;

/* compiled from: Sta */
public class AdaptMetaData implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static transient AdaptMetaData f12230a = new AdaptMetaData();
    @ob(complex = true)
    private AdRules adRules = new AdRules();
    private String adaptMetaDataUpdateVersion = "4.10.5";

    private AdaptMetaData() {
    }

    public AdRules a() {
        return this.adRules;
    }
}
