package m3;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k3.c;

/* compiled from: GlideException */
public final class r extends Exception {

    /* renamed from: f  reason: collision with root package name */
    public static final StackTraceElement[] f21657f = new StackTraceElement[0];

    /* renamed from: a  reason: collision with root package name */
    public final List<Throwable> f21658a;

    /* renamed from: b  reason: collision with root package name */
    public c f21659b;

    /* renamed from: c  reason: collision with root package name */
    public com.bumptech.glide.load.a f21660c;

    /* renamed from: d  reason: collision with root package name */
    public Class<?> f21661d;

    /* renamed from: e  reason: collision with root package name */
    public String f21662e;

    public r(String str) {
        List<Throwable> emptyList = Collections.emptyList();
        this.f21662e = str;
        setStackTrace(f21657f);
        this.f21658a = emptyList;
    }

    public static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            appendable.append("Cause (").append(String.valueOf(i11)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i10);
            if (th instanceof r) {
                ((r) th).f(appendable);
            } else {
                d(th, appendable);
            }
            i10 = i11;
        }
    }

    public static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void a(Throwable th, List<Throwable> list) {
        if (th instanceof r) {
            for (Throwable a10 : ((r) th).f21658a) {
                a(a10, list);
            }
            return;
        }
        list.add(th);
    }

    public void e(String str) {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder a10 = android.support.v4.media.a.a("Root cause (");
            int i11 = i10 + 1;
            a10.append(i11);
            a10.append(" of ");
            a10.append(size);
            a10.append(")");
            Log.i(str, a10.toString(), (Throwable) arrayList.get(i10));
            i10 = i11;
        }
    }

    public final void f(Appendable appendable) {
        d(this, appendable);
        b(this.f21658a, new a(appendable));
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f21662e);
        String str3 = "";
        if (this.f21661d != null) {
            StringBuilder a10 = android.support.v4.media.a.a(", ");
            a10.append(this.f21661d);
            str = a10.toString();
        } else {
            str = str3;
        }
        sb2.append(str);
        if (this.f21660c != null) {
            StringBuilder a11 = android.support.v4.media.a.a(", ");
            a11.append(this.f21660c);
            str2 = a11.toString();
        } else {
            str2 = str3;
        }
        sb2.append(str2);
        if (this.f21659b != null) {
            StringBuilder a12 = android.support.v4.media.a.a(", ");
            a12.append(this.f21659b);
            str3 = a12.toString();
        }
        sb2.append(str3);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb2.toString();
        }
        if (arrayList.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(arrayList.size());
            sb2.append(" root causes:");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb2.append(10);
            sb2.append(th.getClass().getName());
            sb2.append('(');
            sb2.append(th.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    public void printStackTrace() {
        f(System.err);
    }

    public void printStackTrace(PrintStream printStream) {
        f(printStream);
    }

    public void printStackTrace(PrintWriter printWriter) {
        f(printWriter);
    }

    /* compiled from: GlideException */
    public static final class a implements Appendable {

        /* renamed from: a  reason: collision with root package name */
        public final Appendable f21663a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f21664b = true;

        public a(Appendable appendable) {
            this.f21663a = appendable;
        }

        public Appendable append(char c10) throws IOException {
            boolean z10 = false;
            if (this.f21664b) {
                this.f21664b = false;
                this.f21663a.append("  ");
            }
            if (c10 == 10) {
                z10 = true;
            }
            this.f21664b = z10;
            this.f21663a.append(c10);
            return this;
        }

        public Appendable append(CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        public Appendable append(CharSequence charSequence, int i10, int i11) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z10 = false;
            if (this.f21664b) {
                this.f21664b = false;
                this.f21663a.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i11 - 1) == 10) {
                z10 = true;
            }
            this.f21664b = z10;
            this.f21663a.append(charSequence, i10, i11);
            return this;
        }
    }

    public r(String str, Throwable th) {
        List<Throwable> singletonList = Collections.singletonList(th);
        this.f21662e = str;
        setStackTrace(f21657f);
        this.f21658a = singletonList;
    }

    public r(String str, List<Throwable> list) {
        this.f21662e = str;
        setStackTrace(f21657f);
        this.f21658a = list;
    }
}
