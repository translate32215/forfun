package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.common.internal.i;
import d7.l;
import e8.aa;
import e8.ba;
import e8.ca;
import e8.h9;
import e8.ia;
import e8.ja;
import e8.k9;
import e8.ka;
import e8.ma;
import e8.o50;
import e8.oa;
import e8.t;
import e8.t9;
import e8.ti0;
import f7.j;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class i7 extends FrameLayout implements f7 {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f6920z = 0;

    /* renamed from: a  reason: collision with root package name */
    public final ia f6921a;

    /* renamed from: b  reason: collision with root package name */
    public final FrameLayout f6922b;

    /* renamed from: c  reason: collision with root package name */
    public final k f6923c;

    /* renamed from: d  reason: collision with root package name */
    public final ba f6924d;

    /* renamed from: e  reason: collision with root package name */
    public final long f6925e;

    /* renamed from: f  reason: collision with root package name */
    public aa f6926f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6927g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6928h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6929i;

    /* renamed from: r  reason: collision with root package name */
    public boolean f6930r;

    /* renamed from: s  reason: collision with root package name */
    public long f6931s;

    /* renamed from: t  reason: collision with root package name */
    public long f6932t;

    /* renamed from: u  reason: collision with root package name */
    public String f6933u;

    /* renamed from: v  reason: collision with root package name */
    public String[] f6934v;

    /* renamed from: w  reason: collision with root package name */
    public Bitmap f6935w;

    /* renamed from: x  reason: collision with root package name */
    public ImageView f6936x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f6937y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i7(Context context, ia iaVar, int i10, boolean z10, k kVar, ja jaVar) {
        super(context);
        aa aaVar;
        Context context2 = context;
        k kVar2 = kVar;
        this.f6921a = iaVar;
        this.f6923c = kVar2;
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f6922b = frameLayout;
        if (((Boolean) ti0.f16763j.f16769f.a(t.C)).booleanValue()) {
            frameLayout.setBackgroundResource(17170444);
        }
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        i.h(iaVar.q());
        ((ca) iaVar.q().f13161b).getClass();
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (!(applicationInfo == null || applicationInfo.targetSdkVersion >= 11)) {
            aaVar = null;
        } else {
            ka kaVar = new ka(context, iaVar.c(), iaVar.getRequestId(), kVar, iaVar.l());
            if (i10 == 2) {
                aaVar = new oa(context, kaVar, iaVar, z10, iaVar.j().b(), jaVar);
            } else {
                Context context3 = context;
                aaVar = new t9(context3, iaVar, z10, iaVar.j().b(), new ka(context3, iaVar.c(), iaVar.getRequestId(), kVar, iaVar.l()));
            }
        }
        this.f6926f = aaVar;
        if (aaVar != null) {
            frameLayout.addView(aaVar, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) ti0.f16763j.f16769f.a(t.f16656t)).booleanValue()) {
                d();
            }
        }
        this.f6936x = new ImageView(context2);
        this.f6925e = ((Long) ti0.f16763j.f16769f.a(t.f16680x)).longValue();
        boolean booleanValue = ((Boolean) ti0.f16763j.f16769f.a(t.f16668v)).booleanValue();
        this.f6930r = booleanValue;
        if (kVar2 != null) {
            kVar2.b("spinner_used", booleanValue ? "1" : "0");
        }
        this.f6924d = new ba(this);
        aa aaVar2 = this.f6926f;
        if (aaVar2 != null) {
            aaVar2.k(this);
        }
        if (this.f6926f == null) {
            k("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    public final void a() {
        h("pause", new String[0]);
        f();
        this.f6927g = false;
    }

    public final void b() {
        if (this.f6921a.b() != null && !this.f6928h) {
            boolean z10 = (this.f6921a.b().getWindow().getAttributes().flags & 128) != 0;
            this.f6929i = z10;
            if (!z10) {
                this.f6921a.b().getWindow().addFlags(128);
                this.f6928h = true;
            }
        }
        this.f6927g = true;
    }

    public final void c() {
        if (this.f6937y && this.f6935w != null) {
            if (!(this.f6936x.getParent() != null)) {
                this.f6936x.setImageBitmap(this.f6935w);
                this.f6936x.invalidate();
                this.f6922b.addView(this.f6936x, new FrameLayout.LayoutParams(-1, -1));
                this.f6922b.bringChildToFront(this.f6936x);
            }
        }
        this.f6924d.a();
        this.f6932t = this.f6931s;
        p.f5702i.post(new j(this));
    }

    @TargetApi(14)
    public final void d() {
        aa aaVar = this.f6926f;
        if (aaVar != null) {
            TextView textView = new TextView(aaVar.getContext());
            String valueOf = String.valueOf(this.f6926f.l());
            textView.setText(valueOf.length() != 0 ? "AdMob - ".concat(valueOf) : new String("AdMob - "));
            textView.setTextColor(-65536);
            textView.setBackgroundColor(-256);
            this.f6922b.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
            this.f6922b.bringChildToFront(textView);
        }
    }

    public final void e() {
        aa aaVar = this.f6926f;
        if (aaVar != null) {
            long currentPosition = (long) aaVar.getCurrentPosition();
            if (this.f6931s != currentPosition && currentPosition > 0) {
                float f10 = ((float) currentPosition) / 1000.0f;
                if (((Boolean) ti0.f16763j.f16769f.a(t.f16562d1)).booleanValue()) {
                    h("timeupdate", "time", String.valueOf(f10), "totalBytes", String.valueOf(this.f6926f.getTotalBytes()), "qoeCachedBytes", String.valueOf(this.f6926f.u()), "qoeLoadedBytes", String.valueOf(this.f6926f.m()), "droppedFrames", String.valueOf(this.f6926f.n()), "reportTime", String.valueOf(l.B.f13193j.b()));
                } else {
                    h("timeupdate", "time", String.valueOf(f10));
                }
                this.f6931s = currentPosition;
            }
        }
    }

    public final void f() {
        if (this.f6921a.b() != null && this.f6928h && !this.f6929i) {
            this.f6921a.b().getWindow().clearFlags(128);
            this.f6928h = false;
        }
    }

    public final void finalize() throws Throwable {
        try {
            this.f6924d.a();
            aa aaVar = this.f6926f;
            if (aaVar != null) {
                o50 o50 = h9.f14885e;
                aaVar.getClass();
                ((k9) o50).f15244a.execute(new j(aaVar));
            }
        } finally {
            super.finalize();
        }
    }

    public final void g(int i10, int i11, int i12, int i13) {
        if (i12 != 0 && i13 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
            layoutParams.setMargins(i10, i11, 0, 0);
            this.f6922b.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    public final void h(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.f6921a.O("onVideoEvent", hashMap);
    }

    public final void i() {
        aa aaVar = this.f6926f;
        if (aaVar != null && this.f6932t == 0) {
            h("canplaythrough", "duration", String.valueOf(((float) aaVar.getDuration()) / 1000.0f), "videoWidth", String.valueOf(this.f6926f.getVideoWidth()), "videoHeight", String.valueOf(this.f6926f.getVideoHeight()));
        }
    }

    public final void j(int i10, int i11) {
        if (this.f6930r) {
            e8.l lVar = t.f16674w;
            int max = Math.max(i10 / ((Integer) ti0.f16763j.f16769f.a(lVar)).intValue(), 1);
            int max2 = Math.max(i11 / ((Integer) ti0.f16763j.f16769f.a(lVar)).intValue(), 1);
            Bitmap bitmap = this.f6935w;
            if (bitmap == null || bitmap.getWidth() != max || this.f6935w.getHeight() != max2) {
                this.f6935w = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                this.f6937y = false;
            }
        }
    }

    public final void k(String str, String str2) {
        h("error", "what", str, "extra", str2);
    }

    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            this.f6924d.b();
        } else {
            this.f6924d.a();
            this.f6932t = this.f6931s;
        }
        p.f5702i.post(new ba(this, z10, 0));
    }

    public final void onWindowVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            this.f6924d.b();
            z10 = true;
        } else {
            this.f6924d.a();
            this.f6932t = this.f6931s;
            z10 = false;
        }
        p.f5702i.post(new ba(this, z10, 1));
    }

    public final void setVolume(float f10) {
        aa aaVar = this.f6926f;
        if (aaVar != null) {
            ma maVar = aaVar.f13669b;
            maVar.f15480f = f10;
            maVar.b();
            aaVar.a();
        }
    }
}
