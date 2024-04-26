package e8;

import com.google.android.gms.internal.ads.aq;
import com.google.android.gms.internal.ads.cq;
import com.google.android.gms.internal.ads.mp;
import com.google.android.gms.internal.ads.sp;
import e8.y60;
import e8.z60;
import j4.e;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;
import t1.c;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public abstract class z60<MessageType extends z60<MessageType, BuilderType>, BuilderType extends y60<MessageType, BuilderType>> implements cq {
    public int zzijw = 0;

    public static <T> void h(Iterable<T> iterable, List<? super T> list) {
        Charset charset = v70.f17029a;
        iterable.getClass();
        if (iterable instanceof k80) {
            List<?> w10 = ((k80) iterable).w();
            k80 k80 = (k80) list;
            int size = list.size();
            for (Object next : w10) {
                if (next == null) {
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Element at index ");
                    sb2.append(k80.size() - size);
                    sb2.append(" is null.");
                    String sb3 = sb2.toString();
                    int size2 = k80.size();
                    while (true) {
                        size2--;
                        if (size2 >= size) {
                            k80.remove(size2);
                        } else {
                            throw new NullPointerException(sb3);
                        }
                    }
                } else if (next instanceof mp) {
                    k80.n((mp) next);
                } else {
                    k80.add((String) next);
                }
            }
        } else if (iterable instanceof h90) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size3 = list.size();
            for (T next2 : iterable) {
                if (next2 == null) {
                    StringBuilder sb4 = new StringBuilder(37);
                    sb4.append("Element at index ");
                    sb4.append(list.size() - size3);
                    sb4.append(" is null.");
                    String sb5 = sb4.toString();
                    int size4 = list.size();
                    while (true) {
                        size4--;
                        if (size4 >= size3) {
                            list.remove(size4);
                        } else {
                            throw new NullPointerException(sb5);
                        }
                    }
                } else {
                    list.add(next2);
                }
            }
        }
    }

    public final byte[] f() {
        try {
            aq aqVar = (aq) this;
            int c10 = aqVar.c();
            byte[] bArr = new byte[c10];
            Logger logger = sp.f8137b;
            sp.b bVar = new sp.b(bArr, c10);
            aqVar.a(bVar);
            if (bVar.t() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder a10 = e.a(name.length() + 62 + 10, "Serializing ", name, " to a ", "byte array");
            a10.append(" threw an IOException (should never happen).");
            throw new RuntimeException(a10.toString(), e10);
        }
    }

    public final mp g() {
        try {
            aq aqVar = (aq) this;
            int c10 = aqVar.c();
            mp mpVar = mp.f7494b;
            c cVar = new c(c10, (f70) null);
            aqVar.a((sp) cVar.f25350b);
            return cVar.q();
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder a10 = e.a("ByteString".length() + name.length() + 62, "Serializing ", name, " to a ", "ByteString");
            a10.append(" threw an IOException (should never happen).");
            throw new RuntimeException(a10.toString(), e10);
        }
    }

    public int i() {
        throw new UnsupportedOperationException();
    }

    public void j(int i10) {
        throw new UnsupportedOperationException();
    }
}
