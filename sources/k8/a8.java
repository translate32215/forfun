package k8;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class a8 extends i8 {
    public a8(int i10) {
        super(i10);
    }

    public final void a() {
        Iterable<Map.Entry> iterable;
        if (!this.f20264d) {
            for (int i10 = 0; i10 < b(); i10++) {
                Map.Entry d10 = d(i10);
                if (((b6) d10.getKey()).e()) {
                    d10.setValue(Collections.unmodifiableList((List) d10.getValue()));
                }
            }
            if (this.f20263c.isEmpty()) {
                iterable = d8.f20129b;
            } else {
                iterable = this.f20263c.entrySet();
            }
            for (Map.Entry entry : iterable) {
                if (((b6) entry.getKey()).e()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
