package v9;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* compiled from: IndicatorViewController */
public class n extends View.AccessibilityDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f26671a;

    public n(m mVar) {
        this.f26671a = mVar;
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.f26671a.f26646b.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
