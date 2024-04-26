package s7;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class u extends s {

    /* renamed from: d  reason: collision with root package name */
    public static final WeakReference f25026d = new WeakReference((Object) null);

    /* renamed from: c  reason: collision with root package name */
    public WeakReference f25027c = f25026d;

    public u(byte[] bArr) {
        super(bArr);
    }

    public abstract byte[] E1();

    public final byte[] z0() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f25027c.get();
            if (bArr == null) {
                bArr = E1();
                this.f25027c = new WeakReference(bArr);
            }
        }
        return bArr;
    }
}
