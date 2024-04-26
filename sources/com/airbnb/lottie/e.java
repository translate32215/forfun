package com.airbnb.lottie;

import java.io.InputStream;
import java.util.concurrent.Callable;
import u2.d;
import u2.k;

/* compiled from: LottieCompositionFactory */
public class e implements Callable<k<d>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InputStream f4876a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f4877b;

    public e(InputStream inputStream, String str) {
        this.f4876a = inputStream;
        this.f4877b = str;
    }

    public Object call() throws Exception {
        return a.b(this.f4876a, this.f4877b);
    }
}
