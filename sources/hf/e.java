package hf;

import android.app.Dialog;
import android.content.Context;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class e extends l implements td.l<Dialog, Context> {

    /* renamed from: b  reason: collision with root package name */
    public static final e f18999b = new e();

    public e() {
        super(1);
    }

    public Object c(Object obj) {
        Dialog dialog = (Dialog) obj;
        k.g(dialog, "it");
        Context context = dialog.getContext();
        k.b(context, "it.context");
        return context;
    }
}
