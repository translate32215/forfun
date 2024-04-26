package e8;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.j1;
import com.google.android.gms.internal.ads.xy;
import com.google.android.gms.internal.ads.zy;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public interface pn {
    void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener);

    void b(Bundle bundle);

    void c(View view);

    void d(xy xyVar);

    void destroy();

    void e();

    void f(zy zyVar);

    void g();

    void h(j1 j1Var);

    void i(View view, Map<String, WeakReference<View>> map);

    void j(Bundle bundle);

    void k(View view, MotionEvent motionEvent, View view2);

    void l(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z10);

    void m(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2);

    void n();

    void o();

    boolean p(Bundle bundle);

    JSONObject q(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2);

    void r(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z10);

    boolean s();

    void t(String str);

    void u();
}
