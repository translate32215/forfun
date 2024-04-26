package dc;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.leanback.widget.r0;
import androidx.leanback.widget.v;
import com.bumptech.glide.b;
import com.bumptech.glide.h;
import com.startapp.startappsdk.R;
import d0.a;
import dev.pankaj.ytvlib.data.model.Category;
import ud.k;

/* compiled from: CardPresenterCategoryGrid.kt */
public final class c extends r0 {
    public void c(r0.a aVar, Object obj) {
        k.f(aVar, "viewHolder");
        k.f(obj, "item");
        Category category = (Category) obj;
        View view = aVar.f2509a;
        if (view != null) {
            v vVar = (v) view;
            vVar.setTitleText(category.getName());
            vVar.setContentText(aVar.f2509a.getContext().getString(R.string.category));
            vVar.e(e.k.b(140), e.k.b(80));
            ((h) ((h) b.d(aVar.f2509a.getContext()).j(category.getLogo()).j(R.mipmap.ic_launcher_round)).e(R.mipmap.ic_launcher_round)).z(vVar.getMainImageView());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.leanback.widget.ImageCardView");
    }

    public r0.a d(ViewGroup viewGroup) {
        k.f(viewGroup, "parent");
        v vVar = new v(viewGroup.getContext());
        vVar.setBackgroundColor(-1);
        vVar.setInfoAreaBackgroundColor(a.b(viewGroup.getContext(), R.color.primaryColor));
        vVar.setMainImageScaleType(ImageView.ScaleType.CENTER_INSIDE);
        vVar.setFocusable(true);
        vVar.setFocusableInTouchMode(true);
        return new r0.a(vVar);
    }

    public void e(r0.a aVar) {
        k.f(aVar, "viewHolder");
        View view = aVar.f2509a;
        if (view != null) {
            v vVar = (v) view;
            vVar.setBadgeImage((Drawable) null);
            vVar.setMainImage((Drawable) null);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.leanback.widget.ImageCardView");
    }
}
