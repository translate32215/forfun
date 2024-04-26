package f;

import android.view.View;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertController */
public class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f17865a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f17866b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AlertController f17867c;

    public f(AlertController alertController, View view, View view2) {
        this.f17867c = alertController;
        this.f17865a = view;
        this.f17866b = view2;
    }

    public void run() {
        AlertController.c(this.f17867c.f398g, this.f17865a, this.f17866b);
    }
}
