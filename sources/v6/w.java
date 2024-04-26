package v6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import r6.e;

/* compiled from: SlidingPercentile */
public class w {

    /* renamed from: h  reason: collision with root package name */
    public static final Comparator<b> f26521h = r6.b.f24563c;

    /* renamed from: i  reason: collision with root package name */
    public static final Comparator<b> f26522i = e.f24573c;

    /* renamed from: a  reason: collision with root package name */
    public final int f26523a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f26524b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final b[] f26525c = new b[5];

    /* renamed from: d  reason: collision with root package name */
    public int f26526d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f26527e;

    /* renamed from: f  reason: collision with root package name */
    public int f26528f;

    /* renamed from: g  reason: collision with root package name */
    public int f26529g;

    /* compiled from: SlidingPercentile */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f26530a;

        /* renamed from: b  reason: collision with root package name */
        public int f26531b;

        /* renamed from: c  reason: collision with root package name */
        public float f26532c;

        public b() {
        }

        public b(a aVar) {
        }
    }

    public w(int i10) {
        this.f26523a = i10;
    }

    public void a(int i10, float f10) {
        b bVar;
        if (this.f26526d != 1) {
            Collections.sort(this.f26524b, f26521h);
            this.f26526d = 1;
        }
        int i11 = this.f26529g;
        if (i11 > 0) {
            b[] bVarArr = this.f26525c;
            int i12 = i11 - 1;
            this.f26529g = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b((a) null);
        }
        int i13 = this.f26527e;
        this.f26527e = i13 + 1;
        bVar.f26530a = i13;
        bVar.f26531b = i10;
        bVar.f26532c = f10;
        this.f26524b.add(bVar);
        this.f26528f += i10;
        while (true) {
            int i14 = this.f26528f;
            int i15 = this.f26523a;
            if (i14 > i15) {
                int i16 = i14 - i15;
                b bVar2 = this.f26524b.get(0);
                int i17 = bVar2.f26531b;
                if (i17 <= i16) {
                    this.f26528f -= i17;
                    this.f26524b.remove(0);
                    int i18 = this.f26529g;
                    if (i18 < 5) {
                        b[] bVarArr2 = this.f26525c;
                        this.f26529g = i18 + 1;
                        bVarArr2[i18] = bVar2;
                    }
                } else {
                    bVar2.f26531b = i17 - i16;
                    this.f26528f -= i16;
                }
            } else {
                return;
            }
        }
    }

    public float b(float f10) {
        if (this.f26526d != 0) {
            Collections.sort(this.f26524b, f26522i);
            this.f26526d = 0;
        }
        float f11 = f10 * ((float) this.f26528f);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f26524b.size(); i11++) {
            b bVar = this.f26524b.get(i11);
            i10 += bVar.f26531b;
            if (((float) i10) >= f11) {
                return bVar.f26532c;
            }
        }
        if (this.f26524b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<b> arrayList = this.f26524b;
        return arrayList.get(arrayList.size() - 1).f26532c;
    }
}
