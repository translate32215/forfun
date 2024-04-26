package u7;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.n;
import java.util.Set;
import p8.c;
import q8.d;
import q8.g;
import q8.j;
import q8.l;
import r7.m;
import t7.a;
import t7.d;
import v7.q;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class z extends d implements d.a, d.b {

    /* renamed from: h  reason: collision with root package name */
    public static final a.C0249a<? extends p8.d, p8.a> f26140h = c.f23947a;

    /* renamed from: a  reason: collision with root package name */
    public final Context f26141a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f26142b;

    /* renamed from: c  reason: collision with root package name */
    public final a.C0249a<? extends p8.d, p8.a> f26143c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<Scope> f26144d;

    /* renamed from: e  reason: collision with root package name */
    public final com.google.android.gms.common.internal.c f26145e;

    /* renamed from: f  reason: collision with root package name */
    public p8.d f26146f;

    /* renamed from: g  reason: collision with root package name */
    public y f26147g;

    public z(Context context, Handler handler, com.google.android.gms.common.internal.c cVar) {
        a.C0249a<? extends p8.d, p8.a> aVar = f26140h;
        this.f26141a = context;
        this.f26142b = handler;
        this.f26145e = cVar;
        this.f26144d = cVar.f5842b;
        this.f26143c = aVar;
    }

    public final void Y(int i10) {
        ((b) this.f26146f).p();
    }

    public final void m(s7.a aVar) {
        ((r) this.f26147g).b(aVar);
    }

    public final void z0(Bundle bundle) {
        q8.a aVar = (q8.a) this.f26146f;
        aVar.getClass();
        i.i(this, "Expecting a valid ISignInCallbacks");
        try {
            Account account = aVar.J.f5841a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            GoogleSignInAccount b10 = "<<default account>>".equals(account.name) ? q7.a.a(aVar.f5824c).b() : null;
            Integer num = aVar.L;
            i.h(num);
            ((g) aVar.v()).m(new j(1, new q(account, num.intValue(), b10)), this);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f26142b.post(new m(this, new l(1, new s7.a(8, (PendingIntent) null), (n) null)));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }
}
