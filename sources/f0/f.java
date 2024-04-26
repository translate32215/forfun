package f0;

import java.util.List;

/* compiled from: GradientColorInflaterCompat */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f18044a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f18045b;

    public f(List<Integer> list, List<Float> list2) {
        int size = list.size();
        this.f18044a = new int[size];
        this.f18045b = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            this.f18044a[i10] = list.get(i10).intValue();
            this.f18045b[i10] = list2.get(i10).floatValue();
        }
    }

    public f(int i10, int i11) {
        this.f18044a = new int[]{i10, i11};
        this.f18045b = new float[]{0.0f, 1.0f};
    }

    public f(int i10, int i11, int i12) {
        this.f18044a = new int[]{i10, i11, i12};
        this.f18045b = new float[]{0.0f, 0.5f, 1.0f};
    }
}
