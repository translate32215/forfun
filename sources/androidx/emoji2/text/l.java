package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import y0.b;

/* compiled from: MetadataListReader */
public class l {
    public static b a(ByteBuffer byteBuffer) throws IOException {
        long j10;
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        short s10 = duplicate.getShort() & 65535;
        if (s10 <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i10 = 0;
            while (true) {
                if (i10 >= s10) {
                    j10 = -1;
                    break;
                }
                int i11 = duplicate.getInt();
                duplicate.position(duplicate.position() + 4);
                j10 = ((long) duplicate.getInt()) & 4294967295L;
                duplicate.position(duplicate.position() + 4);
                if (1835365473 == i11) {
                    break;
                }
                i10++;
            }
            if (j10 != -1) {
                duplicate.position(duplicate.position() + ((int) (j10 - ((long) duplicate.position()))));
                duplicate.position(duplicate.position() + 12);
                long j11 = ((long) duplicate.getInt()) & 4294967295L;
                for (int i12 = 0; ((long) i12) < j11; i12++) {
                    int i13 = duplicate.getInt();
                    long j12 = ((long) duplicate.getInt()) & 4294967295L;
                    duplicate.getInt();
                    if (1164798569 == i13 || 1701669481 == i13) {
                        duplicate.position((int) (j12 + j10));
                        b bVar = new b();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        bVar.b(duplicate.position() + duplicate.getInt(duplicate.position()), duplicate);
                        return bVar;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }
}
