package d5;

import androidx.activity.e;

/* compiled from: SeekMap */
public interface x {

    /* compiled from: SeekMap */
    public static class b implements x {

        /* renamed from: a  reason: collision with root package name */
        public final long f13066a;

        /* renamed from: b  reason: collision with root package name */
        public final a f13067b;

        public b(long j10, long j11) {
            this.f13066a = j10;
            this.f13067b = new a(j11 == 0 ? y.f13068c : new y(0, j11));
        }

        public boolean b() {
            return false;
        }

        public long c() {
            return this.f13066a;
        }

        public a j(long j10) {
            return this.f13067b;
        }
    }

    boolean b();

    long c();

    a j(long j10);

    /* compiled from: SeekMap */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final y f13064a;

        /* renamed from: b  reason: collision with root package name */
        public final y f13065b;

        public a(y yVar) {
            this.f13064a = yVar;
            this.f13065b = yVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f13064a.equals(aVar.f13064a) || !this.f13065b.equals(aVar.f13065b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f13065b.hashCode() + (this.f13064a.hashCode() * 31);
        }

        public String toString() {
            String str;
            StringBuilder a10 = android.support.v4.media.a.a("[");
            a10.append(this.f13064a);
            if (this.f13064a.equals(this.f13065b)) {
                str = "";
            } else {
                StringBuilder a11 = android.support.v4.media.a.a(", ");
                a11.append(this.f13065b);
                str = a11.toString();
            }
            return e.a(a10, str, "]");
        }

        public a(y yVar, y yVar2) {
            this.f13064a = yVar;
            this.f13065b = yVar2;
        }
    }
}
