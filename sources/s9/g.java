package s9;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: RelativeCornerSize */
public final class g implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f25120a;

    public g(float f10) {
        this.f25120a = f10;
    }

    public float a(RectF rectF) {
        return rectF.height() * this.f25120a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && this.f25120a == ((g) obj).f25120a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f25120a)});
    }
}
