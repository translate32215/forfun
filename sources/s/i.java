package s;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: SimpleArrayMap */
public class i<K, V> {

    /* renamed from: d  reason: collision with root package name */
    public static Object[] f24845d;

    /* renamed from: e  reason: collision with root package name */
    public static int f24846e;

    /* renamed from: f  reason: collision with root package name */
    public static Object[] f24847f;

    /* renamed from: g  reason: collision with root package name */
    public static int f24848g;

    /* renamed from: a  reason: collision with root package name */
    public int[] f24849a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f24850b;

    /* renamed from: c  reason: collision with root package name */
    public int f24851c;

    public i() {
        this.f24849a = e.f24814a;
        this.f24850b = e.f24816c;
        this.f24851c = 0;
    }

    private void a(int i10) {
        Class<i> cls = i.class;
        if (i10 == 8) {
            synchronized (cls) {
                Object[] objArr = f24847f;
                if (objArr != null) {
                    this.f24850b = objArr;
                    f24847f = (Object[]) objArr[0];
                    this.f24849a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f24848g--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (cls) {
                Object[] objArr2 = f24845d;
                if (objArr2 != null) {
                    this.f24850b = objArr2;
                    f24845d = (Object[]) objArr2[0];
                    this.f24849a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f24846e--;
                    return;
                }
            }
        }
        this.f24849a = new int[i10];
        this.f24850b = new Object[(i10 << 1)];
    }

    public static void c(int[] iArr, Object[] objArr, int i10) {
        Class<i> cls = i.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f24848g < 10) {
                    objArr[0] = f24847f;
                    objArr[1] = iArr;
                    for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f24847f = objArr;
                    f24848g++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f24846e < 10) {
                    objArr[0] = f24845d;
                    objArr[1] = iArr;
                    for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f24845d = objArr;
                    f24846e++;
                }
            }
        }
    }

    public void b(int i10) {
        int i11 = this.f24851c;
        int[] iArr = this.f24849a;
        if (iArr.length < i10) {
            Object[] objArr = this.f24850b;
            a(i10);
            if (this.f24851c > 0) {
                System.arraycopy(iArr, 0, this.f24849a, 0, i11);
                System.arraycopy(objArr, 0, this.f24850b, 0, i11 << 1);
            }
            c(iArr, objArr, i11);
        }
        if (this.f24851c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i10 = this.f24851c;
        if (i10 > 0) {
            int[] iArr = this.f24849a;
            Object[] objArr = this.f24850b;
            this.f24849a = e.f24814a;
            this.f24850b = e.f24816c;
            this.f24851c = 0;
            c(iArr, objArr, i10);
        }
        if (this.f24851c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    /* access modifiers changed from: package-private */
    public int d(Object obj, int i10) {
        int i11 = this.f24851c;
        if (i11 == 0) {
            return -1;
        }
        try {
            int a10 = e.a(this.f24849a, i11, i10);
            if (a10 < 0 || obj.equals(this.f24850b[a10 << 1])) {
                return a10;
            }
            int i12 = a10 + 1;
            while (i12 < i11 && this.f24849a[i12] == i10) {
                if (obj.equals(this.f24850b[i12 << 1])) {
                    return i12;
                }
                i12++;
            }
            int i13 = a10 - 1;
            while (i13 >= 0 && this.f24849a[i13] == i10) {
                if (obj.equals(this.f24850b[i13 << 1])) {
                    return i13;
                }
                i13--;
            }
            return i12 ^ -1;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public int e(Object obj) {
        return obj == null ? f() : d(obj, obj.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f24851c != iVar.f24851c) {
                return false;
            }
            int i10 = 0;
            while (i10 < this.f24851c) {
                try {
                    Object h10 = h(i10);
                    Object l10 = l(i10);
                    Object obj2 = iVar.get(h10);
                    if (l10 == null) {
                        if (obj2 != null || !iVar.containsKey(h10)) {
                            return false;
                        }
                    } else if (!l10.equals(obj2)) {
                        return false;
                    }
                    i10++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f24851c != map.size()) {
                return false;
            }
            int i11 = 0;
            while (i11 < this.f24851c) {
                try {
                    Object h11 = h(i11);
                    Object l11 = l(i11);
                    Object obj3 = map.get(h11);
                    if (l11 == null) {
                        if (obj3 != null || !map.containsKey(h11)) {
                            return false;
                        }
                    } else if (!l11.equals(obj3)) {
                        return false;
                    }
                    i11++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f() {
        int i10 = this.f24851c;
        if (i10 == 0) {
            return -1;
        }
        try {
            int a10 = e.a(this.f24849a, i10, 0);
            if (a10 < 0 || this.f24850b[a10 << 1] == null) {
                return a10;
            }
            int i11 = a10 + 1;
            while (i11 < i10 && this.f24849a[i11] == 0) {
                if (this.f24850b[i11 << 1] == null) {
                    return i11;
                }
                i11++;
            }
            int i12 = a10 - 1;
            while (i12 >= 0 && this.f24849a[i12] == 0) {
                if (this.f24850b[i12 << 1] == null) {
                    return i12;
                }
                i12--;
            }
            return i11 ^ -1;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* access modifiers changed from: package-private */
    public int g(Object obj) {
        int i10 = this.f24851c * 2;
        Object[] objArr = this.f24850b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public V getOrDefault(Object obj, V v10) {
        int e10 = e(obj);
        return e10 >= 0 ? this.f24850b[(e10 << 1) + 1] : v10;
    }

    public K h(int i10) {
        return this.f24850b[i10 << 1];
    }

    public int hashCode() {
        int[] iArr = this.f24849a;
        Object[] objArr = this.f24850b;
        int i10 = this.f24851c;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            i13 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public void i(i<? extends K, ? extends V> iVar) {
        int i10 = iVar.f24851c;
        b(this.f24851c + i10);
        if (this.f24851c != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(iVar.h(i11), iVar.l(i11));
            }
        } else if (i10 > 0) {
            System.arraycopy(iVar.f24849a, 0, this.f24849a, 0, i10);
            System.arraycopy(iVar.f24850b, 0, this.f24850b, 0, i10 << 1);
            this.f24851c = i10;
        }
    }

    public boolean isEmpty() {
        return this.f24851c <= 0;
    }

    public V j(int i10) {
        V[] vArr = this.f24850b;
        int i11 = i10 << 1;
        V v10 = vArr[i11 + 1];
        int i12 = this.f24851c;
        int i13 = 0;
        if (i12 <= 1) {
            c(this.f24849a, vArr, i12);
            this.f24849a = e.f24814a;
            this.f24850b = e.f24816c;
        } else {
            int i14 = i12 - 1;
            int[] iArr = this.f24849a;
            int i15 = 8;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i10 < i14) {
                    int i16 = i10 + 1;
                    int i17 = i14 - i10;
                    System.arraycopy(iArr, i16, iArr, i10, i17);
                    Object[] objArr = this.f24850b;
                    System.arraycopy(objArr, i16 << 1, objArr, i11, i17 << 1);
                }
                Object[] objArr2 = this.f24850b;
                int i18 = i14 << 1;
                objArr2[i18] = null;
                objArr2[i18 + 1] = null;
            } else {
                if (i12 > 8) {
                    i15 = i12 + (i12 >> 1);
                }
                a(i15);
                if (i12 == this.f24851c) {
                    if (i10 > 0) {
                        System.arraycopy(iArr, 0, this.f24849a, 0, i10);
                        System.arraycopy(vArr, 0, this.f24850b, 0, i11);
                    }
                    if (i10 < i14) {
                        int i19 = i10 + 1;
                        int i20 = i14 - i10;
                        System.arraycopy(iArr, i19, this.f24849a, i10, i20);
                        System.arraycopy(vArr, i19 << 1, this.f24850b, i11, i20 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i13 = i14;
        }
        if (i12 == this.f24851c) {
            this.f24851c = i13;
            return v10;
        }
        throw new ConcurrentModificationException();
    }

    public V k(int i10, V v10) {
        int i11 = (i10 << 1) + 1;
        V[] vArr = this.f24850b;
        V v11 = vArr[i11];
        vArr[i11] = v10;
        return v11;
    }

    public V l(int i10) {
        return this.f24850b[(i10 << 1) + 1];
    }

    public V put(K k10, V v10) {
        int i10;
        int i11;
        int i12 = this.f24851c;
        if (k10 == null) {
            i11 = f();
            i10 = 0;
        } else {
            int hashCode = k10.hashCode();
            i10 = hashCode;
            i11 = d(k10, hashCode);
        }
        if (i11 >= 0) {
            int i13 = (i11 << 1) + 1;
            V[] vArr = this.f24850b;
            V v11 = vArr[i13];
            vArr[i13] = v10;
            return v11;
        }
        int i14 = i11 ^ -1;
        int[] iArr = this.f24849a;
        if (i12 >= iArr.length) {
            int i15 = 4;
            if (i12 >= 8) {
                i15 = (i12 >> 1) + i12;
            } else if (i12 >= 4) {
                i15 = 8;
            }
            Object[] objArr = this.f24850b;
            a(i15);
            if (i12 == this.f24851c) {
                int[] iArr2 = this.f24849a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f24850b, 0, objArr.length);
                }
                c(iArr, objArr, i12);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i14 < i12) {
            int[] iArr3 = this.f24849a;
            int i16 = i14 + 1;
            System.arraycopy(iArr3, i14, iArr3, i16, i12 - i14);
            Object[] objArr2 = this.f24850b;
            System.arraycopy(objArr2, i14 << 1, objArr2, i16 << 1, (this.f24851c - i14) << 1);
        }
        int i17 = this.f24851c;
        if (i12 == i17) {
            int[] iArr4 = this.f24849a;
            if (i14 < iArr4.length) {
                iArr4[i14] = i10;
                Object[] objArr3 = this.f24850b;
                int i18 = i14 << 1;
                objArr3[i18] = k10;
                objArr3[i18 + 1] = v10;
                this.f24851c = i17 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k10, V v10) {
        V orDefault = getOrDefault(k10, (Object) null);
        return orDefault == null ? put(k10, v10) : orDefault;
    }

    public V remove(Object obj) {
        int e10 = e(obj);
        if (e10 >= 0) {
            return j(e10);
        }
        return null;
    }

    public V replace(K k10, V v10) {
        int e10 = e(k10);
        if (e10 >= 0) {
            return k(e10, v10);
        }
        return null;
    }

    public int size() {
        return this.f24851c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f24851c * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f24851c; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object h10 = h(i10);
            if (h10 != this) {
                sb2.append(h10);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object l10 = l(i10);
            if (l10 != this) {
                sb2.append(l10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int e10 = e(obj);
        if (e10 < 0) {
            return false;
        }
        Object l10 = l(e10);
        if (obj2 != l10 && (obj2 == null || !obj2.equals(l10))) {
            return false;
        }
        j(e10);
        return true;
    }

    public boolean replace(K k10, V v10, V v11) {
        int e10 = e(k10);
        if (e10 < 0) {
            return false;
        }
        V l10 = l(e10);
        if (l10 != v10 && (v10 == null || !v10.equals(l10))) {
            return false;
        }
        k(e10, v11);
        return true;
    }

    public i(int i10) {
        if (i10 == 0) {
            this.f24849a = e.f24814a;
            this.f24850b = e.f24816c;
        } else {
            a(i10);
        }
        this.f24851c = 0;
    }

    public i(i<K, V> iVar) {
        this();
        if (iVar != null) {
            i(iVar);
        }
    }
}
