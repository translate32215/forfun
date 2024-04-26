package n7;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class n implements x {

    /* renamed from: b  reason: collision with root package name */
    public static final Uri f22375b;

    /* renamed from: a  reason: collision with root package name */
    public final LogPrinter f22376a = new LogPrinter(4, "GA/LogCatTransport");

    static {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("local");
        f22375b = builder.build();
    }

    public final void a(o oVar) {
        ArrayList arrayList = new ArrayList(oVar.f22386j.values());
        Collections.sort(arrayList, new m(0));
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String obj = ((q) arrayList.get(i10)).toString();
            if (!TextUtils.isEmpty(obj)) {
                if (sb2.length() != 0) {
                    sb2.append(", ");
                }
                sb2.append(obj);
            }
        }
        this.f22376a.println(sb2.toString());
    }

    public final Uri d() {
        return f22375b;
    }
}
