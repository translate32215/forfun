package com.startapp;

import android.app.Activity;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* compiled from: Sta */
public class d7 {

    /* renamed from: a  reason: collision with root package name */
    public String f10296a;

    /* renamed from: b  reason: collision with root package name */
    public String f10297b;

    /* renamed from: c  reason: collision with root package name */
    public Set<String> f10298c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d7.class != obj.getClass()) {
            return false;
        }
        return this.f10296a.equals(((d7) obj).f10296a);
    }

    public int hashCode() {
        Object[] objArr = {this.f10296a};
        Map<Activity, Integer> map = wb.f12765a;
        return Arrays.deepHashCode(objArr);
    }

    public String toString() {
        StringBuilder a10 = b1.a("NameValueObject [name=");
        a10.append(this.f10296a);
        a10.append(", value=");
        a10.append(this.f10297b);
        a10.append(", valueSet=");
        a10.append(this.f10298c);
        a10.append("]");
        return a10.toString();
    }
}
