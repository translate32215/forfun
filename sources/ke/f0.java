package ke;

import android.support.v4.media.a;
import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.annotation.Nullable;

/* compiled from: Route */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final a f20700a;

    /* renamed from: b  reason: collision with root package name */
    public final Proxy f20701b;

    /* renamed from: c  reason: collision with root package name */
    public final InetSocketAddress f20702c;

    public f0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        } else if (inetSocketAddress != null) {
            this.f20700a = aVar;
            this.f20701b = proxy;
            this.f20702c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    public boolean a() {
        return this.f20700a.f20638i != null && this.f20701b.type() == Proxy.Type.HTTP;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            return f0Var.f20700a.equals(this.f20700a) && f0Var.f20701b.equals(this.f20701b) && f0Var.f20702c.equals(this.f20702c);
        }
    }

    public int hashCode() {
        int hashCode = this.f20701b.hashCode();
        return this.f20702c.hashCode() + ((hashCode + ((this.f20700a.hashCode() + 527) * 31)) * 31);
    }

    public String toString() {
        StringBuilder a10 = a.a("Route{");
        a10.append(this.f20702c);
        a10.append("}");
        return a10.toString();
    }
}
