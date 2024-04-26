package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.wb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class RscMetadataItem implements Serializable {
    private static final long serialVersionUID = 1691586261519008915L;
    private String config;
    private Integer ief;
    private Integer limit;
    private int noCache;
    private Integer output;
    private Integer ppid;
    private int[] sortBy;
    private int triggers;
    private Integer ttl;

    public String a() {
        return this.config;
    }

    public Integer b() {
        return this.ief;
    }

    public Integer c() {
        return this.limit;
    }

    public int d() {
        return this.noCache;
    }

    public Integer e() {
        return this.output;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RscMetadataItem rscMetadataItem = (RscMetadataItem) obj;
        if (this.triggers != rscMetadataItem.triggers || this.noCache != rscMetadataItem.noCache || !wb.a(this.config, rscMetadataItem.config) || !wb.a(this.ttl, rscMetadataItem.ttl) || !Arrays.equals(this.sortBy, rscMetadataItem.sortBy) || !wb.a(this.limit, rscMetadataItem.limit) || !wb.a(this.ppid, rscMetadataItem.ppid) || !wb.a(this.output, rscMetadataItem.output) || !wb.a(this.ief, rscMetadataItem.ief)) {
            return false;
        }
        return true;
    }

    public Integer f() {
        return this.ppid;
    }

    public int[] g() {
        return this.sortBy;
    }

    public int h() {
        return this.triggers;
    }

    public int hashCode() {
        Object[] objArr = {this.config, Integer.valueOf(this.triggers), Integer.valueOf(this.noCache), this.ttl, this.sortBy, this.limit, this.ppid, this.output, this.ief};
        Map<Activity, Integer> map = wb.f12765a;
        return Arrays.deepHashCode(objArr);
    }

    public Integer i() {
        return this.ttl;
    }
}
