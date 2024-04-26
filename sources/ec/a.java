package ec;

import ad.i;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.v;
import d0.a;
import dev.pankaj.yacinetv.tvui.main.MainFragment;
import dev.pankaj.yacinetv.tvui.search.SearchActivity;
import kotlin.reflect.KProperty;
import ud.k;
import yc.a;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17833a = 2;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f17834b;

    public /* synthetic */ a(i iVar) {
        this.f17834b = iVar;
    }

    public /* synthetic */ a(MainFragment mainFragment) {
        this.f17834b = mainFragment;
    }

    public /* synthetic */ a(td.a aVar) {
        this.f17834b = aVar;
    }

    public final void onClick(View view) {
        switch (this.f17833a) {
            case 0:
                MainFragment mainFragment = (MainFragment) this.f17834b;
                KProperty<Object>[] kPropertyArr = MainFragment.F1;
                k.f(mainFragment, "this$0");
                Intent intent = new Intent(mainFragment.h0(), SearchActivity.class);
                v<?> vVar = mainFragment.C;
                if (vVar != null) {
                    Context context = vVar.f1874b;
                    Object obj = d0.a.f12940a;
                    a.C0126a.b(context, intent, (Bundle) null);
                    return;
                }
                throw new IllegalStateException("Fragment " + mainFragment + " not attached to Activity");
            case 1:
                td.a aVar = (td.a) this.f17834b;
                int i10 = a.C0286a.f28174v;
                k.f(aVar, "$onItemClick");
                aVar.d();
                return;
            default:
                i iVar = (i) this.f17834b;
                iVar.G0.onClick(iVar.f1775y0, -1);
                iVar.s0(false, false, false);
                return;
        }
    }
}
