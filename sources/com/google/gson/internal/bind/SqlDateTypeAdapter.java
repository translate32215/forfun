package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.t;
import ib.a;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import jb.b;
import jb.c;

public final class SqlDateTypeAdapter extends TypeAdapter<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final t f9879b = new t() {
        public <T> TypeAdapter<T> a(Gson gson, a<T> aVar) {
            if (aVar.f19348a == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final DateFormat f9880a = new SimpleDateFormat("MMM d, yyyy");

    public Object b(jb.a aVar) throws IOException {
        Date date;
        synchronized (this) {
            if (aVar.m0() == b.NULL) {
                aVar.i0();
                date = null;
            } else {
                try {
                    date = new Date(this.f9880a.parse(aVar.k0()).getTime());
                } catch (ParseException e10) {
                    throw new r((Throwable) e10);
                }
            }
        }
        return date;
    }

    public void c(c cVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        synchronized (this) {
            if (date == null) {
                str = null;
            } else {
                str = this.f9880a.format(date);
            }
            cVar.n0(str);
        }
    }
}
