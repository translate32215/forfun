package z5;

import android.os.Handler;
import android.os.Looper;
import c5.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import u6.i;
import x4.c1;
import z5.r;
import z5.v;

/* compiled from: BaseMediaSource */
public abstract class a implements r {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<r.b> f28509a = new ArrayList<>(1);

    /* renamed from: b  reason: collision with root package name */
    public final HashSet<r.b> f28510b = new HashSet<>(1);

    /* renamed from: c  reason: collision with root package name */
    public final v.a f28511c = new v.a();

    /* renamed from: d  reason: collision with root package name */
    public final j.a f28512d = new j.a();

    /* renamed from: e  reason: collision with root package name */
    public Looper f28513e;

    /* renamed from: f  reason: collision with root package name */
    public c1 f28514f;

    public final void b(r.b bVar) {
        this.f28509a.remove(bVar);
        if (this.f28509a.isEmpty()) {
            this.f28513e = null;
            this.f28514f = null;
            this.f28510b.clear();
            w();
            return;
        }
        j(bVar);
    }

    public /* synthetic */ boolean d() {
        return q.b(this);
    }

    public /* synthetic */ c1 e() {
        return q.a(this);
    }

    public final void f(r.b bVar, i iVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f28513e;
        v6.a.a(looper == null || looper == myLooper);
        c1 c1Var = this.f28514f;
        this.f28509a.add(bVar);
        if (this.f28513e == null) {
            this.f28513e = myLooper;
            this.f28510b.add(bVar);
            u(iVar);
        } else if (c1Var != null) {
            p(bVar);
            bVar.a(this, c1Var);
        }
    }

    public final void h(Handler handler, v vVar) {
        v.a aVar = this.f28511c;
        aVar.getClass();
        aVar.f28650c.add(new v.a.C0289a(handler, vVar));
    }

    public final void i(Handler handler, j jVar) {
        j.a aVar = this.f28512d;
        aVar.getClass();
        aVar.f4332c.add(new j.a.C0061a(handler, jVar));
    }

    public final void j(r.b bVar) {
        boolean z10 = !this.f28510b.isEmpty();
        this.f28510b.remove(bVar);
        if (z10 && this.f28510b.isEmpty()) {
            s();
        }
    }

    public final void l(v vVar) {
        v.a aVar = this.f28511c;
        Iterator<v.a.C0289a> it = aVar.f28650c.iterator();
        while (it.hasNext()) {
            v.a.C0289a next = it.next();
            if (next.f28653b == vVar) {
                aVar.f28650c.remove(next);
            }
        }
    }

    public final void p(r.b bVar) {
        this.f28513e.getClass();
        boolean isEmpty = this.f28510b.isEmpty();
        this.f28510b.add(bVar);
        if (isEmpty) {
            t();
        }
    }

    public final j.a q(r.a aVar) {
        return this.f28512d.g(0, (r.a) null);
    }

    public final v.a r(r.a aVar) {
        return this.f28511c.r(0, (r.a) null, 0);
    }

    public void s() {
    }

    public void t() {
    }

    public abstract void u(i iVar);

    public final void v(c1 c1Var) {
        this.f28514f = c1Var;
        Iterator<r.b> it = this.f28509a.iterator();
        while (it.hasNext()) {
            it.next().a(this, c1Var);
        }
    }

    public abstract void w();
}
