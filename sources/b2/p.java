package b2;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.d0;
import b2.j;
import java.util.ArrayList;
import java.util.Iterator;
import p.g;
import t.f;

/* compiled from: TransitionSet */
public class p extends j {
    public ArrayList<j> F = new ArrayList<>();
    public boolean G = true;
    public int H;
    public boolean I = false;
    public int J = 0;

    /* compiled from: TransitionSet */
    public class a extends m {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j f3436a;

        public a(p pVar, j jVar) {
            this.f3436a = jVar;
        }

        public void e(j jVar) {
            this.f3436a.A();
            jVar.x(this);
        }
    }

    /* compiled from: TransitionSet */
    public static class b extends m {

        /* renamed from: a  reason: collision with root package name */
        public p f3437a;

        public b(p pVar) {
            this.f3437a = pVar;
        }

        public void a(j jVar) {
            p pVar = this.f3437a;
            if (!pVar.I) {
                pVar.H();
                this.f3437a.I = true;
            }
        }

        public void e(j jVar) {
            p pVar = this.f3437a;
            int i10 = pVar.H - 1;
            pVar.H = i10;
            if (i10 == 0) {
                pVar.I = false;
                pVar.n();
            }
            jVar.x(this);
        }
    }

    public void A() {
        if (this.F.isEmpty()) {
            H();
            n();
            return;
        }
        b bVar = new b(this);
        Iterator<j> it = this.F.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.H = this.F.size();
        if (!this.G) {
            for (int i10 = 1; i10 < this.F.size(); i10++) {
                this.F.get(i10 - 1).a(new a(this, this.F.get(i10)));
            }
            j jVar = this.F.get(0);
            if (jVar != null) {
                jVar.A();
                return;
            }
            return;
        }
        Iterator<j> it2 = this.F.iterator();
        while (it2.hasNext()) {
            it2.next().A();
        }
    }

    public /* bridge */ /* synthetic */ j B(long j10) {
        O(j10);
        return this;
    }

    public void C(j.c cVar) {
        this.A = cVar;
        this.J |= 8;
        int size = this.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.F.get(i10).C(cVar);
        }
    }

    public /* bridge */ /* synthetic */ j D(TimeInterpolator timeInterpolator) {
        P(timeInterpolator);
        return this;
    }

    public void E(g gVar) {
        if (gVar == null) {
            this.B = j.D;
        } else {
            this.B = gVar;
        }
        this.J |= 4;
        if (this.F != null) {
            for (int i10 = 0; i10 < this.F.size(); i10++) {
                this.F.get(i10).E(gVar);
            }
        }
    }

    public void F(o oVar) {
        this.J |= 2;
        int size = this.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.F.get(i10).F(oVar);
        }
    }

    public j G(long j10) {
        this.f3403b = j10;
        return this;
    }

    public String I(String str) {
        String I2 = super.I(str);
        for (int i10 = 0; i10 < this.F.size(); i10++) {
            StringBuilder a10 = f.a(I2, "\n");
            a10.append(this.F.get(i10).I(str + "  "));
            I2 = a10.toString();
        }
        return I2;
    }

    public p K(j jVar) {
        this.F.add(jVar);
        jVar.f3410i = this;
        long j10 = this.f3404c;
        if (j10 >= 0) {
            jVar.B(j10);
        }
        if ((this.J & 1) != 0) {
            jVar.D(this.f3405d);
        }
        if ((this.J & 2) != 0) {
            jVar.F((o) null);
        }
        if ((this.J & 4) != 0) {
            jVar.E(this.B);
        }
        if ((this.J & 8) != 0) {
            jVar.C(this.A);
        }
        return this;
    }

    public j L(int i10) {
        if (i10 < 0 || i10 >= this.F.size()) {
            return null;
        }
        return this.F.get(i10);
    }

    public p O(long j10) {
        ArrayList<j> arrayList;
        this.f3404c = j10;
        if (j10 >= 0 && (arrayList = this.F) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.F.get(i10).B(j10);
            }
        }
        return this;
    }

    public p P(TimeInterpolator timeInterpolator) {
        this.J |= 1;
        ArrayList<j> arrayList = this.F;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.F.get(i10).D(timeInterpolator);
            }
        }
        this.f3405d = timeInterpolator;
        return this;
    }

    public p Q(int i10) {
        if (i10 == 0) {
            this.G = true;
        } else if (i10 == 1) {
            this.G = false;
        } else {
            throw new AndroidRuntimeException(d0.a("Invalid parameter for TransitionSet ordering: ", i10));
        }
        return this;
    }

    public j a(j.d dVar) {
        super.a(dVar);
        return this;
    }

    public j b(View view) {
        for (int i10 = 0; i10 < this.F.size(); i10++) {
            this.F.get(i10).b(view);
        }
        this.f3407f.add(view);
        return this;
    }

    public void cancel() {
        super.cancel();
        int size = this.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.F.get(i10).cancel();
        }
    }

    public void d(r rVar) {
        if (u(rVar.f3442b)) {
            Iterator<j> it = this.F.iterator();
            while (it.hasNext()) {
                j next = it.next();
                if (next.u(rVar.f3442b)) {
                    next.d(rVar);
                    rVar.f3443c.add(next);
                }
            }
        }
    }

    public void f(r rVar) {
        int size = this.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.F.get(i10).f(rVar);
        }
    }

    public void g(r rVar) {
        if (u(rVar.f3442b)) {
            Iterator<j> it = this.F.iterator();
            while (it.hasNext()) {
                j next = it.next();
                if (next.u(rVar.f3442b)) {
                    next.g(rVar);
                    rVar.f3443c.add(next);
                }
            }
        }
    }

    /* renamed from: k */
    public j clone() {
        p pVar = (p) super.clone();
        pVar.F = new ArrayList<>();
        int size = this.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            j k10 = this.F.get(i10).clone();
            pVar.F.add(k10);
            k10.f3410i = pVar;
        }
        return pVar;
    }

    public void m(ViewGroup viewGroup, g gVar, g gVar2, ArrayList<r> arrayList, ArrayList<r> arrayList2) {
        long j10 = this.f3403b;
        int size = this.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = this.F.get(i10);
            if (j10 > 0 && (this.G || i10 == 0)) {
                long j11 = jVar.f3403b;
                if (j11 > 0) {
                    jVar.G(j11 + j10);
                } else {
                    jVar.G(j10);
                }
            }
            jVar.m(viewGroup, gVar, gVar2, arrayList, arrayList2);
        }
    }

    public void w(View view) {
        super.w(view);
        int size = this.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.F.get(i10).w(view);
        }
    }

    public j x(j.d dVar) {
        super.x(dVar);
        return this;
    }

    public j y(View view) {
        for (int i10 = 0; i10 < this.F.size(); i10++) {
            this.F.get(i10).y(view);
        }
        this.f3407f.remove(view);
        return this;
    }

    public void z(View view) {
        super.z(view);
        int size = this.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.F.get(i10).z(view);
        }
    }
}
