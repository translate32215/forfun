package k8;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public abstract class m5 implements Iterator {
    public abstract byte a();

    public final /* bridge */ /* synthetic */ Object next() {
        return Byte.valueOf(a());
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
