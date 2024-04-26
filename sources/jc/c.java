package jc;

import dev.pankaj.yacinetv.ui.livetv.LiveTvFragment;
import dev.pankaj.ytvlib.data.model.Category;
import kd.o;
import kotlin.reflect.KProperty;
import td.a;
import ud.l;

/* compiled from: LiveTvFragment.kt */
public final class c extends l implements a<o> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LiveTvFragment f19740b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(LiveTvFragment liveTvFragment) {
        super(0);
        this.f19740b = liveTvFragment;
    }

    public Object d() {
        LiveTvFragment liveTvFragment = this.f19740b;
        KProperty<Object>[] kPropertyArr = LiveTvFragment.f13391z0;
        gd.a w02 = liveTvFragment.w0();
        Category category = this.f19740b.v0().f19741a;
        w02.f(category != null ? Long.valueOf(category.getId()) : null);
        return o.f20627a;
    }
}
