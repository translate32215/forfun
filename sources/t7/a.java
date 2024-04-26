package t7;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.b;
import java.util.Set;
import t7.a.d;
import t7.d;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class a<O extends d> {

    /* renamed from: a  reason: collision with root package name */
    public final C0249a<?, O> f25820a;

    /* renamed from: b  reason: collision with root package name */
    public final String f25821b;

    /* renamed from: t7.a$a  reason: collision with other inner class name */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static abstract class C0249a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T a(Context context, Looper looper, com.google.android.gms.common.internal.c cVar, O o10, d.a aVar, d.b bVar) {
            return b(context, looper, cVar, o10, aVar, bVar);
        }

        public T b(Context context, Looper looper, com.google.android.gms.common.internal.c cVar, O o10, u7.b bVar, u7.g gVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface b {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class c<C extends b> {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface d {

        /* renamed from: t7.a$d$a  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        public interface C0250a extends d {
            Account a();
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        public interface b extends d {
            GoogleSignInAccount b();
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static abstract class e<T extends b, O> {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface f extends b {
        void a(b.e eVar);

        boolean b();

        Set<Scope> c();

        void d(com.google.android.gms.common.internal.f fVar, Set<Scope> set);

        void e(String str);

        boolean f();

        int g();

        boolean h();

        s7.c[] i();

        String j();

        String k();

        void l(b.c cVar);

        boolean m();
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static final class g<C extends f> extends c<C> {
    }

    public <C extends f> a(String str, C0249a<C, O> aVar, g<C> gVar) {
        this.f25821b = str;
        this.f25820a = aVar;
    }
}
