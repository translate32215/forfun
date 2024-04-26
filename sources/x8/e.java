package x8;

import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: BottomAppBar */
public class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f27880a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f27881b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f27882c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f27883d;

    public e(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i10, boolean z10) {
        this.f27883d = bottomAppBar;
        this.f27880a = actionMenuView;
        this.f27881b = i10;
        this.f27882c = z10;
    }

    public void run() {
        ActionMenuView actionMenuView = this.f27880a;
        actionMenuView.setTranslationX((float) this.f27883d.C(actionMenuView, this.f27881b, this.f27882c));
    }
}
