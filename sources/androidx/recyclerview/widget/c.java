package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import o0.c0;

/* compiled from: ChildHelper */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f3012a;

    /* renamed from: b  reason: collision with root package name */
    public final a f3013b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final List<View> f3014c = new ArrayList();

    /* compiled from: ChildHelper */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f3015a = 0;

        /* renamed from: b  reason: collision with root package name */
        public a f3016b;

        public void a(int i10) {
            if (i10 >= 64) {
                a aVar = this.f3016b;
                if (aVar != null) {
                    aVar.a(i10 - 64);
                    return;
                }
                return;
            }
            this.f3015a &= (1 << i10) ^ -1;
        }

        public int b(int i10) {
            a aVar = this.f3016b;
            if (aVar == null) {
                if (i10 >= 64) {
                    return Long.bitCount(this.f3015a);
                }
                return Long.bitCount(this.f3015a & ((1 << i10) - 1));
            } else if (i10 < 64) {
                return Long.bitCount(this.f3015a & ((1 << i10) - 1));
            } else {
                return Long.bitCount(this.f3015a) + aVar.b(i10 - 64);
            }
        }

        public final void c() {
            if (this.f3016b == null) {
                this.f3016b = new a();
            }
        }

        public boolean d(int i10) {
            if (i10 < 64) {
                return (this.f3015a & (1 << i10)) != 0;
            }
            c();
            return this.f3016b.d(i10 - 64);
        }

        public void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f3016b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f3015a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f3015a = ((j10 & (j11 ^ -1)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f3016b != null) {
                c();
                this.f3016b.e(0, z11);
            }
        }

        public boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f3016b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f3015a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (j10 ^ -1);
            this.f3015a = j12;
            long j13 = j10 - 1;
            this.f3015a = (j12 & j13) | Long.rotateRight((j13 ^ -1) & j12, 1);
            a aVar = this.f3016b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f3016b.f(0);
            }
            return z10;
        }

        public void g() {
            this.f3015a = 0;
            a aVar = this.f3016b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void h(int i10) {
            if (i10 >= 64) {
                c();
                this.f3016b.h(i10 - 64);
                return;
            }
            this.f3015a |= 1 << i10;
        }

        public String toString() {
            if (this.f3016b == null) {
                return Long.toBinaryString(this.f3015a);
            }
            return this.f3016b.toString() + "xx" + Long.toBinaryString(this.f3015a);
        }
    }

    /* compiled from: ChildHelper */
    public interface b {
    }

    public c(b bVar) {
        this.f3012a = bVar;
    }

    public void a(View view, int i10, boolean z10) {
        int i11;
        if (i10 < 0) {
            i11 = ((t) this.f3012a).b();
        } else {
            i11 = f(i10);
        }
        this.f3013b.e(i11, z10);
        if (z10) {
            i(view);
        }
        t tVar = (t) this.f3012a;
        tVar.f3138a.addView(view, i11);
        RecyclerView recyclerView = tVar.f3138a;
        recyclerView.getClass();
        RecyclerView.a0 L = RecyclerView.L(view);
        RecyclerView.e eVar = recyclerView.f2826t;
        if (eVar != null && L != null) {
            eVar.i(L);
        }
    }

    public void b(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int i11;
        if (i10 < 0) {
            i11 = ((t) this.f3012a).b();
        } else {
            i11 = f(i10);
        }
        this.f3013b.e(i11, z10);
        if (z10) {
            i(view);
        }
        t tVar = (t) this.f3012a;
        tVar.getClass();
        RecyclerView.a0 L = RecyclerView.L(view);
        if (L != null) {
            if (L.q() || L.x()) {
                L.f2851j &= -257;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Called attach on a child which is not detached: ");
                sb2.append(L);
                throw new IllegalArgumentException(b.a(tVar.f3138a, sb2));
            }
        }
        tVar.f3138a.attachViewToParent(view, i11, layoutParams);
    }

    public void c(int i10) {
        RecyclerView.a0 L;
        int f10 = f(i10);
        this.f3013b.f(f10);
        t tVar = (t) this.f3012a;
        View childAt = tVar.f3138a.getChildAt(f10);
        if (!(childAt == null || (L = RecyclerView.L(childAt)) == null)) {
            if (!L.q() || L.x()) {
                L.c(256);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("called detach on an already detached child ");
                sb2.append(L);
                throw new IllegalArgumentException(b.a(tVar.f3138a, sb2));
            }
        }
        tVar.f3138a.detachViewFromParent(f10);
    }

    public View d(int i10) {
        return ((t) this.f3012a).a(f(i10));
    }

    public int e() {
        return ((t) this.f3012a).b() - this.f3014c.size();
    }

    public final int f(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int b10 = ((t) this.f3012a).b();
        int i11 = i10;
        while (i11 < b10) {
            int b11 = i10 - (i11 - this.f3013b.b(i11));
            if (b11 == 0) {
                while (this.f3013b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += b11;
        }
        return -1;
    }

    public View g(int i10) {
        return ((t) this.f3012a).f3138a.getChildAt(i10);
    }

    public int h() {
        return ((t) this.f3012a).b();
    }

    public final void i(View view) {
        this.f3014c.add(view);
        t tVar = (t) this.f3012a;
        tVar.getClass();
        RecyclerView.a0 L = RecyclerView.L(view);
        if (L != null) {
            RecyclerView recyclerView = tVar.f3138a;
            int i10 = L.f2858q;
            if (i10 != -1) {
                L.f2857p = i10;
            } else {
                View view2 = L.f2842a;
                WeakHashMap<View, String> weakHashMap = c0.f22553a;
                L.f2857p = c0.d.c(view2);
            }
            recyclerView.h0(L, 4);
        }
    }

    public int j(View view) {
        int indexOfChild = ((t) this.f3012a).f3138a.indexOfChild(view);
        if (indexOfChild != -1 && !this.f3013b.d(indexOfChild)) {
            return indexOfChild - this.f3013b.b(indexOfChild);
        }
        return -1;
    }

    public boolean k(View view) {
        return this.f3014c.contains(view);
    }

    public final boolean l(View view) {
        if (!this.f3014c.remove(view)) {
            return false;
        }
        t tVar = (t) this.f3012a;
        tVar.getClass();
        RecyclerView.a0 L = RecyclerView.L(view);
        if (L == null) {
            return true;
        }
        tVar.f3138a.h0(L, L.f2857p);
        L.f2857p = 0;
        return true;
    }

    public String toString() {
        return this.f3013b.toString() + ", hidden list:" + this.f3014c.size();
    }
}
