package c5;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import u6.e;

/* compiled from: MediaDrmCallbackException */
public final class y extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public final e f4356a;

    public y(e eVar, Uri uri, Map<String, List<String>> map, long j10, Throwable th) {
        super(th);
        this.f4356a = eVar;
    }
}
