package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.a;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(a aVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f2746a = (AudioAttributes) aVar.m(audioAttributesImplApi26.f2746a, 1);
        audioAttributesImplApi26.f2747b = aVar.k(audioAttributesImplApi26.f2747b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, a aVar) {
        aVar.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi26.f2746a;
        aVar.p(1);
        aVar.u(audioAttributes);
        int i10 = audioAttributesImplApi26.f2747b;
        aVar.p(2);
        aVar.t(i10);
    }
}
