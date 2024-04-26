package com.startapp;

import com.startapp.k4;
import com.startapp.m4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Sta */
public class j4 {

    /* renamed from: c  reason: collision with root package name */
    public static final Map<String, j4> f10586c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final j4 f10587d;

    /* renamed from: e  reason: collision with root package name */
    public static final j4 f10588e;

    /* renamed from: f  reason: collision with root package name */
    public static final j4 f10589f;

    /* renamed from: g  reason: collision with root package name */
    public static final j4 f10590g;

    /* renamed from: h  reason: collision with root package name */
    public static final j4 f10591h;

    /* renamed from: i  reason: collision with root package name */
    public static final j4 f10592i;

    /* renamed from: j  reason: collision with root package name */
    public static final j4 f10593j;

    /* renamed from: k  reason: collision with root package name */
    public static final j4 f10594k;

    /* renamed from: l  reason: collision with root package name */
    public static final j4 f10595l;

    /* renamed from: m  reason: collision with root package name */
    public static final j4 f10596m;

    /* renamed from: n  reason: collision with root package name */
    public static final j4 f10597n;

    /* renamed from: o  reason: collision with root package name */
    public static final j4 f10598o;

    /* renamed from: p  reason: collision with root package name */
    public static final j4 f10599p;

    /* renamed from: q  reason: collision with root package name */
    public static final j4 f10600q;

    /* renamed from: r  reason: collision with root package name */
    public static final j4 f10601r;

    /* renamed from: a  reason: collision with root package name */
    public final String f10602a;

    /* renamed from: b  reason: collision with root package name */
    public final k4 f10603b;

