package df;

import java.net.InetAddress;
import java.util.Vector;

/* compiled from: SSDPSearchResponseSocketList */
public class f extends Vector {

    /* renamed from: a  reason: collision with root package name */
    public InetAddress[] f13499a = null;

    public f(InetAddress[] inetAddressArr) {
        this.f13499a = inetAddressArr;
    }

    public void c() {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            f(i10).a();
        }
        clear();
    }

    public e f(int i10) {
        return (e) get(i10);
    }

    public void h() {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            f(i10).f13498d = null;
        }
    }
}
