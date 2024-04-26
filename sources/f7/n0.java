package f7;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.util.m;
import com.google.android.gms.ads.internal.util.q;
import l0.e;
import q.a;
import s7.i;

@TargetApi(17)
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class n0 extends m0 {
    public n0() {
        super((a) null);
    }

    public final String a(Context context) {
        if (x.f18323b == null) {
            x.f18323b = new x();
        }
        x xVar = x.f18323b;
        if (TextUtils.isEmpty(xVar.f18324a)) {
            xVar.f18324a = (String) y.a(context, new m(i.a(context), context));
        }
        return xVar.f18324a;
    }

    public final int c(ContentResolver contentResolver) {
        return Settings.Global.getInt(contentResolver, "wifi_on", 0);
    }

    public final Drawable d(Context context, Bitmap bitmap, boolean z10, float f10) {
        if (!z10 || f10 <= 0.0f || f10 > 25.0f) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
        try {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
            RenderScript create = RenderScript.create(context);
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(f10);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            return new BitmapDrawable(context.getResources(), createBitmap);
        } catch (RuntimeException unused) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
    }

    public final boolean i(Context context, WebSettings webSettings) {
        y.a(context, new q(context, webSettings));
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }

    public final int j(ContentResolver contentResolver) {
        return Settings.Global.getInt(contentResolver, "airplane_mode_on", 0);
    }

    public final void k(Context context) {
        if (x.f18323b == null) {
            x.f18323b = new x();
        }
        x xVar = x.f18323b;
        e.H("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(xVar.f18324a)) {
            Context a10 = i.a(context);
            if (a10 == null) {
                SharedPreferences.Editor putString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
                if (a10 == null) {
                    putString.apply();
                } else {
                    throw new IllegalStateException("world-readable shared preferences should only be used by apk");
                }
            }
            xVar.f18324a = defaultUserAgent;
        }
        e.H("User agent is updated.");
    }
}
