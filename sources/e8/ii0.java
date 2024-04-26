package e8;

import java.util.Comparator;
import java.util.List;
import y6.l;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final /* synthetic */ class ii0 implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static final Comparator f15052a = new ii0();

    public final int compare(Object obj, Object obj2) {
        List<String> list = l.f28127b;
        return list.indexOf((String) obj) - list.indexOf((String) obj2);
    }
}
