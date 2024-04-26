package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.startapp.startappsdk.R;

/* compiled from: ListRowView */
public final class f0 extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public HorizontalGridView f2392a;

    public f0(Context context) {
        super(context, (AttributeSet) null, 0);
        LayoutInflater.from(context).inflate(R.layout.lb_list_row, this);
        HorizontalGridView horizontalGridView = (HorizontalGridView) findViewById(R.id.row_content);
        this.f2392a = horizontalGridView;
        horizontalGridView.setHasFixedSize(false);
        setOrientation(1);
        setDescendantFocusability(262144);
    }

    public HorizontalGridView getGridView() {
        return this.f2392a;
    }
}
