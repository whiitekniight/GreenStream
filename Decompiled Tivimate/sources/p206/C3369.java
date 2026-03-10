package p206;

import p183.C3124;
import p183.C3130;
import p183.InterfaceC3109;

/* JADX INFO: renamed from: ˎʼ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C3369 implements InterfaceC3370, InterfaceC3109 {

    /* JADX INFO: renamed from: ʼˎ */
    public final int f11777;

    /* JADX INFO: renamed from: ʽ */
    public final int f11778;

    /* JADX INFO: renamed from: ˆʾ */
    public final int f11779;

    /* JADX INFO: renamed from: ˈ */
    public final long f11780;

    /* JADX INFO: renamed from: ˑﹳ */
    public final int f11781;

    /* JADX INFO: renamed from: ٴﹶ */
    public final boolean f11782;

    /* JADX INFO: renamed from: ᵎﹶ */
    public final boolean f11783;

    /* JADX INFO: renamed from: ᵔᵢ */
    public final long f11784;

    /* JADX INFO: renamed from: ⁱˊ */
    public final long f11785;

    /* JADX INFO: renamed from: ﹳٴ */
    public final long f11786;

    /* JADX INFO: renamed from: ﾞʻ */
    public final long f11787;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final long f11788;

    public C3369(long r5, long r7, int r9, int r10, boolean r11) {
        this.f11786 = r5;
        this.f11785 = r7;
        if (r10 != (-1)) goto L5;
        int r0 = 1;
    L6:
        this.f11778 = r0;
        this.f11781 = r9;
        this.f11783 = r11;
        if (r5 != (-1)) goto L9;
        this.f11780 = -1;
        this.f11788 = -9223372036854775807L;
    L10:
        this.f11784 = r7;
        this.f11777 = r9;
        this.f11779 = r10;
        this.f11782 = r11;
        if (r5 != (-1)) goto L14;
        r5 = -1;
    L14:
        this.f11787 = r5;
        return;
    L9:
        long r02 = r5 - r7;
        this.f11780 = r02;
        this.f11788 = (Math.max(0, r02) * 8000000) / ((long) r9);
        goto L10
    L5:
        r0 = r10;
        goto L6
    }

    @Override // p206.InterfaceC3370
    /* JADX INFO: renamed from: ʽ */
    public final long mo7093(long r5) {
        return (Math.max(0, r5 - this.f11785) * 8000000) / ((long) this.f11781);
    }

    @Override // p183.InterfaceC3109
    /* JADX INFO: renamed from: ˆʾ */
    public final C3130 mo3612(long r18) {
        long r3 = this.f11780;
        long r5 = this.f11785;
        if (r3 == (-1)) goto L5;
    L8:
        int r2 = this.f11781;
        long r13 = this.f11778;
        long r9 = (((((long) r2) * r18) / 8000000) / r13) * r13;
        if (r3 == (-1)) goto L11;
        r9 = Math.min(r9, r3 - r13);
    L11:
        long r32 = Math.max(r9, 0) + r5;
        long r92 = (Math.max(0, r32 - r5) * 8000000) / ((long) r2);
        C3124 r11 = new C3124(r92, r32);
        if (r3 == (-1)) goto L21;
        if (r92 >= r18) goto L21;
        long r33 = r32 + r13;
        if (r33 >= this.f11786) goto L21;
        return new C3130(r11, new C3124((Math.max(0, r33 - r5) * 8000000) / ((long) r2), r33));
    L21:
        return new C3130(r11, r11);
    L5:
        if (this.f11783 == true) goto L8;
        C3124 r22 = new C3124(0, r5);
        return new C3130(r22, r22);
    }

    @Override // p183.InterfaceC3109
    /* JADX INFO: renamed from: ˉʿ */
    public final long mo3614() {
        return this.f11788;
    }

    @Override // p206.InterfaceC3370
    /* JADX INFO: renamed from: ˑﹳ */
    public final long mo7094() {
        return this.f11787;
    }

    @Override // p183.InterfaceC3109
    /* JADX INFO: renamed from: ᵔᵢ */
    public final boolean mo3618() {
        if (this.f11780 == (-1)) goto L5;
        return true;
    L5:
        if (this.f11783 == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // p206.InterfaceC3370
    /* JADX INFO: renamed from: ﾞʻ */
    public final int mo7095() {
        return this.f11777;
    }
}
