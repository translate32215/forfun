package f;

import android.view.View;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertController */
public class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f17860a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f17861b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AlertController f17862c;

    public d(AlertController alertController, View view, View view2) {
        this.f17862c = alertController;
        this.f17860a = view;
        this.f17861b = view2;
    }

    public void run() {
        AlertController.c(this.f17862c.A, this.f17860a, this.f17861b);
    }
}
