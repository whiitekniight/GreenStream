package p106;

import java.util.Arrays;
import p005j$.util.Objects;

/* JADX INFO: renamed from: ˆʻ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C2347 extends AbstractC2346 {

    /* JADX INFO: renamed from: ʽ */
    public final boolean f8424;

    /* JADX INFO: renamed from: ˈ */
    public final boolean f8425;

    /* JADX INFO: renamed from: ˑﹳ */
    public final String[] f8426;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f8427;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final AbstractC2346[] f8428;

    public C2347(String r2, boolean r3, boolean r4, String[] r5, AbstractC2346[] r6) {
        super("CTOC");
        this.f8427 = r2;
        this.f8424 = r3;
        this.f8425 = r4;
        this.f8426 = r5;
        this.f8428 = r6;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L21:
        return false;
    L8:
        if (C2347.class != r5.getClass()) goto L21;
        C2347 r52 = (C2347) r5;
        if (this.f8424 != r52.f8424) goto L21;
        if (this.f8425 != r52.f8425) goto L21;
        if (Objects.equals(this.f8427, r52.f8427) == false) goto L21;
        if (Arrays.equals(this.f8426, r52.f8426) == false) goto L21;
        if (Arrays.equals(this.f8428, r52.f8428) == false) goto L21;
        return true;
    }

    public final int hashCode() {
        int r0 = (((527 + (this.f8424 ? 1 : 0)) * 31) + (this.f8425 ? 1 : 0)) * 31;
        String r1 = this.f8427;
        if (r1 == null) goto L5;
        int r12 = r1.hashCode();
    L7:
        return r0 + r12;
    L5:
        r12 = 0;
        goto L7
    }
}
