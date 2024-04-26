package g0;

import android.graphics.Insets;

/* compiled from: Insets */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f18354e = new b(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f18355a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18356b;

    /* renamed from: c  reason: collision with root package name */
    public final int f18357c;

    /* renamed from: d  reason: collision with root package name */
    public final int f18358d;

    /* compiled from: Insets */
    public static class a {
        public static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    public b(int i10, int i11, int i12, int i13) {
        this.f18355a = i10;
        this.f18356b = i11;
        this.f18357c = i12;
        this.f18358d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f18355a, bVar2.f18355a), Math.max(bVar.f18356b, bVar2.f18356b), Math.max(bVar.f18357c, bVar2.f18357c), Math.max(bVar.f18358d, bVar2.f18358d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return f18354e;
        }
        return new b(i10, i11, i12, i13);
    }

    public static b c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets d() {
        return a.a(this.f18355a, this.f18356b, this.f18357c, this.f18358d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f18358d == bVar.f18358d && this.f18355a == bVar.f18355a && this.f18357c == bVar.f18357c && this.f18356b == bVar.f18356b;
    }

    public int hashCode() {
        return (((((this.f18355a * 31) + this.f18356b) * 31) + this.f18357c) * 31) + this.f18358d;
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("Insets{left=");
        a10.append(this.f18355a);
        a10.append(", top=");
        a10.append(this.f18356b);
        a10.append(", right=");
        a10.append(this.f18357c);
        a10.append(", bottom=");
        a10.append(this.f18358d);
        a10.append('}');
        return a10.toString();
    }
}
