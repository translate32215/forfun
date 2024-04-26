package z2;

import android.support.v4.media.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: KeyPath */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f28234a;

    /* renamed from: b  reason: collision with root package name */
    public f f28235b;

    public e(String... strArr) {
        this.f28234a = Arrays.asList(strArr);
    }

    public e a(String str) {
        e eVar = new e(this);
        eVar.f28234a.add(str);
        return eVar;
    }

    public final boolean b() {
        List<String> list = this.f28234a;
        return list.get(list.size() - 1).equals("**");
    }

    public boolean c(String str, int i10) {
        if (i10 >= this.f28234a.size()) {
            return false;
        }
        boolean z10 = i10 == this.f28234a.size() - 1;
        String str2 = this.f28234a.get(i10);
        if (!str2.equals("**")) {
            boolean z11 = str2.equals(str) || str2.equals("*");
            if ((z10 || (i10 == this.f28234a.size() - 2 && b())) && z11) {
                return true;
            }
            return false;
        }
        if (!z10 && this.f28234a.get(i10 + 1).equals(str)) {
            if (i10 == this.f28234a.size() - 2 || (i10 == this.f28234a.size() - 3 && b())) {
                return true;
            }
            return false;
        } else if (z10) {
            return true;
        } else {
            int i11 = i10 + 1;
            if (i11 < this.f28234a.size() - 1) {
                return false;
            }
            return this.f28234a.get(i11).equals(str);
        }
    }

    public int d(String str, int i10) {
        if ("__container".equals(str)) {
            return 0;
        }
        if (!this.f28234a.get(i10).equals("**")) {
            return 1;
        }
        if (i10 != this.f28234a.size() - 1 && this.f28234a.get(i10 + 1).equals(str)) {
            return 2;
        }
        return 0;
    }

    public boolean e(String str, int i10) {
        if ("__container".equals(str)) {
            return true;
        }
        if (i10 >= this.f28234a.size()) {
            return false;
        }
        if (this.f28234a.get(i10).equals(str) || this.f28234a.get(i10).equals("**") || this.f28234a.get(i10).equals("*")) {
            return true;
        }
        return false;
    }

    public boolean f(String str, int i10) {
        if (!"__container".equals(str) && i10 >= this.f28234a.size() - 1 && !this.f28234a.get(i10).equals("**")) {
            return false;
        }
        return true;
    }

    public e g(f fVar) {
        e eVar = new e(this);
        eVar.f28235b = fVar;
        return eVar;
    }

    public String toString() {
        StringBuilder a10 = a.a("KeyPath{keys=");
        a10.append(this.f28234a);
        a10.append(",resolved=");
        a10.append(this.f28235b != null);
        a10.append('}');
        return a10.toString();
    }

    public e(e eVar) {
        this.f28234a = new ArrayList(eVar.f28234a);
        this.f28235b = eVar.f28235b;
    }
}
