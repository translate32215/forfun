package com.startapp.sdk.ads.banner.banner3d;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.startapp.a0;
import com.startapp.i4;
import com.startapp.j9;
import com.startapp.m0;
import com.startapp.p0;
import com.startapp.qb;
import com.startapp.r0;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.banner.BannerInterface;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.JsonAd;
import com.startapp.sdk.adsbase.a;
import com.startapp.sdk.adsbase.adinformation.AdInformationObject;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.w9;
import h.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: Sta */
public class Banner3D extends BannerBase implements AdEventListener, BannerInterface {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public AdInformationOverrides N;
    public List<m0> O;
    public int P;
    public BannerListener Q;
    public Runnable R;

    /* renamed from: r  reason: collision with root package name */
    public BannerOptions f11756r;

    /* renamed from: s  reason: collision with root package name */
    public Banner3DAd f11757s;

    /* renamed from: t  reason: collision with root package name */
    public List<AdDetails> f11758t;

    /* renamed from: u  reason: collision with root package name */
    public AdPreferences f11759u;

    /* renamed from: v  reason: collision with root package name */
    public Camera f11760v;

    /* renamed from: w  reason: collision with root package name */
    public Matrix f11761w;

    /* renamed from: x  reason: collision with root package name */
    public Paint f11762x;

    /* renamed from: y  reason: collision with root package name */
    public float f11763y;

    /* renamed from: z  reason: collision with root package name */
    public float f11764z;

