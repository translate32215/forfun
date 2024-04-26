package f7;

import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.gms.ads.internal.util.a;
import com.google.android.gms.ads.internal.util.o;
import d7.l;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class e implements View.OnApplyWindowInsetsListener {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f18262a;

    public e(a aVar, Activity activity) {
        this.f18262a = activity;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Activity activity = this.f18262a;
        if (((o) l.B.f13190g.f()).A() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String str = "";
            if (displayCutout != null) {
                d0 f10 = l.B.f13190g.f();
                for (Rect next : displayCutout.getBoundingRects()) {
                    String format = String.format(Locale.US, "%d,%d,%d,%d", new Object[]{Integer.valueOf(next.left), Integer.valueOf(next.top), Integer.valueOf(next.right), Integer.valueOf(next.bottom)});
                    if (!TextUtils.isEmpty(str)) {
                        str = String.valueOf(str).concat("|");
                    }
                    String valueOf = String.valueOf(str);
                    String valueOf2 = String.valueOf(format);
                    str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                }
                ((o) f10).v(str);
            } else {
                ((o) l.B.f13190g.f()).v(str);
            }
        }
        a.s(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }
}
