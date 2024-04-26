package e8;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class e8 implements Comparator<byte[]> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14381a;

    public e8(int i10) {
        this.f14381a = i10;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.f14381a) {
            case 0:
                return ((byte[]) obj).length - ((byte[]) obj2).length;
            default:
                ch0 ch0 = (ch0) obj;
                ch0 ch02 = (ch0) obj2;
                int i10 = ch0.f14142c - ch02.f14142c;
                return i10 != 0 ? i10 : (int) (ch0.f14140a - ch02.f14140a);
        }
    }
}
