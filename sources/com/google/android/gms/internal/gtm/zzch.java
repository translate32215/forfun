package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzch extends zzbu {
    public final zzax zza = new zzax();

    public zzch(zzbx zzbx) {
        super(zzbx);
    }

    public final zzax zza() {
        zzV();
        return this.zza;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        android.util.Log.e("GAv4", "Error retrieving package info: appName set to " + r3);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd() {
        /*
            r7 = this;
            n7.v r0 = r7.zzq()
            com.google.android.gms.internal.gtm.zzax r1 = r0.f22395d
            if (r1 != 0) goto L_0x006d
            monitor-enter(r0)
            com.google.android.gms.internal.gtm.zzax r1 = r0.f22395d     // Catch:{ all -> 0x006a }
            if (r1 != 0) goto L_0x0068
            com.google.android.gms.internal.gtm.zzax r1 = new com.google.android.gms.internal.gtm.zzax     // Catch:{ all -> 0x006a }
            r1.<init>()     // Catch:{ all -> 0x006a }
            android.content.Context r2 = r0.f22392a     // Catch:{ all -> 0x006a }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ all -> 0x006a }
            android.content.Context r3 = r0.f22392a     // Catch:{ all -> 0x006a }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ all -> 0x006a }
            r1.zzi(r3)     // Catch:{ all -> 0x006a }
            java.lang.String r4 = r2.getInstallerPackageName(r3)     // Catch:{ all -> 0x006a }
            r1.zzj(r4)     // Catch:{ all -> 0x006a }
            r4 = 0
            android.content.Context r5 = r0.f22392a     // Catch:{ NameNotFoundException -> 0x004a }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x004a }
            r6 = 0
            android.content.pm.PackageInfo r5 = r2.getPackageInfo(r5, r6)     // Catch:{ NameNotFoundException -> 0x004a }
            if (r5 == 0) goto L_0x0060
            android.content.pm.ApplicationInfo r6 = r5.applicationInfo     // Catch:{ NameNotFoundException -> 0x004a }
            java.lang.CharSequence r2 = r2.getApplicationLabel(r6)     // Catch:{ NameNotFoundException -> 0x004a }
            boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch:{ NameNotFoundException -> 0x004a }
            if (r6 != 0) goto L_0x0047
            java.lang.String r2 = r2.toString()     // Catch:{ NameNotFoundException -> 0x004a }
            r3 = r2
        L_0x0047:
            java.lang.String r4 = r5.versionName     // Catch:{ NameNotFoundException -> 0x004a }
            goto L_0x0060
        L_0x004a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006a }
            r2.<init>()     // Catch:{ all -> 0x006a }
            java.lang.String r5 = "Error retrieving package info: appName set to "
            r2.append(r5)     // Catch:{ all -> 0x006a }
            r2.append(r3)     // Catch:{ all -> 0x006a }
            java.lang.String r5 = "GAv4"
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x006a }
            android.util.Log.e(r5, r2)     // Catch:{ all -> 0x006a }
        L_0x0060:
            r1.zzk(r3)     // Catch:{ all -> 0x006a }
            r1.zzl(r4)     // Catch:{ all -> 0x006a }
            r0.f22395d = r1     // Catch:{ all -> 0x006a }
        L_0x0068:
            monitor-exit(r0)     // Catch:{ all -> 0x006a }
            goto L_0x006d
        L_0x006a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006a }
            throw r1
        L_0x006d:
            com.google.android.gms.internal.gtm.zzax r0 = r0.f22395d
            com.google.android.gms.internal.gtm.zzax r1 = r7.zza
            r0.zzc(r1)
            com.google.android.gms.internal.gtm.zzfv r0 = r7.zzB()
            r0.zzV()
            java.lang.String r1 = r0.zzb
            if (r1 == 0) goto L_0x0084
            com.google.android.gms.internal.gtm.zzax r2 = r7.zza
            r2.zzk(r1)
        L_0x0084:
            r0.zzV()
            java.lang.String r0 = r0.zza
            if (r0 == 0) goto L_0x0090
            com.google.android.gms.internal.gtm.zzax r1 = r7.zza
            r1.zzl(r0)
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzch.zzd():void");
    }
}
