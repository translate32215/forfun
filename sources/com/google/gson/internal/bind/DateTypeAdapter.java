package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.p;
import com.google.gson.internal.u;
import com.google.gson.r;
import com.google.gson.t;
import ib.a;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import jb.b;
import jb.c;

public final class DateTypeAdapter extends TypeAdapter<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final t f9858b = new t() {
        public <T> TypeAdapter<T> a(Gson gson, a<T> aVar) {
            if (aVar.f19348a == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final List<DateFormat> f9859a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f9859a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (p.f9958a >= 9) {
            arrayList.add(u.a(2, 2));
        }
    }

    public Object b(jb.a aVar) throws IOException {
        if (aVar.m0() == b.NULL) {
            aVar.i0();
            return null;
        }
        String k02 = aVar.k0();
        synchronized (this) {
            for (DateFormat parse : this.f9859a) {
                try {
                    Date parse2 = parse.parse(k02);
                    return parse2;
                } catch (ParseException unused) {
                }
            }
            try {
                Date b10 = gb.a.b(k02, new ParsePosition(0));
                return b10;
            } catch (ParseException e10) {
                throw new r(k02, e10);
            }
        }
    }

    public void c(c cVar, Object obj) throws IOException {
        Date date = (Date) obj;
        synchronized (this) {
            if (date == null) {
                cVar.M();
            } else {
                cVar.n0(this.f9859a.get(0).format(date));
            }
        }
    }
}
