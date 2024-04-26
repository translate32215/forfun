package x;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.d0;

@SuppressLint({"LogConditional"})
/* compiled from: Debug */
public class a {
    public static String a(Context context, int i10) {
        if (i10 == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i10);
        } catch (Exception unused) {
            return d0.a("?", i10);
        }
    }

    public static String b(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
