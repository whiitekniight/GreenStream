package p005j$.util;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: j$.util.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C1230u extends C0960o implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    private Object writeReplace() {
        return new C0960o(this.f3619b);
    }

    @Override // p005j$.util.C0960o, java.util.List
    public final List subList(int r3, int r4) {
        return new C1230u(this.f3619b.subList(r3, r4));
    }
}
