package o4;

import java.util.concurrent.Executors;

/* compiled from: ExecutionModule_ExecutorFactory */
public final class g implements jd.a {

    /* compiled from: ExecutionModule_ExecutorFactory */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final g f22949a = new g();
    }

    public Object get() {
        return new h(Executors.newSingleThreadExecutor());
    }
}
