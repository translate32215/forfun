package ld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import ud.k;

/* compiled from: _Arrays.kt */
public class e extends d {
    public static final <T> List<T> a(T[] tArr) {
        k.f(tArr, "<this>");
        List<T> asList = Arrays.asList(tArr);
        k.e(asList, "asList(this)");
        return asList;
    }

    public static final <T> boolean b(T[] tArr, T t10) {
        int i10;
        k.f(tArr, "<this>");
        k.f(tArr, "<this>");
        if (t10 != null) {
            int length = tArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                } else if (k.a(t10, tArr[i11])) {
                    i10 = i11;
                    break;
                } else {
                    i11++;
                }
            }
        } else {
            int length2 = tArr.length;
            i10 = 0;
            while (true) {
                if (i10 >= length2) {
                    break;
                } else if (tArr[i10] == null) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        i10 = -1;
        if (i10 >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> T[] c(T[] tArr, T[] tArr2, int i10, int i11, int i12) {
        k.f(tArr, "<this>");
        k.f(tArr2, "destination");
        System.arraycopy(tArr, i11, tArr2, i10, i12 - i11);
        return tArr2;
    }

    public static /* synthetic */ Object[] d(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        c(objArr, objArr2, i10, i11, i12);
        return objArr2;
    }

    public static final <T> void e(T[] tArr, T t10, int i10, int i11) {
        k.f(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, (Object) null);
    }

    public static final <T> List<T> f(T[] tArr) {
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            if (t10 != null) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static final <T> int g(T[] tArr) {
        k.f(tArr, "<this>");
        return tArr.length - 1;
    }

    public static final char h(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }
}
