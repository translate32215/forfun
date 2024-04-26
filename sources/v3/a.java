package v3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import f0.g;
import j.c;

/* compiled from: DrawableDecoderCompat */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f26372a = true;

    public static Drawable a(Context context, Context context2, int i10, Resources.Theme theme) {
        try {
            if (f26372a) {
                return g.a.b(theme != null ? new c(context2, theme) : context2, i10);
            }
        } catch (NoClassDefFoundError unused) {
            f26372a = false;
        } catch (IllegalStateException e10) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return d0.a.c(context2, i10);
            }
            throw e10;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return g.a(context2.getResources(), i10, theme);
    }
}
