package androidx.appcompat.widget;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* compiled from: TooltipCompat */
public class j1 {

    /* compiled from: TooltipCompat */
    public static class a {
        public static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(view, charSequence);
            return;
        }
        k1 k1Var = k1.f977s;
        if (k1Var != null && k1Var.f979a == view) {
            k1.b((k1) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            k1 k1Var2 = k1.f978t;
            if (k1Var2 != null && k1Var2.f979a == view) {
                k1Var2.a();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new k1(view, charSequence);
    }
}
