package u8;

import android.util.Property;
import android.view.ViewGroup;
import com.startapp.startappsdk.R;

/* compiled from: ChildrenAlphaProperty */
public class c extends Property<ViewGroup, Float> {

    /* renamed from: a  reason: collision with root package name */
    public static final Property<ViewGroup, Float> f26154a = new c("childrenAlpha");

    public c(String str) {
        super(Float.class, str);
    }

    public Object get(Object obj) {
        Float f10 = (Float) ((ViewGroup) obj).getTag(R.id.mtrl_internal_children_alpha_tag);
        return f10 != null ? f10 : Float.valueOf(1.0f);
    }

    public void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        float floatValue = ((Float) obj2).floatValue();
        viewGroup.setTag(R.id.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            viewGroup.getChildAt(i10).setAlpha(floatValue);
        }
    }
}
