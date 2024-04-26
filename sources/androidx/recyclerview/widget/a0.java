package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import n0.d;
import s.f;
import s.i;

/* compiled from: ViewInfoStore */
public class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final i<RecyclerView.a0, a> f3006a = new i<>();

    /* renamed from: b  reason: collision with root package name */
    public final f<RecyclerView.a0> f3007b = new f<>(10);

    /* compiled from: ViewInfoStore */
    public static class a {

        /* renamed from: d  reason: collision with root package name */
        public static d<a> f3008d = new t.d(20, 1);

        /* renamed from: a  reason: collision with root package name */
        public int f3009a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.j.c f3010b;

        /* renamed from: c  reason: collision with root package name */
        public RecyclerView.j.c f3011c;

        public static a a() {
            a aVar = (a) ((t.d) f3008d).b();
            return aVar == null ? new a() : aVar;
        }

        public static void b(a aVar) {
            aVar.f3009a = 0;
            aVar.f3010b = null;
            aVar.f3011c = null;
            ((t.d) f3008d).a(aVar);
        }
    }

    /* compiled from: ViewInfoStore */
    public interface b {
    }

    public void a(RecyclerView.a0 a0Var) {
        a orDefault = this.f3006a.getOrDefault(a0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f3006a.put(a0Var, orDefault);
        }
        orDefault.f3009a |= 1;
    }

    public void b(RecyclerView.a0 a0Var, RecyclerView.j.c cVar) {
        a orDefault = this.f3006a.getOrDefault(a0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f3006a.put(a0Var, orDefault);
        }
        orDefault.f3011c = cVar;
        orDefault.f3009a |= 8;
    }

    public void c(RecyclerView.a0 a0Var, RecyclerView.j.c cVar) {
        a orDefault = this.f3006a.getOrDefault(a0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f3006a.put(a0Var, orDefault);
        }
        orDefault.f3010b = cVar;
        orDefault.f3009a |= 4;
    }

    public boolean d(RecyclerView.a0 a0Var) {
        a orDefault = this.f3006a.getOrDefault(a0Var, null);
        if (orDefault == null || (orDefault.f3009a & 1) == 0) {
            return false;
        }
        return true;
    }

    public final RecyclerView.j.c e(RecyclerView.a0 a0Var, int i10) {
        a l10;
        RecyclerView.j.c cVar;
        int e10 = this.f3006a.e(a0Var);
        if (e10 >= 0 && (l10 = this.f3006a.l(e10)) != null) {
            int i11 = l10.f3009a;
            if ((i11 & i10) != 0) {
                int i12 = (i10 ^ -1) & i11;
                l10.f3009a = i12;
                if (i10 == 4) {
                    cVar = l10.f3010b;
                } else if (i10 == 8) {
                    cVar = l10.f3011c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    this.f3006a.j(e10);
                    a.b(l10);
                }
                return cVar;
            }
        }
        return null;
    }

    public void f(RecyclerView.a0 a0Var) {
        a orDefault = this.f3006a.getOrDefault(a0Var, null);
        if (orDefault != null) {
            orDefault.f3009a &= -2;
        }
    }

    public void g(RecyclerView.a0 a0Var) {
        int j10 = this.f3007b.j() - 1;
        while (true) {
            if (j10 < 0) {
                break;
            } else if (a0Var == this.f3007b.k(j10)) {
                f<RecyclerView.a0> fVar = this.f3007b;
                Object[] objArr = fVar.f24820c;
                Object obj = objArr[j10];
                Object obj2 = f.f24817e;
                if (obj != obj2) {
                    objArr[j10] = obj2;
                    fVar.f24818a = true;
                }
            } else {
                j10--;
            }
        }
        a remove = this.f3006a.remove(a0Var);
        if (remove != null) {
            a.b(remove);
        }
    }
}
