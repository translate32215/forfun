package mf;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import jb.c;
import ke.a0;
import ke.c0;
import ke.u;
import lf.j;
import ve.e;
import ve.f;

/* compiled from: GsonRequestBodyConverter */
public final class b<T> implements j<T, c0> {

    /* renamed from: c  reason: collision with root package name */
    public static final u f21806c = u.b("application/json; charset=UTF-8");

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f21807d = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final Gson f21808a;

    /* renamed from: b  reason: collision with root package name */
    public final TypeAdapter<T> f21809b;

    public b(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f21808a = gson;
        this.f21809b = typeAdapter;
    }

    public Object a(Object obj) throws IOException {
        f fVar = new f();
        c e10 = this.f21808a.e(new OutputStreamWriter(new e(fVar), f21807d));
        this.f21809b.c(e10, obj);
        e10.close();
        return new a0(f21806c, fVar.T());
    }
}
