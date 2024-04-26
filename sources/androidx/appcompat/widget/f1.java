package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* compiled from: TintResources */
public class f1 extends u0 {

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<Context> f904b;

    public f1(Context context, Resources resources) {
        super(resources);
        this.f904b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i10) throws Resources.NotFoundException {
        Drawable a10 = a(i10);
        Context context = (Context) this.f904b.get();
        if (!(a10 == null || context == null)) {
            t0.d().m(context, i10, a10);
        }
        return a10;
    }
}
