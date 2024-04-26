package ge;

import he.a;
import he.b;
import kd.o;
import ud.k;

/* compiled from: SharedFlow.kt */
public class d<T> extends a<Object> implements a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f18635a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18636b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f18637c;

    /* renamed from: d  reason: collision with root package name */
    public long f18638d;

    /* renamed from: e  reason: collision with root package name */
    public long f18639e;

    /* renamed from: f  reason: collision with root package name */
    public int f18640f;

    /* renamed from: g  reason: collision with root package name */
    public int f18641g;

    public d(int i10, int i11, fe.a aVar) {
        this.f18635a = i10;
        this.f18636b = i11;
    }

    public boolean a(T t10) {
        md.d[] dVarArr = b.f18980a;
        synchronized (this) {
            if (this.f18635a != 0) {
                c(t10);
                int i10 = this.f18640f + 1;
                this.f18640f = i10;
                if (i10 > this.f18635a) {
                    b();
                }
                this.f18639e = d() + ((long) this.f18640f);
            }
        }
        int i11 = 0;
        int length = dVarArr.length;
        while (i11 < length) {
            md.d dVar = dVarArr[i11];
            i11++;
            if (dVar != null) {
                dVar.g(o.f20627a);
            }
        }
        return true;
    }

    public final void b() {
        Object[] objArr = this.f18637c;
        k.c(objArr);
        objArr[(objArr.length - 1) & ((int) d())] = null;
        this.f18640f--;
        long d10 = d() + 1;
        if (this.f18638d < d10) {
            this.f18638d = d10;
        }
        if (this.f18639e < d10) {
            this.f18639e = d10;
        }
    }

    public final void c(Object obj) {
        int i10 = this.f18640f + this.f18641g;
        Object[] objArr = this.f18637c;
        if (objArr == null) {
            objArr = e((Object[]) null, 0, 2);
        } else if (i10 >= objArr.length) {
            objArr = e(objArr, i10, objArr.length * 2);
        }
        objArr[((int) (d() + ((long) i10))) & (objArr.length - 1)] = obj;
    }

    public final long d() {
        return Math.min(this.f18639e, this.f18638d);
    }

    public final Object[] e(Object[] objArr, int i10, int i11) {
        int i12 = 0;
        if (i11 > 0) {
            Object[] objArr2 = new Object[i11];
            this.f18637c = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long d10 = d();
            while (i12 < i10) {
                int i13 = i12 + 1;
                int i14 = (int) (((long) i12) + d10);
                objArr2[i14 & (i11 - 1)] = objArr[(objArr.length - 1) & i14];
                i12 = i13;
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }
}
