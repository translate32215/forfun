package e6;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: FullSegmentEncryptionKeyCache */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap<Uri, byte[]> f13616a;

    /* compiled from: FullSegmentEncryptionKeyCache */
    public class a extends LinkedHashMap<Uri, byte[]> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f13617a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d dVar, int i10, float f10, boolean z10, int i11) {
            super(i10, f10, z10);
            this.f13617a = i11;
        }

        public boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
            return size() > this.f13617a;
        }
    }

    public d(int i10) {
        this.f13616a = new a(this, i10 + 1, 1.0f, false, i10);
    }
}
