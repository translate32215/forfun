package e6;

import java.util.List;

/* compiled from: DefaultHlsExtractorFactory */
public final class c implements f {

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f13615b = {8, 13, 11, 2, 0, 1, 7};

    public static void a(int i10, List<Integer> list) {
        int[] iArr = f13615b;
        int length = iArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            } else if (iArr[i11] == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 != -1 && !list.contains(Integer.valueOf(i10))) {
            list.add(Integer.valueOf(i10));
        }
    }
}
