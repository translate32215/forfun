package d6;

import java.util.Collections;
import java.util.List;

/* compiled from: Period */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f13109a;

    /* renamed from: b  reason: collision with root package name */
    public final long f13110b;

    /* renamed from: c  reason: collision with root package name */
    public final List<a> f13111c;

    /* renamed from: d  reason: collision with root package name */
    public final List<e> f13112d;

    public f(String str, long j10, List<a> list, List<e> list2) {
        this.f13109a = str;
        this.f13110b = j10;
        this.f13111c = Collections.unmodifiableList(list);
        this.f13112d = Collections.unmodifiableList(list2);
    }

    public f(String str, long j10, List<a> list, List<e> list2, d dVar) {
        this.f13109a = str;
        this.f13110b = j10;
        this.f13111c = Collections.unmodifiableList(list);
        this.f13112d = Collections.unmodifiableList(list2);
    }
}
