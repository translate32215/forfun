package androidx.leanback.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: ShadowHelperApi21 */
public class c1 {

    /* renamed from: a  reason: collision with root package name */
    public static final ViewOutlineProvider f2332a = new a();

    /* compiled from: ShadowHelperApi21 */
    public static class a extends ViewOutlineProvider {
        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(1.0f);
        }
    }

    /* compiled from: ShadowHelperApi21 */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public View f2333a;

        /* renamed from: b  reason: collision with root package name */
        public float f2334b;

        /* renamed from: c  reason: collision with root package name */
        public float f2335c;
    }
}
