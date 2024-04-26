package com.startapp;

import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Sta */
public class e {

    /* renamed from: d  reason: collision with root package name */
    public static e f10308d = new e();

    /* renamed from: a  reason: collision with root package name */
    public List<d> f10309a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public Map<AdPreferences.Placement, List<d>> f10310b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public Map<String, List<d>> f10311c = new HashMap();

    public static e a() {
        return f10308d;
    }

    public int b() {
        return this.f10309a.size();
    }

    public synchronized void a(d dVar) {
        this.f10309a.add(0, dVar);
        List list = this.f10310b.get(dVar.f10259b);
        if (list == null) {
            list = new ArrayList();
            this.f10310b.put(dVar.f10259b, list);
        }
        list.add(0, dVar);
        List list2 = this.f10311c.get(dVar.f10260c);
        if (list2 == null) {
            list2 = new ArrayList();
            this.f10311c.put(dVar.f10260c, list2);
        }
        list2.add(0, dVar);
    }
}
