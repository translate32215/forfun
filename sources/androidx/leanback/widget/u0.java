package androidx.leanback.widget;

import android.graphics.Outline;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: RoundedRectHelperApi21 */
public class u0 {

    /* renamed from: a  reason: collision with root package name */
    public static SparseArray<ViewOutlineProvider> f2547a;

    /* compiled from: RoundedRectHelperApi21 */
    public static final class a extends ViewOutlineProvider {

        /* renamed from: a  reason: collision with root package name */
        public int f2548a;

        public a(int i10) {
            this.f2548a = i10;
        }

        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.f2548a);
            outline.setAlpha(1.0f);
        }
    }

    public static void a(View view, boolean z10, int i10) {
        if (z10) {
            if (f2547a == null) {
                f2547a = new SparseArray<>();
            }
            ViewOutlineProvider viewOutlineProvider = f2547a.get(i10);
            if (viewOutlineProvider == null) {
                viewOutlineProvider = new a(i10);
                if (f2547a.size() < 32) {
                    f2547a.put(i10, viewOutlineProvider);
                }
            }
            view.setOutlineProvider(viewOutlineProvider);
        } else {
            view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        }
        view.setClipToOutline(z10);
    }
}
