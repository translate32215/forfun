package zb;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import e2.a;

/* compiled from: FragmentChannelBinding */
public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f28789a;

    /* renamed from: b  reason: collision with root package name */
    public final RelativeLayout f28790b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f28791c;

    public d(ConstraintLayout constraintLayout, RelativeLayout relativeLayout, RecyclerView recyclerView) {
        this.f28789a = constraintLayout;
        this.f28790b = relativeLayout;
        this.f28791c = recyclerView;
    }

    public View a() {
        return this.f28789a;
    }
}
