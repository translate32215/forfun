package com.startapp;

import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryFilterConfig;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Sta */
public class m4 {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f10866a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f10867b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f10868c;

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f10869d;

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f10870e;

    /* renamed from: f  reason: collision with root package name */
    public final long f10871f;

    /* compiled from: Sta */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public List<String> f10872a;

        /* renamed from: b  reason: collision with root package name */
        public List<String> f10873b;

        /* renamed from: c  reason: collision with root package name */
        public List<String> f10874c;

        /* renamed from: d  reason: collision with root package name */
        public String f10875d;

        public List<String> a() {
            return this.f10873b;
        }

        public List<String> b() {
            return this.f10874c;
        }

        public List<String> c() {
            return this.f10872a;
        }

        public String d() {
            return this.f10875d;
        }

        public a a(String... strArr) {
            List list = this.f10874c;
            if (list == null) {
                list = new ArrayList();
                this.f10874c = list;
            }
            return a(strArr, list);
        }

        public final a a(String[] strArr, List<String> list) {
            for (String str : strArr) {
                if (str != null) {
                    list.add(str);
                }
            }
            return this;
        }
    }

    public m4(a aVar) {
        this.f10866a = wb.b(aVar.c());
        this.f10867b = wb.b(aVar.a());
        this.f10868c = wb.b((List) null);
        this.f10869d = wb.b((List) null);
        this.f10870e = wb.b(aVar.b());
        this.f10871f = Math.max(0, wb.e(aVar.d()));
    }

    public static List<m4> a(List<AnalyticsCategoryFilterConfig> list) {
        ArrayList arrayList = null;
        if (list == null) {
            return null;
        }
        for (AnalyticsCategoryFilterConfig next : list) {
            if (next != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList(list.size());
                }
                arrayList.add(new m4(next));
            }
        }
        return arrayList != null ? wb.b(arrayList) : arrayList;
    }

    public m4(AnalyticsCategoryFilterConfig analyticsCategoryFilterConfig) {
        this.f10866a = wb.b(analyticsCategoryFilterConfig.e());
        this.f10867b = wb.b(analyticsCategoryFilterConfig.b());
        this.f10868c = wb.b(analyticsCategoryFilterConfig.d());
        this.f10869d = wb.b(analyticsCategoryFilterConfig.a());
        this.f10870e = wb.b(analyticsCategoryFilterConfig.c());
        this.f10871f = Math.max(0, wb.e(analyticsCategoryFilterConfig.f()));
    }
}
