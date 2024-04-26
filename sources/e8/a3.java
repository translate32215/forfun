package e8;

import java.util.Map;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class a3 implements f3<Object> {
    public final void f(Object obj, Map<String, String> map) {
        String valueOf = String.valueOf(map.get("string"));
        e.J(valueOf.length() != 0 ? "Received log message: ".concat(valueOf) : new String("Received log message: "));
    }
}
