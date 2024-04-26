package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.TextView;
import com.startapp.startappsdk.R;
import s0.i;

public final class RowHeaderView extends TextView {
    public RowHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.rowHeaderStyle);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.j(this, callback));
    }
}
