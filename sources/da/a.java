package da;

import aa.g;
import aa.l;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: Ints */
public final class a {

    /* renamed from: da.a$a  reason: collision with other inner class name */
    /* compiled from: Ints */
    public static class C0129a extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f13219a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13220b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13221c;

        public C0129a(int[] iArr, int i10, int i11) {
            this.f13219a = iArr;
            this.f13220b = i10;
            this.f13221c = i11;
        }

        public boolean contains(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.f13219a;
                int intValue = ((Integer) obj).intValue();
                int i10 = this.f13220b;
                int i11 = this.f13221c;
                while (true) {
                    if (i10 >= i11) {
                        i10 = -1;
                        break;
                    } else if (iArr[i10] == intValue) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 != -1) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0129a)) {
                return super.equals(obj);
            }
            C0129a aVar = (C0129a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f13219a[this.f13220b + i10] != aVar.f13219a[aVar.f13220b + i10]) {
                    return false;
                }
            }
            return true;
        }

        public Object get(int i10) {
            g.c(i10, size());
            return Integer.valueOf(this.f13219a[this.f13220b + i10]);
        }

        public int hashCode() {
            int i10 = 1;
            for (int i11 = this.f13220b; i11 < this.f13221c; i11++) {
                i10 = (i10 * 31) + this.f13219a[i11];
            }
            return i10;
        }

        public int indexOf(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.f13219a;
                int intValue = ((Integer) obj).intValue();
                int i10 = this.f13220b;
                int i11 = this.f13221c;
                while (true) {
                    if (i10 >= i11) {
                        i10 = -1;
                        break;
                    } else if (iArr[i10] == intValue) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 >= 0) {
                    return i10 - this.f13220b;
                }
            }
            return -1;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.f13219a;
                int intValue = ((Integer) obj).intValue();
                int i10 = this.f13220b;
                int i11 = this.f13221c - 1;
                while (true) {
                    if (i11 < i10) {
                        i11 = -1;
                        break;
                    } else if (iArr[i11] == intValue) {
                        break;
                    } else {
                        i11--;
                    }
                }
                if (i11 >= 0) {
                    return i11 - this.f13220b;
                }
            }
            return -1;
        }

        public Object set(int i10, Object obj) {
            Integer num = (Integer) obj;
            g.c(i10, size());
            int[] iArr = this.f13219a;
            int i11 = this.f13220b + i10;
            int i12 = iArr[i11];
            num.getClass();
            iArr[i11] = num.intValue();
            return Integer.valueOf(i12);
        }

        public int size() {
            return this.f13221c - this.f13220b;
        }

        public List<Integer> subList(int i10, int i11) {
            g.e(i10, i11, size());
            if (i10 == i11) {
                return Collections.emptyList();
            }
            int[] iArr = this.f13219a;
            int i12 = this.f13220b;
            return new C0129a(iArr, i10 + i12, i12 + i11);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append(this.f13219a[this.f13220b]);
            int i10 = this.f13220b;
            while (true) {
                i10++;
                if (i10 < this.f13221c) {
                    sb2.append(", ");
                    sb2.append(this.f13219a[i10]);
                } else {
                    sb2.append(']');
                    return sb2.toString();
                }
            }
        }
    }

    public static int a(long j10) {
        int i10 = (int) j10;
        if (((long) i10) == j10) {
            return i10;
        }
        throw new IllegalArgumentException(l.a("Out of range: %s", Long.valueOf(j10)));
    }

    public static int[] b(Collection<? extends Number> collection) {
        if (collection instanceof C0129a) {
            C0129a aVar = (C0129a) collection;
            return Arrays.copyOfRange(aVar.f13219a, aVar.f13220b, aVar.f13221c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = array[i10];
            obj.getClass();
            iArr[i10] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
