package q6;

import java.util.Comparator;
import q6.e;

public final /* synthetic */ class f implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ f f24207a = new f();

    public final int compare(Object obj, Object obj2) {
        int i10 = ((e.b) obj).f24188a.f24191b;
        int i11 = ((e.b) obj2).f24188a.f24191b;
        if (i10 == i11) {
            return 0;
        }
        return i10 < i11 ? -1 : 1;
    }
}
