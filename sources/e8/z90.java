package e8;

import java.util.ListIterator;
import k8.o8;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class z90 implements ListIterator<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17697a = 0;

    /* renamed from: b  reason: collision with root package name */
    public ListIterator<String> f17698b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f17699c;

    public z90(aa0 aa0, int i10) {
        this.f17699c = aa0;
        this.f17698b = aa0.f13670a.listIterator(i10);
    }

    public final /* synthetic */ void add(Object obj) {
        switch (this.f17697a) {
            case 0:
                String str = (String) obj;
                throw new UnsupportedOperationException();
            default:
                String str2 = (String) obj;
                throw new UnsupportedOperationException();
        }
    }

    public final boolean hasNext() {
        switch (this.f17697a) {
            case 0:
                return this.f17698b.hasNext();
            default:
                return this.f17698b.hasNext();
        }
    }

    public final boolean hasPrevious() {
        switch (this.f17697a) {
            case 0:
                return this.f17698b.hasPrevious();
            default:
                return this.f17698b.hasPrevious();
        }
    }

    public final /* synthetic */ Object next() {
        switch (this.f17697a) {
            case 0:
                return this.f17698b.next();
            default:
                return this.f17698b.next();
        }
    }

    public final int nextIndex() {
        switch (this.f17697a) {
            case 0:
                return this.f17698b.nextIndex();
            default:
                return this.f17698b.nextIndex();
        }
    }

    public final /* synthetic */ Object previous() {
        switch (this.f17697a) {
            case 0:
                return this.f17698b.previous();
            default:
                return this.f17698b.previous();
        }
    }

    public final int previousIndex() {
        switch (this.f17697a) {
            case 0:
                return this.f17698b.previousIndex();
            default:
                return this.f17698b.previousIndex();
        }
    }

    public final void remove() {
        switch (this.f17697a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final /* synthetic */ void set(Object obj) {
        switch (this.f17697a) {
            case 0:
                String str = (String) obj;
                throw new UnsupportedOperationException();
            default:
                String str2 = (String) obj;
                throw new UnsupportedOperationException();
        }
    }

    public z90(o8 o8Var, int i10) {
        this.f17699c = o8Var;
        this.f17698b = o8Var.f20393a.listIterator(i10);
    }
}
