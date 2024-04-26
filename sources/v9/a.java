package v9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: ClearTextEndIconDelegate */
public class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.textfield.a f26632a;

    public a(com.google.android.material.textfield.a aVar) {
        this.f26632a = aVar;
    }

    public void onAnimationStart(Animator animator) {
        this.f26632a.f26641a.setEndIconVisible(true);
    }
}
