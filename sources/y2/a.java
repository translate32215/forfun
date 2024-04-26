package y2;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.m;
import g3.c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FontAssetManager */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final m f27991a = new m(2);

    /* renamed from: b  reason: collision with root package name */
    public final Map<m, Typeface> f27992b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Typeface> f27993c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final AssetManager f27994d;

    /* renamed from: e  reason: collision with root package name */
    public String f27995e = ".ttf";

    public a(Drawable.Callback callback) {
        if (!(callback instanceof View)) {
            c.a("LottieDrawable must be inside of a view for images to work.");
            this.f27994d = null;
            return;
        }
        this.f27994d = ((View) callback).getContext().getAssets();
    }
}
