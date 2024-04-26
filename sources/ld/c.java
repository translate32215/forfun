package ld;

import androidx.appcompat.widget.d0;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import ud.k;

/* compiled from: ArrayDeque.kt */
public final class c<E> extends a<E> {

    /* renamed from: d  reason: collision with root package name */
    public static final Object[] f21249d = new Object[0];

    /* renamed from: a  reason: collision with root package name */
    public int f21250a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f21251b;

    /* renamed from: c  reason: collision with root package name */
    public int f21252c;

    public c(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = f21249d;
        } else if (i10 > 0) {
            objArr = new Object[i10];
        } else {
            throw new IllegalArgumentException(d0.a("Illegal Capacity: ", i10));
        }
        this.f21251b = objArr;
    }

    public final E A() {
        if (!isEmpty()) {
            int y10 = y(h.b(this) + this.f21250a);
            E[] eArr = this.f21251b;
            E e10 = eArr[y10];
            eArr[y10] = null;
            this.f21252c = size() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public boolean add(E e10) {
        f(e10);
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        k.f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        j(collection.size() + size());
        h(y(size() + this.f21250a), collection);
        return true;
    }

    public final void c(E e10) {
        j(size() + 1);
        int i10 = i(this.f21250a);
        this.f21250a = i10;
        this.f21251b[i10] = e10;
        this.f21252c = size() + 1;
    }

    public void clear() {
        int y10 = y(size() + this.f21250a);
        int i10 = this.f21250a;
        if (i10 < y10) {
            e.e(this.f21251b, null, i10, y10);
        } else if (!isEmpty()) {
            Object[] objArr = this.f21251b;
            e.e(objArr, null, this.f21250a, objArr.length);
            e.e(this.f21251b, null, 0, y10);
        }
        this.f21250a = 0;
        this.f21252c = 0;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void f(E e10) {
        j(size() + 1);
        this.f21251b[y(size() + this.f21250a)] = e10;
        this.f21252c = size() + 1;
    }

    public final E first() {
        if (!isEmpty()) {
            return this.f21251b[this.f21250a];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public E get(int i10) {
        int size = size();
        if (i10 >= 0 && i10 < size) {
            return this.f21251b[y(this.f21250a + i10)];
        }
        throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + size);
    }

    public final void h(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f21251b.length;
        while (i10 < length && it.hasNext()) {
            this.f21251b[i10] = it.next();
            i10++;
        }
        int i11 = this.f21250a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f21251b[i12] = it.next();
        }
        this.f21252c = collection.size() + size();
    }

    public final int i(int i10) {
        return i10 == 0 ? e.g(this.f21251b) : i10 - 1;
    }

    public int indexOf(Object obj) {
        int i10;
        int y10 = y(size() + this.f21250a);
        int i11 = this.f21250a;
        if (i11 < y10) {
            while (i11 < y10) {
                if (k.a(obj, this.f21251b[i11])) {
                    i10 = this.f21250a;
                } else {
                    i11++;
                }
            }
            return -1;
        } else if (i11 < y10) {
            return -1;
        } else {
            int length = this.f21251b.length;
            while (true) {
                if (i11 >= length) {
                    int i12 = 0;
                    while (i12 < y10) {
                        if (k.a(obj, this.f21251b[i12])) {
                            i11 = i12 + this.f21251b.length;
                            i10 = this.f21250a;
                        } else {
                            i12++;
                        }
                    }
                    return -1;
                } else if (k.a(obj, this.f21251b[i11])) {
                    i10 = this.f21250a;
                    break;
                } else {
                    i11++;
                }
            }
        }
        return i11 - i10;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public final void j(int i10) {
        if (i10 >= 0) {
            Object[] objArr = this.f21251b;
            if (i10 > objArr.length) {
                if (objArr == f21249d) {
                    if (i10 < 10) {
                        i10 = 10;
                    }
                    this.f21251b = new Object[i10];
                    return;
                }
                int length = objArr.length;
                int i11 = length + (length >> 1);
                if (i11 - i10 < 0) {
                    i11 = i10;
                }
                if (i11 - 2147483639 > 0) {
                    i11 = i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
                }
                Object[] objArr2 = new Object[i11];
                e.c(objArr, objArr2, 0, this.f21250a, objArr.length);
                Object[] objArr3 = this.f21251b;
                int length2 = objArr3.length;
                int i12 = this.f21250a;
                e.c(objArr3, objArr2, length2 - i12, 0, i12);
                this.f21250a = 0;
                this.f21251b = objArr2;
                return;
            }
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final E last() {
        if (!isEmpty()) {
            return this.f21251b[y(h.b(this) + this.f21250a)];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public int lastIndexOf(Object obj) {
        int i10;
        int i11;
        int y10 = y(size() + this.f21250a);
        int i12 = this.f21250a;
        if (i12 < y10) {
            i10 = y10 - 1;
            if (i12 <= i10) {
                while (!k.a(obj, this.f21251b[i10])) {
                    if (i10 != i12) {
                        i10--;
                    }
                }
                i11 = this.f21250a;
            }
            return -1;
        }
        if (i12 > y10) {
            int i13 = y10 - 1;
            while (true) {
                if (-1 >= i13) {
                    int g10 = e.g(this.f21251b);
                    int i14 = this.f21250a;
                    if (i14 <= g10) {
                        while (!k.a(obj, this.f21251b[i10])) {
                            if (i10 != i14) {
                                g10 = i10 - 1;
                            }
                        }
                        i11 = this.f21250a;
                    }
                } else if (k.a(obj, this.f21251b[i13])) {
                    i10 = i13 + this.f21251b.length;
                    i11 = this.f21250a;
                    break;
                } else {
                    i13--;
                }
            }
        }
        return -1;
        return i10 - i11;
    }

    public final E o() {
        if (isEmpty()) {
            return null;
        }
        return this.f21251b[this.f21250a];
    }

    public final int q(int i10) {
        if (i10 == e.g(this.f21251b)) {
            return 0;
        }
        return i10 + 1;
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            ud.k.f(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0096
            java.lang.Object[] r0 = r11.f21251b
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0096
        L_0x0019:
            int r0 = r11.f21250a
            int r3 = r11.size()
            int r3 = r3 + r0
            int r0 = r11.y(r3)
            int r3 = r11.f21250a
            r4 = 0
            if (r3 >= r0) goto L_0x0049
            r5 = r3
        L_0x002a:
            if (r3 >= r0) goto L_0x0043
            java.lang.Object[] r6 = r11.f21251b
            r6 = r6[r3]
            boolean r7 = r12.contains(r6)
            r7 = r7 ^ r2
            if (r7 == 0) goto L_0x003f
            java.lang.Object[] r7 = r11.f21251b
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x0040
        L_0x003f:
            r1 = 1
        L_0x0040:
            int r3 = r3 + 1
            goto L_0x002a
        L_0x0043:
            java.lang.Object[] r12 = r11.f21251b
            ld.e.e(r12, r4, r5, r0)
            goto L_0x008b
        L_0x0049:
            java.lang.Object[] r5 = r11.f21251b
            int r5 = r5.length
            r6 = r3
            r7 = 0
        L_0x004e:
            if (r3 >= r5) goto L_0x0069
            java.lang.Object[] r8 = r11.f21251b
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            r8 = r8 ^ r2
            if (r8 == 0) goto L_0x0065
            java.lang.Object[] r8 = r11.f21251b
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0066
        L_0x0065:
            r7 = 1
        L_0x0066:
            int r3 = r3 + 1
            goto L_0x004e
        L_0x0069:
            int r3 = r11.y(r6)
            r5 = r3
        L_0x006e:
            if (r1 >= r0) goto L_0x008a
            java.lang.Object[] r3 = r11.f21251b
            r6 = r3[r1]
            r3[r1] = r4
            boolean r3 = r12.contains(r6)
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x0086
            java.lang.Object[] r3 = r11.f21251b
            r3[r5] = r6
            int r5 = r11.q(r5)
            goto L_0x0087
        L_0x0086:
            r7 = 1
        L_0x0087:
            int r1 = r1 + 1
            goto L_0x006e
        L_0x008a:
            r1 = r7
        L_0x008b:
            if (r1 == 0) goto L_0x0096
            int r12 = r11.f21250a
            int r5 = r5 - r12
            int r12 = r11.x(r5)
            r11.f21252c = r12
        L_0x0096:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ld.c.removeAll(java.util.Collection):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            ud.k.f(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0093
            java.lang.Object[] r0 = r11.f21251b
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0093
        L_0x0019:
            int r0 = r11.f21250a
            int r3 = r11.size()
            int r3 = r3 + r0
            int r0 = r11.y(r3)
            int r3 = r11.f21250a
            r4 = 0
            if (r3 >= r0) goto L_0x0048
            r5 = r3
        L_0x002a:
            if (r3 >= r0) goto L_0x0042
            java.lang.Object[] r6 = r11.f21251b
            r6 = r6[r3]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L_0x003e
            java.lang.Object[] r7 = r11.f21251b
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            int r3 = r3 + 1
            goto L_0x002a
        L_0x0042:
            java.lang.Object[] r12 = r11.f21251b
            ld.e.e(r12, r4, r5, r0)
            goto L_0x0088
        L_0x0048:
            java.lang.Object[] r5 = r11.f21251b
            int r5 = r5.length
            r6 = r3
            r7 = 0
        L_0x004d:
            if (r3 >= r5) goto L_0x0067
            java.lang.Object[] r8 = r11.f21251b
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L_0x0063
            java.lang.Object[] r8 = r11.f21251b
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0064
        L_0x0063:
            r7 = 1
        L_0x0064:
            int r3 = r3 + 1
            goto L_0x004d
        L_0x0067:
            int r3 = r11.y(r6)
            r5 = r3
        L_0x006c:
            if (r1 >= r0) goto L_0x0087
            java.lang.Object[] r3 = r11.f21251b
            r6 = r3[r1]
            r3[r1] = r4
            boolean r3 = r12.contains(r6)
            if (r3 == 0) goto L_0x0083
            java.lang.Object[] r3 = r11.f21251b
            r3[r5] = r6
            int r5 = r11.q(r5)
            goto L_0x0084
        L_0x0083:
            r7 = 1
        L_0x0084:
            int r1 = r1 + 1
            goto L_0x006c
        L_0x0087:
            r1 = r7
        L_0x0088:
            if (r1 == 0) goto L_0x0093
            int r12 = r11.f21250a
            int r5 = r5 - r12
            int r12 = r11.x(r5)
            r11.f21252c = r12
        L_0x0093:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ld.c.retainAll(java.util.Collection):boolean");
    }

    public final E s() {
        if (isEmpty()) {
            return null;
        }
        return this.f21251b[y(h.b(this) + this.f21250a)];
    }

    public E set(int i10, E e10) {
        int size = size();
        if (i10 < 0 || i10 >= size) {
            throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + size);
        }
        int y10 = y(this.f21250a + i10);
        E[] eArr = this.f21251b;
        E e11 = eArr[y10];
        eArr[y10] = e10;
        return e11;
    }

    public <T> T[] toArray(T[] tArr) {
        k.f(tArr, "array");
        if (tArr.length < size()) {
            int size = size();
            k.f(tArr, "reference");
            Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), size);
            k.d(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            tArr = (Object[]) newInstance;
        }
        int y10 = y(size() + this.f21250a);
        int i10 = this.f21250a;
        if (i10 < y10) {
            e.d(this.f21251b, tArr, 0, i10, y10, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f21251b;
            e.c(objArr, tArr, 0, this.f21250a, objArr.length);
            Object[] objArr2 = this.f21251b;
            e.c(objArr2, tArr, objArr2.length - this.f21250a, 0, y10);
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }

    public final int x(int i10) {
        return i10 < 0 ? i10 + this.f21251b.length : i10;
    }

    public final int y(int i10) {
        Object[] objArr = this.f21251b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    public final E z() {
        if (!isEmpty()) {
            E[] eArr = this.f21251b;
            int i10 = this.f21250a;
            E e10 = eArr[i10];
            eArr[i10] = null;
            this.f21250a = q(i10);
            this.f21252c = size() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public void add(int i10, E e10) {
        int size = size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + size);
        } else if (i10 == size()) {
            f(e10);
        } else if (i10 == 0) {
            c(e10);
        } else {
            j(size() + 1);
            int y10 = y(this.f21250a + i10);
            if (i10 < ((size() + 1) >> 1)) {
                int i11 = i(y10);
                int i12 = i(this.f21250a);
                int i13 = this.f21250a;
                if (i11 >= i13) {
                    Object[] objArr = this.f21251b;
                    objArr[i12] = objArr[i13];
                    e.c(objArr, objArr, i13, i13 + 1, i11 + 1);
                } else {
                    Object[] objArr2 = this.f21251b;
                    e.c(objArr2, objArr2, i13 - 1, i13, objArr2.length);
                    Object[] objArr3 = this.f21251b;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    e.c(objArr3, objArr3, 0, 1, i11 + 1);
                }
                this.f21251b[i11] = e10;
                this.f21250a = i12;
            } else {
                int y11 = y(size() + this.f21250a);
                if (y10 < y11) {
                    Object[] objArr4 = this.f21251b;
                    e.c(objArr4, objArr4, y10 + 1, y10, y11);
                } else {
                    Object[] objArr5 = this.f21251b;
                    e.c(objArr5, objArr5, 1, 0, y11);
                    Object[] objArr6 = this.f21251b;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    e.c(objArr6, objArr6, y10 + 1, y10, objArr6.length - 1);
                }
                this.f21251b[y10] = e10;
            }
            this.f21252c = size() + 1;
        }
    }

    public boolean addAll(int i10, Collection<? extends E> collection) {
        k.f(collection, "elements");
        int size = size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + size);
        } else if (collection.isEmpty()) {
            return false;
        } else {
            if (i10 == size()) {
                return addAll(collection);
            }
            j(collection.size() + size());
            int y10 = y(size() + this.f21250a);
            int y11 = y(this.f21250a + i10);
            int size2 = collection.size();
            if (i10 < ((size() + 1) >> 1)) {
                int i11 = this.f21250a;
                int i12 = i11 - size2;
                if (y11 < i11) {
                    Object[] objArr = this.f21251b;
                    e.c(objArr, objArr, i12, i11, objArr.length);
                    if (size2 >= y11) {
                        Object[] objArr2 = this.f21251b;
                        e.c(objArr2, objArr2, objArr2.length - size2, 0, y11);
                    } else {
                        Object[] objArr3 = this.f21251b;
                        e.c(objArr3, objArr3, objArr3.length - size2, 0, size2);
                        Object[] objArr4 = this.f21251b;
                        e.c(objArr4, objArr4, 0, size2, y11);
                    }
                } else if (i12 >= 0) {
                    Object[] objArr5 = this.f21251b;
                    e.c(objArr5, objArr5, i12, i11, y11);
                } else {
                    Object[] objArr6 = this.f21251b;
                    i12 += objArr6.length;
                    int i13 = y11 - i11;
                    int length = objArr6.length - i12;
                    if (length >= i13) {
                        e.c(objArr6, objArr6, i12, i11, y11);
                    } else {
                        e.c(objArr6, objArr6, i12, i11, i11 + length);
                        Object[] objArr7 = this.f21251b;
                        e.c(objArr7, objArr7, 0, this.f21250a + length, y11);
                    }
                }
                this.f21250a = i12;
                h(x(y11 - size2), collection);
            } else {
                int i14 = y11 + size2;
                if (y11 < y10) {
                    int i15 = size2 + y10;
                    Object[] objArr8 = this.f21251b;
                    if (i15 <= objArr8.length) {
                        e.c(objArr8, objArr8, i14, y11, y10);
                    } else if (i14 >= objArr8.length) {
                        e.c(objArr8, objArr8, i14 - objArr8.length, y11, y10);
                    } else {
                        int length2 = y10 - (i15 - objArr8.length);
                        e.c(objArr8, objArr8, 0, length2, y10);
                        Object[] objArr9 = this.f21251b;
                        e.c(objArr9, objArr9, i14, y11, length2);
                    }
                } else {
                    Object[] objArr10 = this.f21251b;
                    e.c(objArr10, objArr10, size2, 0, y10);
                    Object[] objArr11 = this.f21251b;
                    if (i14 >= objArr11.length) {
                        e.c(objArr11, objArr11, i14 - objArr11.length, y11, objArr11.length);
                    } else {
                        e.c(objArr11, objArr11, 0, objArr11.length - size2, objArr11.length);
                        Object[] objArr12 = this.f21251b;
                        e.c(objArr12, objArr12, i14, y11, objArr12.length - size2);
                    }
                }
                h(y11, collection);
            }
            return true;
        }
    }

    public c() {
        this.f21251b = f21249d;
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
