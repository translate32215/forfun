package q2;

import java.util.concurrent.Executor;

/* compiled from: DirectExecutor */
public enum c implements Executor {
    INSTANCE;

    public void execute(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        return "DirectExecutor";
    }
}
