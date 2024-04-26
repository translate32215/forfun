package s8;

import com.google.android.gms.common.internal.i;
import com.google.android.gms.tasks.Task;
import f7.j0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
public final class l {
    public static <TResult> TResult a(i<TResult> iVar) throws ExecutionException, InterruptedException {
        i.g("Must not be called on the main application thread");
        i.i(iVar, "Task must not be null");
        if (iVar.k()) {
            return g(iVar);
        }
        n nVar = new n();
        h(iVar, nVar);
        nVar.f25039a.await();
        return g(iVar);
    }

    public static <TResult> TResult b(i<TResult> iVar, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        i.g("Must not be called on the main application thread");
        i.i(iVar, "Task must not be null");
        i.i(timeUnit, "TimeUnit must not be null");
        if (iVar.k()) {
            return g(iVar);
        }
        n nVar = new n();
        h(iVar, nVar);
        if (nVar.f25039a.await(j10, timeUnit)) {
            return g(iVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    public static <TResult> i<TResult> c(Executor executor, Callable<TResult> callable) {
        i.i(executor, "Executor must not be null");
        i.i(callable, "Callback must not be null");
        z zVar = new z();
        executor.execute(new j0(zVar, (Callable) callable));
        return zVar;
    }

    public static <TResult> i<TResult> d(Exception exc) {
        z zVar = new z();
        zVar.o(exc);
        return zVar;
    }

    public static <TResult> i<TResult> e(TResult tresult) {
        z zVar = new z();
        zVar.p(tresult);
        return zVar;
    }

    public static i<List<i<?>>> f(Task<?>... taskArr) {
        z zVar;
        if (taskArr.length == 0) {
            return e(Collections.emptyList());
        }
        List<i> asList = Arrays.asList(taskArr);
        if (asList == null || asList.isEmpty()) {
            return e(Collections.emptyList());
        }
        if (asList.isEmpty()) {
            zVar = e((Object) null);
        } else {
            for (i iVar : asList) {
                if (iVar == null) {
                    throw new NullPointerException("null tasks are not accepted");
                }
            }
            z zVar2 = new z();
            p pVar = new p(asList.size(), zVar2);
            for (i h10 : asList) {
                h(h10, pVar);
            }
            zVar = zVar2;
        }
        return zVar.f(k.f25036a, new m(asList));
    }

    public static <TResult> TResult g(i<TResult> iVar) throws ExecutionException {
        if (iVar.l()) {
            return iVar.h();
        }
        if (iVar.j()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(iVar.g());
    }

    public static <T> void h(i<T> iVar, o<? super T> oVar) {
        Executor executor = k.f25037b;
        iVar.d(executor, oVar);
        iVar.c(executor, oVar);
        iVar.a(executor, oVar);
    }
}
