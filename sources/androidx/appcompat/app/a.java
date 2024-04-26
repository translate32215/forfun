package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertController */
public class a implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AlertController f438a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AlertController.b f439b;

    public a(AlertController.b bVar, AlertController alertController) {
        this.f439b = bVar;
        this.f438a = alertController;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f439b.f433m.onClick(this.f438a.f393b, i10);
        if (!this.f439b.f435o) {
            this.f438a.f393b.dismiss();
        }
    }
}
