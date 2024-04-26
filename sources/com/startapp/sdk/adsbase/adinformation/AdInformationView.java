package com.startapp.sdk.adsbase.adinformation;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.startapp.qb;
import com.startapp.sdk.adsbase.adinformation.AdInformationObject;
import com.startapp.sdk.adsbase.adinformation.AdInformationPositions;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class AdInformationView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public ImageView f12194a;

    /* renamed from: b  reason: collision with root package name */
    public RelativeLayout f12195b;

    /* renamed from: c  reason: collision with root package name */
    public View.OnClickListener f12196c = null;

    /* renamed from: d  reason: collision with root package name */
    public AdInformationConfig f12197d;

    /* renamed from: e  reason: collision with root package name */
    public ImageResourceConfig f12198e;

    /* renamed from: f  reason: collision with root package name */
    public AdPreferences.Placement f12199f;

    /* renamed from: g  reason: collision with root package name */
    public AdInformationPositions.Position f12200g;

    /* compiled from: Sta */
    public class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View.OnClickListener f12201a;

        public a(AdInformationView adInformationView, View.OnClickListener onClickListener) {
            this.f12201a = onClickListener;
        }

        public void onClick(View view) {
            this.f12201a.onClick(view);
        }
    }

    public AdInformationView(Context context, AdInformationObject.Size size, AdPreferences.Placement placement, AdInformationOverrides adInformationOverrides, View.OnClickListener onClickListener) {
        super(context);
        this.f12199f = placement;
        this.f12196c = new a(this, onClickListener);
        a(size, adInformationOverrides);
    }

    public void a(AdInformationObject.Size size, AdInformationOverrides adInformationOverrides) {
        AdInformationConfig a10 = AdInformationMetaData.f12183a.a();
        this.f12197d = a10;
        if (a10 == null) {
            this.f12197d = AdInformationConfig.a();
        }
        AdInformationConfig adInformationConfig = this.f12197d;
        this.f12198e = adInformationConfig.f12182a.get(size.a());
        if (adInformationOverrides == null || !adInformationOverrides.e()) {
            AdInformationConfig adInformationConfig2 = this.f12197d;
            AdPreferences.Placement placement = this.f12199f;
            AdInformationPositions.Position position = adInformationConfig2.Positions.get(placement);
            if (position == null) {
                position = AdInformationPositions.Position.BOTTOM_LEFT;
                adInformationConfig2.Positions.put(placement, position);
            }
            this.f12200g = position;
        } else {
            this.f12200g = adInformationOverrides.b();
        }
        ImageView imageView = new ImageView(getContext());
        this.f12194a = imageView;
        imageView.setContentDescription("info");
        this.f12194a.setId(1475346433);
        this.f12194a.setImageBitmap(this.f12198e.a(getContext()));
        this.f12195b = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(qb.a(getContext(), (int) (this.f12197d.e() * ((float) this.f12198e.d()))), qb.a(getContext(), (int) (this.f12197d.e() * ((float) this.f12198e.a()))));
        this.f12195b.setBackgroundColor(0);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(qb.a(getContext(), this.f12198e.d()), qb.a(getContext(), this.f12198e.a()));
        layoutParams2.setMargins(0, 0, 0, 0);
        this.f12194a.setPadding(0, 0, 0, 0);
        this.f12200g.addRules(layoutParams2);
        this.f12195b.addView(this.f12194a, layoutParams2);
        this.f12195b.setOnClickListener(this.f12196c);
        addView(this.f12195b, layoutParams);
    }
}
