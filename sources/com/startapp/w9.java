package com.startapp;

import android.app.Activity;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Sta */
public class w9 {

    /* renamed from: a  reason: collision with root package name */
    public final Map<a, String> f12760a = new ConcurrentHashMap();

    /* compiled from: Sta */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final AdPreferences.Placement f12761a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12762b;

        public a(AdPreferences.Placement placement, int i10) {
            this.f12761a = placement;
            this.f12762b = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f12762b == aVar.f12762b && this.f12761a == aVar.f12761a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            Object[] objArr = {this.f12761a, Integer.valueOf(this.f12762b)};
            Map<Activity, Integer> map = wb.f12765a;
            return Arrays.deepHashCode(objArr);
        }
    }
}
