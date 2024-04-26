package com.startapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.EmbossMaskFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataStyle;
import com.startapp.sdk.json.RatingBar;

/* compiled from: Sta */
public class x5 {

    /* renamed from: a  reason: collision with root package name */
    public RelativeLayout f12790a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f12791b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f12792c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f12793d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f12794e;

    /* renamed from: f  reason: collision with root package name */
    public RatingBar f12795f;

    /* renamed from: g  reason: collision with root package name */
    public MetaDataStyle f12796g = null;

    /* compiled from: Sta */
    public class a extends ShapeDrawable {
        public a(x5 x5Var, Shape shape) {
            super(shape);
        }

        public void onDraw(Shape shape, Canvas canvas, Paint paint) {
            paint.setColor(-11363070);
            paint.setMaskFilter(new EmbossMaskFilter(new float[]{1.0f, 1.0f, 1.0f}, 0.4f, 5.0f, 3.0f));
            super.onDraw(shape, canvas, paint);
        }
    }

    public x5(Context context) {
        Context context2 = context;
        context2.setTheme(16973829);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        this.f12790a = new RelativeLayout(context2);
        this.f12790a.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{AdsCommonMetaData.k().p(), AdsCommonMetaData.k().o()}));
        this.f12790a.setLayoutParams(layoutParams);
        int a10 = qb.a(context2, 3);
        int a11 = qb.a(context2, 4);
        int a12 = qb.a(context2, 5);
        int a13 = qb.a(context2, 6);
        int a14 = qb.a(context2, 10);
        int a15 = qb.a(context2, 84);
        this.f12790a.setPadding(a14, a10, a14, a10);
        this.f12790a.setTag(this);
        ImageView imageView = new ImageView(context2);
        this.f12791b = imageView;
        imageView.setId(1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a15, a15);
        layoutParams2.addRule(15);
        this.f12791b.setLayoutParams(layoutParams2);
        this.f12791b.setPadding(0, 0, a13, 0);
        TextView textView = new TextView(context2);
        this.f12792c = textView;
        textView.setId(2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(a0.a(17), 1);
        layoutParams3.addRule(6, 1);
        this.f12792c.setLayoutParams(layoutParams3);
        this.f12792c.setPadding(0, 0, 0, a12);
        this.f12792c.setTextColor(AdsCommonMetaData.k().q().intValue());
        this.f12792c.setTextSize((float) AdsCommonMetaData.k().s().intValue());
        this.f12792c.setSingleLine(true);
        this.f12792c.setEllipsize(TextUtils.TruncateAt.END);
        qb.a(this.f12792c, AdsCommonMetaData.k().r());
        TextView textView2 = new TextView(context2);
        this.f12793d = textView2;
        textView2.setId(3);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(a0.a(17), 1);
        layoutParams4.addRule(3, 2);
        layoutParams4.setMargins(0, 0, 0, a12);
        this.f12793d.setLayoutParams(layoutParams4);
        this.f12793d.setTextColor(AdsCommonMetaData.k().l().intValue());
        this.f12793d.setTextSize((float) AdsCommonMetaData.k().n().intValue());
        this.f12793d.setSingleLine(true);
        this.f12793d.setEllipsize(TextUtils.TruncateAt.END);
        qb.a(this.f12793d, AdsCommonMetaData.k().m());
        this.f12795f = new RatingBar(context2);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(a0.a(17), 1);
        layoutParams5.addRule(8, 1);
        layoutParams5.setMargins(0, 0, 0, -a12);
        this.f12795f.setLayoutParams(layoutParams5);
        this.f12795f.setPadding(0, 0, 0, a11);
        this.f12795f.setId(5);
        this.f12794e = new TextView(context2);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(a0.a(21));
        layoutParams6.addRule(8, 1);
        this.f12794e.setLayoutParams(layoutParams6);
        a(false);
        this.f12794e.setTextColor(-1);
        this.f12794e.setTextSize(12.0f);
        this.f12794e.setTypeface((Typeface) null, 1);
        this.f12794e.setPadding(a14, a13, a14, a13);
        this.f12794e.setId(4);
        this.f12794e.setShadowLayer(2.5f, -3.0f, 3.0f, -9013642);
        this.f12794e.setBackgroundDrawable(new a(this, new RoundRectShape(new float[]{10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f}, (RectF) null, (float[]) null)));
        this.f12790a.addView(this.f12791b);
        this.f12790a.addView(this.f12792c);
        this.f12790a.addView(this.f12793d);
        this.f12790a.addView(this.f12795f);
        this.f12790a.addView(this.f12794e);
    }

    public void a(boolean z10) {
        if (z10) {
            this.f12794e.setText("Open");
        } else {
            this.f12794e.setText("Download");
        }
    }
}
