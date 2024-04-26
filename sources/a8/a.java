package a8;

import e7.e;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final String f148a;

    /* renamed from: b  reason: collision with root package name */
    public final ThreadFactory f149b = Executors.defaultThreadFactory();

    public a(String str) {
        this.f148a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f149b.newThread(new e(runnable));
        newThread.setName(this.f148a);
        return newThread;
    }
}
