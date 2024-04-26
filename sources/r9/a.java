package r9;

import android.graphics.Paint;
import android.graphics.Path;

/* compiled from: ShadowRenderer */
public class a {

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f24753i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    public static final float[] f24754j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f24755k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f24756l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final Paint f24757a = new Paint();

    /* renamed from: b  reason: collision with root package name */
    public final Paint f24758b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f24759c;

    /* renamed from: d  reason: collision with root package name */
    public int f24760d;

    /* renamed from: e  reason: collision with root package name */
    public int f24761e;

    /* renamed from: f  reason: collision with root package name */
    public int f24762f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f24763g = new Path();

    /* renamed from: h  reason: collision with root package name */
    public Paint f24764h = new Paint();

    public a() {
        a(-16777216);
        this.f24764h.setColor(0);
        Paint paint = new Paint(4);
        this.f24758b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f24759c = new Paint(paint);
    }

    public void a(int i10) {
        this.f24760d = g0.a.e(i10, 68);
        this.f24761e = g0.a.e(i10, 20);
        this.f24762f = g0.a.e(i10, 0);
        this.f24757a.setColor(this.f24760d);
    }
}
