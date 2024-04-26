package com.startapp;

import android.graphics.Bitmap;
import com.startapp.f1;
import com.startapp.sdk.adsbase.adinformation.ImageResourceConfig;

/* compiled from: Sta */
public class f4 implements f1.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ImageResourceConfig f10373a;

    public f4(ImageResourceConfig imageResourceConfig) {
        this.f10373a = imageResourceConfig;
    }

    public void a(Bitmap bitmap, int i10) {
        ImageResourceConfig imageResourceConfig = this.f10373a;
        imageResourceConfig.f12202a = bitmap;
        if (bitmap != null) {
            imageResourceConfig.f12204c = bitmap;
        }
    }
}
