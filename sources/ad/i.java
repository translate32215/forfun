package ad;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.a0;
import androidx.fragment.app.f0;
import androidx.fragment.app.o;
import androidx.fragment.app.p;
import androidx.viewpager.widget.ViewPager;
import com.google.android.exoplayer2.ui.TrackSelectionView;
import com.google.android.material.tabs.TabLayout;
import com.startapp.startappsdk.R;
import f.s;
import java.util.ArrayList;
import java.util.List;
import r6.f;
import r6.j;

/* compiled from: TrackSelectionDialog */
public final class i extends o {
    public static final /* synthetic */ int I0 = 0;
    public final SparseArray<b> D0 = new SparseArray<>();
    public final ArrayList<Integer> E0 = new ArrayList<>();
    public int F0;
    public DialogInterface.OnClickListener G0;
    public DialogInterface.OnDismissListener H0;

    /* compiled from: TrackSelectionDialog */
    public final class a extends f0 {
        public a(a0 a0Var) {
            super(a0Var);
        }

        public int c() {
            return i.this.D0.size();
        }
    }

    /* compiled from: TrackSelectionDialog */
    public static final class b extends p implements TrackSelectionView.d {

        /* renamed from: n0  reason: collision with root package name */
        public boolean f275n0;

        /* renamed from: o0  reason: collision with root package name */
        public List<f.e> f276o0;

        /* renamed from: p0  reason: collision with root package name */
        public j.a f277p0;

        /* renamed from: q0  reason: collision with root package name */
        public int f278q0;

        /* renamed from: r0  reason: collision with root package name */
        public boolean f279r0;

        /* renamed from: s0  reason: collision with root package name */
        public boolean f280s0;

        public b() {
            p0(true);
        }

        public View P(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View inflate = layoutInflater.inflate(R.layout.exo_track_selection_dialog, viewGroup, false);
            TrackSelectionView trackSelectionView = (TrackSelectionView) inflate.findViewById(R.id.exo_track_selection_view);
            trackSelectionView.setShowDisableOption(true);
            trackSelectionView.setAllowMultipleOverrides(this.f280s0);
            trackSelectionView.setAllowAdaptiveSelections(this.f279r0);
            j.a aVar = this.f277p0;
            int i10 = this.f278q0;
            boolean z10 = this.f275n0;
            List<f.e> list = this.f276o0;
            trackSelectionView.f5383s = aVar;
            trackSelectionView.f5384t = i10;
            trackSelectionView.f5386v = z10;
            trackSelectionView.f5387w = null;
            trackSelectionView.f5388x = this;
            int size = trackSelectionView.f5380h ? list.size() : Math.min(list.size(), 1);
            for (int i11 = 0; i11 < size; i11++) {
                f.e eVar = list.get(i11);
                trackSelectionView.f5378f.put(eVar.f24628a, eVar);
            }
            trackSelectionView.c();
            return inflate;
        }
    }

    public i() {
        p0(true);
    }

    public static boolean x0(j.a aVar, int i10) {
        if (aVar.f24659d[i10].f28589a == 0) {
            return false;
        }
        int i11 = aVar.f24658c[i10];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return true;
        }
        return false;
    }

    public static boolean y0(f fVar) {
        boolean z10;
        j.a aVar = fVar.f24655c;
        if (aVar != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= aVar.f24656a) {
                    z10 = false;
                    break;
                } else if (x0(aVar, i10)) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public View P(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = 0;
        View inflate = layoutInflater.inflate(R.layout.track_selection_dialog, viewGroup, false);
        TabLayout tabLayout = (TabLayout) inflate.findViewById(R.id.track_selection_dialog_tab_layout);
        ViewPager viewPager = (ViewPager) inflate.findViewById(R.id.track_selection_dialog_view_pager);
        Button button = (Button) inflate.findViewById(R.id.track_selection_dialog_cancel_button);
        Button button2 = (Button) inflate.findViewById(R.id.track_selection_dialog_ok_button);
        viewPager.setAdapter(new a(p()));
        tabLayout.setupWithViewPager(viewPager);
        if (this.D0.size() <= 1) {
            i10 = 8;
        }
        tabLayout.setVisibility(i10);
        button.setOnClickListener(new bc.a(this));
        button2.setOnClickListener(new ec.a(this));
        return inflate;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.H0.onDismiss(dialogInterface);
    }

    public Dialog t0(Bundle bundle) {
        s sVar = new s(o(), R.style.TrackSelectionDialogThemeOverlay);
        sVar.setTitle(this.F0);
        return sVar;
    }
}
