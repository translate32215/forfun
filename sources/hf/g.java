package hf;

import android.content.Context;
import android.content.Loader;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class g extends l implements td.l<Loader<?>, Context> {

    /* renamed from: b  reason: collision with root package name */
    public static final g f19007b = new g();

    public g() {
        super(1);
    }

    public Object c(Object obj) {
        Loader loader = (Loader) obj;
        k.g(loader, "it");
        Context context = loader.getContext();
        k.b(context, "it.context");
        return context;
    }
}
