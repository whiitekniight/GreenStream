package p180;

import com.google.android.gms.internal.play_billing.ʽﹳ;
import p453.C5678;
import ʼ.ᵎﹶ;

/* JADX INFO: renamed from: ˊⁱ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C3098 implements InterfaceC3095 {

    /* JADX INFO: renamed from: ʽʽ */
    public int f10846;

    /* JADX INFO: renamed from: ʾˋ */
    public C5678 f10847;

    /* JADX INFO: renamed from: ˈٴ */
    public byte[] f10848;

    /* JADX INFO: renamed from: ᴵˊ */
    public ʽﹳ f10849;

    /* JADX INFO: renamed from: ᴵᵔ */
    public byte[] f10850;

    @Override // p180.InterfaceC3095
    /* JADX INFO: renamed from: ᵔʾ */
    public final int mo6574(byte[] r10, int r11, int r12) {
        byte[] r0 = this.f10850;
        byte[] r1 = this.f10848;
        int r2 = r11;
    L3:
        int r3 = r11 + r12;
        if (r2 >= r3) goto L13;
        int r4 = r2 + 16;
        if (r4 > r3) goto L8;
        int r32 = 16;
    L9:
        this.f10849.ᴵᵔ(r10, r2, r32);
        ᵎﹶ.ᴵˊ(this.f10846, r1);
        this.f10847.m10891(r1, r0);
        int r5 = 0;
    L10:
        if (r5 >= r32) goto L12;
        int r6 = r2 + r5;
        r10[r6] = (byte) (r10[r6] ^ r0[r5]);
        r5 = r5 + 1;
        goto L10
    L12:
        this.f10846++;
        r2 = r4;
        goto L3
    L8:
        r32 = r3 - r2;
        goto L9
    L13:
        return r12;
    }
}
