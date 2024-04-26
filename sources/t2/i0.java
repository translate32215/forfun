package t2;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.adcolony.sdk.d;
import com.adcolony.sdk.f;
import com.adcolony.sdk.g;
import com.adcolony.sdk.r0;
import org.json.JSONObject;

public class i0 extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public AudioManager f25483a;

    /* renamed from: b  reason: collision with root package name */
    public d f25484b;

    public i0(Handler handler, d dVar) {
        super(handler);
        Context context = f.f4478a;
        if (context != null) {
            this.f25483a = (AudioManager) context.getSystemService("audio");
            this.f25484b = dVar;
            context.getApplicationContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
        }
    }

    public boolean deliverSelfNotifications() {
        return false;
    }

    public void onChange(boolean z10) {
        d dVar;
        AudioManager audioManager = this.f25483a;
        if (audioManager != null && (dVar = this.f25484b) != null && dVar.f4463b != null) {
            double streamVolume = (double) ((((float) audioManager.getStreamVolume(3)) / 15.0f) * 100.0f);
            JSONObject jSONObject = new JSONObject();
            r0.d(jSONObject, "audio_percentage", streamVolume);
            r0.e(jSONObject, "ad_session_id", this.f25484b.f4463b.f4514t);
            r0.j(jSONObject, "id", this.f25484b.f4463b.f4512r);
            new g("AdContainer.on_audio_change", this.f25484b.f4463b.f4513s, jSONObject).b();
        }
    }
}
