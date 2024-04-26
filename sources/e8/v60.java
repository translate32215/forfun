package e8;

import java.io.PrintWriter;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-base@@19.6.0 */
public final class v60 extends s60 {

    /* renamed from: a  reason: collision with root package name */
    public final p9 f17027a = new p9(16);

    public final void a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> i10 = this.f17027a.i(th, false);
        if (i10 != null) {
            synchronized (i10) {
                for (Throwable printStackTrace : i10) {
                    printWriter.print("Suppressed: ");
                    printStackTrace.printStackTrace(printWriter);
                }
            }
        }
    }

    public final void b(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f17027a.i(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
