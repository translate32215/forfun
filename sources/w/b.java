package w;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import v.f;
import v.g;

/* compiled from: BasicMeasure */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<f> f26789a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public a f26790b = new a();

    /* renamed from: c  reason: collision with root package name */
    public g f26791c;

    /* compiled from: BasicMeasure */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f26792a;

        /* renamed from: b  reason: collision with root package name */
        public int f26793b;

        /* renamed from: c  reason: collision with root package name */
        public int f26794c;

        /* renamed from: d  reason: collision with root package name */
        public int f26795d;

        /* renamed from: e  reason: collision with root package name */
        public int f26796e;

        /* renamed from: f  reason: collision with root package name */
        public int f26797f;

        /* renamed from: g  reason: collision with root package name */
        public int f26798g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f26799h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f26800i;

        /* renamed from: j  reason: collision with root package name */
        public int f26801j;
    }

    /* renamed from: w.b$b  reason: collision with other inner class name */
    /* compiled from: BasicMeasure */
    public interface C0268b {
    }

    public b(g gVar) {
        this.f26791c = gVar;
    }

    public final boolean a(C0268b bVar, f fVar, int i10) {
        this.f26790b.f26792a = fVar.m();
        this.f26790b.f26793b = fVar.t();
        this.f26790b.f26794c = fVar.u();
        this.f26790b.f26795d = fVar.l();
        a aVar = this.f26790b;
        aVar.f26800i = false;
        aVar.f26801j = i10;
        boolean z10 = aVar.f26792a == 3;
        boolean z11 = aVar.f26793b == 3;
        boolean z12 = z10 && fVar.Y > 0.0f;
        boolean z13 = z11 && fVar.Y > 0.0f;
        if (z12 && fVar.f26283t[0] == 4) {
            aVar.f26792a = 1;
        }
        if (z13 && fVar.f26283t[1] == 4) {
            aVar.f26793b = 1;
        }
        ((ConstraintLayout.b) bVar).b(fVar, aVar);
        fVar.S(this.f26790b.f26796e);
        fVar.N(this.f26790b.f26797f);
        a aVar2 = this.f26790b;
        fVar.E = aVar2.f26799h;
        fVar.K(aVar2.f26798g);
        a aVar3 = this.f26790b;
        aVar3.f26801j = 0;
        return aVar3.f26800i;
    }

    public final void b(g gVar, int i10, int i11, int i12) {
        int i13 = gVar.f26254d0;
        int i14 = gVar.f26256e0;
        gVar.Q(0);
        gVar.P(0);
        gVar.W = i11;
        int i15 = gVar.f26254d0;
        if (i11 < i15) {
            gVar.W = i15;
        }
        gVar.X = i12;
        int i16 = gVar.f26256e0;
        if (i12 < i16) {
            gVar.X = i16;
        }
        gVar.Q(i13);
        gVar.P(i14);
        g gVar2 = this.f26791c;
        gVar2.f26292u0 = i10;
        gVar2.V();
    }

    public void c(g gVar) {
        this.f26789a.clear();
        int size = gVar.f26307r0.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = gVar.f26307r0.get(i10);
            if (fVar.m() == 3 || fVar.t() == 3) {
                this.f26789a.add(fVar);
            }
        }
        gVar.d0();
    }
}
