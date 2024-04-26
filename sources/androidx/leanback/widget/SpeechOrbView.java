package androidx.leanback.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.leanback.widget.SearchOrbView;
import com.startapp.startappsdk.R;

public class SpeechOrbView extends SearchOrbView {
    public final float A;
    public SearchOrbView.c B;
    public SearchOrbView.c C;
    public int D = 0;
    public boolean E = false;

    public SpeechOrbView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.A = resources.getFraction(R.fraction.lb_search_bar_speech_orb_max_level_zoom, 1, 1);
        this.C = new SearchOrbView.c(resources.getColor(R.color.lb_speech_orb_not_recording), resources.getColor(R.color.lb_speech_orb_not_recording_pulsed), resources.getColor(R.color.lb_speech_orb_not_recording_icon));
        this.B = new SearchOrbView.c(resources.getColor(R.color.lb_speech_orb_recording), resources.getColor(R.color.lb_speech_orb_recording), 0);
        d();
    }

    public void d() {
        setOrbColors(this.C);
        setOrbIcon(getResources().getDrawable(R.drawable.lb_ic_search_mic_out));
        a(hasFocus());
        b(1.0f);
        this.E = false;
    }

    public int getLayoutResourceId() {
        return R.layout.lb_speech_orb;
    }

    public void setListeningOrbColors(SearchOrbView.c cVar) {
        this.B = cVar;
    }

    public void setNotListeningOrbColors(SearchOrbView.c cVar) {
        this.C = cVar;
    }

    public void setSoundLevel(int i10) {
        if (this.E) {
            int i11 = this.D;
            if (i10 > i11) {
                this.D = ((i10 - i11) / 2) + i11;
            } else {
                this.D = (int) (((float) i11) * 0.7f);
            }
            b((((this.A - getFocusedZoom()) * ((float) this.D)) / 100.0f) + 1.0f);
        }
    }
}
