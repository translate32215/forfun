package t4;

import com.google.auto.value.AutoValue;
import j.f;
import t4.a;

@AutoValue
/* compiled from: EventStoreConfig */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f25697a;

    static {
        Long l10 = 10485760L;
        Integer num = 200;
        Integer num2 = 10000;
        Long l11 = 604800000L;
        Integer num3 = 81920;
        String str = l10 == null ? " maxStorageSizeInBytes" : "";
        if (num == null) {
            str = f.a(str, " loadBatchSize");
        }
        if (num2 == null) {
            str = f.a(str, " criticalSectionEnterTimeoutMs");
        }
        if (l11 == null) {
            str = f.a(str, " eventCleanUpAge");
        }
        if (num3 == null) {
            str = f.a(str, " maxBlobByteSizePerRow");
        }
        if (str.isEmpty()) {
            f25697a = new a(l10.longValue(), num.intValue(), num2.intValue(), l11.longValue(), num3.intValue(), (a.C0246a) null);
            return;
        }
        throw new IllegalStateException(f.a("Missing required properties:", str));
    }

    public abstract int a();

    public abstract long b();

    public abstract int c();

    public abstract int d();

    public abstract long e();
}
