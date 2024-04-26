package dev.pankaj.yacinetv.tvui.main;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.q;
import com.startapp.startappsdk.R;
import dev.pankaj.yacinetv.app.MainApp;
import dev.pankaj.yacinetv.tvui.search.SearchActivity;
import n7.f;
import n7.h;

/* compiled from: MainActivity.kt */
public final class MainActivity extends q {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_main_tv);
        h e10 = MainApp.l().e();
        e10.o("&cd", "TV");
        e10.i(new f().a());
    }

    public boolean onSearchRequested() {
        startActivity(new Intent(this, SearchActivity.class));
        return true;
    }
}
