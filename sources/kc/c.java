package kc;

import android.view.View;
import dev.pankaj.ytvlib.data.model.Category;
import kc.b;
import ud.k;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b.C0176b f20598a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Category f20599b;

    public /* synthetic */ c(b.C0176b bVar, Category category) {
        this.f20598a = bVar;
        this.f20599b = category;
    }

    public final void onClick(View view) {
        b.C0176b bVar = this.f20598a;
        Category category = this.f20599b;
        k.f(bVar, "this$0");
        k.f(category, "$category");
        bVar.f20597v.c(category);
    }
}
