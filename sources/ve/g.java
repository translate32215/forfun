package ve;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* compiled from: BufferedSink */
public interface g extends x, WritableByteChannel {
    g C(int i10) throws IOException;

    g F(byte[] bArr) throws IOException;

    g L() throws IOException;

    g Y(String str) throws IOException;

    g Z(long j10) throws IOException;

    f c();

    void flush() throws IOException;

    g g(byte[] bArr, int i10, int i11) throws IOException;

    g k(long j10) throws IOException;

    g n(int i10) throws IOException;

    g r(int i10) throws IOException;

    g x(i iVar) throws IOException;
}
