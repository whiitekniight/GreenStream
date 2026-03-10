package p022;

import p250.InterfaceC3686;

/* JADX INFO: renamed from: ʻٴ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public class C1326 implements InterfaceC3686 {

    /* JADX INFO: renamed from: ʾˋ */
    public final Object[] f4541;

    /* JADX INFO: renamed from: ᴵˊ */
    public int f4542;

    public C1326() {
        this.f4541 = new Object[256];
    }

    public C1326(int r2) {
        if (r2 <= 0) goto L7;
        this.f4541 = new Object[r2];
        return;
    L7:
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // p250.InterfaceC3686
    /* JADX INFO: renamed from: ˑﹳ */
    public boolean mo3725(Object r7) {
        int r0 = this.f4542;
        int r2 = 0;
    L3:
        Object[] r3 = this.f4541;
        if (r2 >= r0) goto L9;
        if (r3[r2] == r7) goto L7;
        r2 = r2 + 1;
        goto L3
    L7:
        boolean r02 = true;
    L10:
        if (r02 == true) goto L17;
        int r03 = this.f4542;
        if (r03 >= r3.length) goto L15;
        r3[r03] = r7;
        this.f4542 = r03 + 1;
        return true;
    L15:
        return false;
    L17:
        throw new IllegalStateException("Already in the pool!");
    L9:
        r02 = false;
        goto L10
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public void m3726(C1329 r4) {
        int r0 = this.f4542;
        Object[] r1 = this.f4541;
        if (r0 >= r1.length) goto L6;
        r1[r0] = r4;
        this.f4542 = r0 + 1;
        return;
    }

    @Override // p250.InterfaceC3686
    /* JADX INFO: renamed from: ﾞᴵ */
    public Object mo3727() {
        int r0 = this.f4542;
        if (r0 <= 0) goto L6;
        int r2 = r0 - 1;
        Object[] r3 = this.f4541;
        Object r4 = r3[r2];
        r3[r2] = null;
        this.f4542 = r0 - 1;
        return r4;
    L6:
        return null;
    }
}
