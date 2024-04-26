package n9;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import b2.n;
import b2.p;
import com.startapp.startappsdk.R;
import l9.l;
import w8.b;
import w8.c;
import w8.d;

/* compiled from: NavigationBarPresenter */
public class e implements i {

    /* renamed from: a  reason: collision with root package name */
    public d f22456a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f22457b = false;

    /* renamed from: c  reason: collision with root package name */
    public int f22458c;

    /* compiled from: NavigationBarPresenter */
    public static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0197a();

        /* renamed from: a  reason: collision with root package name */
        public int f22459a;

        /* renamed from: b  reason: collision with root package name */
        public l f22460b;

        /* renamed from: n9.e$a$a  reason: collision with other inner class name */
        /* compiled from: NavigationBarPresenter */
        public class C0197a implements Parcelable.Creator<a> {
            public Object createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            public Object[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f22459a);
            parcel.writeParcelable(this.f22460b, 0);
        }

        public a(Parcel parcel) {
            this.f22459a = parcel.readInt();
            this.f22460b = (l) parcel.readParcelable(a.class.getClassLoader());
        }
    }

    public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
    }

    public void c(Context context, androidx.appcompat.view.menu.e eVar) {
        this.f22456a.J = eVar;
    }

    public void d(Parcelable parcelable) {
        if (parcelable instanceof a) {
            d dVar = this.f22456a;
            a aVar = (a) parcelable;
            int i10 = aVar.f22459a;
            int size = dVar.J.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                MenuItem item = dVar.J.getItem(i11);
                if (i10 == item.getItemId()) {
                    dVar.f22443g = i10;
                    dVar.f22444h = i11;
                    item.setChecked(true);
                    break;
                }
                i11++;
            }
            Context context = this.f22456a.getContext();
            l lVar = aVar.f22460b;
            boolean z10 = d.f27173a;
            SparseArray sparseArray = new SparseArray(lVar.size());
            int i12 = 0;
            while (i12 < lVar.size()) {
                int keyAt = lVar.keyAt(i12);
                c.a aVar2 = (c.a) lVar.valueAt(i12);
                if (aVar2 != null) {
                    sparseArray.put(keyAt, new b(context, 0, R.attr.badgeStyle, 2132083788, aVar2));
                    i12++;
                } else {
                    throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
                }
            }
            d dVar2 = this.f22456a;
            dVar2.getClass();
            for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                int keyAt2 = sparseArray.keyAt(i13);
                if (dVar2.f22453y.indexOfKey(keyAt2) < 0) {
                    dVar2.f22453y.append(keyAt2, sparseArray.get(keyAt2));
                }
            }
            a[] aVarArr = dVar2.f22442f;
            if (aVarArr != null) {
                for (a aVar3 : aVarArr) {
                    aVar3.setBadge(dVar2.f22453y.get(aVar3.getId()));
                }
            }
        }
    }

    public boolean e(androidx.appcompat.view.menu.l lVar) {
        return false;
    }

    public void g(boolean z10) {
        p pVar;
        if (!this.f22457b) {
            if (z10) {
                this.f22456a.a();
                return;
            }
            d dVar = this.f22456a;
            androidx.appcompat.view.menu.e eVar = dVar.J;
            if (eVar != null && dVar.f22442f != null) {
                int size = eVar.size();
                if (size != dVar.f22442f.length) {
                    dVar.a();
                    return;
                }
                int i10 = dVar.f22443g;
                for (int i11 = 0; i11 < size; i11++) {
                    MenuItem item = dVar.J.getItem(i11);
                    if (item.isChecked()) {
                        dVar.f22443g = item.getItemId();
                        dVar.f22444h = i11;
                    }
                }
                if (!(i10 == dVar.f22443g || (pVar = dVar.f22437a) == null)) {
                    n.a(dVar, pVar);
                }
                boolean f10 = dVar.f(dVar.f22441e, dVar.J.l().size());
                for (int i12 = 0; i12 < size; i12++) {
                    dVar.I.f22457b = true;
                    dVar.f22442f[i12].setLabelVisibilityMode(dVar.f22441e);
                    dVar.f22442f[i12].setShifting(f10);
                    dVar.f22442f[i12].d((g) dVar.J.getItem(i12), 0);
                    dVar.I.f22457b = false;
                }
            }
        }
    }

    public int getId() {
        return this.f22458c;
    }

    public boolean h() {
        return false;
    }

    public Parcelable i() {
        a aVar = new a();
        aVar.f22459a = this.f22456a.getSelectedItemId();
        SparseArray<b> badgeDrawables = this.f22456a.getBadgeDrawables();
        boolean z10 = d.f27173a;
        l lVar = new l();
        int i10 = 0;
        while (i10 < badgeDrawables.size()) {
            int keyAt = badgeDrawables.keyAt(i10);
            b valueAt = badgeDrawables.valueAt(i10);
            if (valueAt != null) {
                lVar.put(keyAt, valueAt.f27141e.f27150a);
                i10++;
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        aVar.f22460b = lVar;
        return aVar;
    }

    public boolean j(androidx.appcompat.view.menu.e eVar, g gVar) {
        return false;
    }

    public boolean k(androidx.appcompat.view.menu.e eVar, g gVar) {
        return false;
    }
}
