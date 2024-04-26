package s9;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AdjustedCornerSize */
public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final c f25077a;

    /* renamed from: b  reason: collision with root package name */
    public final float f25078b;

    public b(float f10, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f25077a;
            f10 += ((b) cVar).f25078b;
        }
        this.f25077a = cVar;
        this.f25078b = f10;
    }

    public float a(RectF rectF) {
        return Math.max(0.0f, this.f25077a.a(rectF) + this.f25078b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f25077a.equals(bVar.f25077a) || this.f25078b != bVar.f25078b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f25077a, Float.valueOf(this.f25078b)});
    }
}
