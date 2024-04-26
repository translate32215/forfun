package i6;

import com.google.android.exoplayer2.ui.c;
import i6.c;
import java.util.Comparator;

public final /* synthetic */ class b implements Comparator {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ b f19269b = new b(0);

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ b f19270c = new b(1);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f19271a;

    public /* synthetic */ b(int i10) {
        this.f19271a = i10;
    }

    public final int compare(Object obj, Object obj2) {
        int i10 = 1;
        switch (this.f19271a) {
            case 0:
                int i11 = ((c.a) obj2).f19283b;
                int i12 = ((c.a) obj).f19283b;
                if (i11 == i12) {
                    return 0;
                }
                return i11 < i12 ? -1 : 1;
            default:
                c.C0080c cVar = (c.C0080c) obj;
                c.C0080c cVar2 = (c.C0080c) obj2;
                int i13 = cVar2.f5440b;
                int i14 = cVar.f5440b;
                if (i13 == i14) {
                    i10 = 0;
                } else if (i13 < i14) {
                    i10 = -1;
                }
                if (i10 != 0) {
                    return i10;
                }
                int compareTo = cVar.f5441c.compareTo(cVar2.f5441c);
                return compareTo != 0 ? compareTo : cVar.f5442d.compareTo(cVar2.f5442d);
        }
    }
}
