package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;
import d7.l;
import e8.t;
import e8.ti0;
import f7.c;
import f7.e;
import javax.annotation.ParametersAreNonnullByDefault;

@TargetApi(28)
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class a extends c {
    public static void s(boolean z10, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i10 = attributes.layoutInDisplayCutoutMode;
        int i11 = z10 ? 1 : 2;
        if (i11 != i10) {
            attributes.layoutInDisplayCutoutMode = i11;
            window.setAttributes(attributes);
        }
    }

    public final void m(Activity activity) {
        if (((Boolean) ti0.f16763j.f16769f.a(t.E0)).booleanValue() && ((o) l.B.f13190g.f()).A() == null && !activity.isInMultiWindowMode()) {
            s(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new e(this, activity));
        }
    }
}
