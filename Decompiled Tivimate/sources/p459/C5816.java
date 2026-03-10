package p459;

import p308.AbstractC4142;

/* JADX INFO: renamed from: ﹶﾞ.ᵔﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C5816 {

    /* JADX INFO: renamed from: ʼˎ */
    public final Long f21191;

    /* JADX INFO: renamed from: ʽ */
    public final long f21192;

    /* JADX INFO: renamed from: ˆʾ */
    public final Long f21193;

    /* JADX INFO: renamed from: ˈ */
    public final long f21194;

    /* JADX INFO: renamed from: ˑﹳ */
    public final long f21195;

    /* JADX INFO: renamed from: ٴﹶ */
    public final Boolean f21196;

    /* JADX INFO: renamed from: ᵎﹶ */
    public final long f21197;

    /* JADX INFO: renamed from: ᵔᵢ */
    public final Long f21198;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f21199;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f21200;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final long f21201;

    public C5816(String r14, String r15, long r16, long r18, long r20, long r22, long r24, Long r26, Long r27, Long r28, Boolean r29) {
        AbstractC4142.m8391(r14);
        AbstractC4142.m8391(r15);
        boolean r11 = false;
        if (r16 < 0) goto L5;
        boolean r10 = true;
    L6:
        AbstractC4142.m8397(r10);
        if (r18 < 0) goto L9;
        boolean r102 = true;
    L10:
        AbstractC4142.m8397(r102);
        if (r20 < 0) goto L13;
        boolean r103 = true;
    L14:
        AbstractC4142.m8397(r103);
        if (r24 < 0) goto L17;
        r11 = true;
    L17:
        AbstractC4142.m8397(r11);
        this.f21200 = r14;
        this.f21199 = r15;
        this.f21192 = r16;
        this.f21194 = r18;
        this.f21195 = r20;
        this.f21201 = r22;
        this.f21197 = r24;
        this.f21198 = r26;
        this.f21191 = r27;
        this.f21193 = r28;
        this.f21196 = r29;
        return;
    L13:
        r103 = false;
        goto L14
    L9:
        r102 = false;
        goto L10
    L5:
        r10 = false;
        goto L6
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final C5816 m11304(Long r19, Long r20, Boolean r21) {
        return new C5816(this.f21200, this.f21199, this.f21192, this.f21194, this.f21195, this.f21201, this.f21197, this.f21198, r19, r20, r21);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final C5816 m11305(long r19) {
        long r6 = this.f21194;
        long r8 = this.f21195;
        return new C5816(this.f21200, this.f21199, this.f21192, r6, r8, r19, this.f21197, this.f21198, this.f21191, this.f21193, this.f21196);
    }
}
