package f7;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;

@TargetApi(19)
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class o0 extends p0 {
    public final boolean b(View view) {
        return view.isAttachedToWindow();
    }

    public final ViewGroup.LayoutParams o() {
        return new ViewGroup.LayoutParams(-1, -1);
    }
}
