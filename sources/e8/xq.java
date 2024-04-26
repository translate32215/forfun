package e8;

import com.google.android.gms.internal.ads.lb;
import com.google.android.gms.internal.ads.q2;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class xq implements ta0<Set<ul<ek>>> {
    public static Set a(lb lbVar, Executor executor) {
        Set b10 = q2.b(lbVar, executor);
        jc0.b(b10, "Cannot return null from a non-@Nullable @Provides method");
        return b10;
    }
}
