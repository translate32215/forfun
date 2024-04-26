package j6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.text.Layout;
import android.util.Log;
import android.util.SparseArray;
import d5.b0;
import h6.b;
import h6.c;
import h6.e;
import j6.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: DvbDecoder */
public final class a extends c {

    /* renamed from: n  reason: collision with root package name */
    public final b f19570n;

    public a(List<byte[]> list) {
        super("DvbDecoder");
        byte[] bArr = list.get(0);
        int length = bArr.length;
        int i10 = 0 + 1;
        int i11 = i10 + 1;
        this.f19570n = new b(((bArr[0] & 255) << 8) | (bArr[i10] & 255), (bArr[i11 + 1] & 255) | ((bArr[i11] & 255) << 8));
    }

    public e k(byte[] bArr, int i10, boolean z10) {
        i6.e eVar;
        i6.e eVar2;
        List list;
        int i11;
        int i12;
        i6.e eVar3;
        SparseArray<b.g> sparseArray;
        SparseArray<b.e> sparseArray2;
        int[] iArr;
        b.f fVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if (z10) {
            b.h hVar = this.f19570n.f19579f;
            hVar.f19614c.clear();
            hVar.f19615d.clear();
            hVar.f19616e.clear();
            hVar.f19617f.clear();
            hVar.f19618g.clear();
            hVar.f19619h = null;
            hVar.f19620i = null;
        }
        b bVar = this.f19570n;
        bVar.getClass();
        b0 b0Var = new b0(bArr, i10);
        while (b0Var.b() >= 48 && b0Var.i(8) == 15) {
            b.h hVar2 = bVar.f19579f;
            int i19 = b0Var.i(8);
            int i20 = 16;
            int i21 = b0Var.i(16);
            int i22 = b0Var.i(16);
            int f10 = b0Var.f() + i22;
            if (i22 * 8 > b0Var.b()) {
                Log.w("DvbParser", "Data field length exceeds limit");
                b0Var.s(b0Var.b());
            } else {
                switch (i19) {
                    case 16:
                        if (i21 == hVar2.f19612a) {
                            b.d dVar = hVar2.f19620i;
                            int i23 = 8;
                            int i24 = b0Var.i(8);
                            int i25 = b0Var.i(4);
                            int i26 = b0Var.i(2);
                            b0Var.s(2);
                            int i27 = i22 - 2;
                            SparseArray sparseArray3 = new SparseArray();
                            while (i27 > 0) {
                                int i28 = b0Var.i(i23);
                                b0Var.s(i23);
                                i27 -= 6;
                                sparseArray3.put(i28, new b.e(b0Var.i(16), b0Var.i(16)));
                                i23 = 8;
                            }
                            b.d dVar2 = new b.d(i24, i25, i26, sparseArray3);
                            if (i26 == 0) {
                                if (!(dVar == null || dVar.f19595a == i25)) {
                                    hVar2.f19620i = dVar2;
                                    break;
                                }
                            } else {
                                hVar2.f19620i = dVar2;
                                hVar2.f19614c.clear();
                                hVar2.f19615d.clear();
                                hVar2.f19616e.clear();
                                break;
                            }
                        }
                        break;
                    case 17:
                        b.d dVar3 = hVar2.f19620i;
                        if (i21 == hVar2.f19612a && dVar3 != null) {
                            int i29 = b0Var.i(8);
                            b0Var.s(4);
                            boolean h10 = b0Var.h();
                            b0Var.s(3);
                            int i30 = b0Var.i(16);
                            int i31 = b0Var.i(16);
                            int i32 = b0Var.i(3);
                            int i33 = b0Var.i(3);
                            b0Var.s(2);
                            int i34 = b0Var.i(8);
                            int i35 = b0Var.i(8);
                            int i36 = b0Var.i(4);
                            int i37 = b0Var.i(2);
                            b0Var.s(2);
                            int i38 = i22 - 10;
                            SparseArray sparseArray4 = new SparseArray();
                            while (i38 > 0) {
                                int i39 = b0Var.i(i20);
                                int i40 = b0Var.i(2);
                                int i41 = b0Var.i(2);
                                int i42 = b0Var.i(12);
                                b0Var.s(4);
                                int i43 = b0Var.i(12);
                                i38 -= 6;
                                if (i40 == 1 || i40 == 2) {
                                    i38 -= 2;
                                    i14 = b0Var.i(8);
                                    i13 = b0Var.i(8);
                                } else {
                                    i14 = 0;
                                    i13 = 0;
                                }
                                sparseArray4.put(i39, new b.g(i40, i41, i42, i43, i14, i13));
                                i20 = 16;
                            }
                            b.f fVar2 = new b.f(i29, h10, i30, i31, i32, i33, i34, i35, i36, i37, sparseArray4);
                            if (dVar3.f19596b == 0 && (fVar = hVar2.f19614c.get(i29)) != null) {
                                SparseArray<b.g> sparseArray5 = fVar.f19609j;
                                for (int i44 = 0; i44 < sparseArray5.size(); i44++) {
                                    fVar2.f19609j.put(sparseArray5.keyAt(i44), sparseArray5.valueAt(i44));
                                }
                            }
                            hVar2.f19614c.put(fVar2.f19600a, fVar2);
                            break;
                        }
                    case 18:
                        if (i21 != hVar2.f19612a) {
                            if (i21 == hVar2.f19613b) {
                                b.a f11 = b.f(b0Var, i22);
                                hVar2.f19617f.put(f11.f19581a, f11);
                                break;
                            }
                        } else {
                            b.a f12 = b.f(b0Var, i22);
                            hVar2.f19615d.put(f12.f19581a, f12);
                            break;
                        }
                        break;
                    case 19:
                        if (i21 != hVar2.f19612a) {
                            if (i21 == hVar2.f19613b) {
                                b.c g10 = b.g(b0Var);
                                hVar2.f19618g.put(g10.f19591a, g10);
                                break;
                            }
                        } else {
                            b.c g11 = b.g(b0Var);
                            hVar2.f19616e.put(g11.f19591a, g11);
                            break;
                        }
                        break;
                    case 20:
                        if (i21 == hVar2.f19612a) {
                            b0Var.s(4);
                            boolean h11 = b0Var.h();
                            b0Var.s(3);
                            int i45 = b0Var.i(16);
                            int i46 = b0Var.i(16);
                            if (h11) {
                                int i47 = b0Var.i(16);
                                i17 = b0Var.i(16);
                                i16 = b0Var.i(16);
                                i15 = b0Var.i(16);
                                i18 = i47;
                            } else {
                                i17 = i45;
                                i15 = i46;
                                i18 = 0;
                                i16 = 0;
                            }
                            hVar2.f19619h = new b.C0167b(i45, i46, i18, i17, i16, i15);
                            break;
                        }
                        break;
                }
                b0Var.t(f10 - b0Var.f());
            }
        }
        b.h hVar3 = bVar.f19579f;
        b.d dVar4 = hVar3.f19620i;
        if (dVar4 == null) {
            list = Collections.emptyList();
            eVar2 = eVar;
        } else {
            b.C0167b bVar2 = hVar3.f19619h;
            if (bVar2 == null) {
                bVar2 = bVar.f19577d;
            }
            Bitmap bitmap = bVar.f19580g;
            if (!(bitmap != null && bVar2.f19585a + 1 == bitmap.getWidth() && bVar2.f19586b + 1 == bVar.f19580g.getHeight())) {
                Bitmap createBitmap = Bitmap.createBitmap(bVar2.f19585a + 1, bVar2.f19586b + 1, Bitmap.Config.ARGB_8888);
                bVar.f19580g = createBitmap;
                bVar.f19576c.setBitmap(createBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray<b.e> sparseArray6 = dVar4.f19597c;
            int i48 = 0;
            while (i48 < sparseArray6.size()) {
                bVar.f19576c.save();
                b.e valueAt = sparseArray6.valueAt(i48);
                b.f fVar3 = bVar.f19579f.f19614c.get(sparseArray6.keyAt(i48));
                int i49 = valueAt.f19598a + bVar2.f19587c;
                int i50 = valueAt.f19599b + bVar2.f19589e;
                bVar.f19576c.clipRect(i49, i50, Math.min(fVar3.f19602c + i49, bVar2.f19588d), Math.min(fVar3.f19603d + i50, bVar2.f19590f));
                b.a aVar = bVar.f19579f.f19615d.get(fVar3.f19605f);
                if (aVar == null && (aVar = bVar.f19579f.f19617f.get(fVar3.f19605f)) == null) {
                    aVar = bVar.f19578e;
                }
                SparseArray<b.g> sparseArray7 = fVar3.f19609j;
                int i51 = 0;
                while (i51 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i51);
                    b.g valueAt2 = sparseArray7.valueAt(i51);
                    b.c cVar = bVar.f19579f.f19616e.get(keyAt);
                    if (cVar == null) {
                        cVar = bVar.f19579f.f19618g.get(keyAt);
                    }
                    if (cVar != null) {
                        Paint paint = cVar.f19592b ? null : bVar.f19574a;
                        int i52 = fVar3.f19604e;
                        sparseArray2 = sparseArray6;
                        int i53 = valueAt2.f19610a + i49;
                        int i54 = valueAt2.f19611b + i50;
                        sparseArray = sparseArray7;
                        Canvas canvas = bVar.f19576c;
                        eVar3 = eVar;
                        if (i52 == 3) {
                            iArr = aVar.f19584d;
                        } else if (i52 == 2) {
                            iArr = aVar.f19583c;
                        } else {
                            iArr = aVar.f19582b;
                        }
                        i12 = i48;
                        int[] iArr2 = iArr;
                        int i55 = i52;
                        int i56 = i53;
                        Paint paint2 = paint;
                        Canvas canvas2 = canvas;
                        b.e(cVar.f19593c, iArr2, i55, i56, i54, paint2, canvas2);
                        b.e(cVar.f19594d, iArr2, i55, i56, i54 + 1, paint2, canvas2);
                    } else {
                        eVar3 = eVar;
                        sparseArray2 = sparseArray6;
                        i12 = i48;
                        sparseArray = sparseArray7;
                    }
                    i51++;
                    sparseArray6 = sparseArray2;
                    sparseArray7 = sparseArray;
                    eVar = eVar3;
                    i48 = i12;
                }
                i6.e eVar4 = eVar;
                SparseArray<b.e> sparseArray8 = sparseArray6;
                int i57 = i48;
                if (fVar3.f19601b) {
                    int i58 = fVar3.f19604e;
                    if (i58 == 3) {
                        i11 = aVar.f19584d[fVar3.f19606g];
                    } else if (i58 == 2) {
                        i11 = aVar.f19583c[fVar3.f19607h];
                    } else {
                        i11 = aVar.f19582b[fVar3.f19608i];
                    }
                    bVar.f19575b.setColor(i11);
                    bVar.f19576c.drawRect((float) i49, (float) i50, (float) (fVar3.f19602c + i49), (float) (fVar3.f19603d + i50), bVar.f19575b);
                }
                Bitmap createBitmap2 = Bitmap.createBitmap(bVar.f19580g, i49, i50, fVar3.f19602c, fVar3.f19603d);
                float f13 = (float) bVar2.f19585a;
                float f14 = (float) bVar2.f19586b;
                arrayList.add(new h6.b((CharSequence) null, (Layout.Alignment) null, createBitmap2, ((float) i50) / f14, 0, 0, ((float) i49) / f13, 0, Integer.MIN_VALUE, -3.4028235E38f, ((float) fVar3.f19602c) / f13, ((float) fVar3.f19603d) / f14, false, -16777216, Integer.MIN_VALUE, 0.0f, (b.a) null));
                bVar.f19576c.drawColor(0, PorterDuff.Mode.CLEAR);
                bVar.f19576c.restore();
                i48 = i57 + 1;
                sparseArray6 = sparseArray8;
                eVar = eVar4;
            }
            eVar2 = eVar;
            list = Collections.unmodifiableList(arrayList);
        }
        return new i6.e(list, 1);
    }
}
