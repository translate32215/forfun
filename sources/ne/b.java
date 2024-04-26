package ne;

import java.io.IOException;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import ke.g;
import ke.i;
import ke.w;
import le.a;
import le.c;

/* compiled from: ConnectionSpecSelector */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final List<i> f22490a;

    /* renamed from: b  reason: collision with root package name */
    public int f22491b = 0;

    /* renamed from: c  reason: collision with root package name */
    public boolean f22492c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f22493d;

    public b(List<i> list) {
        this.f22490a = list;
    }

    public i a(SSLSocket sSLSocket) throws IOException {
        i iVar;
        boolean z10;
        String[] strArr;
        String[] strArr2;
        int i10 = this.f22491b;
        int size = this.f22490a.size();
        while (true) {
            if (i10 >= size) {
                iVar = null;
                break;
            }
            iVar = this.f22490a.get(i10);
            if (iVar.a(sSLSocket)) {
                this.f22491b = i10 + 1;
                break;
            }
            i10++;
        }
        if (iVar != null) {
            int i11 = this.f22491b;
            while (true) {
                if (i11 >= this.f22490a.size()) {
                    z10 = false;
                    break;
                } else if (this.f22490a.get(i11).a(sSLSocket)) {
                    z10 = true;
                    break;
                } else {
                    i11++;
                }
            }
            this.f22492c = z10;
            a aVar = a.f21259a;
            boolean z11 = this.f22493d;
            ((w.a) aVar).getClass();
            if (iVar.f20743c != null) {
                strArr = c.r(g.f20703b, sSLSocket.getEnabledCipherSuites(), iVar.f20743c);
            } else {
                strArr = sSLSocket.getEnabledCipherSuites();
            }
            if (iVar.f20744d != null) {
                strArr2 = c.r(c.f21275o, sSLSocket.getEnabledProtocols(), iVar.f20744d);
            } else {
                strArr2 = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            Comparator<String> comparator = g.f20703b;
            byte[] bArr = c.f21261a;
            int length = supportedCipherSuites.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    i12 = -1;
                    break;
                }
                if (((g.a) comparator).compare(supportedCipherSuites[i12], "TLS_FALLBACK_SCSV") == 0) {
                    break;
                }
                i12++;
            }
            if (z11 && i12 != -1) {
                String str = supportedCipherSuites[i12];
                int length2 = strArr.length + 1;
                String[] strArr3 = new String[length2];
                System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
                strArr3[length2 - 1] = str;
                strArr = strArr3;
            }
            i.a aVar2 = new i.a(iVar);
            aVar2.a(strArr);
            aVar2.d(strArr2);
            i iVar2 = new i(aVar2);
            String[] strArr4 = iVar2.f20744d;
            if (strArr4 != null) {
                sSLSocket.setEnabledProtocols(strArr4);
            }
            String[] strArr5 = iVar2.f20743c;
            if (strArr5 != null) {
                sSLSocket.setEnabledCipherSuites(strArr5);
            }
            return iVar;
        }
        StringBuilder a10 = android.support.v4.media.a.a("Unable to find acceptable protocols. isFallback=");
        a10.append(this.f22493d);
        a10.append(", modes=");
        a10.append(this.f22490a);
        a10.append(", supported protocols=");
        a10.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
        throw new UnknownServiceException(a10.toString());
    }
}
