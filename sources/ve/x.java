package ve;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* compiled from: Sink */
public interface x extends Closeable, Flushable {
    void close() throws IOException;

    z e();

    void flush() throws IOException;

    void m(f fVar, long j10) throws IOException;
}
