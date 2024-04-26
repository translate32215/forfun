package v9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.textfield.b;

/* compiled from: DropdownMenuEndIconDelegate */
public class g extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f26636a;

    public g(b bVar) {
        this.f26636a = bVar;
    }

    public void onAnimationEnd(Animator animator) {
        b bVar = this.f26636a;
        bVar.f26643c.setChecked(bVar.f9545k);
        this.f26636a.f9551q.start();
    }
}
