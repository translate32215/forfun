package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.t;
import ib.a;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import jb.b;
import jb.c;

public final class TimeTypeAdapter extends TypeAdapter<Time> {

    /* renamed from: b  reason: collision with root package name */
    public static final t f9881b = new t() {
        public <T> TypeAdapter<T> a(Gson gson, a<T> aVar) {
            if (aVar.f19348a == Time.class) {
                return new TimeTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final DateFormat f9882a = new SimpleDateFormat("hh:mm:ss a");

    public Object b(jb.a aVar) throws IOException {
        synchronized (this) {
            if (aVar.m0() == b.NULL) {
                aVar.i0();
                return null;
            }
            try {
                Time time = new Time(this.f9882a.parse(aVar.k0()).getTime());
                return time;
            } catch (ParseException e10) {
                throw new r((Throwable) e10);
            }
        }
    }

    public void c(c cVar, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        synchronized (this) {
            if (time == null) {
                str = null;
            } else {
                str = this.f9882a.format(time);
            }
            cVar.n0(str);
        }
    }
}
