package x8;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: BottomAppBar */
public class b extends FloatingActionButton.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27871a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f27872b;

    /* compiled from: BottomAppBar */
    public class a extends FloatingActionButton.a {
        public a() {
        }

        public void b(FloatingActionButton floatingActionButton) {
            BottomAppBar.z(b.this.f27872b);
        }
    }

    public b(BottomAppBar bottomAppBar, int i10) {
        this.f27872b = bottomAppBar;
        this.f27871a = i10;
    }

    public void a(FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.f27872b.D(this.f27871a));
        floatingActionButton.m(new a(), true);
    }
}
