package o6;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import h6.b;
import h6.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import v6.e0;

/* compiled from: TtmlSubtitle */
public final class g implements e {

    /* renamed from: a  reason: collision with root package name */
    public final d f23079a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f23080b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, f> f23081c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, e> f23082d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, String> f23083e;

    public g(d dVar, Map<String, f> map, Map<String, e> map2, Map<String, String> map3) {
        this.f23079a = dVar;
        this.f23082d = map2;
        this.f23083e = map3;
        this.f23081c = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        dVar.e(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        this.f23080b = jArr;
    }

    public int a(long j10) {
        int b10 = e0.b(this.f23080b, j10, false, false);
        if (b10 < this.f23080b.length) {
            return b10;
        }
        return -1;
    }

    public long b(int i10) {
        return this.f23080b[i10];
    }

    public List<b> c(long j10) {
        d dVar = this.f23079a;
        Map<String, f> map = this.f23081c;
        Map<String, e> map2 = this.f23082d;
        Map<String, String> map3 = this.f23083e;
        dVar.getClass();
        ArrayList arrayList = new ArrayList();
        dVar.h(j10, dVar.f23045h, arrayList);
        TreeMap treeMap = new TreeMap();
        d dVar2 = dVar;
        long j11 = j10;
        dVar2.j(j11, false, dVar.f23045h, treeMap);
        dVar2.i(j11, map, map2, dVar.f23045h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                e eVar = map2.get(pair.first);
                eVar.getClass();
                arrayList2.add(new b((CharSequence) null, (Layout.Alignment) null, decodeByteArray, eVar.f23053c, 0, eVar.f23055e, eVar.f23052b, 0, Integer.MIN_VALUE, -3.4028235E38f, eVar.f23056f, eVar.f23057g, false, -16777216, eVar.f23060j, 0.0f, (b.a) null));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = map2.get(entry.getKey());
            eVar2.getClass();
            b.C0156b bVar = (b.C0156b) entry.getValue();
            CharSequence charSequence = bVar.f18938a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
            }
            for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i11 = i10 + 1;
                    int i12 = i11;
                    while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                        i12++;
                    }
                    int i13 = i12 - i11;
                    if (i13 > 0) {
                        spannableStringBuilder.delete(i10, i13 + i10);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
                if (spannableStringBuilder.charAt(i14) == 10) {
                    int i15 = i14 + 1;
                    if (spannableStringBuilder.charAt(i15) == ' ') {
                        spannableStringBuilder.delete(i15, i14 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
                if (spannableStringBuilder.charAt(i16) == ' ') {
                    int i17 = i16 + 1;
                    if (spannableStringBuilder.charAt(i17) == 10) {
                        spannableStringBuilder.delete(i16, i17);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == 10) {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f10 = eVar2.f23053c;
            int i18 = eVar2.f23054d;
            bVar.f18941d = f10;
            bVar.f18942e = i18;
            bVar.f18943f = eVar2.f23055e;
            bVar.f18944g = eVar2.f23052b;
            bVar.f18948k = eVar2.f23056f;
            float f11 = eVar2.f23059i;
            int i19 = eVar2.f23058h;
            bVar.f18947j = f11;
            bVar.f18946i = i19;
            bVar.f18952o = eVar2.f23060j;
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }

    public int f() {
        return this.f23080b.length;
    }
}
