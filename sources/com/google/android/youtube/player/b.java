package com.google.android.youtube.player;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;

public enum b {
    SUCCESS,
    INTERNAL_ERROR,
    UNKNOWN_ERROR,
    SERVICE_MISSING,
    SERVICE_VERSION_UPDATE_REQUIRED,
    SERVICE_DISABLED,
    SERVICE_INVALID,
    ERROR_CONNECTING_TO_SERVICE;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9652a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0013 */
        static {
            /*
                com.google.android.youtube.player.b[] r0 = com.google.android.youtube.player.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9652a = r0
                r1 = 1
                r2 = 3
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                int[] r0 = f9652a     // Catch:{ NoSuchFieldError -> 0x0013 }
                r1 = 5
                r3 = 2
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0013 }
            L_0x0013:
                int[] r0 = f9652a     // Catch:{ NoSuchFieldError -> 0x0018 }
                r1 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.youtube.player.b.a.<clinit>():void");
        }
    }

    /* renamed from: com.google.android.youtube.player.b$b  reason: collision with other inner class name */
    public static final class C0105b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final Activity f9653a;

        /* renamed from: b  reason: collision with root package name */
        public final Intent f9654b;

        /* renamed from: c  reason: collision with root package name */
        public final int f9655c;

        public C0105b(Activity activity, Intent intent, int i10) {
            if (activity != null) {
                this.f9653a = activity;
                if (intent != null) {
                    this.f9654b = intent;
                    Integer valueOf = Integer.valueOf(i10);
                    u.b.a(valueOf);
                    this.f9655c = valueOf.intValue();
                    return;
                }
                throw new NullPointerException("null reference");
            }
            throw new NullPointerException("null reference");
        }

        public final void onClick(DialogInterface dialogInterface, int i10) {
            try {
                this.f9653a.startActivityForResult(this.f9654b, this.f9655c);
                dialogInterface.dismiss();
            } catch (ActivityNotFoundException e10) {
                Log.e("YouTubeAndroidPlayerAPI", "Can't perform resolution for YouTubeInitalizationError", e10);
            }
        }
    }
}
