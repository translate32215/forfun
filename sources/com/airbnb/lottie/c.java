package com.airbnb.lottie;

import android.content.Context;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;
import u2.d;
import u2.k;

/* compiled from: LottieCompositionFactory */
public class c implements Callable<k<d>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f4870a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f4871b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f4872c;

    public c(Context context, String str, String str2) {
        this.f4870a = context;
        this.f4871b = str;
        this.f4872c = str2;
    }

    public Object call() throws Exception {
        Context context = this.f4870a;
        String str = this.f4871b;
        String str2 = this.f4872c;
        try {
            if (str.endsWith(".zip")) {
                return a.d(new ZipInputStream(context.getAssets().open(str)), str2);
            }
            return a.b(context.getAssets().open(str), str2);
        } catch (IOException e10) {
            return new k((Throwable) e10);
        }
    }
}
