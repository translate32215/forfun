package z2;

import o1.q;
import t.g;

/* compiled from: DocumentData */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f28215a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28216b;

    /* renamed from: c  reason: collision with root package name */
    public final float f28217c;

    /* renamed from: d  reason: collision with root package name */
    public final int f28218d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28219e;

    /* renamed from: f  reason: collision with root package name */
    public final float f28220f;

    /* renamed from: g  reason: collision with root package name */
    public final float f28221g;

    /* renamed from: h  reason: collision with root package name */
    public final int f28222h;

    /* renamed from: i  reason: collision with root package name */
    public final int f28223i;

    /* renamed from: j  reason: collision with root package name */
    public final float f28224j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f28225k;

    public b(String str, String str2, float f10, int i10, int i11, float f11, float f12, int i12, int i13, float f13, boolean z10) {
        this.f28215a = str;
        this.f28216b = str2;
        this.f28217c = f10;
        this.f28218d = i10;
        this.f28219e = i11;
        this.f28220f = f11;
        this.f28221g = f12;
        this.f28222h = i12;
        this.f28223i = i13;
        this.f28224j = f13;
        this.f28225k = z10;
    }

    public int hashCode() {
        String str = this.f28216b;
        int f10 = ((g.f(this.f28218d) + (((int) (((float) q.a(str, this.f28215a.hashCode() * 31, 31)) + this.f28217c)) * 31)) * 31) + this.f28219e;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(this.f28220f);
        return (((f10 * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f28222h;
    }
}
