package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class o7 implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f7672a;

    public o7(ByteBuffer byteBuffer) {
        this.f7672a = byteBuffer.duplicate();
    }

    public final long a() throws IOException {
        return (long) this.f7672a.position();
    }

    public final void close() throws IOException {
    }

    public final void d(long j10) throws IOException {
        this.f7672a.position((int) j10);
    }

    public final ByteBuffer i(long j10, long j11) throws IOException {
        int position = this.f7672a.position();
        this.f7672a.position((int) j10);
        ByteBuffer slice = this.f7672a.slice();
        slice.limit((int) j11);
        this.f7672a.position(position);
        return slice;
    }

    public final int read(ByteBuffer byteBuffer) throws IOException {
        if (this.f7672a.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), this.f7672a.remaining());
        byte[] bArr = new byte[min];
        this.f7672a.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }
}
