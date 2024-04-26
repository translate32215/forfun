package ic;

import androidx.recyclerview.widget.RecyclerView;
import dev.pankaj.ytvclib.data.model.Event;
import kd.o;
import td.l;
import zb.k;

/* compiled from: EventViewHolder.kt */
public final class c extends RecyclerView.a0 {

    /* renamed from: u  reason: collision with root package name */
    public final k f19356u;

    /* renamed from: v  reason: collision with root package name */
    public final l<Event, o> f19357v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(k kVar, l<? super Event, o> lVar) {
        super(kVar.f28812a);
        ud.k.f(lVar, "onItemClick");
        this.f19356u = kVar;
        this.f19357v = lVar;
    }
}
