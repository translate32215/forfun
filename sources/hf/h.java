package hf;

import android.content.AbstractThreadedSyncAdapter;
import android.content.Context;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class h extends l implements td.l<AbstractThreadedSyncAdapter, Context> {

    /* renamed from: b  reason: collision with root package name */
    public static final h f19011b = new h();

    public h() {
        super(1);
    }

    public Object c(Object obj) {
        AbstractThreadedSyncAdapter abstractThreadedSyncAdapter = (AbstractThreadedSyncAdapter) obj;
        k.g(abstractThreadedSyncAdapter, "it");
        Context context = abstractThreadedSyncAdapter.getContext();
        k.b(context, "it.context");
        return context;
    }
}
