package androidx.leanback.widget;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.leanback.widget.r0;
import com.startapp.startappsdk.R;

/* compiled from: DividerPresenter */
public class i extends r0 {
    public void c(r0.a aVar, Object obj) {
    }

    public r0.a d(ViewGroup viewGroup) {
        return new r0.a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lb_divider, viewGroup, false));
    }

    public void e(r0.a aVar) {
    }
}
