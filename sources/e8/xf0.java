package e8;

import o.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class xf0 {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f17486a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f17487b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f17488c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static int a(cg0 cg0) {
        int a10 = cg0.a(4);
        if (a10 == 15) {
            return cg0.a(24);
        }
        a.a(a10 < 13);
        return f17487b[a10];
    }
}
