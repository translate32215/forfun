package x3;

import android.util.Log;
import com.bumptech.glide.load.c;
import f7.r;
import g4.a;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k3.e;
import k3.f;
import m3.w;
import s9.l;

/* compiled from: GifDrawableEncoder */
public class d implements f<c>, r {
    public d(int i10) {
    }

    public void a(l lVar, float f10, float f11, float f12) {
        throw null;
    }

    public ExecutorService b(int i10, ThreadFactory threadFactory) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public boolean k(Object obj, File file, e eVar) {
        try {
            a.b(((c) ((w) obj).get()).f27305a.f27315a.f27317a.g().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
            }
            return false;
        }
    }

    public void m(T t10) {
    }

    public c q(e eVar) {
        return c.SOURCE;
    }
}
