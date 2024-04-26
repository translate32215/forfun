package com.startapp.sdk.adsbase.adinformation;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.startapp.e2;
import com.startapp.sdk.adsbase.adinformation.AdInformationConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationPositions;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.components.ComponentLocator;
import java.lang.ref.WeakReference;

/* compiled from: Sta */
public class AdInformationObject implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Context> f12185a;

    /* renamed from: b  reason: collision with root package name */
    public final AdInformationView f12186b;

    /* renamed from: c  reason: collision with root package name */
    public final AdPreferences.Placement f12187c;

    /* renamed from: d  reason: collision with root package name */
    public final ConsentData f12188d;

    /* renamed from: e  reason: collision with root package name */
    public final AdInformationOverrides f12189e;

    /* compiled from: Sta */
    public enum Size {
        SMALL(AdInformationConfig.ImageResourceType.INFO_S, AdInformationConfig.ImageResourceType.INFO_EX_S),
        LARGE(AdInformationConfig.ImageResourceType.INFO_L, AdInformationConfig.ImageResourceType.INFO_EX_L);
        
        private final AdInformationConfig.ImageResourceType infoExtendedType;
        private final AdInformationConfig.ImageResourceType infoType;

        /* access modifiers changed from: public */
        Size(AdInformationConfig.ImageResourceType imageResourceType, AdInformationConfig.ImageResourceType imageResourceType2) {
            this.infoType = imageResourceType;
            this.infoExtendedType = imageResourceType2;
        }

        public AdInformationConfig.ImageResourceType a() {
            return this.infoType;
        }
    }

    public AdInformationObject(Context context, Size size, AdPreferences.Placement placement, AdInformationOverrides adInformationOverrides, ConsentData consentData) {
        this.f12185a = new WeakReference<>(context);
        this.f12187c = placement;
        this.f12189e = adInformationOverrides;
        this.f12188d = consentData;
        this.f12186b = new AdInformationView(context, size, placement, adInformationOverrides, this);
    }

    public void a(RelativeLayout relativeLayout) {
        boolean z10;
        AdInformationConfig a10 = AdInformationMetaData.f12183a.a();
        AdInformationOverrides adInformationOverrides = this.f12189e;
        if (adInformationOverrides == null || !adInformationOverrides.d()) {
            z10 = a10.b((Context) this.f12185a.get());
        } else {
            z10 = this.f12189e.c();
        }
        if (z10) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            AdInformationOverrides adInformationOverrides2 = this.f12189e;
            if (adInformationOverrides2 == null || !adInformationOverrides2.e()) {
                AdPreferences.Placement placement = this.f12187c;
                AdInformationPositions.Position position = a10.Positions.get(placement);
                if (position == null) {
                    position = AdInformationPositions.Position.BOTTOM_LEFT;
                    a10.Positions.put(placement, position);
                }
                position.addRules(layoutParams);
            } else {
                this.f12189e.b().addRules(layoutParams);
            }
            relativeLayout.addView(this.f12186b, layoutParams);
        }
    }

    public void onClick(View view) {
        Context context = (Context) this.f12185a.get();
        if (context != null) {
            e2 f10 = ComponentLocator.a(context).f();
            ConsentData consentData = this.f12188d;
            String str = null;
            String c10 = consentData != null ? consentData.c() : null;
            ConsentData consentData2 = this.f12188d;
            String d10 = consentData2 != null ? consentData2.d() : null;
            ConsentData consentData3 = this.f12188d;
            if (consentData3 != null) {
                str = consentData3.b();
            }
            f10.a(true, c10, d10, str);
        }
    }
}
