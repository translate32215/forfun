package n2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import g2.e;

/* compiled from: BatteryChargingTracker */
public class a extends c<Boolean> {

    /* renamed from: i  reason: collision with root package name */
    public static final String f21829i = e.e("BatteryChrgTracker");

    public a(Context context, r2.a aVar) {
        super(context, aVar);
    }

    public Object a() {
        int intExtra;
        Intent registerReceiver = this.f21836b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z10 = false;
        if (registerReceiver == null) {
            e.c().b(f21829i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        if (Build.VERSION.SDK_INT < 23 ? registerReceiver.getIntExtra("plugged", 0) != 0 : (intExtra = registerReceiver.getIntExtra("status", -1)) == 2 || intExtra == 5) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    public IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        return intentFilter;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (r6.equals("android.intent.action.ACTION_POWER_DISCONNECTED") == false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            java.lang.String r6 = r7.getAction()
            if (r6 != 0) goto L_0x0007
            return
        L_0x0007:
            g2.e r7 = g2.e.c()
            java.lang.String r0 = f21829i
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r6
            java.lang.String r4 = "Received %s"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r7.a(r0, r2, r4)
            int r7 = r6.hashCode()
            r0 = 3
            r2 = 2
            switch(r7) {
                case -1886648615: goto L_0x0049;
                case -54942926: goto L_0x003e;
                case 948344062: goto L_0x0033;
                case 1019184907: goto L_0x0028;
                default: goto L_0x0027;
            }
        L_0x0027:
            goto L_0x0051
        L_0x0028:
            java.lang.String r7 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0031
            goto L_0x0051
        L_0x0031:
            r3 = 3
            goto L_0x0052
        L_0x0033:
            java.lang.String r7 = "android.os.action.CHARGING"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x003c
            goto L_0x0051
        L_0x003c:
            r3 = 2
            goto L_0x0052
        L_0x003e:
            java.lang.String r7 = "android.os.action.DISCHARGING"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0047
            goto L_0x0051
        L_0x0047:
            r3 = 1
            goto L_0x0052
        L_0x0049:
            java.lang.String r7 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0052
        L_0x0051:
            r3 = -1
        L_0x0052:
            if (r3 == 0) goto L_0x006d
            if (r3 == r1) goto L_0x0067
            if (r3 == r2) goto L_0x0061
            if (r3 == r0) goto L_0x005b
            goto L_0x0072
        L_0x005b:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.c(r6)
            goto L_0x0072
        L_0x0061:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.c(r6)
            goto L_0x0072
        L_0x0067:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.c(r6)
            goto L_0x0072
        L_0x006d:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.c(r6)
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.a.g(android.content.Context, android.content.Intent):void");
    }
}
