package x8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: BottomAppBar */
public class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f27875a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f27876b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f27877c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f27878d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f27879e;

    public d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i10, boolean z10) {
        this.f27879e = bottomAppBar;
        this.f27876b = actionMenuView;
        this.f27877c = i10;
        this.f27878d = z10;
    }

    public void onAnimationCancel(Animator animator) {
        this.f27875a = true;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.f27875a) {
            BottomAppBar bottomAppBar = this.f27879e;
            int i10 = bottomAppBar.f8960n0;
            boolean z10 = i10 != 0;
            if (i10 != 0) {
                bottomAppBar.f8960n0 = 0;
                bottomAppBar.getMenu().clear();
                bottomAppBar.o(i10);
            }
            BottomAppBar bottomAppBar2 = this.f27879e;
            ActionMenuView actionMenuView = this.f27876b;
            int i11 = this.f27877c;
            boolean z11 = this.f27878d;
            bottomAppBar2.getClass();
            e eVar = new e(bottomAppBar2, actionMenuView, i11, z11);
            if (z10) {
                actionMenuView.post(eVar);
            } else {
                eVar.run();
            }
        }
    }
}
