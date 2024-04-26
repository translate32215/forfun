package ad;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.k;

/* compiled from: AdUtil.kt */
public final class d implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f267a;

    public d(ViewGroup viewGroup) {
        this.f267a = viewGroup;
    }

    public void a(View view) {
        this.f267a.addView(view);
        k.c(this.f267a);
    }
}
