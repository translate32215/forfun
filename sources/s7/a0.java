package s7;

import com.google.android.gms.common.f;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class a0 extends f {

    /* renamed from: e  reason: collision with root package name */
    public final Callable f25003e;

    public /* synthetic */ a0(Callable callable) {
        super(false, 1, (String) null, (Throwable) null);
        this.f25003e = callable;
    }

    public final String a() {
        try {
            return (String) this.f25003e.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
