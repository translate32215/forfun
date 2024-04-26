package e8;

import android.os.Build;
import f7.b0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class bz implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static final Callable f14071a = new bz();

    public final Object call() {
        HashMap hashMap = new HashMap();
        String str = (String) ti0.f16763j.f16769f.a(t.A);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) ti0.f16763j.f16769f.a(t.B)).intValue()) {
                for (String str2 : str.split(",", -1)) {
                    hashMap.put(str2, b0.b(str2));
                }
            }
        }
        return new ww((Map) hashMap);
    }
}
