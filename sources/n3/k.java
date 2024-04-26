package n3;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: LruBitmapPool */
public class k implements e {

    /* renamed from: j  reason: collision with root package name */
    public static final Bitmap.Config f21876j = Bitmap.Config.ARGB_8888;

    /* renamed from: a  reason: collision with root package name */
    public final l f21877a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Bitmap.Config> f21878b;

    /* renamed from: c  reason: collision with root package name */
    public final a f21879c;

    /* renamed from: d  reason: collision with root package name */
    public long f21880d;

    /* renamed from: e  reason: collision with root package name */
    public long f21881e;

    /* renamed from: f  reason: collision with root package name */
    public int f21882f;

    /* renamed from: g  reason: collision with root package name */
    public int f21883g;

    /* renamed from: h  reason: collision with root package name */
    public int f21884h;

    /* renamed from: i  reason: collision with root package name */
    public int f21885i;

    /* compiled from: LruBitmapPool */
    public interface a {
    }

    /* compiled from: LruBitmapPool */
    public static final class b implements a {
    }

    public k(long j10) {
        l lVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 19) {
            lVar = new n();
        } else {
            lVar = new c();
        }
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        if (i10 >= 19) {
            hashSet.add((Object) null);
        }
        if (i10 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f21880d = j10;
        this.f21877a = lVar;
        this.f21878b = unmodifiableSet;
        this.f21879c = new b();
    }

    public Bitmap a(int i10, int i11, Bitmap.Config config) {
        Bitmap h10 = h(i10, i11, config);
        if (h10 != null) {
            h10.eraseColor(0);
            return h10;
        }
        if (config == null) {
            config = f21876j;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    public synchronized void b(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && ((long) this.f21877a.d(bitmap)) <= this.f21880d) {
                        if (this.f21878b.contains(bitmap.getConfig())) {
                            int d10 = this.f21877a.d(bitmap);
                            this.f21877a.b(bitmap);
                            this.f21879c.getClass();
                            this.f21884h++;
                            this.f21881e += (long) d10;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f21877a.f(bitmap));
                            }
                            f();
                            i(this.f21880d);
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f21877a.f(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f21878b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    @SuppressLint({"InlinedApi"})
    public void c(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i10);
        }
        if (i10 >= 40 || (Build.VERSION.SDK_INT >= 23 && i10 >= 20)) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "clearMemory");
            }
            i(0);
        } else if (i10 >= 20 || i10 == 15) {
            i(this.f21880d / 2);
        }
    }

    public void d() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        i(0);
    }

    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        Bitmap h10 = h(i10, i11, config);
        if (h10 != null) {
            return h10;
        }
        if (config == null) {
            config = f21876j;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    public final void f() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            g();
        }
    }

    public final void g() {
        StringBuilder a10 = android.support.v4.media.a.a("Hits=");
        a10.append(this.f21882f);
        a10.append(", misses=");
        a10.append(this.f21883g);
        a10.append(", puts=");
        a10.append(this.f21884h);
        a10.append(", evictions=");
        a10.append(this.f21885i);
        a10.append(", currentSize=");
        a10.append(this.f21881e);
        a10.append(", maxSize=");
        a10.append(this.f21880d);
        a10.append("\nStrategy=");
        a10.append(this.f21877a);
        Log.v("LruBitmapPool", a10.toString());
    }

    public final synchronized Bitmap h(int i10, int i11, Bitmap.Config config) {
        Bitmap a10;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
        }
        a10 = this.f21877a.a(i10, i11, config != null ? config : f21876j);
        if (a10 == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=" + this.f21877a.c(i10, i11, config));
            }
            this.f21883g++;
        } else {
            this.f21882f++;
            this.f21881e -= (long) this.f21877a.d(a10);
            this.f21879c.getClass();
            a10.setHasAlpha(true);
            if (i12 >= 19) {
                a10.setPremultiplied(true);
            }
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=" + this.f21877a.c(i10, i11, config));
        }
        f();
        return a10;
    }

    public final synchronized void i(long j10) {
        while (this.f21881e > j10) {
            Bitmap e10 = this.f21877a.e();
            if (e10 == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    g();
                }
                this.f21881e = 0;
                return;
            }
            this.f21879c.getClass();
            this.f21881e -= (long) this.f21877a.d(e10);
            this.f21885i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + this.f21877a.f(e10));
            }
            f();
            e10.recycle();
        }
    }
}
