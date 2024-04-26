package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class gr implements y9 {

    /* renamed from: a  reason: collision with root package name */
    public final FileChannel f6682a;

    /* renamed from: b  reason: collision with root package name */
    public final long f6683b;

    /* renamed from: c  reason: collision with root package name */
    public final long f6684c;

    public gr(FileChannel fileChannel, long j10, long j11) {
        this.f6682a = fileChannel;
        this.f6683b = j10;
        this.f6684c = j11;
    }

    public final void b(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
        MappedByteBuffer map = this.f6682a.map(FileChannel.MapMode.READ_ONLY, this.f6683b + j10, (long) i10);
        map.load();
        for (MessageDigest update : messageDigestArr) {
            map.position(0);
            update.update(map);
        }
    }

    public final long size() {
        return this.f6684c;
    }
}
