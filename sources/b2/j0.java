package b2;

import android.view.View;
import android.view.WindowId;

/* compiled from: WindowIdApi18 */
public class j0 implements k0 {

    /* renamed from: a  reason: collision with root package name */
    public final WindowId f3425a;

    public j0(View view) {
        this.f3425a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof j0) && ((j0) obj).f3425a.equals(this.f3425a);
    }

    public int hashCode() {
        return this.f3425a.hashCode();
    }
}
