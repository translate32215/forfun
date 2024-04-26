package o1;

import android.os.Bundle;
import be.c;
import be.j;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.ListIterator;
import kd.o;
import o1.r;
import ud.k;
import ud.l;

/* compiled from: Navigator.kt */
public abstract class d0<D extends r> {

    /* renamed from: a  reason: collision with root package name */
    public f0 f22667a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f22668b;

    /* compiled from: Navigator.kt */
    public interface a {
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* compiled from: Navigator.kt */
    public @interface b {
        String value();
    }

    /* compiled from: Navigator.kt */
    public static final class c extends l implements td.l<h, h> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ d0<D> f22669b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ x f22670c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ a f22671d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(d0<D> d0Var, x xVar, a aVar) {
            super(1);
            this.f22669b = d0Var;
            this.f22670c = xVar;
            this.f22671d = aVar;
        }

        public Object c(Object obj) {
            h hVar = (h) obj;
            k.f(hVar, "backStackEntry");
            r rVar = hVar.f22696b;
            if (!(rVar instanceof r)) {
                rVar = null;
            }
            if (rVar == null) {
                return null;
            }
            r c10 = this.f22669b.c(rVar, hVar.f22697c, this.f22670c, this.f22671d);
            if (c10 == null) {
                hVar = null;
            } else if (!k.a(c10, rVar)) {
                hVar = this.f22669b.b().a(c10, c10.f(hVar.f22697c));
            }
            return hVar;
        }
    }

    /* compiled from: Navigator.kt */
    public static final class d extends l implements td.l<y, o> {

        /* renamed from: b  reason: collision with root package name */
        public static final d f22672b = new d();

        public d() {
            super(1);
        }

        public Object c(Object obj) {
            y yVar = (y) obj;
            k.f(yVar, "$this$navOptions");
            yVar.f22847b = true;
            return o.f20627a;
        }
    }

    public abstract D a();

    public final f0 b() {
        f0 f0Var = this.f22667a;
        if (f0Var != null) {
            return f0Var;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    public r c(D d10, Bundle bundle, x xVar, a aVar) {
        return d10;
    }

    public void d(List<h> list, x xVar, a aVar) {
        k.f(list, "entries");
        c.a aVar2 = new c.a(new be.c(new be.l(ld.l.j(list), new c(this, xVar, aVar)), false, j.f3916b));
        while (aVar2.hasNext()) {
            b().d((h) aVar2.next());
        }
    }

    public void e(f0 f0Var) {
        this.f22667a = f0Var;
        this.f22668b = true;
    }

    public void f(h hVar) {
        r rVar = hVar.f22696b;
        if (!(rVar instanceof r)) {
            rVar = null;
        }
        if (rVar != null) {
            c(rVar, (Bundle) null, e.a.f(d.f22672b), (a) null);
            b().b(hVar);
        }
    }

    public void g(Bundle bundle) {
    }

    public Bundle h() {
        return null;
    }

    public void i(h hVar, boolean z10) {
        k.f(hVar, "popUpTo");
        List value = b().f22685e.getValue();
        if (value.contains(hVar)) {
            ListIterator listIterator = value.listIterator(value.size());
            h hVar2 = null;
            while (j()) {
                hVar2 = (h) listIterator.previous();
                if (k.a(hVar2, hVar)) {
                    break;
                }
            }
            if (hVar2 != null) {
                b().c(hVar2, z10);
                return;
            }
            return;
        }
        throw new IllegalStateException(("popBackStack was called with " + hVar + " which does not exist in back stack " + value).toString());
    }

    public boolean j() {
        return true;
    }
}
