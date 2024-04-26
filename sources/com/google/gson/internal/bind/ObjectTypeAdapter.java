package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.s;
import com.google.gson.t;
import ib.a;
import java.io.IOException;
import java.util.ArrayList;
import jb.c;

public final class ObjectTypeAdapter extends TypeAdapter<Object> {

    /* renamed from: b  reason: collision with root package name */
    public static final t f9867b = new t() {
        public <T> TypeAdapter<T> a(Gson gson, a<T> aVar) {
            if (aVar.f19348a == Object.class) {
                return new ObjectTypeAdapter(gson);
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final Gson f9868a;

    public ObjectTypeAdapter(Gson gson) {
        this.f9868a = gson;
    }

    public Object b(jb.a aVar) throws IOException {
        int ordinal = aVar.m0().ordinal();
        if (ordinal == 0) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.G()) {
                arrayList.add(b(aVar));
            }
            aVar.s();
            return arrayList;
        } else if (ordinal == 2) {
            s sVar = new s();
            aVar.d();
            while (aVar.G()) {
                sVar.put(aVar.g0(), b(aVar));
            }
            aVar.t();
            return sVar;
        } else if (ordinal == 5) {
            return aVar.k0();
        } else {
            if (ordinal == 6) {
                return Double.valueOf(aVar.T());
            }
            if (ordinal == 7) {
                return Boolean.valueOf(aVar.N());
            }
            if (ordinal == 8) {
                aVar.i0();
                return null;
            }
            throw new IllegalStateException();
        }
    }

    public void c(c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.M();
            return;
        }
        Gson gson = this.f9868a;
        Class<?> cls = obj.getClass();
        gson.getClass();
        TypeAdapter c10 = gson.c(new a(cls));
        if (c10 instanceof ObjectTypeAdapter) {
            cVar.i();
            cVar.t();
            return;
        }
        c10.c(cVar, obj);
    }
}
