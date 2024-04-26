package com.startapp.sdk.ads.banner.banner3d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.EmbossMaskFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.a0;
import com.startapp.l0;
import com.startapp.qb;
import com.startapp.sdk.ads.banner.banner3d.Banner3DSize;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.json.RatingBar;
import j.f;

/* compiled from: Sta */
public class Banner3DView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public TextView f11765a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f11766b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f11767c;

    /* renamed from: d  reason: collision with root package name */
    public RatingBar f11768d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f11769e;

    /* renamed from: f  reason: collision with root package name */
    public Point f11770f;

    /* compiled from: Sta */
    public enum Template {
        S,
        M,
        L,
        XL
    }

    /* compiled from: Sta */
    public class a extends ShapeDrawable {
        public a(Banner3DView banner3DView, Shape shape) {
            super(shape);
        }

        public void onDraw(Shape shape, Canvas canvas, Paint paint) {
            paint.setColor(-11363070);
            paint.setMaskFilter(new EmbossMaskFilter(new float[]{1.0f, 1.0f, 1.0f}, 0.4f, 5.0f, 3.0f));
            super.onDraw(shape, canvas, paint);
        }
    }

    public Banner3DView(Context context) {
        super(context);
        a();
    }

    public final void a() {
        Context context = getContext();
        Template template = Template.S;
        int i10 = this.f11770f.x;
        Banner3DSize.Size size = Banner3DSize.Size.SMALL;
        if (i10 > size.getSize().f11637a.x || this.f11770f.y > size.getSize().f11637a.y) {
            template = Template.M;
        }
        int i11 = this.f11770f.x;
        Banner3DSize.Size size2 = Banner3DSize.Size.MEDIUM;
        if (i11 > size2.getSize().f11637a.x || this.f11770f.y > size2.getSize().f11637a.y) {
            template = Template.L;
        }
        int i12 = this.f11770f.x;
        Banner3DSize.Size size3 = Banner3DSize.Size.LARGE;
        if (i12 > size3.getSize().f11637a.x || this.f11770f.y > size3.getSize().f11637a.y) {
            template = Template.XL;
        }
        setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{AdsCommonMetaData.f12098h.p(), AdsCommonMetaData.f12098h.o()}));
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        int a10 = qb.a(context, 2);
        int a11 = l0.a(context, 1, (float) 3);
        Math.round(TypedValue.applyDimension(1, (float) 4, context.getResources().getDisplayMetrics()));
        int a12 = l0.a(context, 1, (float) 5);
        int a13 = l0.a(context, 1, (float) 6);
        int a14 = l0.a(context, 1, (float) 8);
        Math.round(TypedValue.applyDimension(1, (float) 10, context.getResources().getDisplayMetrics()));
        int a15 = l0.a(context, 1, (float) 20);
        Math.round(TypedValue.applyDimension(1, (float) 84, context.getResources().getDisplayMetrics()));
        int a16 = l0.a(context, 1, (float) 90);
        setPadding(a12, 0, a12, 0);
        setTag(this);
        ImageView imageView = new ImageView(context);
        this.f11767c = imageView;
        imageView.setId(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a16, a16);
        layoutParams.addRule(15);
        this.f11767c.setLayoutParams(layoutParams);
        TextView textView = new TextView(context);
        this.f11765a = textView;
        textView.setId(2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(a0.a(17), 1);
        layoutParams2.addRule(14);
        this.f11765a.setLayoutParams(layoutParams2);
        this.f11765a.setTextColor(AdsCommonMetaData.f12098h.q().intValue());
        this.f11765a.setGravity(a0.a(8388611));
        this.f11765a.setBackgroundColor(0);
        int ordinal = template.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            this.f11765a.setTextSize(17.0f);
            this.f11765a.setPadding(a11, 0, 0, a10);
            Context context2 = getContext();
            double d10 = (double) this.f11770f.x;
            Double.isNaN(d10);
            layoutParams2.width = qb.a(context2, (int) (d10 * 0.55d));
        } else if (ordinal == 2) {
            this.f11765a.setTextSize(17.0f);
            this.f11765a.setPadding(a11, 0, 0, a10);
            Context context3 = getContext();
            double d11 = (double) this.f11770f.x;
            Double.isNaN(d11);
            layoutParams2.width = qb.a(context3, (int) (d11 * 0.65d));
        } else if (ordinal == 3 || ordinal == 4) {
            this.f11765a.setTextSize(22.0f);
            this.f11765a.setPadding(a11, 0, 0, a12);
        }
        this.f11765a.setSingleLine(true);
        this.f11765a.setEllipsize(TextUtils.TruncateAt.END);
        qb.a(this.f11765a, AdsCommonMetaData.f12098h.r());
        TextView textView2 = new TextView(context);
        this.f11766b = textView2;
        textView2.setId(3);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(a0.a(17), 1);
        layoutParams3.addRule(3, 2);
        layoutParams3.setMargins(0, 0, 0, a12);
        this.f11766b.setLayoutParams(layoutParams3);
        this.f11766b.setTextColor(AdsCommonMetaData.f12098h.l().intValue());
        this.f11766b.setTextSize(18.0f);
        this.f11766b.setMaxLines(2);
        this.f11766b.setLines(2);
        this.f11766b.setSingleLine(false);
        this.f11766b.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f11766b.setHorizontallyScrolling(true);
        this.f11766b.setPadding(a11, 0, 0, 0);
        RatingBar ratingBar = new RatingBar(getContext());
        this.f11768d = ratingBar;
        ratingBar.setId(5);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        int ordinal2 = template.ordinal();
        if (ordinal2 == 0 || ordinal2 == 1 || ordinal2 == 2) {
            layoutParams4.addRule(a0.a(17), 1);
            layoutParams4.addRule(8, 1);
        } else if (ordinal2 == 3 || ordinal2 == 4) {
            layoutParams4.addRule(a0.a(17), 2);
            Context context4 = getContext();
            double d12 = (double) this.f11770f.x;
            Double.isNaN(d12);
            layoutParams3.width = qb.a(context4, (int) (d12 * 0.6d));
        }
        layoutParams4.setMargins(a11, a14, a11, 0);
        this.f11768d.setLayoutParams(layoutParams4);
        this.f11769e = new TextView(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        int ordinal3 = template.ordinal();
        if (ordinal3 == 0 || ordinal3 == 1 || ordinal3 == 2) {
            this.f11769e.setTextSize(13.0f);
            layoutParams5.addRule(a0.a(17), 2);
            layoutParams5.addRule(15);
        } else if (ordinal3 == 3) {
            layoutParams5.addRule(a0.a(17), 3);
            layoutParams5.addRule(15);
            layoutParams5.setMargins(a15, 0, 0, 0);
            this.f11769e.setTextSize(26.0f);
        } else if (ordinal3 == 4) {
            layoutParams5.addRule(a0.a(17), 3);
            layoutParams5.addRule(15);
            layoutParams5.setMargins(a15 * 7, 0, 0, 0);
            this.f11769e.setTextSize(26.0f);
        }
        this.f11769e.setPadding(a13, a13, a13, a13);
        this.f11769e.setLayoutParams(layoutParams5);
        setButtonText(false);
        this.f11769e.setTextColor(-1);
        this.f11769e.setTypeface((Typeface) null, 1);
        this.f11769e.setId(4);
        this.f11769e.setShadowLayer(2.5f, -3.0f, 3.0f, -9013642);
        this.f11769e.setBackgroundDrawable(new a(this, new RoundRectShape(new float[]{10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f}, (RectF) null, (float[]) null)));
        addView(this.f11767c);
        addView(this.f11765a);
        int ordinal4 = template.ordinal();
        if (ordinal4 == 0 || ordinal4 == 1 || ordinal4 == 2) {
            addView(this.f11769e);
        } else if (ordinal4 == 3 || ordinal4 == 4) {
            addView(this.f11769e);
            addView(this.f11766b);
        }
        addView(this.f11768d);
    }

    public void setButtonText(boolean z10) {
        if (z10) {
            this.f11769e.setText("OPEN");
        } else {
            this.f11769e.setText("DOWNLOAD");
        }
    }

    public void setDescription(String str) {
        if (str != null) {
            String str2 = "";
            if (str.compareTo(str2) != 0) {
                String[] a10 = a(str);
                String str3 = a10[0];
                if (a10[1] != null) {
                    str2 = a(a10[1])[0];
                }
                if (str.length() >= 110) {
                    str2 = f.a(str2, "...");
                }
                TextView textView = this.f11766b;
                textView.setText(str3 + "\n" + str2);
            }
        }
    }

    public void setImage(Bitmap bitmap) {
        this.f11767c.setImageBitmap(bitmap);
    }

    public void setRating(float f10) {
        try {
            this.f11768d.setRating(f10);
        } catch (NullPointerException unused) {
        }
    }

    public void setText(String str) {
        this.f11765a.setText(str);
    }

    public void setImage(int i10, int i11, int i12) {
        this.f11767c.setImageResource(i10);
        ViewGroup.LayoutParams layoutParams = this.f11767c.getLayoutParams();
        layoutParams.width = i11;
        layoutParams.height = i12;
        this.f11767c.setLayoutParams(layoutParams);
    }

    public Banner3DView(Context context, Point point) {
        super(context);
        this.f11770f = point;
        a();
    }

    public Banner3DView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public void setImage(Bitmap bitmap, int i10, int i11) {
        this.f11767c.setImageBitmap(bitmap);
        ViewGroup.LayoutParams layoutParams = this.f11767c.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i11;
        this.f11767c.setLayoutParams(layoutParams);
    }

    public Banner3DView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a();
    }

    public final String[] a(String str) {
        boolean z10;
        String[] strArr = new String[2];
        int i10 = 55;
        if (str.length() > 55) {
            char[] charArray = str.substring(0, 55).toCharArray();
            int length = charArray.length - 1;
            int i11 = length - 1;
            while (true) {
                if (i11 <= 0) {
                    z10 = false;
                    break;
                } else if (charArray[i11] == ' ') {
                    length = i11;
                    z10 = true;
                    break;
                } else {
                    i11--;
                }
            }
            if (z10) {
                i10 = length;
            }
            strArr[0] = str.substring(0, i10);
            strArr[1] = str.substring(i10 + 1, str.length());
        } else {
            strArr[0] = str;
            strArr[1] = null;
        }
        return strArr;
    }
}
