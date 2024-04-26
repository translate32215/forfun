package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.startapp.i4;
import com.startapp.l9;
import com.startapp.sdk.ads.splash.SplashConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationPositions;
import com.startapp.sdk.adsbase.apppresence.AppPresenceDetails;
import com.startapp.sdk.adsbase.cache.d;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.u7;
import com.startapp.wb;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: Sta */
public abstract class HtmlAd extends Ad {

    /* renamed from: c  reason: collision with root package name */
    public static String f12111c = null;
    private static final long serialVersionUID = 1;
    private List<AppPresenceDetails> apps;
    private String[] closingUrl = {""};
    private Long delayImpressionInSeconds;
    private int height;
    private String htmlUuid = "";
    public boolean[] inAppBrowserEnabled = {true};
    private boolean isMraidAd = false;
    private int orientation = 0;
    private String[] packageNames = {""};
    private int rewardDuration = 0;
    private boolean rewardedHideTimer = false;
    private Boolean[] sendRedirectHops = null;
    public boolean[] smartRedirect = {false};
    private String[] trackingClickUrls = {""};
    public String[] trackingUrls = {""};
    private int width;

    public HtmlAd(Context context, AdPreferences.Placement placement) {
        super(context, placement);
        if (f12111c == null) {
            q();
        }
    }

    public void a(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }

