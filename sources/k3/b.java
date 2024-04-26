package k3;

import java.io.IOException;

/* compiled from: HttpException */
public final class b extends IOException {
    public b() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b(int i10, int i11) {
        this("Http request failed", i10, (Throwable) null);
        if (i11 == 1) {
            return;
        }
        if (i11 != 2) {
        }
    }

    public b(String str, int i10, Throwable th) {
        super(str + ", status code: " + i10, th);
    }
}
