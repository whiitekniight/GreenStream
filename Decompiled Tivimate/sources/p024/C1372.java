package p024;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: ʻᴵ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C1372 extends AbstractC1388 {

    /* JADX INFO: renamed from: ʽʽ */
    public final long f4698;

    /* JADX INFO: renamed from: ˈٴ */
    public final ArrayList f4699;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final ArrayList f4700;

    public C1372(int r2, long r3) {
        super(r2, 0);
        this.f4698 = r3;
        this.f4699 = new ArrayList();
        this.f4700 = new ArrayList();
    }

    @Override // p024.AbstractC1388
    public final String toString() {
        return AbstractC1388.m3882(this.f4770) + " leaves: " + Arrays.toString(this.f4699.toArray()) + " containers: " + Arrays.toString(this.f4700.toArray());
    }

    /* JADX INFO: renamed from: ʽﹳ */
    public final C1376 m3851(int r6) {
        ArrayList r0 = this.f4699;
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L8;
        C1376 r3 = (C1376) r0.get(r2);
        if (r3.f4770 == r6) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return r3;
    L8:
        return null;
    }

    /* JADX INFO: renamed from: ˏי */
    public final C1372 m3852(int r6) {
        ArrayList r0 = this.f4700;
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L8;
        C1372 r3 = (C1372) r0.get(r2);
        if (r3.f4770 == r6) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return r3;
    L8:
        return null;
    }
}
