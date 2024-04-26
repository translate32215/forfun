package com.startapp.sdk.ads.banner;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import com.startapp.a0;
import com.startapp.d;
import com.startapp.e;
import com.startapp.hd;
import com.startapp.j9;
import com.startapp.o0;
import com.startapp.qb;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.adrules.AdaptMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import java.util.Random;

/* compiled from: Sta */
public abstract class BannerBase extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f11728a;

    /* renamed from: b  reason: collision with root package name */
    public AdPreferences f11729b;

    /* renamed from: c  reason: collision with root package name */
    public AdRulesResult f11730c;

    /* renamed from: d  reason: collision with root package name */
    public int f11731d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11732e;

    /* renamed from: f  reason: collision with root package name */
    public Point f11733f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11734g;

    /* renamed from: h  reason: collision with root package name */
    public int f11735h;

    /* renamed from: i  reason: collision with root package name */
    public int f11736i;

    /* renamed from: j  reason: collision with root package name */
    public String f11737j;

    /* renamed from: k  reason: collision with root package name */
    public hd f11738k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f11739l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f11740m;

    /* renamed from: n  reason: collision with root package name */
    public String f11741n;

    /* renamed from: o  reason: collision with root package name */
    public final Runnable f11742o;

    /* renamed from: p  reason: collision with root package name */
    public final Handler f11743p;

    /* renamed from: q  reason: collision with root package name */
    public final Object f11744q;

    /* compiled from: Sta */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            AdRulesResult adRulesResult;
            if (BannerBase.this.isShown() || ((adRulesResult = BannerBase.this.f11730c) != null && !adRulesResult.b())) {
                BannerBase.this.j();
            }
        }
    }

    /* compiled from: Sta */
    public class b implements Handler.Callback {
        public b() {
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1 || i10 == 2) {
                BannerBase bannerBase = BannerBase.this;
                bannerBase.m();
                bannerBase.j();
            }
            return true;
        }
    }

    public BannerBase(Context context) {
        super(context);
        this.f11728a = false;
        this.f11731d = 0;
        this.f11732e = true;
        this.f11734g = false;
        int nextInt = new Random().nextInt(100000) + 159868227;
        this.f11735h = nextInt;
        this.f11736i = nextInt + 1;
        this.f11737j = null;
        this.f11739l = false;
        this.f11740m = false;
        this.f11742o = new a();
        this.f11743p = new Handler(Looper.getMainLooper(), new b());
        this.f11744q = new Object();
        try {
            ComponentLocator.a(context).r().a(512);
        } catch (Throwable unused) {
        }
    }

    public abstract void a(int i10);

    public void a(j9 j9Var) {
        if (this.f11738k == null) {
            hd hdVar = new hd(g(), j9Var, BannerMetaData.f11748b.a());
            this.f11738k = hdVar;
            if (hdVar.b()) {
                hdVar.run();
            }
        }
    }

    public void b() {
        if (!isInEditMode()) {
            removeCallbacks(this.f11742o);
            synchronized (this.f11744q) {
                this.f11743p.removeMessages(2);
            }
        }
    }

    public int c() {
        return f();
    }

    public abstract int d();

    public abstract String e();

    public abstract int f();

    public View g() {
        return this;
    }

    public abstract String getBidToken();

    public String getErrorMessage() {
        return this.f11741n;
    }

    @Keep
    public abstract int getHeightInDp();

    @Keep
    public abstract int getWidthInDp();

    public void h() {
        if (!isInEditMode()) {
            i();
            return;
        }
        setMinimumWidth(qb.a(getContext(), getWidthInDp()));
        setMinimumHeight(qb.a(getContext(), getHeightInDp()));
        setBackgroundColor(Color.rgb(169, 169, 169));
        TextView textView = new TextView(getContext());
        textView.setText(e());
        textView.setTextColor(-16777216);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        addView(textView, layoutParams);
    }

    public abstract void hideBanner();

    public abstract void i();

    public boolean isClicked() {
        return this.f11739l;
    }

    public boolean isFirstLoad() {
        return this.f11732e;
    }

    public void j() {
        hd hdVar = this.f11738k;
        if (hdVar != null) {
            hdVar.a();
            this.f11738k = null;
        }
        if (this.f11730c == null || AdaptMetaData.f12230a.a().a()) {
            AdRulesResult a10 = AdaptMetaData.f12230a.a().a(AdPreferences.Placement.INAPP_BANNER, this.f11737j);
            this.f11730c = a10;
            if (a10.b()) {
                l();
            } else {
                hideBanner();
            }
        } else if (this.f11730c.b()) {
            l();
        }
    }

    public void k() {
        synchronized (this.f11744q) {
            if (!this.f11743p.hasMessages(1)) {
                this.f11743p.sendEmptyMessage(1);
            }
        }
    }

    public abstract void l();

    public void loadAd(int i10, int i11) {
        if (getParent() == null) {
            try {
                ComponentLocator.a(getContext()).r().a(1024);
            } catch (Throwable unused) {
            }
            this.f11733f = new Point(i10, i11);
            k();
        }
    }

    public void m() {
        if (this.f11728a && !isInEditMode()) {
            removeCallbacks(this.f11742o);
            postDelayed(this.f11742o, (long) c());
            long A = (long) (MetaData.f12393k.A() * 1000);
            synchronized (this.f11744q) {
                this.f11743p.removeMessages(2);
                this.f11743p.sendEmptyMessageDelayed(2, A);
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            ComponentLocator.a(getContext()).r().a(4096);
        } catch (Throwable unused) {
        }
        this.f11728a = true;
        m();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11728a = false;
        b();
        hd hdVar = this.f11738k;
        if (hdVar != null) {
            hdVar.a();
            this.f11738k = null;
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        a(bundle.getInt("bannerId"));
        this.f11730c = (AdRulesResult) bundle.getSerializable("adRulesResult");
        this.f11729b = (AdPreferences) bundle.getSerializable("adPreferences");
        this.f11731d = bundle.getInt("offset");
        this.f11732e = bundle.getBoolean("firstLoad");
        this.f11740m = bundle.getBoolean("shouldReloadBanner");
        super.onRestoreInstanceState(bundle.getParcelable("upperState"));
    }

    public Parcelable onSaveInstanceState() {
        if (isClicked()) {
            setClicked(false);
            this.f11740m = true;
        }
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putInt("bannerId", d());
        bundle.putParcelable("upperState", onSaveInstanceState);
        bundle.putSerializable("adRulesResult", this.f11730c);
        bundle.putSerializable("adPreferences", this.f11729b);
        bundle.putInt("offset", this.f11731d);
        bundle.putBoolean("firstLoad", this.f11732e);
        bundle.putBoolean("shouldReloadBanner", this.f11740m);
        return bundle;
    }

    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            if (this.f11740m) {
                this.f11740m = false;
                j();
            }
            this.f11728a = true;
            m();
            return;
        }
        this.f11728a = false;
        b();
    }

    public abstract void setAdTag(String str);

    public void setClicked(boolean z10) {
        this.f11739l = z10;
    }

    public void setErrorMessage(String str) {
        this.f11741n = str;
    }

    public void setFirstLoad(boolean z10) {
        this.f11732e = z10;
    }

    public final void a(Context context, AttributeSet attributeSet) {
        setAdTag(new o0(context, attributeSet).f11487b);
    }

    public void loadAd() {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        loadAd(qb.b(getContext(), displayMetrics.widthPixels), qb.b(getContext(), displayMetrics.heightPixels));
    }

    public void a() {
        if (isFirstLoad() || AdaptMetaData.f12230a.a().a()) {
            setFirstLoad(false);
            e.f10308d.a(new d(AdPreferences.Placement.INAPP_BANNER, this.f11737j));
        }
    }

    public BannerBase(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(AdPreferences adPreferences) {
        boolean z10 = this.f11728a;
        int i10 = a0.f10005a;
        adPreferences.setHardwareAccelerated((1 != getLayerType() && z10) ? isHardwareAccelerated() : false);
    }

    public BannerBase(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11728a = false;
        this.f11731d = 0;
        this.f11732e = true;
        this.f11734g = false;
        int nextInt = new Random().nextInt(100000) + 159868227;
        this.f11735h = nextInt;
        this.f11736i = nextInt + 1;
        this.f11737j = null;
        this.f11739l = false;
        this.f11740m = false;
        this.f11742o = new a();
        this.f11743p = new Handler(Looper.getMainLooper(), new b());
        this.f11744q = new Object();
        a(context, attributeSet);
    }
}
