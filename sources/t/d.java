package t;

/* compiled from: Pools */
public class d<T> implements n0.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25297a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f25298b;

    /* renamed from: c  reason: collision with root package name */
    public int f25299c;

    public d(int i10, int i11) {
        this.f25297a = i11;
        if (i11 != 1) {
            if (i10 > 0) {
                this.f25298b = new Object[i10];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        } else if (i10 > 0) {
            this.f25298b = new Object[i10];
        } else {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
    }

    public boolean a(Object obj) {
        switch (this.f25297a) {
            case 0:
                int i10 = this.f25299c;
                Object[] objArr = this.f25298b;
                if (i10 >= objArr.length) {
                    return false;
                }
                objArr[i10] = obj;
                this.f25299c = i10 + 1;
                return true;
            default:
                if (!c(obj)) {
                    int i11 = this.f25299c;
                    Object[] objArr2 = this.f25298b;
                    if (i11 >= objArr2.length) {
                        return false;
                    }
                    objArr2[i11] = obj;
                    this.f25299c = i11 + 1;
                    return true;
                }
                throw new IllegalStateException("Already in the pool!");
        }
    }

    public Object b() {
        switch (this.f25297a) {
            case 0:
                int i10 = this.f25299c;
                if (i10 <= 0) {
                    return null;
                }
                int i11 = i10 - 1;
                Object[] objArr = this.f25298b;
                Object obj = objArr[i11];
                objArr[i11] = null;
                this.f25299c = i11;
                return obj;
            default:
                int i12 = this.f25299c;
                if (i12 <= 0) {
                    return null;
                }
                int i13 = i12 - 1;
                Object[] objArr2 = this.f25298b;
                Object obj2 = objArr2[i13];
                objArr2[i13] = null;
                this.f25299c = i13;
                return obj2;
        }
    }

    public boolean c(T t10) {
        for (int i10 = 0; i10 < this.f25299c; i10++) {
            if (this.f25298b[i10] == t10) {
                return true;
            }
        }
        return false;
    }
}
