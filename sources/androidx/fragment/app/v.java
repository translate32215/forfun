package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import q.a;

/* compiled from: FragmentHostCallback */
public abstract class v<E> extends s {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f1873a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f1874b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f1875c;

    /* renamed from: d  reason: collision with root package name */
    public final a0 f1876d = new b0();

    public v(q qVar) {
        Handler handler = new Handler();
        this.f1873a = qVar;
        a.f(qVar, "context == null");
        this.f1874b = qVar;
        this.f1875c = handler;
    }

    public abstract void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract E l();

    public abstract LayoutInflater o();

    public abstract void p();
}
