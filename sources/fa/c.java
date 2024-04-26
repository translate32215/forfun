package fa;

import com.google.android.gms.common.internal.i;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class c extends Exception {
    @Deprecated
    public c() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(String str) {
        super(str);
        i.f(str, "Detail message must not be empty");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(String str, Throwable th) {
        super(str, th);
        i.f(str, "Detail message must not be empty");
    }
}
