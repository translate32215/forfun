package s8;

import com.google.android.gms.common.internal.i;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
public class j<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final z<TResult> f25035a = new z<>();

    public boolean a(Exception exc) {
        z<TResult> zVar = this.f25035a;
        zVar.getClass();
        i.i(exc, "Exception must not be null");
        synchronized (zVar.f25070a) {
            if (zVar.f25072c) {
                return false;
            }
            zVar.f25072c = true;
            zVar.f25075f = exc;
            zVar.f25071b.b(zVar);
            return true;
        }
    }

    public boolean b(TResult tresult) {
        z<TResult> zVar = this.f25035a;
        synchronized (zVar.f25070a) {
            if (zVar.f25072c) {
                return false;
            }
            zVar.f25072c = true;
            zVar.f25074e = tresult;
            zVar.f25071b.b(zVar);
            return true;
        }
    }
}
