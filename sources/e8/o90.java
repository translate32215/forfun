package e8;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class o90 extends p90<FieldDescriptorType, Object> {
    public o90(int i10) {
        super(i10, (o90) null);
    }

    public final void c() {
        if (!this.f15886d) {
            for (int i10 = 0; i10 < d(); i10++) {
                Map.Entry h10 = h(i10);
                if (((q70) h10.getKey()).n()) {
                    h10.setValue(Collections.unmodifiableList((List) h10.getValue()));
                }
            }
            for (Map.Entry entry : e()) {
                if (((q70) entry.getKey()).n()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.c();
    }
}
