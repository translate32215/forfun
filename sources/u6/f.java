package u6;

import e8.eg0;
import e8.of0;
import java.util.Arrays;
import o.a;
import v6.e0;

/* compiled from: DefaultAllocator */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26058a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f26059b;

    /* renamed from: c  reason: collision with root package name */
    public final int f26060c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f26061d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f26062e;

    /* renamed from: f  reason: collision with root package name */
    public int f26063f;

    /* renamed from: g  reason: collision with root package name */
    public int f26064g;

    /* renamed from: h  reason: collision with root package name */
    public int f26065h;

    /* renamed from: i  reason: collision with root package name */
    public Object f26066i;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public f() {
        this(true, 65536, 0, 1);
        this.f26058a = 1;
    }

    public synchronized void a(a[] aVarArr) {
        int i10 = this.f26065h;
        int length = aVarArr.length + i10;
        Object obj = this.f26066i;
        if (length >= ((a[]) obj).length) {
            this.f26066i = (a[]) Arrays.copyOf((a[]) obj, Math.max(((a[]) obj).length * 2, i10 + aVarArr.length));
        }
        for (a aVar : aVarArr) {
            int i11 = this.f26065h;
            this.f26065h = i11 + 1;
            ((a[]) this.f26066i)[i11] = aVar;
        }
        this.f26064g -= aVarArr.length;
        notifyAll();
    }

    public synchronized void b() {
        switch (this.f26058a) {
            case 0:
                synchronized (this) {
                    if (this.f26059b) {
                        c(0);
                    }
                }
                return;
            default:
                synchronized (this) {
                    if (this.f26059b) {
                        g(0);
                    }
                }
                return;
        }
    }

    public synchronized void c(int i10) {
        boolean z10 = i10 < this.f26063f;
        this.f26063f = i10;
        if (z10) {
            d();
        }
    }

    public synchronized void d() {
        int i10 = 0;
        int max = Math.max(0, e0.g(this.f26063f, this.f26060c) - this.f26064g);
        int i11 = this.f26065h;
        if (max < i11) {
            if (this.f26061d != null) {
                int i12 = i11 - 1;
                while (i10 <= i12) {
                    a aVar = ((a[]) this.f26066i)[i10];
                    aVar.getClass();
                    if (aVar.f26038a == this.f26061d) {
                        i10++;
                    } else {
                        a aVar2 = ((a[]) this.f26066i)[i12];
                        aVar2.getClass();
                        if (aVar2.f26038a != this.f26061d) {
                            i12--;
                        } else {
                            Object obj = this.f26066i;
                            ((a[]) obj)[i10] = aVar2;
                            ((a[]) obj)[i12] = aVar;
                            i12--;
                            i10++;
                        }
                    }
                }
                max = Math.max(max, i10);
                if (max >= this.f26065h) {
                    return;
                }
            }
            Arrays.fill((a[]) this.f26066i, max, this.f26065h, (Object) null);
            this.f26065h = max;
        }
    }

    public synchronized void e(of0 of0) {
        Object obj = this.f26062e;
        ((of0[]) obj)[0] = of0;
        f((of0[]) obj);
    }

    public synchronized void f(of0[] of0Arr) {
        boolean z10;
        int i10 = this.f26065h;
        int length = of0Arr.length + i10;
        Object obj = this.f26066i;
        if (length >= ((of0[]) obj).length) {
            this.f26066i = (of0[]) Arrays.copyOf((of0[]) obj, Math.max(((of0[]) obj).length << 1, i10 + of0Arr.length));
        }
        for (of0 of0 : of0Arr) {
            byte[] bArr = of0.f15794a;
            if (bArr != null) {
                if (bArr.length != this.f26060c) {
                    z10 = false;
                    a.a(z10);
                    int i11 = this.f26065h;
                    this.f26065h = i11 + 1;
                    ((of0[]) this.f26066i)[i11] = of0;
                }
            }
            z10 = true;
            a.a(z10);
            int i112 = this.f26065h;
            this.f26065h = i112 + 1;
            ((of0[]) this.f26066i)[i112] = of0;
        }
        this.f26064g -= of0Arr.length;
        notifyAll();
    }

    public synchronized void g(int i10) {
        boolean z10 = i10 < this.f26063f;
        this.f26063f = i10;
        if (z10) {
            h();
        }
    }

    public synchronized void h() {
        int max = Math.max(0, eg0.h(this.f26063f, this.f26060c) - this.f26064g);
        int i10 = this.f26065h;
        if (max < i10) {
            Arrays.fill((of0[]) this.f26066i, max, i10, (Object) null);
            this.f26065h = max;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public f(boolean z10, int i10) {
        this(z10, i10, 0, 0);
        this.f26058a = 0;
    }

    public f(boolean z10, int i10, int i11, int i12) {
        this.f26058a = i12;
        if (i12 != 1) {
            v6.a.a(i10 > 0);
            v6.a.a(i11 >= 0);
            this.f26059b = z10;
            this.f26060c = i10;
            this.f26065h = i11;
            this.f26066i = new a[(i11 + 100)];
            if (i11 > 0) {
                this.f26061d = new byte[(i11 * i10)];
                for (int i13 = 0; i13 < i11; i13++) {
                    ((a[]) this.f26066i)[i13] = new a(this.f26061d, i13 * i10);
                }
            } else {
                this.f26061d = null;
            }
            this.f26062e = new a[1];
            return;
        }
        this.f26059b = true;
        this.f26060c = 65536;
        this.f26065h = 0;
        this.f26066i = new of0[100];
        this.f26061d = null;
        this.f26062e = new of0[1];
    }
}
