package n3;

import android.graphics.Bitmap;
import g4.j;

/* compiled from: AttributeStrategy */
public class c implements l {

    /* renamed from: a  reason: collision with root package name */
    public final b f21854a = new b();

    /* renamed from: b  reason: collision with root package name */
    public final h<a, Bitmap> f21855b = new h<>();

    /* compiled from: AttributeStrategy */
    public static class a implements m {

        /* renamed from: a  reason: collision with root package name */
        public final b f21856a;

        /* renamed from: b  reason: collision with root package name */
        public int f21857b;

        /* renamed from: c  reason: collision with root package name */
        public int f21858c;

        /* renamed from: d  reason: collision with root package name */
        public Bitmap.Config f21859d;

        public a(b bVar) {
            this.f21856a = bVar;
        }

        public void a() {
            this.f21856a.c(this);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f21857b == aVar.f21857b && this.f21858c == aVar.f21858c && this.f21859d == aVar.f21859d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10 = ((this.f21857b * 31) + this.f21858c) * 31;
            Bitmap.Config config = this.f21859d;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return c.g(this.f21857b, this.f21858c, this.f21859d);
        }
    }

    /* compiled from: AttributeStrategy */
    public static class b extends d<a> {
        public m a() {
            return new a(this);
        }
    }

    public static String g(int i10, int i11, Bitmap.Config config) {
        return "[" + i10 + "x" + i11 + "], " + config;
    }

    public Bitmap a(int i10, int i11, Bitmap.Config config) {
        a aVar = (a) this.f21854a.b();
        aVar.f21857b = i10;
        aVar.f21858c = i11;
        aVar.f21859d = config;
        return this.f21855b.a(aVar);
    }

    public void b(Bitmap bitmap) {
        b bVar = this.f21854a;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        a aVar = (a) bVar.b();
        aVar.f21857b = width;
        aVar.f21858c = height;
        aVar.f21859d = config;
        this.f21855b.b(aVar, bitmap);
    }

    public String c(int i10, int i11, Bitmap.Config config) {
        return g(i10, i11, config);
    }

    public int d(Bitmap bitmap) {
        return j.d(bitmap);
    }

    public Bitmap e() {
        return this.f21855b.c();
    }

    public String f(Bitmap bitmap) {
        return g(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("AttributeStrategy:\n  ");
        a10.append(this.f21855b);
        return a10.toString();
    }
}
