package e8;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ad0 {

    /* renamed from: a  reason: collision with root package name */
    public int f13678a;

    /* renamed from: b  reason: collision with root package name */
    public final xc0 f13679b = new xc0();

    /* renamed from: c  reason: collision with root package name */
    public ByteBuffer f13680c;

    /* renamed from: d  reason: collision with root package name */
    public long f13681d;

    public final void a() {
        this.f13678a = 0;
        ByteBuffer byteBuffer = this.f13680c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final boolean b(int i10) {
        return (this.f13678a & i10) == i10;
    }

    public final ByteBuffer c(int i10) {
        ByteBuffer byteBuffer = this.f13680c;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("Buffer too small (");
        sb2.append(capacity);
        sb2.append(" < ");
        sb2.append(i10);
        sb2.append(")");
        throw new IllegalStateException(sb2.toString());
    }

    public final boolean d() {
        return b(4);
    }
}
