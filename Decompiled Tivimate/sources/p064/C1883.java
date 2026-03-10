package p064;

import java.util.Map;

/* JADX INFO: renamed from: ʽᴵ.ʻٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C1883 implements Map.Entry {

    /* JADX INFO: renamed from: ʽʽ */
    public C1883 f6422;

    /* JADX INFO: renamed from: ʾˋ */
    public C1883 f6423;

    /* JADX INFO: renamed from: ˈٴ */
    public C1883 f6424;

    /* JADX INFO: renamed from: ˉٴ */
    public Object f6425;

    /* JADX INFO: renamed from: ˊʻ */
    public final Object f6426;

    /* JADX INFO: renamed from: ٴᵢ */
    public final int f6427;

    /* JADX INFO: renamed from: ᴵˊ */
    public C1883 f6428;

    /* JADX INFO: renamed from: ᴵᵔ */
    public C1883 f6429;

    /* JADX INFO: renamed from: ᵎⁱ */
    public int f6430;

    public C1883() {
        this.f6426 = null;
        this.f6427 = -1;
        this.f6429 = this;
        this.f6424 = this;
    }

    public C1883(C1883 r1, Object r2, int r3, C1883 r4, C1883 r5) {
        this.f6423 = r1;
        this.f6426 = r2;
        this.f6427 = r3;
        this.f6430 = 1;
        this.f6424 = r4;
        this.f6429 = r5;
        r5.f6424 = this;
        r4.f6429 = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object r4) {
        if ((r4 instanceof Map.Entry) == false) goto L20;
        Map.Entry r42 = (Map.Entry) r4;
        Object r0 = this.f6426;
        if (r0 != null) goto L10;
        if (r42.getKey() != null) goto L20;
    L11:
        Object r02 = this.f6425;
        if (r02 != null) goto L17;
        if (r42.getValue() != null) goto L20;
        return true;
    L17:
        if (r02.equals(r42.getValue()) == false) goto L20;
        return true;
    L10:
        if (r0.equals(r42.getKey()) == true) goto L11;
    L20:
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f6426;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f6425;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int r0 = 0;
        Object r1 = this.f6426;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        Object r2 = this.f6425;
        if (r2 == null) goto L11;
        r0 = r2.hashCode();
    L11:
        return r0 ^ r12;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object r2) {
        Object r0 = this.f6425;
        this.f6425 = r2;
        return r0;
    }

    public final String toString() {
        return this.f6426 + "=" + this.f6425;
    }
}
