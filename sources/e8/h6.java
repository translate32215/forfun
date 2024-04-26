package e8;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.s7;
import com.google.android.gms.internal.ads.t7;
import d7.l;
import java.util.Map;
import l0.e;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class h6 extends gf0 implements f3<t7> {

    /* renamed from: d  reason: collision with root package name */
    public final t7 f14850d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f14851e;

    /* renamed from: f  reason: collision with root package name */
    public final WindowManager f14852f;

    /* renamed from: g  reason: collision with root package name */
    public final i f14853g;

    /* renamed from: h  reason: collision with root package name */
    public DisplayMetrics f14854h;

    /* renamed from: i  reason: collision with root package name */
    public float f14855i;

    /* renamed from: r  reason: collision with root package name */
    public int f14856r = -1;

    /* renamed from: s  reason: collision with root package name */
    public int f14857s = -1;

    /* renamed from: t  reason: collision with root package name */
    public int f14858t;

    /* renamed from: u  reason: collision with root package name */
    public int f14859u = -1;

    /* renamed from: v  reason: collision with root package name */
    public int f14860v = -1;

    /* renamed from: w  reason: collision with root package name */
    public int f14861w = -1;

    /* renamed from: x  reason: collision with root package name */
    public int f14862x = -1;

    public h6(t7 t7Var, Context context, i iVar) {
        super(t7Var);
        this.f14850d = t7Var;
        this.f14851e = context;
        this.f14853g = iVar;
        this.f14852f = (WindowManager) context.getSystemService("window");
    }

    public final void f(Object obj, Map map) {
        JSONObject jSONObject;
        t7 t7Var = (t7) obj;
        this.f14854h = new DisplayMetrics();
        Display defaultDisplay = this.f14852f.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f14854h);
        this.f14855i = this.f14854h.density;
        this.f14858t = defaultDisplay.getRotation();
        y8 y8Var = ti0.f16763j.f16764a;
        DisplayMetrics displayMetrics = this.f14854h;
        this.f14856r = y8.c(displayMetrics, displayMetrics.widthPixels);
        y8 y8Var2 = ti0.f16763j.f16764a;
        DisplayMetrics displayMetrics2 = this.f14854h;
        this.f14857s = y8.c(displayMetrics2, displayMetrics2.heightPixels);
        Activity b10 = this.f14850d.b();
        if (b10 == null || b10.getWindow() == null) {
            this.f14859u = this.f14856r;
            this.f14860v = this.f14857s;
        } else {
            p pVar = l.B.f13186c;
            int[] B = p.B(b10);
            y8 y8Var3 = ti0.f16763j.f16764a;
            this.f14859u = y8.c(this.f14854h, B[0]);
            y8 y8Var4 = ti0.f16763j.f16764a;
            this.f14860v = y8.c(this.f14854h, B[1]);
        }
        if (this.f14850d.j().b()) {
            this.f14861w = this.f14856r;
            this.f14862x = this.f14857s;
        } else {
            this.f14850d.measure(0, 0);
        }
        i(this.f14856r, this.f14857s, this.f14859u, this.f14860v, this.f14855i, this.f14858t);
        i iVar = this.f14853g;
        iVar.getClass();
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        boolean a10 = iVar.a(intent);
        i iVar2 = this.f14853g;
        iVar2.getClass();
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        boolean a11 = iVar2.a(intent2);
        boolean c10 = this.f14853g.c();
        boolean b11 = this.f14853g.b();
        t7 t7Var2 = this.f14850d;
        try {
            jSONObject = new JSONObject().put("sms", a11).put("tel", a10).put("calendar", c10).put("storePicture", b11).put("inlineVideo", true);
        } catch (JSONException e10) {
            e.C("Error occured while obtaining the MRAID capabilities.", e10);
            jSONObject = null;
        }
        t7Var2.F("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.f14850d.getLocationOnScreen(iArr);
        u(ti0.f16763j.f16764a.f(this.f14851e, iArr[0]), ti0.f16763j.f16764a.f(this.f14851e, iArr[1]));
        if (e.h(2)) {
            e.J("Dispatching Ready Event.");
        }
        try {
            ((t7) this.f14776b).F("onReadyEventReceived", new JSONObject().put("js", this.f14850d.c().f14544a));
        } catch (JSONException e11) {
            e.C("Error occurred while dispatching ready Event.", e11);
        }
    }

    public final void u(int i10, int i11) {
        Context context = this.f14851e;
        int i12 = 0;
        if (context instanceof Activity) {
            p pVar = l.B.f13186c;
            i12 = p.E((Activity) context)[0];
        }
        if (this.f14850d.j() == null || !this.f14850d.j().b()) {
            int width = this.f14850d.getWidth();
            int height = this.f14850d.getHeight();
            if (((Boolean) ti0.f16763j.f16769f.a(t.I)).booleanValue()) {
                if (width == 0 && this.f14850d.j() != null) {
                    width = this.f14850d.j().f17239c;
                }
                if (height == 0 && this.f14850d.j() != null) {
                    height = this.f14850d.j().f17238b;
                }
            }
            this.f14861w = ti0.f16763j.f16764a.f(this.f14851e, width);
            this.f14862x = ti0.f16763j.f16764a.f(this.f14851e, height);
        }
        int i13 = i11 - i12;
        int i14 = this.f14861w;
        try {
            ((t7) this.f14776b).F("onDefaultPositionReceived", new JSONObject().put("x", i10).put("y", i13).put("width", i14).put("height", this.f14862x));
        } catch (JSONException e10) {
            e.C("Error occurred while dispatching default position.", e10);
        }
        b6 b6Var = ((s7) this.f14850d.H()).f8106z;
        if (b6Var != null) {
            b6Var.f13882f = i10;
            b6Var.f13883g = i11;
        }
    }
}
