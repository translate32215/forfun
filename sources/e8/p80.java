package e8;

import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class p80 implements n90 {

    /* renamed from: b  reason: collision with root package name */
    public static final a90 f15877b = new s80();

    /* renamed from: a  reason: collision with root package name */
    public final a90 f15878a;

    public p80() {
        a90 a90;
        a90[] a90Arr = new a90[2];
        a90Arr[0] = u70.f16854a;
        try {
            a90 = (a90) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            a90 = f15877b;
        }
        a90Arr[1] = a90;
        r80 r80 = new r80(a90Arr);
        Charset charset = v70.f17029a;
        this.f15878a = r80;
    }
}
