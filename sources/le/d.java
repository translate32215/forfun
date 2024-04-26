package le;

import java.util.concurrent.ThreadFactory;

/* compiled from: Util */
public class d implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f21278a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f21279b;

    public d(String str, boolean z10) {
        this.f21278a = str;
        this.f21279b = z10;
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f21278a);
        thread.setDaemon(this.f21279b);
        return thread;
    }
}
