package t3;

import android.os.Build;

/* compiled from: DownsampleStrategy */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f25629a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final k f25630b = new a();

    /* renamed from: c  reason: collision with root package name */
    public static final k f25631c;

    /* renamed from: d  reason: collision with root package name */
    public static final k f25632d = new d();

    /* renamed from: e  reason: collision with root package name */
    public static final k f25633e;

    /* renamed from: f  reason: collision with root package name */
    public static final k3.d<k> f25634f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f25635g = (Build.VERSION.SDK_INT >= 19);

    /* compiled from: DownsampleStrategy */
    public static class a extends k {
        public int a(int i10, int i11, int i12, int i13) {
            return (b(i10, i11, i12, i13) != 1.0f && !k.f25635g) ? 1 : 2;
        }

        public float b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, k.f25629a.b(i10, i11, i12, i13));
        }
    }

    /* compiled from: DownsampleStrategy */
    public static class b extends k {
        public int a(int i10, int i11, int i12, int i13) {
            return 2;
        }

        public float b(int i10, int i11, int i12, int i13) {
            return Math.max(((float) i12) / ((float) i10), ((float) i13) / ((float) i11));
        }
    }

    /* compiled from: DownsampleStrategy */
    public static class c extends k {
        public int a(int i10, int i11, int i12, int i13) {
            return k.f25635g ? 2 : 1;
        }

        public float b(int i10, int i11, int i12, int i13) {
            if (k.f25635g) {
                return Math.min(((float) i12) / ((float) i10), ((float) i13) / ((float) i11));
            }
            int max = Math.max(i11 / i13, i10 / i12);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
    }

    /* compiled from: DownsampleStrategy */
    public static class d extends k {
        public int a(int i10, int i11, int i12, int i13) {
            return 2;
        }

        public float b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    static {
        b bVar = new b();
        f25631c = bVar;
        f25633e = bVar;
        f25634f = k3.d.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", bVar);
    }

    public abstract int a(int i10, int i11, int i12, int i13);

    public abstract float b(int i10, int i11, int i12, int i13);
}
