package u8;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* compiled from: ImageMatrixProperty */
public class e extends Property<ImageView, Matrix> {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f26157a = new Matrix();

    public e() {
        super(Matrix.class, "imageMatrixProperty");
    }

    public Object get(Object obj) {
        this.f26157a.set(((ImageView) obj).getImageMatrix());
        return this.f26157a;
    }

    public void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }
}
