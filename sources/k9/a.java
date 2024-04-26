package k9;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;
import com.google.android.material.floatingactionbutton.d;

/* compiled from: FloatingActionButtonImpl */
public class a implements TypeEvaluator<Float> {

    /* renamed from: a  reason: collision with root package name */
    public FloatEvaluator f20571a = new FloatEvaluator();

    public a(d dVar) {
    }

    public Object evaluate(float f10, Object obj, Object obj2) {
        float floatValue = this.f20571a.evaluate(f10, (Float) obj, (Float) obj2).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
