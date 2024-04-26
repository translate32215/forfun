package com.google.gson;

import com.google.gson.internal.p;
import com.google.gson.internal.u;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import jb.a;
import jb.b;
import jb.c;

final class DefaultDateTypeAdapter extends TypeAdapter<Date> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<? extends Date> f9802a;

    /* renamed from: b  reason: collision with root package name */
    public final List<DateFormat> f9803b;

    public DefaultDateTypeAdapter(Class<? extends Date> cls, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f9803b = arrayList;
        d(cls);
        this.f9802a = cls;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (p.f9958a >= 9) {
            arrayList.add(u.a(i10, i11));
        }
    }

    public static Class<? extends Date> d(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    public Object b(a aVar) throws IOException {
        Date date;
        Object date2;
        if (aVar.m0() == b.NULL) {
            aVar.i0();
            return null;
        }
        String k02 = aVar.k0();
        synchronized (this.f9803b) {
            for (DateFormat parse : this.f9803b) {
                try {
                    date = parse.parse(k02);
                    break;
                } catch (ParseException unused) {
                }
            }
            try {
                date = gb.a.b(k02, new ParsePosition(0));
            } catch (ParseException e10) {
                throw new r(k02, e10);
            }
        }
        Class<? extends Date> cls = this.f9802a;
        if (cls == Date.class) {
            return date;
        }
        if (cls == Timestamp.class) {
            date2 = new Timestamp(date.getTime());
        } else if (cls == java.sql.Date.class) {
            date2 = new java.sql.Date(date.getTime());
        } else {
            throw new AssertionError();
        }
        return date2;
    }

    public void c(c cVar, Object obj) throws IOException {
        Date date = (Date) obj;
        if (date == null) {
            cVar.M();
            return;
        }
        synchronized (this.f9803b) {
            cVar.n0(this.f9803b.get(0).format(date));
        }
    }

    public String toString() {
        DateFormat dateFormat = this.f9803b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            StringBuilder a10 = android.support.v4.media.a.a("DefaultDateTypeAdapter(");
            a10.append(((SimpleDateFormat) dateFormat).toPattern());
            a10.append(')');
            return a10.toString();
        }
        StringBuilder a11 = android.support.v4.media.a.a("DefaultDateTypeAdapter(");
        a11.append(dateFormat.getClass().getSimpleName());
        a11.append(')');
        return a11.toString();
    }
}
