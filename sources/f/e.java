package f;

import android.view.View;
import android.widget.AbsListView;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertController */
public class e implements AbsListView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f17863a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f17864b;

    public e(AlertController alertController, View view, View view2) {
        this.f17863a = view;
        this.f17864b = view2;
    }

    public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        AlertController.c(absListView, this.f17863a, this.f17864b);
    }

    public void onScrollStateChanged(AbsListView absListView, int i10) {
    }
}
