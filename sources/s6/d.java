package s6;

import com.google.android.exoplayer2.ui.c;
import java.util.Comparator;

public final /* synthetic */ class d implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ d f24971a = new d();

    public final int compare(Object obj, Object obj2) {
        c.C0080c cVar = (c.C0080c) obj;
        c.C0080c cVar2 = (c.C0080c) obj2;
        int i10 = cVar2.f5439a;
        int i11 = cVar.f5439a;
        int i12 = i10 == i11 ? 0 : i10 < i11 ? -1 : 1;
        if (i12 != 0) {
            return i12;
        }
        int compareTo = cVar2.f5441c.compareTo(cVar.f5441c);
        return compareTo != 0 ? compareTo : cVar2.f5442d.compareTo(cVar.f5442d);
    }
}
