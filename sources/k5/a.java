package k5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import v6.v;

/* compiled from: Atom */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f19894a;

    /* renamed from: k5.a$a  reason: collision with other inner class name */
    /* compiled from: Atom */
    public static final class C0173a extends a {

        /* renamed from: b  reason: collision with root package name */
        public final long f19895b;

        /* renamed from: c  reason: collision with root package name */
        public final List<b> f19896c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public final List<C0173a> f19897d = new ArrayList();

        public C0173a(int i10, long j10) {
            super(i10);
            this.f19895b = j10;
        }

        public C0173a b(int i10) {
            int size = this.f19897d.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0173a aVar = this.f19897d.get(i11);
                if (aVar.f19894a == i10) {
                    return aVar;
                }
            }
            return null;
        }

        public b c(int i10) {
            int size = this.f19896c.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f19896c.get(i11);
                if (bVar.f19894a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        public String toString() {
            return a.a(this.f19894a) + " leaves: " + Arrays.toString(this.f19896c.toArray()) + " containers: " + Arrays.toString(this.f19897d.toArray());
        }
    }

    /* compiled from: Atom */
    public static final class b extends a {

        /* renamed from: b  reason: collision with root package name */
        public final v f19898b;

        public b(int i10, v vVar) {
            super(i10);
            this.f19898b = vVar;
        }
    }

    public a(int i10) {
        this.f19894a = i10;
    }

    public static String a(int i10) {
        StringBuilder a10 = android.support.v4.media.a.a("");
        a10.append((char) ((i10 >> 24) & 255));
        a10.append((char) ((i10 >> 16) & 255));
        a10.append((char) ((i10 >> 8) & 255));
        a10.append((char) (i10 & 255));
        return a10.toString();
    }

    public String toString() {
        return a(this.f19894a);
    }
}
