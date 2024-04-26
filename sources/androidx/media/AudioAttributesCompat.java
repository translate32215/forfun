package androidx.media;

import android.util.SparseIntArray;
import d2.c;

public class AudioAttributesCompat implements c {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f2744b = 0;

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributesImpl f2745a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f2745a;
        if (audioAttributesImpl != null) {
            return audioAttributesImpl.equals(audioAttributesCompat.f2745a);
        }
        if (audioAttributesCompat.f2745a == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f2745a.hashCode();
    }

    public String toString() {
        return this.f2745a.toString();
    }
}
