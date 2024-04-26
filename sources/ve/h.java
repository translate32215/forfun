package ve;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: BufferedSource */
public interface h extends y, ReadableByteChannel {
    f A();

    boolean B() throws IOException;

    byte[] D(long j10) throws IOException;

    short I() throws IOException;

    long K(x xVar) throws IOException;

    String O(long j10) throws IOException;

    boolean R(long j10, i iVar) throws IOException;

    void X(long j10) throws IOException;

    void b(long j10) throws IOException;

    long b0(byte b10) throws IOException;

    @Deprecated
    f c();

    long c0() throws IOException;

    String d0(Charset charset) throws IOException;

    InputStream e0();

    int f(r rVar) throws IOException;

    i l(long j10) throws IOException;

    boolean p(long j10) throws IOException;

    long q(i iVar) throws IOException;

    byte readByte() throws IOException;

    int readInt() throws IOException;

    short readShort() throws IOException;

    String w() throws IOException;

    int y() throws IOException;
}
