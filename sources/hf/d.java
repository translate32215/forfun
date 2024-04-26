package hf;

import android.app.Activity;
import android.app.Fragment;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class d extends l implements td.l<Fragment, Activity> {

    /* renamed from: b  reason: collision with root package name */
    public static final d f18995b = new d();

    public d() {
        super(1);
    }

    public Object c(Object obj) {
        Fragment fragment = (Fragment) obj;
        k.g(fragment, "it");
        Activity activity = fragment.getActivity();
        k.b(activity, "it.activity");
        return activity;
    }
}
