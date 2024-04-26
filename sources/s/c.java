package s;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import s.h;

/* compiled from: ArraySet */
public final class c<E> implements Collection<E>, Set<E> {

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f24799e = new int[0];

    /* renamed from: f  reason: collision with root package name */
    public static final Object[] f24800f = new Object[0];

    /* renamed from: g  reason: collision with root package name */
    public static Object[] f24801g;

    /* renamed from: h  reason: collision with root package name */
    public static int f24802h;

    /* renamed from: i  reason: collision with root package name */
    public static Object[] f24803i;

    /* renamed from: r  reason: collision with root package name */
    public static int f24804r;

    /* renamed from: a  reason: collision with root package name */
    public int[] f24805a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f24806b;

    /* renamed from: c  reason: collision with root package name */
    public int f24807c;

    /* renamed from: d  reason: collision with root package name */
    public h<E, E> f24808d;

    public c() {
        this(0);
    }

    public static void f(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                if (f24804r < 10) {
                    objArr[0] = f24803i;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f24803i = objArr;
                    f24804r++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (c.class) {
                if (f24802h < 10) {
                    objArr[0] = f24801g;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f24801g = objArr;
                    f24802h++;
                }
            }
        }
    }

    public boolean add(E e10) {
        int i10;
        int i11;
        if (e10 == null) {
            i11 = i();
            i10 = 0;
        } else {
            int hashCode = e10.hashCode();
            i10 = hashCode;
            i11 = h(e10, hashCode);
        }
        if (i11 >= 0) {
            return false;
        }
        int i12 = i11 ^ -1;
        int i13 = this.f24807c;
        int[] iArr = this.f24805a;
        if (i13 >= iArr.length) {
            int i14 = 4;
            if (i13 >= 8) {
                i14 = (i13 >> 1) + i13;
            } else if (i13 >= 4) {
                i14 = 8;
            }
            Object[] objArr = this.f24806b;
            c(i14);
            int[] iArr2 = this.f24805a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f24806b, 0, objArr.length);
            }
            f(iArr, objArr, this.f24807c);
        }
        int i15 = this.f24807c;
        if (i12 < i15) {
            int[] iArr3 = this.f24805a;
            int i16 = i12 + 1;
            System.arraycopy(iArr3, i12, iArr3, i16, i15 - i12);
            Object[] objArr2 = this.f24806b;
            System.arraycopy(objArr2, i12, objArr2, i16, this.f24807c - i12);
        }
        this.f24805a[i12] = i10;
        this.f24806b[i12] = e10;
        this.f24807c++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f24807c;
        int[] iArr = this.f24805a;
        boolean z10 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f24806b;
            c(size);
            int i10 = this.f24807c;
            if (i10 > 0) {
                System.arraycopy(iArr, 0, this.f24805a, 0, i10);
                System.arraycopy(objArr, 0, this.f24806b, 0, this.f24807c);
            }
            f(iArr, objArr, this.f24807c);
        }
        for (Object add : collection) {
            z10 |= add(add);
        }
        return z10;
    }

    public final void c(int i10) {
        if (i10 == 8) {
            synchronized (c.class) {
                Object[] objArr = f24803i;
                if (objArr != null) {
                    this.f24806b = objArr;
                    f24803i = (Object[]) objArr[0];
                    this.f24805a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f24804r--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (c.class) {
                Object[] objArr2 = f24801g;
                if (objArr2 != null) {
                    this.f24806b = objArr2;
                    f24801g = (Object[]) objArr2[0];
                    this.f24805a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f24802h--;
                    return;
                }
            }
        }
        this.f24805a = new int[i10];
        this.f24806b = new Object[i10];
    }

    public void clear() {
        int i10 = this.f24807c;
        if (i10 != 0) {
            f(this.f24805a, this.f24806b, i10);
            this.f24805a = f24799e;
            this.f24806b = f24800f;
            this.f24807c = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f24807c != set.size()) {
                return false;
            }
            int i10 = 0;
            while (i10 < this.f24807c) {
                try {
                    if (!set.contains(this.f24806b[i10])) {
                        return false;
                    }
                    i10++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int h(Object obj, int i10) {
        int i11 = this.f24807c;
        if (i11 == 0) {
            return -1;
        }
        int a10 = e.a(this.f24805a, i11, i10);
        if (a10 < 0 || obj.equals(this.f24806b[a10])) {
            return a10;
        }
        int i12 = a10 + 1;
        while (i12 < i11 && this.f24805a[i12] == i10) {
            if (obj.equals(this.f24806b[i12])) {
                return i12;
            }
            i12++;
        }
        int i13 = a10 - 1;
        while (i13 >= 0 && this.f24805a[i13] == i10) {
            if (obj.equals(this.f24806b[i13])) {
                return i13;
            }
            i13--;
        }
        return i12 ^ -1;
    }

    public int hashCode() {
        int[] iArr = this.f24805a;
        int i10 = this.f24807c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public final int i() {
        int i10 = this.f24807c;
        if (i10 == 0) {
            return -1;
        }
        int a10 = e.a(this.f24805a, i10, 0);
        if (a10 < 0 || this.f24806b[a10] == null) {
            return a10;
        }
        int i11 = a10 + 1;
        while (i11 < i10 && this.f24805a[i11] == 0) {
            if (this.f24806b[i11] == null) {
                return i11;
            }
            i11++;
        }
        int i12 = a10 - 1;
        while (i12 >= 0 && this.f24805a[i12] == 0) {
            if (this.f24806b[i12] == null) {
                return i12;
            }
            i12--;
        }
        return i11 ^ -1;
    }

    public int indexOf(Object obj) {
        return obj == null ? i() : h(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f24807c <= 0;
    }

    public Iterator<E> iterator() {
        if (this.f24808d == null) {
            this.f24808d = new b(this);
        }
        h<E, E> hVar = this.f24808d;
        if (hVar.f24831b == null) {
            hVar.f24831b = new h.c();
        }
        return hVar.f24831b.iterator();
    }

    public E j(int i10) {
        E[] eArr = this.f24806b;
        E e10 = eArr[i10];
        int i11 = this.f24807c;
        if (i11 <= 1) {
            f(this.f24805a, eArr, i11);
            this.f24805a = f24799e;
            this.f24806b = f24800f;
            this.f24807c = 0;
        } else {
            int[] iArr = this.f24805a;
            int i12 = 8;
            if (iArr.length <= 8 || i11 >= iArr.length / 3) {
                int i13 = i11 - 1;
                this.f24807c = i13;
                if (i10 < i13) {
                    int i14 = i10 + 1;
                    System.arraycopy(iArr, i14, iArr, i10, i13 - i10);
                    Object[] objArr = this.f24806b;
                    System.arraycopy(objArr, i14, objArr, i10, this.f24807c - i10);
                }
                this.f24806b[this.f24807c] = null;
            } else {
                if (i11 > 8) {
                    i12 = i11 + (i11 >> 1);
                }
                c(i12);
                this.f24807c--;
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f24805a, 0, i10);
                    System.arraycopy(eArr, 0, this.f24806b, 0, i10);
                }
                int i15 = this.f24807c;
                if (i10 < i15) {
                    int i16 = i10 + 1;
                    System.arraycopy(iArr, i16, this.f24805a, i10, i15 - i10);
                    System.arraycopy(eArr, i16, this.f24806b, i10, this.f24807c - i10);
                }
            }
        }
        return e10;
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        j(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z10 = false;
        for (Object remove : collection) {
            z10 |= remove(remove);
        }
        return z10;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.f24807c - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f24806b[i10])) {
                j(i10);
                z10 = true;
            }
        }
        return z10;
    }

    public int size() {
        return this.f24807c;
    }

    public Object[] toArray() {
        int i10 = this.f24807c;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f24806b, 0, objArr, 0, i10);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f24807c * 14);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f24807c; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f24806b[i10];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public c(int i10) {
        if (i10 == 0) {
            this.f24805a = f24799e;
            this.f24806b = f24800f;
        } else {
            c(i10);
        }
        this.f24807c = 0;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f24807c) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f24807c);
        }
        System.arraycopy(this.f24806b, 0, tArr, 0, this.f24807c);
        int length = tArr.length;
        int i10 = this.f24807c;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }
}
