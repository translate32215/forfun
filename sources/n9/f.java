package n9;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.g1;
import com.startapp.startappsdk.R;
import j.g;
import java.util.WeakHashMap;
import l9.r;
import o0.c0;
import s9.i;

/* compiled from: NavigationBarView */
public abstract class f extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final c f22461a;

    /* renamed from: b  reason: collision with root package name */
    public final d f22462b;

    /* renamed from: c  reason: collision with root package name */
    public final e f22463c;

    /* renamed from: d  reason: collision with root package name */
    public ColorStateList f22464d;

    /* renamed from: e  reason: collision with root package name */
    public MenuInflater f22465e;

    /* renamed from: f  reason: collision with root package name */
    public c f22466f;

    /* renamed from: g  reason: collision with root package name */
    public b f22467g;

    /* compiled from: NavigationBarView */
    public class a implements e.a {
        public a() {
        }

        public boolean a(e eVar, MenuItem menuItem) {
            if (f.this.f22467g == null || menuItem.getItemId() != f.this.getSelectedItemId()) {
                c cVar = f.this.f22466f;
                if (cVar == null || ((r1.c) cVar).j(menuItem)) {
                    return false;
                }
                return true;
            }
            f.this.f22467g.a(menuItem);
            return true;
        }

        public void b(e eVar) {
        }
    }

    /* compiled from: NavigationBarView */
    public interface b {
        void a(MenuItem menuItem);
    }

    /* compiled from: NavigationBarView */
    public interface c {
    }

    /* compiled from: NavigationBarView */
    public static class d extends u0.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public Bundle f22469c;

        /* compiled from: NavigationBarView */
        public class a implements Parcelable.ClassLoaderCreator<d> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            public Object[] newArray(int i10) {
                return new d[i10];
            }

            public Object createFromParcel(Parcel parcel) {
                return new d(parcel, (ClassLoader) null);
            }
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f25915a, i10);
            parcel.writeBundle(this.f22469c);
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f22469c = parcel.readBundle(classLoader == null ? d.class.getClassLoader() : classLoader);
        }
    }

    public f(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(w9.a.a(context, attributeSet, i10, i11), attributeSet, i10);
        e eVar = new e();
        this.f22463c = eVar;
        Context context2 = getContext();
        g1 e10 = r.e(context2, attributeSet, t8.a.B, i10, i11, 10, 9);
        c cVar = new c(context2, getClass(), getMaxItemCount());
        this.f22461a = cVar;
        y8.b bVar = new y8.b(context2);
        this.f22462b = bVar;
        eVar.f22456a = bVar;
        eVar.f22458c = 1;
        bVar.setPresenter(eVar);
        cVar.b(eVar, cVar.f537a);
        getContext();
        eVar.f22456a.J = cVar;
        if (e10.p(5)) {
            bVar.setIconTintList(e10.c(5));
        } else {
            bVar.setIconTintList(bVar.c(16842808));
        }
        setItemIconSize(e10.f(4, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (e10.p(10)) {
            setItemTextAppearanceInactive(e10.m(10, 0));
        }
        if (e10.p(9)) {
            setItemTextAppearanceActive(e10.m(9, 0));
        }
        if (e10.p(11)) {
            setItemTextColor(e10.c(11));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            s9.f fVar = new s9.f();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                fVar.r(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            fVar.f25079a.f25099b = new i9.a(context2);
            fVar.z();
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            c0.d.q(this, fVar);
        }
        if (e10.p(7)) {
            setItemPaddingTop(e10.f(7, 0));
        }
        if (e10.p(6)) {
            setItemPaddingBottom(e10.f(6, 0));
        }
        if (e10.p(1)) {
            setElevation((float) e10.f(1, 0));
        }
        androidx.core.graphics.drawable.a.l(getBackground().mutate(), p9.c.b(context2, e10, 0));
        setLabelVisibilityMode(e10.k(12, -1));
        int m10 = e10.m(3, 0);
        if (m10 != 0) {
            bVar.setItemBackgroundRes(m10);
        } else {
            setItemRippleColor(p9.c.b(context2, e10, 8));
        }
        int m11 = e10.m(2, 0);
        if (m11 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(m11, t8.a.A);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(p9.c.a(context2, obtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(i.a(context2, obtainStyledAttributes.getResourceId(4, 0), 0).a());
            obtainStyledAttributes.recycle();
        }
        if (e10.p(13)) {
            int m12 = e10.m(13, 0);
            eVar.f22457b = true;
            getMenuInflater().inflate(m12, cVar);
            eVar.f22457b = false;
            eVar.g(true);
        }
        e10.f924b.recycle();
        addView(bVar);
        cVar.f541e = new a();
    }

    private MenuInflater getMenuInflater() {
        if (this.f22465e == null) {
            this.f22465e = new g(getContext());
        }
        return this.f22465e;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f22462b.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f22462b.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f22462b.getItemActiveIndicatorMarginHorizontal();
    }

    public i getItemActiveIndicatorShapeAppearance() {
        return this.f22462b.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f22462b.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f22462b.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f22462b.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f22462b.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f22462b.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f22462b.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f22462b.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f22464d;
    }

    public int getItemTextAppearanceActive() {
        return this.f22462b.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f22462b.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f22462b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f22462b.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f22461a;
    }

    public j getMenuView() {
        return this.f22462b;
    }

    public e getPresenter() {
        return this.f22463c;
    }

    public int getSelectedItemId() {
        return this.f22462b.getSelectedItemId();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof s9.f) {
            q.d.d(this, (s9.f) background);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.f25915a);
        this.f22461a.v(dVar.f22469c);
    }

    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        dVar.f22469c = bundle;
        this.f22461a.x(bundle);
        return dVar;
    }

    public void setElevation(float f10) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.setElevation(f10);
        }
        q.d.c(this, f10);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f22462b.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f22462b.setItemActiveIndicatorEnabled(z10);
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.f22462b.setItemActiveIndicatorHeight(i10);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.f22462b.setItemActiveIndicatorMarginHorizontal(i10);
    }

    public void setItemActiveIndicatorShapeAppearance(i iVar) {
        this.f22462b.setItemActiveIndicatorShapeAppearance(iVar);
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.f22462b.setItemActiveIndicatorWidth(i10);
    }

    public void setItemBackground(Drawable drawable) {
        this.f22462b.setItemBackground(drawable);
        this.f22464d = null;
    }

    public void setItemBackgroundResource(int i10) {
        this.f22462b.setItemBackgroundRes(i10);
        this.f22464d = null;
    }

    public void setItemIconSize(int i10) {
        this.f22462b.setItemIconSize(i10);
    }

    public void setItemIconSizeRes(int i10) {
        setItemIconSize(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f22462b.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i10) {
        this.f22462b.setItemPaddingBottom(i10);
    }

    public void setItemPaddingTop(int i10) {
        this.f22462b.setItemPaddingTop(i10);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.f22464d != colorStateList) {
            this.f22464d = colorStateList;
            if (colorStateList == null) {
                this.f22462b.setItemBackground((Drawable) null);
                return;
            }
            ColorStateList a10 = q9.b.a(colorStateList);
            if (Build.VERSION.SDK_INT >= 21) {
                this.f22462b.setItemBackground(new RippleDrawable(a10, (Drawable) null, (Drawable) null));
                return;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(1.0E-5f);
            Drawable n10 = androidx.core.graphics.drawable.a.n(gradientDrawable);
            androidx.core.graphics.drawable.a.l(n10, a10);
            this.f22462b.setItemBackground(n10);
        } else if (colorStateList == null && this.f22462b.getItemBackground() != null) {
            this.f22462b.setItemBackground((Drawable) null);
        }
    }

    public void setItemTextAppearanceActive(int i10) {
        this.f22462b.setItemTextAppearanceActive(i10);
    }

    public void setItemTextAppearanceInactive(int i10) {
        this.f22462b.setItemTextAppearanceInactive(i10);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f22462b.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.f22462b.getLabelVisibilityMode() != i10) {
            this.f22462b.setLabelVisibilityMode(i10);
            this.f22463c.g(false);
        }
    }

    public void setOnItemReselectedListener(b bVar) {
        this.f22467g = bVar;
    }

    public void setOnItemSelectedListener(c cVar) {
        this.f22466f = cVar;
    }

    public void setSelectedItemId(int i10) {
        MenuItem findItem = this.f22461a.findItem(i10);
        if (findItem != null && !this.f22461a.r(findItem, this.f22463c, 0)) {
            findItem.setChecked(true);
        }
    }
}
