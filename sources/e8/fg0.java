package e8;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class fg0 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14628a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14629b;

    public fg0() {
        this.f14628a = 1;
        this.f14629b = Executors.defaultThreadFactory();
    }

    public final Thread newThread(Runnable runnable) {
        switch (this.f14628a) {
            case 0:
                return new Thread(runnable, (String) this.f14629b);
            default:
                Thread newThread = ((ThreadFactory) this.f14629b).newThread(runnable);
                newThread.setName("ScionFrontendApi");
                return newThread;
        }
    }

    public fg0(String str) {
        this.f14628a = 0;
        this.f14629b = str;
    }
}
