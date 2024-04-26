package com.startapp.sdk.adsbase.adinformation;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import com.startapp.e1;
import com.startapp.wb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class ImageResourceConfig implements Serializable {
    private static final long serialVersionUID = -8927634568015374287L;

    /* renamed from: a  reason: collision with root package name */
    public transient Bitmap f12202a;

    /* renamed from: b  reason: collision with root package name */
    public transient Bitmap f12203b;

    /* renamed from: c  reason: collision with root package name */
    public transient Bitmap f12204c = null;
    private int height = 1;
    private String imageFallbackUrl = "";
    private String imageUrlSecured = "";
    private String name;
    private int width = 1;

    private ImageResourceConfig() {
    }

    public Bitmap a(Context context) {
        if (this.f12204c == null) {
            Bitmap bitmap = this.f12202a;
            this.f12204c = bitmap;
            if (bitmap == null) {
                if (this.f12203b == null) {
                    this.f12203b = e1.a(context, this.imageFallbackUrl);
                }
                this.f12204c = this.f12203b;
            }
        }
        return this.f12204c;
    }

    public void b(int i10) {
        this.width = i10;
    }

    public String c() {
        return this.name;
    }

    public int d() {
        return this.width;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageResourceConfig imageResourceConfig = (ImageResourceConfig) obj;
        if (this.width != imageResourceConfig.width || this.height != imageResourceConfig.height || !wb.a(this.imageUrlSecured, imageResourceConfig.imageUrlSecured) || !wb.a(this.imageFallbackUrl, imageResourceConfig.imageFallbackUrl) || !wb.a(this.name, imageResourceConfig.name)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.imageUrlSecured, this.imageFallbackUrl, Integer.valueOf(this.width), Integer.valueOf(this.height), this.name};
        Map<Activity, Integer> map = wb.f12765a;
        return Arrays.deepHashCode(objArr);
    }

    public String b() {
        String str = this.imageUrlSecured;
        return str != null ? str : "";
    }

    public void b(String str) {
        this.imageFallbackUrl = str;
    }

    public int a() {
        return this.height;
    }

    public void a(int i10) {
        this.height = i10;
    }

    public static ImageResourceConfig a(String str) {
        ImageResourceConfig imageResourceConfig = new ImageResourceConfig();
        imageResourceConfig.name = str;
        return imageResourceConfig;
    }
}
