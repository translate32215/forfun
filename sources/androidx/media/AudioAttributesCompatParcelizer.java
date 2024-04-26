package androidx.media;

import androidx.versionedparcelable.a;

public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        Object obj = audioAttributesCompat.f2745a;
        if (aVar.i(1)) {
            obj = aVar.o();
        }
        audioAttributesCompat.f2745a = (AudioAttributesImpl) obj;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, a aVar) {
        aVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f2745a;
        aVar.p(1);
        aVar.w(audioAttributesImpl);
    }
}
