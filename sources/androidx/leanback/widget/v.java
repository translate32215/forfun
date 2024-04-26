package androidx.leanback.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.startappsdk.R;
import e1.a;

/* compiled from: ImageCardView */
public class v extends b {
    public ImageView A;
    public ViewGroup B;
    public TextView C;
    public TextView D;
    public ImageView E;
    public boolean F;
    public ObjectAnimator G;

    public v(Context context) {
        super(context, (AttributeSet) null, R.attr.imageCardViewStyle);
        setFocusable(true);
        setFocusableInTouchMode(true);
        LayoutInflater from = LayoutInflater.from(getContext());
        from.inflate(R.layout.lb_image_card_view, this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, a.f13535i, R.attr.imageCardViewStyle, 2132083595);
        int i10 = obtainStyledAttributes.getInt(1, 0);
        boolean z10 = i10 == 0;
        boolean z11 = (i10 & 1) == 1;
        boolean z12 = (i10 & 2) == 2;
        boolean z13 = (i10 & 4) == 4;
        boolean z14 = !z13 && (i10 & 8) == 8;
        ImageView imageView = (ImageView) findViewById(R.id.main_image);
        this.A = imageView;
        if (imageView.getDrawable() == null) {
            this.A.setVisibility(4);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A, "alpha", new float[]{1.0f});
        this.G = ofFloat;
        ofFloat.setDuration((long) this.A.getResources().getInteger(17694720));
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.info_field);
        this.B = viewGroup;
        if (z10) {
            removeView(viewGroup);
            obtainStyledAttributes.recycle();
            return;
        }
        if (z11) {
            TextView textView = (TextView) from.inflate(R.layout.lb_image_card_view_themed_title, viewGroup, false);
            this.C = textView;
            this.B.addView(textView);
        }
        if (z12) {
            TextView textView2 = (TextView) from.inflate(R.layout.lb_image_card_view_themed_content, this.B, false);
            this.D = textView2;
            this.B.addView(textView2);
        }
        if (z13 || z14) {
            ImageView imageView2 = (ImageView) from.inflate(z14 ? R.layout.lb_image_card_view_themed_badge_left : R.layout.lb_image_card_view_themed_badge_right, this.B, false);
            this.E = imageView2;
            this.B.addView(imageView2);
        }
        if (z11 && !z12 && this.E != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.C.getLayoutParams();
            if (z14) {
                layoutParams.addRule(17, this.E.getId());
            } else {
                layoutParams.addRule(16, this.E.getId());
            }
            this.C.setLayoutParams(layoutParams);
        }
        if (z12) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.D.getLayoutParams();
            if (!z11) {
                layoutParams2.addRule(10);
            }
            if (z14) {
                layoutParams2.removeRule(16);
                layoutParams2.removeRule(20);
                layoutParams2.addRule(17, this.E.getId());
            }
            this.D.setLayoutParams(layoutParams2);
        }
        ImageView imageView3 = this.E;
        if (imageView3 != null) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) imageView3.getLayoutParams();
            if (z12) {
                layoutParams3.addRule(8, this.D.getId());
            } else if (z11) {
                layoutParams3.addRule(8, this.C.getId());
            }
            this.E.setLayoutParams(layoutParams3);
        }
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setInfoAreaBackground(drawable);
        }
        ImageView imageView4 = this.E;
        if (imageView4 != null && imageView4.getDrawable() == null) {
            this.E.setVisibility(8);
        }
        obtainStyledAttributes.recycle();
    }

    public void e(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = this.A.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i11;
        this.A.setLayoutParams(layoutParams);
    }

    public Drawable getBadgeImage() {
        ImageView imageView = this.E;
        if (imageView == null) {
            return null;
        }
        return imageView.getDrawable();
    }

    public CharSequence getContentText() {
        TextView textView = this.D;
        if (textView == null) {
            return null;
        }
        return textView.getText();
    }

    public Drawable getInfoAreaBackground() {
        ViewGroup viewGroup = this.B;
        if (viewGroup != null) {
            return viewGroup.getBackground();
        }
        return null;
    }

    public Drawable getMainImage() {
        ImageView imageView = this.A;
        if (imageView == null) {
            return null;
        }
        return imageView.getDrawable();
    }

    public final ImageView getMainImageView() {
        return this.A;
    }

    public CharSequence getTitleText() {
        TextView textView = this.C;
        if (textView == null) {
            return null;
        }
        return textView.getText();
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F = true;
        if (this.A.getAlpha() == 0.0f) {
            this.A.setAlpha(0.0f);
            if (this.F) {
                this.G.start();
            }
        }
    }

    public void onDetachedFromWindow() {
        this.F = false;
        this.G.cancel();
        this.A.setAlpha(1.0f);
        super.onDetachedFromWindow();
    }

    public void setBadgeImage(Drawable drawable) {
        ImageView imageView = this.E;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
            if (drawable != null) {
                this.E.setVisibility(0);
            } else {
                this.E.setVisibility(8);
            }
        }
    }

    public void setContentText(CharSequence charSequence) {
        TextView textView = this.D;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setInfoAreaBackground(Drawable drawable) {
        ViewGroup viewGroup = this.B;
        if (viewGroup != null) {
            viewGroup.setBackground(drawable);
        }
    }

    public void setInfoAreaBackgroundColor(int i10) {
        ViewGroup viewGroup = this.B;
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(i10);
        }
    }

    public void setMainImage(Drawable drawable) {
        ImageView imageView = this.A;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
            if (drawable == null) {
                this.G.cancel();
                this.A.setAlpha(1.0f);
                this.A.setVisibility(4);
                return;
            }
            this.A.setVisibility(0);
            this.A.setAlpha(0.0f);
            if (this.F) {
                this.G.start();
            }
        }
    }

    public void setMainImageAdjustViewBounds(boolean z10) {
        ImageView imageView = this.A;
        if (imageView != null) {
            imageView.setAdjustViewBounds(z10);
        }
    }

    public void setMainImageScaleType(ImageView.ScaleType scaleType) {
        ImageView imageView = this.A;
        if (imageView != null) {
            imageView.setScaleType(scaleType);
        }
    }

    public void setTitleText(CharSequence charSequence) {
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
