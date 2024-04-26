package ve;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import t3.a0;

/* compiled from: Okio */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f26761a = Logger.getLogger(p.class.getName());

    /* compiled from: Okio */
    public class a implements y {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z f26762a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ InputStream f26763b;

        public a(z zVar, InputStream inputStream) {
            this.f26762a = zVar;
            this.f26763b = inputStream;
        }

        public long a0(f fVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException(a0.a("byteCount < 0: ", j10));
            } else if (j10 == 0) {
                return 0;
            } else {
                try {
                    this.f26762a.f();
                    u l02 = fVar.l0(1);
                    int read = this.f26763b.read(l02.f26774a, l02.f26776c, (int) Math.min(j10, (long) (8192 - l02.f26776c)));
                    if (read == -1) {
                        return -1;
                    }
                    l02.f26776c += read;
                    long j11 = (long) read;
                    fVar.f26740b += j11;
                    return j11;
                } catch (AssertionError e10) {
                    if (p.a(e10)) {
                        throw new IOException(e10);
                    }
                    throw e10;
                }
            }
        }

        public void close() throws IOException {
            this.f26763b.close();
        }

        public z e() {
            return this.f26762a;
        }

        public String toString() {
            StringBuilder a10 = android.support.v4.media.a.a("source(");
            a10.append(this.f26763b);
            a10.append(")");
            return a10.toString();
        }
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static x b(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            q qVar = new q(socket);
            OutputStream outputStream = socket.getOutputStream();
            if (outputStream != null) {
                return new a(qVar, new o(qVar, outputStream));
            }
            throw new IllegalArgumentException("out == null");
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    public static y c(InputStream inputStream) {
        return d(inputStream, new z());
    }

    public static y d(InputStream inputStream, z zVar) {
        if (inputStream != null) {
            return new a(zVar, inputStream);
        }
        throw new IllegalArgumentException("in == null");
    }

    public static y e(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            q qVar = new q(socket);
            return new b(qVar, d(socket.getInputStream(), qVar));
        } else {
            throw new IOException("socket's input stream == null");
        }
    }
}
