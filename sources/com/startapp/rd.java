package com.startapp;

import android.provider.Settings;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import vb.e;
import xb.a;

/* compiled from: Sta */
public class rd extends n {

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f11673k = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a  reason: collision with root package name */
    public final p f11674a;

    /* renamed from: b  reason: collision with root package name */
    public final o f11675b;

    /* renamed from: c  reason: collision with root package name */
    public final List<he> f11676c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public xd f11677d;

    /* renamed from: e  reason: collision with root package name */
    public a f11678e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f11679f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11680g = false;

    /* renamed from: h  reason: collision with root package name */
    public final String f11681h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f11682i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f11683j;

    public rd(o oVar, p pVar) {
        this.f11675b = oVar;
        this.f11674a = pVar;
        this.f11681h = UUID.randomUUID().toString();
        a((View) null);
        this.f11678e = (pVar.a() == vb.a.HTML || pVar.a() == vb.a.JAVASCRIPT) ? new sd(pVar.d()) : new zd(pVar.b(), pVar.c());
        this.f11678e.d();
        pd.a().a(this);
        this.f11678e.a(oVar);
    }

    public void a() {
        if (!this.f11679f) {
            this.f11679f = true;
            pd pdVar = pd.f11607c;
            boolean b10 = pdVar.b();
            pdVar.f11609b.add(this);
            if (!b10) {
                xe a10 = xe.a();
                a10.getClass();
                ae aeVar = ae.f10095d;
                aeVar.f10098c = a10;
                aeVar.f10096a = true;
                aeVar.f10097b = false;
                aeVar.a();
                gb.f10469h.a();
                pe peVar = a10.f12810d;
                peVar.f11614e = peVar.a();
                peVar.b();
                peVar.f11610a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, peVar);
            }
            float f10 = xe.a().f12807a;
            a aVar = this.f11678e;
            re.f11684a.a(aVar.c(), "setDeviceVolume", Float.valueOf(f10));
            this.f11678e.a(this, this.f11674a);
        }
    }

    public final void a(View view) {
        this.f11677d = new xd((View) null);
    }

    public View b() {
        return (View) this.f11677d.get();
    }

    public boolean c() {
        return this.f11679f && !this.f11680g;
    }

    public boolean d() {
        return e.NATIVE == this.f11675b.f11481a;
    }

    public boolean e() {
        return e.NATIVE == this.f11675b.f11482b;
    }
}
