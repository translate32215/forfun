package zb;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import e2.a;

/* compiled from: FragmentSearchBinding */
public final class h implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f28803a;

    /* renamed from: b  reason: collision with root package name */
    public final RelativeLayout f28804b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f28805c;

    /* renamed from: d  reason: collision with root package name */
    public final SearchView f28806d;

    public h(ConstraintLayout constraintLayout, RelativeLayout relativeLayout, MaterialCardView materialCardView, RecyclerView recyclerView, SearchView searchView) {
        this.f28803a = constraintLayout;
        this.f28804b = relativeLayout;
        this.f28805c = recyclerView;
        this.f28806d = searchView;
    }

    public View a() {
        return this.f28803a;
    }
}
