package k0;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import ud.k;

/* compiled from: Bundle.kt */
public final class c {
    public static final void a(Bundle bundle, String str, Size size) {
        k.f(bundle, "bundle");
        k.f(str, "key");
        bundle.putSize(str, size);
    }

    public static final void b(Bundle bundle, String str, SizeF sizeF) {
        k.f(bundle, "bundle");
        k.f(str, "key");
        bundle.putSizeF(str, sizeF);
    }
}
