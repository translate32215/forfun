package mf;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.k;
import java.io.IOException;
import java.io.Reader;
import jb.a;
import jb.b;
import ke.e0;
import ke.u;
import lf.j;
import ve.h;

/* compiled from: GsonResponseBodyConverter */
public final class c<T> implements j<e0, T> {

    /* renamed from: a  reason: collision with root package name */
    public final Gson f21810a;

    /* renamed from: b  reason: collision with root package name */
    public final TypeAdapter<T> f21811b;

    public c(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f21810a = gson;
        this.f21811b = typeAdapter;
    }

    public Object a(Object obj) throws IOException {
        e0 e0Var = (e0) obj;
        Gson gson = this.f21810a;
        Reader reader = e0Var.f20689a;
        if (reader == null) {
            h o10 = e0Var.o();
            u d10 = e0Var.d();
            reader = new e0.b(o10, d10 != null ? d10.a(le.c.f21269i) : le.c.f21269i);
            e0Var.f20689a = reader;
        }
        gson.getClass();
        a aVar = new a(reader);
        aVar.p0(gson.f9814j);
        try {
            T b10 = this.f21811b.b(aVar);
            if (aVar.m0() == b.END_DOCUMENT) {
                return b10;
            }
            throw new k("JSON document was not fully consumed.");
        } finally {
            e0Var.close();
        }
    }
}
