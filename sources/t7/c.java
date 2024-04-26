package t7;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.i;
import f7.v;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import t7.a;
import t7.a.d;
import z7.h;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class c<O extends a.d> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f25823a;

    /* renamed from: b  reason: collision with root package name */
    public final String f25824b;

    /* renamed from: c  reason: collision with root package name */
    public final a<O> f25825c;

    /* renamed from: d  reason: collision with root package name */
    public final O f25826d;

    /* renamed from: e  reason: collision with root package name */
    public final u7.a<O> f25827e;

    /* renamed from: f  reason: collision with root package name */
    public final int f25828f;

    /* renamed from: g  reason: collision with root package name */
    public final v f25829g;

    /* renamed from: h  reason: collision with root package name */
    public final b f25830h;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class a {

        /* renamed from: b  reason: collision with root package name */
        public static final a f25831b = new a(new v(1), (Account) null, Looper.getMainLooper());

        /* renamed from: a  reason: collision with root package name */
        public final v f25832a;

        public a(v vVar, Account account, Looper looper) {
            this.f25832a = vVar;
        }
    }

    public c(Context context, a<O> aVar, O o10, a aVar2) {
        String str;
        i.i(context, "Null context is not permitted.");
        i.i(aVar, "Api must not be null.");
        i.i(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f25823a = context.getApplicationContext();
        if (h.f()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            this.f25824b = str;
            this.f25825c = aVar;
            this.f25826d = o10;
            this.f25827e = new u7.a<>(aVar, o10, str);
            b f10 = b.f(this.f25823a);
            this.f25830h = f10;
            this.f25828f = f10.f5764h.getAndIncrement();
            this.f25829g = aVar2.f25832a;
            Handler handler = f10.f5770v;
            handler.sendMessage(handler.obtainMessage(7, this));
        }
        str = null;
        this.f25824b = str;
        this.f25825c = aVar;
        this.f25826d = o10;
        this.f25827e = new u7.a<>(aVar, o10, str);
        b f102 = b.f(this.f25823a);
        this.f25830h = f102;
        this.f25828f = f102.f5764h.getAndIncrement();
        this.f25829g = aVar2.f25832a;
        Handler handler2 = f102.f5770v;
        handler2.sendMessage(handler2.obtainMessage(7, this));
    }

    public c.a a() {
        Set<Scope> set;
        GoogleSignInAccount b10;
        c.a aVar = new c.a();
        O o10 = this.f25826d;
        Account account = null;
        if (!(o10 instanceof a.d.b) || (b10 = ((a.d.b) o10).b()) == null) {
            O o11 = this.f25826d;
            if (o11 instanceof a.d.C0250a) {
                account = ((a.d.C0250a) o11).a();
            }
        } else {
            String str = b10.f5724d;
            if (str != null) {
                account = new Account(str, "com.google");
            }
        }
        aVar.f5849a = account;
        O o12 = this.f25826d;
        if (o12 instanceof a.d.b) {
            GoogleSignInAccount b11 = ((a.d.b) o12).b();
            if (b11 == null) {
                set = Collections.emptySet();
            } else {
                set = b11.i();
            }
        } else {
            set = Collections.emptySet();
        }
        if (aVar.f5850b == null) {
            aVar.f5850b = new s.c<>(0);
        }
        aVar.f5850b.addAll(set);
        aVar.f5852d = this.f25823a.getClass().getName();
        aVar.f5851c = this.f25823a.getPackageName();
        return aVar;
    }
}
