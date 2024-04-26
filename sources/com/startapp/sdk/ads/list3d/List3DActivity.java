package com.startapp.sdk.ads.list3d;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import com.startapp.a6;
import com.startapp.g4;
import com.startapp.i4;
import com.startapp.j9;
import com.startapp.r7;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.commontracking.CloseTrackingParams;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.w5;
import com.startapp.wb;
import com.startapp.y5;
import com.startapp.z5;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Sta */
public class List3DActivity extends Activity implements r7 {

    /* renamed from: a  reason: collision with root package name */
    public List3DView f11815a;

    /* renamed from: b  reason: collision with root package name */
    public int f11816b;

    /* renamed from: c  reason: collision with root package name */
    public Long f11817c;

    /* renamed from: d  reason: collision with root package name */
    public Long f11818d;

    /* renamed from: e  reason: collision with root package name */
    public long f11819e = 0;

    /* renamed from: f  reason: collision with root package name */
    public String f11820f;

    /* renamed from: g  reason: collision with root package name */
    public String f11821g;

    /* renamed from: h  reason: collision with root package name */
    public List<w5> f11822h;

    /* renamed from: i  reason: collision with root package name */
    public BroadcastReceiver f11823i = new a();

    /* compiled from: Sta */
    public class a extends BroadcastReceiver {
        public a() {
        }

        public void onReceive(Context context, Intent intent) {
            List3DActivity.this.finish();
        }
    }

    /* compiled from: Sta */
    public class b implements AdapterView.OnItemClickListener {

        /* compiled from: Sta */
        public class a implements Runnable {
            public a() {
            }

            public void run() {
                List3DActivity.this.finish();
            }
        }

