package mf;

import com.google.gson.Gson;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import ke.c0;
import ke.e0;
import lf.f0;
import lf.j;

/* compiled from: GsonConverterFactory */
public final class a extends j.a {

    /* renamed from: a  reason: collision with root package name */
    public final Gson f21805a;

    public a(Gson gson) {
        this.f21805a = gson;
    }

    public j<?, c0> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, f0 f0Var) {
        return new b(this.f21805a, this.f21805a.c(new ib.a(type)));
    }

    public j<e0, ?> b(Type type, Annotation[] annotationArr, f0 f0Var) {
        return new c(this.f21805a, this.f21805a.c(new ib.a(type)));
    }
}
