package s8;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
public abstract class i<TResult> {
    public i<TResult> a(Executor executor, c cVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public i<TResult> b(d<TResult> dVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract i<TResult> c(Executor executor, e eVar);

    public abstract i<TResult> d(Executor executor, f<? super TResult> fVar);

    public <TContinuationResult> i<TContinuationResult> e(Executor executor, a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> i<TContinuationResult> f(Executor executor, a<TResult, i<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception g();

    public abstract TResult h();

    public abstract <X extends Throwable> TResult i(Class<X> cls) throws Throwable;

    public abstract boolean j();

    public abstract boolean k();

    public abstract boolean l();

    public <TContinuationResult> i<TContinuationResult> m(Executor executor, h<TResult, TContinuationResult> hVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public <TContinuationResult> i<TContinuationResult> n(h<TResult, TContinuationResult> hVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
