package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TypeAdapters;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: GsonBuilder */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public Excluder f9823a = Excluder.f9833f;

    /* renamed from: b  reason: collision with root package name */
    public s f9824b = s.DEFAULT;

    /* renamed from: c  reason: collision with root package name */
    public d f9825c = c.IDENTITY;

    /* renamed from: d  reason: collision with root package name */
    public final Map<Type, f<?>> f9826d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final List<t> f9827e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final List<t> f9828f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public int f9829g = 2;

    /* renamed from: h  reason: collision with root package name */
    public int f9830h = 2;

    /* renamed from: i  reason: collision with root package name */
    public boolean f9831i = true;

    public Gson a() {
        ArrayList arrayList = new ArrayList(this.f9828f.size() + this.f9827e.size() + 3);
        arrayList.addAll(this.f9827e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f9828f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        int i10 = this.f9829g;
        int i11 = this.f9830h;
        if (!(i10 == 2 || i11 == 2)) {
            DefaultDateTypeAdapter defaultDateTypeAdapter = new DefaultDateTypeAdapter(Date.class, i10, i11);
            DefaultDateTypeAdapter defaultDateTypeAdapter2 = new DefaultDateTypeAdapter(Timestamp.class, i10, i11);
            DefaultDateTypeAdapter defaultDateTypeAdapter3 = new DefaultDateTypeAdapter(java.sql.Date.class, i10, i11);
            arrayList.add(TypeAdapters.a(Date.class, defaultDateTypeAdapter));
            arrayList.add(TypeAdapters.a(Timestamp.class, defaultDateTypeAdapter2));
            arrayList.add(TypeAdapters.a(java.sql.Date.class, defaultDateTypeAdapter3));
        }
        return new Gson(this.f9823a, this.f9825c, this.f9826d, false, false, false, this.f9831i, false, false, false, this.f9824b, (String) null, this.f9829g, this.f9830h, this.f9827e, this.f9828f, arrayList);
    }
}
