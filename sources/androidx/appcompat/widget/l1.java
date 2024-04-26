package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.startapp.startappsdk.R;

/* compiled from: TooltipPopup */
public class l1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1013a;

    /* renamed from: b  reason: collision with root package name */
    public final View f1014b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f1015c;

    /* renamed from: d  reason: collision with root package name */
    public final WindowManager.LayoutParams f1016d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f1017e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final int[] f1018f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    public final int[] f1019g = new int[2];

    public l1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1016d = layoutParams;
        this.f1013a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f1014b = inflate;
        this.f1015c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(l1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2132082693;
        layoutParams.flags = 24;
    }

    public void a() {
        if (this.f1014b.getParent() != null) {
            ((WindowManager) this.f1013a.getSystemService("window")).removeView(this.f1014b);
        }
    }
}
