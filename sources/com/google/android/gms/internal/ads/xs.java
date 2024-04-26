package com.google.android.gms.internal.ads;

import android.os.Trace;
import android.util.Pair;
import e8.eg0;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import l0.d;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class xs {
    public static void a(String str) {
        if (eg0.f14479a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void b() {
        if (eg0.f14479a >= 18) {
            Trace.endSection();
        }
    }

    public static Pair<ByteBuffer, Long> c(RandomAccessFile randomAccessFile, int i10) throws IOException {
        int i11;
        if (i10 < 0 || i10 > 65535) {
            throw new IllegalArgumentException(d.a(27, "maxCommentSize: ", i10));
        }
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min((long) i10, length - 22)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - ((long) allocate.capacity());
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        d(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i12 = capacity2 - 22;
            int min = Math.min(i12, 65535);
            int i13 = 0;
            while (true) {
                if (i13 >= min) {
                    break;
                }
                i11 = i12 - i13;
                if (allocate.getInt(i11) == 101010256 && (allocate.getShort(i11 + 20) & 65535) == i13) {
                    break;
                }
                i13++;
            }
        }
        i11 = -1;
        if (i11 == -1) {
            return null;
        }
        allocate.position(i11);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(capacity + ((long) i11)));
    }

    public static void d(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
