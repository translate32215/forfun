package e8;

import com.google.android.gms.internal.ads.mg;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class qw implements mg {

    /* renamed from: a  reason: collision with root package name */
    public static final mg f16210a = new qw();

    public final Object apply(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        if (arrayList.isEmpty()) {
            return null;
        }
        return new mw(arrayList, 1);
    }
}
