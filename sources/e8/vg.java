package e8;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class vg extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a  reason: collision with root package name */
    public final Context f17131a;

    /* renamed from: b  reason: collision with root package name */
    public View f17132b;

    public vg(Context context) {
        super(context);
        this.f17131a = context;
    }

    public final void a(JSONObject jSONObject, RelativeLayout relativeLayout, int i10) {
        TextView textView = new TextView(this.f17131a);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        double optDouble = jSONObject.optDouble("padding", 0.0d);
        y8 y8Var = ti0.f16763j.f16764a;
        int g10 = y8.g(this.f17131a, (int) optDouble);
        textView.setPadding(0, g10, 0, g10);
        double optDouble2 = jSONObject.optDouble("height", 15.0d);
        y8 y8Var2 = ti0.f16763j.f16764a;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, y8.g(this.f17131a, (int) optDouble2));
        layoutParams.addRule(i10);
        relativeLayout.addView(textView, layoutParams);
    }

    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f17132b.setY((float) (-iArr[1]));
    }

    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f17132b.setY((float) (-iArr[1]));
    }
}
