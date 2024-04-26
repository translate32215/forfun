package o2;

import t1.b;
import t1.e;

/* compiled from: WorkNameDao_Impl */
public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    public final e f22862a;

    /* renamed from: b  reason: collision with root package name */
    public final b f22863b;

    /* compiled from: WorkNameDao_Impl */
    public class a extends b<g> {
        public a(i iVar, e eVar) {
            super(eVar);
        }

        public String b() {
            return "INSERT OR IGNORE INTO `WorkName`(`name`,`work_spec_id`) VALUES (?,?)";
        }

        public void d(y1.e eVar, Object obj) {
            g gVar = (g) obj;
            String str = gVar.f22860a;
            if (str == null) {
                eVar.f27989a.bindNull(1);
            } else {
                eVar.f27989a.bindString(1, str);
            }
            String str2 = gVar.f22861b;
            if (str2 == null) {
                eVar.f27989a.bindNull(2);
            } else {
                eVar.f27989a.bindString(2, str2);
            }
        }
    }

    public i(e eVar) {
        this.f22862a = eVar;
        this.f22863b = new a(this, eVar);
    }
}
