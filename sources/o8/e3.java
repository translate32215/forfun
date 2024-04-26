package o8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.i;
import e8.hn;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class e3 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final u5 f23173a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f23174b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f23175c;

    static {
        Class<e3> cls = e3.class;
    }

    public e3(u5 u5Var) {
        this.f23173a = u5Var;
    }

    public final void a() {
        this.f23173a.g();
        this.f23173a.b().h();
        this.f23173a.b().h();
        if (this.f23174b) {
            this.f23173a.d().f8805n.a("Unregistering connectivity change receiver");
            this.f23174b = false;
            this.f23175c = false;
            try {
                this.f23173a.f23481l.f8837a.unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.f23173a.d().f8797f.b("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        this.f23173a.g();
        String action = intent.getAction();
        this.f23173a.d().f8805n.b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            i iVar = this.f23173a.f23471b;
            u5.I(iVar);
            boolean m10 = iVar.m();
            if (this.f23175c != m10) {
                this.f23175c = m10;
                this.f23173a.b().r(new hn(this, m10));
                return;
            }
            return;
        }
        this.f23173a.d().f8800i.b("NetworkBroadcastReceiver received unknown action", action);
    }
}
