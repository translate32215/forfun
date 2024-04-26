package com.startapp;

import android.app.Activity;
import java.net.URLDecoder;
import java.util.Map;

/* compiled from: Sta */
public abstract class v0 implements l6 {
    private static final String LOG_TAG = "v0";
    public a openListener;

    /* compiled from: Sta */
    public interface a {
        boolean onClickEvent(String str);
    }

    public v0(a aVar) {
        this.openListener = aVar;
    }

    public void applyOrientationProperties(Activity activity, s6 s6Var) {
        try {
            int i10 = 0;
            int i11 = activity.getResources().getConfiguration().orientation == 1 ? 1 : 0;
            int i12 = s6Var.f11700b;
            if (i12 == 0) {
                i10 = 1;
            } else if (i12 != 1) {
                i10 = s6Var.f11699a ? -1 : i11;
            }
            int i13 = a0.f10005a;
            try {
                activity.setRequestedOrientation(i10);
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            i4.a(th);
        }
    }

    public abstract void close();

    public void createCalendarEvent(String str) {
        isFeatureSupported("calendar");
    }

    public void expand(String str) {
    }

    public abstract boolean isFeatureSupported(String str);

    public boolean open(String str) {
        try {
            String trim = URLDecoder.decode(str, "UTF-8").trim();
            if (trim.startsWith("sms")) {
                return openSMS(trim);
            }
            if (trim.startsWith("tel")) {
                return openTel(trim);
            }
            return this.openListener.onClickEvent(trim);
        } catch (Exception unused) {
            return this.openListener.onClickEvent(str);
        }
    }

    public boolean openSMS(String str) {
        isFeatureSupported("sms");
        return true;
    }

    public boolean openTel(String str) {
        isFeatureSupported("tel");
        return true;
    }

    public void playVideo(String str) {
        isFeatureSupported("inlineVideo");
    }

    public void resize() {
    }

    public void setExpandProperties(Map<String, String> map) {
    }

    public abstract void setOrientationProperties(Map<String, String> map);

    public void setResizeProperties(Map<String, String> map) {
    }

    public void storePicture(String str) {
        isFeatureSupported("storePicture");
    }

    public abstract void useCustomClose(String str);
}
