package p000if;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.fragment.app.p;
import gf.f;
import gf.l;
import hf.g2;
import hf.i;
import jf.t;
import kd.o;
import ud.k;

/* renamed from: if.g  reason: invalid package */
/* compiled from: module.kt */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final l.g f19412a = new l.g("⁣androidXContextTranslators", false, (String) null, a.f19413b, 6);

    /* renamed from: if.g$a */
    /* compiled from: module.kt */
    public static final class a extends ud.l implements td.l<l.b, o> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f19413b = new a();

        public a() {
            super(1);
        }

        public Object c(Object obj) {
            l.b bVar = (l.b) obj;
            k.g(bVar, "$receiver");
            l.b.a.d(bVar, i.f19014a, false, 2, (Object) null);
            bVar.g(new t(new f(p.class), new f(Activity.class), d.f19409b));
            bVar.g(new t(new f(m1.a.class), new f(Context.class), e.f19410b));
            bVar.g(new t(new f(androidx.lifecycle.b.class), new f(Application.class), f.f19411b));
            return o.f20627a;
        }
    }

    /* renamed from: if.g$b */
    /* compiled from: module.kt */
    public static final class b extends ud.l implements td.l<l.b, o> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Application f19414b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Application application) {
            super(1);
            this.f19414b = application;
        }

        public Object c(Object obj) {
            l.b bVar = (l.b) obj;
            k.g(bVar, "$receiver");
            l.b.a.d(bVar, g.f19412a, false, 2, (Object) null);
            Application application = this.f19414b;
            l.g gVar = i.f19014a;
            k.g(application, "app");
            l.b.a.d(bVar, new l.g("⁣androidModule", false, (String) null, new g2(application), 6), false, 2, (Object) null);
            return o.f20627a;
        }
    }

    public static final l.g a(Application application) {
        k.g(application, "app");
        return new l.g("⁣androidXModule", false, (String) null, new b(application), 6);
    }
}
