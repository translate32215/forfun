package k8;

import java.util.ArrayList;
import java.util.List;
import n2.g;
import x.f;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    public final List<e0> f20482a = new ArrayList();

    public abstract o a(String str, g gVar, List<o> list);

    public final o b(String str) {
        String str2;
        if (this.f20482a.contains(f.k(str))) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Command not implemented: ".concat(valueOf);
            } else {
                str2 = new String("Command not implemented: ");
            }
            throw new UnsupportedOperationException(str2);
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
