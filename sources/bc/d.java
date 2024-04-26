package bc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.fragment.app.p;
import ud.k;

/* compiled from: SpinnerFragment.kt */
public final class d extends p {
    public View P(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.f(layoutInflater, "inflater");
        k.c(viewGroup);
        ProgressBar progressBar = new ProgressBar(viewGroup.getContext());
        if (viewGroup instanceof FrameLayout) {
            progressBar.setLayoutParams(new FrameLayout.LayoutParams(100, 100, 17));
        }
        return progressBar;
    }
}
