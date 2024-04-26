package ld;

import java.util.AbstractList;
import java.util.List;

/* compiled from: AbstractMutableList.kt */
public abstract class a<E> extends AbstractList<E> implements List<E> {
    public final E remove(int i10) {
        c cVar = (c) this;
        int size = cVar.size();
        if (i10 < 0 || i10 >= size) {
            throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + size);
        } else if (i10 == h.b(cVar)) {
            return cVar.A();
        } else {
            if (i10 == 0) {
                return cVar.z();
            }
            int y10 = cVar.y(cVar.f21250a + i10);
            E e10 = cVar.f21251b[y10];
            if (i10 < (cVar.size() >> 1)) {
                int i11 = cVar.f21250a;
                if (y10 >= i11) {
                    Object[] objArr = cVar.f21251b;
                    e.c(objArr, objArr, i11 + 1, i11, y10);
                } else {
                    Object[] objArr2 = cVar.f21251b;
                    e.c(objArr2, objArr2, 1, 0, y10);
                    Object[] objArr3 = cVar.f21251b;
                    objArr3[0] = objArr3[objArr3.length - 1];
                    int i12 = cVar.f21250a;
                    e.c(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
                }
                Object[] objArr4 = cVar.f21251b;
                int i13 = cVar.f21250a;
                objArr4[i13] = null;
                cVar.f21250a = cVar.q(i13);
            } else {
                int y11 = cVar.y(h.b(cVar) + cVar.f21250a);
                if (y10 <= y11) {
                    Object[] objArr5 = cVar.f21251b;
                    e.c(objArr5, objArr5, y10, y10 + 1, y11 + 1);
                } else {
                    Object[] objArr6 = cVar.f21251b;
                    e.c(objArr6, objArr6, y10, y10 + 1, objArr6.length);
                    Object[] objArr7 = cVar.f21251b;
                    objArr7[objArr7.length - 1] = objArr7[0];
                    e.c(objArr7, objArr7, 0, 1, y11 + 1);
                }
                cVar.f21251b[y11] = null;
            }
            cVar.f21252c = cVar.size() - 1;
            return e10;
        }
    }

    public final int size() {
        return ((c) this).f21252c;
    }
}
