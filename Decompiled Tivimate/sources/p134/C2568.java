package p134;

import p423.AbstractC5375;

/* JADX INFO: renamed from: ˈˋ.ـﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C2568 {

    /* JADX INFO: renamed from: ʽ */
    public String f9097;

    /* JADX INFO: renamed from: ˈ */
    public boolean f9098;

    /* JADX INFO: renamed from: ˑﹳ */
    public byte f9099;

    /* JADX INFO: renamed from: ⁱˊ */
    public String f9100;

    /* JADX INFO: renamed from: ﹳٴ */
    public int f9101;

    /* JADX INFO: renamed from: ﹳٴ */
    public final C2542 m5790() {
        if (this.f9099 != 3) goto L11;
        String r0 = this.f9100;
        if (r0 == null) goto L11;
        String r1 = this.f9097;
        if (r1 == null) goto L11;
        return new C2542(this.f9101, r0, r1, this.f9098);
    L11:
        StringBuilder r02 = new StringBuilder();
        if ((this.f9099 & 1) != 0) goto L15;
        r02.append(" platform");
    L15:
        if (this.f9100 != null) goto L18;
        r02.append(" version");
    L18:
        if (this.f9097 != null) goto L21;
        r02.append(" buildVersion");
    L21:
        if ((this.f9099 & 2) != 0) goto L24;
        r02.append(" jailbroken");
    L24:
        throw new IllegalStateException(AbstractC5375.m10397("Missing required properties:", r02));
    }
}
