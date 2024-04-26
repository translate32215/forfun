package androidx.media;

import android.media.AudioAttributes;
import android.support.v4.media.a;

public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributes f2746a;

    /* renamed from: b  reason: collision with root package name */
    public int f2747b = -1;

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f2746a.equals(((AudioAttributesImplApi21) obj).f2746a);
    }

    public int hashCode() {
        return this.f2746a.hashCode();
    }

    public String toString() {
        StringBuilder a10 = a.a("AudioAttributesCompat: audioattributes=");
        a10.append(this.f2746a);
        return a10.toString();
    }
}
