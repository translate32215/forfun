package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.g;
import androidx.appcompat.widget.d0;
import androidx.fragment.app.a0;
import androidx.fragment.app.p;
import androidx.lifecycle.c0;
import androidx.lifecycle.t;
import com.startapp.startappsdk.R;

/* compiled from: DialogFragment */
public class o extends p implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public boolean A0;
    public boolean B0;
    public boolean C0 = false;

    /* renamed from: n0  reason: collision with root package name */
    public Handler f1764n0;

    /* renamed from: o0  reason: collision with root package name */
    public Runnable f1765o0 = new a();

    /* renamed from: p0  reason: collision with root package name */
    public DialogInterface.OnCancelListener f1766p0 = new b();

    /* renamed from: q0  reason: collision with root package name */
    public DialogInterface.OnDismissListener f1767q0 = new c();

    /* renamed from: r0  reason: collision with root package name */
    public int f1768r0 = 0;

    /* renamed from: s0  reason: collision with root package name */
    public int f1769s0 = 0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f1770t0 = true;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f1771u0 = true;

    /* renamed from: v0  reason: collision with root package name */
    public int f1772v0 = -1;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f1773w0;

    /* renamed from: x0  reason: collision with root package name */
    public c0<t> f1774x0 = new d();

    /* renamed from: y0  reason: collision with root package name */
    public Dialog f1775y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f1776z0;

    /* compiled from: DialogFragment */
    public class a implements Runnable {
        public a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            o oVar = o.this;
            oVar.f1767q0.onDismiss(oVar.f1775y0);
        }
    }

    /* compiled from: DialogFragment */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            o oVar = o.this;
            Dialog dialog = oVar.f1775y0;
            if (dialog != null) {
                oVar.onCancel(dialog);
            }
        }
    }

    /* compiled from: DialogFragment */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            o oVar = o.this;
            Dialog dialog = oVar.f1775y0;
            if (dialog != null) {
                oVar.onDismiss(dialog);
            }
        }
    }

    /* compiled from: DialogFragment */
    public class d implements c0<t> {
        public d() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void g(Object obj) {
            if (((t) obj) != null) {
                o oVar = o.this;
                if (oVar.f1771u0) {
                    View i02 = oVar.i0();
                    if (i02.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    } else if (o.this.f1775y0 != null) {
                        if (a0.N(3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + o.this.f1775y0);
                        }
                        o.this.f1775y0.setContentView(i02);
                    }
                }
            }
        }
    }

    /* compiled from: DialogFragment */
    public class e extends s {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s f1781a;

        public e(s sVar) {
            this.f1781a = sVar;
        }

        public View b(int i10) {
            if (this.f1781a.i()) {
                return this.f1781a.b(i10);
            }
            Dialog dialog = o.this.f1775y0;
            if (dialog != null) {
                return dialog.findViewById(i10);
            }
            return null;
        }

        public boolean i() {
            return this.f1781a.i() || o.this.C0;
        }
    }

    public o() {
    }

    @Deprecated
    public void L(Bundle bundle) {
        this.O = true;
    }

    public void N(Context context) {
        super.N(context);
        this.f1797g0.g(this.f1774x0);
        if (!this.B0) {
            this.A0 = false;
        }
    }

    public void O(Bundle bundle) {
        super.O(bundle);
        this.f1764n0 = new Handler();
        this.f1771u0 = this.G == 0;
        if (bundle != null) {
            this.f1768r0 = bundle.getInt("android:style", 0);
            this.f1769s0 = bundle.getInt("android:theme", 0);
            this.f1770t0 = bundle.getBoolean("android:cancelable", true);
            this.f1771u0 = bundle.getBoolean("android:showsDialog", this.f1771u0);
            this.f1772v0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void R() {
        this.O = true;
        Dialog dialog = this.f1775y0;
        if (dialog != null) {
            this.f1776z0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f1775y0.dismiss();
            if (!this.A0) {
                onDismiss(this.f1775y0);
            }
            this.f1775y0 = null;
            this.C0 = false;
        }
    }

    public void S() {
        this.O = true;
        if (!this.B0 && !this.A0) {
            this.A0 = true;
        }
        this.f1797g0.k(this.f1774x0);
    }

    /* JADX INFO: finally extract failed */
    public LayoutInflater T(Bundle bundle) {
        LayoutInflater T = super.T(bundle);
        boolean z10 = this.f1771u0;
        if (!z10 || this.f1773w0) {
            if (a0.N(2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (!this.f1771u0) {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                } else {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                }
            }
            return T;
        }
        if (z10 && !this.C0) {
            try {
                this.f1773w0 = true;
                Dialog t02 = t0(bundle);
                this.f1775y0 = t02;
                if (this.f1771u0) {
                    v0(t02, this.f1768r0);
                    Context q10 = q();
                    if (q10 instanceof Activity) {
                        this.f1775y0.setOwnerActivity((Activity) q10);
                    }
                    this.f1775y0.setCancelable(this.f1770t0);
                    this.f1775y0.setOnCancelListener(this.f1766p0);
                    this.f1775y0.setOnDismissListener(this.f1767q0);
                    this.C0 = true;
                } else {
                    this.f1775y0 = null;
                }
                this.f1773w0 = false;
            } catch (Throwable th) {
                this.f1773w0 = false;
                throw th;
            }
        }
        if (a0.N(2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f1775y0;
        return dialog != null ? T.cloneInContext(dialog.getContext()) : T;
    }

    public void a0(Bundle bundle) {
        Dialog dialog = this.f1775y0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i10 = this.f1768r0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f1769s0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f1770t0;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f1771u0;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f1772v0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    public void b0() {
        this.O = true;
        Dialog dialog = this.f1775y0;
        if (dialog != null) {
            this.f1776z0 = false;
            dialog.show();
            View decorView = this.f1775y0.getWindow().getDecorView();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            u.b.e(decorView, this);
        }
    }

    public void c0() {
        this.O = true;
        Dialog dialog = this.f1775y0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void e0(Bundle bundle) {
        Bundle bundle2;
        this.O = true;
        if (this.f1775y0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f1775y0.onRestoreInstanceState(bundle2);
        }
    }

    public void f0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.f0(layoutInflater, viewGroup, bundle);
        if (this.Q == null && this.f1775y0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f1775y0.onRestoreInstanceState(bundle2);
        }
    }

    public s k() {
        return new e(new p.c());
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f1776z0) {
            if (a0.N(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            s0(true, true, false);
        }
    }

    public void r0() {
        s0(false, false, false);
    }

    public final void s0(boolean z10, boolean z11, boolean z12) {
        if (!this.A0) {
            this.A0 = true;
            this.B0 = false;
            Dialog dialog = this.f1775y0;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.f1775y0.dismiss();
                if (!z11) {
                    if (Looper.myLooper() == this.f1764n0.getLooper()) {
                        onDismiss(this.f1775y0);
                    } else {
                        this.f1764n0.post(this.f1765o0);
                    }
                }
            }
            this.f1776z0 = true;
            if (this.f1772v0 >= 0) {
                if (z12) {
                    y().X(this.f1772v0, 1);
                } else {
                    a0 y10 = y();
                    int i10 = this.f1772v0;
                    if (i10 >= 0) {
                        y10.y(new a0.o((String) null, i10, 1), z10);
                    } else {
                        throw new IllegalArgumentException(d0.a("Bad id: ", i10));
                    }
                }
                this.f1772v0 = -1;
                return;
            }
            b bVar = new b(y());
            bVar.f1718p = true;
            bVar.o(this);
            if (z12) {
                bVar.m();
            } else if (z10) {
                bVar.k();
            } else {
                bVar.e();
            }
        }
    }

    public Dialog t0(Bundle bundle) {
        if (a0.N(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new g(h0(), this.f1769s0);
    }

    public final Dialog u0() {
        Dialog dialog = this.f1775y0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void v0(Dialog dialog, int i10) {
        if (!(i10 == 1 || i10 == 2)) {
            if (i10 == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void w0(a0 a0Var, String str) {
        this.A0 = false;
        this.B0 = true;
        b bVar = new b(a0Var);
        bVar.f1718p = true;
        bVar.g(0, this, str, 1);
        bVar.e();
    }

    public o(int i10) {
        super(i10);
    }
}
