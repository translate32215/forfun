package k8;

import java.util.Arrays;
import java.util.Comparator;
import n2.g;
import x.f;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class x implements Comparator<o> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f20538a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f20539b;

    public x(i iVar, g gVar) {
        this.f20538a = iVar;
        this.f20539b = gVar;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        o oVar = (o) obj;
        o oVar2 = (o) obj2;
        i iVar = this.f20538a;
        g gVar = this.f20539b;
        if (oVar instanceof s) {
            return !(oVar2 instanceof s) ? 1 : 0;
        }
        if (oVar2 instanceof s) {
            return -1;
        }
        if (iVar == null) {
            return oVar.q().compareTo(oVar2.q());
        }
        return (int) f.e(iVar.b(gVar, Arrays.asList(new o[]{oVar, oVar2})).a().doubleValue());
    }
}
