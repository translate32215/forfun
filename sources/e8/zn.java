package e8;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.util.k;
import com.google.android.gms.internal.ads.ja;
import com.google.android.gms.internal.ads.s7;
import com.google.android.gms.internal.ads.t7;
import java.util.Map;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class zn implements f3 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17776a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final ja f17777b;

    /* renamed from: c  reason: collision with root package name */
    public final WindowManager f17778c;

    /* renamed from: d  reason: collision with root package name */
    public final View f17779d;

    public zn(ja jaVar, View view, WindowManager windowManager) {
        this.f17777b = jaVar;
        this.f17779d = view;
        this.f17778c = windowManager;
    }

    public final void f(Object obj, Map map) {
        int i10;
        switch (this.f17776a) {
            case 0:
                ja jaVar = this.f17777b;
                WindowManager windowManager = this.f17778c;
                View view = this.f17779d;
                t7 t7Var = (t7) obj;
                jaVar.getClass();
                e.E("Hide native ad policy validator overlay.");
                t7Var.getView().setVisibility(8);
                if (t7Var.getView().getWindowToken() != null) {
                    windowManager.removeView(t7Var.getView());
                }
                t7Var.destroy();
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (jaVar.f7139c != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(jaVar.f7139c);
                    return;
                }
                return;
            default:
                ja jaVar2 = this.f17777b;
                View view2 = this.f17779d;
                WindowManager windowManager2 = this.f17778c;
                t7 t7Var2 = (t7) obj;
                jaVar2.getClass();
                ((s7) t7Var2.H()).f8095g = new p9(jaVar2, map);
                if (map != null) {
                    Context context = view2.getContext();
                    int a10 = ja.a(context, (String) map.get("validator_width"), ((Integer) ti0.f16763j.f16769f.a(t.f16631o4)).intValue());
                    int a11 = ja.a(context, (String) map.get("validator_height"), ((Integer) ti0.f16763j.f16769f.a(t.f16637p4)).intValue());
                    int a12 = ja.a(context, (String) map.get("validator_x"), 0);
                    int a13 = ja.a(context, (String) map.get("validator_y"), 0);
                    t7Var2.c0(wc.d(a10, a11));
                    try {
                        t7Var2.getWebView().getSettings().setUseWideViewPort(((Boolean) ti0.f16763j.f16769f.a(t.f16643q4)).booleanValue());
                        t7Var2.getWebView().getSettings().setLoadWithOverviewMode(((Boolean) ti0.f16763j.f16769f.a(t.f16649r4)).booleanValue());
                    } catch (NullPointerException unused) {
                    }
                    WindowManager.LayoutParams n10 = k.n();
                    n10.x = a12;
                    n10.y = a13;
                    windowManager2.updateViewLayout(t7Var2.getView(), n10);
                    String str = (String) map.get("orientation");
                    Rect rect = new Rect();
                    if (view2.getGlobalVisibleRect(rect)) {
                        if ("1".equals(str) || "2".equals(str)) {
                            i10 = rect.bottom;
                        } else {
                            i10 = rect.top;
                        }
                        jaVar2.f7139c = new bo(view2, t7Var2, str, n10, i10 - a13, windowManager2);
                        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
                        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                            viewTreeObserver2.addOnScrollChangedListener(jaVar2.f7139c);
                        }
                    }
                    String str2 = (String) map.get("overlay_url");
                    if (!TextUtils.isEmpty(str2)) {
                        t7Var2.loadUrl(str2);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public zn(ja jaVar, WindowManager windowManager, View view) {
        this.f17777b = jaVar;
        this.f17778c = windowManager;
        this.f17779d = view;
    }
}
