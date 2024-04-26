package t2;

import android.util.Log;
import com.adcolony.sdk.u;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONObject;

public class m {

    /* renamed from: e  reason: collision with root package name */
    public static boolean f25512e = false;

    /* renamed from: f  reason: collision with root package name */
    public static int f25513f = 3;

    /* renamed from: g  reason: collision with root package name */
    public static int f25514g = 1;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f25515a = new JSONObject();

    /* renamed from: b  reason: collision with root package name */
    public ExecutorService f25516b = null;

    /* renamed from: c  reason: collision with root package name */
    public final Queue<Runnable> f25517c = new ConcurrentLinkedQueue();

    /* renamed from: d  reason: collision with root package name */
    public u f25518d;

    public class a implements f0 {
        public a() {
        }

        public void a(com.adcolony.sdk.g gVar) {
            m.this.e(gVar.f4485b.optInt("module"), 0, gVar.f4485b.optString("message"), true);
        }
    }

    public class b implements f0 {
        public b(m mVar) {
        }

        public void a(com.adcolony.sdk.g gVar) {
            m.f25513f = gVar.f4485b.optInt("level");
        }
    }

    public class c implements f0 {
        public c() {
        }

        public void a(com.adcolony.sdk.g gVar) {
            m.this.e(gVar.f4485b.optInt("module"), 3, gVar.f4485b.optString("message"), false);
        }
    }

    public class d implements f0 {
        public d() {
        }

        public void a(com.adcolony.sdk.g gVar) {
            m.this.e(gVar.f4485b.optInt("module"), 3, gVar.f4485b.optString("message"), true);
        }
    }

    public class e implements f0 {
        public e() {
        }

        public void a(com.adcolony.sdk.g gVar) {
            m.this.e(gVar.f4485b.optInt("module"), 2, gVar.f4485b.optString("message"), false);
        }
    }

    public class f implements f0 {
        public f() {
        }

        public void a(com.adcolony.sdk.g gVar) {
            m.this.e(gVar.f4485b.optInt("module"), 2, gVar.f4485b.optString("message"), true);
        }
    }

    public class g implements f0 {
        public g() {
        }

        public void a(com.adcolony.sdk.g gVar) {
            m.this.e(gVar.f4485b.optInt("module"), 1, gVar.f4485b.optString("message"), false);
        }
    }

    public class h implements f0 {
        public h() {
        }

        public void a(com.adcolony.sdk.g gVar) {
            m.this.e(gVar.f4485b.optInt("module"), 1, gVar.f4485b.optString("message"), true);
        }
    }

    public class i implements f0 {
        public i() {
        }

        public void a(com.adcolony.sdk.g gVar) {
            m.this.e(gVar.f4485b.optInt("module"), 0, gVar.f4485b.optString("message"), false);
        }
    }

    public final boolean a(Runnable runnable) {
        try {
            ExecutorService executorService = this.f25516b;
            if (executorService == null || executorService.isShutdown() || this.f25516b.isTerminated()) {
                return false;
            }
            this.f25516b.submit(runnable);
            return true;
        } catch (RejectedExecutionException unused) {
            Log.e("ADCLogError", "Internal error when submitting log to executor service.");
            return false;
        }
    }

    public boolean b(JSONObject jSONObject, int i10) {
        int optInt = jSONObject.optInt("send_level");
        if (jSONObject.length() == 0) {
            optInt = f25514g;
        }
        return optInt >= i10 && optInt != 4;
    }

    public boolean c(JSONObject jSONObject, int i10, boolean z10) {
        int optInt = jSONObject.optInt("print_level");
        boolean optBoolean = jSONObject.optBoolean("log_private");
        if (jSONObject.length() == 0) {
            optInt = f25513f;
            optBoolean = f25512e;
        }
        return (!z10 || optBoolean) && optInt != 4 && optInt >= i10;
    }

    public void d() {
        com.adcolony.sdk.f.c("Log.set_log_level", new b(this));
        com.adcolony.sdk.f.c("Log.public.trace", new c());
        com.adcolony.sdk.f.c("Log.private.trace", new d());
        com.adcolony.sdk.f.c("Log.public.info", new e());
        com.adcolony.sdk.f.c("Log.private.info", new f());
        com.adcolony.sdk.f.c("Log.public.warning", new g());
        com.adcolony.sdk.f.c("Log.private.warning", new h());
        com.adcolony.sdk.f.c("Log.public.error", new i());
        com.adcolony.sdk.f.c("Log.private.error", new a());
    }

    public void e(int i10, int i11, String str, boolean z10) {
        if (!a(new n(this, i10, str, i11, z10))) {
            synchronized (this.f25517c) {
                this.f25517c.add(new n(this, i10, str, i11, z10));
            }
        }
    }

    public void f() {
        ExecutorService executorService = this.f25516b;
        if (executorService == null || executorService.isShutdown() || this.f25516b.isTerminated()) {
            this.f25516b = Executors.newSingleThreadExecutor();
        }
        synchronized (this.f25517c) {
            while (!this.f25517c.isEmpty()) {
                a(this.f25517c.poll());
            }
        }
    }
}
