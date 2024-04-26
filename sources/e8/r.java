package e8;

import a6.b;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.uk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final Collection<l<?>> f16217a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final Collection<l<String>> f16218b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final Collection<l<String>> f16219c = new ArrayList();

    public final List<String> a() {
        ArrayList arrayList = new ArrayList();
        for (l<String> a10 : this.f16218b) {
            String str = (String) ti0.f16763j.f16769f.a(a10);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        uk.b(arrayList2, b.e("gad:dynamite_module:experiment_id", ""));
        uk.b(arrayList2, u0.f16827a);
        uk.b(arrayList2, u0.f16828b);
        uk.b(arrayList2, u0.f16829c);
        uk.b(arrayList2, u0.f16830d);
        uk.b(arrayList2, u0.f16831e);
        uk.b(arrayList2, u0.f16837k);
        uk.b(arrayList2, u0.f16832f);
        uk.b(arrayList2, u0.f16833g);
        uk.b(arrayList2, u0.f16834h);
        uk.b(arrayList2, u0.f16835i);
        uk.b(arrayList2, u0.f16836j);
        arrayList.addAll(arrayList2);
        return arrayList;
    }
}
