package androidx.databinding;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.p;
import androidx.lifecycle.d0;
import androidx.lifecycle.o;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import com.startapp.startappsdk.R;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public abstract class ViewDataBinding extends a implements e2.a {

    /* renamed from: t  reason: collision with root package name */
    public static final boolean f1446t = true;

    /* renamed from: u  reason: collision with root package name */
    public static final ReferenceQueue<ViewDataBinding> f1447u = new ReferenceQueue<>();

    /* renamed from: v  reason: collision with root package name */
    public static final View.OnAttachStateChangeListener f1448v;

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f1449a = new c();

    /* renamed from: b  reason: collision with root package name */
    public boolean f1450b = false;

    /* renamed from: c  reason: collision with root package name */
    public f[] f1451c;

    /* renamed from: d  reason: collision with root package name */
    public final View f1452d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1453e;

    /* renamed from: f  reason: collision with root package name */
    public Choreographer f1454f;

    /* renamed from: g  reason: collision with root package name */
    public final Choreographer.FrameCallback f1455g;

    /* renamed from: h  reason: collision with root package name */
    public Handler f1456h;

    /* renamed from: i  reason: collision with root package name */
    public final c f1457i;

    /* renamed from: r  reason: collision with root package name */
    public t f1458r;

    /* renamed from: s  reason: collision with root package name */
    public OnStartListener f1459s;

    public static class OnStartListener implements s {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<ViewDataBinding> f1460a;

        public OnStartListener(ViewDataBinding viewDataBinding, a aVar) {
            this.f1460a = new WeakReference<>(viewDataBinding);
        }

        @d0(o.b.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = (ViewDataBinding) this.f1460a.get();
            if (viewDataBinding != null) {
                viewDataBinding.f();
            }
        }
    }

    public class a {
    }

    public class b implements View.OnAttachStateChangeListener {
        @TargetApi(19)
        public void onViewAttachedToWindow(View view) {
            (view != null ? (ViewDataBinding) view.getTag(R.id.dataBinding) : null).f1449a.run();
            view.removeOnAttachStateChangeListener(this);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            synchronized (this) {
                ViewDataBinding.this.f1450b = false;
            }
            while (true) {
                Reference<? extends ViewDataBinding> poll = ViewDataBinding.f1447u.poll();
                if (poll == null) {
                    break;
                } else if (poll instanceof f) {
                    f fVar = (f) poll;
                }
            }
            if (Build.VERSION.SDK_INT < 19 || ViewDataBinding.this.f1452d.isAttachedToWindow()) {
                ViewDataBinding.this.f();
                return;
            }
            View view = ViewDataBinding.this.f1452d;
            View.OnAttachStateChangeListener onAttachStateChangeListener = ViewDataBinding.f1448v;
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            ViewDataBinding.this.f1452d.addOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 19) {
            f1448v = null;
        } else {
            f1448v = new b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewDataBinding(Object obj, View view, int i10) {
        super(0);
        c b10 = b(obj);
        this.f1457i = b10;
        this.f1451c = new f[i10];
        this.f1452d = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        } else if (f1446t) {
            this.f1454f = Choreographer.getInstance();
            this.f1455g = new e(this);
        } else {
            this.f1455g = null;
            this.f1456h = new Handler(Looper.myLooper());
        }
    }

    public static c b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof c) {
            return (c) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    public static boolean h(String str, int i10) {
        int length = str.length();
        if (length == i10) {
            return false;
        }
        while (i10 < length) {
            if (!Character.isDigit(str.charAt(i10))) {
                return false;
            }
            i10++;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void i(androidx.databinding.c r4, android.view.View r5, java.lang.Object[] r6, android.util.SparseIntArray r7, boolean r8) {
        /*
            r0 = 0
            if (r5 == 0) goto L_0x000d
            r1 = 2131427538(0x7f0b00d2, float:1.8476695E38)
            java.lang.Object r1 = r5.getTag(r1)
            androidx.databinding.ViewDataBinding r1 = (androidx.databinding.ViewDataBinding) r1
            goto L_0x000e
        L_0x000d:
            r1 = r0
        L_0x000e:
            if (r1 == 0) goto L_0x0011
            return
        L_0x0011:
            java.lang.Object r1 = r5.getTag()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x001c
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
        L_0x001c:
            r1 = 1
            r2 = 0
            if (r8 == 0) goto L_0x0044
            if (r0 == 0) goto L_0x0044
            java.lang.String r8 = "layout"
            boolean r8 = r0.startsWith(r8)
            if (r8 == 0) goto L_0x0044
            r8 = 95
            int r8 = r0.lastIndexOf(r8)
            if (r8 <= 0) goto L_0x005b
            int r8 = r8 + r1
            boolean r3 = h(r0, r8)
            if (r3 == 0) goto L_0x005b
            int r8 = k(r0, r8)
            r0 = r6[r8]
            if (r0 != 0) goto L_0x005c
            r6[r8] = r5
            goto L_0x005c
        L_0x0044:
            if (r0 == 0) goto L_0x005b
            java.lang.String r8 = "binding_"
            boolean r8 = r0.startsWith(r8)
            if (r8 == 0) goto L_0x005b
            r8 = 8
            int r8 = k(r0, r8)
            r0 = r6[r8]
            if (r0 != 0) goto L_0x005c
            r6[r8] = r5
            goto L_0x005c
        L_0x005b:
            r1 = 0
        L_0x005c:
            if (r1 != 0) goto L_0x0073
            int r8 = r5.getId()
            if (r8 <= 0) goto L_0x0073
            if (r7 == 0) goto L_0x0073
            r0 = -1
            int r8 = r7.get(r8, r0)
            if (r8 < 0) goto L_0x0073
            r0 = r6[r8]
            if (r0 != 0) goto L_0x0073
            r6[r8] = r5
        L_0x0073:
            boolean r8 = r5 instanceof android.view.ViewGroup
            if (r8 == 0) goto L_0x008a
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r8 = r5.getChildCount()
            r0 = 0
        L_0x007e:
            if (r0 >= r8) goto L_0x008a
            android.view.View r1 = r5.getChildAt(r0)
            i(r4, r1, r6, r7, r2)
            int r0 = r0 + 1
            goto L_0x007e
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.i(androidx.databinding.c, android.view.View, java.lang.Object[], android.util.SparseIntArray, boolean):void");
    }

    public static Object[] j(c cVar, View view, int i10, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i10];
        i(cVar, view, objArr, sparseIntArray, true);
        return objArr;
    }

    public static int k(String str, int i10) {
        int length = str.length();
        int i11 = 0;
        while (i10 < length) {
            i11 = (i11 * 10) + (str.charAt(i10) - '0');
            i10++;
        }
        return i11;
    }

    public View a() {
        return this.f1452d;
    }

    public abstract void e();

    public void f() {
        if (this.f1453e) {
            l();
        } else if (g()) {
            this.f1453e = true;
            e();
            this.f1453e = false;
        }
    }

    public abstract boolean g();

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        if (f1446t == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        r3.f1454f.postFrameCallback(r3.f1455g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        r3.f1456h.post(r3.f1449a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l() {
        /*
            r3 = this;
            androidx.lifecycle.t r0 = r3.f1458r
            r1 = 1
            if (r0 == 0) goto L_0x001b
            androidx.lifecycle.o r0 = r0.c()
            androidx.lifecycle.o$c r0 = r0.b()
            androidx.lifecycle.o$c r2 = androidx.lifecycle.o.c.STARTED
            int r0 = r0.compareTo(r2)
            if (r0 < 0) goto L_0x0017
            r0 = 1
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 != 0) goto L_0x001b
            return
        L_0x001b:
            monitor-enter(r3)
            boolean r0 = r3.f1450b     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0022
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            return
        L_0x0022:
            r3.f1450b = r1     // Catch:{ all -> 0x0039 }
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            boolean r0 = f1446t
            if (r0 == 0) goto L_0x0031
            android.view.Choreographer r0 = r3.f1454f
            android.view.Choreographer$FrameCallback r1 = r3.f1455g
            r0.postFrameCallback(r1)
            goto L_0x0038
        L_0x0031:
            android.os.Handler r0 = r3.f1456h
            java.lang.Runnable r1 = r3.f1449a
            r0.post(r1)
        L_0x0038:
            return
        L_0x0039:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.l():void");
    }

    public void m(t tVar) {
        if (tVar instanceof p) {
            Log.w("DataBinding", "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment's view lifecycle");
        }
        t tVar2 = this.f1458r;
        if (tVar2 != tVar) {
            if (tVar2 != null) {
                tVar2.c().c(this.f1459s);
            }
            this.f1458r = tVar;
            if (tVar != null) {
                if (this.f1459s == null) {
                    this.f1459s = new OnStartListener(this, (a) null);
                }
                ((ComponentActivity) tVar).f326d.a(this.f1459s);
            }
            f[] fVarArr = this.f1451c;
            int length = fVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                if (fVarArr[i10] == null) {
                    i10++;
                } else {
                    throw null;
                }
            }
        }
    }
}
