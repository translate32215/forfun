package kc;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import dev.pankaj.ytvclib.data.model.Channel;
import ic.b;
import java.util.ArrayList;
import kd.o;
import td.l;
import ud.k;
import zb.j;

/* compiled from: ChannelAdapter.kt */
public final class d extends RecyclerView.e<RecyclerView.a0> {

    /* renamed from: d  reason: collision with root package name */
    public final l<Channel, o> f20600d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<Channel> f20601e = new ArrayList<>();

    /* compiled from: ChannelAdapter.kt */
    public static final class a extends RecyclerView.a0 {

        /* renamed from: w  reason: collision with root package name */
        public static final /* synthetic */ int f20602w = 0;

        /* renamed from: u  reason: collision with root package name */
        public final j f20603u;

        /* renamed from: v  reason: collision with root package name */
        public final l<Channel, o> f20604v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(j jVar, l<? super Channel, o> lVar) {
            super(jVar.f28809a);
            k.f(lVar, "onItemClick");
            this.f20603u = jVar;
            this.f20604v = lVar;
        }
    }

    public d(l<? super Channel, o> lVar) {
        this.f20600d = lVar;
    }

    public int b() {
        return this.f20601e.size();
    }

    public void e(RecyclerView.a0 a0Var, int i10) {
        k.f(a0Var, "holder");
        if (a0Var instanceof a) {
            a aVar = (a) a0Var;
            Channel channel = this.f20601e.get(i10);
            k.e(channel, "items[position]");
            Channel channel2 = channel;
            k.f(channel2, "channel");
            aVar.f20603u.f28809a.setOnClickListener(new b(aVar, channel2));
            aVar.f20603u.f28811c.setText(channel2.getName());
            aVar.f20603u.f28811c.setSelected(true);
            aVar.f20603u.f28811c.setSingleLine(true);
            AppCompatImageView appCompatImageView = aVar.f20603u.f28810b;
            k.e(appCompatImageView, "binding.logo");
            b8.a.g(appCompatImageView, channel2.getLogo());
        }
    }

    public RecyclerView.a0 g(ViewGroup viewGroup, int i10) {
        k.f(viewGroup, "parent");
        return new a(j.b(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), this.f20600d);
    }
}
