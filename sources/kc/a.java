package kc;

import android.view.View;
import dev.pankaj.ytvlib.data.model.Category;
import kc.b;
import ud.k;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b.a f20589a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Category f20590b;

    public /* synthetic */ a(b.a aVar, Category category) {
        this.f20589a = aVar;
        this.f20590b = category;
    }

    public final void onClick(View view) {
        b.a aVar = this.f20589a;
        Category category = this.f20590b;
        k.f(aVar, "this$0");
        k.f(category, "$category");
        aVar.f20595v.c(category);
    }
}
