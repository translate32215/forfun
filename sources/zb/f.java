package zb;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import e2.a;

/* compiled from: FragmentEventBinding */
public final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f28797a;

    /* renamed from: b  reason: collision with root package name */
    public final RelativeLayout f28798b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f28799c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f28800d;

    public f(ConstraintLayout constraintLayout, RelativeLayout relativeLayout, RecyclerView recyclerView, TextView textView) {
        this.f28797a = constraintLayout;
        this.f28798b = relativeLayout;
        this.f28799c = recyclerView;
        this.f28800d = textView;
    }

    public View a() {
        return this.f28797a;
    }
}
