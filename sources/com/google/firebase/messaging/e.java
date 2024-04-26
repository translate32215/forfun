package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.c;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f9728a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f9729b;

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    public static class a {

        /* renamed from: d  reason: collision with root package name */
        public static final long f9730d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a  reason: collision with root package name */
        public final String f9731a;

        /* renamed from: b  reason: collision with root package name */
        public final String f9732b;

        /* renamed from: c  reason: collision with root package name */
        public final long f9733c;

        public a(String str, String str2, long j10) {
            this.f9731a = str;
            this.f9732b = str2;
            this.f9733c = j10;
        }

        public static String a(String str, String str2, long j10) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j10);
                return jSONObject.toString();
            } catch (JSONException e10) {
                String valueOf = String.valueOf(e10);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 24);
                sb2.append("Failed to encode token: ");
                sb2.append(valueOf);
                Log.w("FirebaseMessaging", sb2.toString());
                return null;
            }
        }

        public static a b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, (String) null, 0);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e10) {
                String valueOf = String.valueOf(e10);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
                sb2.append("Failed to parse token: ");
                sb2.append(valueOf);
                Log.w("FirebaseMessaging", sb2.toString());
                return null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0090, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0098, code lost:
        if (android.util.Log.isLoggable("FirebaseMessaging", 3) != false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009a, code lost:
        r6 = java.lang.String.valueOf(r6.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a8, code lost:
        if (r6.length() != 0) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00aa, code lost:
        r6 = "Error creating file in no backup dir: ".concat(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00af, code lost:
        r6 = new java.lang.String("Error creating file in no backup dir: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b4, code lost:
        android.util.Log.d("FirebaseMessaging", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(android.content.Context r6) {
        /*
            r5 = this;
            r5.<init>()
            r5.f9729b = r6
            java.lang.String r0 = "com.google.android.gms.appid"
            r1 = 0
            android.content.SharedPreferences r0 = r6.getSharedPreferences(r0, r1)
            r5.f9728a = r0
            java.lang.Object r1 = d0.a.f12940a
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x001b
            java.io.File r6 = d0.a.c.c(r6)
            goto L_0x0055
        L_0x001b:
            android.content.pm.ApplicationInfo r6 = r6.getApplicationInfo()
            java.io.File r1 = new java.io.File
            java.lang.String r6 = r6.dataDir
            java.lang.String r2 = "no_backup"
            r1.<init>(r6, r2)
            java.lang.Object r6 = d0.a.f12941b
            monitor-enter(r6)
            boolean r2 = r1.exists()     // Catch:{ all -> 0x00ba }
            if (r2 != 0) goto L_0x0053
            boolean r2 = r1.mkdirs()     // Catch:{ all -> 0x00ba }
            if (r2 == 0) goto L_0x0039
            monitor-exit(r6)     // Catch:{ all -> 0x00ba }
            goto L_0x0054
        L_0x0039:
            java.lang.String r2 = "ContextCompat"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r3.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = "Unable to create files subdir "
            r3.append(r4)     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r1.getPath()     // Catch:{ all -> 0x00ba }
            r3.append(r4)     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00ba }
            android.util.Log.w(r2, r3)     // Catch:{ all -> 0x00ba }
        L_0x0053:
            monitor-exit(r6)     // Catch:{ all -> 0x00ba }
        L_0x0054:
            r6 = r1
        L_0x0055:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "com.google.android.gms.appid-no-backup"
            r1.<init>(r6, r2)
            boolean r6 = r1.exists()
            if (r6 == 0) goto L_0x0063
            goto L_0x00b9
        L_0x0063:
            boolean r6 = r1.createNewFile()     // Catch:{ IOException -> 0x0090 }
            if (r6 == 0) goto L_0x00b9
            monitor-enter(r5)     // Catch:{ IOException -> 0x0090 }
            java.util.Map r6 = r0.getAll()     // Catch:{ all -> 0x008d }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x008d }
            monitor-exit(r5)     // Catch:{ IOException -> 0x0090 }
            if (r6 != 0) goto L_0x00b9
            java.lang.String r6 = "FirebaseMessaging"
            java.lang.String r1 = "App restored, clearing state"
            android.util.Log.i(r6, r1)     // Catch:{ IOException -> 0x0090 }
            monitor-enter(r5)     // Catch:{ IOException -> 0x0090 }
            android.content.SharedPreferences$Editor r6 = r0.edit()     // Catch:{ all -> 0x008a }
            android.content.SharedPreferences$Editor r6 = r6.clear()     // Catch:{ all -> 0x008a }
            r6.commit()     // Catch:{ all -> 0x008a }
            monitor-exit(r5)     // Catch:{ IOException -> 0x0090 }
            goto L_0x00b9
        L_0x008a:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ IOException -> 0x0090 }
            throw r6     // Catch:{ IOException -> 0x0090 }
        L_0x008d:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ IOException -> 0x0090 }
            throw r6     // Catch:{ IOException -> 0x0090 }
        L_0x0090:
            r6 = move-exception
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L_0x00b9
            java.lang.String r6 = r6.getMessage()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "Error creating file in no backup dir: "
            int r1 = r6.length()
            if (r1 == 0) goto L_0x00af
            java.lang.String r6 = r0.concat(r6)
            goto L_0x00b4
        L_0x00af:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0)
        L_0x00b4:
            java.lang.String r0 = "FirebaseMessaging"
            android.util.Log.d(r0, r6)
        L_0x00b9:
            return
        L_0x00ba:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00ba }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.e.<init>(android.content.Context):void");
    }

    public final String a(String str, String str2) {
        return c.a(new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length()), str, "|T|", str2, "|*");
    }

    public synchronized void b(String str, String str2, String str3, String str4) {
        String a10 = a.a(str3, str4, System.currentTimeMillis());
        if (a10 != null) {
            SharedPreferences.Editor edit = this.f9728a.edit();
            edit.putString(a(str, str2), a10);
            edit.commit();
        }
    }
}
