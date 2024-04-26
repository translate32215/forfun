package e8;

import com.google.android.gms.ads.internal.util.b;
import d7.l;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class ex implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static final Callable f14517a = new ex();

    public final Object call() {
        String str;
        b bVar = l.B.f13196m;
        synchronized (bVar.f5656a) {
            str = bVar.f5658c;
        }
        return new dx(str, l.B.f13196m.g());
    }
}
