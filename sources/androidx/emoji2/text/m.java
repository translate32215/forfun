package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import y0.b;

/* compiled from: MetadataRepo */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final b f1560a;

    /* renamed from: b  reason: collision with root package name */
    public final char[] f1561b;

    /* renamed from: c  reason: collision with root package name */
    public final a f1562c = new a(1024);

    /* renamed from: d  reason: collision with root package name */
    public final Typeface f1563d;

    public m(Typeface typeface, b bVar) {
        this.f1563d = typeface;
        this.f1560a = bVar;
        this.f1561b = new char[(bVar.c() * 2)];
        int c10 = bVar.c();
        for (int i10 = 0; i10 < c10; i10++) {
            h hVar = new h(this, i10);
            Character.toChars(hVar.d(), this.f1561b, i10 * 2);
            q.a.c(hVar.b() > 0, "invalid metadata codepoint length");
            this.f1562c.a(hVar, 0, hVar.b() - 1);
        }
    }

    /* compiled from: MetadataRepo */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<a> f1564a;

        /* renamed from: b  reason: collision with root package name */
        public h f1565b;

        public a() {
            this.f1564a = new SparseArray<>(1);
        }

        public void a(h hVar, int i10, int i11) {
            int a10 = hVar.a(i10);
            SparseArray<a> sparseArray = this.f1564a;
            a aVar = sparseArray == null ? null : sparseArray.get(a10);
            if (aVar == null) {
                aVar = new a();
                this.f1564a.put(hVar.a(i10), aVar);
            }
            if (i11 > i10) {
                aVar.a(hVar, i10 + 1, i11);
            } else {
                aVar.f1565b = hVar;
            }
        }

        public a(int i10) {
            this.f1564a = new SparseArray<>(i10);
        }
    }
}
