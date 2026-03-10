package p041;

import java.util.Iterator;
import p447.C5625;
import p447.C5634;
import ʽˋ.ـˆ;

/* JADX INFO: renamed from: ʼᴵ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C1607 implements InterfaceC1613 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final Object f5328;

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f5329;

    public /* synthetic */ C1607(int r1, Object r2) {
        this.f5329 = r1;
        this.f5328 = r2;
    }

    public C1607(ـˆ r2) {
        this.f5329 = 0;
        C5634 r0 = C5634.f20367;
        this.f5328 = r2;
    }

    @Override // p041.InterfaceC1613
    public final Iterator iterator() {
        switch(this.f5329) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return new C5625((CharSequence) this.f5328);
    L7:
        return ((Iterable) this.f5328).iterator();
    L9:
        return (Iterator) this.f5328;
    L11:
        return new C1606(this);
    }
}
