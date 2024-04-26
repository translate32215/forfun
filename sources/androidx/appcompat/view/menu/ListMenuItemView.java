package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.g1;
import com.startapp.startappsdk.R;
import e.l;
import java.util.WeakHashMap;
import o0.c0;

public class ListMenuItemView extends LinearLayout implements j.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a  reason: collision with root package name */
    public g f469a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f470b;

    /* renamed from: c  reason: collision with root package name */
    public RadioButton f471c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f472d;

    /* renamed from: e  reason: collision with root package name */
    public CheckBox f473e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f474f;

    /* renamed from: g  reason: collision with root package name */
    public ImageView f475g;

    /* renamed from: h  reason: collision with root package name */
    public ImageView f476h;

    /* renamed from: i  reason: collision with root package name */
    public LinearLayout f477i;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f478r;

    /* renamed from: s  reason: collision with root package name */
    public int f479s;

    /* renamed from: t  reason: collision with root package name */
    public Context f480t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f481u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f482v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f483w;

    /* renamed from: x  reason: collision with root package name */
    public LayoutInflater f484x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f485y;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g1 r10 = g1.r(getContext(), attributeSet, l.f13519s, R.attr.listMenuViewStyle, 0);
        this.f478r = r10.g(5);
        this.f479s = r10.m(1, -1);
        this.f481u = r10.a(7, false);
        this.f480t = context;
        this.f482v = r10.g(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f483w = obtainStyledAttributes.hasValue(0);
        r10.f924b.recycle();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f484x == null) {
            this.f484x = LayoutInflater.from(getContext());
        }
        return this.f484x;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f475g;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    public final void a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
        this.f473e = checkBox;
        LinearLayout linearLayout = this.f477i;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f476h;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f476h.getLayoutParams();
            rect.top = this.f476h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    public final void b() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, this, false);
        this.f471c = radioButton;
        LinearLayout linearLayout = this.f477i;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    public void d(g gVar, int i10) {
        String str;
        this.f469a = gVar;
        int i11 = 0;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.f568e);
        setCheckable(gVar.isCheckable());
        boolean n10 = gVar.n();
        gVar.e();
        if (!n10 || !this.f469a.n()) {
            i11 = 8;
        }
        if (i11 == 0) {
            TextView textView = this.f474f;
            g gVar2 = this.f469a;
            char e10 = gVar2.e();
            if (e10 == 0) {
                str = "";
            } else {
                Resources resources = gVar2.f577n.f537a.getResources();
                StringBuilder sb2 = new StringBuilder();
                if (ViewConfiguration.get(gVar2.f577n.f537a).hasPermanentMenuKey()) {
                    sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i12 = gVar2.f577n.n() ? gVar2.f574k : gVar2.f572i;
                g.c(sb2, i12, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                g.c(sb2, i12, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                g.c(sb2, i12, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                g.c(sb2, i12, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                g.c(sb2, i12, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                g.c(sb2, i12, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (e10 == 8) {
                    sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (e10 == 10) {
                    sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (e10 != ' ') {
                    sb2.append(e10);
                } else {
                    sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                str = sb2.toString();
            }
            textView.setText(str);
        }
        if (this.f474f.getVisibility() != i11) {
            this.f474f.setVisibility(i11);
        }
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.f580q);
    }

    public g getItemData() {
        return this.f469a;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.f478r;
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        c0.d.q(this, drawable);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f472d = textView;
        int i10 = this.f479s;
        if (i10 != -1) {
            textView.setTextAppearance(this.f480t, i10);
        }
        this.f474f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f475g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f482v);
        }
        this.f476h = (ImageView) findViewById(R.id.group_divider);
        this.f477i = (LinearLayout) findViewById(R.id.content);
    }

    public void onMeasure(int i10, int i11) {
        if (this.f470b != null && this.f481u) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f470b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z10 || this.f471c != null || this.f473e != null) {
            if (this.f469a.h()) {
                if (this.f471c == null) {
                    b();
                }
                compoundButton2 = this.f471c;
                compoundButton = this.f473e;
            } else {
                if (this.f473e == null) {
                    a();
                }
                compoundButton2 = this.f473e;
                compoundButton = this.f471c;
            }
            if (z10) {
                compoundButton2.setChecked(this.f469a.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f473e;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f471c;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f469a.h()) {
            if (this.f471c == null) {
                b();
            }
            compoundButton = this.f471c;
        } else {
            if (this.f473e == null) {
                a();
            }
            compoundButton = this.f473e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f485y = z10;
        this.f481u = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f476h;
        if (imageView != null) {
            imageView.setVisibility((this.f483w || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f469a.f577n.getClass();
        boolean z10 = this.f485y;
        if (z10 || this.f481u) {
            ImageView imageView = this.f470b;
            if (imageView != null || drawable != null || this.f481u) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, this, false);
                    this.f470b = imageView2;
                    LinearLayout linearLayout = this.f477i;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable != null || this.f481u) {
                    ImageView imageView3 = this.f470b;
                    if (!z10) {
                        drawable = null;
                    }
                    imageView3.setImageDrawable(drawable);
                    if (this.f470b.getVisibility() != 0) {
                        this.f470b.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f470b.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f472d.setText(charSequence);
            if (this.f472d.getVisibility() != 0) {
                this.f472d.setVisibility(0);
            }
        } else if (this.f472d.getVisibility() != 8) {
            this.f472d.setVisibility(8);
        }
    }
}
