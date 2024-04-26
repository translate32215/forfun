package kc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.startapp.startappsdk.R;
import dev.pankaj.ytvlib.data.model.Category;
import java.util.ArrayList;
import kd.o;
import td.l;
import ud.k;
import zb.i;
import zb.j;

/* compiled from: CategoryAdapter.kt */
public final class b extends RecyclerView.e<RecyclerView.a0> {

    /* renamed from: d  reason: collision with root package name */
    public final l<Category, o> f20591d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<Category> f20592e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public int f20593f;

    /* compiled from: CategoryAdapter.kt */
    public static final class a extends RecyclerView.a0 {

        /* renamed from: u  reason: collision with root package name */
        public final i f20594u;

        /* renamed from: v  reason: collision with root package name */
        public final l<Category, o> f20595v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(i iVar, l<? super Category, o> lVar) {
            super(iVar.f28807a);
            k.f(lVar, "onItemClick");
            this.f20594u = iVar;
            this.f20595v = lVar;
        }
    }

    /* renamed from: kc.b$b  reason: collision with other inner class name */
    /* compiled from: CategoryAdapter.kt */
    public static final class C0176b extends RecyclerView.a0 {

        /* renamed from: u  reason: collision with root package name */
        public final j f20596u;

        /* renamed from: v  reason: collision with root package name */
        public final l<Category, o> f20597v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0176b(j jVar, l<? super Category, o> lVar) {
            super(jVar.f28809a);
            k.f(lVar, "onItemClick");
            this.f20596u = jVar;
            this.f20597v = lVar;
        }
    }

    public b(l<? super Category, o> lVar) {
        this.f20591d = lVar;
    }

    public int b() {
        return this.f20592e.size();
    }

    public void e(RecyclerView.a0 a0Var, int i10) {
        k.f(a0Var, "holder");
        if (a0Var instanceof a) {
            a aVar = (a) a0Var;
            Category category = this.f20592e.get(i10);
            k.e(category, "items[position]");
            Category category2 = category;
            k.f(category2, "category");
            aVar.f20594u.f28807a.setOnClickListener(new a(aVar, category2));
            aVar.f20594u.f28808b.setText(category2.getName());
            aVar.f20594u.f28808b.setSelected(true);
            aVar.f20594u.f28808b.setSingleLine(true);
        } else if (a0Var instanceof C0176b) {
            C0176b bVar = (C0176b) a0Var;
            Category category3 = this.f20592e.get(i10);
            k.e(category3, "items[position]");
            Category category4 = category3;
            k.f(category4, "category");
            bVar.f20596u.f28809a.setOnClickListener(new c(bVar, category4));
            bVar.f20596u.f28811c.setText(category4.getName());
            bVar.f20596u.f28811c.setSelected(true);
            bVar.f20596u.f28811c.setSingleLine(true);
            AppCompatImageView appCompatImageView = bVar.f20596u.f28810b;
            k.e(appCompatImageView, "binding.logo");
            b8.a.g(appCompatImageView, category4.getLogo());
        }
    }

    public RecyclerView.a0 g(ViewGroup viewGroup, int i10) {
        k.f(viewGroup, "parent");
        if (this.f20593f == 1) {
            return new C0176b(j.b(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), this.f20591d);
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_category, viewGroup, false);
        int i11 = R.id.logo;
        ShapeableImageView shapeableImageView = (ShapeableImageView) b8.a.d(inflate, R.id.logo);
        if (shapeableImageView != null) {
            i11 = R.id.title;
            TextView textView = (TextView) b8.a.d(inflate, R.id.title);
            if (textView != null) {
                return new a(new i((MaterialCardView) inflate, shapeableImageView, textView), this.f20591d);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }
}
