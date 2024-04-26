package w3;

import java.io.File;
import m3.w;

/* compiled from: FileResource */
public class b implements w {

    /* renamed from: a  reason: collision with root package name */
    public final T f26999a;

    public b(File file) {
        if (file != null) {
            this.f26999a = file;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final /* bridge */ /* synthetic */ int a() {
        return 1;
    }

    public Class b() {
        return this.f26999a.getClass();
    }

    public /* bridge */ /* synthetic */ void c() {
    }

    public final Object get() {
        return this.f26999a;
    }
}
