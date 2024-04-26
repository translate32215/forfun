package b2;

import android.os.IBinder;

/* compiled from: WindowIdApi14 */
public class i0 implements k0 {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f3401a;

    public i0(IBinder iBinder) {
        this.f3401a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof i0) && ((i0) obj).f3401a.equals(this.f3401a);
    }

    public int hashCode() {
        return this.f3401a.hashCode();
    }
}
