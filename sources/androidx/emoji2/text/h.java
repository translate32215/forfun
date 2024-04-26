package androidx.emoji2.text;

import java.nio.ByteBuffer;
import y0.a;
import y0.b;

/* compiled from: EmojiMetadata */
public class h {

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadLocal<a> f1532d = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final int f1533a;

    /* renamed from: b  reason: collision with root package name */
    public final m f1534b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f1535c = 0;

    public h(m mVar, int i10) {
        this.f1534b = mVar;
        this.f1533a = i10;
    }

    public int a(int i10) {
        a e10 = e();
        int a10 = e10.a(16);
        if (a10 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = e10.f27976b;
        int i11 = a10 + e10.f27975a;
        return byteBuffer.getInt((i10 * 4) + byteBuffer.getInt(i11) + i11 + 4);
    }

    public int b() {
        a e10 = e();
        int a10 = e10.a(16);
        if (a10 == 0) {
            return 0;
        }
        int i10 = a10 + e10.f27975a;
        return e10.f27976b.getInt(e10.f27976b.getInt(i10) + i10);
    }

    public short c() {
        a e10 = e();
        int a10 = e10.a(14);
        if (a10 != 0) {
            return e10.f27976b.getShort(a10 + e10.f27975a);
        }
        return 0;
    }

    public int d() {
        a e10 = e();
        int a10 = e10.a(4);
        if (a10 != 0) {
            return e10.f27976b.getInt(a10 + e10.f27975a);
        }
        return 0;
    }

    public final a e() {
        ThreadLocal<a> threadLocal = f1532d;
        a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new a();
            threadLocal.set(aVar);
        }
        b bVar = this.f1534b.f1560a;
        int i10 = this.f1533a;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i11 = a10 + bVar.f27975a;
            int i12 = (i10 * 4) + bVar.f27976b.getInt(i11) + i11 + 4;
            aVar.b(bVar.f27976b.getInt(i12) + i12, bVar.f27976b);
        }
        return aVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(d()));
        sb2.append(", codepoints:");
        int b10 = b();
        for (int i10 = 0; i10 < b10; i10++) {
            sb2.append(Integer.toHexString(a(i10)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
