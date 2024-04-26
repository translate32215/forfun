package s7;

import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.util.a;
import com.google.android.gms.common.util.b;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final /* synthetic */ class n implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f25021a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f25022b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ s f25023c;

    public /* synthetic */ n(boolean z10, String str, s sVar) {
        this.f25021a = z10;
        this.f25022b = str;
        this.f25023c = sVar;
    }

    public final Object call() {
        boolean z10 = this.f25021a;
        String str = this.f25022b;
        s sVar = this.f25023c;
        String str2 = true != (!z10 && c.a(str, sVar, true, false).f5817a) ? "not allowed" : "debug cert rejected";
        MessageDigest b10 = a.b("SHA-256");
        i.h(b10);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", new Object[]{str2, str, b.a(b10.digest(sVar.z0())), Boolean.valueOf(z10), "12451000.false"});
    }
}
