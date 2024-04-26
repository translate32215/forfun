package s7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import g8.f;
import java.util.concurrent.atomic.AtomicBoolean;

@SuppressLint({"HandlerLeak"})
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class k extends f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f25019a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f25020b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(d dVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f25020b = dVar;
        this.f25019a = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        int i10 = message.what;
        boolean z10 = true;
        if (i10 != 1) {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Don't know how to handle this message: ");
            sb2.append(i10);
            Log.w("GoogleApiAvailability", sb2.toString());
            return;
        }
        int e10 = this.f25020b.e(this.f25019a);
        this.f25020b.getClass();
        AtomicBoolean atomicBoolean = i.f25015a;
        if (!(e10 == 1 || e10 == 2 || e10 == 3 || e10 == 9)) {
            z10 = false;
        }
        if (z10) {
            d dVar = this.f25020b;
            Context context = this.f25019a;
            dVar.i(context, e10, (String) null, dVar.c(context, e10, 0, "n"));
        }
    }
}
