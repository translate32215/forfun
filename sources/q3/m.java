package q3;

import com.bumptech.glide.load.data.d;
import java.util.Collections;
import java.util.List;
import k3.c;
import k3.e;

/* compiled from: ModelLoader */
public interface m<Model, Data> {

    /* compiled from: ModelLoader */
    public static class a<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final c f24104a;

        /* renamed from: b  reason: collision with root package name */
        public final List<c> f24105b;

        /* renamed from: c  reason: collision with root package name */
        public final d<Data> f24106c;

        public a(c cVar, d<Data> dVar) {
            List<c> emptyList = Collections.emptyList();
            if (cVar != null) {
                this.f24104a = cVar;
                if (emptyList != null) {
                    this.f24105b = emptyList;
                    if (dVar != null) {
                        this.f24106c = dVar;
                        return;
                    }
                    throw new NullPointerException("Argument must not be null");
                }
                throw new NullPointerException("Argument must not be null");
            }
            throw new NullPointerException("Argument must not be null");
        }
    }

    a<Data> a(Model model, int i10, int i11, e eVar);

    boolean b(Model model);
}
