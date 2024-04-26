package v6;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class d0 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f26431a;

    public /* synthetic */ d0(String str) {
        this.f26431a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f26431a);
    }
}
