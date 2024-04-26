package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.activity.f;
import androidx.emoji2.text.e;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import l0.g;
import l0.h;
import l0.n;
import l0.o;

/* compiled from: FontRequestEmojiCompatConfig */
public class k extends e.c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f1549d = new a();

    /* compiled from: FontRequestEmojiCompatConfig */
    public static class a {
    }

    /* compiled from: FontRequestEmojiCompatConfig */
    public static class b implements e.g {

        /* renamed from: a  reason: collision with root package name */
        public final Context f1550a;

        /* renamed from: b  reason: collision with root package name */
        public final h f1551b;

        /* renamed from: c  reason: collision with root package name */
        public final a f1552c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f1553d = new Object();

        /* renamed from: e  reason: collision with root package name */
        public Handler f1554e;

        /* renamed from: f  reason: collision with root package name */
        public Executor f1555f;

        /* renamed from: g  reason: collision with root package name */
        public ThreadPoolExecutor f1556g;

        /* renamed from: h  reason: collision with root package name */
        public e.h f1557h;

        /* renamed from: i  reason: collision with root package name */
        public ContentObserver f1558i;

        /* renamed from: j  reason: collision with root package name */
        public Runnable f1559j;

        public b(Context context, h hVar, a aVar) {
            q.a.f(context, "Context cannot be null");
            q.a.f(hVar, "FontRequest cannot be null");
            this.f1550a = context.getApplicationContext();
            this.f1551b = hVar;
            this.f1552c = aVar;
        }

        public void a(e.h hVar) {
            synchronized (this.f1553d) {
                this.f1557h = hVar;
            }
            c();
        }

        public final void b() {
            synchronized (this.f1553d) {
                this.f1557h = null;
                ContentObserver contentObserver = this.f1558i;
                if (contentObserver != null) {
                    a aVar = this.f1552c;
                    Context context = this.f1550a;
                    aVar.getClass();
                    context.getContentResolver().unregisterContentObserver(contentObserver);
                    this.f1558i = null;
                }
                Handler handler = this.f1554e;
                if (handler != null) {
                    handler.removeCallbacks(this.f1559j);
                }
                this.f1554e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f1556g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f1555f = null;
                this.f1556g = null;
            }
        }

        public void c() {
            synchronized (this.f1553d) {
                if (this.f1557h != null) {
                    if (this.f1555f == null) {
                        ThreadPoolExecutor a10 = b.a("emojiCompat");
                        this.f1556g = a10;
                        this.f1555f = a10;
                    }
                    this.f1555f.execute(new f(this));
                }
            }
        }

        public final o d() {
            try {
                a aVar = this.f1552c;
                Context context = this.f1550a;
                h hVar = this.f1551b;
                aVar.getClass();
                n a10 = g.a(context, hVar, (CancellationSignal) null);
                if (a10.f20994a == 0) {
                    o[] oVarArr = a10.f20995b;
                    if (oVarArr != null && oVarArr.length != 0) {
                        return oVarArr[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException(v.e.a(android.support.v4.media.a.a("fetchFonts failed ("), a10.f20994a, ")"));
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }
    }

    public k(Context context, h hVar) {
        super(new b(context, hVar, f1549d));
    }
}
