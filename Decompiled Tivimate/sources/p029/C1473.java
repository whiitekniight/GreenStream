package p029;

import java.io.Serializable;

/* JADX INFO: renamed from: ʼʻ.ᴵᵔ */
/* JADX INFO: loaded from: classes.dex */
public final class C1473 extends AbstractC1447 implements Serializable {

    /* JADX INFO: renamed from: ʾˋ */
    public final Object f4913;

    /* JADX INFO: renamed from: ᴵˊ */
    public final Object f4914;

    public C1473(Object r1, Object r2) {
        this.f4913 = r1;
        this.f4914 = r2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4913;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4914;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object r1) {
        throw new UnsupportedOperationException();
    }
}
