package w;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import t.c;
import v.b;
import v.e;
import v.f;
import v.g;

/* compiled from: WidgetGroup */
public class o {

    /* renamed from: f  reason: collision with root package name */
    public static int f26843f;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<f> f26844a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public int f26845b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f26846c = 0;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<a> f26847d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f26848e = -1;

    /* compiled from: WidgetGroup */
    public class a {
        public a(o oVar, f fVar, c cVar, int i10) {
            new WeakReference(fVar);
            cVar.o(fVar.J);
            cVar.o(fVar.K);
            cVar.o(fVar.L);
            cVar.o(fVar.M);
            cVar.o(fVar.N);
        }
    }

    public o(int i10) {
        int i11 = f26843f;
        f26843f = i11 + 1;
        this.f26845b = i11;
        this.f26846c = i10;
    }

    public boolean a(f fVar) {
        if (this.f26844a.contains(fVar)) {
            return false;
        }
        this.f26844a.add(fVar);
        return true;
    }

    public void b(ArrayList<o> arrayList) {
        int size = this.f26844a.size();
        if (this.f26848e != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = arrayList.get(i10);
                if (this.f26848e == oVar.f26845b) {
                    d(this.f26846c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c(c cVar, int i10) {
        int i11;
        int i12;
        if (this.f26844a.size() == 0) {
            return 0;
        }
        ArrayList<f> arrayList = this.f26844a;
        g gVar = (g) arrayList.get(0).V;
        cVar.u();
        gVar.d(cVar, false);
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            arrayList.get(i13).d(cVar, false);
        }
        if (i10 == 0 && gVar.A0 > 0) {
            b.a(gVar, cVar, arrayList, 0);
        }
        if (i10 == 1 && gVar.B0 > 0) {
            b.a(gVar, cVar, arrayList, 1);
        }
        try {
            cVar.q();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f26847d = new ArrayList<>();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            this.f26847d.add(new a(this, arrayList.get(i14), cVar, i10));
        }
        if (i10 == 0) {
            i11 = cVar.o(gVar.J);
            i12 = cVar.o(gVar.L);
            cVar.u();
        } else {
            i11 = cVar.o(gVar.K);
            i12 = cVar.o(gVar.M);
            cVar.u();
        }
        return i12 - i11;
    }

    public void d(int i10, o oVar) {
        Iterator<f> it = this.f26844a.iterator();
        while (it.hasNext()) {
            f next = it.next();
            oVar.a(next);
            if (i10 == 0) {
                next.f26278p0 = oVar.f26845b;
            } else {
                next.f26280q0 = oVar.f26845b;
            }
        }
        this.f26848e = oVar.f26845b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f26846c;
        sb2.append(i10 == 0 ? "Horizontal" : i10 == 1 ? "Vertical" : i10 == 2 ? "Both" : "Unknown");
        sb2.append(" [");
        String a10 = e.a(sb2, this.f26845b, "] <");
        Iterator<f> it = this.f26844a.iterator();
        while (it.hasNext()) {
            StringBuilder a11 = t.f.a(a10, " ");
            a11.append(it.next().f26266j0);
            a10 = a11.toString();
        }
        return j.f.a(a10, " >");
    }
}
