package e8;

import java.io.IOException;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class m40 implements Iterable<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CharSequence f15463a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k40 f15464b;

    public m40(k40 k40, CharSequence charSequence) {
        this.f15464b = k40;
        this.f15463a = charSequence;
    }

    public final Iterator<String> iterator() {
        k40 k40 = this.f15464b;
        CharSequence charSequence = this.f15463a;
        gz gzVar = k40.f15238b;
        gzVar.getClass();
        return new l40(gzVar, k40, charSequence);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator<String> it = iterator();
        try {
            if (it.hasNext()) {
                String next = it.next();
                next.getClass();
                sb2.append(next instanceof CharSequence ? next : next.toString());
                while (it.hasNext()) {
                    sb2.append(", ");
                    String next2 = it.next();
                    next2.getClass();
                    sb2.append(next2 instanceof CharSequence ? next2 : next2.toString());
                }
            }
            sb2.append(']');
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
