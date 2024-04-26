package r6;

import java.util.Comparator;
import v6.w;
import x4.b0;

public final /* synthetic */ class b implements Comparator {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ b f24562b = new b(0);

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ b f24563c = new b(1);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24564a;

    public /* synthetic */ b(int i10) {
        this.f24564a = i10;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f24564a) {
            case 0:
                return ((b0) obj2).f27404h - ((b0) obj).f27404h;
            default:
                Comparator<w.b> comparator = w.f26521h;
                return ((w.b) obj).f26530a - ((w.b) obj2).f26530a;
        }
    }
}
