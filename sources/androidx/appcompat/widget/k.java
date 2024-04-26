package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import androidx.appcompat.widget.t0;
import com.startapp.startappsdk.R;

/* compiled from: AppCompatDrawableManager */
public final class k {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f966b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static k f967c;

    /* renamed from: a  reason: collision with root package name */
    public t0 f968a;

    /* compiled from: AppCompatDrawableManager */
    public class a implements t0.f {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f969a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b  reason: collision with root package name */
        public final int[] f970b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c  reason: collision with root package name */
        public final int[] f971c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

        /* renamed from: d  reason: collision with root package name */
        public final int[] f972d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e  reason: collision with root package name */
        public final int[] f973e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* renamed from: f  reason: collision with root package name */
        public final int[] f974f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public final boolean a(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList b(Context context, int i10) {
            int c10 = b1.c(context, R.attr.colorControlHighlight);
            int b10 = b1.b(context, R.attr.colorButtonNormal);
            return new ColorStateList(new int[][]{b1.f838b, b1.f840d, b1.f839c, b1.f842f}, new int[]{b10, g0.a.b(c10, i10), g0.a.b(c10, i10), i10});
        }

        public final LayerDrawable c(t0 t0Var, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable f10 = t0Var.f(context, R.drawable.abc_star_black_48dp);
            Drawable f11 = t0Var.f(context, R.drawable.abc_star_half_black_48dp);
            if ((f10 instanceof BitmapDrawable) && f10.getIntrinsicWidth() == dimensionPixelSize && f10.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) f10;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                f10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                f10.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((f11 instanceof BitmapDrawable) && f11.getIntrinsicWidth() == dimensionPixelSize && f11.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) f11;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                f11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                f11.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        public ColorStateList d(Context context, int i10) {
            if (i10 == R.drawable.abc_edit_text_material) {
                return g.a.a(context, R.color.abc_tint_edittext);
            }
            if (i10 == R.drawable.abc_switch_track_mtrl_alpha) {
                return g.a.a(context, R.color.abc_tint_switch_track);
            }
            if (i10 == R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3][];
                int[] iArr2 = new int[3];
                ColorStateList d10 = b1.d(context, R.attr.colorSwitchThumbNormal);
                if (d10 == null || !d10.isStateful()) {
                    iArr[0] = b1.f838b;
                    iArr2[0] = b1.b(context, R.attr.colorSwitchThumbNormal);
                    iArr[1] = b1.f841e;
                    iArr2[1] = b1.c(context, R.attr.colorControlActivated);
                    iArr[2] = b1.f842f;
                    iArr2[2] = b1.c(context, R.attr.colorSwitchThumbNormal);
                } else {
                    iArr[0] = b1.f838b;
                    iArr2[0] = d10.getColorForState(iArr[0], 0);
                    iArr[1] = b1.f841e;
                    iArr2[1] = b1.c(context, R.attr.colorControlActivated);
                    iArr[2] = b1.f842f;
                    iArr2[2] = d10.getDefaultColor();
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i10 == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, b1.c(context, R.attr.colorButtonNormal));
            } else {
                if (i10 == R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i10 == R.drawable.abc_btn_colored_material) {
                    return b(context, b1.c(context, R.attr.colorAccent));
                }
                if (i10 == R.drawable.abc_spinner_mtrl_am_alpha || i10 == R.drawable.abc_spinner_textfield_background_material) {
                    return g.a.a(context, R.color.abc_tint_spinner);
                }
                if (a(this.f970b, i10)) {
                    return b1.d(context, R.attr.colorControlNormal);
                }
                if (a(this.f973e, i10)) {
                    return g.a.a(context, R.color.abc_tint_default);
                }
                if (a(this.f974f, i10)) {
                    return g.a.a(context, R.color.abc_tint_btn_checkable);
                }
                if (i10 == R.drawable.abc_seekbar_thumb_material) {
                    return g.a.a(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
        }

        public final void e(Drawable drawable, int i10, PorterDuff.Mode mode) {
            int[] iArr = k0.f975a;
            Drawable mutate = drawable.mutate();
            if (mode == null) {
                mode = k.f966b;
            }
            mutate.setColorFilter(k.c(i10, mode));
        }
    }

    public static synchronized k a() {
        k kVar;
        synchronized (k.class) {
            if (f967c == null) {
                e();
            }
            kVar = f967c;
        }
        return kVar;
    }

    public static synchronized PorterDuffColorFilter c(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter h10;
        synchronized (k.class) {
            h10 = t0.h(i10, mode);
        }
        return h10;
    }

    public static synchronized void e() {
        synchronized (k.class) {
            if (f967c == null) {
                k kVar = new k();
                f967c = kVar;
                kVar.f968a = t0.d();
                t0 t0Var = f967c.f968a;
                a aVar = new a();
                synchronized (t0Var) {
                    t0Var.f1104g = aVar;
                }
            }
        }
    }

    public static void f(Drawable drawable, e1 e1Var, int[] iArr) {
        PorterDuff.Mode mode = t0.f1095h;
        int[] state = drawable.getState();
        int[] iArr2 = k0.f975a;
        if (!(drawable.mutate() == drawable)) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = e1Var.f897d;
        if (z10 || e1Var.f896c) {
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = z10 ? e1Var.f894a : null;
            PorterDuff.Mode mode2 = e1Var.f896c ? e1Var.f895b : t0.f1095h;
            if (!(colorStateList == null || mode2 == null)) {
                porterDuffColorFilter = t0.h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public synchronized Drawable b(Context context, int i10) {
        return this.f968a.f(context, i10);
    }

    public synchronized ColorStateList d(Context context, int i10) {
        return this.f968a.i(context, i10);
    }
}
