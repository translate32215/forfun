package g2;

import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import g2.i;

/* compiled from: OneTimeWorkRequest */
public final class f extends i {

    /* compiled from: OneTimeWorkRequest */
    public static final class a extends i.a<a, f> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f18417b.f22867d = OverwritingInputMerger.class.getName();
        }
    }

    public f(a aVar) {
        super(aVar.f18416a, aVar.f18417b, aVar.f18418c);
    }
}
