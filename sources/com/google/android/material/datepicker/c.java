package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.webkit.WebView;
import com.startapp.startappsdk.R;
import e.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import mb.b;
import t2.g;
import t8.a;

/* compiled from: CalendarStyle */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f9148a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f9149b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f9150c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f9151d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f9152e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f9153f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f9154g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f9155h;

    public c(g gVar, WebView webView, String str, List list, String str2, String str3, b bVar) {
        ArrayList arrayList = new ArrayList();
        this.f9150c = arrayList;
        this.f9151d = new HashMap();
        this.f9148a = gVar;
        this.f9149b = webView;
        this.f9152e = str;
        this.f9155h = bVar;
        if (list != null) {
            arrayList.addAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String uuid = UUID.randomUUID().toString();
                ((Map) this.f9151d).put(uuid, (mb.g) it.next());
            }
        }
        this.f9154g = str2;
        this.f9153f = str3;
    }

    public static c a(g gVar, String str, List<mb.g> list, String str2, String str3) {
        d.a(gVar, "Partner is null");
        d.a(str, "OM SDK JS script content is null");
        d.a(list, "VerificationScriptResources is null");
        return new c(gVar, (WebView) null, str, list, (String) null, (String) null, b.NATIVE);
    }

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(p9.b.c(context, R.attr.materialCalendarStyle, g.class.getCanonicalName()), a.f25851r);
        this.f9148a = b.a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.f9154g = b.a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.f9149b = b.a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f9150c = b.a(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList a10 = p9.c.a(context, obtainStyledAttributes, 6);
        this.f9151d = b.a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f9152e = b.a(context, obtainStyledAttributes.getResourceId(7, 0));
        this.f9153f = b.a(context, obtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.f9155h = paint;
        paint.setColor(a10.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
