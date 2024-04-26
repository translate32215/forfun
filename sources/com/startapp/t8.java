package com.startapp;

import android.app.Activity;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class t8 extends a9 {

    /* renamed from: a  reason: collision with root package name */
    public final j4 f12615a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12616b;

    public t8(j4 j4Var, String str) {
        this.f12615a = j4Var;
        this.f12616b = str;
    }

    public boolean a(Object obj) {
        if (!(obj instanceof r4)) {
            return false;
        }
        j4 j4Var = this.f12615a;
        i4 i4Var = ((r4) obj).f11653h0;
        if (j4Var != i4Var.f10534a) {
            return false;
        }
        String str = this.f12616b;
        if (str == null || str.equals(i4Var.f10537d)) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t8.class != obj.getClass()) {
            return false;
        }
        t8 t8Var = (t8) obj;
        if (!wb.a(this.f12615a, t8Var.f12615a) || !wb.a(this.f12616b, t8Var.f12616b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.f12615a, this.f12616b};
        Map<Activity, Integer> map = wb.f12765a;
        return Arrays.deepHashCode(objArr);
    }
}
