package hf;

import android.app.Activity;
import android.app.Dialog;
import android.app.Fragment;
import android.content.AbstractThreadedSyncAdapter;
import android.content.Context;
import android.content.Loader;
import android.view.View;
import gf.f;
import gf.l;
import jf.t;
import kd.o;
import ud.k;

/* compiled from: module.kt */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final l.g f19014a = new l.g("⁣androidCoreContextTranslators", false, (String) null, a.f19015b, 6);

    /* compiled from: module.kt */
    public static final class a extends ud.l implements td.l<l.b, o> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f19015b = new a();

        public a() {
            super(1);
        }

        public Object c(Object obj) {
            l.b bVar = (l.b) obj;
            k.g(bVar, "$receiver");
            bVar.g(new t(new f(Fragment.class), new f(Activity.class), d.f18995b));
            bVar.g(new t(new f(Dialog.class), new f(Context.class), e.f18999b));
            bVar.g(new t(new f(View.class), new f(Context.class), f.f19003b));
            bVar.g(new t(new f(Loader.class), new f(Context.class), g.f19007b));
            bVar.g(new t(new f(AbstractThreadedSyncAdapter.class), new f(Context.class), h.f19011b));
            return o.f20627a;
        }
    }
}
