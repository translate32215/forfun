package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ig {

    /* renamed from: a  reason: collision with root package name */
    public static final ClipData f7093a = ClipData.newIntent("", new Intent());

    @Nullable
    public static PendingIntent a(Context context, Intent intent, int i10) {
        boolean z10 = true;
        pg.a((i10 & 95) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        pg.a(intent.getComponent() != null, "Must set component on Intent.");
        if (b(0, 1)) {
            pg.a(!b(i10, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            if (Build.VERSION.SDK_INT >= 23 && !b(i10, 67108864)) {
                z10 = false;
            }
            pg.a(z10, "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (Build.VERSION.SDK_INT < 23 || !b(i10, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!b(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!b(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!b(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!b(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(f7093a);
            }
        }
        return PendingIntent.getService(context, 0, intent2, i10);
    }

    public static boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
