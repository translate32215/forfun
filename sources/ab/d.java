package ab;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f206a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f207b;

    /* renamed from: c  reason: collision with root package name */
    public final u f208c;

    public d(Context context, u uVar, Executor executor) {
        this.f206a = executor;
        this.f207b = context;
        this.f208c = uVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bd, code lost:
        if (r6 != null) goto L_0x00df;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0387  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03f7  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0409  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x042e  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0466  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0475  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0494  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x04a2  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04b3  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x04e7  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x04f1  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x04fb  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x050e  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0528 A[SYNTHETIC, Splitter:B:231:0x0528] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x058d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bb A[Catch:{ NameNotFoundException -> 0x00c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f2 A[SYNTHETIC, Splitter:B:45:0x00f2] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a() {
        /*
            r15 = this;
            ab.u r0 = r15.f208c
            java.lang.String r1 = "gcm.n.noui"
            boolean r0 = r0.a(r1)
            r1 = 1
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x000c:
            android.content.Context r0 = r15.f207b
            java.lang.String r1 = "keyguard"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0
            boolean r0 = r0.inKeyguardRestrictedInputMode()
            r1 = 0
            if (r0 == 0) goto L_0x001e
            goto L_0x0059
        L_0x001e:
            boolean r0 = z7.h.c()
            if (r0 != 0) goto L_0x0029
            r2 = 10
            android.os.SystemClock.sleep(r2)
        L_0x0029:
            int r0 = android.os.Process.myPid()
            android.content.Context r2 = r15.f207b
            java.lang.String r3 = "activity"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2
            java.util.List r2 = r2.getRunningAppProcesses()
            if (r2 == 0) goto L_0x0059
            java.util.Iterator r2 = r2.iterator()
        L_0x0041:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r2.next()
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3
            int r4 = r3.pid
            if (r4 != r0) goto L_0x0041
            int r0 = r3.importance
            r2 = 100
            if (r0 != r2) goto L_0x0059
            r0 = 1
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            if (r0 == 0) goto L_0x005d
            return r1
        L_0x005d:
            ab.u r0 = r15.f208c
            java.lang.String r2 = "gcm.n.image"
            java.lang.String r0 = r0.j(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r3 = "FirebaseMessaging"
            if (r2 == 0) goto L_0x006e
            goto L_0x0093
        L_0x006e:
            ab.r r2 = new ab.r     // Catch:{ MalformedURLException -> 0x0079 }
            java.net.URL r4 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0079 }
            r4.<init>(r0)     // Catch:{ MalformedURLException -> 0x0079 }
            r2.<init>(r4)     // Catch:{ MalformedURLException -> 0x0079 }
            goto L_0x0094
        L_0x0079:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Not downloading image, bad URL: "
            int r4 = r0.length()
            if (r4 == 0) goto L_0x008b
            java.lang.String r0 = r2.concat(r0)
            goto L_0x0090
        L_0x008b:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L_0x0090:
            android.util.Log.w(r3, r0)
        L_0x0093:
            r2 = 0
        L_0x0094:
            if (r2 == 0) goto L_0x00a3
            java.util.concurrent.Executor r0 = r15.f206a
            f7.h0 r4 = new f7.h0
            r4.<init>((ab.r) r2)
            s8.i r0 = s8.l.c(r0, r4)
            r2.f241b = r0
        L_0x00a3:
            android.content.Context r0 = r15.f207b
            ab.u r4 = r15.f208c
            java.util.concurrent.atomic.AtomicInteger r5 = ab.b.f201a
            java.lang.String r5 = "Couldn't get own application info: "
            android.content.pm.PackageManager r6 = r0.getPackageManager()
            java.lang.String r7 = r0.getPackageName()
            r8 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r6 = r6.getApplicationInfo(r7, r8)     // Catch:{ NameNotFoundException -> 0x00c0 }
            if (r6 == 0) goto L_0x00dd
            android.os.Bundle r6 = r6.metaData     // Catch:{ NameNotFoundException -> 0x00c0 }
            if (r6 == 0) goto L_0x00dd
            goto L_0x00df
        L_0x00c0:
            r6 = move-exception
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r7 = r6.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r7 = r7 + 35
            r8.<init>(r7)
            r8.append(r5)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            android.util.Log.w(r3, r6)
        L_0x00dd:
            android.os.Bundle r6 = android.os.Bundle.EMPTY
        L_0x00df:
            java.lang.String r7 = r0.getPackageName()
            java.lang.String r8 = "gcm.n.android_channel_id"
            java.lang.String r8 = r4.j(r8)
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 3
            r11 = 26
            if (r9 >= r11) goto L_0x00f2
            goto L_0x017a
        L_0x00f2:
            android.content.pm.PackageManager r9 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x017a }
            java.lang.String r12 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x017a }
            android.content.pm.ApplicationInfo r9 = r9.getApplicationInfo(r12, r1)     // Catch:{ NameNotFoundException -> 0x017a }
            int r9 = r9.targetSdkVersion     // Catch:{ NameNotFoundException -> 0x017a }
            if (r9 < r11) goto L_0x017a
            java.lang.Class<android.app.NotificationManager> r9 = android.app.NotificationManager.class
            java.lang.Object r9 = r0.getSystemService(r9)
            android.app.NotificationManager r9 = (android.app.NotificationManager) r9
            boolean r11 = android.text.TextUtils.isEmpty(r8)
            if (r11 != 0) goto L_0x012d
            android.app.NotificationChannel r11 = r9.getNotificationChannel(r8)
            if (r11 == 0) goto L_0x0117
            goto L_0x017b
        L_0x0117:
            java.lang.String r11 = java.lang.String.valueOf(r8)
            int r11 = r11.length()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            int r11 = r11 + 122
            r12.<init>(r11)
            java.lang.String r11 = "Notification Channel requested ("
            java.lang.String r13 = ") has not been created by the app. Manifest configuration, or default, value will be used."
            ab.a.a(r12, r11, r8, r13, r3)
        L_0x012d:
            java.lang.String r8 = "com.google.firebase.messaging.default_notification_channel_id"
            java.lang.String r8 = r6.getString(r8)
            boolean r11 = android.text.TextUtils.isEmpty(r8)
            if (r11 != 0) goto L_0x0146
            android.app.NotificationChannel r11 = r9.getNotificationChannel(r8)
            if (r11 == 0) goto L_0x0140
            goto L_0x017b
        L_0x0140:
            java.lang.String r8 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used."
            android.util.Log.w(r3, r8)
            goto L_0x014b
        L_0x0146:
            java.lang.String r8 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used."
            android.util.Log.w(r3, r8)
        L_0x014b:
            java.lang.String r8 = "fcm_fallback_notification_channel"
            android.app.NotificationChannel r11 = r9.getNotificationChannel(r8)
            if (r11 != 0) goto L_0x017b
            android.content.res.Resources r11 = r0.getResources()
            java.lang.String r12 = r0.getPackageName()
            java.lang.String r13 = "fcm_fallback_notification_channel_label"
            java.lang.String r14 = "string"
            int r11 = r11.getIdentifier(r13, r14, r12)
            if (r11 != 0) goto L_0x016d
            java.lang.String r11 = "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name."
            android.util.Log.e(r3, r11)
            java.lang.String r11 = "Misc"
            goto L_0x0171
        L_0x016d:
            java.lang.String r11 = r0.getString(r11)
        L_0x0171:
            android.app.NotificationChannel r12 = new android.app.NotificationChannel
            r12.<init>(r8, r11, r10)
            r9.createNotificationChannel(r12)
            goto L_0x017b
        L_0x017a:
            r8 = 0
        L_0x017b:
            android.content.res.Resources r9 = r0.getResources()
            android.content.pm.PackageManager r10 = r0.getPackageManager()
            c0.l$d r11 = new c0.l$d
            r11.<init>(r0, r8)
            java.lang.String r8 = "gcm.n.title"
            java.lang.String r8 = r4.i(r9, r7, r8)
            boolean r12 = android.text.TextUtils.isEmpty(r8)
            if (r12 != 0) goto L_0x0197
            r11.e(r8)
        L_0x0197:
            java.lang.String r8 = "gcm.n.body"
            java.lang.String r8 = r4.i(r9, r7, r8)
            boolean r12 = android.text.TextUtils.isEmpty(r8)
            if (r12 != 0) goto L_0x01b1
            r11.d(r8)
            c0.l$c r12 = new c0.l$c
            r12.<init>()
            r12.d(r8)
            r11.h(r12)
        L_0x01b1:
            java.lang.String r8 = "gcm.n.icon"
            java.lang.String r8 = r4.j(r8)
            boolean r12 = android.text.TextUtils.isEmpty(r8)
            if (r12 != 0) goto L_0x01ef
            java.lang.String r12 = "drawable"
            int r12 = r9.getIdentifier(r8, r12, r7)
            if (r12 == 0) goto L_0x01cb
            boolean r13 = ab.b.a(r9, r12)
            if (r13 != 0) goto L_0x022e
        L_0x01cb:
            java.lang.String r12 = "mipmap"
            int r12 = r9.getIdentifier(r8, r12, r7)
            if (r12 == 0) goto L_0x01d9
            boolean r13 = ab.b.a(r9, r12)
            if (r13 != 0) goto L_0x022e
        L_0x01d9:
            java.lang.String r12 = java.lang.String.valueOf(r8)
            int r12 = r12.length()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            int r12 = r12 + 61
            r13.<init>(r12)
            java.lang.String r12 = "Icon resource "
            java.lang.String r14 = " not found. Notification will use default icon."
            ab.a.a(r13, r12, r8, r14, r3)
        L_0x01ef:
            java.lang.String r8 = "com.google.firebase.messaging.default_notification_icon"
            int r8 = r6.getInt(r8, r1)
            if (r8 == 0) goto L_0x01fd
            boolean r12 = ab.b.a(r9, r8)
            if (r12 != 0) goto L_0x0222
        L_0x01fd:
            android.content.pm.ApplicationInfo r12 = r10.getApplicationInfo(r7, r1)     // Catch:{ NameNotFoundException -> 0x0205 }
            int r5 = r12.icon     // Catch:{ NameNotFoundException -> 0x0205 }
            r12 = r5
            goto L_0x0223
        L_0x0205:
            r12 = move-exception
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r13 = r12.length()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            int r13 = r13 + 35
            r14.<init>(r13)
            r14.append(r5)
            r14.append(r12)
            java.lang.String r5 = r14.toString()
            android.util.Log.w(r3, r5)
        L_0x0222:
            r12 = r8
        L_0x0223:
            if (r12 == 0) goto L_0x022b
            boolean r5 = ab.b.a(r9, r12)
            if (r5 != 0) goto L_0x022e
        L_0x022b:
            r12 = 17301651(0x1080093, float:2.4979667E-38)
        L_0x022e:
            android.app.Notification r5 = r11.f3988t
            r5.icon = r12
            java.lang.String r5 = "gcm.n.sound2"
            java.lang.String r5 = r4.j(r5)
            boolean r8 = android.text.TextUtils.isEmpty(r5)
            if (r8 == 0) goto L_0x0244
            java.lang.String r5 = "gcm.n.sound"
            java.lang.String r5 = r4.j(r5)
        L_0x0244:
            boolean r8 = android.text.TextUtils.isEmpty(r5)
            r12 = 2
            if (r8 == 0) goto L_0x024d
            r5 = 0
            goto L_0x0292
        L_0x024d:
            java.lang.String r8 = "default"
            boolean r8 = r8.equals(r5)
            if (r8 != 0) goto L_0x028e
            java.lang.String r8 = "raw"
            int r8 = r9.getIdentifier(r5, r8, r7)
            if (r8 == 0) goto L_0x028e
            java.lang.String r8 = java.lang.String.valueOf(r7)
            int r8 = r8.length()
            java.lang.String r9 = java.lang.String.valueOf(r5)
            int r9 = r9.length()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            int r8 = r8 + 24
            int r8 = r8 + r9
            r13.<init>(r8)
            java.lang.String r8 = "android.resource://"
            r13.append(r8)
            r13.append(r7)
            java.lang.String r8 = "/raw/"
            r13.append(r8)
            r13.append(r5)
            java.lang.String r5 = r13.toString()
            android.net.Uri r5 = android.net.Uri.parse(r5)
            goto L_0x0292
        L_0x028e:
            android.net.Uri r5 = android.media.RingtoneManager.getDefaultUri(r12)
        L_0x0292:
            if (r5 == 0) goto L_0x0297
            r11.g(r5)
        L_0x0297:
            java.lang.String r5 = "gcm.n.click_action"
            java.lang.String r5 = r4.j(r5)
            boolean r8 = android.text.TextUtils.isEmpty(r5)
            if (r8 != 0) goto L_0x02b1
            android.content.Intent r8 = new android.content.Intent
            r8.<init>(r5)
            r8.setPackage(r7)
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            r8.setFlags(r5)
            goto L_0x02d0
        L_0x02b1:
            android.net.Uri r5 = r4.e()
            if (r5 == 0) goto L_0x02c5
            android.content.Intent r8 = new android.content.Intent
            java.lang.String r9 = "android.intent.action.VIEW"
            r8.<init>(r9)
            r8.setPackage(r7)
            r8.setData(r5)
            goto L_0x02d0
        L_0x02c5:
            android.content.Intent r8 = r10.getLaunchIntentForPackage(r7)
            if (r8 != 0) goto L_0x02d0
            java.lang.String r5 = "No activity found to launch app"
            android.util.Log.w(r3, r5)
        L_0x02d0:
            r5 = 23
            java.lang.String r7 = "google.c.a.e"
            if (r8 != 0) goto L_0x02d8
            r8 = 0
            goto L_0x0341
        L_0x02d8:
            r9 = 67108864(0x4000000, float:1.5046328E-36)
            r8.addFlags(r9)
            android.os.Bundle r9 = new android.os.Bundle
            android.os.Bundle r10 = r4.f244a
            r9.<init>(r10)
            android.os.Bundle r10 = r4.f244a
            java.util.Set r10 = r10.keySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x02ee:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x031c
            java.lang.Object r13 = r10.next()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r14 = "google.c."
            boolean r14 = r13.startsWith(r14)
            if (r14 != 0) goto L_0x0315
            java.lang.String r14 = "gcm.n."
            boolean r14 = r13.startsWith(r14)
            if (r14 != 0) goto L_0x0315
            java.lang.String r14 = "gcm.notification."
            boolean r14 = r13.startsWith(r14)
            if (r14 == 0) goto L_0x0313
            goto L_0x0315
        L_0x0313:
            r14 = 0
            goto L_0x0316
        L_0x0315:
            r14 = 1
        L_0x0316:
            if (r14 == 0) goto L_0x02ee
            r9.remove(r13)
            goto L_0x02ee
        L_0x031c:
            r8.putExtras(r9)
            boolean r9 = r4.a(r7)
            if (r9 == 0) goto L_0x032e
            android.os.Bundle r9 = r4.m()
            java.lang.String r10 = "gcm.n.analytics_data"
            r8.putExtra(r10, r9)
        L_0x032e:
            java.util.concurrent.atomic.AtomicInteger r9 = ab.b.f201a
            int r9 = r9.incrementAndGet()
            int r10 = android.os.Build.VERSION.SDK_INT
            if (r10 < r5) goto L_0x033b
            r10 = 1140850688(0x44000000, float:512.0)
            goto L_0x033d
        L_0x033b:
            r10 = 1073741824(0x40000000, float:2.0)
        L_0x033d:
            android.app.PendingIntent r8 = android.app.PendingIntent.getActivity(r0, r9, r8, r10)
        L_0x0341:
            r11.f3975g = r8
            boolean r7 = r4.a(r7)
            if (r7 != 0) goto L_0x034b
            r5 = 0
            goto L_0x0385
        L_0x034b:
            android.content.Intent r7 = new android.content.Intent
            java.lang.String r8 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            r7.<init>(r8)
            android.os.Bundle r8 = r4.m()
            android.content.Intent r7 = r7.putExtras(r8)
            java.util.concurrent.atomic.AtomicInteger r8 = ab.b.f201a
            int r8 = r8.incrementAndGet()
            android.content.Intent r9 = new android.content.Intent
            java.lang.String r10 = "com.google.firebase.MESSAGING_EVENT"
            r9.<init>(r10)
            android.content.ComponentName r10 = new android.content.ComponentName
            java.lang.String r13 = "com.google.firebase.iid.FirebaseInstanceIdReceiver"
            r10.<init>(r0, r13)
            android.content.Intent r9 = r9.setComponent(r10)
            java.lang.String r10 = "wrapped_intent"
            android.content.Intent r7 = r9.putExtra(r10, r7)
            int r9 = android.os.Build.VERSION.SDK_INT
            if (r9 < r5) goto L_0x037f
            r5 = 1140850688(0x44000000, float:512.0)
            goto L_0x0381
        L_0x037f:
            r5 = 1073741824(0x40000000, float:2.0)
        L_0x0381:
            android.app.PendingIntent r5 = android.app.PendingIntent.getBroadcast(r0, r8, r7, r5)
        L_0x0385:
            if (r5 == 0) goto L_0x038b
            android.app.Notification r7 = r11.f3988t
            r7.deleteIntent = r5
        L_0x038b:
            java.lang.String r5 = "gcm.n.color"
            java.lang.String r5 = r4.j(r5)
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 21
            if (r7 >= r8) goto L_0x0398
            goto L_0x03d3
        L_0x0398:
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 != 0) goto L_0x03bd
            int r7 = android.graphics.Color.parseColor(r5)     // Catch:{ IllegalArgumentException -> 0x03a7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ IllegalArgumentException -> 0x03a7 }
            goto L_0x03d4
        L_0x03a7:
            java.lang.String r7 = java.lang.String.valueOf(r5)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r7 = r7 + 56
            r8.<init>(r7)
            java.lang.String r7 = "Color is invalid: "
            java.lang.String r9 = ". Notification will use default color."
            ab.a.a(r8, r7, r5, r9, r3)
        L_0x03bd:
            java.lang.String r5 = "com.google.firebase.messaging.default_notification_color"
            int r5 = r6.getInt(r5, r1)
            if (r5 == 0) goto L_0x03d3
            int r0 = d0.a.b(r0, r5)     // Catch:{ NotFoundException -> 0x03ce }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NotFoundException -> 0x03ce }
            goto L_0x03d4
        L_0x03ce:
            java.lang.String r0 = "Cannot find the color resource referenced in AndroidManifest."
            android.util.Log.w(r3, r0)
        L_0x03d3:
            r0 = 0
        L_0x03d4:
            if (r0 == 0) goto L_0x03dc
            int r0 = r0.intValue()
            r11.f3984p = r0
        L_0x03dc:
            java.lang.String r0 = "gcm.n.sticky"
            boolean r0 = r4.a(r0)
            r0 = r0 ^ 1
            r11.c(r0)
            java.lang.String r0 = "gcm.n.local_only"
            boolean r0 = r4.a(r0)
            r11.f3981m = r0
            java.lang.String r0 = "gcm.n.ticker"
            java.lang.String r0 = r4.j(r0)
            if (r0 == 0) goto L_0x03ff
            android.app.Notification r5 = r11.f3988t
            java.lang.CharSequence r0 = c0.l.d.b(r0)
            r5.tickerText = r0
        L_0x03ff:
            java.lang.String r0 = "gcm.n.notification_priority"
            java.lang.Integer r0 = r4.b(r0)
            r5 = -2
            if (r0 != 0) goto L_0x0409
            goto L_0x042b
        L_0x0409:
            int r6 = r0.intValue()
            if (r6 < r5) goto L_0x0415
            int r6 = r0.intValue()
            if (r6 <= r12) goto L_0x042c
        L_0x0415:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r6 = r0.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r6 = r6 + 72
            r7.<init>(r6)
            java.lang.String r6 = "notificationPriority is invalid "
            java.lang.String r8 = ". Skipping setting notificationPriority."
            ab.a.a(r7, r6, r0, r8, r3)
        L_0x042b:
            r0 = 0
        L_0x042c:
            if (r0 == 0) goto L_0x0434
            int r0 = r0.intValue()
            r11.f3978j = r0
        L_0x0434:
            java.lang.String r0 = "gcm.n.visibility"
            java.lang.Integer r0 = r4.b(r0)
            if (r0 != 0) goto L_0x043d
            goto L_0x0463
        L_0x043d:
            int r6 = r0.intValue()
            r7 = -1
            if (r6 < r7) goto L_0x044b
            int r6 = r0.intValue()
            r7 = 1
            if (r6 <= r7) goto L_0x0464
        L_0x044b:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r6 = r0.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r6 = r6 + 53
            r7.<init>(r6)
            java.lang.String r6 = "visibility is invalid: "
            java.lang.String r8 = ". Skipping setting visibility."
            java.lang.String r9 = "NotificationParams"
            ab.a.a(r7, r6, r0, r8, r9)
        L_0x0463:
            r0 = 0
        L_0x0464:
            if (r0 == 0) goto L_0x046c
            int r0 = r0.intValue()
            r11.f3985q = r0
        L_0x046c:
            java.lang.String r0 = "gcm.n.notification_count"
            java.lang.Integer r0 = r4.b(r0)
            if (r0 != 0) goto L_0x0475
            goto L_0x0491
        L_0x0475:
            int r6 = r0.intValue()
            if (r6 >= 0) goto L_0x0492
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r6 = r0.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r6 = r6 + 67
            r7.<init>(r6)
            java.lang.String r6 = "notificationCount is invalid: "
            java.lang.String r8 = ". Skipping setting notificationCount."
            ab.a.a(r7, r6, r0, r8, r3)
        L_0x0491:
            r0 = 0
        L_0x0492:
            if (r0 == 0) goto L_0x049a
            int r0 = r0.intValue()
            r11.f3977i = r0
        L_0x049a:
            java.lang.String r0 = "gcm.n.event_time"
            java.lang.Long r0 = r4.h(r0)
            if (r0 == 0) goto L_0x04ad
            r6 = 1
            r11.f3979k = r6
            long r6 = r0.longValue()
            android.app.Notification r0 = r11.f3988t
            r0.when = r6
        L_0x04ad:
            long[] r0 = r4.k()
            if (r0 == 0) goto L_0x04b7
            android.app.Notification r6 = r11.f3988t
            r6.vibrate = r0
        L_0x04b7:
            int[] r0 = r4.d()
            if (r0 == 0) goto L_0x04d9
            r6 = r0[r1]
            r7 = 1
            r7 = r0[r7]
            r0 = r0[r12]
            android.app.Notification r8 = r11.f3988t
            r8.ledARGB = r6
            r8.ledOnMS = r7
            r8.ledOffMS = r0
            if (r7 == 0) goto L_0x04d2
            if (r0 == 0) goto L_0x04d2
            r0 = 1
            goto L_0x04d3
        L_0x04d2:
            r0 = 0
        L_0x04d3:
            int r6 = r8.flags
            r5 = r5 & r6
            r0 = r0 | r5
            r8.flags = r0
        L_0x04d9:
            java.lang.String r0 = "gcm.n.default_sound"
            boolean r0 = r4.a(r0)
            java.lang.String r5 = "gcm.n.default_vibrate_timings"
            boolean r5 = r4.a(r5)
            if (r5 == 0) goto L_0x04e9
            r0 = r0 | 2
        L_0x04e9:
            java.lang.String r5 = "gcm.n.default_light_settings"
            boolean r5 = r4.a(r5)
            if (r5 == 0) goto L_0x04f3
            r0 = r0 | 4
        L_0x04f3:
            android.app.Notification r5 = r11.f3988t
            r5.defaults = r0
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0501
            int r0 = r5.flags
            r0 = r0 | 1
            r5.flags = r0
        L_0x0501:
            java.lang.String r0 = "gcm.n.tag"
            java.lang.String r0 = r4.j(r0)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x050e
            goto L_0x0525
        L_0x050e:
            long r4 = android.os.SystemClock.uptimeMillis()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r6 = 37
            r0.<init>(r6)
            java.lang.String r6 = "FCM-Notification:"
            r0.append(r6)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
        L_0x0525:
            if (r2 != 0) goto L_0x0528
            goto L_0x0586
        L_0x0528:
            s8.i<android.graphics.Bitmap> r4 = r2.f241b     // Catch:{ ExecutionException -> 0x0563, InterruptedException -> 0x0553, TimeoutException -> 0x054a }
            com.google.android.gms.common.internal.i.h(r4)     // Catch:{ ExecutionException -> 0x0563, InterruptedException -> 0x0553, TimeoutException -> 0x054a }
            r5 = 5
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x0563, InterruptedException -> 0x0553, TimeoutException -> 0x054a }
            java.lang.Object r4 = s8.l.b(r4, r5, r7)     // Catch:{ ExecutionException -> 0x0563, InterruptedException -> 0x0553, TimeoutException -> 0x054a }
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4     // Catch:{ ExecutionException -> 0x0563, InterruptedException -> 0x0553, TimeoutException -> 0x054a }
            r11.f(r4)     // Catch:{ ExecutionException -> 0x0563, InterruptedException -> 0x0553, TimeoutException -> 0x054a }
            c0.l$b r5 = new c0.l$b     // Catch:{ ExecutionException -> 0x0563, InterruptedException -> 0x0553, TimeoutException -> 0x054a }
            r5.<init>()     // Catch:{ ExecutionException -> 0x0563, InterruptedException -> 0x0553, TimeoutException -> 0x054a }
            r5.e(r4)     // Catch:{ ExecutionException -> 0x0563, InterruptedException -> 0x0553, TimeoutException -> 0x054a }
            r4 = 0
            r5.d(r4)     // Catch:{ ExecutionException -> 0x0563, InterruptedException -> 0x0553, TimeoutException -> 0x054a }
            r11.h(r5)     // Catch:{ ExecutionException -> 0x0563, InterruptedException -> 0x0553, TimeoutException -> 0x054a }
            goto L_0x0586
        L_0x054a:
            java.lang.String r4 = "Failed to download image in time, showing notification without it"
            android.util.Log.w(r3, r4)
            r2.close()
            goto L_0x0586
        L_0x0553:
            java.lang.String r4 = "Interrupted while downloading image, showing notification without it"
            android.util.Log.w(r3, r4)
            r2.close()
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
            goto L_0x0586
        L_0x0563:
            r2 = move-exception
            java.lang.Throwable r2 = r2.getCause()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r4 = r2.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 26
            r5.<init>(r4)
            java.lang.String r4 = "Failed to download image: "
            r5.append(r4)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            android.util.Log.w(r3, r2)
        L_0x0586:
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r3, r2)
            if (r2 == 0) goto L_0x0592
            java.lang.String r2 = "Showing notification"
            android.util.Log.d(r3, r2)
        L_0x0592:
            android.content.Context r2 = r15.f207b
            java.lang.String r3 = "notification"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2
            android.app.Notification r3 = r11.a()
            r2.notify(r0, r1, r3)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.d.a():boolean");
    }
}