    public void b(String str) {
        Long l10 = null;
        for (String str2 : str.split(",")) {
            if (!str2.equals("")) {
                try {
                    long parseLong = Long.parseLong(str2);
                    if (parseLong > 0 && (l10 == null || parseLong < l10.longValue())) {
                        l10 = Long.valueOf(parseLong);
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (l10 != null) {
            this.adCacheTtl = Long.valueOf(TimeUnit.SECONDS.toMillis(l10.longValue()));
        }
    }

    public void c(String str) {
        if (Pattern.compile("<script\\s+[^>]*\\bsrc\\s*=\\s*([\\\"\\'])mraid\\.js\\1[^>]*>\\s*</script>\\n*", 2).matcher(new StringBuffer(str)).find()) {
            this.isMraidAd = true;
        }
        if (MetaData.f12393k.S()) {
            try {
                str = l9.a(u7.a(), str);
            } catch (Throwable th) {
                i4.a(th);
            }
        }
        Map<Activity, Integer> map = wb.f12765a;
        d dVar = d.f12250h;
        dVar.getClass();
        String uuid = UUID.randomUUID().toString();
        dVar.f12252b.put(uuid, str);
        this.htmlUuid = uuid;
        String a10 = wb.a(str, "@smartRedirect@", "@smartRedirect@");
        if (a10 != null) {
            String[] split = a10.split(",");
            this.smartRedirect = new boolean[split.length];
            for (int i10 = 0; i10 < split.length; i10++) {
                if (split[i10].compareTo("true") == 0) {
                    this.smartRedirect[i10] = true;
                } else {
                    this.smartRedirect[i10] = false;
                }
            }
        }
        String a11 = wb.a(str, "@trackingClickUrl@", "@trackingClickUrl@");
        if (a11 != null) {
            this.trackingClickUrls = a11.split(",");
        }
        String a12 = wb.a(str, "@closeUrl@", "@closeUrl@");
        if (a12 != null) {
            this.closingUrl = a12.split(",");
        }
        String a13 = wb.a(str, "@tracking@", "@tracking@");
        if (a13 != null) {
            this.trackingUrls = a13.split(",");
        }
        String a14 = wb.a(str, "@packageName@", "@packageName@");
        if (a14 != null) {
            this.packageNames = a14.split(",");
        }
        String a15 = wb.a(str, "@startappBrowserEnabled@", "@startappBrowserEnabled@");
        if (a15 != null) {
            String[] split2 = a15.split(",");
            this.inAppBrowserEnabled = new boolean[split2.length];
            for (int i11 = 0; i11 < split2.length; i11++) {
                if (split2[i11].compareTo("false") == 0) {
                    this.inAppBrowserEnabled[i11] = false;
                } else {
                    this.inAppBrowserEnabled[i11] = true;
                }
            }
        }
        String a16 = wb.a(str, "@orientation@", "@orientation@");
        if (a16 != null) {
            Map<Activity, Integer> map2 = wb.f12765a;
            a(SplashConfig.Orientation.getByName(a16));
        }
        String a17 = wb.a(str, "@adInfoEnable@", "@adInfoEnable@");
        if (a17 != null) {
            getAdInfoOverride().a(Boolean.parseBoolean(a17));
        }
        String a18 = wb.a(str, "@adInfoPosition@", "@adInfoPosition@");
        if (a18 != null) {
            getAdInfoOverride().a(AdInformationPositions.Position.getByName(a18));
        }
        String a19 = wb.a(str, "@ttl@", "@ttl@");
        if (a19 != null) {
            b(a19);
        }
        String a20 = wb.a(str, "@belowMinCPM@", "@belowMinCPM@");
        if (a20 != null) {
            if (Arrays.asList(a20.split(",")).contains("false")) {
                this.belowMinCPM = false;
            } else {
                this.belowMinCPM = true;
            }
        }
        String a21 = wb.a(str, "@delayImpressionInSeconds@", "@delayImpressionInSeconds@");
        if (a21 != null && !a21.equals("")) {
            try {
                this.delayImpressionInSeconds = Long.valueOf(Long.parseLong(a21));
            } catch (NumberFormatException unused) {
            }
        }
        String a22 = wb.a(str, "@rewardDuration@", "@rewardDuration@");
        if (a22 != null) {
            try {
                this.rewardDuration = Integer.parseInt(a22);
            } catch (Throwable th2) {
                i4.a(th2);
            }
        }
        String a23 = wb.a(str, "@rewardedHideTimer@", "@rewardedHideTimer@");
        if (a23 != null) {
            try {
                this.rewardedHideTimer = Boolean.parseBoolean(a23);
            } catch (Throwable th3) {
                i4.a(th3);
            }
        }
        String a24 = wb.a(str, "@sendRedirectHops@", "@sendRedirectHops@");
        if (a24 != null && !a24.equals("")) {
            String[] split3 = a24.split(",");
            this.sendRedirectHops = new Boolean[split3.length];
            for (int i12 = 0; i12 < split3.length; i12++) {
                if (split3[i12].compareTo("true") == 0) {
                    this.sendRedirectHops[i12] = Boolean.TRUE;
                } else if (split3[i12].compareTo("false") == 0) {
                    this.sendRedirectHops[i12] = Boolean.FALSE;
                } else {
                    this.sendRedirectHops[i12] = null;
                }
            }
        }
        ConsentData consentData = new ConsentData();
        this.consentData = consentData;
        consentData.b(wb.a(str, "@infoDparam@", "@infoDparam@"));
        this.consentData.c(wb.a(str, "@infoImpUrl@", "@infoImpUrl@"));
        this.consentData.a(wb.a(str, "@infoClickUrl@", "@infoClickUrl@"));
        try {
            String a25 = wb.a(str, "@ct@", "@ct@");
            if (!TextUtils.isEmpty(a25)) {
                this.consentData.a(Integer.valueOf(Integer.parseInt(a25)));
            }
        } catch (Throwable th4) {
            i4.a(th4);
        }
        try {
            String a26 = wb.a(str, "@tsc@", "@tsc@");
            if (!TextUtils.isEmpty(a26)) {
                this.consentData.a(Long.valueOf(Long.parseLong(a26)));
            }
        } catch (Throwable th5) {
            i4.a(th5);
        }
        try {
            String a27 = wb.a(str, "@apc@", "@apc@");
            if (!TextUtils.isEmpty(a27)) {
                this.consentData.a(Boolean.valueOf(Boolean.parseBoolean(a27)));
            }
        } catch (Throwable th6) {
            i4.a(th6);
        }
        int length = this.smartRedirect.length;
        String[] strArr = this.trackingUrls;
        if (length < strArr.length) {
            boolean[] zArr = new boolean[strArr.length];
            int i13 = 0;
            while (true) {
                boolean[] zArr2 = this.smartRedirect;
                if (i13 >= zArr2.length) {
                    break;
                }
                zArr[i13] = zArr2[i13];
                i13++;
            }
            while (i13 < this.trackingUrls.length) {
                zArr[i13] = false;
                i13++;
            }
            this.smartRedirect = zArr;
        }
    }

    public String[] g() {
        return this.closingUrl;
    }

    public String getAdId() {
        return wb.a(j(), "@adId@", "@adId@");
    }

    public String getBidToken() {
        return wb.a(j(), "@bidToken@", "@bidToken@");
    }

    public Long h() {
        return this.delayImpressionInSeconds;
    }

    public int i() {
        return this.height;
    }

    public String j() {
        d dVar = d.f12250h;
        return dVar.f12252b.get(this.htmlUuid);
    }

    public String k() {
        return this.htmlUuid;
    }

    public int l() {
        return this.orientation;
    }

    public String[] m() {
        return this.packageNames;
    }

    public int n() {
        return this.rewardDuration;
    }

    public String[] o() {
        return this.trackingClickUrls;
    }

    public int p() {
        return this.width;
    }

    public final void q() {
        f12111c = wb.a(getContext());
    }

    public boolean r() {
        return this.isMraidAd;
    }

    public boolean s() {
        return this.rewardedHideTimer;
    }

    public Boolean[] t() {
        return this.sendRedirectHops;
    }

    public void a(SplashConfig.Orientation orientation2) {
        this.orientation = 0;
        Map<Activity, Integer> map = wb.f12765a;
        if (orientation2 == null) {
            return;
        }
        if (orientation2.equals(SplashConfig.Orientation.PORTRAIT)) {
            this.orientation = 1;
        } else if (orientation2.equals(SplashConfig.Orientation.LANDSCAPE)) {
            this.orientation = 2;
        }
    }

    public Boolean b(int i10) {
        Boolean[] boolArr = this.sendRedirectHops;
        if (boolArr == null || i10 < 0 || i10 >= boolArr.length) {
            return null;
        }
        return boolArr[i10];
    }

    public boolean a(int i10) {
        boolean[] zArr = this.inAppBrowserEnabled;
        if (zArr == null || i10 < 0 || i10 >= zArr.length) {
            return true;
        }
        return zArr[i10];
    }

    public void a(List<AppPresenceDetails> list) {
        this.apps = list;
    }
}
