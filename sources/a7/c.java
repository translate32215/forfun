package a7;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b2.t;
import cb.d;
import e8.p1;
import y6.j;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public class c extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public j f128a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f129b;

    /* renamed from: c  reason: collision with root package name */
    public d f130c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView.ScaleType f131d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f132e;

    /* renamed from: f  reason: collision with root package name */
    public p1 f133f;

    public c(Context context) {
        super(context);
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f132e = true;
        this.f131d = scaleType;
        p1 p1Var = this.f133f;
        if (p1Var != null) {
            ((t) p1Var).V(scaleType);
        }
    }

    public void setMediaContent(j jVar) {
        this.f129b = true;
        this.f128a = jVar;
        d dVar = this.f130c;
        if (dVar != null) {
            dVar.h(jVar);
        }
    }
}
