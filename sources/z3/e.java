package z3;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.bumptech.glide.i;
import z3.c;

/* compiled from: DefaultConnectivityMonitor */
public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f28244a;

    /* renamed from: b  reason: collision with root package name */
    public final c.a f28245b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f28246c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f28247d;

    /* renamed from: e  reason: collision with root package name */
    public final BroadcastReceiver f28248e = new a();

    /* compiled from: DefaultConnectivityMonitor */
    public class a extends BroadcastReceiver {
        public a() {
        }

        public void onReceive(Context context, Intent intent) {
            e eVar = e.this;
            boolean z10 = eVar.f28246c;
            eVar.f28246c = eVar.i(context);
            if (z10 != e.this.f28246c) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    StringBuilder a10 = android.support.v4.media.a.a("connectivity changed, isConnected: ");
                    a10.append(e.this.f28246c);
                    Log.d("ConnectivityMonitor", a10.toString());
                }
                e eVar2 = e.this;
                c.a aVar = eVar2.f28245b;
                boolean z11 = eVar2.f28246c;
                i.b bVar = (i.b) aVar;
                bVar.getClass();
                if (z11) {
                    synchronized (i.this) {
                        bVar.f4949a.b();
                    }
                }
            }
        }
    }

    public e(Context context, c.a aVar) {
        this.f28244a = context.getApplicationContext();
        this.f28245b = aVar;
    }

    public void Z() {
        if (this.f28247d) {
            this.f28244a.unregisterReceiver(this.f28248e);
            this.f28247d = false;
        }
    }

    @SuppressLint({"MissingPermission"})
    public boolean i(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        e.e.b(connectivityManager);
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (RuntimeException e10) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e10);
            }
            return true;
        }
    }

    public void onDestroy() {
    }

    public void v0() {
        if (!this.f28247d) {
            this.f28246c = i(this.f28244a);
            try {
                this.f28244a.registerReceiver(this.f28248e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f28247d = true;
            } catch (SecurityException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e10);
                }
            }
        }
    }
}
