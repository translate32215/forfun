package com.startapp.sdk.adsbase.remoteconfig;

import android.content.Context;
import com.startapp.e2;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.components.ComponentLocator;
import java.io.Serializable;

/* compiled from: Sta */
public class SimpleTokenConfig implements Serializable {
    private static final long serialVersionUID = 2058698844345650499L;
    private boolean enabled = false;

    public boolean a(Context context) {
        ComponentLocator a10 = ComponentLocator.a(context);
        e d10 = a10.d();
        e2 f10 = a10.f();
        if (d10.getBoolean("userDisabledSimpleToken", false) || !this.enabled || !f10.c()) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.enabled == ((SimpleTokenConfig) obj).enabled) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Boolean.valueOf(this.enabled).hashCode();
    }
}
