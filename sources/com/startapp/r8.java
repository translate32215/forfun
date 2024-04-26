package com.startapp;

import android.app.Activity;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class r8 extends a9 {

    /* renamed from: a  reason: collision with root package name */
    public final int f11664a;

    public r8(int i10) {
        this.f11664a = i10;
    }

    public boolean a(Object obj) {
        if (!(obj instanceof y0)) {
            return false;
        }
        int i10 = ((y0) obj).Z;
        if ((this.f11664a & i10) == i10) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r8.class == obj.getClass() && this.f11664a == ((r8) obj).f11664a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = {Integer.valueOf(this.f11664a)};
        Map<Activity, Integer> map = wb.f12765a;
        return Arrays.deepHashCode(objArr);
    }
}
