package hf;

import android.content.Context;
import android.view.View;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class f extends l implements td.l<View, Context> {

    /* renamed from: b  reason: collision with root package name */
    public static final f f19003b = new f();

    public f() {
        super(1);
    }

    public Object c(Object obj) {
        View view = (View) obj;
        k.g(view, "it");
        Context context = view.getContext();
        k.b(context, "it.context");
        return context;
    }
}
