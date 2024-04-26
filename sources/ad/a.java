package ad;

import android.view.ViewGroup;
import androidx.activity.k;
import com.adcolony.sdk.b;
import t2.f;

/* compiled from: AdUtil.kt */
public final class a extends f {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f265d;

    public a(ViewGroup viewGroup) {
        this.f265d = viewGroup;
    }

    public void a(b bVar) {
        this.f265d.addView(bVar);
        k.c(this.f265d);
    }
}