    static {
        k4.a aVar = new k4.a();
        aVar.f10789b = 23;
        aVar.f10790c = 50;
        aVar.f10791d = true;
        m4.a aVar2 = new m4.a();
        String[] strArr = {"initialize"};
        List list = aVar2.f10872a;
        if (list == null) {
            list = new ArrayList();
            aVar2.f10872a = list;
        }
        m4.a a10 = aVar2.a(strArr, list).a("value");
        a10.f10875d = "8h";
        k4.a a11 = aVar.a(new m4(a10));
        m4.a a12 = new m4.a().a("value", "details");
        a12.f10875d = "30m";
        k4.a a13 = a11.a(new m4(a12));
        m4.a a14 = new m4.a().a("value");
        a14.f10875d = "10s";
        k4.a a15 = a13.a(new m4(a14));
        a15.f10792e = "2h";
        a15.f10793f = "2s";
        f10587d = new j4("general", new k4(a15));
        k4.a aVar3 = new k4.a();
        aVar3.f10789b = 17;
        aVar3.f10790c = 20;
        aVar3.f10791d = true;
        m4.a aVar4 = new m4.a();
        String[] strArr2 = {"fake_click"};
        List list2 = aVar4.f10873b;
        if (list2 == null) {
            list2 = new ArrayList();
            aVar4.f10873b = list2;
        }
        m4.a a16 = aVar4.a(strArr2, list2).a("appActivity", "value", "details");
        a16.f10875d = "30m";
        k4.a a17 = aVar3.a(new m4(a16));
        m4.a aVar5 = new m4.a();
        String[] strArr3 = {"fake_click"};
        List list3 = aVar5.f10873b;
        if (list3 == null) {
            list3 = new ArrayList();
            aVar5.f10873b = list3;
        }
        m4.a a18 = aVar5.a(strArr3, list3).a("appActivity", "value");
        a18.f10875d = "10s";
        k4.a a19 = a17.a(new m4(a18));
        a19.f10792e = "4h";
        a19.f10793f = "5s";
        f10588e = new j4("error", new k4(a19));
        k4.a aVar6 = new k4.a();
        aVar6.f10788a = 0.0d;
        aVar6.f10789b = 17;
        aVar6.f10790c = 30;
        aVar6.f10791d = true;
        m4.a a20 = new m4.a().a("appActivity", "value", "details");
        a20.f10875d = "12h";
        k4.a a21 = aVar6.a(new m4(a20));
        m4.a a22 = new m4.a().a("appActivity", "value");
        a22.f10875d = "1h";
        k4.a a23 = a21.a(new m4(a22));
        a23.f10792e = "1d";
        a23.f10793f = "5s";
        k4 k4Var = new k4(a23);
        f10589f = new j4("exception", k4Var);
        f10590g = new j4("exception_nt", k4Var);
        k4.a aVar7 = new k4.a();
        aVar7.f10789b = 17;
        aVar7.f10790c = 40;
        aVar7.f10791d = true;
        m4.a a24 = new m4.a().a("value", "details");
        a24.f10875d = "1h";
        k4.a a25 = aVar7.a(new m4(a24));
        a25.f10792e = "2d";
        a25.f10793f = "5s";
        f10591h = new j4("exception_fatal", new k4(a25));
        f10592i = new j4("anr", k4Var);
        k4.a aVar8 = new k4.a();
        aVar8.f10788a = 0.0d;
        aVar8.f10789b = 17;
        aVar8.f10790c = 10;
        aVar8.f10791d = false;
        aVar8.f10793f = "10s";
        f10593j = new j4("netdiag", new k4(aVar8));
        k4.a aVar9 = new k4.a();
        aVar9.f10789b = 3071;
        aVar9.f10790c = 90;
        aVar9.f10791d = true;
        m4.a a26 = new m4.a().a("service");
        a26.f10875d = "1m";
        k4.a a27 = aVar9.a(new m4(a26));
        a27.f10792e = "1h";
        f10594k = new j4("periodic", new k4(a27));
        k4.a aVar10 = new k4.a();
        aVar10.f10790c = 90;
        aVar10.f10791d = true;
        aVar10.f10792e = "4h";
        f10595l = new j4("nonimpression", new k4(aVar10));
        k4.a aVar11 = new k4.a();
        aVar11.f10789b = 17;
        aVar11.f10790c = 10;
        aVar11.f10791d = true;
        aVar11.f10792e = "4h";
        f10596m = new j4("impression_responses", new k4(aVar11));
        k4.a aVar12 = new k4.a();
        aVar12.f10788a = 0.0d;
        aVar12.f10789b = 17;
        aVar12.f10790c = 60;
        aVar12.f10791d = true;
        aVar12.f10792e = "1d";
        aVar12.f10793f = "5s";
        f10597n = new j4("success_smart_redirect_hop_info", new k4(aVar12));
        k4.a aVar13 = new k4.a();
        aVar13.f10789b = 17;
        aVar13.f10790c = 70;
        aVar13.f10791d = false;
        f10598o = new j4("triggeredLink", new k4(aVar13));
        k4.a aVar14 = new k4.a();
        aVar14.f10789b = 23;
        aVar14.f10790c = 80;
        aVar14.f10791d = true;
        aVar14.f10792e = "1d";
        f10599p = new j4("ct", new k4(aVar14));
        k4.a aVar15 = new k4.a();
        aVar15.f10789b = 23;
        aVar15.f10790c = 80;
        aVar15.f10791d = true;
        aVar15.f10792e = "1d";
        f10600q = new j4("lt", new k4(aVar15));
        k4.a aVar16 = new k4.a();
        aVar16.f10789b = 23;
        aVar16.f10790c = 80;
        aVar16.f10791d = true;
        aVar16.f10792e = "1d";
        f10601r = new j4("nir", new k4(aVar16));
    }

    public j4(String str, k4 k4Var) {
        this.f10602a = str;
        this.f10603b = k4Var;
        ((HashMap) f10586c).put(str, this);
    }

    public String a() {
        return this.f10602a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j4.class != obj.getClass()) {
            return false;
        }
        return wb.a(this.f10602a, ((j4) obj).f10602a);
    }

    public int hashCode() {
        return this.f10602a.hashCode();
    }

    public String toString() {
        return this.f10602a;
    }

    public static j4 a(String str) {
        return (j4) ((HashMap) f10586c).get(str);
    }
}
