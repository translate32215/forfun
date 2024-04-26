package androidx.emoji2.text;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import java.util.Collections;
import java.util.List;

/* compiled from: DefaultEmojiCompatConfig */
public final class c {

    /* compiled from: DefaultEmojiCompatConfig */
    public static class a {
        public ProviderInfo a(ResolveInfo resolveInfo) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }

        public Signature[] b(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        public List<ResolveInfo> c(PackageManager packageManager, Intent intent, int i10) {
            return Collections.emptyList();
        }
    }

    /* compiled from: DefaultEmojiCompatConfig */
    public static class b extends a {
        public ProviderInfo a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        public List<ResolveInfo> c(PackageManager packageManager, Intent intent, int i10) {
            return packageManager.queryIntentContentProviders(intent, i10);
        }
    }

    /* renamed from: androidx.emoji2.text.c$c  reason: collision with other inner class name */
    /* compiled from: DefaultEmojiCompatConfig */
    public static class C0019c extends b {
        public Signature[] b(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.emoji2.text.k a(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x000c
            androidx.emoji2.text.c$c r0 = new androidx.emoji2.text.c$c
            r0.<init>()
            goto L_0x001b
        L_0x000c:
            r1 = 19
            if (r0 < r1) goto L_0x0016
            androidx.emoji2.text.c$b r0 = new androidx.emoji2.text.c$b
            r0.<init>()
            goto L_0x001b
        L_0x0016:
            androidx.emoji2.text.c$a r0 = new androidx.emoji2.text.c$a
            r0.<init>()
        L_0x001b:
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            q.a.f(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r0.c(r1, r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x0034:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x0056
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r0.a(r4)
            r6 = 1
            if (r4 == 0) goto L_0x0052
            android.content.pm.ApplicationInfo r7 = r4.applicationInfo
            if (r7 == 0) goto L_0x0052
            int r7 = r7.flags
            r7 = r7 & r6
            if (r7 != r6) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r6 = 0
        L_0x0053:
            if (r6 == 0) goto L_0x0034
            goto L_0x0057
        L_0x0056:
            r4 = r5
        L_0x0057:
            if (r4 != 0) goto L_0x005a
            goto L_0x0088
        L_0x005a:
            java.lang.String r2 = r4.authority     // Catch:{ NameNotFoundException -> 0x0082 }
            java.lang.String r4 = r4.packageName     // Catch:{ NameNotFoundException -> 0x0082 }
            android.content.pm.Signature[] r0 = r0.b(r1, r4)     // Catch:{ NameNotFoundException -> 0x0082 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ NameNotFoundException -> 0x0082 }
            r1.<init>()     // Catch:{ NameNotFoundException -> 0x0082 }
            int r6 = r0.length     // Catch:{ NameNotFoundException -> 0x0082 }
        L_0x0068:
            if (r3 >= r6) goto L_0x0076
            r7 = r0[r3]     // Catch:{ NameNotFoundException -> 0x0082 }
            byte[] r7 = r7.toByteArray()     // Catch:{ NameNotFoundException -> 0x0082 }
            r1.add(r7)     // Catch:{ NameNotFoundException -> 0x0082 }
            int r3 = r3 + 1
            goto L_0x0068
        L_0x0076:
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch:{ NameNotFoundException -> 0x0082 }
            l0.h r1 = new l0.h     // Catch:{ NameNotFoundException -> 0x0082 }
            java.lang.String r3 = "emojicompat-emoji-font"
            r1.<init>(r2, r4, r3, r0)     // Catch:{ NameNotFoundException -> 0x0082 }
            goto L_0x0089
        L_0x0082:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
        L_0x0088:
            r1 = r5
        L_0x0089:
            if (r1 != 0) goto L_0x008c
            goto L_0x0091
        L_0x008c:
            androidx.emoji2.text.k r5 = new androidx.emoji2.text.k
            r5.<init>(r8, r1)
        L_0x0091:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.c.a(android.content.Context):androidx.emoji2.text.k");
    }
}
