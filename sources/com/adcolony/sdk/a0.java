package com.adcolony.sdk;

import android.content.Context;
import android.os.StatFs;
import androidx.activity.e;
import com.adcolony.sdk.t0;
import java.io.File;

public class a0 {

    /* renamed from: a  reason: collision with root package name */
    public String f4418a;

    /* renamed from: b  reason: collision with root package name */
    public String f4419b;

    /* renamed from: c  reason: collision with root package name */
    public String f4420c;

    /* renamed from: d  reason: collision with root package name */
    public String f4421d;

    /* renamed from: e  reason: collision with root package name */
    public File f4422e;

    /* renamed from: f  reason: collision with root package name */
    public File f4423f;

    /* renamed from: g  reason: collision with root package name */
    public File f4424g;

    public boolean a() {
        double d10;
        o d11 = f.d();
        this.f4418a = b() + "/adc3/";
        this.f4419b = e.a(new StringBuilder(), this.f4418a, "media/");
        File file = new File(this.f4419b);
        this.f4422e = file;
        if (!file.isDirectory()) {
            this.f4422e.delete();
            this.f4422e.mkdirs();
        }
        if (!this.f4422e.isDirectory()) {
            d11.B = true;
            return false;
        }
        try {
            StatFs statFs = new StatFs(this.f4419b);
            d10 = (double) (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize()));
        } catch (RuntimeException unused) {
            d10 = 0.0d;
        }
        if (d10 < 2.097152E7d) {
            t0.a aVar = new t0.a();
            aVar.f4784a.append("Not enough memory available at media path, disabling AdColony.");
            aVar.a(t0.f4778c);
            d11.B = true;
            return false;
        }
        this.f4420c = b() + "/adc3/data/";
        File file2 = new File(this.f4420c);
        this.f4423f = file2;
        if (!file2.isDirectory()) {
            this.f4423f.delete();
        }
        this.f4423f.mkdirs();
        this.f4421d = e.a(new StringBuilder(), this.f4418a, "tmp/");
        File file3 = new File(this.f4421d);
        this.f4424g = file3;
        if (!file3.isDirectory()) {
            this.f4424g.delete();
            this.f4424g.mkdirs();
        }
        return true;
    }

    public String b() {
        Context context = f.f4478a;
        if (context == null) {
            return "";
        }
        return context.getFilesDir().getAbsolutePath();
    }

    public boolean c() {
        File file = this.f4422e;
        if (file == null || this.f4423f == null || this.f4424g == null) {
            return false;
        }
        if (!file.isDirectory()) {
            this.f4422e.delete();
        }
        if (!this.f4423f.isDirectory()) {
            this.f4423f.delete();
        }
        if (!this.f4424g.isDirectory()) {
            this.f4424g.delete();
        }
        this.f4422e.mkdirs();
        this.f4423f.mkdirs();
        this.f4424g.mkdirs();
        return true;
    }
}
