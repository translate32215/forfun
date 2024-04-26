package hf;

import ae.g;
import android.content.Context;
import kd.d;
import kd.e;
import ud.l;

/* compiled from: closest.kt */
public final class c implements b<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final td.a<Context> f18989a;

    /* compiled from: closest.kt */
    public static final class a extends l implements td.a<gf.l> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c f18990b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f18991c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, Object obj) {
            super(0);
            this.f18990b = cVar;
            this.f18991c = obj;
        }

        public Object d() {
            return p.a.a(this.f18991c, this.f18990b.f18989a.d());
        }
    }

    public c(td.a<? extends Context> aVar) {
        this.f18989a = aVar;
    }

    public d<gf.l> a(Object obj, g<?> gVar) {
        return e.b(new a(this, obj));
    }
}
