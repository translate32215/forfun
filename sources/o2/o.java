package o2;

import t1.b;
import t1.e;

/* compiled from: WorkTagDao_Impl */
public final class o implements n {

    /* renamed from: a  reason: collision with root package name */
    public final e f22893a;

    /* renamed from: b  reason: collision with root package name */
    public final b f22894b;

    /* compiled from: WorkTagDao_Impl */
    public class a extends b<m> {
        public a(o oVar, e eVar) {
            super(eVar);
        }

        public String b() {
            return "INSERT OR IGNORE INTO `WorkTag`(`tag`,`work_spec_id`) VALUES (?,?)";
        }

        public void d(y1.e eVar, Object obj) {
            m mVar = (m) obj;
            String str = mVar.f22891a;
            if (str == null) {
                eVar.f27989a.bindNull(1);
            } else {
                eVar.f27989a.bindString(1, str);
            }
            String str2 = mVar.f22892b;
            if (str2 == null) {
                eVar.f27989a.bindNull(2);
            } else {
                eVar.f27989a.bindString(2, str2);
            }
        }
    }

    public o(e eVar) {
        this.f22893a = eVar;
        this.f22894b = new a(this, eVar);
    }
}
