package n2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;

/* compiled from: NetworkStateTracker */
public class e extends d<l2.b> {

    /* renamed from: j  reason: collision with root package name */
    public static final String f21842j = g2.e.e("NetworkStateTracker");

    /* renamed from: g  reason: collision with root package name */
    public final ConnectivityManager f21843g = ((ConnectivityManager) this.f21836b.getSystemService("connectivity"));

    /* renamed from: h  reason: collision with root package name */
    public b f21844h;

    /* renamed from: i  reason: collision with root package name */
    public a f21845i;

    /* compiled from: NetworkStateTracker */
    public class a extends BroadcastReceiver {
        public a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                g2.e.c().a(e.f21842j, "Network broadcast received", new Throwable[0]);
                e eVar = e.this;
                eVar.c(eVar.f());
            }
        }
    }

    /* compiled from: NetworkStateTracker */
    public class b extends ConnectivityManager.NetworkCallback {
        public b() {
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            g2.e.c().a(e.f21842j, String.format("Network capabilities changed: %s", new Object[]{networkCapabilities}), new Throwable[0]);
            e eVar = e.this;
            eVar.c(eVar.f());
        }

        public void onLost(Network network) {
            g2.e.c().a(e.f21842j, "Network connection lost", new Throwable[0]);
            e eVar = e.this;
            eVar.c(eVar.f());
        }
    }

    public e(Context context, r2.a aVar) {
        super(context, aVar);
        if (g()) {
            this.f21844h = new b();
        } else {
            this.f21845i = new a();
        }
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public Object a() {
        return f();
    }

    public void d() {
        if (g()) {
            g2.e.c().a(f21842j, "Registering network callback", new Throwable[0]);
            this.f21843g.registerDefaultNetworkCallback(this.f21844h);
            return;
        }
        g2.e.c().a(f21842j, "Registering broadcast receiver", new Throwable[0]);
        this.f21836b.registerReceiver(this.f21845i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public void e() {
        if (g()) {
            try {
                g2.e.c().a(f21842j, "Unregistering network callback", new Throwable[0]);
                this.f21843g.unregisterNetworkCallback(this.f21844h);
            } catch (IllegalArgumentException e10) {
                g2.e.c().b(f21842j, "Received exception while unregistering network callback", e10);
            }
        } else {
            g2.e.c().a(f21842j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f21836b.unregisterReceiver(this.f21845i);
        }
    }

    public l2.b f() {
        NetworkCapabilities networkCapabilities;
        NetworkInfo activeNetworkInfo = this.f21843g.getActiveNetworkInfo();
        boolean z10 = true;
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean z12 = Build.VERSION.SDK_INT >= 23 && (networkCapabilities = this.f21843g.getNetworkCapabilities(this.f21843g.getActiveNetwork())) != null && networkCapabilities.hasCapability(16);
        boolean a10 = j0.a.a(this.f21843g);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z10 = false;
        }
        return new l2.b(z11, z12, a10, z10);
    }
}
