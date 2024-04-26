package androidx.media;

import androidx.versionedparcelable.a;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f2748a = aVar.k(audioAttributesImplBase.f2748a, 1);
        audioAttributesImplBase.f2749b = aVar.k(audioAttributesImplBase.f2749b, 2);
        audioAttributesImplBase.f2750c = aVar.k(audioAttributesImplBase.f2750c, 3);
        audioAttributesImplBase.f2751d = aVar.k(audioAttributesImplBase.f2751d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.getClass();
        int i10 = audioAttributesImplBase.f2748a;
        aVar.p(1);
        aVar.t(i10);
        int i11 = audioAttributesImplBase.f2749b;
        aVar.p(2);
        aVar.t(i11);
        int i12 = audioAttributesImplBase.f2750c;
        aVar.p(3);
        aVar.t(i12);
        int i13 = audioAttributesImplBase.f2751d;
        aVar.p(4);
        aVar.t(i13);
    }
}
