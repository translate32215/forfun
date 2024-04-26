package androidx.recyclerview.widget;

import android.view.View;

/* compiled from: ViewBoundsCheck */
public class z {

    /* renamed from: a  reason: collision with root package name */
    public final b f3149a;

    /* renamed from: b  reason: collision with root package name */
    public a f3150b = new a();

    /* compiled from: ViewBoundsCheck */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f3151a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f3152b;

        /* renamed from: c  reason: collision with root package name */
        public int f3153c;

        /* renamed from: d  reason: collision with root package name */
        public int f3154d;

        /* renamed from: e  reason: collision with root package name */
        public int f3155e;

        public boolean a() {
            int i10 = this.f3151a;
            if ((i10 & 7) != 0 && (i10 & (b(this.f3154d, this.f3152b) << 0)) == 0) {
                return false;
            }
            int i11 = this.f3151a;
            if ((i11 & 112) != 0 && (i11 & (b(this.f3154d, this.f3153c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f3151a;
            if ((i12 & 1792) != 0 && (i12 & (b(this.f3155e, this.f3152b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f3151a;
            if ((i13 & 28672) == 0 || (i13 & (b(this.f3155e, this.f3153c) << 12)) != 0) {
                return true;
            }
            return false;
        }

        public int b(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }
    }

    /* compiled from: ViewBoundsCheck */
    public interface b {
        int a();

        int b(View view);

        View c(int i10);

        int d();

        int e(View view);
    }

    public z(b bVar) {
        this.f3149a = bVar;
    }

    public View a(int i10, int i11, int i12, int i13) {
        int d10 = this.f3149a.d();
        int a10 = this.f3149a.a();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View c10 = this.f3149a.c(i10);
            int b10 = this.f3149a.b(c10);
            int e10 = this.f3149a.e(c10);
            a aVar = this.f3150b;
            aVar.f3152b = d10;
            aVar.f3153c = a10;
            aVar.f3154d = b10;
            aVar.f3155e = e10;
            if (i12 != 0) {
                aVar.f3151a = 0;
                aVar.f3151a = i12 | 0;
                if (aVar.a()) {
                    return c10;
                }
            }
            if (i13 != 0) {
                a aVar2 = this.f3150b;
                aVar2.f3151a = 0;
                aVar2.f3151a = i13 | 0;
                if (aVar2.a()) {
                    view = c10;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public boolean b(View view, int i10) {
        a aVar = this.f3150b;
        int d10 = this.f3149a.d();
        int a10 = this.f3149a.a();
        int b10 = this.f3149a.b(view);
        int e10 = this.f3149a.e(view);
        aVar.f3152b = d10;
        aVar.f3153c = a10;
        aVar.f3154d = b10;
        aVar.f3155e = e10;
        if (i10 == 0) {
            return false;
        }
        a aVar2 = this.f3150b;
        aVar2.f3151a = 0;
        aVar2.f3151a = 0 | i10;
        return aVar2.a();
    }
}
