package y2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import g3.c;
import java.util.HashMap;
import java.util.Map;
import u2.f;

/* compiled from: ImageAssetManager */
public class b {

    /* renamed from: e  reason: collision with root package name */
    public static final Object f27996e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Context f27997a;

    /* renamed from: b  reason: collision with root package name */
    public String f27998b;

    /* renamed from: c  reason: collision with root package name */
    public u2.b f27999c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, f> f28000d;

    public b(Drawable.Callback callback, String str, u2.b bVar, Map<String, f> map) {
        this.f27998b = str;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.f27998b;
            if (str2.charAt(str2.length() - 1) != '/') {
                this.f27998b += '/';
            }
        }
        if (!(callback instanceof View)) {
            c.a("LottieDrawable must be inside of a view for images to work.");
            this.f28000d = new HashMap();
            this.f27997a = null;
            return;
        }
        this.f27997a = ((View) callback).getContext();
        this.f28000d = map;
        this.f27999c = bVar;
    }

    public final Bitmap a(String str, Bitmap bitmap) {
        synchronized (f27996e) {
            this.f28000d.get(str).f25984e = bitmap;
        }
        return bitmap;
    }
}
