package e8;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class fj0 extends ContentProvider {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void attachInfo(android.content.Context r7, android.content.pm.ProviderInfo r8) {
        /*
            r6 = this;
            b8.b r0 = b8.c.a(r7)     // Catch:{ NullPointerException -> 0x0018, NameNotFoundException -> 0x0011 }
            java.lang.String r1 = r7.getPackageName()     // Catch:{ NullPointerException -> 0x0018, NameNotFoundException -> 0x0011 }
            r2 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r0.a(r1, r2)     // Catch:{ NullPointerException -> 0x0018, NameNotFoundException -> 0x0011 }
            android.os.Bundle r0 = r0.metaData     // Catch:{ NullPointerException -> 0x0018, NameNotFoundException -> 0x0011 }
            goto L_0x001f
        L_0x0011:
            r0 = move-exception
            java.lang.String r1 = "Failed to load metadata: Package name not found."
            l0.e.C(r1, r0)
            goto L_0x001e
        L_0x0018:
            r0 = move-exception
            java.lang.String r1 = "Failed to load metadata: Null pointer exception."
            l0.e.C(r1, r0)
        L_0x001e:
            r0 = 0
        L_0x001f:
            com.google.android.gms.internal.ads.ri r1 = com.google.android.gms.internal.ads.ri.f8040c
            if (r1 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.ri r1 = new com.google.android.gms.internal.ads.ri
            r1.<init>()
            com.google.android.gms.internal.ads.ri.f8040c = r1
        L_0x002a:
            com.google.android.gms.internal.ads.ri r1 = com.google.android.gms.internal.ads.ri.f8040c
            if (r0 != 0) goto L_0x0035
            java.lang.String r0 = "Metadata was null."
            l0.e.I(r0)
            goto L_0x00b8
        L_0x0035:
            java.lang.String r2 = "com.google.android.gms.ads.APPLICATION_ID"
            java.lang.Object r2 = r0.get(r2)     // Catch:{ ClassCastException -> 0x00df }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ ClassCastException -> 0x00df }
            java.lang.String r3 = "com.google.android.gms.ads.AD_MANAGER_APP"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ ClassCastException -> 0x00d6 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ ClassCastException -> 0x00d6 }
            java.lang.String r4 = "com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT"
            java.lang.Object r4 = r0.get(r4)     // Catch:{ ClassCastException -> 0x00cd }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ ClassCastException -> 0x00cd }
            java.lang.String r5 = "com.google.android.gms.ads.INTEGRATION_MANAGER"
            java.lang.Object r0 = r0.get(r5)     // Catch:{ ClassCastException -> 0x00c4 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassCastException -> 0x00c4 }
            if (r2 == 0) goto L_0x0091
            java.lang.String r5 = "^/\\d+~.+$"
            boolean r5 = r2.matches(r5)
            if (r5 != 0) goto L_0x0091
            java.lang.String r0 = "^ca-app-pub-[0-9]{16}~[0-9]{10}$"
            boolean r0 = r2.matches(r0)
            if (r0 == 0) goto L_0x0089
            java.lang.String r0 = "Publisher provided Google AdMob App ID in manifest: "
            int r3 = r2.length()
            if (r3 == 0) goto L_0x0074
            java.lang.String r0 = r0.concat(r2)
            goto L_0x007a
        L_0x0074:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
            r0 = r3
        L_0x007a:
            l0.e.E(r0)
            if (r4 == 0) goto L_0x0085
            boolean r0 = r4.booleanValue()
            if (r0 != 0) goto L_0x00b8
        L_0x0085:
            r1.S(r7, r2)
            goto L_0x00b8
        L_0x0089:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "\n\n******************************************************************************\n* Invalid application ID. Follow instructions here:                          *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to find your app ID.                                                       *\n******************************************************************************\n\n"
            r7.<init>(r8)
            throw r7
        L_0x0091:
            if (r3 == 0) goto L_0x0099
            boolean r1 = r3.booleanValue()
            if (r1 != 0) goto L_0x00b8
        L_0x0099:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x00bc
            java.lang.String r1 = "The Google Mobile Ads SDK is integrated by "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x00b0
            java.lang.String r0 = r1.concat(r0)
            goto L_0x00b5
        L_0x00b0:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x00b5:
            l0.e.E(r0)
        L_0x00b8:
            super.attachInfo(r7, r8)
            return
        L_0x00bc:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "\n\n******************************************************************************\n* The Google Mobile Ads SDK was initialized incorrectly. AdMob publishers    *\n* should follow the instructions here:                                       *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to add a valid App ID inside the AndroidManifest.                          *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://googlemobileadssdk.page.link/ad-manager-android-update-manifest.   *\n******************************************************************************\n\n"
            r7.<init>(r8)
            throw r7
        L_0x00c4:
            r7 = move-exception
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "The com.google.android.gms.ads.INTEGRATION_MANAGER metadata must have a String value."
            r8.<init>(r0, r7)
            throw r8
        L_0x00cd:
            r7 = move-exception
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "The com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT metadata must have a boolean value."
            r8.<init>(r0, r7)
            throw r8
        L_0x00d6:
            r7 = move-exception
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "The com.google.android.gms.ads.AD_MANAGER_APP metadata must have a boolean value."
            r8.<init>(r0, r7)
            throw r8
        L_0x00df:
            r7 = move-exception
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "The com.google.android.gms.ads.APPLICATION_ID metadata must have a String value."
            r8.<init>(r0, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.fj0.attachInfo(android.content.Context, android.content.pm.ProviderInfo):void");
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        return false;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
