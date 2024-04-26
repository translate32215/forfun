package androidx.core.app;

import android.app.Activity;
import android.content.pm.PackageManager;
import androidx.core.app.b;

/* compiled from: ActivityCompat */
public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String[] f1378a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f1379b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f1380c;

    public a(String[] strArr, Activity activity, int i10) {
        this.f1378a = strArr;
        this.f1379b = activity;
        this.f1380c = i10;
    }

    public void run() {
        int[] iArr = new int[this.f1378a.length];
        PackageManager packageManager = this.f1379b.getPackageManager();
        String packageName = this.f1379b.getPackageName();
        int length = this.f1378a.length;
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = packageManager.checkPermission(this.f1378a[i10], packageName);
        }
        ((b.d) this.f1379b).onRequestPermissionsResult(this.f1380c, this.f1378a, iArr);
    }
}
