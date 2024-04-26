package v6;

import e8.qd0;
import e8.rd0;
import e8.w60;
import java.util.NoSuchElementException;

/* compiled from: IntArrayQueue */
public final class l implements rd0 {

    /* renamed from: a  reason: collision with root package name */
    public int f26468a;

    /* renamed from: b  reason: collision with root package name */
    public int f26469b;

    /* renamed from: c  reason: collision with root package name */
    public int f26470c;

    /* renamed from: d  reason: collision with root package name */
    public Object f26471d;

    /* renamed from: e  reason: collision with root package name */
    public int f26472e;

    public l(qd0 qd0) {
        w60 w60 = qd0.P0;
        this.f26471d = w60;
        w60.h(12);
        this.f26469b = ((w60) this.f26471d).o() & 255;
        this.f26468a = ((w60) this.f26471d).o();
    }

    public boolean a() {
        return false;
    }

    public int b() {
        return this.f26468a;
    }

    public int c() {
        int i10 = this.f26469b;
        if (i10 == 8) {
            return ((w60) this.f26471d).d();
        }
        if (i10 == 16) {
            return ((w60) this.f26471d).e();
        }
        int i11 = this.f26470c;
        this.f26470c = i11 + 1;
        if (i11 % 2 != 0) {
            return this.f26472e & 15;
        }
        int d10 = ((w60) this.f26471d).d();
        this.f26472e = d10;
        return (d10 & 240) >> 4;
    }

    public void d(int i10) {
        int i11 = this.f26470c;
        Object obj = this.f26471d;
        if (i11 == ((int[]) obj).length) {
            int[] iArr = (int[]) obj;
            int length = iArr.length << 1;
            if (length >= 0) {
                int[] iArr2 = new int[length];
                int length2 = iArr.length;
                int i12 = this.f26468a;
                int i13 = length2 - i12;
                System.arraycopy(iArr, i12, iArr2, 0, i13);
                System.arraycopy((int[]) this.f26471d, 0, iArr2, i13, i12);
                this.f26468a = 0;
                this.f26469b = this.f26470c - 1;
                this.f26471d = iArr2;
                this.f26472e = length - 1;
            } else {
                throw new IllegalStateException();
            }
        }
        int i14 = (this.f26469b + 1) & this.f26472e;
        this.f26469b = i14;
        ((int[]) this.f26471d)[i14] = i10;
        this.f26470c++;
    }

    public int e() {
        int i10 = this.f26470c;
        if (i10 != 0) {
            int i11 = this.f26468a;
            int i12 = ((int[]) this.f26471d)[i11];
            this.f26468a = (i11 + 1) & this.f26472e;
            this.f26470c = i10 - 1;
            return i12;
        }
        throw new NoSuchElementException();
    }

    public l() {
        this.f26468a = 0;
        this.f26469b = -1;
        this.f26470c = 0;
        this.f26471d = new int[16];
        this.f26472e = 15;
    }
}
