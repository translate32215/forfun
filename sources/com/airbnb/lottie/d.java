package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import u2.k;

/* compiled from: LottieCompositionFactory */
public class d implements Callable<k<u2.d>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WeakReference f4873a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f4874b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f4875c;

    public d(WeakReference weakReference, Context context, int i10) {
        this.f4873a = weakReference;
        this.f4874b = context;
        this.f4875c = i10;
    }

    public Object call() throws Exception {
        Context context = (Context) this.f4873a.get();
        if (context == null) {
            context = this.f4874b;
        }
        int i10 = this.f4875c;
        try {
            return a.b(context.getResources().openRawResource(i10), a.f(context, i10));
        } catch (Resources.NotFoundException e10) {
            return new k((Throwable) e10);
        }
    }
}
