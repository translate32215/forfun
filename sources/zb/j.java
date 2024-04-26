package zb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.card.MaterialCardView;
import com.startapp.startappsdk.R;
import e2.a;

/* compiled from: ListChannelBinding */
public final class j implements a {

    /* renamed from: a  reason: collision with root package name */
    public final MaterialCardView f28809a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatImageView f28810b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatTextView f28811c;

    public j(MaterialCardView materialCardView, MaterialCardView materialCardView2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView) {
        this.f28809a = materialCardView;
        this.f28810b = appCompatImageView;
        this.f28811c = appCompatTextView;
    }

    public static j b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.list_channel, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        MaterialCardView materialCardView = (MaterialCardView) inflate;
        int i10 = R.id.logo;
        AppCompatImageView appCompatImageView = (AppCompatImageView) b8.a.d(inflate, R.id.logo);
        if (appCompatImageView != null) {
            i10 = R.id.title;
            AppCompatTextView appCompatTextView = (AppCompatTextView) b8.a.d(inflate, R.id.title);
            if (appCompatTextView != null) {
                return new j(materialCardView, materialCardView, appCompatImageView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }

    public View a() {
        return this.f28809a;
    }
}
