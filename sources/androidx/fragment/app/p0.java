package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* compiled from: LogWriter */
public final class p0 extends Writer {

    /* renamed from: a  reason: collision with root package name */
    public final String f1829a;

    /* renamed from: b  reason: collision with root package name */
    public StringBuilder f1830b = new StringBuilder(128);

    public p0(String str) {
        this.f1829a = str;
    }

    public final void a() {
        if (this.f1830b.length() > 0) {
            Log.d(this.f1829a, this.f1830b.toString());
            StringBuilder sb2 = this.f1830b;
            sb2.delete(0, sb2.length());
        }
    }

    public void close() {
        a();
    }

    public void flush() {
        a();
    }

    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == 10) {
                a();
            } else {
                this.f1830b.append(c10);
            }
        }
    }
}
