package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import b7.a;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzbk extends zzbu {
    public static boolean zza;
    public a.C0050a zzb;
    public final zzfq zzc;
    public String zzd;
    public boolean zze = false;
    public final Object zzf = new Object();

    public zzbk(zzbx zzbx) {
        super(zzbx);
        this.zzc = new zzfq(zzbx.zzr());
    }

    public static String zze(String str) {
        MessageDigest zze2 = zzfu.zze("MD5");
        if (zze2 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, zze2.digest(str.getBytes()))});
    }

    public final String zza() {
        zzV();
        a.C0050a zzc2 = zzc();
        String str = zzc2 != null ? zzc2.f3648a : null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public final boolean zzb() {
        zzV();
        a.C0050a zzc2 = zzc();
        if (zzc2 == null || zzc2.f3649b) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0131, code lost:
        if (r0 == false) goto L_0x0136;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0032 A[Catch:{ IllegalStateException -> 0x0028, Exception -> 0x001b }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034 A[Catch:{ IllegalStateException -> 0x0028, Exception -> 0x001b }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003c A[Catch:{ IllegalStateException -> 0x0028, Exception -> 0x001b }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e A[Catch:{ IllegalStateException -> 0x0028, Exception -> 0x001b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized b7.a.C0050a zzc() {
        /*
            r11 = this;
            monitor-enter(r11)
            com.google.android.gms.internal.gtm.zzfq r0 = r11.zzc     // Catch:{ all -> 0x014c }
            r1 = 1000(0x3e8, double:4.94E-321)
            boolean r0 = r0.zzc(r1)     // Catch:{ all -> 0x014c }
            if (r0 == 0) goto L_0x0148
            com.google.android.gms.internal.gtm.zzfq r0 = r11.zzc     // Catch:{ all -> 0x014c }
            r0.zzb()     // Catch:{ all -> 0x014c }
            r0 = 1
            r1 = 0
            android.content.Context r2 = r11.zzo()     // Catch:{ IllegalStateException -> 0x0028, Exception -> 0x001b }
            b7.a$a r2 = b7.a.a(r2)     // Catch:{ IllegalStateException -> 0x0028, Exception -> 0x001b }
            goto L_0x002e
        L_0x001b:
            r2 = move-exception
            boolean r3 = zza     // Catch:{ all -> 0x014c }
            if (r3 != 0) goto L_0x002d
            zza = r0     // Catch:{ all -> 0x014c }
            java.lang.String r3 = "Error getting advertiser id"
            r11.zzR(r3, r2)     // Catch:{ all -> 0x014c }
            goto L_0x002d
        L_0x0028:
            java.lang.String r2 = "IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details."
            r11.zzQ(r2)     // Catch:{ all -> 0x014c }
        L_0x002d:
            r2 = r1
        L_0x002e:
            b7.a$a r3 = r11.zzb     // Catch:{ all -> 0x014c }
            if (r2 != 0) goto L_0x0034
            r4 = r1
            goto L_0x0036
        L_0x0034:
            java.lang.String r4 = r2.f3648a     // Catch:{ all -> 0x014c }
        L_0x0036:
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x014c }
            if (r5 == 0) goto L_0x003e
            goto L_0x0133
        L_0x003e:
            com.google.android.gms.internal.gtm.zzcp r5 = r11.zzv()     // Catch:{ all -> 0x014c }
            java.lang.String r5 = r5.zzb()     // Catch:{ all -> 0x014c }
            java.lang.Object r6 = r11.zzf     // Catch:{ all -> 0x014c }
            monitor-enter(r6)     // Catch:{ all -> 0x014c }
            boolean r7 = r11.zze     // Catch:{ all -> 0x0145 }
            r8 = 0
            if (r7 != 0) goto L_0x00a5
            android.content.Context r3 = r11.zzo()     // Catch:{ FileNotFoundException -> 0x00a0, IOException -> 0x008e }
            java.lang.String r7 = "gaClientIdData"
            java.io.FileInputStream r3 = r3.openFileInput(r7)     // Catch:{ FileNotFoundException -> 0x00a0, IOException -> 0x008e }
            r7 = 128(0x80, float:1.794E-43)
            byte[] r9 = new byte[r7]     // Catch:{ FileNotFoundException -> 0x00a0, IOException -> 0x008e }
            int r7 = r3.read(r9, r8, r7)     // Catch:{ FileNotFoundException -> 0x00a0, IOException -> 0x008e }
            int r10 = r3.available()     // Catch:{ FileNotFoundException -> 0x00a0, IOException -> 0x008e }
            if (r10 <= 0) goto L_0x0078
            java.lang.String r7 = "Hash file seems corrupted, deleting it."
            r11.zzQ(r7)     // Catch:{ FileNotFoundException -> 0x00a0, IOException -> 0x008e }
            r3.close()     // Catch:{ FileNotFoundException -> 0x00a0, IOException -> 0x008e }
            android.content.Context r3 = r11.zzo()     // Catch:{ FileNotFoundException -> 0x00a0, IOException -> 0x008e }
            java.lang.String r7 = "gaClientIdData"
            r3.deleteFile(r7)     // Catch:{ FileNotFoundException -> 0x00a0, IOException -> 0x008e }
            goto L_0x00a0
        L_0x0078:
            if (r7 > 0) goto L_0x0083
            java.lang.String r7 = "Hash file is empty."
            r11.zzN(r7)     // Catch:{ FileNotFoundException -> 0x00a0, IOException -> 0x008e }
            r3.close()     // Catch:{ FileNotFoundException -> 0x00a0, IOException -> 0x008e }
            goto L_0x00a0
        L_0x0083:
            java.lang.String r10 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x00a0, IOException -> 0x008e }
            r10.<init>(r9, r8, r7)     // Catch:{ FileNotFoundException -> 0x00a0, IOException -> 0x008e }
            r3.close()     // Catch:{ FileNotFoundException -> 0x009f, IOException -> 0x008c }
            goto L_0x009f
        L_0x008c:
            r1 = move-exception
            goto L_0x0091
        L_0x008e:
            r3 = move-exception
            r10 = r1
            r1 = r3
        L_0x0091:
            java.lang.String r3 = "Error reading Hash file, deleting it"
            r11.zzR(r3, r1)     // Catch:{ all -> 0x0145 }
            android.content.Context r1 = r11.zzo()     // Catch:{ all -> 0x0145 }
            java.lang.String r3 = "gaClientIdData"
            r1.deleteFile(r3)     // Catch:{ all -> 0x0145 }
        L_0x009f:
            r1 = r10
        L_0x00a0:
            r11.zzd = r1     // Catch:{ all -> 0x0145 }
            r11.zze = r0     // Catch:{ all -> 0x0145 }
            goto L_0x00de
        L_0x00a5:
            java.lang.String r0 = r11.zzd     // Catch:{ all -> 0x0145 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0145 }
            if (r0 == 0) goto L_0x00de
            if (r3 != 0) goto L_0x00b0
            goto L_0x00b2
        L_0x00b0:
            java.lang.String r1 = r3.f3648a     // Catch:{ all -> 0x0145 }
        L_0x00b2:
            if (r1 != 0) goto L_0x00c9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0145 }
            r0.<init>()     // Catch:{ all -> 0x0145 }
            r0.append(r4)     // Catch:{ all -> 0x0145 }
            r0.append(r5)     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0145 }
            boolean r0 = r11.zzf(r0)     // Catch:{ all -> 0x0145 }
            monitor-exit(r6)     // Catch:{ all -> 0x0145 }
            goto L_0x0131
        L_0x00c9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0145 }
            r0.<init>()     // Catch:{ all -> 0x0145 }
            r0.append(r1)     // Catch:{ all -> 0x0145 }
            r0.append(r5)     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = zze(r0)     // Catch:{ all -> 0x0145 }
            r11.zzd = r0     // Catch:{ all -> 0x0145 }
        L_0x00de:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0145 }
            r0.<init>()     // Catch:{ all -> 0x0145 }
            r0.append(r4)     // Catch:{ all -> 0x0145 }
            r0.append(r5)     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = zze(r0)     // Catch:{ all -> 0x0145 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0145 }
            if (r1 == 0) goto L_0x00f9
            monitor-exit(r6)     // Catch:{ all -> 0x0145 }
            goto L_0x0136
        L_0x00f9:
            java.lang.String r1 = r11.zzd     // Catch:{ all -> 0x0145 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0145 }
            if (r0 == 0) goto L_0x0103
            monitor-exit(r6)     // Catch:{ all -> 0x0145 }
            goto L_0x0133
        L_0x0103:
            java.lang.String r0 = r11.zzd     // Catch:{ all -> 0x0145 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0145 }
            if (r0 != 0) goto L_0x011d
            java.lang.String r0 = "Resetting the client id because Advertising Id changed."
            r11.zzN(r0)     // Catch:{ all -> 0x0145 }
            com.google.android.gms.internal.gtm.zzcp r0 = r11.zzv()     // Catch:{ all -> 0x0145 }
            java.lang.String r5 = r0.zze()     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = "New client Id"
            r11.zzO(r0, r5)     // Catch:{ all -> 0x0145 }
        L_0x011d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0145 }
            r0.<init>()     // Catch:{ all -> 0x0145 }
            r0.append(r4)     // Catch:{ all -> 0x0145 }
            r0.append(r5)     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0145 }
            boolean r0 = r11.zzf(r0)     // Catch:{ all -> 0x0145 }
            monitor-exit(r6)     // Catch:{ all -> 0x0145 }
        L_0x0131:
            if (r0 == 0) goto L_0x0136
        L_0x0133:
            r11.zzb = r2     // Catch:{ all -> 0x014c }
            goto L_0x0148
        L_0x0136:
            java.lang.String r0 = "Failed to reset client id on adid change. Not using adid"
            r11.zzI(r0)     // Catch:{ all -> 0x014c }
            b7.a$a r0 = new b7.a$a     // Catch:{ all -> 0x014c }
            java.lang.String r1 = ""
            r0.<init>(r1, r8)     // Catch:{ all -> 0x014c }
            r11.zzb = r0     // Catch:{ all -> 0x014c }
            goto L_0x0148
        L_0x0145:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0145 }
            throw r0     // Catch:{ all -> 0x014c }
        L_0x0148:
            b7.a$a r0 = r11.zzb     // Catch:{ all -> 0x014c }
            monitor-exit(r11)
            return r0
        L_0x014c:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzbk.zzc():b7.a$a");
    }

    public final void zzd() {
    }

    public final boolean zzf(String str) {
        try {
            String zze2 = zze(str);
            zzN("Storing hashed adid.");
            FileOutputStream openFileOutput = zzo().openFileOutput("gaClientIdData", 0);
            openFileOutput.write(zze2.getBytes());
            openFileOutput.close();
            this.zzd = zze2;
            return true;
        } catch (IOException e10) {
            zzJ("Error creating hash file", e10);
            return false;
        }
    }
}
