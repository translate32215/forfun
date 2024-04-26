package k8;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class q implements Iterator<o> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f20429a;

    /* renamed from: b  reason: collision with root package name */
    public int f20430b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f20431c;

    public q(e eVar) {
        this.f20429a = 2;
        this.f20431c = eVar;
        this.f20430b = 0;
    }

    public final boolean hasNext() {
        switch (this.f20429a) {
            case 0:
                if (this.f20430b < ((r) this.f20431c).f20445a.length()) {
                    return true;
                }
                return false;
            case 1:
                if (this.f20430b < ((r) this.f20431c).f20445a.length()) {
                    return true;
                }
                return false;
            default:
                if (this.f20430b < ((e) this.f20431c).x()) {
                    return true;
                }
                return false;
        }
    }

    public final /* bridge */ /* synthetic */ Object next() {
        switch (this.f20429a) {
            case 0:
                if (this.f20430b < ((r) this.f20431c).f20445a.length()) {
                    int i10 = this.f20430b;
                    this.f20430b = i10 + 1;
                    return new r(String.valueOf(i10));
                }
                throw new NoSuchElementException();
            case 1:
                if (this.f20430b < ((r) this.f20431c).f20445a.length()) {
                    String str = ((r) this.f20431c).f20445a;
                    int i11 = this.f20430b;
                    this.f20430b = i11 + 1;
                    return new r(String.valueOf(str.charAt(i11)));
                }
                throw new NoSuchElementException();
            default:
                if (this.f20430b < ((e) this.f20431c).x()) {
                    int i12 = this.f20430b;
                    this.f20430b = i12 + 1;
                    return ((e) this.f20431c).y(i12);
                }
                int i13 = this.f20430b;
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Out of bounds index: ");
                sb2.append(i13);
                throw new NoSuchElementException(sb2.toString());
        }
    }

    public q(r rVar, int i10) {
        this.f20429a = i10;
        if (i10 != 1) {
            this.f20431c = rVar;
            this.f20430b = 0;
            return;
        }
        this.f20431c = rVar;
        this.f20430b = 0;
    }
}
