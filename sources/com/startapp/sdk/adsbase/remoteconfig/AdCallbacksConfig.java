package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.ob;
import com.startapp.wb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Sta */
public class AdCallbacksConfig implements Serializable {
    private static final long serialVersionUID = -4207400392050812703L;
    private boolean logNotSubscribed = false;
    @ob(type = HashSet.class)
    private Set<String> names;

    public boolean a(String str) {
        Set<String> set = this.names;
        if (set == null) {
            return false;
        }
        for (String equals : set) {
            if (str.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdCallbacksConfig adCallbacksConfig = (AdCallbacksConfig) obj;
        if (this.logNotSubscribed != adCallbacksConfig.logNotSubscribed || !wb.a(this.names, adCallbacksConfig.names)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.names, Boolean.valueOf(this.logNotSubscribed)});
    }

    public boolean a() {
        return this.logNotSubscribed;
    }
}
