package e8;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ma0 extends na0 {

    /* renamed from: a  reason: collision with root package name */
    public Logger f15481a;

    public ma0(String str) {
        this.f15481a = Logger.getLogger(str);
    }

    public final void a(String str) {
        this.f15481a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
