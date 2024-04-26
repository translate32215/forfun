package r6;

import java.util.Comparator;
import v6.w;

public final /* synthetic */ class e implements Comparator {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ e f24572b = new e(0);

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ e f24573c = new e(1);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24574a;

    public /* synthetic */ e(int i10) {
        this.f24574a = i10;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f24574a) {
            case 0:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                int[] iArr = f.f24575f;
                if (num.intValue() == -1) {
                    if (num2.intValue() == -1) {
                        return 0;
                    }
                    return -1;
                } else if (num2.intValue() == -1) {
                    return 1;
                } else {
                    return num.intValue() - num2.intValue();
                }
            default:
                Comparator<w.b> comparator = w.f26521h;
                return Float.compare(((w.b) obj).f26532c, ((w.b) obj2).f26532c);
        }
    }
}
