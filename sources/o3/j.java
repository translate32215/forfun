package o3;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* compiled from: MemorySizeCalculator */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final int f22910a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22911b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f22912c;

    /* renamed from: d  reason: collision with root package name */
    public final int f22913d;

    /* compiled from: MemorySizeCalculator */
    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final int f22914e = (Build.VERSION.SDK_INT < 26 ? 4 : 1);

        /* renamed from: a  reason: collision with root package name */
        public final Context f22915a;

        /* renamed from: b  reason: collision with root package name */
        public ActivityManager f22916b;

        /* renamed from: c  reason: collision with root package name */
        public c f22917c;

        /* renamed from: d  reason: collision with root package name */
        public float f22918d = ((float) f22914e);

        public a(Context context) {
            this.f22915a = context;
            this.f22916b = (ActivityManager) context.getSystemService("activity");
            this.f22917c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && j.a(this.f22916b)) {
                this.f22918d = 0.0f;
            }
        }
    }

    /* compiled from: MemorySizeCalculator */
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public final DisplayMetrics f22919a;

        public b(DisplayMetrics displayMetrics) {
            this.f22919a = displayMetrics;
        }
    }

    /* compiled from: MemorySizeCalculator */
    public interface c {
    }

    public j(a aVar) {
        this.f22912c = aVar.f22915a;
        int i10 = a(aVar.f22916b) ? 2097152 : 4194304;
        this.f22913d = i10;
        ActivityManager activityManager = aVar.f22916b;
        int round = Math.round(((float) (activityManager.getMemoryClass() * 1024 * 1024)) * (a(activityManager) ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = ((b) aVar.f22917c).f22919a;
        float f10 = (float) (displayMetrics.widthPixels * displayMetrics.heightPixels * 4);
        int round2 = Math.round(aVar.f22918d * f10);
        int round3 = Math.round(f10 * 2.0f);
        int i11 = round - i10;
        int i12 = round3 + round2;
        if (i12 <= i11) {
            this.f22911b = round3;
            this.f22910a = round2;
        } else {
            float f11 = ((float) i11) / (aVar.f22918d + 2.0f);
            this.f22911b = Math.round(2.0f * f11);
            this.f22910a = Math.round(f11 * aVar.f22918d);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder a10 = android.support.v4.media.a.a("Calculation complete, Calculated memory cache size: ");
            a10.append(b(this.f22911b));
            a10.append(", pool size: ");
            a10.append(b(this.f22910a));
            a10.append(", byte array size: ");
            a10.append(b(i10));
            a10.append(", memory class limited? ");
            a10.append(i12 > round);
            a10.append(", max size: ");
            a10.append(b(round));
            a10.append(", memoryClass: ");
            a10.append(aVar.f22916b.getMemoryClass());
            a10.append(", isLowMemoryDevice: ");
            a10.append(a(aVar.f22916b));
            Log.d("MemorySizeCalculator", a10.toString());
        }
    }

    @TargetApi(19)
    public static boolean a(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }

    public final String b(int i10) {
        return Formatter.formatFileSize(this.f22912c, (long) i10);
    }
}
