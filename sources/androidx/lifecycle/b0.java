package androidx.lifecycle;

/* compiled from: MutableLiveData */
public class b0<T> extends LiveData<T> {
    public void j(T t10) {
        super.j(t10);
    }

    public void l(T t10) {
        LiveData.a("setValue");
        this.f2600g++;
        this.f2598e = t10;
        c((LiveData<T>.c) null);
    }
}
