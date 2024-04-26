package e;

import android.os.Binder;
import android.util.Log;
import de.w0;
import java.util.concurrent.CancellationException;
import k8.j4;
import kb.b;
import kd.o;
import md.f;
import o1.x;
import o1.y;
import org.cybergarage.xml.Node;
import org.cybergarage.xml.Parser;
import td.l;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static Parser f13500a;

    public static void a(String str, Exception exc) {
        int i10 = b.f20580a;
        Log.e("OMIDLIB", str, exc);
    }

    public static void b(f fVar, CancellationException cancellationException, int i10, Object obj) {
        int i11 = w0.f13338l;
        w0 w0Var = (w0) fVar.get(w0.b.f13339a);
        if (w0Var != null) {
            w0Var.V((CancellationException) null);
        }
    }

    public static final Node c() {
        Node node = new Node("s:Envelope");
        node.setAttribute("xmlns:s", "http://schemas.xmlsoap.org/soap/envelope/");
        node.setAttribute("s:encodingStyle", "http://schemas.xmlsoap.org/soap/encoding/");
        node.addNode(new Node("s:Body"));
        return node;
    }

    public static final void d(f fVar) {
        int i10 = w0.f13338l;
        w0 w0Var = (w0) fVar.get(w0.b.f13339a);
        if (w0Var != null && !w0Var.a()) {
            throw w0Var.N();
        }
    }

    public static boolean e(CharSequence charSequence, CharSequence charSequence2) {
        char c10;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = charSequence.charAt(i10);
            char charAt2 = charSequence2.charAt(i10);
            if (charAt != charAt2 && ((c10 = (char) ((charAt | ' ') - 'a')) >= 26 || c10 != ((char) ((charAt2 | ' ') - 'a')))) {
                return false;
            }
        }
        return true;
    }

    public static final x f(l<? super y, o> lVar) {
        y yVar = new y();
        lVar.c(yVar);
        x.a aVar = yVar.f22846a;
        aVar.f22836a = yVar.f22847b;
        aVar.f22837b = false;
        String str = yVar.f22849d;
        if (str != null) {
            boolean z10 = yVar.f22850e;
            aVar.f22839d = str;
            aVar.f22838c = -1;
            aVar.f22840e = false;
            aVar.f22841f = z10;
        } else {
            aVar.b(yVar.f22848c, false, yVar.f22850e);
        }
        return aVar.a();
    }

    public static <V> V g(j4<V> j4Var) {
        long clearCallingIdentity;
        try {
            return j4Var.zza();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V zza = j4Var.zza();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return zza;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
