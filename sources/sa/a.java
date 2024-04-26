package sa;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ a f25183a = new a();

    public final Thread newThread(Runnable runnable) {
        int i10 = c.f25185b;
        return new Thread(runnable, "heartbeat-information-executor");
    }
}
