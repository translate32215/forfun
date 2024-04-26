package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import c8.b;
import d7.l;
import e8.k1;
import e8.ti0;
import e8.y8;
import f7.m0;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import l0.e;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class s extends RelativeLayout {

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f8087b = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: a  reason: collision with root package name */
    public AnimationDrawable f8088a;

    public s(Context context, k1 k1Var, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        if (k1Var != null) {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f8087b, (RectF) null, (float[]) null));
            shapeDrawable.getPaint().setColor(k1Var.f15215d);
            setLayoutParams(layoutParams);
            m0 m0Var = l.B.f13188e;
            setBackground(shapeDrawable);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            if (!TextUtils.isEmpty(k1Var.f15212a)) {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                TextView textView = new TextView(context);
                textView.setLayoutParams(layoutParams3);
                textView.setId(1195835393);
                textView.setTypeface(Typeface.DEFAULT);
                textView.setText(k1Var.f15212a);
                textView.setTextColor(k1Var.f15216e);
                textView.setTextSize((float) k1Var.f15217f);
                y8 y8Var = ti0.f16763j.f16764a;
                int a10 = y8.a(context.getResources().getDisplayMetrics(), 4);
                y8 y8Var2 = ti0.f16763j.f16764a;
                textView.setPadding(a10, 0, y8.a(context.getResources().getDisplayMetrics(), 4), 0);
                addView(textView);
                layoutParams2.addRule(1, textView.getId());
            }
            ImageView imageView = new ImageView(context);
            imageView.setLayoutParams(layoutParams2);
            imageView.setId(1195835394);
            List<t> list = k1Var.f15213b;
            if (list != null && list.size() > 1) {
                this.f8088a = new AnimationDrawable();
                for (t y32 : list) {
                    try {
                        this.f8088a.addFrame((Drawable) b.z0(y32.y3()), k1Var.f15218g);
                    } catch (Exception e10) {
                        e.C("Error while getting drawable.", e10);
                    }
                }
                m0 m0Var2 = l.B.f13188e;
                imageView.setBackground(this.f8088a);
            } else if (list.size() == 1) {
                try {
                    imageView.setImageDrawable((Drawable) b.z0(list.get(0).y3()));
                } catch (Exception e11) {
                    e.C("Error while getting drawable.", e11);
                }
            }
            addView(imageView);
            return;
        }
        throw new NullPointerException("null reference");
    }

    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f8088a;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
