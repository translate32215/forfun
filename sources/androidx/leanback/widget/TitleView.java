package androidx.leanback.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.leanback.widget.SearchOrbView;
import androidx.leanback.widget.p1;
import com.startapp.startappsdk.R;

public class TitleView extends FrameLayout implements p1.a {

    /* renamed from: a  reason: collision with root package name */
    public ImageView f2276a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f2277b;

    /* renamed from: c  reason: collision with root package name */
    public SearchOrbView f2278c;

    /* renamed from: d  reason: collision with root package name */
    public int f2279d = 6;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2280e = false;

    /* renamed from: f  reason: collision with root package name */
    public final p1 f2281f = new a();

    public class a extends p1 {
        public a() {
        }

        public void a(boolean z10) {
            SearchOrbView searchOrbView = TitleView.this.f2278c;
            searchOrbView.f2244u = z10 && searchOrbView.hasFocus();
            searchOrbView.c();
        }
    }

    public TitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.browseTitleViewStyle);
        View inflate = LayoutInflater.from(context).inflate(R.layout.lb_title_view, this);
        this.f2276a = (ImageView) inflate.findViewById(R.id.title_badge);
        this.f2277b = (TextView) inflate.findViewById(R.id.title_text);
        this.f2278c = (SearchOrbView) inflate.findViewById(R.id.title_orb);
        setClipToPadding(false);
        setClipChildren(false);
    }

    public final void a() {
        if (this.f2276a.getDrawable() != null) {
            this.f2276a.setVisibility(0);
            this.f2277b.setVisibility(8);
            return;
        }
        this.f2276a.setVisibility(8);
        this.f2277b.setVisibility(0);
    }

    public Drawable getBadgeDrawable() {
        return this.f2276a.getDrawable();
    }

    public SearchOrbView.c getSearchAffordanceColors() {
        return this.f2278c.getOrbColors();
    }

    public View getSearchAffordanceView() {
        return this.f2278c;
    }

    public CharSequence getTitle() {
        return this.f2277b.getText();
    }

    public p1 getTitleViewAdapter() {
        return this.f2281f;
    }

    public void setBadgeDrawable(Drawable drawable) {
        this.f2276a.setImageDrawable(drawable);
        a();
    }

    public void setOnSearchClickedListener(View.OnClickListener onClickListener) {
        int i10 = 0;
        this.f2280e = onClickListener != null;
        this.f2278c.setOnOrbClickedListener(onClickListener);
        if (!this.f2280e || (this.f2279d & 4) != 4) {
            i10 = 4;
        }
        this.f2278c.setVisibility(i10);
    }

    public void setSearchAffordanceColors(SearchOrbView.c cVar) {
        this.f2278c.setOrbColors(cVar);
    }

    public void setTitle(CharSequence charSequence) {
        this.f2277b.setText(charSequence);
        a();
    }
}
