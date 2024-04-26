package ve;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: Options */
public final class r extends AbstractList<i> implements RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public final i[] f26765a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f26766b;

    public r(i[] iVarArr, int[] iArr) {
        this.f26765a = iVarArr;
        this.f26766b = iArr;
    }

    public static void c(long j10, f fVar, int i10, List<i> list, int i11, int i12, List<Integer> list2) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        f fVar2;
        f fVar3 = fVar;
        int i18 = i10;
        List<i> list3 = list;
        int i19 = i11;
        int i20 = i12;
        List<Integer> list4 = list2;
        if (i19 < i20) {
            int i21 = i19;
            while (i21 < i20) {
                if (list3.get(i21).u() >= i18) {
                    i21++;
                } else {
                    throw new AssertionError();
                }
            }
            i iVar = list.get(i11);
            i iVar2 = list3.get(i20 - 1);
            if (i18 == iVar.u()) {
                int intValue = list4.get(i19).intValue();
                int i22 = i19 + 1;
                i13 = i22;
                i14 = intValue;
                iVar = list3.get(i22);
            } else {
                i14 = -1;
                i13 = i19;
            }
            long j11 = 4;
            if (iVar.m(i18) != iVar2.m(i18)) {
                int i23 = 1;
                for (int i24 = i13 + 1; i24 < i20; i24++) {
                    if (list3.get(i24 - 1).m(i18) != list3.get(i24).m(i18)) {
                        i23++;
                    }
                }
                long j12 = j10 + ((long) ((int) (fVar3.f26740b / 4))) + 2 + ((long) (i23 * 2));
                fVar3.t0(i23);
                fVar3.t0(i14);
                for (int i25 = i13; i25 < i20; i25++) {
                    byte m10 = list3.get(i25).m(i18);
                    if (i25 == i13 || m10 != list3.get(i25 - 1).m(i18)) {
                        fVar3.t0(m10 & 255);
                    }
                }
                f fVar4 = new f();
                int i26 = i13;
                while (i26 < i20) {
                    byte m11 = list3.get(i26).m(i18);
                    int i27 = i26 + 1;
                    int i28 = i27;
                    while (true) {
                        if (i28 >= i20) {
                            i16 = i20;
                            break;
                        } else if (m11 != list3.get(i28).m(i18)) {
                            i16 = i28;
                            break;
                        } else {
                            i28++;
                        }
                    }
                    if (i27 == i16 && i18 + 1 == list3.get(i26).u()) {
                        fVar3.t0(list4.get(i26).intValue());
                        i17 = i16;
                        fVar2 = fVar4;
                    } else {
                        fVar3.t0((int) ((((long) ((int) (fVar4.f26740b / j11))) + j12) * -1));
                        i17 = i16;
                        fVar2 = fVar4;
                        c(j12, fVar4, i18 + 1, list, i26, i16, list2);
                    }
                    fVar4 = fVar2;
                    i26 = i17;
                    j11 = 4;
                }
                f fVar5 = fVar4;
                fVar3.m(fVar5, fVar5.f26740b);
                return;
            }
            int i29 = 0;
            int min = Math.min(iVar.u(), iVar2.u());
            int i30 = i18;
            while (i30 < min && iVar.m(i30) == iVar2.m(i30)) {
                i29++;
                i30++;
            }
            long j13 = 1 + j10 + ((long) ((int) (fVar3.f26740b / 4))) + 2 + ((long) i29);
            fVar3.t0(-i29);
            fVar3.t0(i14);
            int i31 = i18;
            while (true) {
                i15 = i18 + i29;
                if (i31 >= i15) {
                    break;
                }
                fVar3.t0(iVar.m(i31) & 255);
                i31++;
            }
            if (i13 + 1 != i20) {
                f fVar6 = new f();
                fVar3.t0((int) ((((long) ((int) (fVar6.f26740b / 4))) + j13) * -1));
                c(j13, fVar6, i15, list, i13, i12, list2);
                fVar3.m(fVar6, fVar6.f26740b);
            } else if (i15 == list3.get(i13).u()) {
                fVar3.t0(list4.get(i13).intValue());
            } else {
                throw new AssertionError();
            }
        } else {
            throw new AssertionError();
        }
    }

    public static r f(i... iVarArr) {
        if (iVarArr.length == 0) {
            return new r(new i[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(iVarArr));
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList2.add(-1);
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.set(Collections.binarySearch(arrayList, iVarArr[i11]), Integer.valueOf(i11));
        }
        if (((i) arrayList.get(0)).u() != 0) {
            int i12 = 0;
            while (i12 < arrayList.size()) {
                i iVar = (i) arrayList.get(i12);
                int i13 = i12 + 1;
                int i14 = i13;
                while (i14 < arrayList.size()) {
                    i iVar2 = (i) arrayList.get(i14);
                    iVar2.getClass();
                    if (!iVar2.s(0, iVar, 0, iVar.u())) {
                        continue;
                        break;
                    } else if (iVar2.u() == iVar.u()) {
                        throw new IllegalArgumentException("duplicate option: " + iVar2);
                    } else if (((Integer) arrayList2.get(i14)).intValue() > ((Integer) arrayList2.get(i12)).intValue()) {
                        arrayList.remove(i14);
                        arrayList2.remove(i14);
                    } else {
                        i14++;
                    }
                }
                i12 = i13;
            }
            f fVar = new f();
            c(0, fVar, 0, arrayList, 0, arrayList.size(), arrayList2);
            int i15 = (int) (fVar.f26740b / 4);
            int[] iArr = new int[i15];
            for (int i16 = 0; i16 < i15; i16++) {
                iArr[i16] = fVar.readInt();
            }
            if (fVar.B()) {
                return new r((i[]) iVarArr.clone(), iArr);
            }
            throw new AssertionError();
        }
        throw new IllegalArgumentException("the empty byte string is not a supported option");
    }

    public Object get(int i10) {
        return this.f26765a[i10];
    }

    public final int size() {
        return this.f26765a.length;
    }
}
