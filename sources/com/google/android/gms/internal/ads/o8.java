package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import d7.l;
import e8.ef;
import e8.t;
import e8.tg0;
import e8.ti0;
import e8.vg0;
import f7.d;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class o8 implements j2<ef> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7673a;

    /* renamed from: b  reason: collision with root package name */
    public final tg0 f7674b;

    /* renamed from: c  reason: collision with root package name */
    public final PowerManager f7675c;

    public o8(Context context, tg0 tg0) {
        this.f7673a = context;
        this.f7674b = tg0;
        this.f7675c = (PowerManager) context.getSystemService("power");
    }

    /* renamed from: a */
    public final JSONObject c(ef efVar) throws JSONException {
        JSONObject jSONObject;
        boolean z10;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        vg0 vg0 = efVar.f14459e;
        if (vg0 == null) {
            jSONObject = new JSONObject();
        } else if (this.f7674b.f16755b != null) {
            boolean z11 = vg0.f17133a;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", this.f7674b.f16757d).put("activeViewJSON", this.f7674b.f16755b).put("timestamp", efVar.f14457c).put("adFormat", this.f7674b.f16754a).put("hashCode", this.f7674b.f16756c).put("isMraid", false).put("isStopped", false).put("isPaused", efVar.f14456b).put("isNative", this.f7674b.f16758e);
            if (Build.VERSION.SDK_INT >= 20) {
                z10 = this.f7675c.isInteractive();
            } else {
                z10 = this.f7675c.isScreenOn();
            }
            put.put("isScreenOn", z10).put("appMuted", l.B.f13191h.c()).put("appVolume", (double) l.B.f13191h.b()).put("deviceVolume", (double) d.a(this.f7673a.getApplicationContext()));
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.f7673a.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", vg0.f17134b).put("isAttachedToWindow", z11).put("viewBox", new JSONObject().put("top", vg0.f17135c.top).put("bottom", vg0.f17135c.bottom).put("left", vg0.f17135c.left).put("right", vg0.f17135c.right)).put("adBox", new JSONObject().put("top", vg0.f17136d.top).put("bottom", vg0.f17136d.bottom).put("left", vg0.f17136d.left).put("right", vg0.f17136d.right)).put("globalVisibleBox", new JSONObject().put("top", vg0.f17137e.top).put("bottom", vg0.f17137e.bottom).put("left", vg0.f17137e.left).put("right", vg0.f17137e.right)).put("globalVisibleBoxVisible", vg0.f17138f).put("localVisibleBox", new JSONObject().put("top", vg0.f17139g.top).put("bottom", vg0.f17139g.bottom).put("left", vg0.f17139g.left).put("right", vg0.f17139g.right)).put("localVisibleBoxVisible", vg0.f17140h).put("hitBox", new JSONObject().put("top", vg0.f17141i.top).put("bottom", vg0.f17141i.bottom).put("left", vg0.f17141i.left).put("right", vg0.f17141i.right)).put("screenDensity", (double) this.f7673a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", efVar.f14455a);
            if (((Boolean) ti0.f16763j.f16769f.a(t.M0)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = vg0.f17143k;
                if (list != null) {
                    for (Rect next : list) {
                        jSONArray2.put(new JSONObject().put("top", next.top).put("bottom", next.bottom).put("left", next.left).put("right", next.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(efVar.f14458d)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        } else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
