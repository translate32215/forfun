package d9;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* compiled from: Chip */
public class a extends ViewOutlineProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Chip f13218a;

    public a(Chip chip) {
        this.f13218a = chip;
    }

    @TargetApi(21)
    public void getOutline(View view, Outline outline) {
        com.google.android.material.chip.a aVar = this.f13218a.f9071e;
        if (aVar != null) {
            aVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
