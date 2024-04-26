package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import androidx.emoji2.text.e;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.i;
import androidx.lifecycle.j;
import androidx.lifecycle.o;
import androidx.lifecycle.t;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import k0.k;

public class EmojiCompatInitializer implements z1.b<Boolean> {

    public static class a extends e.c {
        public a(Context context) {
            super(new b(context));
            this.f1522b = 1;
        }
    }

    public static class b implements e.g {

        /* renamed from: a  reason: collision with root package name */
        public final Context f1502a;

        public b(Context context) {
            this.f1502a = context.getApplicationContext();
        }

        public void a(e.h hVar) {
            ThreadPoolExecutor a10 = b.a("EmojiCompatInitializer");
            a10.execute(new f(this, hVar, a10));
        }
    }

    public static class c implements Runnable {
        public void run() {
            try {
                k.a("EmojiCompat.EmojiCompatInitializer.run");
                if (e.c()) {
                    e.a().e();
                }
            } finally {
                k.b();
            }
        }
    }

    public List<Class<? extends z1.b<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* renamed from: c */
    public Boolean b(Context context) {
        Object obj;
        if (Build.VERSION.SDK_INT < 19) {
            return Boolean.FALSE;
        }
        a aVar = new a(context);
        if (e.f1507k == null) {
            synchronized (e.f1506j) {
                if (e.f1507k == null) {
                    e.f1507k = new e(aVar);
                }
            }
        }
        z1.a c10 = z1.a.c(context);
        Class cls = ProcessLifecycleInitializer.class;
        c10.getClass();
        synchronized (z1.a.f28208e) {
            obj = c10.f28209a.get(cls);
            if (obj == null) {
                obj = c10.b(cls, new HashSet());
            }
        }
        final o c11 = ((t) obj).c();
        c11.a(new j() {
            public void a(t tVar) {
                EmojiCompatInitializer.this.getClass();
                b.b().postDelayed(new c(), 500);
                c11.c(this);
            }

            public /* synthetic */ void b(t tVar) {
                i.b(this, tVar);
            }

            public /* synthetic */ void c(t tVar) {
                i.a(this, tVar);
            }

            public /* synthetic */ void e(t tVar) {
                i.c(this, tVar);
            }

            public /* synthetic */ void f(t tVar) {
                i.e(this, tVar);
            }

            public /* synthetic */ void g(t tVar) {
                i.f(this, tVar);
            }
        });
        return Boolean.TRUE;
    }
}
