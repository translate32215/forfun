package ke;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import le.c;
import q.b;

/* compiled from: Headers */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f20779a;

    /* compiled from: Headers */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f20780a = new ArrayList(20);

        public a a(String str, String str2) {
            r.a(str);
            r.b(str2, str);
            this.f20780a.add(str);
            this.f20780a.add(str2.trim());
            return this;
        }

        public a b(String str, String str2) {
            this.f20780a.add(str);
            this.f20780a.add(str2.trim());
            return this;
        }

        public a c(String str) {
            int i10 = 0;
            while (i10 < this.f20780a.size()) {
                if (str.equalsIgnoreCase(this.f20780a.get(i10))) {
                    this.f20780a.remove(i10);
                    this.f20780a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }
    }

    public r(a aVar) {
        List<String> list = aVar.f20780a;
        this.f20779a = (String[]) list.toArray(new String[list.size()]);
    }

    public static void a(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (!str.isEmpty()) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(c.m("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str));
                }
            }
        } else {
            throw new IllegalArgumentException("name is empty");
        }
    }

    public static void b(String str, String str2) {
        if (str != null) {
            int length = str.length();
            int i10 = 0;
            while (i10 < length) {
                char charAt = str.charAt(i10);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    i10++;
                } else {
                    throw new IllegalArgumentException(c.m("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException(b.a("value for name ", str2, " == null"));
    }

    public static r f(String... strArr) {
        if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            int i10 = 0;
            while (i10 < strArr2.length) {
                if (strArr2[i10] != null) {
                    strArr2[i10] = strArr2[i10].trim();
                    i10++;
                } else {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
            }
            for (int i11 = 0; i11 < strArr2.length; i11 += 2) {
                String str = strArr2[i11];
                String str2 = strArr2[i11 + 1];
                a(str);
                b(str2, str);
            }
            return new r(strArr2);
        }
        throw new IllegalArgumentException("Expected alternating header names and values");
    }

    @Nullable
    public String c(String str) {
        String[] strArr = this.f20779a;
        int length = strArr.length;
        do {
            length -= 2;
            if (length < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase(strArr[length]));
        return strArr[length + 1];
    }

    public String d(int i10) {
        return this.f20779a[i10 * 2];
    }

    public a e() {
        a aVar = new a();
        Collections.addAll(aVar.f20780a, this.f20779a);
        return aVar;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof r) && Arrays.equals(((r) obj).f20779a, this.f20779a);
    }

    public int g() {
        return this.f20779a.length / 2;
    }

    public String h(int i10) {
        return this.f20779a[(i10 * 2) + 1];
    }

    public int hashCode() {
        return Arrays.hashCode(this.f20779a);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int g10 = g();
        for (int i10 = 0; i10 < g10; i10++) {
            sb2.append(d(i10));
            sb2.append(": ");
            sb2.append(h(i10));
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public r(String[] strArr) {
        this.f20779a = strArr;
    }
}
