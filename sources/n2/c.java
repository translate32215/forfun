package n2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import g2.e;

/* compiled from: BroadcastReceiverConstraintTracker */
public abstract class c<T> extends d<T> {

    /* renamed from: h  reason: collision with root package name */
    public static final String f21831h = e.e("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g  reason: collision with root package name */
    public final BroadcastReceiver f21832g = new a();

    /* compiled from: BroadcastReceiverConstraintTracker */
    public class a extends BroadcastReceiver {
        public a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.g(context, intent);
            }
        }
    }

    public c(Context context, r2.a aVar) {
        super(context, aVar);
    }

    public void d() {
        e.c().a(f21831h, String.format("%s: registering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f21836b.registerReceiver(this.f21832g, f());
    }

    public void e() {
        e.c().a(f21831h, String.format("%s: unregistering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f21836b.unregisterReceiver(this.f21832g);
    }

    public abstract IntentFilter f();

    public abstract void g(Context context, Intent intent);
}
