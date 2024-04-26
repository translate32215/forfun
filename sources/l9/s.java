package l9;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: ToolbarUtils */
public class s {

    /* renamed from: a  reason: collision with root package name */
    public static final Comparator<View> f21175a = new a();

    /* compiled from: ToolbarUtils */
    public class a implements Comparator<View> {
        public int compare(Object obj, Object obj2) {
            return ((View) obj).getTop() - ((View) obj2).getTop();
        }
    }

    public static List<TextView> a(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < toolbar.getChildCount(); i10++) {
            View childAt = toolbar.getChildAt(i10);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }
}
