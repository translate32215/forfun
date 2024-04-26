package p2;

import android.content.Context;
import android.os.PowerManager;
import g2.e;
import j.f;
import java.util.WeakHashMap;

/* compiled from: WakeLocks */
public class k {

    /* renamed from: a  reason: collision with root package name */
    public static final String f23803a = e.e("WakeLocks");

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap<PowerManager.WakeLock, String> f23804b = new WeakHashMap<>();

    public static PowerManager.WakeLock a(Context context, String str) {
        String a10 = f.a("WorkManager: ", str);
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, a10);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f23804b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, a10);
        }
        return newWakeLock;
    }
}
