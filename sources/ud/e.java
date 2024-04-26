package ud;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: CollectionToArray.kt */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Object[] f26190a = new Object[0];

    public static final Object[] a(Collection<?> collection) {
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    objArr[i10] = it.next();
                    if (i11 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i12 = ((i11 * 3) + 1) >>> 1;
                        if (i12 <= i11) {
                            if (i11 < 2147483645) {
                                i12 = 2147483645;
                            } else {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i12);
                        k.e(objArr, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i11);
                        k.e(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i10 = i11;
                }
            }
        }
        return f26190a;
    }

    public static final Object[] b(Collection<?> collection, Object[] objArr) {
        Object[] objArr2;
        int size = collection.size();
        int i10 = 0;
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    k.d(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i11 = i10 + 1;
                    objArr2[i10] = it.next();
                    if (i11 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i12 = ((i11 * 3) + 1) >>> 1;
                        if (i12 <= i11) {
                            if (i11 < 2147483645) {
                                i12 = 2147483645;
                            } else {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i12);
                        k.e(objArr2, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i11] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i11);
                        k.e(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i10 = i11;
                }
            } else if (objArr.length <= 0) {
                return objArr;
            } else {
                objArr[0] = null;
                return objArr;
            }
        } else if (objArr.length <= 0) {
            return objArr;
        } else {
            objArr[0] = null;
            return objArr;
        }
    }
}
