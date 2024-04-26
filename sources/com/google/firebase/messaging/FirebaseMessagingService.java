package com.google.firebase.messaging;

import ab.f;
import ab.v;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class FirebaseMessagingService extends f {

    /* renamed from: f  reason: collision with root package name */
    public static final Queue<String> f9711f = new ArrayDeque(10);

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01de A[SYNTHETIC, Splitter:B:113:0x01de] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0258 A[SYNTHETIC, Splitter:B:143:0x0258] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0274 A[SYNTHETIC, Splitter:B:149:0x0274] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0291 A[SYNTHETIC, Splitter:B:155:0x0291] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0175  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.content.Intent r32) {
        /*
            r31 = this;
            r1 = r31
            r2 = r32
            java.lang.String r0 = r32.getAction()
            java.lang.String r3 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r3 = r3.equals(r0)
            java.lang.String r4 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            java.lang.String r5 = "FirebaseMessaging"
            if (r3 != 0) goto L_0x004b
            boolean r3 = r4.equals(r0)
            if (r3 == 0) goto L_0x001b
            goto L_0x004b
        L_0x001b:
            java.lang.String r3 = "com.google.firebase.messaging.NEW_TOKEN"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = "token"
            java.lang.String r0 = r2.getStringExtra(r0)
            r1.d(r0)
            return
        L_0x002d:
            java.lang.String r0 = r32.getAction()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Unknown intent action: "
            int r3 = r0.length()
            if (r3 == 0) goto L_0x0042
            java.lang.String r0 = r2.concat(r0)
            goto L_0x0047
        L_0x0042:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L_0x0047:
            android.util.Log.d(r5, r0)
            return
        L_0x004b:
            java.lang.String r0 = "google.message_id"
            java.lang.String r3 = r2.getStringExtra(r0)
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            r7 = 3
            r8 = 1
            r9 = 0
            if (r6 == 0) goto L_0x005b
            goto L_0x0094
        L_0x005b:
            java.util.Queue<java.lang.String> r6 = f9711f
            java.util.ArrayDeque r6 = (java.util.ArrayDeque) r6
            boolean r10 = r6.contains(r3)
            if (r10 == 0) goto L_0x0086
            boolean r6 = android.util.Log.isLoggable(r5, r7)
            if (r6 == 0) goto L_0x0084
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r6 = "Received duplicate message: "
            int r10 = r3.length()
            if (r10 == 0) goto L_0x007c
            java.lang.String r3 = r6.concat(r3)
            goto L_0x0081
        L_0x007c:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r6)
        L_0x0081:
            android.util.Log.d(r5, r3)
        L_0x0084:
            r3 = 1
            goto L_0x0095
        L_0x0086:
            int r10 = r6.size()
            r11 = 10
            if (r10 < r11) goto L_0x0091
            r6.remove()
        L_0x0091:
            r6.add(r3)
        L_0x0094:
            r3 = 0
        L_0x0095:
            if (r3 != 0) goto L_0x0359
            java.lang.String r3 = "message_type"
            java.lang.String r3 = r2.getStringExtra(r3)
            java.lang.String r6 = "gcm"
            if (r3 != 0) goto L_0x00a2
            r3 = r6
        L_0x00a2:
            int r10 = r3.hashCode()
            r11 = 2
            switch(r10) {
                case -2062414158: goto L_0x00c7;
                case 102161: goto L_0x00bf;
                case 814694033: goto L_0x00b5;
                case 814800675: goto L_0x00ab;
                default: goto L_0x00aa;
            }
        L_0x00aa:
            goto L_0x00d1
        L_0x00ab:
            java.lang.String r6 = "send_event"
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L_0x00d1
            r6 = 2
            goto L_0x00d2
        L_0x00b5:
            java.lang.String r6 = "send_error"
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L_0x00d1
            r6 = 3
            goto L_0x00d2
        L_0x00bf:
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L_0x00d1
            r6 = 0
            goto L_0x00d2
        L_0x00c7:
            java.lang.String r6 = "deleted_messages"
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L_0x00d1
            r6 = 1
            goto L_0x00d2
        L_0x00d1:
            r6 = -1
        L_0x00d2:
            java.lang.String r10 = "message_id"
            if (r6 == 0) goto L_0x010f
            if (r6 == r8) goto L_0x0359
            if (r6 == r11) goto L_0x010a
            if (r6 == r7) goto L_0x00f4
            java.lang.String r0 = "Received message with unknown type: "
            int r2 = r3.length()
            if (r2 == 0) goto L_0x00e9
            java.lang.String r0 = r0.concat(r3)
            goto L_0x00ef
        L_0x00e9:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0)
            r0 = r2
        L_0x00ef:
            android.util.Log.w(r5, r0)
            goto L_0x0359
        L_0x00f4:
            java.lang.String r0 = r2.getStringExtra(r0)
            if (r0 != 0) goto L_0x00fd
            r2.getStringExtra(r10)
        L_0x00fd:
            x4.a0 r0 = new x4.a0
            java.lang.String r3 = "error"
            java.lang.String r2 = r2.getStringExtra(r3)
            r0.<init>((java.lang.String) r2)
            goto L_0x0359
        L_0x010a:
            r2.getStringExtra(r0)
            goto L_0x0359
        L_0x010f:
            boolean r3 = ab.t.c(r32)
            if (r3 == 0) goto L_0x011e
            android.os.Bundle r3 = r32.getExtras()
            java.lang.String r6 = "_nr"
            ab.t.b(r6, r3)
        L_0x011e:
            java.lang.String r3 = r32.getAction()
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0129
            goto L_0x0172
        L_0x0129:
            java.lang.String r3 = "delivery_metrics_exported_to_big_query_enabled"
            com.google.firebase.a.b()     // Catch:{ IllegalStateException -> 0x016d }
            com.google.firebase.a r4 = com.google.firebase.a.b()
            r4.a()
            android.content.Context r4 = r4.f9662a
            java.lang.String r6 = "com.google.firebase.messaging"
            android.content.SharedPreferences r6 = r4.getSharedPreferences(r6, r9)
            java.lang.String r7 = "export_to_big_query"
            boolean r12 = r6.contains(r7)
            if (r12 == 0) goto L_0x014a
            boolean r3 = r6.getBoolean(r7, r9)
            goto L_0x0173
        L_0x014a:
            android.content.pm.PackageManager r6 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0172 }
            if (r6 == 0) goto L_0x0172
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x0172 }
            r7 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r4 = r6.getApplicationInfo(r4, r7)     // Catch:{ NameNotFoundException -> 0x0172 }
            if (r4 == 0) goto L_0x0172
            android.os.Bundle r6 = r4.metaData     // Catch:{ NameNotFoundException -> 0x0172 }
            if (r6 == 0) goto L_0x0172
            boolean r6 = r6.containsKey(r3)     // Catch:{ NameNotFoundException -> 0x0172 }
            if (r6 == 0) goto L_0x0172
            android.os.Bundle r4 = r4.metaData     // Catch:{ NameNotFoundException -> 0x0172 }
            boolean r3 = r4.getBoolean(r3, r9)     // Catch:{ NameNotFoundException -> 0x0172 }
            goto L_0x0173
        L_0x016d:
            java.lang.String r3 = "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query"
            android.util.Log.i(r5, r3)
        L_0x0172:
            r3 = 0
        L_0x0173:
            if (r3 == 0) goto L_0x0303
            bb.a$b r26 = bb.a.b.MESSAGE_DELIVERED
            l4.g r3 = com.google.firebase.messaging.FirebaseMessaging.f9693n
            if (r3 != 0) goto L_0x0182
            java.lang.String r0 = "TransportFactory is null. Skip exporting message delivery metrics to Big Query"
            android.util.Log.e(r5, r0)
            goto L_0x0303
        L_0x0182:
            android.os.Bundle r4 = r32.getExtras()
            if (r4 != 0) goto L_0x018a
            android.os.Bundle r4 = android.os.Bundle.EMPTY
        L_0x018a:
            int r6 = bb.a.f3822p
            java.lang.String r6 = ""
            java.lang.String r7 = "google.ttl"
            java.lang.Object r7 = r4.get(r7)
            boolean r12 = r7 instanceof java.lang.Integer
            if (r12 == 0) goto L_0x01a0
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
        L_0x019e:
            r9 = r7
            goto L_0x01ac
        L_0x01a0:
            boolean r12 = r7 instanceof java.lang.String
            if (r12 == 0) goto L_0x01cd
            r12 = r7
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ NumberFormatException -> 0x01af }
            int r7 = java.lang.Integer.parseInt(r12)     // Catch:{ NumberFormatException -> 0x01af }
            goto L_0x019e
        L_0x01ac:
            r22 = r9
            goto L_0x01cf
        L_0x01af:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r12 = r7.length()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            int r12 = r12 + 13
            r13.<init>(r12)
            java.lang.String r12 = "Invalid TTL: "
            r13.append(r12)
            r13.append(r7)
            java.lang.String r7 = r13.toString()
            android.util.Log.w(r5, r7)
        L_0x01cd:
            r22 = 0
        L_0x01cf:
            java.lang.String r7 = "google.to"
            java.lang.String r7 = r4.getString(r7)
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 != 0) goto L_0x01de
        L_0x01db:
            r16 = r7
            goto L_0x01f1
        L_0x01de:
            com.google.firebase.a r7 = com.google.firebase.a.b()     // Catch:{ ExecutionException -> 0x02fc, InterruptedException -> 0x02fa }
            com.google.firebase.installations.a r7 = com.google.firebase.installations.a.f(r7)     // Catch:{ ExecutionException -> 0x02fc, InterruptedException -> 0x02fa }
            s8.i r7 = r7.getId()     // Catch:{ ExecutionException -> 0x02fc, InterruptedException -> 0x02fa }
            java.lang.Object r7 = s8.l.a(r7)     // Catch:{ ExecutionException -> 0x02fc, InterruptedException -> 0x02fa }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ ExecutionException -> 0x02fc, InterruptedException -> 0x02fa }
            goto L_0x01db
        L_0x01f1:
            com.google.firebase.a r7 = com.google.firebase.a.b()
            r7.a()
            android.content.Context r7 = r7.f9662a
            java.lang.String r19 = r7.getPackageName()
            bb.a$d r18 = bb.a.d.ANDROID
            boolean r7 = ab.u.l(r4)
            if (r7 == 0) goto L_0x0209
            bb.a$c r7 = bb.a.c.DISPLAY_NOTIFICATION
            goto L_0x020b
        L_0x0209:
            bb.a$c r7 = bb.a.c.DATA_MESSAGE
        L_0x020b:
            r17 = r7
            java.lang.String r0 = r4.getString(r0)
            if (r0 != 0) goto L_0x0217
            java.lang.String r0 = r4.getString(r10)
        L_0x0217:
            if (r0 == 0) goto L_0x021b
            r15 = r0
            goto L_0x021c
        L_0x021b:
            r15 = r6
        L_0x021c:
            java.lang.String r0 = ab.t.a(r4)
            if (r0 == 0) goto L_0x0225
            r23 = r0
            goto L_0x0227
        L_0x0225:
            r23 = r6
        L_0x0227:
            java.lang.String r0 = "collapse_key"
            java.lang.String r0 = r4.getString(r0)
            if (r0 == 0) goto L_0x0232
            r20 = r0
            goto L_0x0234
        L_0x0232:
            r20 = r6
        L_0x0234:
            java.lang.String r0 = "google.c.a.m_l"
            java.lang.String r0 = r4.getString(r0)
            if (r0 == 0) goto L_0x023f
            r27 = r0
            goto L_0x0241
        L_0x023f:
            r27 = r6
        L_0x0241:
            java.lang.String r0 = "google.c.a.c_l"
            java.lang.String r0 = r4.getString(r0)
            if (r0 == 0) goto L_0x024c
            r30 = r0
            goto L_0x024e
        L_0x024c:
            r30 = r6
        L_0x024e:
            java.lang.String r0 = "google.c.sender.id"
            boolean r6 = r4.containsKey(r0)
            r9 = 0
            if (r6 == 0) goto L_0x0267
            java.lang.String r0 = r4.getString(r0)     // Catch:{ NumberFormatException -> 0x0261 }
            long r6 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0261 }
            goto L_0x02ba
        L_0x0261:
            r0 = move-exception
            java.lang.String r4 = "error parsing project number"
            android.util.Log.w(r5, r4, r0)
        L_0x0267:
            com.google.firebase.a r4 = com.google.firebase.a.b()
            r4.a()
            fa.d r0 = r4.f9664c
            java.lang.String r0 = r0.f18336e
            if (r0 == 0) goto L_0x0280
            long r6 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0279 }
            goto L_0x02ba
        L_0x0279:
            r0 = move-exception
            r6 = r0
            java.lang.String r0 = "error parsing sender ID"
            android.util.Log.w(r5, r0, r6)
        L_0x0280:
            r4.a()
            fa.d r0 = r4.f9664c
            java.lang.String r0 = r0.f18333b
            java.lang.String r4 = "1:"
            boolean r4 = r0.startsWith(r4)
            java.lang.String r6 = "error parsing app ID"
            if (r4 != 0) goto L_0x029c
            long r6 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0296 }
            goto L_0x02ba
        L_0x0296:
            r0 = move-exception
            r4 = r0
            android.util.Log.w(r5, r6, r4)
            goto L_0x02b9
        L_0x029c:
            java.lang.String r4 = ":"
            java.lang.String[] r0 = r0.split(r4)
            int r4 = r0.length
            if (r4 >= r11) goto L_0x02a6
            goto L_0x02b9
        L_0x02a6:
            r0 = r0[r8]
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x02af
            goto L_0x02b9
        L_0x02af:
            long r6 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x02b4 }
            goto L_0x02ba
        L_0x02b4:
            r0 = move-exception
            r4 = r0
            android.util.Log.w(r5, r6, r4)
        L_0x02b9:
            r6 = r9
        L_0x02ba:
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x02c0
            r13 = r6
            goto L_0x02c1
        L_0x02c0:
            r13 = r9
        L_0x02c1:
            bb.a r0 = new bb.a
            r12 = r0
            r21 = 0
            r24 = 0
            r28 = 0
            r12.<init>(r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28, r30)
            java.lang.String r4 = "FCM_CLIENT_EVENT_LOGGING"
            java.lang.Class<bb.b> r6 = bb.b.class
            java.lang.String r7 = "proto"
            l4.b r8 = new l4.b     // Catch:{ RuntimeException -> 0x02f3 }
            r8.<init>(r7)     // Catch:{ RuntimeException -> 0x02f3 }
            l4.e r7 = ab.s.f243a     // Catch:{ RuntimeException -> 0x02f3 }
            l4.f r3 = r3.a(r4, r6, r8, r7)     // Catch:{ RuntimeException -> 0x02f3 }
            int r4 = bb.b.f3867b     // Catch:{ RuntimeException -> 0x02f3 }
            bb.b r4 = new bb.b     // Catch:{ RuntimeException -> 0x02f3 }
            r4.<init>(r0)     // Catch:{ RuntimeException -> 0x02f3 }
            l4.a r0 = new l4.a     // Catch:{ RuntimeException -> 0x02f3 }
            l4.d r6 = l4.d.VERY_LOW     // Catch:{ RuntimeException -> 0x02f3 }
            r7 = 0
            r0.<init>(r7, r4, r6)     // Catch:{ RuntimeException -> 0x02f3 }
            o4.l r3 = (o4.l) r3     // Catch:{ RuntimeException -> 0x02f3 }
            r3.a(r0)     // Catch:{ RuntimeException -> 0x02f3 }
            goto L_0x0303
        L_0x02f3:
            r0 = move-exception
            java.lang.String r3 = "Failed to send big query analytics payload."
            android.util.Log.w(r5, r3, r0)
            goto L_0x0303
        L_0x02fa:
            r0 = move-exception
            goto L_0x02fd
        L_0x02fc:
            r0 = move-exception
        L_0x02fd:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            throw r2
        L_0x0303:
            android.os.Bundle r0 = r32.getExtras()
            if (r0 != 0) goto L_0x030e
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L_0x030e:
            java.lang.String r3 = "androidx.content.wakelockid"
            r0.remove(r3)
            boolean r3 = ab.u.l(r0)
            if (r3 == 0) goto L_0x0351
            ab.u r3 = new ab.u
            r3.<init>(r0)
            a8.a r4 = new a8.a
            java.lang.String r5 = "Firebase-Messaging-Network-Io"
            r4.<init>(r5)
            java.util.concurrent.ExecutorService r4 = java.util.concurrent.Executors.newSingleThreadExecutor(r4)
            ab.d r5 = new ab.d
            r5.<init>(r1, r3, r4)
            boolean r3 = r5.a()     // Catch:{ all -> 0x034b }
            if (r3 == 0) goto L_0x0338
            r4.shutdown()
            goto L_0x0359
        L_0x0338:
            r4.shutdown()
            boolean r3 = ab.t.c(r32)
            if (r3 == 0) goto L_0x0351
            android.os.Bundle r2 = r32.getExtras()
            java.lang.String r3 = "_nf"
            ab.t.b(r3, r2)
            goto L_0x0351
        L_0x034b:
            r0 = move-exception
            r2 = r0
            r4.shutdown()
            throw r2
        L_0x0351:
            ab.v r2 = new ab.v
            r2.<init>(r0)
            r1.c(r2)
        L_0x0359:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.b(android.content.Intent):void");
    }

    public void c(v vVar) {
    }

    public void d(String str) {
    }
}
