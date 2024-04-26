package com.startapp;

import androidx.activity.e;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class d implements Comparable<d> {

    /* renamed from: a  reason: collision with root package name */
    public long f10258a = System.currentTimeMillis();

    /* renamed from: b  reason: collision with root package name */
    public AdPreferences.Placement f10259b;

    /* renamed from: c  reason: collision with root package name */
    public String f10260c;

    public d(AdPreferences.Placement placement, String str) {
        this.f10259b = placement;
        this.f10260c = str == null ? "" : str;
    }

    public int compareTo(Object obj) {
        int i10 = ((this.f10258a - ((d) obj).f10258a) > 0 ? 1 : ((this.f10258a - ((d) obj).f10258a) == 0 ? 0 : -1));
        if (i10 > 0) {
            return 1;
        }
        return i10 == 0 ? 0 : -1;
    }

    public String toString() {
        StringBuilder a10 = b1.a("AdDisplayEvent [displayTime=");
        a10.append(this.f10258a);
        a10.append(", placement=");
        a10.append(this.f10259b);
        a10.append(", adTag=");
        return e.a(a10, this.f10260c, "]");
    }
}
