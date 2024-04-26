package l9;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l9.h;

/* compiled from: CheckableGroup */
public class b<T extends h<T>> {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, T> f21108a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Set<Integer> f21109b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public a f21110c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f21111d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f21112e;

    /* compiled from: CheckableGroup */
    public interface a {
    }

    public final boolean a(h<T> hVar) {
        int id2 = hVar.getId();
        if (this.f21109b.contains(Integer.valueOf(id2))) {
            return false;
        }
        h hVar2 = (h) this.f21108a.get(Integer.valueOf(c()));
        if (hVar2 != null) {
            e(hVar2, false);
        }
        boolean add = this.f21109b.add(Integer.valueOf(id2));
        if (!hVar.isChecked()) {
            hVar.setChecked(true);
        }
        return add;
    }

    public List<Integer> b(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet(this.f21109b);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof h) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int c() {
        if (!this.f21111d || this.f21109b.isEmpty()) {
            return -1;
        }
        return this.f21109b.iterator().next().intValue();
    }

    public final void d() {
        a aVar = this.f21110c;
        if (aVar != null) {
            new HashSet(this.f21109b);
            ChipGroup chipGroup = ((com.google.android.material.chip.b) aVar).f9123a;
            ChipGroup.d dVar = chipGroup.f9089g;
            if (dVar != null) {
                chipGroup.f9090h.b(chipGroup);
                ChipGroup.a aVar2 = (ChipGroup.a) dVar;
                ChipGroup chipGroup2 = ChipGroup.this;
                if (chipGroup2.f9090h.f21111d) {
                    aVar2.f9093a.a(chipGroup, chipGroup2.getCheckedChipId());
                }
            }
        }
    }

    public final boolean e(h<T> hVar, boolean z10) {
        int id2 = hVar.getId();
        if (!this.f21109b.contains(Integer.valueOf(id2))) {
            return false;
        }
        if (!z10 || this.f21109b.size() != 1 || !this.f21109b.contains(Integer.valueOf(id2))) {
            boolean remove = this.f21109b.remove(Integer.valueOf(id2));
            if (hVar.isChecked()) {
                hVar.setChecked(false);
            }
            return remove;
        }
        hVar.setChecked(true);
        return false;
    }
}
