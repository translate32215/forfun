package d5;

import com.google.android.exoplayer2.upstream.c;
import java.io.IOException;

/* compiled from: ExtractorInput */
public interface j extends c {
    int a(byte[] bArr, int i10, int i11) throws IOException;

    long b();

    int c(int i10) throws IOException;

    boolean d(byte[] bArr, int i10, int i11, boolean z10) throws IOException;

    int e(byte[] bArr, int i10, int i11) throws IOException;

    void f();

    void g(int i10) throws IOException;

    boolean h(byte[] bArr, int i10, int i11, boolean z10) throws IOException;

    long i();

    void j(byte[] bArr, int i10, int i11) throws IOException;

    void k(int i10) throws IOException;

    long l();

    void readFully(byte[] bArr, int i10, int i11) throws IOException;
}
