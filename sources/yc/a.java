package yc;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.d;
import androidx.recyclerview.widget.RecyclerView;
import com.startapp.startappsdk.R;
import dev.pankaj.ytvclib.data.model.Stream;
import java.util.ArrayList;
import kd.o;
import tc.i;
import td.l;
import ud.k;

/* compiled from: StreamAdapter.kt */
public final class a extends RecyclerView.e<RecyclerView.a0> {

    /* renamed from: d  reason: collision with root package name */
    public final l<Stream, o> f28171d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<Stream> f28172e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public int f28173f;

    /* renamed from: yc.a$a  reason: collision with other inner class name */
    /* compiled from: StreamAdapter.kt */
    public static final class C0286a extends RecyclerView.a0 {

        /* renamed from: v  reason: collision with root package name */
        public static final /* synthetic */ int f28174v = 0;

        /* renamed from: u  reason: collision with root package name */
        public final i f28175u;

        public C0286a(i iVar) {
            super(iVar.f1452d);
            this.f28175u = iVar;
        }
    }

    /* compiled from: StreamAdapter.kt */
    public static final class b extends ud.l implements td.a<o> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a f28176b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f28177c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar, int i10) {
            super(0);
            this.f28176b = aVar;
            this.f28177c = i10;
        }

        public Object d() {
            a aVar = this.f28176b;
            int i10 = this.f28177c;
            aVar.f28173f = i10;
            l<Stream, o> lVar = aVar.f28171d;
            Stream stream = aVar.f28172e.get(i10);
            k.e(stream, "items[selectedItem]");
            lVar.c(stream);
            this.f28176b.f2863a.b();
            return o.f20627a;
        }
    }

    public a(l<? super Stream, o> lVar) {
        this.f28171d = lVar;
    }

    public int b() {
        return this.f28172e.size();
    }

    public void e(RecyclerView.a0 a0Var, @SuppressLint({"RecyclerView"}) int i10) {
        k.f(a0Var, "holder");
        if (a0Var instanceof C0286a) {
            C0286a aVar = (C0286a) a0Var;
            Stream stream = this.f28172e.get(i10);
            k.e(stream, "items[position]");
            Stream stream2 = stream;
            boolean z10 = this.f28173f == i10;
            b bVar = new b(this, i10);
            k.f(stream2, "stream");
            k.f(bVar, "onItemClick");
            aVar.f28175u.f1452d.setSelected(z10);
            aVar.f28175u.f1452d.setOnClickListener(new ec.a((td.a) bVar));
            aVar.f28175u.f25905w.setText(stream2.getName());
        }
    }

    public RecyclerView.a0 g(ViewGroup viewGroup, int i10) {
        k.f(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        int i11 = i.f25904x;
        androidx.databinding.b bVar = d.f1462a;
        i iVar = (i) d.a(ViewDataBinding.b((Object) null), from.inflate(R.layout.list_stream, viewGroup, false), R.layout.list_stream);
        k.e(iVar, "inflate(LayoutInflater.f….context), parent, false)");
        return new C0286a(iVar);
    }

    public final void l() {
        if (!this.f28172e.isEmpty()) {
            int i10 = this.f28173f < b() + -1 ? this.f28173f + 1 : 0;
            this.f28173f = i10;
            l<Stream, o> lVar = this.f28171d;
            Stream stream = this.f28172e.get(i10);
            k.e(stream, "items[selectedItem]");
            lVar.c(stream);
            this.f2863a.b();
        }
    }
}
