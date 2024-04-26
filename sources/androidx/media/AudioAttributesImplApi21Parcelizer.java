package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.a;

public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f2746a = (AudioAttributes) aVar.m(audioAttributesImplApi21.f2746a, 1);
        audioAttributesImplApi21.f2747b = aVar.k(audioAttributesImplApi21.f2747b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, a aVar) {
        aVar.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.f2746a;
        aVar.p(1);
        aVar.u(audioAttributes);
        int i10 = audioAttributesImplApi21.f2747b;
        aVar.p(2);
        aVar.t(i10);
    }
}