    /* compiled from: Sta */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        };
        public AdRulesResult adRulesResult;
        public boolean bDefaultLoad;
        public boolean bIsVisible;
        private int currentImage;
        private AdDetails[] details;
        public m0[] faces;
        private int firstRotation;
        private int firstRotationFinished;
        public boolean loaded;
        public boolean loading;
        public BannerOptions options;
        public AdInformationOverrides overrides;
        private float rotation;

        public int describeContents() {
            return 0;
        }

        public int getCurrentImage() {
            return this.currentImage;
        }

        public List<AdDetails> getDetails() {
            return Arrays.asList(this.details);
        }

        public float getRotation() {
            return this.rotation;
        }

        public boolean isFirstRotation() {
            return this.firstRotation == 1;
        }

        public boolean isFirstRotationFinished() {
            return this.firstRotationFinished == 1;
        }

        public void setCurrentImage(int i10) {
            this.currentImage = i10;
        }

        public void setDetails(List<AdDetails> list) {
            this.details = new AdDetails[list.size()];
            for (int i10 = 0; i10 < list.size(); i10++) {
                this.details[i10] = list.get(i10);
            }
        }

        public void setFirstRotation(boolean z10) {
            this.firstRotation = z10 ? 1 : 0;
        }

        public void setFirstRotationFinished(boolean z10) {
            this.firstRotationFinished = z10 ? 1 : 0;
        }

        public void setRotation(float f10) {
            this.rotation = f10;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            if (!this.bIsVisible) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(this.currentImage);
            parcel.writeFloat(this.rotation);
            parcel.writeInt(this.firstRotation);
            parcel.writeInt(this.firstRotationFinished);
            parcel.writeParcelableArray(this.details, i10);
            parcel.writeInt(this.loaded ? 1 : 0);
            parcel.writeInt(this.loading ? 1 : 0);
            parcel.writeInt(this.bDefaultLoad ? 1 : 0);
            m0[] m0VarArr = this.faces;
            if (m0VarArr == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(m0VarArr.length);
                for (m0 writeParcelable : this.faces) {
                    parcel.writeParcelable(writeParcelable, i10);
                }
            }
            parcel.writeSerializable(this.overrides);
            parcel.writeSerializable(this.options);
            parcel.writeSerializable(this.adRulesResult);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            if (parcel.readInt() == 1) {
                this.bIsVisible = true;
                this.currentImage = parcel.readInt();
                this.rotation = parcel.readFloat();
                this.firstRotation = parcel.readInt();
                this.firstRotationFinished = parcel.readInt();
                Parcelable[] readParcelableArray = parcel.readParcelableArray(AdDetails.class.getClassLoader());
                if (readParcelableArray != null) {
                    AdDetails[] adDetailsArr = new AdDetails[readParcelableArray.length];
                    this.details = adDetailsArr;
                    System.arraycopy(readParcelableArray, 0, adDetailsArr, 0, readParcelableArray.length);
                }
                int readInt = parcel.readInt();
                this.loaded = false;
                if (readInt == 1) {
                    this.loaded = true;
                }
                int readInt2 = parcel.readInt();
                this.loading = false;
                if (readInt2 == 1) {
                    this.loading = true;
                }
                int readInt3 = parcel.readInt();
                this.bDefaultLoad = false;
                if (readInt3 == 1) {
                    this.bDefaultLoad = true;
                }
                int readInt4 = parcel.readInt();
                if (readInt4 > 0) {
                    this.faces = new m0[readInt4];
                    for (int i10 = 0; i10 < readInt4; i10++) {
                        this.faces[i10] = (m0) parcel.readParcelable(m0.class.getClassLoader());
                    }
                }
                this.overrides = (AdInformationOverrides) parcel.readSerializable();
                this.options = (BannerOptions) parcel.readSerializable();
                this.adRulesResult = (AdRulesResult) parcel.readSerializable();
                return;
            }
            this.bIsVisible = false;
        }
    }

    public Banner3D(Activity activity) {
        this((Context) activity);
    }

    public void a(List<AdDetails> list, boolean z10) {
        Banner3DAd banner3DAd;
        this.f11758t = list;
        if (list != null) {
            r0 r0Var = new r0();
            StringBuilder sb2 = new StringBuilder();
            for (AdDetails g10 : list) {
                sb2.append(a.a(g10.g(), (String) null));
                sb2.append(",");
            }
            if (Banner3DSize.a(getContext(), getParent(), this.f11756r, this, r0Var)) {
                setMinimumWidth(qb.a(getContext(), this.f11756r.o()));
                setMinimumHeight(qb.a(getContext(), this.f11756r.d()));
                if (getLayoutParams() != null && getLayoutParams().width == -1) {
                    setMinimumWidth(qb.a(getContext(), r0Var.f11637a.x));
                }
                if (getLayoutParams() != null && getLayoutParams().height == -1) {
                    setMinimumHeight(qb.a(getContext(), r0Var.f11637a.y));
                }
                if (getLayoutParams() != null) {
                    if (getLayoutParams().width > 0) {
                        setMinimumWidth(getLayoutParams().width);
                    }
                    if (getLayoutParams().height > 0) {
                        setMinimumHeight(getLayoutParams().height);
                    }
                    if (getLayoutParams().width > 0 && getLayoutParams().height > 0 && (banner3DAd = this.f11757s) != null) {
                        banner3DAd.b(true);
                    }
                }
                List<m0> list2 = this.O;
                if (list2 == null || list2.size() == 0) {
                    n();
                    removeAllViews();
                    this.O = new ArrayList();
                    for (AdDetails m0Var : list) {
                        this.O.add(new m0(getContext(), this, m0Var, this.f11756r, new TrackingParams(this.f11737j)));
                    }
                    this.P = 0;
                } else {
                    for (m0 a10 : this.O) {
                        a10.a(getContext(), this.f11756r, this);
                    }
                }
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(r(), o());
                layoutParams.addRule(13);
                int p10 = p();
                layoutParams.rightMargin = p10;
                layoutParams.leftMargin = p10;
                int q10 = q();
                layoutParams.topMargin = q10;
                layoutParams.bottomMargin = q10;
                addView(relativeLayout, layoutParams);
                new AdInformationObject(getContext(), AdInformationObject.Size.SMALL, AdPreferences.Placement.INAPP_BANNER, this.N, (ConsentData) null).a(relativeLayout);
                if (this.f11762x == null) {
                    Paint paint = new Paint();
                    this.f11762x = paint;
                    paint.setAntiAlias(true);
                    this.f11762x.setFilterBitmap(true);
                }
                if (!this.G) {
                    this.G = true;
                    u();
                }
                if (this.H) {
                    t();
                }
                if (z10) {
                    p0.c(getContext(), this.Q, this, sb2.toString());
                    return;
                }
                return;
            }
            setErrorMessage("Error in banner screen size");
            setVisibility(8);
            if (z10) {
                p0.b(getContext(), this.Q, this, sb2.toString());
                return;
            }
            return;
        }
        setErrorMessage("No ads to load");
        if (z10) {
            p0.b(getContext(), this.Q, this, (String) null);
        }
    }

    public int d() {
        return this.f11735h;
    }

    public String e() {
        return "StartApp Banner3D";
    }

    public int f() {
        return BannerMetaData.f11748b.a().j();
    }

    public String getBidToken() {
        Banner3DAd banner3DAd = this.f11757s;
        if (banner3DAd != null) {
            return banner3DAd.getBidToken();
        }
        return null;
    }

    public int getHeightInDp() {
        return 50;
    }

    public int getWidthInDp() {
        return 300;
    }

    public void hideBanner() {
        this.H = false;
        setVisibility(8);
    }

    public void i() {
        if (!this.K) {
            this.f11756r = BannerMetaData.f11748b.b();
            this.f11758t = new ArrayList();
            if (this.f11759u == null) {
                this.f11759u = new AdPreferences();
            }
            this.N = AdInformationOverrides.a();
            n();
            this.O = new ArrayList();
            this.K = true;
            setBackgroundColor(0);
            if (getId() == -1) {
                setId(this.f11735h);
            }
            if (this.I) {
                getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    public void onGlobalLayout() {
                        ViewTreeObserver viewTreeObserver = Banner3D.this.getViewTreeObserver();
                        int i10 = a0.f10005a;
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                        Banner3D banner3D = Banner3D.this;
                        banner3D.a(banner3D.f11759u);
                        Banner3D banner3D2 = Banner3D.this;
                        if (!banner3D2.J) {
                            banner3D2.k();
                        }
                    }
                });
            }
        }
    }

    public void l() {
        int i10 = 0;
        this.J = false;
        this.K = true;
        this.G = false;
        this.A = true;
        this.C = true;
        this.D = false;
        this.E = false;
        this.f11734g = false;
        this.f11730c = null;
        n();
        this.O = new ArrayList();
        Context context = getContext();
        Banner3DAd banner3DAd = this.f11757s;
        if (banner3DAd != null) {
            i10 = banner3DAd.h();
        }
        this.f11757s = new Banner3DAd(context, i10);
        if (this.f11759u == null) {
            this.f11759u = new AdPreferences();
        }
        this.f11757s.load(this.f11759u, this);
    }

    public final void n() {
        List<m0> list = this.O;
        if (list != null && !list.isEmpty()) {
            for (m0 next : this.O) {
                if (next != null) {
                    Bitmap bitmap = next.f10857c;
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    Bitmap bitmap2 = next.f10858d;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    next.f10857c = null;
                    next.f10858d = null;
                    j9 j9Var = next.f10861g;
                    if (j9Var != null) {
                        j9Var.a("AD_CLOSED_TOO_QUICKLY", (JSONObject) null);
                    }
                    Banner3DView banner3DView = next.f10862h;
                    if (banner3DView != null) {
                        banner3DView.removeAllViews();
                        next.f10862h = null;
                    }
                }
            }
        }
    }

    public final int o() {
        return (int) (this.f11756r.e() * ((float) qb.a(getContext(), this.f11756r.d())));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.L = true;
        BannerOptions bannerOptions = this.f11756r;
        if (bannerOptions == null || !bannerOptions.s()) {
            this.C = false;
            this.D = true;
        }
        u();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.L = false;
        removeCallbacks(this.R);
        List<m0> list = this.O;
        if (list != null) {
            for (m0 m0Var : list) {
                j9 j9Var = m0Var.f10861g;
                if (j9Var != null) {
                    j9Var.a("AD_CLOSED_TOO_QUICKLY", (JSONObject) null);
                }
            }
        }
    }

    public void onDraw(Canvas canvas) {
        Bitmap bitmap;
        Bitmap bitmap2;
        super.onDraw(canvas);
        if (!this.f11734g && !this.K) {
            this.f11734g = true;
            u();
        }
        if (!isInEditMode() && this.H) {
            List<m0> list = this.O;
            if (!(list == null || list.size() == 0)) {
                try {
                    int r10 = r();
                    int o10 = o();
                    int p10 = p();
                    int q10 = q();
                    float a10 = e.a(1.0f, this.f11756r.g(), (float) Math.pow((double) (Math.abs(this.f11763y - 45.0f) / 45.0f), (double) this.f11756r.l()), this.f11756r.g());
                    if (!this.D) {
                        a10 = this.f11756r.g();
                    }
                    float f10 = a10;
                    Bitmap bitmap3 = this.O.get((this.O.size() + (this.P - 1)) % this.O.size()).f10858d;
                    Bitmap bitmap4 = this.O.get(this.P).f10858d;
                    if (bitmap4 != null && bitmap3 != null) {
                        float f11 = this.f11763y;
                        if (f11 < 45.0f) {
                            if (f11 > 3.0f) {
                                bitmap2 = bitmap3;
                                a(canvas, bitmap4, q10, p10, r10 / 2, o10 / 2, f10, (f11 - 90.0f) * ((float) this.f11756r.c().getRotationMultiplier()));
                            } else {
                                bitmap2 = bitmap3;
                            }
                            a(canvas, bitmap2, q10, p10, r10 / 2, o10 / 2, f10, this.f11763y * ((float) this.f11756r.c().getRotationMultiplier()));
                            return;
                        }
                        Bitmap bitmap5 = bitmap3;
                        if (f11 < 87.0f) {
                            bitmap = bitmap4;
                            a(canvas, bitmap5, q10, p10, r10 / 2, o10 / 2, f10, f11 * ((float) this.f11756r.c().getRotationMultiplier()));
                        } else {
                            bitmap = bitmap4;
                        }
                        a(canvas, bitmap, q10, p10, r10 / 2, o10 / 2, f10, (this.f11763y - 90.0f) * ((float) this.f11756r.c().getRotationMultiplier()));
                        if (!this.C) {
                            this.D = true;
                        }
                    }
                } catch (Throwable th) {
                    i4.a(th);
                }
            }
        }
    }

    public void onFailedToReceiveAd(Ad ad2) {
        if (ad2 != null) {
            setErrorMessage(ad2.getErrorMessage());
        }
        p0.b(getContext(), this.Q, this, (String) null);
    }

    public void onReceiveAd(Ad ad2) {
        this.J = true;
        this.K = false;
        this.N = this.f11757s.getAdInfoOverride();
        List<AdDetails> g10 = ((JsonAd) ad2).g();
        this.f11758t = g10;
        a(g10, this.M);
        this.M = false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        boolean z10 = savedState.bIsVisible;
        this.H = z10;
        if (z10) {
            this.f11758t = savedState.getDetails();
            this.f11763y = savedState.getRotation();
            this.C = savedState.isFirstRotation();
            this.D = savedState.isFirstRotationFinished();
            this.P = savedState.getCurrentImage();
            m0[] m0VarArr = savedState.faces;
            n();
            this.O = new ArrayList();
            if (m0VarArr != null) {
                for (m0 add : m0VarArr) {
                    this.O.add(add);
                }
            }
            this.J = savedState.loaded;
            this.K = savedState.loading;
            this.I = savedState.bDefaultLoad;
            this.N = savedState.overrides;
            this.f11756r = savedState.options;
            if (this.f11758t.size() == 0) {
                this.I = true;
                h();
                return;
            }
            post(new Runnable() {
                public void run() {
                    Banner3D banner3D = Banner3D.this;
                    banner3D.a(banner3D.f11758t, false);
                }
            });
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.bIsVisible = this.H;
        savedState.setDetails(this.f11758t);
        savedState.setRotation(this.f11763y);
        savedState.setFirstRotation(this.C);
        savedState.setFirstRotationFinished(this.D);
        savedState.setCurrentImage(this.P);
        savedState.options = this.f11756r;
        savedState.faces = new m0[this.O.size()];
        savedState.loaded = this.J;
        savedState.loading = this.K;
        savedState.overrides = this.N;
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            savedState.faces[i10] = this.O.get(i10);
        }
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        List<m0> list;
        int r10 = r();
        int o10 = o();
        int p10 = p();
        int q10 = q();
        if (!(motionEvent.getX() >= ((float) p10) && motionEvent.getY() >= ((float) q10) && motionEvent.getX() <= ((float) (p10 + r10)) && motionEvent.getY() <= ((float) (q10 + o10))) || (list = this.O) == null || list.size() == 0) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.F = true;
            this.f11764z = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2 && this.f11764z - motionEvent.getY() >= 10.0f) {
                this.F = false;
                this.f11764z = motionEvent.getY();
            }
        } else if (this.F) {
            if (this.f11763y < 45.0f) {
                s();
            }
            this.F = false;
            this.A = false;
            setClicked(true);
            postDelayed(new Runnable() {
                public void run() {
                    Banner3D.this.A = true;
                }
            }, AdsCommonMetaData.f12098h.z());
            m0 m0Var = this.O.get(this.P);
            Context context = getContext();
            String m10 = m0Var.f10855a.m();
            boolean a10 = a.a(context, AdPreferences.Placement.INAPP_BANNER);
            j9 j9Var = m0Var.f10861g;
            String str = null;
            if (j9Var != null) {
                j9Var.a((String) null, (JSONObject) null);
            }
            if (m10 != null && !"null".equals(m10) && !TextUtils.isEmpty(m10)) {
                a.a(m10, m0Var.f10855a.l(), m0Var.f10855a.g(), context, m0Var.f10860f);
            } else if (!m0Var.f10855a.A() || a10) {
                a.a(context, m0Var.f10855a.g(), m0Var.f10855a.u(), m0Var.f10860f, m0Var.f10855a.B() && !a10, false);
            } else {
                a.a(context, m0Var.f10855a.g(), m0Var.f10855a.u(), m0Var.f10855a.p(), m0Var.f10860f, AdsCommonMetaData.f12098h.z(), AdsCommonMetaData.f12098h.y(), m0Var.f10855a.B(), m0Var.f10855a.C(), false, (Runnable) null);
            }
            if (this.P < this.f11758t.size()) {
                str = a.a(this.f11758t.get(this.P).g(), (String) null);
            }
            p0.a(getContext(), this.Q, this, str);
        }
        return true;
    }

    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            this.L = true;
            BannerOptions bannerOptions = this.f11756r;
            if (bannerOptions == null || !bannerOptions.s()) {
                this.C = false;
                this.D = true;
            }
            u();
            return;
        }
        this.L = false;
        if (!this.B) {
            removeCallbacks(this.R);
        }
    }

    public final int p() {
        return (getWidth() - r()) / 2;
    }

    public final int q() {
        return (getHeight() - o()) / 2;
    }

    public final int r() {
        return (int) (this.f11756r.p() * ((float) qb.a(getContext(), this.f11756r.o())));
    }

    public final void s() {
        this.P = (this.O.size() + (this.P - 1)) % this.O.size();
    }

    public void setAdTag(String str) {
        this.f11737j = str;
    }

    public void setBannerListener(BannerListener bannerListener) {
        this.Q = bannerListener;
    }

    public void showBanner() {
        this.H = true;
        t();
    }

    public final void t() {
        setVisibility(0);
        if (this.f11757s != null) {
            w9 s10 = ComponentLocator.a(getContext()).s();
            AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
            String adId = this.f11757s.getAdId();
            s10.getClass();
            if (adId != null) {
                s10.f12760a.put(new w9.a(placement, -1), adId);
            }
        }
    }

    public final void u() {
        if (this.L && this.f11734g) {
            removeCallbacks(this.R);
            post(this.R);
        }
    }

    public Banner3D(Activity activity, AdPreferences adPreferences) {
        this((Context) activity, adPreferences);
    }

    public Banner3D(Activity activity, BannerListener bannerListener) {
        this((Context) activity, bannerListener);
    }

    public Banner3D(Activity activity, AdPreferences adPreferences, BannerListener bannerListener) {
        this((Context) activity, adPreferences, bannerListener);
    }

    public Banner3D(Activity activity, boolean z10) {
        this((Context) activity, z10);
    }

    public Banner3D(Activity activity, boolean z10, AdPreferences adPreferences) {
        this((Context) activity, z10, adPreferences);
    }

    public Banner3D(Activity activity, AttributeSet attributeSet) {
        this((Context) activity, attributeSet);
    }

    public Banner3D(Activity activity, AttributeSet attributeSet, int i10) {
        this((Context) activity, attributeSet, i10);
    }

    @Deprecated
    public Banner3D(Context context) {
        this(context, true, (AdPreferences) null);
    }

    @Deprecated
    public Banner3D(Context context, AdPreferences adPreferences) {
        this(context, true, adPreferences);
    }

    @Deprecated
    public Banner3D(Context context, BannerListener bannerListener) {
        this(context, true, (AdPreferences) null);
        setBannerListener(bannerListener);
    }

    @Deprecated
    public Banner3D(Context context, AdPreferences adPreferences, BannerListener bannerListener) {
        this(context, true, adPreferences);
        setBannerListener(bannerListener);
    }

    @Deprecated
    public Banner3D(Context context, boolean z10) {
        this(context, z10, (AdPreferences) null);
    }

    @Deprecated
    public Banner3D(Context context, boolean z10, AdPreferences adPreferences) {
        super(context);
        this.f11760v = null;
        this.f11761w = null;
        this.f11762x = null;
        this.f11763y = 45.0f;
        this.f11764z = 0.0f;
        this.A = true;
        this.B = false;
        this.C = true;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = true;
        this.I = true;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = true;
        this.O = new ArrayList();
        this.P = 0;
        this.R = new Runnable() {
            /* JADX WARNING: Removed duplicated region for block: B:51:0x0130  */
            /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r11 = this;
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.J
                    if (r1 == 0) goto L_0x0134
                    java.util.List<com.startapp.m0> r0 = r0.O
                    int r0 = r0.size()
                    if (r0 != 0) goto L_0x0010
                    goto L_0x0134
                L_0x0010:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.H
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L_0x008c
                    boolean r0 = r0.isShown()
                    if (r0 == 0) goto L_0x008c
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.f11734g
                    if (r1 == 0) goto L_0x008c
                    java.util.List<com.startapp.m0> r1 = r0.O
                    int r0 = r0.P
                    java.lang.Object r0 = r1.get(r0)
                    com.startapp.m0 r0 = (com.startapp.m0) r0
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r1 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    android.content.Context r5 = r1.getContext()
                    com.startapp.sdk.adsbase.model.AdDetails r4 = r0.f10855a
                    java.lang.String[] r4 = r4.w()
                    int r4 = r4.length
                    if (r4 <= 0) goto L_0x007b
                    java.util.concurrent.atomic.AtomicBoolean r4 = r0.f10859e
                    boolean r4 = r4.compareAndSet(r2, r3)
                    if (r4 == 0) goto L_0x007b
                    com.startapp.j9 r10 = new com.startapp.j9
                    com.startapp.sdk.adsbase.model.AdDetails r4 = r0.f10855a
                    java.lang.String[] r6 = r4.w()
                    com.startapp.sdk.adsbase.commontracking.TrackingParams r7 = r0.f10860f
                    com.startapp.sdk.adsbase.model.AdDetails r4 = r0.f10855a
                    java.lang.Long r4 = r4.h()
                    if (r4 == 0) goto L_0x0068
                    java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
                    com.startapp.sdk.adsbase.model.AdDetails r8 = r0.f10855a
                    java.lang.Long r8 = r8.h()
                    long r8 = r8.longValue()
                    long r8 = r4.toMillis(r8)
                    goto L_0x0074
                L_0x0068:
                    java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
                    com.startapp.sdk.adsbase.remoteconfig.MetaData r8 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f12393k
                    long r8 = r8.p()
                    long r8 = r4.toMillis(r8)
                L_0x0074:
                    r4 = r10
                    r4.<init>(r5, r6, r7, r8)
                    r0.f10861g = r10
                    goto L_0x007c
                L_0x007b:
                    r10 = 0
                L_0x007c:
                    if (r10 == 0) goto L_0x0081
                    r1.a((com.startapp.j9) r10)
                L_0x0081:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.E
                    if (r1 != 0) goto L_0x008c
                    r0.E = r3
                    r0.a()
                L_0x008c:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.A
                    if (r1 == 0) goto L_0x00d7
                    com.startapp.sdk.ads.banner.BannerOptions r1 = r0.f11756r
                    int r1 = r1.m()
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r4 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r5 = r4.D
                    if (r5 != 0) goto L_0x00a5
                    com.startapp.sdk.ads.banner.BannerOptions r4 = r4.f11756r
                    int r4 = r4.k()
                    goto L_0x00a6
                L_0x00a5:
                    r4 = 1
                L_0x00a6:
                    int r1 = r1 * r4
                    float r1 = (float) r1
                    float r4 = r0.f11763y
                    float r4 = r4 + r1
                    r0.f11763y = r4
                    r1 = 1119092736(0x42b40000, float:90.0)
                    int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                    if (r4 < 0) goto L_0x00c5
                    int r4 = r0.P
                    int r4 = r4 + r3
                    java.util.List<com.startapp.m0> r5 = r0.O
                    int r5 = r5.size()
                    int r4 = r4 % r5
                    r0.P = r4
                    float r4 = r0.f11763y
                    float r4 = r4 - r1
                    r0.f11763y = r4
                L_0x00c5:
                    float r4 = r0.f11763y
                    r5 = 0
                    int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                    if (r4 > 0) goto L_0x00d4
                    r0.s()
                    float r4 = r0.f11763y
                    float r4 = r4 + r1
                    r0.f11763y = r4
                L_0x00d4:
                    r0.invalidate()
                L_0x00d7:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    float r1 = r0.f11763y
                    com.startapp.sdk.ads.banner.BannerOptions r0 = r0.f11756r
                    int r0 = r0.m()
                    int r0 = 90 - r0
                    float r0 = (float) r0
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 <= 0) goto L_0x0112
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    float r1 = r0.f11763y
                    com.startapp.sdk.ads.banner.BannerOptions r0 = r0.f11756r
                    int r0 = r0.m()
                    int r0 = r0 + 90
                    float r0 = (float) r0
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 >= 0) goto L_0x0112
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.C
                    if (r1 != 0) goto L_0x0112
                    boolean r1 = r0.L
                    if (r1 == 0) goto L_0x010d
                    com.startapp.sdk.ads.banner.BannerOptions r1 = r0.f11756r
                    int r1 = r1.b()
                    long r4 = (long) r1
                    r0.postDelayed(r11, r4)
                L_0x010d:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    r0.B = r2
                    goto L_0x0122
                L_0x0112:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    com.startapp.sdk.ads.banner.BannerOptions r1 = r0.f11756r
                    int r1 = r1.n()
                    long r4 = (long) r1
                    r0.postDelayed(r11, r4)
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    r0.B = r3
                L_0x0122:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    int r1 = r0.P
                    int r1 = r1 + r3
                    java.util.List<com.startapp.m0> r0 = r0.O
                    int r0 = r0.size()
                    int r1 = r1 % r0
                    if (r1 != 0) goto L_0x0134
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    r0.C = r2
                L_0x0134:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.banner.banner3d.Banner3D.AnonymousClass1.run():void");
            }
        };
        try {
            this.I = z10;
            if (adPreferences == null) {
                this.f11759u = new AdPreferences();
            } else {
                this.f11759u = adPreferences;
            }
            h();
        } catch (Throwable th) {
            i4.a(th);
        }
    }

    @Deprecated
    public Banner3D(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public Banner3D(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11760v = null;
        this.f11761w = null;
        this.f11762x = null;
        this.f11763y = 45.0f;
        this.f11764z = 0.0f;
        this.A = true;
        this.B = false;
        this.C = true;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = true;
        this.I = true;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = true;
        this.O = new ArrayList();
        this.P = 0;
        this.R = new Runnable() {
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r11 = this;
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.J
                    if (r1 == 0) goto L_0x0134
                    java.util.List<com.startapp.m0> r0 = r0.O
                    int r0 = r0.size()
                    if (r0 != 0) goto L_0x0010
                    goto L_0x0134
                L_0x0010:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.H
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L_0x008c
                    boolean r0 = r0.isShown()
                    if (r0 == 0) goto L_0x008c
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.f11734g
                    if (r1 == 0) goto L_0x008c
                    java.util.List<com.startapp.m0> r1 = r0.O
                    int r0 = r0.P
                    java.lang.Object r0 = r1.get(r0)
                    com.startapp.m0 r0 = (com.startapp.m0) r0
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r1 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    android.content.Context r5 = r1.getContext()
                    com.startapp.sdk.adsbase.model.AdDetails r4 = r0.f10855a
                    java.lang.String[] r4 = r4.w()
                    int r4 = r4.length
                    if (r4 <= 0) goto L_0x007b
                    java.util.concurrent.atomic.AtomicBoolean r4 = r0.f10859e
                    boolean r4 = r4.compareAndSet(r2, r3)
                    if (r4 == 0) goto L_0x007b
                    com.startapp.j9 r10 = new com.startapp.j9
                    com.startapp.sdk.adsbase.model.AdDetails r4 = r0.f10855a
                    java.lang.String[] r6 = r4.w()
                    com.startapp.sdk.adsbase.commontracking.TrackingParams r7 = r0.f10860f
                    com.startapp.sdk.adsbase.model.AdDetails r4 = r0.f10855a
                    java.lang.Long r4 = r4.h()
                    if (r4 == 0) goto L_0x0068
                    java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
                    com.startapp.sdk.adsbase.model.AdDetails r8 = r0.f10855a
                    java.lang.Long r8 = r8.h()
                    long r8 = r8.longValue()
                    long r8 = r4.toMillis(r8)
                    goto L_0x0074
                L_0x0068:
                    java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
                    com.startapp.sdk.adsbase.remoteconfig.MetaData r8 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f12393k
                    long r8 = r8.p()
                    long r8 = r4.toMillis(r8)
                L_0x0074:
                    r4 = r10
                    r4.<init>(r5, r6, r7, r8)
                    r0.f10861g = r10
                    goto L_0x007c
                L_0x007b:
                    r10 = 0
                L_0x007c:
                    if (r10 == 0) goto L_0x0081
                    r1.a((com.startapp.j9) r10)
                L_0x0081:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.E
                    if (r1 != 0) goto L_0x008c
                    r0.E = r3
                    r0.a()
                L_0x008c:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.A
                    if (r1 == 0) goto L_0x00d7
                    com.startapp.sdk.ads.banner.BannerOptions r1 = r0.f11756r
                    int r1 = r1.m()
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r4 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r5 = r4.D
                    if (r5 != 0) goto L_0x00a5
                    com.startapp.sdk.ads.banner.BannerOptions r4 = r4.f11756r
                    int r4 = r4.k()
                    goto L_0x00a6
                L_0x00a5:
                    r4 = 1
                L_0x00a6:
                    int r1 = r1 * r4
                    float r1 = (float) r1
                    float r4 = r0.f11763y
                    float r4 = r4 + r1
                    r0.f11763y = r4
                    r1 = 1119092736(0x42b40000, float:90.0)
                    int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                    if (r4 < 0) goto L_0x00c5
                    int r4 = r0.P
                    int r4 = r4 + r3
                    java.util.List<com.startapp.m0> r5 = r0.O
                    int r5 = r5.size()
                    int r4 = r4 % r5
                    r0.P = r4
                    float r4 = r0.f11763y
                    float r4 = r4 - r1
                    r0.f11763y = r4
                L_0x00c5:
                    float r4 = r0.f11763y
                    r5 = 0
                    int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                    if (r4 > 0) goto L_0x00d4
                    r0.s()
                    float r4 = r0.f11763y
                    float r4 = r4 + r1
                    r0.f11763y = r4
                L_0x00d4:
                    r0.invalidate()
                L_0x00d7:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    float r1 = r0.f11763y
                    com.startapp.sdk.ads.banner.BannerOptions r0 = r0.f11756r
                    int r0 = r0.m()
                    int r0 = 90 - r0
                    float r0 = (float) r0
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 <= 0) goto L_0x0112
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    float r1 = r0.f11763y
                    com.startapp.sdk.ads.banner.BannerOptions r0 = r0.f11756r
                    int r0 = r0.m()
                    int r0 = r0 + 90
                    float r0 = (float) r0
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 >= 0) goto L_0x0112
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.C
                    if (r1 != 0) goto L_0x0112
                    boolean r1 = r0.L
                    if (r1 == 0) goto L_0x010d
                    com.startapp.sdk.ads.banner.BannerOptions r1 = r0.f11756r
                    int r1 = r1.b()
                    long r4 = (long) r1
                    r0.postDelayed(r11, r4)
                L_0x010d:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    r0.B = r2
                    goto L_0x0122
                L_0x0112:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    com.startapp.sdk.ads.banner.BannerOptions r1 = r0.f11756r
                    int r1 = r1.n()
                    long r4 = (long) r1
                    r0.postDelayed(r11, r4)
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    r0.B = r3
                L_0x0122:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    int r1 = r0.P
                    int r1 = r1 + r3
                    java.util.List<com.startapp.m0> r0 = r0.O
                    int r0 = r0.size()
                    int r1 = r1 % r0
                    if (r1 != 0) goto L_0x0134
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    r0.C = r2
                L_0x0134:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.banner.banner3d.Banner3D.AnonymousClass1.run():void");
            }
        };
        try {
            h();
        } catch (Throwable th) {
            i4.a(th);
        }
    }

    public final void a(Canvas canvas, Bitmap bitmap, int i10, int i11, int i12, int i13, float f10, float f11) {
        if (this.f11760v == null) {
            this.f11760v = new Camera();
        }
        this.f11760v.save();
        this.f11760v.translate(0.0f, 0.0f, (float) i13);
        this.f11760v.rotateX(f11);
        float f12 = (float) (-i13);
        this.f11760v.translate(0.0f, 0.0f, f12);
        if (this.f11761w == null) {
            this.f11761w = new Matrix();
        }
        this.f11760v.getMatrix(this.f11761w);
        this.f11760v.restore();
        this.f11761w.preTranslate((float) (-i12), f12);
        this.f11761w.postScale(f10, f10);
        this.f11761w.postTranslate((float) (i11 + i12), (float) (i10 + i13));
        canvas.drawBitmap(bitmap, this.f11761w, this.f11762x);
    }

    public void a(int i10) {
        this.f11735h = i10;
    }
}
