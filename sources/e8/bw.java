package e8;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.ld;
import com.google.android.gms.internal.ads.mg;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class bw implements mg {

    /* renamed from: a  reason: collision with root package name */
    public final List f14067a;

    public bw(ld ldVar, List list) {
        this.f14067a = list;
    }

    public final Object apply(Object obj) {
        List<Uri> list = this.f14067a;
        String str = (String) obj;
        ArrayList arrayList = new ArrayList();
        for (Uri uri : list) {
            if (!ld.t6(uri, ld.f7366u, ld.f7367v) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(ld.s6(uri, "nas", str));
            }
        }
        return arrayList;
    }
}
