package x5;

import q5.a;
import x4.b0;

/* compiled from: SpliceCommand */
public abstract class b implements a.b {
    public /* synthetic */ b0 F() {
        return q5.b.b(this);
    }

    public /* synthetic */ byte[] I() {
        return q5.b.a(this);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("SCTE-35 splice command: type=");
        a10.append(getClass().getSimpleName());
        return a10.toString();
    }
}
