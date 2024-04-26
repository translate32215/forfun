package com.startapp.sdk.ads.banner.bannerstandard;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.startapp.a0;
import com.startapp.b1;
import com.startapp.i4;
import com.startapp.id;
import com.startapp.j4;
import com.startapp.j9;
import com.startapp.l6;
import com.startapp.n5;
import com.startapp.n6;
import com.startapp.p0;
import com.startapp.q0;
import com.startapp.q6;
import com.startapp.q7;
import com.startapp.qb;
import com.startapp.r0;
import com.startapp.r6;
import com.startapp.s6;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.banner.BannerInterface;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.ads.banner.bannerstandard.CloseableLayout;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.a;
import com.startapp.sdk.adsbase.adinformation.AdInformationObject;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.mraid.bridge.MraidState;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.u6;
import com.startapp.v0;
import com.startapp.v6;
import com.startapp.w2;
import com.startapp.w9;
import com.startapp.wb;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import vb.c;

/* compiled from: Sta */
public class BannerStandard extends BannerBase implements AdEventListener, BannerInterface {
    public static final /* synthetic */ int S = 0;
    public AdPreferences A;
    public final r0 B;
    public BannerListener C;
    public boolean D;
    public AdInformationObject E;
    public RelativeLayout F;
    public RelativeLayout G;
    public CloseableLayout H;
    public j9 I;
    public q7 J;
    public id K;
    public id L;
    public MraidBannerController M;
    public MraidBannerController N;
    public ViewGroup O;
    public final j9.a P;
    public final Runnable Q;
    public final Runnable R;

    /* renamed from: r  reason: collision with root package name */
    public BannerStandardAd f11776r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f11777s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f11778t;
    public WebView twoPartWebView;

    /* renamed from: u  reason: collision with root package name */
    public boolean f11779u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f11780v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f11781w;
    public WebView webView;

    /* renamed from: x  reason: collision with root package name */
    public final Handler f11782x;

    /* renamed from: y  reason: collision with root package name */
    public long f11783y;

    /* renamed from: z  reason: collision with root package name */
    public BannerOptions f11784z;

    /* compiled from: Sta */
    public class MraidBannerController extends v0 {
        private WebView activeWebView;
        /* access modifiers changed from: private */
        public MraidState mraidState = MraidState.LOADING;
        private boolean mraidVisibility = false;
        /* access modifiers changed from: private */
        public r6 nativeFeatureManager;
        private s6 orientationProperties;
        private u6 resizeProperties;

        /* compiled from: Sta */
        public class BannerWebViewClient extends v6 {
            public BannerWebViewClient(l6 l6Var) {
                super(l6Var);
            }

            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (MraidBannerController.this.mraidState == MraidState.LOADING) {
                    wb.a(webView, true, "mraid.setPlacementType", "inline");
                    q6.a(BannerStandard.this.getContext(), webView, MraidBannerController.this.nativeFeatureManager);
                    MraidBannerController.this.updateDisplayMetrics(webView);
                    MraidState unused = MraidBannerController.this.mraidState = MraidState.DEFAULT;
                    n6.a(MraidBannerController.this.mraidState, webView);
                    wb.a(webView, true, "mraid.fireReadyEvent", new Object[0]);
                }
                BannerStandard bannerStandard = BannerStandard.this;
                bannerStandard.p();
                if (MetaData.f12393k.S()) {
                    try {
                        bannerStandard.b(webView);
                    } catch (Throwable th) {
                        i4.a(th);
                    }
                }
            }
        }

        public MraidBannerController(WebView webView, v0.a aVar) {
            super(aVar);
            this.activeWebView = webView;
            webView.setWebViewClient(new BannerWebViewClient(this));
            this.nativeFeatureManager = new r6(BannerStandard.this.getContext());
            this.orientationProperties = new s6();
        }

        /* access modifiers changed from: private */
        public void fireViewableChangeEvent(boolean z10) {
            if (this.mraidVisibility != z10) {
                this.mraidVisibility = z10;
                wb.a(this.activeWebView, true, "mraid.fireViewableChangeEvent", Boolean.valueOf(z10));
            }
        }

