package com.startapp;

import android.app.Activity;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: Sta */
public class u8 extends a9 {

    /* renamed from: a  reason: collision with root package name */
    public final List<j4> f12659a;

    public u8(List<j4> list) {
        this.f12659a = list;
    }

    public boolean a(Object obj) {
        if (obj instanceof r4) {
            return this.f12659a.contains(((r4) obj).f11653h0.f10534a);
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u8.class != obj.getClass()) {
            return false;
        }
        return wb.a(this.f12659a, ((u8) obj).f12659a);
    }

    public int hashCode() {
        Object[] objArr = {this.f12659a};
        Map<Activity, Integer> map = wb.f12765a;
        return Arrays.deepHashCode(objArr);
    }
}
