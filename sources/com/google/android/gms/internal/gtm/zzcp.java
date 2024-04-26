package com.google.android.gms.internal.gtm;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzcp extends zzbu {
    public volatile String zza;
    public Future zzb;

    public zzcp(zzbx zzbx) {
        super(zzbx);
    }

    public final String zzb() {
        String str;
        zzV();
        synchronized (this) {
            if (this.zza == null) {
                this.zzb = zzq().a(new zzcn(this));
            }
            Future future = this.zzb;
            if (future != null) {
                try {
                    this.zza = (String) future.get();
                } catch (InterruptedException e10) {
                    zzR("ClientId loading or generation was interrupted", e10);
                    this.zza = "0";
                } catch (ExecutionException e11) {
                    zzJ("Failed to load or generate client id", e11);
                    this.zza = "0";
                }
                if (this.zza == null) {
                    this.zza = "0";
                }
                zzO("Loaded clientId", this.zza);
                this.zzb = null;
            }
            str = this.zza;
        }
        return str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006c, code lost:
        if (r4 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007b, code lost:
        if (r4 != null) goto L_0x003e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0071 A[SYNTHETIC, Splitter:B:32:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0089 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzc() {
        /*
            r9 = this;
            java.lang.String r0 = "gaClientId"
            java.lang.String r1 = "Failed to close client id reading stream"
            n7.v r2 = r9.zzq()
            android.content.Context r2 = r2.f22392a
            java.lang.String r3 = "ClientId should be loaded from worker thread"
            com.google.android.gms.common.internal.i.g(r3)
            r3 = 0
            java.io.FileInputStream r4 = r2.openFileInput(r0)     // Catch:{ FileNotFoundException -> 0x007a, IOException -> 0x0062, all -> 0x0060 }
            r5 = 36
            byte[] r6 = new byte[r5]     // Catch:{ FileNotFoundException -> 0x005e, IOException -> 0x005c }
            r7 = 0
            int r5 = r4.read(r6, r7, r5)     // Catch:{ FileNotFoundException -> 0x005e, IOException -> 0x005c }
            int r8 = r4.available()     // Catch:{ FileNotFoundException -> 0x005e, IOException -> 0x005c }
            if (r8 <= 0) goto L_0x002f
            java.lang.String r5 = "clientId file seems corrupted, deleting it."
            r9.zzQ(r5)     // Catch:{ FileNotFoundException -> 0x005e, IOException -> 0x005c }
            r4.close()     // Catch:{ FileNotFoundException -> 0x005e, IOException -> 0x005c }
            r2.deleteFile(r0)     // Catch:{ FileNotFoundException -> 0x005e, IOException -> 0x005c }
            goto L_0x003e
        L_0x002f:
            r8 = 14
            if (r5 >= r8) goto L_0x0042
            java.lang.String r5 = "clientId file is empty, deleting it."
            r9.zzQ(r5)     // Catch:{ FileNotFoundException -> 0x005e, IOException -> 0x005c }
            r4.close()     // Catch:{ FileNotFoundException -> 0x005e, IOException -> 0x005c }
            r2.deleteFile(r0)     // Catch:{ FileNotFoundException -> 0x005e, IOException -> 0x005c }
        L_0x003e:
            r4.close()     // Catch:{ IOException -> 0x007e }
            goto L_0x0082
        L_0x0042:
            r4.close()     // Catch:{ FileNotFoundException -> 0x005e, IOException -> 0x005c }
            java.lang.String r8 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x005e, IOException -> 0x005c }
            r8.<init>(r6, r7, r5)     // Catch:{ FileNotFoundException -> 0x005e, IOException -> 0x005c }
            java.lang.String r5 = "Read client id from disk"
            r9.zzO(r5, r8)     // Catch:{ FileNotFoundException -> 0x005e, IOException -> 0x005c }
            r4.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0057
        L_0x0053:
            r0 = move-exception
            r9.zzJ(r1, r0)
        L_0x0057:
            r3 = r8
            goto L_0x0082
        L_0x0059:
            r0 = move-exception
            r3 = r4
            goto L_0x006f
        L_0x005c:
            r5 = move-exception
            goto L_0x0064
        L_0x005e:
            goto L_0x007b
        L_0x0060:
            r0 = move-exception
            goto L_0x006f
        L_0x0062:
            r5 = move-exception
            r4 = r3
        L_0x0064:
            java.lang.String r6 = "Error reading client id file, deleting it"
            r9.zzJ(r6, r5)     // Catch:{ all -> 0x0059 }
            r2.deleteFile(r0)     // Catch:{ all -> 0x0059 }
            if (r4 == 0) goto L_0x0082
            goto L_0x007d
        L_0x006f:
            if (r3 == 0) goto L_0x0079
            r3.close()     // Catch:{ IOException -> 0x0075 }
            goto L_0x0079
        L_0x0075:
            r2 = move-exception
            r9.zzJ(r1, r2)
        L_0x0079:
            throw r0
        L_0x007a:
            r4 = r3
        L_0x007b:
            if (r4 == 0) goto L_0x0082
        L_0x007d:
            goto L_0x003e
        L_0x007e:
            r0 = move-exception
            r9.zzJ(r1, r0)
        L_0x0082:
            if (r3 != 0) goto L_0x0089
            java.lang.String r0 = r9.zzf()
            return r0
        L_0x0089:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcp.zzc():java.lang.String");
    }

    public final void zzd() {
    }

    public final String zze() {
        synchronized (this) {
            this.zza = null;
            this.zzb = zzq().a(new zzco(this));
        }
        return zzb();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r4 == null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        if (r4 == null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        zzJ("Failed to close clientId writing stream", r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzf() {
        /*
            r7 = this;
            java.lang.String r0 = "0"
            java.lang.String r1 = "Failed to close clientId writing stream"
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r3)
            n7.v r3 = r7.zzq()     // Catch:{ Exception -> 0x0065 }
            android.content.Context r3 = r3.f22392a     // Catch:{ Exception -> 0x0065 }
            com.google.android.gms.common.internal.i.e(r2)     // Catch:{ Exception -> 0x0065 }
            java.lang.String r4 = "ClientId should be saved from worker thread"
            com.google.android.gms.common.internal.i.g(r4)     // Catch:{ Exception -> 0x0065 }
            r4 = 0
            java.lang.String r5 = "Storing clientId"
            r7.zzO(r5, r2)     // Catch:{ FileNotFoundException -> 0x004d, IOException -> 0x003f }
            java.lang.String r5 = "gaClientId"
            r6 = 0
            java.io.FileOutputStream r4 = r3.openFileOutput(r5, r6)     // Catch:{ FileNotFoundException -> 0x004d, IOException -> 0x003f }
            byte[] r3 = r2.getBytes()     // Catch:{ FileNotFoundException -> 0x004d, IOException -> 0x003f }
            r4.write(r3)     // Catch:{ FileNotFoundException -> 0x004d, IOException -> 0x003f }
            r4.close()     // Catch:{ IOException -> 0x0038 }
            goto L_0x003c
        L_0x0038:
            r3 = move-exception
            r7.zzJ(r1, r3)     // Catch:{ Exception -> 0x0065 }
        L_0x003c:
            return r2
        L_0x003d:
            r2 = move-exception
            goto L_0x005a
        L_0x003f:
            r2 = move-exception
            java.lang.String r3 = "Error writing to clientId file"
            r7.zzJ(r3, r2)     // Catch:{ all -> 0x003d }
            if (r4 == 0) goto L_0x0059
        L_0x0047:
            r4.close()     // Catch:{ IOException -> 0x004b }
            goto L_0x0059
        L_0x004b:
            r2 = move-exception
            goto L_0x0056
        L_0x004d:
            r2 = move-exception
            java.lang.String r3 = "Error creating clientId file"
            r7.zzJ(r3, r2)     // Catch:{ all -> 0x003d }
            if (r4 == 0) goto L_0x0059
            goto L_0x0047
        L_0x0056:
            r7.zzJ(r1, r2)     // Catch:{ Exception -> 0x0065 }
        L_0x0059:
            return r0
        L_0x005a:
            if (r4 == 0) goto L_0x0064
            r4.close()     // Catch:{ IOException -> 0x0060 }
            goto L_0x0064
        L_0x0060:
            r3 = move-exception
            r7.zzJ(r1, r3)     // Catch:{ Exception -> 0x0065 }
        L_0x0064:
            throw r2     // Catch:{ Exception -> 0x0065 }
        L_0x0065:
            r1 = move-exception
            java.lang.String r2 = "Error saving clientId file"
            r7.zzJ(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcp.zzf():java.lang.String");
    }
}
