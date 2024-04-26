package k8;

import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class e7 implements y7 {

    /* renamed from: b  reason: collision with root package name */
    public static final l7 f20187b = new c7();

    /* renamed from: a  reason: collision with root package name */
    public final l7 f20188a;

    public e7() {
        l7 l7Var;
        l7[] l7VarArr = new l7[2];
        l7VarArr[0] = g6.f20220a;
        try {
            l7Var = (l7) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            l7Var = f20187b;
        }
        l7VarArr[1] = l7Var;
        d7 d7Var = new d7(l7VarArr);
        Charset charset = r6.f20450a;
        this.f20188a = d7Var;
    }
}
