package com.startapp;

import android.content.Context;
import android.content.SharedPreferences;
import com.startapp.sdk.adsbase.remoteconfig.NetworkDiagnosticConfig;
import java.util.concurrent.Executor;

/* compiled from: Sta */
public class g7 {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f10452a;

    /* renamed from: b  reason: collision with root package name */
    public final i7 f10453b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f10454c;

    /* renamed from: d  reason: collision with root package name */
    public final d3<NetworkDiagnosticConfig> f10455d;

    /* renamed from: e  reason: collision with root package name */
    public final Runnable f10456e = new a();

    /* renamed from: f  reason: collision with root package name */
    public final n4 f10457f = new b();

    /* compiled from: Sta */
    public class a implements Runnable {
        public a() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: com.startapp.g7} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: com.startapp.g7} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: com.startapp.g7} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0127 A[Catch:{ all -> 0x0130 }] */
        /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r25 = this;
                java.lang.String r0 = ";"
                r1 = r25
                com.startapp.g7 r2 = com.startapp.g7.this
                com.startapp.sdk.adsbase.remoteconfig.NetworkDiagnosticConfig r3 = r2.a()
                if (r3 != 0) goto L_0x000e
                goto L_0x0137
            L_0x000e:
                android.content.SharedPreferences r4 = r2.f10452a
                r5 = 0
                java.lang.String r7 = "181bb7005f9db75a"
                long r4 = r4.getLong(r7, r5)
                int r6 = r3.c()
                r8 = 60000(0xea60, float:8.4078E-41)
                int r6 = r6 * r8
                long r8 = (long) r6
                long r4 = r4 + r8
                long r8 = java.lang.System.currentTimeMillis()
                int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r6 > 0) goto L_0x0137
                r4 = 0
                r5 = 2
                com.startapp.i7 r6 = r2.f10453b     // Catch:{ all -> 0x011e }
                android.database.sqlite.SQLiteDatabase r6 = r6.a()     // Catch:{ all -> 0x011e }
                r10 = 1
                java.lang.String[] r11 = new java.lang.String[r10]     // Catch:{ all -> 0x011e }
                java.lang.String r12 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x011e }
                r13 = 0
                r11[r13] = r12     // Catch:{ all -> 0x011e }
                java.lang.String r12 = "SELECT requestId, statusId, requests.value AS request, statuses.value AS status, COUNT(*), MIN(durationNanos), MAX(durationNanos), AVG(durationNanos), MIN(timeMillis) FROM traces JOIN requests ON requests.id = traces.requestId JOIN statuses ON statuses.id = traces.statusId WHERE timeMillis < ? GROUP BY requestId, statusId"
                android.database.Cursor r4 = r6.rawQuery(r12, r11)     // Catch:{ all -> 0x011e }
                if (r4 == 0) goto L_0x011b
            L_0x0045:
                boolean r6 = r4.moveToNext()     // Catch:{ all -> 0x011e }
                if (r6 == 0) goto L_0x0105
                long r11 = r4.getLong(r13)     // Catch:{ all -> 0x011e }
                long r14 = r4.getLong(r10)     // Catch:{ all -> 0x011e }
                java.lang.String r6 = r4.getString(r5)     // Catch:{ all -> 0x011e }
                r10 = 3
                java.lang.String r10 = r4.getString(r10)     // Catch:{ all -> 0x011e }
                r13 = 4
                r16 = r6
                long r5 = r4.getLong(r13)     // Catch:{ all -> 0x011e }
                int r13 = r3.b()     // Catch:{ all -> 0x011e }
                r17 = r2
                long r1 = (long) r13
                int r13 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r13 >= 0) goto L_0x0076
                r1 = r25
                r2 = r17
                r5 = 2
                r10 = 1
                r13 = 0
                goto L_0x0045
            L_0x0076:
                r1 = 5
                long r1 = r4.getLong(r1)     // Catch:{ all -> 0x0101 }
                r13 = 6
                r18 = r14
                long r13 = r4.getLong(r13)     // Catch:{ all -> 0x0101 }
                r15 = 7
                r20 = r11
                r12 = r10
                long r10 = r4.getLong(r15)     // Catch:{ all -> 0x0101 }
                r15 = 8
                r22 = r7
                r23 = r8
                long r7 = r4.getLong(r15)     // Catch:{ all -> 0x0101 }
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0101 }
                r9.<init>()     // Catch:{ all -> 0x0101 }
                r9.append(r5)     // Catch:{ all -> 0x0101 }
                r9.append(r0)     // Catch:{ all -> 0x0101 }
                r9.append(r1)     // Catch:{ all -> 0x0101 }
                r9.append(r0)     // Catch:{ all -> 0x0101 }
                r9.append(r13)     // Catch:{ all -> 0x0101 }
                r9.append(r0)     // Catch:{ all -> 0x0101 }
                r9.append(r10)     // Catch:{ all -> 0x0101 }
                r9.append(r0)     // Catch:{ all -> 0x0101 }
                r9.append(r7)     // Catch:{ all -> 0x0101 }
                r9.append(r0)     // Catch:{ all -> 0x0101 }
                r1 = r23
                r9.append(r1)     // Catch:{ all -> 0x0101 }
                java.lang.String r5 = r9.toString()     // Catch:{ all -> 0x0101 }
                com.startapp.i4 r6 = new com.startapp.i4     // Catch:{ all -> 0x0101 }
                com.startapp.j4 r7 = com.startapp.j4.f10593j     // Catch:{ all -> 0x0101 }
                r6.<init>((com.startapp.j4) r7)     // Catch:{ all -> 0x0101 }
                java.lang.Long r7 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0101 }
                r6.f10541h = r7     // Catch:{ all -> 0x0101 }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0101 }
                r7.<init>()     // Catch:{ all -> 0x0101 }
                r8 = r20
                r7.append(r8)     // Catch:{ all -> 0x0101 }
                java.lang.String r8 = ","
                r7.append(r8)     // Catch:{ all -> 0x0101 }
                r8 = r18
                r7.append(r8)     // Catch:{ all -> 0x0101 }
                java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0101 }
                r6.f10544k = r7     // Catch:{ all -> 0x0101 }
                r7 = r16
                r6.f10542i = r7     // Catch:{ all -> 0x0101 }
                r6.f10537d = r12     // Catch:{ all -> 0x0101 }
                r6.f10538e = r5     // Catch:{ all -> 0x0101 }
                r5 = r17
                com.startapp.n4 r7 = r5.f10457f     // Catch:{ all -> 0x0119 }
                r6.a((com.startapp.n4) r7)     // Catch:{ all -> 0x0119 }
                r8 = r1
                r2 = r5
                r7 = r22
                r5 = 2
                r10 = 1
                r13 = 0
                r1 = r25
                goto L_0x0045
            L_0x0101:
                r0 = move-exception
                r5 = r17
                goto L_0x0120
            L_0x0105:
                r5 = r2
                r22 = r7
                r1 = r8
                android.content.SharedPreferences r0 = r5.f10452a     // Catch:{ all -> 0x0119 }
                android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0119 }
                r3 = r22
                android.content.SharedPreferences$Editor r0 = r0.putLong(r3, r1)     // Catch:{ all -> 0x0119 }
                r0.commit()     // Catch:{ all -> 0x0119 }
                goto L_0x011b
            L_0x0119:
                r0 = move-exception
                goto L_0x0120
            L_0x011b:
                if (r4 == 0) goto L_0x0137
                goto L_0x012c
            L_0x011e:
                r0 = move-exception
                r5 = r2
            L_0x0120:
                r1 = 2
                boolean r1 = r5.a(r1)     // Catch:{ all -> 0x0130 }
                if (r1 == 0) goto L_0x012a
                com.startapp.i4.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0130 }
            L_0x012a:
                if (r4 == 0) goto L_0x0137
            L_0x012c:
                r4.close()
                goto L_0x0137
            L_0x0130:
                r0 = move-exception
                if (r4 == 0) goto L_0x0136
                r4.close()
            L_0x0136:
                throw r0
            L_0x0137:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.g7.a.run():void");
        }
    }

    /* compiled from: Sta */
    public class b implements n4 {

        /* compiled from: Sta */
        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ i4 f10460a;

            public a(i4 i4Var) {
                this.f10460a = i4Var;
            }

            public void run() {
                c cVar;
                g7 g7Var = g7.this;
                i4 i4Var = this.f10460a;
                g7Var.getClass();
                Long l10 = i4Var.f10541h;
                String str = i4Var.f10544k;
                if (str != null) {
                    String[] split = str.split(",");
                    if (!(split.length != 2 || split[0] == null || split[1] == null)) {
                        try {
                            cVar = new c(Long.parseLong(split[0]), Long.parseLong(split[1]));
                        } catch (NumberFormatException unused) {
                        }
                        if (l10 != null && cVar != null) {
                            try {
                                i7 i7Var = g7Var.f10453b;
                                long j10 = cVar.f10462a;
                                long j11 = cVar.f10463b;
                                long longValue = l10.longValue();
                                i7Var.a().delete("traces", "requestId = ? AND statusId = ? AND timeMillis < ?", new String[]{String.valueOf(j10), String.valueOf(j11), String.valueOf(longValue)});
                                return;
                            } catch (Throwable th) {
                                if (g7Var.a(4)) {
                                    i4.a(th);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
                cVar = null;
                if (l10 != null) {
                }
            }
        }

        public b() {
        }

        public void a(i4 i4Var, int i10) {
            if (i10 == 1) {
                g7.this.f10454c.execute(new a(i4Var));
            }
        }
    }

    /* compiled from: Sta */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final long f10462a;

        /* renamed from: b  reason: collision with root package name */
        public final long f10463b;

        public c(long j10, long j11) {
            this.f10462a = j10;
            this.f10463b = j11;
        }
    }

    public g7(Context context, SharedPreferences sharedPreferences, i7 i7Var, Executor executor, d3<NetworkDiagnosticConfig> d3Var) {
        this.f10452a = sharedPreferences;
        this.f10453b = i7Var;
        this.f10454c = executor;
        this.f10455d = d3Var;
    }

    public final NetworkDiagnosticConfig a() {
        NetworkDiagnosticConfig call = this.f10455d.call();
        if (call == null || !call.e()) {
            return null;
        }
        return call;
    }

    public boolean a(int i10) {
        NetworkDiagnosticConfig a10 = a();
        return a10 != null && (a10.a() & i10) == i10;
    }
}
