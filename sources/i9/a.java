package i9;

import android.content.Context;
import com.startapp.startappsdk.R;
import e.d;
import p9.b;

/* compiled from: ElevationOverlayProvider */
public class a {

    /* renamed from: f  reason: collision with root package name */
    public static final int f19341f = ((int) Math.round(5.1000000000000005d));

    /* renamed from: a  reason: collision with root package name */
    public final boolean f19342a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19343b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19344c;

    /* renamed from: d  reason: collision with root package name */
    public final int f19345d;

    /* renamed from: e  reason: collision with root package name */
    public final float f19346e;

    public a(Context context) {
        boolean b10 = b.b(context, R.attr.elevationOverlayEnabled, false);
        int f10 = d.f(context, R.attr.elevationOverlayColor, 0);
        int f11 = d.f(context, R.attr.elevationOverlayAccentColor, 0);
        int f12 = d.f(context, R.attr.colorSurface, 0);
        float f13 = context.getResources().getDisplayMetrics().density;
        this.f19342a = b10;
        this.f19343b = f10;
        this.f19344c = f11;
        this.f19345d = f12;
        this.f19346e = f13;
    }
}
