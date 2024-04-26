package d5;

import androidx.appcompat.widget.z0;
import com.startapp.b4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import q.e;
import q5.a;
import t5.b;
import v6.e0;
import x4.b0;

/* compiled from: FlacStreamMetadata */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final int f13041a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13042b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13043c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13044d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13045e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13046f;

    /* renamed from: g  reason: collision with root package name */
    public final int f13047g;

    /* renamed from: h  reason: collision with root package name */
    public final int f13048h;

    /* renamed from: i  reason: collision with root package name */
    public final int f13049i;

    /* renamed from: j  reason: collision with root package name */
    public final long f13050j;

    /* renamed from: k  reason: collision with root package name */
    public final a f13051k;

    /* renamed from: l  reason: collision with root package name */
    public final q5.a f13052l;

    /* compiled from: FlacStreamMetadata */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final long[] f13053a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f13054b;

        public a(long[] jArr, long[] jArr2) {
            this.f13053a = jArr;
            this.f13054b = jArr2;
        }
    }

    public s(byte[] bArr, int i10) {
        b0 b0Var = new b0(bArr, 1, (e) null);
        b0Var.p(i10 * 8);
        this.f13041a = b0Var.i(16);
        this.f13042b = b0Var.i(16);
        this.f13043c = b0Var.i(24);
        this.f13044d = b0Var.i(24);
        int i11 = b0Var.i(20);
        this.f13045e = i11;
        this.f13046f = h(i11);
        this.f13047g = b0Var.i(3) + 1;
        int i12 = b0Var.i(5) + 1;
        this.f13048h = i12;
        this.f13049i = c(i12);
        this.f13050j = (e0.W(b0Var.i(4)) << 32) | e0.W(b0Var.i(32));
        this.f13051k = null;
        this.f13052l = null;
    }

    public static q5.a a(List<String> list, List<t5.a> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            String[] S = e0.S(str, "=");
            if (S.length != 2) {
                z0.a("Failed to parse Vorbis comment: ", str, "FlacStreamMetadata");
            } else {
                arrayList.add(new b(S[0], S[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new q5.a((List<? extends a.b>) arrayList);
    }

    public static int c(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int h(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public s b(a aVar) {
        return new s(this.f13041a, this.f13042b, this.f13043c, this.f13044d, this.f13045e, this.f13047g, this.f13048h, this.f13050j, aVar, this.f13052l);
    }

    public long d() {
        long j10 = this.f13050j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.f13045e);
    }

    public b0 e(byte[] bArr, q5.a aVar) {
        bArr[4] = b4.f10104d;
        int i10 = this.f13044d;
        if (i10 <= 0) {
            i10 = -1;
        }
        q5.a aVar2 = this.f13052l;
        if (aVar2 != null) {
            aVar = aVar2.b(aVar);
        }
        b0.b bVar = new b0.b();
        bVar.f27425k = "audio/flac";
        bVar.f27426l = i10;
        bVar.f27438x = this.f13047g;
        bVar.f27439y = this.f13045e;
        bVar.f27427m = Collections.singletonList(bArr);
        bVar.f27423i = aVar;
        return bVar.a();
    }

    public q5.a f(q5.a aVar) {
        q5.a aVar2 = this.f13052l;
        return aVar2 == null ? aVar : aVar2.b(aVar);
    }

    public long g(long j10) {
        return e0.j((j10 * ((long) this.f13045e)) / 1000000, 0, this.f13050j - 1);
    }

    public s(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, q5.a aVar2) {
        this.f13041a = i10;
        this.f13042b = i11;
        this.f13043c = i12;
        this.f13044d = i13;
        this.f13045e = i14;
        this.f13046f = h(i14);
        this.f13047g = i15;
        this.f13048h = i16;
        this.f13049i = c(i16);
        this.f13050j = j10;
        this.f13051k = aVar;
        this.f13052l = aVar2;
    }
}
