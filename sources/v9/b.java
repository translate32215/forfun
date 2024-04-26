package v9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.textfield.a;

/* compiled from: ClearTextEndIconDelegate */
public class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f26633a;

    public b(a aVar) {
        this.f26633a = aVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f26633a.f26641a.setEndIconVisible(false);
    }
}
