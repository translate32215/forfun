package z8;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import l9.u;
import o0.o0;

/* compiled from: BottomSheetBehavior */
public class b implements u.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f28735a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f28736b;

    public b(BottomSheetBehavior bottomSheetBehavior, boolean z10) {
        this.f28736b = bottomSheetBehavior;
        this.f28735a = z10;
    }

    public o0 a(View view, o0 o0Var, u.c cVar) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        g0.b b10 = o0Var.b(7);
        g0.b b11 = o0Var.b(32);
        this.f28736b.f8992v = b10.f18356b;
        boolean c10 = u.c(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        BottomSheetBehavior bottomSheetBehavior = this.f28736b;
        if (bottomSheetBehavior.f8984n) {
            bottomSheetBehavior.f8991u = o0Var.c();
            paddingBottom = cVar.f21182d + this.f28736b.f8991u;
        }
        BottomSheetBehavior bottomSheetBehavior2 = this.f28736b;
        if (bottomSheetBehavior2.f8985o) {
            paddingLeft = (c10 ? cVar.f21181c : cVar.f21179a) + b10.f18355a;
        }
        if (bottomSheetBehavior2.f8986p) {
            paddingRight = (c10 ? cVar.f21179a : cVar.f21181c) + b10.f18357c;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        BottomSheetBehavior bottomSheetBehavior3 = this.f28736b;
        boolean z11 = true;
        if (!bottomSheetBehavior3.f8988r || marginLayoutParams.leftMargin == (i12 = b10.f18355a)) {
            z10 = false;
        } else {
            marginLayoutParams.leftMargin = i12;
            z10 = true;
        }
        if (bottomSheetBehavior3.f8989s && marginLayoutParams.rightMargin != (i11 = b10.f18357c)) {
            marginLayoutParams.rightMargin = i11;
            z10 = true;
        }
        if (!bottomSheetBehavior3.f8990t || marginLayoutParams.topMargin == (i10 = b10.f18356b)) {
            z11 = z10;
        } else {
            marginLayoutParams.topMargin = i10;
        }
        if (z11) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z12 = this.f28735a;
        if (z12) {
            this.f28736b.f8982l = b11.f18358d;
        }
        BottomSheetBehavior bottomSheetBehavior4 = this.f28736b;
        if (bottomSheetBehavior4.f8984n || z12) {
            bottomSheetBehavior4.L(false);
        }
        return o0Var;
    }
}
