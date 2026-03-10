package p134;

import p423.AbstractC5375;

/* JADX INFO: renamed from: ˈˋ.ʿ */
/* JADX INFO: loaded from: classes.dex */
public final class C2535 {

    /* JADX INFO: renamed from: ʽ */
    public int f8955;

    /* JADX INFO: renamed from: ˈ */
    public boolean f8956;

    /* JADX INFO: renamed from: ˑﹳ */
    public byte f8957;

    /* JADX INFO: renamed from: ⁱˊ */
    public int f8958;

    /* JADX INFO: renamed from: ﹳٴ */
    public String f8959;

    /* JADX INFO: renamed from: ﹳٴ */
    public final C2537 m5785() {
        if (this.f8957 != 7) goto L9;
        String r0 = this.f8959;
        if (r0 == null) goto L9;
        return new C2537(this.f8958, this.f8955, r0, this.f8956);
    L9:
        StringBuilder r02 = new StringBuilder();
        if (this.f8959 != null) goto L13;
        r02.append(" processName");
    L13:
        if ((this.f8957 & 1) != 0) goto L16;
        r02.append(" pid");
    L16:
        if ((this.f8957 & 2) != 0) goto L19;
        r02.append(" importance");
    L19:
        if ((this.f8957 & 4) != 0) goto L22;
        r02.append(" defaultProcess");
    L22:
        throw new IllegalStateException(AbstractC5375.m10397("Missing required properties:", r02));
    }
}
