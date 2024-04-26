package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.appcompat.widget.b0;
import k.f;

/* compiled from: AppCompatSpinner */
public class a0 extends n0 {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ b0.g f801r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ b0 f802s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, View view, b0.g gVar) {
        super(view);
        this.f802s = b0Var;
        this.f801r = gVar;
    }

    public f b() {
        return this.f801r;
    }

    @SuppressLint({"SyntheticAccessor"})
    public boolean c() {
        if (this.f802s.getInternalPopup().b()) {
            return true;
        }
        this.f802s.b();
        return true;
    }
}
