package n1;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.ZipException;

/* compiled from: ZipUtil */
public final class h {

    /* compiled from: ZipUtil */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f21827a;

        /* renamed from: b  reason: collision with root package name */
        public long f21828b;
    }

    public static a a(RandomAccessFile randomAccessFile) throws IOException, ZipException {
        long length = randomAccessFile.length() - 22;
        long j10 = 0;
        if (length >= 0) {
            long j11 = length - 65536;
            if (j11 >= 0) {
                j10 = j11;
            }
            int reverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(length);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    a aVar = new a();
                    aVar.f21828b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    aVar.f21827a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    return aVar;
                }
                length--;
            } while (length >= j10);
            throw new ZipException("End Of Central Directory signature not found");
        }
        StringBuilder a10 = android.support.v4.media.a.a("File too short to be a zip file: ");
        a10.append(randomAccessFile.length());
        throw new ZipException(a10.toString());
    }
}
