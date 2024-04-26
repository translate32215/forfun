package e6;

import java.io.IOException;
import q.b;

/* compiled from: SampleQueueMappingException */
public final class i extends IOException {
    public i(String str) {
        super(b.a("Unable to bind a sample queue to TrackGroup with mime type ", str, "."));
    }
}
