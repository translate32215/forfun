package ab;

import ab.d0;
import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import f7.f0;
import s8.j;
import s8.t;
import s8.z;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class c0 extends Binder {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f204b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final a f205a;

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    public interface a {
    }

    public c0(a aVar) {
        this.f205a = aVar;
    }

    public void a(d0.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            a aVar2 = this.f205a;
            Intent intent = aVar.f215a;
            f fVar = f.this;
            fVar.getClass();
            j jVar = new j();
            fVar.f218a.execute(new f0(fVar, intent, jVar));
            z<TResult> zVar = jVar.f25035a;
            zVar.f25071b.a(new t(b0.f202a, new b2.t(aVar)));
            zVar.s();
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