        public b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            j9 j9Var;
            int i11 = i10;
            String str = List3DActivity.this.f11822h.get(i11).f12744b;
            String[] strArr = List3DActivity.this.f11822h.get(i11).f12746d;
            String str2 = List3DActivity.this.f11822h.get(i11).f12748f;
            boolean z10 = List3DActivity.this.f11822h.get(i11).f12753k;
            boolean z11 = List3DActivity.this.f11822h.get(i11).f12754l;
            String str3 = List3DActivity.this.f11822h.get(i11).f12756n;
            String str4 = List3DActivity.this.f11822h.get(i11).f12755m;
            Boolean bool = List3DActivity.this.f11822h.get(i11).f12758p;
            y5 a10 = z5.f12916b.a(List3DActivity.this.f11820f);
            String[] strArr2 = List3DActivity.this.f11822h.get(i11).f12745c;
            g4 g4Var = a10.f12875a;
            String a11 = g4Var.a(strArr2, a10.f12877c);
            HashMap<String, j9> hashMap = g4Var.f10427a;
            if (!(hashMap == null || (j9Var = hashMap.get(a11)) == null)) {
                j9Var.a((String) null, (JSONObject) null);
            }
            if (str3 != null && !TextUtils.isEmpty(str3)) {
                List3DActivity list3DActivity = List3DActivity.this;
                com.startapp.sdk.adsbase.a.a(str3, str4, str, (Context) list3DActivity, new TrackingParams(list3DActivity.f11821g));
                List3DActivity.this.finish();
            } else if (!TextUtils.isEmpty(str)) {
                boolean k10 = MetaData.f12393k.k();
                boolean a12 = com.startapp.sdk.adsbase.a.a(List3DActivity.this.getApplicationContext(), AdPreferences.Placement.INAPP_OFFER_WALL);
                if (!z10 || a12) {
                    List3DActivity list3DActivity2 = List3DActivity.this;
                    com.startapp.sdk.adsbase.a.a((Context) list3DActivity2, str, strArr, list3DActivity2.a(), z11 && !a12, false);
                    if (k10) {
                        List3DActivity.this.finish();
                        return;
                    }
                    return;
                }
                List3DActivity list3DActivity3 = List3DActivity.this;
                com.startapp.sdk.adsbase.a.a(list3DActivity3, str, strArr, str2, list3DActivity3.a(), AdsCommonMetaData.f12098h.z(), AdsCommonMetaData.f12098h.y(), z11, bool, false, k10 ? new a() : null);
            }
        }
    }

    /* compiled from: Sta */
    public class c implements View.OnClickListener {
        public c() {
        }

        public void onClick(View view) {
            List3DActivity list3DActivity = List3DActivity.this;
            com.startapp.sdk.adsbase.a.a((Context) list3DActivity, list3DActivity.b(), List3DActivity.this.a());
            List3DActivity.this.finish();
        }
    }

    /* compiled from: Sta */
    public class d implements Runnable {
        public d() {
        }

        public void run() {
            List3DActivity.this.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
    }

    public TrackingParams a() {
        return new CloseTrackingParams((SystemClock.uptimeMillis() - this.f11819e) / 1000, this.f11821g);
    }

    public String b() {
        List<w5> list = this.f11822h;
        if (list == null || list.isEmpty() || this.f11822h.get(0).f12747e == null) {
            return "";
        }
        return this.f11822h.get(0).f12747e;
    }

    public void finish() {
        try {
            SystemClock.uptimeMillis();
            com.startapp.sdk.adsbase.a.a((Context) this, b(), a());
            Object obj = StartAppSDKInternal.D;
            StartAppSDKInternal.d.f12173a.f12147o = false;
            if (this.f11816b == getResources().getConfiguration().orientation) {
                a6.a((Context) this).a(new Intent("com.startapp.android.HideDisplayBroadcastListener"));
            }
            synchronized (this) {
                if (this.f11823i != null) {
                    a6.a((Context) this).a(this.f11823i);
                    this.f11823i = null;
                }
            }
            String str = this.f11820f;
            if (str != null) {
                z5.f12916b.a(str).a();
                if (!AdsConstants.f12104f.booleanValue()) {
                    z5 z5Var = z5.f12916b;
                    z5Var.f12917a.remove(this.f11820f);
                }
            }
        } catch (Throwable th) {
            i4.a(th);
        }
        super.finish();
    }

    public void onBackPressed() {
        z5.f12916b.a(this.f11820f).a();
        super.onBackPressed();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: android.widget.ImageButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: android.widget.TextView} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            r0 = 0
            r14.overridePendingTransition(r0, r0)     // Catch:{ all -> 0x037e }
            super.onCreate(r15)     // Catch:{ all -> 0x037e }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ all -> 0x037e }
            java.lang.String r2 = "fullscreen"
            boolean r1 = r1.getBooleanExtra(r2, r0)     // Catch:{ all -> 0x037e }
            r2 = 1
            if (r1 == 0) goto L_0x0020
            r14.requestWindowFeature(r2)     // Catch:{ all -> 0x037e }
            android.view.Window r1 = r14.getWindow()     // Catch:{ all -> 0x037e }
            r3 = 1024(0x400, float:1.435E-42)
            r1.setFlags(r3, r3)     // Catch:{ all -> 0x037e }
        L_0x0020:
            java.lang.String r1 = "adCacheTtl"
            java.lang.String r3 = "lastLoadTime"
            if (r15 != 0) goto L_0x004d
            com.startapp.a6 r15 = com.startapp.a6.a((android.content.Context) r14)     // Catch:{ all -> 0x037e }
            android.content.Intent r4 = new android.content.Intent     // Catch:{ all -> 0x037e }
            java.lang.String r5 = "com.startapp.android.ShowDisplayBroadcastListener"
            r4.<init>(r5)     // Catch:{ all -> 0x037e }
            r15.a((android.content.Intent) r4)     // Catch:{ all -> 0x037e }
            android.content.Intent r15 = r14.getIntent()     // Catch:{ all -> 0x037e }
            java.io.Serializable r15 = r15.getSerializableExtra(r3)     // Catch:{ all -> 0x037e }
            java.lang.Long r15 = (java.lang.Long) r15     // Catch:{ all -> 0x037e }
            r14.f11817c = r15     // Catch:{ all -> 0x037e }
            android.content.Intent r15 = r14.getIntent()     // Catch:{ all -> 0x037e }
            java.io.Serializable r15 = r15.getSerializableExtra(r1)     // Catch:{ all -> 0x037e }
            java.lang.Long r15 = (java.lang.Long) r15     // Catch:{ all -> 0x037e }
            r14.f11818d = r15     // Catch:{ all -> 0x037e }
            goto L_0x0069
        L_0x004d:
            boolean r4 = r15.containsKey(r3)     // Catch:{ all -> 0x037e }
            if (r4 == 0) goto L_0x005b
            java.io.Serializable r3 = r15.getSerializable(r3)     // Catch:{ all -> 0x037e }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x037e }
            r14.f11817c = r3     // Catch:{ all -> 0x037e }
        L_0x005b:
            boolean r3 = r15.containsKey(r1)     // Catch:{ all -> 0x037e }
            if (r3 == 0) goto L_0x0069
            java.io.Serializable r15 = r15.getSerializable(r1)     // Catch:{ all -> 0x037e }
            java.lang.Long r15 = (java.lang.Long) r15     // Catch:{ all -> 0x037e }
            r14.f11818d = r15     // Catch:{ all -> 0x037e }
        L_0x0069:
            android.content.Intent r15 = r14.getIntent()     // Catch:{ all -> 0x037e }
            java.lang.String r1 = "position"
            r15.getStringExtra(r1)     // Catch:{ all -> 0x037e }
            android.content.Intent r15 = r14.getIntent()     // Catch:{ all -> 0x037e }
            java.lang.String r1 = "listModelUuid"
            java.lang.String r15 = r15.getStringExtra(r1)     // Catch:{ all -> 0x037e }
            r14.f11820f = r15     // Catch:{ all -> 0x037e }
            com.startapp.a6 r15 = com.startapp.a6.a((android.content.Context) r14)     // Catch:{ all -> 0x037e }
            android.content.BroadcastReceiver r1 = r14.f11823i     // Catch:{ all -> 0x037e }
            android.content.IntentFilter r3 = new android.content.IntentFilter     // Catch:{ all -> 0x037e }
            java.lang.String r4 = "com.startapp.android.CloseAdActivity"
            r3.<init>(r4)     // Catch:{ all -> 0x037e }
            r15.a(r1, r3)     // Catch:{ all -> 0x037e }
            android.content.res.Resources r15 = r14.getResources()     // Catch:{ all -> 0x037e }
            android.content.res.Configuration r15 = r15.getConfiguration()     // Catch:{ all -> 0x037e }
            int r15 = r15.orientation     // Catch:{ all -> 0x037e }
            r14.f11816b = r15     // Catch:{ all -> 0x037e }
            java.util.Map<android.app.Activity, java.lang.Integer> r15 = com.startapp.wb.f12765a     // Catch:{ all -> 0x037e }
            android.content.res.Resources r15 = r14.getResources()     // Catch:{ all -> 0x037e }
            android.content.res.Configuration r15 = r15.getConfiguration()     // Catch:{ all -> 0x037e }
            int r15 = r15.orientation     // Catch:{ all -> 0x037e }
            com.startapp.wb.a((android.app.Activity) r14, (int) r15, (boolean) r2)     // Catch:{ all -> 0x037e }
            r14.requestWindowFeature(r2)     // Catch:{ all -> 0x037e }
            android.content.Intent r15 = r14.getIntent()     // Catch:{ all -> 0x037e }
            java.lang.String r1 = "adTag"
            java.lang.String r15 = r15.getStringExtra(r1)     // Catch:{ all -> 0x037e }
            r14.f11821g = r15     // Catch:{ all -> 0x037e }
            com.startapp.sdk.adsbase.AdsCommonMetaData r15 = com.startapp.sdk.adsbase.AdsCommonMetaData.f12098h     // Catch:{ all -> 0x037e }
            int r15 = r15.d()     // Catch:{ all -> 0x037e }
            com.startapp.sdk.adsbase.AdsCommonMetaData r1 = com.startapp.sdk.adsbase.AdsCommonMetaData.f12098h     // Catch:{ all -> 0x037e }
            int r1 = r1.c()     // Catch:{ all -> 0x037e }
            com.startapp.sdk.ads.list3d.List3DView r3 = new com.startapp.sdk.ads.list3d.List3DView     // Catch:{ all -> 0x037e }
            java.lang.String r4 = r14.f11821g     // Catch:{ all -> 0x037e }
            java.lang.String r5 = r14.f11820f     // Catch:{ all -> 0x037e }
            r6 = 0
            r3.<init>(r14, r6, r4, r5)     // Catch:{ all -> 0x037e }
            r14.f11815a = r3     // Catch:{ all -> 0x037e }
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable     // Catch:{ all -> 0x037e }
            android.graphics.drawable.GradientDrawable$Orientation r4 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM     // Catch:{ all -> 0x037e }
            r5 = 2
            int[] r7 = new int[r5]     // Catch:{ all -> 0x037e }
            r7[r0] = r15     // Catch:{ all -> 0x037e }
            r7[r2] = r1     // Catch:{ all -> 0x037e }
            r3.<init>(r4, r7)     // Catch:{ all -> 0x037e }
            com.startapp.sdk.ads.list3d.List3DView r15 = r14.f11815a     // Catch:{ all -> 0x037e }
            r15.setBackgroundDrawable(r3)     // Catch:{ all -> 0x037e }
            com.startapp.z5 r15 = com.startapp.z5.f12916b     // Catch:{ all -> 0x037e }
            java.lang.String r1 = r14.f11820f     // Catch:{ all -> 0x037e }
            com.startapp.y5 r15 = r15.a(r1)     // Catch:{ all -> 0x037e }
            java.util.List<com.startapp.w5> r15 = r15.f12876b     // Catch:{ all -> 0x037e }
            r14.f11822h = r15     // Catch:{ all -> 0x037e }
            if (r15 != 0) goto L_0x00f5
            r14.finish()     // Catch:{ all -> 0x037e }
            return
        L_0x00f5:
            com.startapp.sdk.ads.list3d.List3DView r15 = r14.f11815a     // Catch:{ all -> 0x037e }
            r15.setStarted()     // Catch:{ all -> 0x037e }
            com.startapp.sdk.ads.list3d.List3DView r15 = r14.f11815a     // Catch:{ all -> 0x037e }
            r15.setHint(r2)     // Catch:{ all -> 0x037e }
            com.startapp.sdk.ads.list3d.List3DView r15 = r14.f11815a     // Catch:{ all -> 0x037e }
            r15.setFade(r2)     // Catch:{ all -> 0x037e }
            com.startapp.s5 r15 = new com.startapp.s5     // Catch:{ all -> 0x037e }
            java.util.List<com.startapp.w5> r1 = r14.f11822h     // Catch:{ all -> 0x037e }
            java.lang.String r3 = r14.f11821g     // Catch:{ all -> 0x037e }
            java.lang.String r4 = r14.f11820f     // Catch:{ all -> 0x037e }
            r15.<init>(r14, r1, r3, r4)     // Catch:{ all -> 0x037e }
            com.startapp.z5 r1 = com.startapp.z5.f12916b     // Catch:{ all -> 0x037e }
            java.lang.String r3 = r14.f11820f     // Catch:{ all -> 0x037e }
            com.startapp.y5 r1 = r1.a(r3)     // Catch:{ all -> 0x037e }
            r1.a(r14, r2)     // Catch:{ all -> 0x037e }
            com.startapp.sdk.ads.list3d.List3DView r1 = r14.f11815a     // Catch:{ all -> 0x037e }
            r1.setAdapter(r15)     // Catch:{ all -> 0x037e }
            com.startapp.sdk.ads.list3d.List3DView r15 = r14.f11815a     // Catch:{ all -> 0x037e }
            com.startapp.y9 r1 = new com.startapp.y9     // Catch:{ all -> 0x037e }
            r3 = 1063675494(0x3f666666, float:0.9)
            r4 = 1058642330(0x3f19999a, float:0.6)
            r1.<init>(r3, r4)     // Catch:{ all -> 0x037e }
            r15.setDynamics(r1)     // Catch:{ all -> 0x037e }
            com.startapp.sdk.ads.list3d.List3DView r15 = r14.f11815a     // Catch:{ all -> 0x037e }
            com.startapp.sdk.ads.list3d.List3DActivity$b r1 = new com.startapp.sdk.ads.list3d.List3DActivity$b     // Catch:{ all -> 0x037e }
            r1.<init>()     // Catch:{ all -> 0x037e }
            r15.setOnItemClickListener(r1)     // Catch:{ all -> 0x037e }
            android.widget.RelativeLayout r15 = new android.widget.RelativeLayout     // Catch:{ all -> 0x037e }
            r15.<init>(r14)     // Catch:{ all -> 0x037e }
            java.lang.String r1 = "StartApp Ad"
            r15.setContentDescription(r1)     // Catch:{ all -> 0x037e }
            r1 = 1475346432(0x57f00000, float:5.27765581E14)
            r15.setId(r1)     // Catch:{ all -> 0x037e }
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x037e }
            r3 = -1
            r1.<init>(r3, r3)     // Catch:{ all -> 0x037e }
            android.widget.RelativeLayout$LayoutParams r4 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x037e }
            r4.<init>(r3, r3)     // Catch:{ all -> 0x037e }
            android.widget.LinearLayout r7 = new android.widget.LinearLayout     // Catch:{ all -> 0x037e }
            r7.<init>(r14)     // Catch:{ all -> 0x037e }
            r7.setOrientation(r2)     // Catch:{ all -> 0x037e }
            r15.addView(r7, r4)     // Catch:{ all -> 0x037e }
            android.widget.RelativeLayout r4 = new android.widget.RelativeLayout     // Catch:{ all -> 0x037e }
            r4.<init>(r14)     // Catch:{ all -> 0x037e }
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x037e }
            r9 = -2
            r8.<init>(r3, r9)     // Catch:{ all -> 0x037e }
            r4.setLayoutParams(r8)     // Catch:{ all -> 0x037e }
            com.startapp.sdk.adsbase.AdsCommonMetaData r8 = com.startapp.sdk.adsbase.AdsCommonMetaData.f12098h     // Catch:{ all -> 0x037e }
            java.lang.Integer r8 = r8.A()     // Catch:{ all -> 0x037e }
            int r8 = r8.intValue()     // Catch:{ all -> 0x037e }
            r4.setBackgroundColor(r8)     // Catch:{ all -> 0x037e }
            r7.addView(r4)     // Catch:{ all -> 0x037e }
            android.widget.TextView r8 = new android.widget.TextView     // Catch:{ all -> 0x037e }
            r8.<init>(r14)     // Catch:{ all -> 0x037e }
            android.widget.RelativeLayout$LayoutParams r10 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x037e }
            r10.<init>(r9, r9)     // Catch:{ all -> 0x037e }
            r11 = 13
            r10.addRule(r11)     // Catch:{ all -> 0x037e }
            r8.setLayoutParams(r10)     // Catch:{ all -> 0x037e }
            float r5 = (float) r5     // Catch:{ all -> 0x037e }
            android.content.res.Resources r10 = r14.getResources()     // Catch:{ all -> 0x037e }
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()     // Catch:{ all -> 0x037e }
            float r10 = android.util.TypedValue.applyDimension(r2, r5, r10)     // Catch:{ all -> 0x037e }
            int r10 = java.lang.Math.round(r10)     // Catch:{ all -> 0x037e }
            r11 = 5
            float r11 = (float) r11     // Catch:{ all -> 0x037e }
            android.content.res.Resources r12 = r14.getResources()     // Catch:{ all -> 0x037e }
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()     // Catch:{ all -> 0x037e }
            float r11 = android.util.TypedValue.applyDimension(r2, r11, r12)     // Catch:{ all -> 0x037e }
            int r11 = java.lang.Math.round(r11)     // Catch:{ all -> 0x037e }
            r8.setPadding(r0, r10, r0, r11)     // Catch:{ all -> 0x037e }
            com.startapp.sdk.adsbase.AdsCommonMetaData r10 = com.startapp.sdk.adsbase.AdsCommonMetaData.f12098h     // Catch:{ all -> 0x037e }
            java.lang.Integer r10 = r10.D()     // Catch:{ all -> 0x037e }
            int r10 = r10.intValue()     // Catch:{ all -> 0x037e }
            r8.setTextColor(r10)     // Catch:{ all -> 0x037e }
            com.startapp.sdk.adsbase.AdsCommonMetaData r10 = com.startapp.sdk.adsbase.AdsCommonMetaData.f12098h     // Catch:{ all -> 0x037e }
            java.lang.Integer r10 = r10.F()     // Catch:{ all -> 0x037e }
            int r10 = r10.intValue()     // Catch:{ all -> 0x037e }
            float r10 = (float) r10     // Catch:{ all -> 0x037e }
            r8.setTextSize(r10)     // Catch:{ all -> 0x037e }
            r8.setSingleLine(r2)     // Catch:{ all -> 0x037e }
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.END     // Catch:{ all -> 0x037e }
            r8.setEllipsize(r10)     // Catch:{ all -> 0x037e }
            com.startapp.sdk.adsbase.AdsCommonMetaData r10 = com.startapp.sdk.adsbase.AdsCommonMetaData.f12098h     // Catch:{ all -> 0x037e }
            java.lang.String r10 = r10.B()     // Catch:{ all -> 0x037e }
            r8.setText(r10)     // Catch:{ all -> 0x037e }
            r10 = 1075838976(0x40200000, float:2.5)
            r11 = -1073741824(0xffffffffc0000000, float:-2.0)
            r12 = 1073741824(0x40000000, float:2.0)
            r13 = -11513776(0xffffffffff505050, float:-2.7689643E38)
            r8.setShadowLayer(r10, r11, r12, r13)     // Catch:{ all -> 0x037e }
            com.startapp.sdk.adsbase.AdsCommonMetaData r10 = com.startapp.sdk.adsbase.AdsCommonMetaData.f12098h     // Catch:{ all -> 0x037e }
            java.util.Set r10 = r10.E()     // Catch:{ all -> 0x037e }
            com.startapp.qb.a((android.widget.TextView) r8, (java.util.Set<java.lang.String>) r10)     // Catch:{ all -> 0x037e }
            r4.addView(r8)     // Catch:{ all -> 0x037e }
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x037e }
            r8.<init>(r9, r9)     // Catch:{ all -> 0x037e }
            r10 = 11
            r8.addRule(r10)     // Catch:{ all -> 0x037e }
            r10 = 15
            r8.addRule(r10)     // Catch:{ all -> 0x037e }
            java.lang.String r10 = "close_button.png"
            android.graphics.Bitmap r10 = com.startapp.e1.a(r14, r10)     // Catch:{ all -> 0x037e }
            if (r10 == 0) goto L_0x0242
            android.widget.ImageButton r11 = new android.widget.ImageButton     // Catch:{ all -> 0x037e }
            r12 = 16973839(0x103000f, float:2.4060942E-38)
            r11.<init>(r14, r6, r12)     // Catch:{ all -> 0x037e }
            r6 = 36
            float r6 = (float) r6     // Catch:{ all -> 0x037e }
            android.content.res.Resources r12 = r14.getResources()     // Catch:{ all -> 0x037e }
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()     // Catch:{ all -> 0x037e }
            float r12 = android.util.TypedValue.applyDimension(r2, r6, r12)     // Catch:{ all -> 0x037e }
            int r12 = java.lang.Math.round(r12)     // Catch:{ all -> 0x037e }
            android.content.res.Resources r13 = r14.getResources()     // Catch:{ all -> 0x037e }
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()     // Catch:{ all -> 0x037e }
            float r6 = android.util.TypedValue.applyDimension(r2, r6, r13)     // Catch:{ all -> 0x037e }
            int r6 = java.lang.Math.round(r6)     // Catch:{ all -> 0x037e }
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createScaledBitmap(r10, r12, r6, r2)     // Catch:{ all -> 0x037e }
            r11.setImageBitmap(r6)     // Catch:{ all -> 0x037e }
            goto L_0x0251
        L_0x0242:
            android.widget.TextView r11 = new android.widget.TextView     // Catch:{ all -> 0x037e }
            r11.<init>(r14)     // Catch:{ all -> 0x037e }
            java.lang.String r6 = "   x   "
            r11.setText(r6)     // Catch:{ all -> 0x037e }
            r6 = 1101004800(0x41a00000, float:20.0)
            r11.setTextSize(r6)     // Catch:{ all -> 0x037e }
        L_0x0251:
            r11.setLayoutParams(r8)     // Catch:{ all -> 0x037e }
            com.startapp.sdk.ads.list3d.List3DActivity$c r6 = new com.startapp.sdk.ads.list3d.List3DActivity$c     // Catch:{ all -> 0x037e }
            r6.<init>()     // Catch:{ all -> 0x037e }
            r11.setOnClickListener(r6)     // Catch:{ all -> 0x037e }
            java.lang.String r6 = "x"
            r11.setContentDescription(r6)     // Catch:{ all -> 0x037e }
            r6 = 1475346435(0x57f00003, float:5.27765682E14)
            r11.setId(r6)     // Catch:{ all -> 0x037e }
            r4.addView(r11)     // Catch:{ all -> 0x037e }
            android.view.View r4 = new android.view.View     // Catch:{ all -> 0x037e }
            r4.<init>(r14)     // Catch:{ all -> 0x037e }
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams     // Catch:{ all -> 0x037e }
            android.content.res.Resources r8 = r14.getResources()     // Catch:{ all -> 0x037e }
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()     // Catch:{ all -> 0x037e }
            float r8 = android.util.TypedValue.applyDimension(r2, r5, r8)     // Catch:{ all -> 0x037e }
            int r8 = java.lang.Math.round(r8)     // Catch:{ all -> 0x037e }
            r6.<init>(r3, r8)     // Catch:{ all -> 0x037e }
            r4.setLayoutParams(r6)     // Catch:{ all -> 0x037e }
            com.startapp.sdk.adsbase.AdsCommonMetaData r6 = com.startapp.sdk.adsbase.AdsCommonMetaData.f12098h     // Catch:{ all -> 0x037e }
            java.lang.Integer r6 = r6.C()     // Catch:{ all -> 0x037e }
            int r6 = r6.intValue()     // Catch:{ all -> 0x037e }
            r4.setBackgroundColor(r6)     // Catch:{ all -> 0x037e }
            r7.addView(r4)     // Catch:{ all -> 0x037e }
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams     // Catch:{ all -> 0x037e }
            r4.<init>(r3, r0)     // Catch:{ all -> 0x037e }
            r6 = 1065353216(0x3f800000, float:1.0)
            r4.weight = r6     // Catch:{ all -> 0x037e }
            com.startapp.sdk.ads.list3d.List3DView r6 = r14.f11815a     // Catch:{ all -> 0x037e }
            r6.setLayoutParams(r4)     // Catch:{ all -> 0x037e }
            com.startapp.sdk.ads.list3d.List3DView r4 = r14.f11815a     // Catch:{ all -> 0x037e }
            r7.addView(r4)     // Catch:{ all -> 0x037e }
            android.widget.LinearLayout r4 = new android.widget.LinearLayout     // Catch:{ all -> 0x037e }
            r4.<init>(r14)     // Catch:{ all -> 0x037e }
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams     // Catch:{ all -> 0x037e }
            r6.<init>(r3, r9)     // Catch:{ all -> 0x037e }
            r3 = 80
            r6.gravity = r3     // Catch:{ all -> 0x037e }
            r4.setLayoutParams(r6)     // Catch:{ all -> 0x037e }
            com.startapp.sdk.adsbase.AdsCommonMetaData r3 = com.startapp.sdk.adsbase.AdsCommonMetaData.f12098h     // Catch:{ all -> 0x037e }
            java.lang.Integer r3 = r3.u()     // Catch:{ all -> 0x037e }
            int r3 = r3.intValue()     // Catch:{ all -> 0x037e }
            r4.setBackgroundColor(r3)     // Catch:{ all -> 0x037e }
            r3 = 17
            r4.setGravity(r3)     // Catch:{ all -> 0x037e }
            r7.addView(r4)     // Catch:{ all -> 0x037e }
            android.widget.TextView r3 = new android.widget.TextView     // Catch:{ all -> 0x037e }
            r3.<init>(r14)     // Catch:{ all -> 0x037e }
            com.startapp.sdk.adsbase.AdsCommonMetaData r6 = com.startapp.sdk.adsbase.AdsCommonMetaData.f12098h     // Catch:{ all -> 0x037e }
            java.lang.Integer r6 = r6.v()     // Catch:{ all -> 0x037e }
            int r6 = r6.intValue()     // Catch:{ all -> 0x037e }
            r3.setTextColor(r6)     // Catch:{ all -> 0x037e }
            android.content.res.Resources r6 = r14.getResources()     // Catch:{ all -> 0x037e }
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()     // Catch:{ all -> 0x037e }
            float r5 = android.util.TypedValue.applyDimension(r2, r5, r6)     // Catch:{ all -> 0x037e }
            int r5 = java.lang.Math.round(r5)     // Catch:{ all -> 0x037e }
            r6 = 3
            float r6 = (float) r6     // Catch:{ all -> 0x037e }
            android.content.res.Resources r7 = r14.getResources()     // Catch:{ all -> 0x037e }
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()     // Catch:{ all -> 0x037e }
            float r6 = android.util.TypedValue.applyDimension(r2, r6, r7)     // Catch:{ all -> 0x037e }
            int r6 = java.lang.Math.round(r6)     // Catch:{ all -> 0x037e }
            r3.setPadding(r0, r5, r0, r6)     // Catch:{ all -> 0x037e }
            java.lang.String r0 = "Powered By "
            r3.setText(r0)     // Catch:{ all -> 0x037e }
            r0 = 1098907648(0x41800000, float:16.0)
            r3.setTextSize(r0)     // Catch:{ all -> 0x037e }
            r4.addView(r3)     // Catch:{ all -> 0x037e }
            android.widget.ImageView r0 = new android.widget.ImageView     // Catch:{ all -> 0x037e }
            r0.<init>(r14)     // Catch:{ all -> 0x037e }
            java.lang.String r3 = "logo.png"
            android.graphics.Bitmap r3 = com.startapp.e1.a(r14, r3)     // Catch:{ all -> 0x037e }
            r5 = 56
            float r5 = (float) r5     // Catch:{ all -> 0x037e }
            android.content.res.Resources r6 = r14.getResources()     // Catch:{ all -> 0x037e }
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()     // Catch:{ all -> 0x037e }
            float r5 = android.util.TypedValue.applyDimension(r2, r5, r6)     // Catch:{ all -> 0x037e }
            int r5 = java.lang.Math.round(r5)     // Catch:{ all -> 0x037e }
            r6 = 12
            float r6 = (float) r6     // Catch:{ all -> 0x037e }
            android.content.res.Resources r7 = r14.getResources()     // Catch:{ all -> 0x037e }
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()     // Catch:{ all -> 0x037e }
            float r6 = android.util.TypedValue.applyDimension(r2, r6, r7)     // Catch:{ all -> 0x037e }
            int r6 = java.lang.Math.round(r6)     // Catch:{ all -> 0x037e }
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createScaledBitmap(r3, r5, r6, r2)     // Catch:{ all -> 0x037e }
            r0.setImageBitmap(r2)     // Catch:{ all -> 0x037e }
            r4.addView(r0)     // Catch:{ all -> 0x037e }
            android.content.Intent r0 = r14.getIntent()     // Catch:{ all -> 0x037e }
            java.lang.String r2 = "adInfoOverride"
            java.io.Serializable r0 = r0.getSerializableExtra(r2)     // Catch:{ all -> 0x037e }
            r6 = r0
            com.startapp.sdk.adsbase.adinformation.AdInformationOverrides r6 = (com.startapp.sdk.adsbase.adinformation.AdInformationOverrides) r6     // Catch:{ all -> 0x037e }
            com.startapp.sdk.adsbase.adinformation.AdInformationObject r0 = new com.startapp.sdk.adsbase.adinformation.AdInformationObject     // Catch:{ all -> 0x037e }
            com.startapp.sdk.adsbase.adinformation.AdInformationObject$Size r4 = com.startapp.sdk.adsbase.adinformation.AdInformationObject.Size.LARGE     // Catch:{ all -> 0x037e }
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r5 = com.startapp.sdk.adsbase.model.AdPreferences.Placement.INAPP_OFFER_WALL     // Catch:{ all -> 0x037e }
            r7 = 0
            r2 = r0
            r3 = r14
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x037e }
            r0.a(r15)     // Catch:{ all -> 0x037e }
            r14.setContentView(r15, r1)     // Catch:{ all -> 0x037e }
            android.os.Handler r15 = new android.os.Handler     // Catch:{ all -> 0x037e }
            r15.<init>()     // Catch:{ all -> 0x037e }
            com.startapp.sdk.ads.list3d.List3DActivity$d r0 = new com.startapp.sdk.ads.list3d.List3DActivity$d     // Catch:{ all -> 0x037e }
            r0.<init>()     // Catch:{ all -> 0x037e }
            r1 = 500(0x1f4, double:2.47E-321)
            r15.postDelayed(r0, r1)     // Catch:{ all -> 0x037e }
            goto L_0x0385
        L_0x037e:
            r15 = move-exception
            com.startapp.i4.a((java.lang.Throwable) r15)
            r14.finish()
        L_0x0385:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.list3d.List3DActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        if (this.f11823i != null) {
            a6.a((Context) this).a(this.f11823i);
        }
        Map<Activity, Integer> map = wb.f12765a;
        wb.a((Activity) this, getResources().getConfiguration().orientation, false);
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        for (j9 next : z5.f12916b.a(this.f11820f).f12875a.f10427a.values()) {
            if (next != null) {
                next.a();
            }
        }
        overridePendingTransition(0, 0);
    }

    public void onResume() {
        super.onResume();
        if ((this.f11817c == null || this.f11818d == null || System.currentTimeMillis() - this.f11817c.longValue() <= this.f11818d.longValue()) ? false : true) {
            finish();
            return;
        }
        Object obj = StartAppSDKInternal.D;
        StartAppSDKInternal.d.f12173a.f12147o = true;
        this.f11819e = SystemClock.uptimeMillis();
        g4 g4Var = z5.f12916b.a(this.f11820f).f12875a;
        for (String next : g4Var.f10427a.keySet()) {
            if (g4Var.f10427a.get(next) != null) {
                g4Var.f10427a.get(next).b();
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Long l10 = this.f11817c;
        if (l10 != null) {
            bundle.putSerializable("lastLoadTime", l10);
        }
        Long l11 = this.f11818d;
        if (l11 != null) {
            bundle.putSerializable("adCacheTtl", l11);
        }
    }
}
