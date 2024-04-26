package x4;

import android.content.Context;
import android.net.wifi.WifiManager;

/* compiled from: WifiLockManager */
public final class e1 {

    /* renamed from: a  reason: collision with root package name */
    public final WifiManager f27562a;

    /* renamed from: b  reason: collision with root package name */
    public WifiManager.WifiLock f27563b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f27564c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f27565d;

    public e1(Context context) {
        this.f27562a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    public final void a() {
        WifiManager.WifiLock wifiLock = this.f27563b;
        if (wifiLock != null) {
            if (!this.f27564c || !this.f27565d) {
                wifiLock.release();
            } else {
                wifiLock.acquire();
            }
        }
    }
}
