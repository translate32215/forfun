package h2;

import android.annotation.SuppressLint;
import androidx.work.ListenableWorker;
import g2.e;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import q2.d;

/* compiled from: WorkerWrapper */
public class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f18839a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f18840b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f18841c;

    public j(k kVar, d dVar, String str) {
        this.f18841c = kVar;
        this.f18839a = dVar;
        this.f18840b = str;
    }

    @SuppressLint({"SyntheticAccessor"})
    public void run() {
        try {
            ListenableWorker.a aVar = (ListenableWorker.a) this.f18839a.get();
            if (aVar == null) {
                e.c().b(k.A, String.format("%s returned a null result. Treating it as a failure.", new Object[]{this.f18841c.f18846e.f22866c}), new Throwable[0]);
            } else {
                e.c().a(k.A, String.format("%s returned a %s result.", new Object[]{this.f18841c.f18846e.f22866c, aVar}), new Throwable[0]);
                this.f18841c.f18848g = aVar;
            }
        } catch (CancellationException e10) {
            e.c().d(k.A, String.format("%s was cancelled", new Object[]{this.f18840b}), e10);
        } catch (InterruptedException | ExecutionException e11) {
            e.c().b(k.A, String.format("%s failed because it threw an exception/error", new Object[]{this.f18840b}), e11);
        } catch (Throwable th) {
            this.f18841c.d();
            throw th;
        }
        this.f18841c.d();
    }
}
