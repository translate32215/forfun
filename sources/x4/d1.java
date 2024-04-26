package x4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;

/* compiled from: WakeLockManager */
public final class d1 {

    /* renamed from: a  reason: collision with root package name */
    public final PowerManager f27488a;

    /* renamed from: b  reason: collision with root package name */
    public PowerManager.WakeLock f27489b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f27490c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f27491d;

    public d1(Context context) {
        this.f27488a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @SuppressLint({"WakelockTimeout"})
    public final void a() {
        PowerManager.WakeLock wakeLock = this.f27489b;
        if (wakeLock != null) {
            if (!this.f27490c || !this.f27491d) {
                wakeLock.release();
            } else {
                wakeLock.acquire();
            }
        }
    }
}