        /* access modifiers changed from: private */
        public void updateDisplayMetrics(WebView webView) {
            Context context = BannerStandard.this.getContext();
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                int i10 = displayMetrics.widthPixels;
                int i11 = displayMetrics.heightPixels;
                int[] iArr = new int[2];
                BannerStandard.this.getLocationOnScreen(iArr);
                int i12 = iArr[0];
                int i13 = iArr[1];
                n6.b(context, i10, i11, webView);
                Point point = BannerStandard.this.B.f11637a;
                n6.b(context, i12, i13, point.x, point.y, webView);
                n6.a(context, i10, i11, webView);
                Point point2 = BannerStandard.this.B.f11637a;
                n6.a(context, i12, i13, point2.x, point2.y, webView);
            } catch (Throwable th) {
                i4.a(th);
            }
        }

        public void close() {
            BannerStandard.a(BannerStandard.this);
        }

        public void expand(String str) {
            BannerStandard bannerStandard = BannerStandard.this;
            int i10 = BannerStandard.S;
            bannerStandard.b();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            boolean z10 = str != null && !TextUtils.isEmpty(str);
            if (z10) {
                bannerStandard.f11778t = false;
                if (bannerStandard.twoPartWebView == null) {
                    bannerStandard.twoPartWebView = ComponentLocator.a(bannerStandard.getContext()).w().b();
                }
                bannerStandard.N = new MraidBannerController(bannerStandard.twoPartWebView, new v0.a() {
                    public boolean onClickEvent(String str) {
                        if (!BannerStandard.this.f11778t) {
                            i4 i4Var = new i4(j4.f10588e);
                            i4Var.f10537d = "fake_click";
                            i4Var.f10540g = a.a(str, (String) null);
                            StringBuilder a10 = b1.a("jsTag=");
                            a10.append(BannerStandard.this.f11779u);
                            i4Var.f10538e = a10.toString();
                            i4Var.a();
                        }
                        BannerStandard bannerStandard = BannerStandard.this;
                        if ((!bannerStandard.f11779u || bannerStandard.f11778t) && str != null) {
                            return BannerStandard.a(bannerStandard, str);
                        }
                        return false;
                    }
                });
                bannerStandard.L = new id(bannerStandard.twoPartWebView, BannerMetaData.f11748b.a(), new id.b() {
                    public boolean onUpdate(boolean z10) {
                        BannerStandard.this.M.fireViewableChangeEvent(z10);
                        BannerStandard.this.N.fireViewableChangeEvent(z10);
                        return BannerStandard.this.f11776r.r();
                    }
                });
                bannerStandard.twoPartWebView.setId(159868226);
                bannerStandard.a(bannerStandard.twoPartWebView);
                bannerStandard.twoPartWebView.loadUrl(str);
            }
            if (bannerStandard.M.getState() == MraidState.DEFAULT) {
                if (z10) {
                    bannerStandard.H.addView(bannerStandard.twoPartWebView, layoutParams);
                } else {
                    RelativeLayout relativeLayout = bannerStandard.G;
                    if (relativeLayout != null) {
                        relativeLayout.removeView(bannerStandard.webView);
                        bannerStandard.G.setVisibility(4);
                    }
                    bannerStandard.H.addView(bannerStandard.webView, layoutParams);
                }
                if (bannerStandard.O == null) {
                    bannerStandard.O = bannerStandard.s();
                }
                bannerStandard.O.addView(bannerStandard.H, new FrameLayout.LayoutParams(-1, -1));
            } else if (bannerStandard.M.getState() == MraidState.RESIZED && z10) {
                bannerStandard.H.removeView(bannerStandard.webView);
                RelativeLayout relativeLayout2 = bannerStandard.G;
                if (relativeLayout2 != null) {
                    relativeLayout2.addView(bannerStandard.webView, layoutParams);
                    bannerStandard.G.setVisibility(4);
                }
                bannerStandard.H.addView(bannerStandard.twoPartWebView, layoutParams);
            }
            bannerStandard.H.setLayoutParams(layoutParams);
            bannerStandard.M.setState(MraidState.EXPANDED);
        }

        public u6 getResizeProperties() {
            return this.resizeProperties;
        }

        public MraidState getState() {
            return this.mraidState;
        }

        public boolean isFeatureSupported(String str) {
            return this.nativeFeatureManager.f11663b.contains(str);
        }

        public void resize() {
            BannerStandard bannerStandard = BannerStandard.this;
            u6 resizeProperties2 = bannerStandard.M.getResizeProperties();
            if (resizeProperties2 == null) {
                n6.a(bannerStandard.webView, "requires: setResizeProperties first", "resize");
                return;
            }
            bannerStandard.b();
            if (bannerStandard.M.getState() != MraidState.LOADING && bannerStandard.M.getState() != MraidState.HIDDEN) {
                if (bannerStandard.M.getState() == MraidState.EXPANDED) {
                    n6.a(bannerStandard.webView, "Not allowed to resize from an already expanded ad", "resize");
                    return;
                }
                int i10 = resizeProperties2.f12652a;
                int i11 = resizeProperties2.f12653b;
                int i12 = resizeProperties2.f12654c;
                int i13 = resizeProperties2.f12655d;
                int[] iArr = new int[2];
                bannerStandard.webView.getLocationOnScreen(iArr);
                Context context = bannerStandard.getContext();
                int b10 = qb.b(context, iArr[0]) + i12;
                int round = Math.round(((float) iArr[1]) / context.getResources().getDisplayMetrics().density) + i13;
                Rect rect = new Rect(b10, round, i10 + b10, i11 + round);
                ViewGroup s10 = bannerStandard.s();
                int round2 = Math.round(((float) s10.getWidth()) / context.getResources().getDisplayMetrics().density);
                int round3 = Math.round(((float) s10.getHeight()) / context.getResources().getDisplayMetrics().density);
                int[] iArr2 = new int[2];
                s10.getLocationOnScreen(iArr2);
                int round4 = Math.round(((float) iArr2[0]) / context.getResources().getDisplayMetrics().density);
                int round5 = Math.round(((float) iArr2[1]) / context.getResources().getDisplayMetrics().density);
                if (!resizeProperties2.f12657f) {
                    if (rect.width() > round2 || rect.height() > round3) {
                        n6.a(bannerStandard.webView, "Not enough room for the ad", "resize");
                        return;
                    }
                    rect.offsetTo(Math.max(round4, Math.min(rect.left, (round4 + round2) - rect.width())), Math.max(round5, Math.min(rect.top, (round5 + round3) - rect.height())));
                }
                Rect rect2 = new Rect();
                try {
                    CloseableLayout.ClosePosition a10 = CloseableLayout.ClosePosition.a(resizeProperties2.f12656e, CloseableLayout.ClosePosition.TOP_RIGHT);
                    int i14 = bannerStandard.H.f11790e;
                    Gravity.apply(a10.a(), i14, i14, rect, rect2);
                    if (!new Rect(round4, round5, round2 + round4, round3 + round5).contains(rect2)) {
                        n6.a(bannerStandard.webView, "The close region to appear within the max allowed size", "resize");
                    } else if (!rect.contains(rect2)) {
                        n6.a(bannerStandard.webView, "The close region to appear within the max allowed size", "resize");
                    } else {
                        bannerStandard.H.setCloseVisible(false);
                        bannerStandard.H.setClosePosition(a10);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.width(), rect.height());
                        layoutParams.leftMargin = rect.left - round4;
                        layoutParams.topMargin = rect.top - round5;
                        if (bannerStandard.M.getState() == MraidState.DEFAULT) {
                            RelativeLayout relativeLayout = bannerStandard.G;
                            if (relativeLayout != null) {
                                relativeLayout.removeView(bannerStandard.webView);
                                bannerStandard.G.setVisibility(4);
                            }
                            bannerStandard.H.addView(bannerStandard.webView, new FrameLayout.LayoutParams(-1, -1));
                            if (bannerStandard.O == null) {
                                bannerStandard.O = bannerStandard.s();
                            }
                            bannerStandard.O.addView(bannerStandard.H, layoutParams);
                        } else if (bannerStandard.M.getState() == MraidState.RESIZED) {
                            bannerStandard.H.setLayoutParams(layoutParams);
                        }
                        bannerStandard.H.setClosePosition(a10);
                        bannerStandard.M.setState(MraidState.RESIZED);
                    }
                } catch (Exception e10) {
                    n6.a(bannerStandard.webView, e10.getMessage(), "resize");
                }
            }
        }

        public void setExpandProperties(Map<String, String> map) {
            String str = map.get("useCustomClose");
            if (str != null) {
                BannerStandard.a(BannerStandard.this, Boolean.parseBoolean(str));
            }
        }

        public void setOrientationProperties(Map<String, String> map) {
            boolean parseBoolean = Boolean.parseBoolean(map.get("allowOrientationChange"));
            String str = map.get("forceOrientation");
            s6 s6Var = this.orientationProperties;
            if (s6Var.f11699a != parseBoolean || s6Var.f11700b != s6.a(str)) {
                s6 s6Var2 = this.orientationProperties;
                s6Var2.f11699a = parseBoolean;
                s6Var2.f11700b = s6.a(str);
                applyOrientationProperties((Activity) BannerStandard.this.getContext(), this.orientationProperties);
            }
        }

        public void setResizeProperties(Map<String, String> map) {
            boolean z10;
            try {
                int parseInt = Integer.parseInt(map.get("width"));
                int parseInt2 = Integer.parseInt(map.get("height"));
                int parseInt3 = Integer.parseInt(map.get("offsetX"));
                int parseInt4 = Integer.parseInt(map.get("offsetY"));
                String str = map.get("allowOffscreen");
                String str2 = map.get("customClosePosition");
                if (str != null) {
                    if (!Boolean.parseBoolean(str)) {
                        z10 = false;
                        this.resizeProperties = new u6(parseInt, parseInt2, parseInt3, parseInt4, str2, z10);
                    }
                }
                z10 = true;
                this.resizeProperties = new u6(parseInt, parseInt2, parseInt3, parseInt4, str2, z10);
            } catch (Exception unused) {
                n6.a(this.activeWebView, "wrong format", "setResizeProperties");
            }
        }

        public void setState(MraidState mraidState2) {
            this.mraidState = mraidState2;
            n6.a(mraidState2, this.activeWebView);
        }

        public void useCustomClose(String str) {
            BannerStandard.a(BannerStandard.this, Boolean.parseBoolean(str));
        }
    }

    public BannerStandard(Activity activity) {
        this((Context) activity);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: java.lang.String[]} */
    /* JADX WARNING: type inference failed for: r1v26 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e5 A[Catch:{ all -> 0x010d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(com.startapp.sdk.ads.banner.bannerstandard.BannerStandard r18, java.lang.String r19) {
        /*
            r0 = r18
            r2 = r19
            r18.getClass()
            r1 = 0
            java.lang.String r3 = com.startapp.sdk.adsbase.a.a((java.lang.String) r2, (java.lang.String) r1)
            android.content.Context r4 = r18.getContext()
            com.startapp.sdk.ads.banner.BannerListener r5 = r0.C
            com.startapp.p0.a(r4, r5, r0, r3)
            com.startapp.j9 r3 = r0.I
            if (r3 == 0) goto L_0x001c
            r3.a(r1, r1)
        L_0x001c:
            com.startapp.id r3 = r0.K
            if (r3 == 0) goto L_0x0023
            r3.a()
        L_0x0023:
            com.startapp.id r3 = r0.L
            if (r3 == 0) goto L_0x002a
            r3.a()
        L_0x002a:
            r18.p()
            android.content.Context r3 = r18.getContext()
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r4 = com.startapp.sdk.adsbase.model.AdPreferences.Placement.INAPP_BANNER
            boolean r3 = com.startapp.sdk.adsbase.a.a((android.content.Context) r3, (com.startapp.sdk.adsbase.model.AdPreferences.Placement) r4)
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r4 = r0.f11776r
            java.lang.String[] r4 = r4.o()
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r5 = r0.f11776r
            java.lang.String[] r5 = r5.m()
            boolean r6 = r0.f11779u
            java.lang.String r7 = "adId: "
            r14 = 1
            r15 = 0
            if (r6 != 0) goto L_0x0112
            java.lang.String r6 = "index="
            boolean r6 = r2.contains(r6)
            if (r6 == 0) goto L_0x0112
            int r6 = com.startapp.sdk.adsbase.a.a((java.lang.String) r19)     // Catch:{ all -> 0x010d }
            if (r6 >= 0) goto L_0x0080
            com.startapp.i4 r1 = new com.startapp.i4     // Catch:{ all -> 0x010d }
            com.startapp.j4 r2 = com.startapp.j4.f10588e     // Catch:{ all -> 0x010d }
            r1.<init>((com.startapp.j4) r2)     // Catch:{ all -> 0x010d }
            java.lang.String r2 = "Wrong index extracted from URL"
            r1.f10537d = r2     // Catch:{ all -> 0x010d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x010d }
            r2.<init>()     // Catch:{ all -> 0x010d }
            r2.append(r7)     // Catch:{ all -> 0x010d }
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r0 = r0.f11776r     // Catch:{ all -> 0x010d }
            java.lang.String r0 = r0.getAdId()     // Catch:{ all -> 0x010d }
            r2.append(r0)     // Catch:{ all -> 0x010d }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x010d }
            r1.f10538e = r0     // Catch:{ all -> 0x010d }
            r1.a()     // Catch:{ all -> 0x010d }
            goto L_0x0136
        L_0x0080:
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r7 = r0.f11776r     // Catch:{ all -> 0x010d }
            r7.getClass()     // Catch:{ all -> 0x010d }
            if (r6 < 0) goto L_0x0090
            boolean[] r7 = r7.smartRedirect     // Catch:{ all -> 0x010d }
            int r8 = r7.length     // Catch:{ all -> 0x010d }
            if (r6 < r8) goto L_0x008d
            goto L_0x0090
        L_0x008d:
            boolean r7 = r7[r6]     // Catch:{ all -> 0x010d }
            goto L_0x0091
        L_0x0090:
            r7 = 0
        L_0x0091:
            if (r7 == 0) goto L_0x00de
            if (r3 != 0) goto L_0x00de
            android.content.Context r3 = r18.getContext()     // Catch:{ all -> 0x010d }
            int r7 = r4.length     // Catch:{ all -> 0x010d }
            if (r6 >= r7) goto L_0x00a3
            java.lang.String[] r7 = new java.lang.String[r14]     // Catch:{ all -> 0x010d }
            r4 = r4[r6]     // Catch:{ all -> 0x010d }
            r7[r15] = r4     // Catch:{ all -> 0x010d }
            goto L_0x00a4
        L_0x00a3:
            r7 = r1
        L_0x00a4:
            int r4 = r5.length     // Catch:{ all -> 0x010d }
            if (r6 >= r4) goto L_0x00a9
            r1 = r5[r6]     // Catch:{ all -> 0x010d }
        L_0x00a9:
            r4 = r1
            com.startapp.sdk.adsbase.commontracking.TrackingParams r5 = new com.startapp.sdk.adsbase.commontracking.TrackingParams     // Catch:{ all -> 0x010d }
            java.lang.String r1 = r0.f11737j     // Catch:{ all -> 0x010d }
            r5.<init>(r1)     // Catch:{ all -> 0x010d }
            com.startapp.sdk.adsbase.AdsCommonMetaData r1 = com.startapp.sdk.adsbase.AdsCommonMetaData.f12098h     // Catch:{ all -> 0x010d }
            long r8 = r1.z()     // Catch:{ all -> 0x010d }
            com.startapp.sdk.adsbase.AdsCommonMetaData r1 = com.startapp.sdk.adsbase.AdsCommonMetaData.f12098h     // Catch:{ all -> 0x010d }
            long r10 = r1.y()     // Catch:{ all -> 0x010d }
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r1 = r0.f11776r     // Catch:{ all -> 0x010d }
            boolean r12 = r1.a((int) r6)     // Catch:{ all -> 0x010d }
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r1 = r0.f11776r     // Catch:{ all -> 0x010d }
            java.lang.Boolean r13 = r1.b((int) r6)     // Catch:{ all -> 0x010d }
            r16 = 0
            r17 = 0
            r1 = r3
            r2 = r19
            r3 = r7
            r6 = r8
            r8 = r10
            r10 = r12
            r11 = r13
            r12 = r16
            r13 = r17
            com.startapp.sdk.adsbase.a.a(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12, r13)     // Catch:{ all -> 0x010d }
            goto L_0x01c7
        L_0x00de:
            android.content.Context r5 = r18.getContext()     // Catch:{ all -> 0x010d }
            int r7 = r4.length     // Catch:{ all -> 0x010d }
            if (r6 >= r7) goto L_0x00eb
            java.lang.String[] r1 = new java.lang.String[r14]     // Catch:{ all -> 0x010d }
            r4 = r4[r6]     // Catch:{ all -> 0x010d }
            r1[r15] = r4     // Catch:{ all -> 0x010d }
        L_0x00eb:
            r4 = r1
            com.startapp.sdk.adsbase.commontracking.TrackingParams r7 = new com.startapp.sdk.adsbase.commontracking.TrackingParams     // Catch:{ all -> 0x010d }
            java.lang.String r1 = r0.f11737j     // Catch:{ all -> 0x010d }
            r7.<init>(r1)     // Catch:{ all -> 0x010d }
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r1 = r0.f11776r     // Catch:{ all -> 0x010d }
            boolean r1 = r1.a((int) r6)     // Catch:{ all -> 0x010d }
            if (r1 == 0) goto L_0x00ff
            if (r3 != 0) goto L_0x00ff
            r6 = 1
            goto L_0x0100
        L_0x00ff:
            r6 = 0
        L_0x0100:
            r8 = 0
            r1 = r5
            r2 = r19
            r3 = r4
            r4 = r7
            r5 = r6
            r6 = r8
            com.startapp.sdk.adsbase.a.a((android.content.Context) r1, (java.lang.String) r2, (java.lang.String[]) r3, (com.startapp.sdk.adsbase.commontracking.TrackingParams) r4, (boolean) r5, (boolean) r6)     // Catch:{ all -> 0x010d }
            goto L_0x01c7
        L_0x010d:
            r0 = move-exception
            com.startapp.i4.a((java.lang.Throwable) r0)
            goto L_0x0136
        L_0x0112:
            int r1 = r4.length
            if (r1 >= r14) goto L_0x0139
            com.startapp.i4 r1 = new com.startapp.i4
            com.startapp.j4 r2 = com.startapp.j4.f10588e
            r1.<init>((com.startapp.j4) r2)
            java.lang.String r2 = "No tracking URLs"
            r1.f10537d = r2
            java.lang.StringBuilder r2 = com.startapp.b1.a(r7)
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r0 = r0.f11776r
            java.lang.String r0 = r0.getAdId()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.f10538e = r0
            r1.a()
        L_0x0136:
            r14 = 0
            goto L_0x01cf
        L_0x0139:
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r1 = r0.f11776r
            r1.getClass()
            boolean[] r1 = r1.smartRedirect
            int r6 = r1.length
            if (r6 > 0) goto L_0x0145
            r1 = 0
            goto L_0x0147
        L_0x0145:
            boolean r1 = r1[r15]
        L_0x0147:
            if (r1 == 0) goto L_0x01a3
            if (r3 != 0) goto L_0x01a3
            int r1 = r5.length
            if (r1 >= r14) goto L_0x0170
            com.startapp.i4 r1 = new com.startapp.i4
            com.startapp.j4 r2 = com.startapp.j4.f10588e
            r1.<init>((com.startapp.j4) r2)
            java.lang.String r2 = "No package names"
            r1.f10537d = r2
            java.lang.StringBuilder r2 = com.startapp.b1.a(r7)
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r0 = r0.f11776r
            java.lang.String r0 = r0.getAdId()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.f10538e = r0
            r1.a()
            goto L_0x0136
        L_0x0170:
            android.content.Context r1 = r18.getContext()
            java.lang.String[] r3 = new java.lang.String[r14]
            r4 = r4[r15]
            r3[r15] = r4
            r4 = r5[r15]
            com.startapp.sdk.adsbase.commontracking.TrackingParams r5 = new com.startapp.sdk.adsbase.commontracking.TrackingParams
            java.lang.String r6 = r0.f11737j
            r5.<init>(r6)
            com.startapp.sdk.adsbase.AdsCommonMetaData r6 = com.startapp.sdk.adsbase.AdsCommonMetaData.f12098h
            long r6 = r6.z()
            com.startapp.sdk.adsbase.AdsCommonMetaData r8 = com.startapp.sdk.adsbase.AdsCommonMetaData.f12098h
            long r8 = r8.y()
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r10 = r0.f11776r
            boolean r10 = r10.a((int) r15)
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r11 = r0.f11776r
            java.lang.Boolean r11 = r11.b((int) r15)
            r12 = 0
            r13 = 0
            r2 = r19
            com.startapp.sdk.adsbase.a.a(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12, r13)
            goto L_0x01c7
        L_0x01a3:
            android.content.Context r1 = r18.getContext()
            java.lang.String[] r5 = new java.lang.String[r14]
            r4 = r4[r15]
            r5[r15] = r4
            com.startapp.sdk.adsbase.commontracking.TrackingParams r4 = new com.startapp.sdk.adsbase.commontracking.TrackingParams
            java.lang.String r6 = r0.f11737j
            r4.<init>(r6)
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r6 = r0.f11776r
            boolean r6 = r6.a((int) r15)
            if (r6 == 0) goto L_0x01bf
            if (r3 != 0) goto L_0x01bf
            r15 = 1
        L_0x01bf:
            r6 = 0
            r2 = r19
            r3 = r5
            r5 = r15
            com.startapp.sdk.adsbase.a.a((android.content.Context) r1, (java.lang.String) r2, (java.lang.String[]) r3, (com.startapp.sdk.adsbase.commontracking.TrackingParams) r4, (boolean) r5, (boolean) r6)
        L_0x01c7:
            android.webkit.WebView r1 = r0.webView
            r1.stopLoading()
            r0.setClicked(r14)
        L_0x01cf:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard.a(com.startapp.sdk.ads.banner.bannerstandard.BannerStandard, java.lang.String):boolean");
    }

    public final void b(Point point, int i10) {
        if (point.x <= 0) {
            point.x = i10;
        }
    }

    public int c() {
        return Math.max(this.f11784z.i() - ((int) this.f11783y), 0);
    }

    public int d() {
        return this.f11736i;
    }

    public String e() {
        return "StartApp Banner";
    }

    public int f() {
        return this.f11784z.i();
    }

    public View g() {
        RelativeLayout relativeLayout = this.G;
        return relativeLayout != null ? relativeLayout : this;
    }

    public String getBidToken() {
        BannerStandardAd bannerStandardAd = this.f11776r;
        if (bannerStandardAd != null) {
            return bannerStandardAd.getBidToken();
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
        this.f11781w = false;
        a.a(this.R);
    }

    public void i() {
        int i10;
        try {
            Context context = getContext();
            CloseableLayout closeableLayout = new CloseableLayout(context);
            this.H = closeableLayout;
            closeableLayout.setOnCloseListener(new CloseableLayout.a() {
                public void onClose() {
                    BannerStandard.a(BannerStandard.this);
                }
            });
            WebView b10 = ComponentLocator.a(context).w().b();
            this.webView = b10;
            this.M = new MraidBannerController(b10, new v0.a() {
                public boolean onClickEvent(String str) {
                    if (!BannerStandard.this.f11778t) {
                        i4 i4Var = new i4(j4.f10588e);
                        i4Var.f10537d = "fake_click";
                        i4Var.f10540g = a.a(str, (String) null);
                        StringBuilder a10 = b1.a("jsTag=");
                        a10.append(BannerStandard.this.f11779u);
                        i4Var.f10538e = a10.toString();
                        i4Var.a();
                    }
                    BannerStandard bannerStandard = BannerStandard.this;
                    if ((!bannerStandard.f11779u || bannerStandard.f11778t) && str != null) {
                        return BannerStandard.a(bannerStandard, str);
                    }
                    return false;
                }
            });
            this.f11784z = new BannerOptions();
            BannerStandardAd bannerStandardAd = this.f11776r;
            if (bannerStandardAd == null) {
                if (bannerStandardAd == null) {
                    i10 = 0;
                } else {
                    i10 = bannerStandardAd.v();
                }
                this.f11776r = new BannerStandardAd(context, i10);
            }
            if (this.A == null) {
                this.A = new AdPreferences();
            }
            if (getId() == -1) {
                setId(this.f11736i);
            }
            this.webView.setId(159868225);
            a(this.webView);
            this.f11784z = BannerMetaData.f11748b.b();
            a(this.A);
            setMinimumWidth(qb.a(getContext(), this.B.f11637a.x));
            setMinimumHeight(qb.a(getContext(), this.B.f11637a.y));
            WebView webView2 = this.webView;
            Context context2 = getContext();
            AnonymousClass8 r42 = new Runnable() {
                public void run() {
                }
            };
            TrackingParams trackingParams = new TrackingParams(this.f11737j);
            boolean a10 = this.f11776r.a(0);
            n5 n5Var = new n5(context2, r42, trackingParams);
            n5Var.f10900b = a10;
            webView2.addJavascriptInterface(n5Var, "startappwall");
            this.G = new RelativeLayout(getContext());
            a((View) this.webView);
            a.a(this.R);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            addView(this.G, layoutParams);
            if (this.f11780v) {
                getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    public void onGlobalLayout() {
                        ViewTreeObserver viewTreeObserver = BannerStandard.this.getViewTreeObserver();
                        int i10 = a0.f10005a;
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                        BannerStandard bannerStandard = BannerStandard.this;
                        if (!bannerStandard.f11777s) {
                            bannerStandard.k();
                        }
                    }
                });
            }
        } catch (Throwable th) {
            i4.a(th);
            hideBanner();
            a("BannerStandard.init - webview failed");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l() {
        /*
            r4 = this;
            com.startapp.q7 r0 = r4.J
            r1 = 0
            r4.J = r1
            if (r0 == 0) goto L_0x0010
            r0.a()     // Catch:{ all -> 0x000c }
            r0 = 1
            goto L_0x0011
        L_0x000c:
            r0 = move-exception
            com.startapp.i4.a((java.lang.Throwable) r0)
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 == 0) goto L_0x0027
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandard$10 r1 = new com.startapp.sdk.ads.banner.bannerstandard.BannerStandard$10
            r1.<init>()
            r2 = 4000(0xfa0, double:1.9763E-320)
            r0.postDelayed(r1, r2)
            goto L_0x002a
        L_0x0027:
            r4.u()
        L_0x002a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard.l():void");
    }

    public void loadHtml() {
        String j10;
        BannerStandardAd bannerStandardAd = this.f11776r;
        if (bannerStandardAd != null && (j10 = bannerStandardAd.j()) != null) {
            String str = this.f11737j;
            if (str != null && str.length() > 0) {
                j10 = j10.replaceAll("startapp_adtag_placeholder", this.f11737j);
            }
            this.f11782x.postDelayed(new Runnable() {
                public void run() {
                    BannerStandard bannerStandard = BannerStandard.this;
                    int i10 = BannerStandard.S;
                    bannerStandard.j();
                }
            }, (long) this.f11784z.i());
            this.f11783y = System.currentTimeMillis();
            getContext();
            wb.a(this.webView, j10);
        }
    }

    public void m() {
        j9 j9Var = this.I;
        if (j9Var != null && j9Var.f10719i.get()) {
            super.m();
        }
    }

    public final void n() {
        if (this.E == null && this.F == null) {
            this.F = new RelativeLayout(getContext());
            AdInformationObject adInformationObject = new AdInformationObject(getContext(), AdInformationObject.Size.SMALL, AdPreferences.Placement.INAPP_BANNER, this.f11776r.getAdInfoOverride(), this.f11776r.getConsentData());
            this.E = adInformationObject;
            adInformationObject.a(this.F);
        }
        try {
            ViewGroup viewGroup = (ViewGroup) this.F.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.F);
            }
        } catch (Exception unused) {
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        this.webView.addView(this.F, layoutParams);
    }

    public final void o() {
        BannerStandardAd bannerStandardAd = this.f11776r;
        if (bannerStandardAd != null && bannerStandardAd.r()) {
            this.K = new id(this.webView, BannerMetaData.f11748b.a(), new id.b() {
                public boolean onUpdate(boolean z10) {
                    BannerStandard.this.M.fireViewableChangeEvent(z10);
                    return BannerStandard.this.f11776r.r();
                }
            });
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        WebView webView2 = this.webView;
        if (webView2 != null) {
            a0.b(webView2);
        }
        WebView webView3 = this.twoPartWebView;
        if (webView3 != null) {
            a0.b(webView3);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WebView webView2 = this.webView;
        if (webView2 != null) {
            a0.a(webView2);
        }
        WebView webView3 = this.twoPartWebView;
        if (webView3 != null) {
            a0.a(webView3);
        }
        j9 j9Var = this.I;
        if (j9Var != null) {
            j9Var.a("AD_CLOSED_TOO_QUICKLY", (JSONObject) null);
        }
        id idVar = this.K;
        if (idVar != null) {
            idVar.a();
        }
        id idVar2 = this.L;
        if (idVar2 != null) {
            idVar2.a();
        }
        p();
        q7 q7Var = this.J;
        this.J = null;
        if (q7Var != null) {
            try {
                q7Var.a();
            } catch (Throwable th) {
                i4.a(th);
            }
        }
        WebView webView4 = this.webView;
        Map<Activity, Integer> map = wb.f12765a;
        new Handler(Looper.getMainLooper()).postAtTime((Runnable) null, webView4, SystemClock.uptimeMillis() + 1000);
    }

    public void onFailedToReceiveAd(Ad ad2) {
        if (ad2 != null) {
            a(ad2.getErrorMessage());
        }
    }

    public void onReceiveAd(Ad ad2) {
        String str;
        this.f11778t = false;
        removeView(this.F);
        BannerStandardAd bannerStandardAd = this.f11776r;
        if (bannerStandardAd == null || bannerStandardAd.j() == null || this.f11776r.j().compareTo("") == 0) {
            a("No Banner received");
            return;
        }
        this.f11779u = "true".equals(wb.a(this.f11776r.j(), "@jsTag@", "@jsTag@"));
        loadHtml();
        try {
            if (a(Integer.parseInt(wb.a(this.f11776r.j(), "@width@", "@width@")), Integer.parseInt(wb.a(this.f11776r.j(), "@height@", "@height@")))) {
                this.f11777s = true;
                n();
                t();
                a();
                o();
                if (this.f11781w) {
                    a.a(this.Q);
                }
                if (this.C != null && !this.D) {
                    this.D = true;
                    Context context = getContext();
                    BannerListener bannerListener = this.C;
                    BannerStandardAd bannerStandardAd2 = this.f11776r;
                    bannerStandardAd2.getClass();
                    String[] strArr = bannerStandardAd2.trackingUrls;
                    if (strArr.length <= 0) {
                        str = null;
                    } else {
                        str = strArr[0];
                    }
                    p0.c(context, bannerListener, this, a.a(str, (String) null));
                    return;
                }
                return;
            }
            a("Banner cannot be displayed (not enough room)");
        } catch (NumberFormatException unused) {
            a("Error Casting width & height from HTML");
        } catch (Throwable th) {
            i4.a(th);
            a(th.getMessage());
        }
    }

    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        double ceil = Math.ceil((double) (((float) i10) / displayMetrics.density));
        double ceil2 = Math.ceil((double) (((float) i11) / displayMetrics.density));
        Point point = this.B.f11637a;
        if (ceil < ((double) point.x) || ceil2 < ((double) point.y)) {
            a.a(this.R);
        } else if (this.f11781w && this.f11777s) {
            a.a(this.Q);
        }
    }

    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            WebView webView2 = this.webView;
            if (webView2 != null) {
                a0.b(webView2);
            }
            WebView webView3 = this.twoPartWebView;
            if (webView3 != null) {
                a0.b(webView3);
                return;
            }
            return;
        }
        WebView webView4 = this.webView;
        if (webView4 != null) {
            a0.a(webView4);
        }
        WebView webView5 = this.twoPartWebView;
        if (webView5 != null) {
            a0.a(webView5);
        }
    }

    public final void p() {
        this.f11782x.removeCallbacksAndMessages((Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096 A[SYNTHETIC, Splitter:B:32:0x0096] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a8 A[Catch:{ all -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c7 A[Catch:{ all -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f6 A[Catch:{ all -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0111 A[Catch:{ all -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0093 A[EDGE_INSN: B:56:0x0093->B:30:0x0093 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f4 A[EDGE_INSN: B:57:0x00f4->B:48:0x00f4 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Point q() {
        /*
            r8 = this;
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            r2 = 1
            if (r1 == 0) goto L_0x0025
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            int r1 = r1.width
            if (r1 <= 0) goto L_0x0025
            android.content.Context r1 = r8.getContext()
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            int r3 = r3.width
            int r3 = r3 + r2
            int r1 = com.startapp.qb.b(r1, r3)
            r0.x = r1
        L_0x0025:
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            if (r1 == 0) goto L_0x0044
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            int r1 = r1.height
            if (r1 <= 0) goto L_0x0044
            android.content.Context r1 = r8.getContext()
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            int r3 = r3.height
            int r3 = r3 + r2
            int r1 = com.startapp.qb.b(r1, r3)
            r0.y = r1
        L_0x0044:
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            if (r1 == 0) goto L_0x005f
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            int r1 = r1.width
            if (r1 <= 0) goto L_0x005f
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            int r1 = r1.height
            if (r1 <= 0) goto L_0x005f
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r1 = r8.f11776r
            r1.b(r2)
        L_0x005f:
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            if (r1 == 0) goto L_0x0075
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            int r1 = r1.width
            if (r1 <= 0) goto L_0x0075
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            int r1 = r1.height
            if (r1 > 0) goto L_0x0163
        L_0x0075:
            android.content.Context r1 = r8.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            android.view.ViewParent r2 = r8.getParent()     // Catch:{ all -> 0x0144 }
            boolean r2 = r2 instanceof android.view.View     // Catch:{ all -> 0x0144 }
            if (r2 == 0) goto L_0x0092
            android.view.ViewParent r2 = r8.getParent()     // Catch:{ all -> 0x0144 }
            android.view.View r2 = (android.view.View) r2     // Catch:{ all -> 0x0144 }
            r3 = r2
            r2 = r8
            goto L_0x0094
        L_0x0092:
            r2 = r8
        L_0x0093:
            r3 = 0
        L_0x0094:
            if (r3 == 0) goto L_0x00f4
            int r4 = r3.getMeasuredWidth()     // Catch:{ all -> 0x00ef }
            if (r4 <= 0) goto L_0x00a2
            int r4 = r3.getMeasuredHeight()     // Catch:{ all -> 0x00ef }
            if (r4 > 0) goto L_0x00f4
        L_0x00a2:
            int r4 = r3.getMeasuredWidth()     // Catch:{ all -> 0x00ef }
            if (r4 <= 0) goto L_0x00c1
            android.content.Context r4 = r2.getContext()     // Catch:{ all -> 0x00ef }
            int r5 = r3.getMeasuredWidth()     // Catch:{ all -> 0x00ef }
            int r6 = r3.getPaddingLeft()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r6
            int r6 = r3.getPaddingRight()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r6
            int r4 = com.startapp.qb.b(r4, r5)     // Catch:{ all -> 0x00ef }
            r2.b(r0, r4)     // Catch:{ all -> 0x00ef }
        L_0x00c1:
            int r4 = r3.getMeasuredHeight()     // Catch:{ all -> 0x00ef }
            if (r4 <= 0) goto L_0x00e0
            android.content.Context r4 = r2.getContext()     // Catch:{ all -> 0x00ef }
            int r5 = r3.getMeasuredHeight()     // Catch:{ all -> 0x00ef }
            int r6 = r3.getPaddingBottom()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r6
            int r6 = r3.getPaddingTop()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r6
            int r4 = com.startapp.qb.b(r4, r5)     // Catch:{ all -> 0x00ef }
            r2.a((android.graphics.Point) r0, (int) r4)     // Catch:{ all -> 0x00ef }
        L_0x00e0:
            android.view.ViewParent r4 = r3.getParent()     // Catch:{ all -> 0x00ef }
            boolean r4 = r4 instanceof android.view.View     // Catch:{ all -> 0x00ef }
            if (r4 == 0) goto L_0x0093
            android.view.ViewParent r3 = r3.getParent()     // Catch:{ all -> 0x00ef }
            android.view.View r3 = (android.view.View) r3     // Catch:{ all -> 0x00ef }
            goto L_0x0094
        L_0x00ef:
            r3 = move-exception
            r7 = r3
            r3 = r2
            r2 = r7
            goto L_0x0146
        L_0x00f4:
            if (r3 != 0) goto L_0x0111
            android.content.Context r3 = r2.getContext()     // Catch:{ all -> 0x00ef }
            int r4 = r1.widthPixels     // Catch:{ all -> 0x00ef }
            int r3 = com.startapp.qb.b(r3, r4)     // Catch:{ all -> 0x00ef }
            r2.b(r0, r3)     // Catch:{ all -> 0x00ef }
            android.content.Context r3 = r2.getContext()     // Catch:{ all -> 0x00ef }
            int r4 = r1.heightPixels     // Catch:{ all -> 0x00ef }
            int r3 = com.startapp.qb.b(r3, r4)     // Catch:{ all -> 0x00ef }
            r2.a((android.graphics.Point) r0, (int) r3)     // Catch:{ all -> 0x00ef }
            goto L_0x0163
        L_0x0111:
            android.content.Context r4 = r2.getContext()     // Catch:{ all -> 0x00ef }
            int r5 = r3.getMeasuredWidth()     // Catch:{ all -> 0x00ef }
            int r6 = r3.getPaddingLeft()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r6
            int r6 = r3.getPaddingRight()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r6
            int r4 = com.startapp.qb.b(r4, r5)     // Catch:{ all -> 0x00ef }
            r2.b(r0, r4)     // Catch:{ all -> 0x00ef }
            android.content.Context r4 = r2.getContext()     // Catch:{ all -> 0x00ef }
            int r5 = r3.getMeasuredHeight()     // Catch:{ all -> 0x00ef }
            int r6 = r3.getPaddingBottom()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r6
            int r3 = r3.getPaddingTop()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r3
            int r3 = com.startapp.qb.b(r4, r5)     // Catch:{ all -> 0x00ef }
            r2.a((android.graphics.Point) r0, (int) r3)     // Catch:{ all -> 0x00ef }
            goto L_0x0163
        L_0x0144:
            r2 = move-exception
            r3 = r8
        L_0x0146:
            com.startapp.i4.a((java.lang.Throwable) r2)
            android.content.Context r2 = r3.getContext()
            int r4 = r1.widthPixels
            int r2 = com.startapp.qb.b(r2, r4)
            r3.b(r0, r2)
            android.content.Context r2 = r3.getContext()
            int r1 = r1.heightPixels
            int r1 = com.startapp.qb.b(r2, r1)
            r3.a((android.graphics.Point) r0, (int) r1)
        L_0x0163:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard.q():android.graphics.Point");
    }

    public int r() {
        return 0;
    }

    public final ViewGroup s() {
        View view;
        View rootView;
        ViewGroup viewGroup = this.O;
        if (viewGroup != null) {
            return viewGroup;
        }
        Context context = getContext();
        RelativeLayout relativeLayout = this.G;
        View view2 = null;
        if (!(context instanceof Activity)) {
            view = null;
        } else {
            view = ((Activity) context).getWindow().getDecorView().findViewById(16908290);
        }
        if (!(relativeLayout == null || (rootView = relativeLayout.getRootView()) == null || (view2 = rootView.findViewById(16908290)) != null)) {
            view2 = rootView;
        }
        if (view == null) {
            view = view2;
        }
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return this.G;
    }

    public void setAdTag(String str) {
        this.f11737j = str;
    }

    public void setBannerListener(BannerListener bannerListener) {
        this.C = bannerListener;
    }

    public void showBanner() {
        try {
            ComponentLocator.a(getContext()).r().a(2048);
        } catch (Throwable unused) {
        }
        this.f11781w = true;
        a.a(this.Q);
    }

    public void t() {
        long j10;
        Context context = getContext();
        String[] strArr = this.f11776r.trackingUrls;
        TrackingParams trackingParams = new TrackingParams(this.f11737j);
        if (this.f11776r.h() != null) {
            j10 = TimeUnit.SECONDS.toMillis(this.f11776r.h().longValue());
        } else {
            j10 = TimeUnit.SECONDS.toMillis(MetaData.f12393k.p());
        }
        j9 j9Var = new j9(context, strArr, trackingParams, j10);
        this.I = j9Var;
        j9Var.f10720j = new WeakReference<>(this.P);
        a(this.I);
    }

    public final void u() {
        if (this.A == null) {
            this.A = new AdPreferences();
        }
        if (this.f11776r != null) {
            Point point = this.f11733f;
            if (point == null) {
                point = q();
            }
            this.f11776r.a(point.x, point.y);
            this.f11776r.setState(Ad.AdState.UN_INITIALIZED);
            this.f11776r.c(r());
            this.f11776r.load(this.A, this);
        }
    }

    public BannerStandard(Activity activity, AdPreferences adPreferences) {
        this((Context) activity, adPreferences);
    }

    public BannerStandard(Activity activity, BannerListener bannerListener) {
        this((Context) activity, bannerListener);
    }

    public final void b(WebView webView2) {
        q7 q7Var = this.J;
        if (q7Var == null) {
            q7Var = new q7(webView2);
            this.J = q7Var;
        }
        if (q7Var.c()) {
            try {
                RelativeLayout relativeLayout = this.F;
                if (relativeLayout != null) {
                    q7Var.a(relativeLayout, c.OTHER, (String) null);
                }
                CloseableLayout closeableLayout = this.H;
                if (closeableLayout != null) {
                    q7Var.a(closeableLayout, c.CLOSE_AD, (String) null);
                }
            } catch (RuntimeException unused) {
            }
            q7Var.a(webView2);
            q7Var.e();
            q7Var.d();
            q7Var.b();
        }
    }

    public BannerStandard(Activity activity, AdPreferences adPreferences, BannerListener bannerListener) {
        this((Context) activity, adPreferences, bannerListener);
    }

    public BannerStandard(Activity activity, boolean z10) {
        this((Context) activity, z10);
    }

    public BannerStandard(Activity activity, boolean z10, AdPreferences adPreferences) {
        this((Context) activity, z10, adPreferences);
    }

    public BannerStandard(Activity activity, AttributeSet attributeSet) {
        this((Context) activity, attributeSet);
    }

    public BannerStandard(Activity activity, AttributeSet attributeSet, int i10) {
        this((Context) activity, attributeSet, i10);
    }

    @Deprecated
    public BannerStandard(Context context) {
        this(context, true, (AdPreferences) null);
    }

    @Deprecated
    public BannerStandard(Context context, AdPreferences adPreferences) {
        this(context, true, adPreferences);
    }

    @Deprecated
    public BannerStandard(Context context, BannerListener bannerListener) {
        this(context, true, (AdPreferences) null);
        setBannerListener(bannerListener);
    }

    @Deprecated
    public BannerStandard(Context context, AdPreferences adPreferences, BannerListener bannerListener) {
        this(context, true, adPreferences);
        setBannerListener(bannerListener);
    }

    @Deprecated
    public BannerStandard(Context context, boolean z10) {
        this(context, z10, (AdPreferences) null);
    }

    public BannerStandard(Context context, boolean z10, AdPreferences adPreferences) {
        this(context, z10, adPreferences, (BannerStandardAd) null);
    }

    public BannerStandard(Context context, boolean z10, AdPreferences adPreferences, BannerStandardAd bannerStandardAd) {
        super(context);
        this.f11777s = false;
        this.f11778t = true;
        this.f11779u = false;
        this.f11780v = true;
        this.f11781w = true;
        this.f11782x = new Handler(Looper.getMainLooper());
        this.B = new r0(getWidthInDp(), getHeightInDp());
        this.D = false;
        this.E = null;
        this.F = null;
        this.P = new j9.a() {
            public void onSent(String str) {
                BannerStandard bannerStandard = BannerStandard.this;
                Context context = bannerStandard.getContext();
                BannerListener bannerListener = bannerStandard.C;
                q0 q0Var = null;
                w2.a("onImpression", bannerListener != null, str, (String) null);
                if (bannerListener != null) {
                    q0Var = new q0(bannerListener, bannerStandard, context);
                }
                a.a((Runnable) q0Var);
                bannerStandard.f11783y = System.currentTimeMillis() - bannerStandard.f11783y;
                bannerStandard.m();
            }
        };
        this.Q = new Runnable() {
            public void run() {
                BannerStandard bannerStandard = BannerStandard.this;
                RelativeLayout relativeLayout = bannerStandard.G;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(0);
                }
                if (bannerStandard.f11776r != null) {
                    w9 s10 = ComponentLocator.a(bannerStandard.getContext()).s();
                    AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
                    int r10 = bannerStandard.r();
                    String adId = bannerStandard.f11776r.getAdId();
                    s10.getClass();
                    if (adId != null) {
                        s10.f12760a.put(new w9.a(placement, r10), adId);
                    }
                }
            }
        };
        this.R = new Runnable() {
            public void run() {
                RelativeLayout relativeLayout = BannerStandard.this.G;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(4);
                }
            }
        };
        try {
            this.f11780v = z10;
            this.A = adPreferences;
            this.f11776r = bannerStandardAd;
            h();
        } catch (Throwable th) {
            i4.a(th);
        }
    }

    @Deprecated
    public BannerStandard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public BannerStandard(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11777s = false;
        this.f11778t = true;
        this.f11779u = false;
        this.f11780v = true;
        this.f11781w = true;
        this.f11782x = new Handler(Looper.getMainLooper());
        this.B = new r0(getWidthInDp(), getHeightInDp());
        this.D = false;
        this.E = null;
        this.F = null;
        this.P = new j9.a() {
            public void onSent(String str) {
                BannerStandard bannerStandard = BannerStandard.this;
                Context context = bannerStandard.getContext();
                BannerListener bannerListener = bannerStandard.C;
                q0 q0Var = null;
                w2.a("onImpression", bannerListener != null, str, (String) null);
                if (bannerListener != null) {
                    q0Var = new q0(bannerListener, bannerStandard, context);
                }
                a.a((Runnable) q0Var);
                bannerStandard.f11783y = System.currentTimeMillis() - bannerStandard.f11783y;
                bannerStandard.m();
            }
        };
        this.Q = new Runnable() {
            public void run() {
                BannerStandard bannerStandard = BannerStandard.this;
                RelativeLayout relativeLayout = bannerStandard.G;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(0);
                }
                if (bannerStandard.f11776r != null) {
                    w9 s10 = ComponentLocator.a(bannerStandard.getContext()).s();
                    AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
                    int r10 = bannerStandard.r();
                    String adId = bannerStandard.f11776r.getAdId();
                    s10.getClass();
                    if (adId != null) {
                        s10.f12760a.put(new w9.a(placement, r10), adId);
                    }
                }
            }
        };
        this.R = new Runnable() {
            public void run() {
                RelativeLayout relativeLayout = BannerStandard.this.G;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(4);
                }
            }
        };
        try {
            h();
        } catch (Throwable th) {
            i4.a(th);
        }
    }

    public final void a(WebView webView2) {
        webView2.setBackgroundColor(0);
        webView2.setHorizontalScrollBarEnabled(false);
        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.setVerticalScrollBarEnabled(false);
        webView2.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                BannerStandard.this.f11778t = true;
                if (motionEvent.getAction() == 2) {
                    return true;
                }
                return false;
            }
        });
        webView2.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View view) {
                return true;
            }
        });
        webView2.setLongClickable(false);
    }

    public final void a(View view) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(qb.a(getContext(), this.B.f11637a.x), qb.a(getContext(), this.B.f11637a.y));
        layoutParams.addRule(13);
        this.G.addView(view, layoutParams);
    }

    public final void a(Point point, int i10) {
        if (point.y <= 0) {
            point.y = i10;
        }
    }

    public final void a(String str) {
        setErrorMessage(str);
        if (this.C != null && !this.D) {
            this.D = true;
            p0.b(getContext(), this.C, this, (String) null);
        }
    }

    public final boolean a(int i10, int i11) {
        Point q10 = q();
        if (q10.x < i10 || q10.y < i11) {
            Point point = new Point(0, 0);
            ViewGroup.LayoutParams layoutParams = this.webView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(point.x, point.y);
            } else {
                layoutParams.width = point.x;
                layoutParams.height = point.y;
            }
            this.webView.setLayoutParams(layoutParams);
            return false;
        }
        Point point2 = this.B.f11637a;
        point2.x = i10;
        point2.y = i11;
        int a10 = qb.a(getContext(), this.B.f11637a.x);
        int a11 = qb.a(getContext(), this.B.f11637a.y);
        this.G.setMinimumWidth(a10);
        this.G.setMinimumHeight(a11);
        ViewGroup.LayoutParams layoutParams2 = this.webView.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new RelativeLayout.LayoutParams(a10, a11);
        } else {
            layoutParams2.width = a10;
            layoutParams2.height = a11;
        }
        this.webView.setLayoutParams(layoutParams2);
        return true;
    }

    public void a(int i10) {
        this.f11736i = i10;
    }

    public static void a(BannerStandard bannerStandard, boolean z10) {
        if (z10 != (!bannerStandard.H.f11788c.isVisible())) {
            bannerStandard.H.setCloseVisible(!z10);
        }
    }

    public static void a(BannerStandard bannerStandard) {
        MraidState mraidState;
        if (bannerStandard.M.getState() != MraidState.LOADING && bannerStandard.M.getState() != (mraidState = MraidState.HIDDEN)) {
            if (bannerStandard.M.getState() == MraidState.RESIZED || bannerStandard.M.getState() == MraidState.EXPANDED) {
                if (bannerStandard.N != null) {
                    bannerStandard.H.removeView(bannerStandard.twoPartWebView);
                    bannerStandard.L.a();
                    bannerStandard.L = null;
                    bannerStandard.N = null;
                    bannerStandard.twoPartWebView.stopLoading();
                    bannerStandard.twoPartWebView = null;
                } else {
                    bannerStandard.H.removeView(bannerStandard.webView);
                    bannerStandard.a((View) bannerStandard.webView);
                    a.a(bannerStandard.Q);
                }
                CloseableLayout closeableLayout = bannerStandard.H;
                if (!(closeableLayout == null || closeableLayout.getParent() == null || !(closeableLayout.getParent() instanceof ViewGroup))) {
                    ((ViewGroup) closeableLayout.getParent()).removeView(closeableLayout);
                }
                bannerStandard.M.setState(MraidState.DEFAULT);
            } else if (bannerStandard.M.getState() == MraidState.DEFAULT) {
                a.a(bannerStandard.R);
                bannerStandard.M.setState(mraidState);
            }
            bannerStandard.m();
        }
    }
}
