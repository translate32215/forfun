package dev.pankaj.yacinetv.tvui.search;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.fragment.app.p;
import androidx.fragment.app.q;
import com.startapp.startappsdk.R;
import ud.k;

/* compiled from: SearchActivity.kt */
public final class SearchActivity extends q {
    public SearchFragment B;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_search);
        p F = F().F(R.id.search_fragment);
        if (F != null) {
            this.B = (SearchFragment) F;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type dev.pankaj.yacinetv.tvui.search.SearchFragment");
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 21) {
            SearchFragment searchFragment = this.B;
            if (searchFragment != null) {
                if (!(searchFragment.N0.e() > 0)) {
                    SearchFragment searchFragment2 = this.B;
                    if (searchFragment2 != null) {
                        searchFragment2.i0().findViewById(R.id.lb_search_bar).requestFocus();
                    } else {
                        k.l("mFragment");
                        throw null;
                    }
                }
            } else {
                k.l("mFragment");
                throw null;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public boolean onSearchRequested() {
        SearchFragment searchFragment = this.B;
        if (searchFragment != null) {
            if (searchFragment.N0.e() > 0) {
                startActivity(new Intent(this, SearchActivity.class));
            } else {
                SearchFragment searchFragment2 = this.B;
                if (searchFragment2 == null) {
                    k.l("mFragment");
                    throw null;
                } else if (searchFragment2.D0) {
                    searchFragment2.E0 = true;
                } else {
                    searchFragment2.f2063t0.d();
                }
            }
            return true;
        }
        k.l("mFragment");
        throw null;
    }
}
