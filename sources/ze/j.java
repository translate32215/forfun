package ze;

import java.util.Vector;

/* compiled from: ServiceStateTable */
public class j extends Vector {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28870a;

    public j(int i10) {
        this.f28870a = i10;
        if (i10 == 1) {
        }
    }

    public boolean add(Object obj) {
        switch (this.f28870a) {
            case 1:
                if (indexOf(obj) >= 0) {
                    return false;
                }
                return super.add(obj);
            default:
                return super.add(obj);
        }
    }
}
