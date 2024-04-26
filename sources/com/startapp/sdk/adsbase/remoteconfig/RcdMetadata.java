package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.ob;
import com.startapp.sdk.adsbase.remoteconfig.RcdTargets;
import com.startapp.wb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class RcdMetadata implements Serializable {
    private static final long serialVersionUID = -5907202998030810278L;
    private boolean enabled = false;
    private int ief = 0;
    private double iep = 0.0d;
    private double prb = 0.0d;
    @ob(complex = true, parser = RcdTargets.Parser.class)
    private RcdTargets targets;

    public double a() {
        return this.prb;
    }

    public RcdTargets b() {
        return this.targets;
    }

    public boolean c() {
        return this.enabled;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RcdMetadata rcdMetadata = (RcdMetadata) obj;
        if (this.enabled == rcdMetadata.enabled && Double.compare(this.prb, rcdMetadata.prb) == 0 && this.ief == rcdMetadata.ief && Double.compare(this.iep, rcdMetadata.iep) == 0 && wb.a(this.targets, rcdMetadata.targets)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), Double.valueOf(this.prb), Integer.valueOf(this.ief), Double.valueOf(this.iep), this.targets};
        Map<Activity, Integer> map = wb.f12765a;
        return Arrays.deepHashCode(objArr);
    }
}
