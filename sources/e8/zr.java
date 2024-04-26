package e8;

import android.util.JsonReader;
import com.google.android.gms.internal.ads.l5;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.pd;
import com.google.android.gms.internal.ads.yh;
import d7.l;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class zr implements oh {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17790a;

    /* renamed from: b  reason: collision with root package name */
    public final l5 f17791b;

    public zr(l5 l5Var, int i10) {
        this.f17790a = i10;
        if (i10 != 1) {
            this.f17791b = l5Var;
        } else {
            this.f17791b = l5Var;
        }
    }

    public final p50 a(Object obj) {
        byte[] a10;
        switch (this.f17790a) {
            case 0:
                l5 l5Var = this.f17791b;
                InputStream inputStream = (InputStream) obj;
                int i10 = f50.f14535a;
                inputStream.getClass();
                ArrayDeque arrayDeque = new ArrayDeque(20);
                int i11 = 8192;
                int i12 = 0;
                while (true) {
                    if (i12 < 2147483639) {
                        int min = Math.min(i11, 2147483639 - i12);
                        byte[] bArr = new byte[min];
                        arrayDeque.add(bArr);
                        int i13 = 0;
                        while (i13 < min) {
                            int read = inputStream.read(bArr, i13, min - i13);
                            if (read == -1) {
                                a10 = f50.a(arrayDeque, i12);
                            } else {
                                i13 += read;
                                i12 += read;
                            }
                        }
                        long j10 = ((long) i11) << 1;
                        i11 = j10 > 2147483647L ? Integer.MAX_VALUE : j10 < -2147483648L ? Integer.MIN_VALUE : (int) j10;
                    } else if (inputStream.read() == -1) {
                        a10 = f50.a(arrayDeque, 2147483639);
                    } else {
                        throw new OutOfMemoryError("input is too large to fit in a byte array");
                    }
                }
                l5Var.f7323r = new String(a10, h40.f14846a);
                return yh.h(l5Var);
            default:
                l5 l5Var2 = this.f17791b;
                pd pdVar = new pd(new JsonReader(new InputStreamReader((InputStream) obj)));
                try {
                    pdVar.f7852b = l.B.f13186c.v(l5Var2.f7314a).toString();
                } catch (JSONException unused) {
                    pdVar.f7852b = "{}";
                }
                return yh.h(pdVar);
        }
    }
}
