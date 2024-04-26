package e8;

import java.util.List;
import md.f;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class y90 extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17586a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f17587b;

    public y90() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f17587b = null;
    }

    public Throwable fillInStackTrace() {
        switch (this.f17586a) {
            case 1:
                setStackTrace(new StackTraceElement[0]);
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    public String getLocalizedMessage() {
        switch (this.f17586a) {
            case 1:
                return ((f) this.f17587b).toString();
            default:
                return super.getLocalizedMessage();
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [md.f, java.util.List<java.lang.String>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public y90(md.f r2) {
        /*
            r1 = this;
            r0 = 1
            r1.f17586a = r0
            r1.<init>()
            r1.f17587b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.y90.<init>(md.f):void");
    }
}
