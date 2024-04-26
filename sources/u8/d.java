package u8;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;

/* compiled from: DrawableAlphaProperty */
public class d extends Property<Drawable, Integer> {

    /* renamed from: b  reason: collision with root package name */
    public static final Property<Drawable, Integer> f26155b = new d();

    /* renamed from: a  reason: collision with root package name */
    public final WeakHashMap<Drawable, Integer> f26156a = new WeakHashMap<>();

    public d() {
        super(Integer.class, "drawableAlphaCompat");
    }

    public Object get(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.f26156a.containsKey(drawable)) {
            return this.f26156a.get(drawable);
        }
        return 255;
    }

    public void set(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj;
        Integer num = (Integer) obj2;
        if (Build.VERSION.SDK_INT < 19) {
            this.f26156a.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
