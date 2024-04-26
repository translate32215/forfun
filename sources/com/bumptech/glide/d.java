package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import c4.e;
import com.bumptech.glide.b;
import d4.f;
import java.util.List;
import java.util.Map;
import m3.l;
import n3.b;

/* compiled from: GlideContext */
public class d extends ContextWrapper {

    /* renamed from: k  reason: collision with root package name */
    public static final j<?, ?> f4907k = new a();

    /* renamed from: a  reason: collision with root package name */
    public final b f4908a;

    /* renamed from: b  reason: collision with root package name */
    public final g f4909b;

    /* renamed from: c  reason: collision with root package name */
    public final f f4910c;

    /* renamed from: d  reason: collision with root package name */
    public final b.a f4911d;

    /* renamed from: e  reason: collision with root package name */
    public final List<e<Object>> f4912e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<Class<?>, j<?, ?>> f4913f;

    /* renamed from: g  reason: collision with root package name */
    public final l f4914g;

    /* renamed from: h  reason: collision with root package name */
    public final e f4915h;

    /* renamed from: i  reason: collision with root package name */
    public final int f4916i;

    /* renamed from: j  reason: collision with root package name */
    public c4.f f4917j;

    public d(Context context, n3.b bVar, g gVar, f fVar, b.a aVar, Map<Class<?>, j<?, ?>> map, List<e<Object>> list, l lVar, e eVar, int i10) {
        super(context.getApplicationContext());
        this.f4908a = bVar;
        this.f4909b = gVar;
        this.f4910c = fVar;
        this.f4911d = aVar;
        this.f4912e = list;
        this.f4913f = map;
        this.f4914g = lVar;
        this.f4915h = eVar;
        this.f4916i = i10;
    }
}
