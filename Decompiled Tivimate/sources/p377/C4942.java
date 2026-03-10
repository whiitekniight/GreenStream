package p377;

import java.util.HashMap;

/* JADX INFO: renamed from: ᵔﹳ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C4942 extends C4943 {

    /* JADX INFO: renamed from: ᴵᵔ */
    public final HashMap f17626;

    public C4942() {
        this.f17626 = new HashMap();
    }

    @Override // p377.C4943
    /* JADX INFO: renamed from: ⁱˊ */
    public final Object mo9722(Object r3) {
        Object r0 = super.mo9722(r3);
        this.f17626.remove(r3);
        return r0;
    }

    @Override // p377.C4943
    /* JADX INFO: renamed from: ﹳٴ */
    public final C4938 mo9723(Object r2) {
        return (C4938) this.f17626.get(r2);
    }
}
