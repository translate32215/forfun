package de;

import be.g;
import be.i;
import e.j;
import e8.y90;
import java.lang.Thread;
import java.util.List;
import l0.e;
import md.f;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final List<v> f13340a = i.i(g.b(w.a()));

    public static final void a(f fVar, Throwable th) {
        Throwable th2;
        for (v handleException : f13340a) {
            try {
                handleException.handleException(fVar, th);
            } catch (Throwable th3) {
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th == th3) {
                    th2 = th;
                } else {
                    th2 = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    j.a(th2, th);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, th2);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            j.a(th, new y90(fVar));
        } catch (Throwable th4) {
            e.a(th4);
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
