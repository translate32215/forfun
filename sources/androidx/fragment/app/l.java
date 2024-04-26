package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;

/* compiled from: DefaultSpecialEffectsController */
public class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m0 f1749a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1750b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Rect f1751c;

    public l(f fVar, m0 m0Var, View view, Rect rect) {
        this.f1749a = m0Var;
        this.f1750b = view;
        this.f1751c = rect;
    }

    public void run() {
        this.f1749a.h(this.f1750b, this.f1751c);
    }
}
