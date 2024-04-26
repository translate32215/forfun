package e8;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.t7;
import d7.l;
import java.util.HashMap;
import java.util.Map;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class g3 implements f3<t7> {
    public final void f(Object obj, Map map) {
        t7 t7Var = (t7) obj;
        p pVar = l.B.f13186c;
        DisplayMetrics c10 = p.c((WindowManager) t7Var.getContext().getSystemService("window"));
        int i10 = c10.widthPixels;
        int i11 = c10.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) t7Var).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i10));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i11));
        t7Var.O("locationReady", hashMap);
        e.K("GET LOCATION COMPILED");
    }
}
