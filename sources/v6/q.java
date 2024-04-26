package v6;

import a6.b;
import androidx.appcompat.widget.y0;
import j8.u;
import j8.x;
import java.util.Arrays;
import q.e;

/* compiled from: LongArray */
public class q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26490a;

    /* renamed from: b  reason: collision with root package name */
    public int f26491b;

    /* renamed from: c  reason: collision with root package name */
    public Object f26492c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public q(int i10, e eVar) {
        this(32);
        this.f26490a = i10;
        if (i10 == 1) {
            this.f26492c = x.DEFAULT;
        } else if (i10 == 2) {
            this.f26492c = new int[10];
        } else if (i10 != 3) {
        } else {
            this.f26491b = 0;
            this.f26492c = "";
        }
    }

    public static final String b(int i10) {
        if (i10 == 412) {
            return "Precondition Failed";
        }
        if (i10 == 501) {
            return "Action Failed";
        }
        switch (i10) {
            case 401:
                return "Invalid Action";
            case 402:
                return "Invalid Args";
            case 403:
                return "Out of Sync";
            case 404:
                return "Invalid Var";
            default:
                return b.a(i10);
        }
    }

    public void a(long j10) {
        int i10 = this.f26491b;
        Object obj = this.f26492c;
        if (i10 == ((long[]) obj).length) {
            this.f26492c = Arrays.copyOf((long[]) obj, i10 * 2);
        }
        int i11 = this.f26491b;
        this.f26491b = i11 + 1;
        ((long[]) this.f26492c)[i11] = j10;
    }

    public long c(int i10) {
        if (i10 >= 0 && i10 < this.f26491b) {
            return ((long[]) this.f26492c)[i10];
        }
        StringBuilder a10 = y0.a("Invalid index ", i10, ", size is ");
        a10.append(this.f26491b);
        throw new IndexOutOfBoundsException(a10.toString());
    }

    public int d() {
        if ((this.f26491b & 128) != 0) {
            return ((int[]) this.f26492c)[7];
        }
        return 65535;
    }

    public q e(int i10, int i11) {
        if (i10 >= 0) {
            Object obj = this.f26492c;
            if (i10 < ((int[]) obj).length) {
                this.f26491b = (1 << i10) | this.f26491b;
                ((int[]) obj)[i10] = i11;
            }
        }
        return this;
    }

    public int f() {
        switch (this.f26490a) {
            case 0:
                return this.f26491b;
            default:
                return Integer.bitCount(this.f26491b);
        }
    }

    public u g() {
        return new u(this.f26491b, (x) this.f26492c);
    }

    public q(int i10) {
        this.f26490a = 0;
        this.f26492c = new long[i10];
    }
}
