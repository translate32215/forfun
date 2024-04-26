package l1;

import androidx.lifecycle.t;
import androidx.lifecycle.v0;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: LoaderManager */
public abstract class a {
    public static <T extends t & v0> a b(T t10) {
        return new b(t10, ((v0) t10).v());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
