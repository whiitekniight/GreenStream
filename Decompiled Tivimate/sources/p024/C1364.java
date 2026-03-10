package p024;

import java.util.Arrays;
import org.tukaani.p011xz.CorruptedInputException;
import p034.C1531;
import p317.AbstractC4195;
import p317.AbstractC4214;
import p317.C4215;

/* JADX INFO: renamed from: ʻᴵ.ʻٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C1364 {

    /* JADX INFO: renamed from: ʽ */
    public int f4677;

    /* JADX INFO: renamed from: ˈ */
    public int f4678;

    /* JADX INFO: renamed from: ˑﹳ */
    public int f4679;

    /* JADX INFO: renamed from: ⁱˊ */
    public byte[] f4680;

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f4681;

    public C1364(int r1) {
        this.f4681 = r1;
        switch(r1) {
            case 4: goto L6;
            default: goto L5;
        };
    L6:
        this.f4680 = AbstractC4195.f15422;
        return;
    }

    public C1364(int r2, int r3) {
        this.f4681 = 5;
        this.f4677 = r2;
        this.f4678 = r3;
        this.f4680 = new byte[(r3 * 2) - 1];
        this.f4679 = 0;
    }

    public C1364(int r2, byte[] r3) {
        this.f4681 = 4;
        this.f4680 = r3;
        this.f4679 = r2;
    }

    public C1364(C1531 r2) {
        this.f4681 = 2;
        this.f4677 = 0;
        this.f4678 = 0;
        byte[] r22 = r2.mo4099(65531);
        this.f4680 = r22;
        this.f4679 = r22.length;
    }

    public C1364(byte[] r2) {
        this.f4681 = 3;
        this.f4680 = r2;
        this.f4677 = r2.length;
    }

    public C1364(byte[] r2, int r3, int r4) {
        this.f4681 = 0;
        this.f4680 = r2;
        this.f4678 = r3;
        this.f4677 = r4;
        this.f4679 = 0;
        m3821();
    }

    /* JADX INFO: renamed from: ˆʾ */
    public static final void m3799(short[] r1) {
        Arrays.fill(r1, 1024);
    }

    /* JADX INFO: renamed from: ʻٴ */
    public boolean m3800(int r4) {
        if (2 <= r4) goto L5;
        return false;
    L5:
        if (r4 >= this.f4677) goto L15;
        byte[] r0 = this.f4680;
        if (r0[r4] == 3) goto L9;
        return false;
    L9:
        if (r0[r4 - 2] == 0) goto L11;
        return false;
    L11:
        if (r0[r4 - 1] != 0) goto L18;
        return true;
    L18:
        return false;
    L15:
        return false;
    }

    /* JADX INFO: renamed from: ʼʼ */
    public void m3801(int r2) {
        if (this.f4678 != 0) goto L5;
        boolean r0 = true;
    L6:
        AbstractC4214.m8568(r0);
        this.f4677 += r2;
        m3821();
        return;
    L5:
        r0 = false;
        goto L6
    }

    /* JADX INFO: renamed from: ʼˎ */
    public int m3802() {
        return (this.f4677 * 8) + this.f4678;
    }

    /* JADX INFO: renamed from: ʼᐧ */
    public void m3803(int r4, byte[] r5) {
        if (this.f4678 != 0) goto L5;
        boolean r0 = true;
    L6:
        AbstractC4214.m8568(r0);
        System.arraycopy(this.f4680, this.f4677, r5, 0, r4);
        this.f4677 += r4;
        m3821();
        return;
    L5:
        r0 = false;
        goto L6
    }

    /* JADX INFO: renamed from: ʽ */
    public void m3804() {
        if (this.f4678 != 0) goto L5;
        return;
    L5:
        this.f4678 = 0;
        this.f4677++;
        m3821();
    }

    /* JADX INFO: renamed from: ʽﹳ */
    public void m3805(int r2) {
        int r0 = r2 / 8;
        this.f4677 = r0;
        this.f4678 = r2 - (r0 * 8);
        m3821();
    }

    /* JADX INFO: renamed from: ʾᵎ */
    public void m3806(int r5) {
        switch(this.f4681) {
            case 0: goto L23;
            case 1: goto L4;
            case 2: goto L4;
            case 3: goto L9;
            default: goto L4;
        };
    L4:
        int r0 = r5 / 8;
        int r1 = this.f4677 + r0;
        this.f4677 = r1;
        int r52 = (r5 - (r0 * 8)) + this.f4678;
        this.f4678 = r52;
        if (r52 <= 7) goto L7;
        this.f4677 = r1 + 1;
        this.f4678 = r52 - 8;
    L7:
        m3821();
        return;
    L9:
        int r02 = r5 / 8;
        int r12 = this.f4678 + r02;
        this.f4678 = r12;
        int r53 = (r5 - (r02 * 8)) + this.f4679;
        this.f4679 = r53;
        boolean r2 = true;
        if (r53 <= 7) goto L12;
        this.f4678 = r12 + 1;
        this.f4679 = r53 - 8;
    L12:
        int r54 = this.f4678;
        if (r54 < 0) goto L20;
        int r03 = this.f4677;
        if (r54 < r03) goto L21;
        if (r54 != r03) goto L20;
        if (this.f4679 != 0) goto L20;
    L21:
        AbstractC4214.m8568(r2);
        return;
    L20:
        r2 = false;
        goto L21
    L23:
        int r04 = this.f4678;
        int r13 = r5 / 8;
        int r22 = r04 + r13;
        this.f4678 = r22;
        int r55 = (r5 - (r13 * 8)) + this.f4679;
        this.f4679 = r55;
        if (r55 <= 7) goto L26;
        this.f4678 = r22 + 1;
        this.f4679 = r55 - 8;
    L26:
        r04 = r04 + 1;
        if (r04 > this.f4678) goto L31;
        if (m3800(r04) == false) goto L26;
        this.f4678++;
        r04 = r04 + 2;
        goto L26
    L31:
        m3821();
    }

    /* JADX INFO: renamed from: ˈ */
    public boolean m3807(int r5) {
        int r0 = this.f4678;
        int r1 = r5 / 8;
        int r2 = r0 + r1;
        int r3 = (this.f4679 + r5) - (r1 * 8);
        if (r3 <= 7) goto L6;
        r2 = r2 + 1;
        r3 = r3 - 8;
    L6:
        r0 = r0 + 1;
        if (r0 > r2) goto L13;
        if (r2 >= this.f4677) goto L13;
        if (m3800(r0) == false) goto L6;
        r2 = r2 + 1;
        r0 = r0 + 2;
    L13:
        int r02 = this.f4677;
        if (r2 < r02) goto L26;
        if (r2 != r02) goto L18;
        if (r3 != 0) goto L18;
        return true;
    L18:
        return false;
    L26:
        return true;
    }

    /* JADX INFO: renamed from: ˉʿ */
    public int m3808(int r10) {
        switch(this.f4681) {
            case 0: goto L21;
            case 1: goto L5;
            case 2: goto L5;
            case 3: goto L16;
            default: goto L5;
        };
    L16:
        int r0 = this.f4678;
        int r1 = Math.min(r10, 8 - this.f4679);
        byte[] r2 = this.f4680;
        int r3 = r0 + 1;
        int r02 = ((r2[r0] & 255) >> this.f4679) & (255 >> (8 - r1));
    L17:
        if (r1 >= r10) goto L19;
        r02 = r02 | ((r2[r3] & 255) << r1);
        r1 = r1 + 8;
        r3 = r3 + 1;
        goto L17
    L19:
        int r03 = r02 & ((-1) >>> (32 - r10));
        m3806(r10);
        return r03;
    L21:
        this.f4679 += r10;
        int r12 = 0;
    L22:
        int r22 = this.f4679;
        int r32 = 2;
        if (r22 <= 8) goto L29;
        int r23 = r22 - 8;
        this.f4679 = r23;
        byte[] r5 = this.f4680;
        int r6 = this.f4678;
        r12 = r12 | ((r5[r6] & 255) << r23);
        if (m3800(r6 + 1) == true) goto L28;
        r32 = 1;
    L28:
        this.f4678 = r6 + r32;
        goto L22
    L29:
        byte[] r62 = this.f4680;
        int r7 = this.f4678;
        int r102 = ((-1) >>> (32 - r10)) & (r12 | ((r62[r7] & 255) >> (8 - r22)));
        if (r22 != 8) goto L36;
        this.f4679 = 0;
        if (m3800(r7 + 1) == true) goto L35;
        r32 = 1;
    L35:
        this.f4678 = r7 + r32;
    L36:
        m3821();
        return r102;
    L5:
        if (r10 == 0) goto L43;
        this.f4678 += r10;
        int r13 = 0;
    L8:
        int r24 = this.f4678;
        if (r24 <= 8) goto L11;
        int r25 = r24 - 8;
        this.f4678 = r25;
        byte[] r33 = this.f4680;
        int r4 = this.f4677;
        this.f4677 = r4 + 1;
        r13 = r13 | ((r33[r4] & 255) << r25);
        goto L8
    L11:
        byte[] r42 = this.f4680;
        int r52 = this.f4677;
        int r103 = ((-1) >>> (32 - r10)) & (r13 | ((r42[r52] & 255) >> (8 - r24)));
        if (r24 != 8) goto L14;
        this.f4678 = 0;
        this.f4677 = r52 + 1;
    L14:
        m3821();
        return r103;
    L43:
        return 0;
    }

    /* JADX INFO: renamed from: ˉˆ */
    public long m3809(int r7) {
        if (r7 > 32) goto L6;
        int r72 = m3808(r7);
        String r2 = AbstractC4195.f15423;
        return 4294967295L & ((long) r72);
    L6:
        int r73 = m3808(r7 - 32);
        int r3 = m3808(32);
        String r4 = AbstractC4195.f15423;
        long r0 = 4294967295L & ((long) r3);
        return r0 | ((((long) r73) & 4294967295L) << 32);
    }

    /* JADX INFO: renamed from: ˏי */
    public void m3810(C4215 r3) {
        byte[] r0 = r3.f15476;
        m3812(r3.f15474, r0);
        m3805(r3.f15475 * 8);
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public boolean m3811() {
        int r0 = this.f4678;
        int r1 = this.f4679;
        int r3 = 0;
    L4:
        if (this.f4678 >= this.f4677) goto L9;
        if (m3823() == true) goto L9;
        r3 = r3 + 1;
    L9:
        if (this.f4678 != this.f4677) goto L11;
        boolean r4 = true;
    L12:
        this.f4678 = r0;
        this.f4679 = r1;
        if (r4 == false) goto L15;
    L17:
        return false;
    L15:
        if (m3807((r3 * 2) + 1) == false) goto L17;
        return true;
    L11:
        r4 = false;
        goto L12
    }

    /* JADX INFO: renamed from: יـ */
    public void m3812(int r1, byte[] r2) {
        this.f4680 = r2;
        this.f4677 = 0;
        this.f4678 = 0;
        this.f4679 = r1;
    }

    /* JADX INFO: renamed from: ـˆ */
    public void m3813() {
        switch(this.f4681) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        int r0 = this.f4678 + 1;
        this.f4678 = r0;
        if (r0 != 8) goto L7;
        this.f4678 = 0;
        this.f4677++;
    L7:
        m3821();
        return;
    L9:
        int r1 = 1;
        int r02 = this.f4679 + 1;
        this.f4679 = r02;
        if (r02 != 8) goto L15;
        this.f4679 = 0;
        int r03 = this.f4678;
        if (m3800(r03 + 1) == false) goto L14;
        r1 = 2;
    L14:
        this.f4678 = r03 + r1;
    L15:
        m3821();
    }

    /* JADX INFO: renamed from: ٴﹶ */
    public void m3814() {
        int r0 = this.f4677;
        if (((-16777216) & r0) == 0) goto L9;
        return;
    L9:
        int r1 = this.f4678 << 8;     // Catch: ArrayIndexOutOfBoundsException -> L6
        byte[] r2 = this.f4680;     // Catch: ArrayIndexOutOfBoundsException -> L6
        int r3 = this.f4679;     // Catch: ArrayIndexOutOfBoundsException -> L6
        this.f4679 = r3 + 1;     // Catch: ArrayIndexOutOfBoundsException -> L6
        this.f4678 = r1 | (r2[r3] & 255);     // Catch: ArrayIndexOutOfBoundsException -> L6
        this.f4677 = r0 << 8;     // Catch: ArrayIndexOutOfBoundsException -> L6
        return;
    L7:
        throw new CorruptedInputException();
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public int m3815(short[] r3) {
        int r0 = 1;
    L3:
        int r1 = r0 << 1;
        r0 = m3824(r3, r0) | r1;
        if (r0 < r3.length) goto L3;
        return r0 - r3.length;
    }

    /* JADX INFO: renamed from: ᵔʾ */
    public void m3816(int r10, byte[] r11) {
        int r0 = r10 >> 3;
        int r2 = 0;
    L4:
        if (r2 >= r0) goto L6;
        byte[] r5 = this.f4680;
        int r6 = this.f4677;
        int r7 = r6 + 1;
        this.f4677 = r7;
        byte r62 = r5[r6];
        int r8 = this.f4678;
        byte r63 = (byte) (r62 << r8);
        r11[r2] = r63;
        r11[r2] = (byte) (((255 & r5[r7]) >> (8 - r8)) | r63);
        r2 = r2 + 1;
        goto L4
    L6:
        int r102 = r10 & 7;
        if (r102 != 0) goto L9;
        return;
    L9:
        byte r22 = (byte) (r11[r0] & (255 >> r102));
        r11[r0] = r22;
        int r52 = this.f4678;
        if ((r52 + r102) <= 8) goto L12;
        byte[] r64 = this.f4680;
        int r72 = this.f4677;
        this.f4677 = r72 + 1;
        r11[r0] = (byte) (r22 | ((r64[r72] & 255) << r52));
        this.f4678 = r52 - 8;
    L12:
        int r23 = this.f4678 + r102;
        this.f4678 = r23;
        byte[] r53 = this.f4680;
        int r65 = this.f4677;
        r11[r0] = (byte) (((byte) (((255 & r53[r65]) >> (8 - r23)) << (8 - r102))) | r11[r0]);
        if (r23 != 8) goto L15;
        this.f4678 = 0;
        this.f4677 = r65 + 1;
    L15:
        m3821();
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public int m3817() {
        if (this.f4678 != 0) goto L5;
        boolean r0 = true;
    L6:
        AbstractC4214.m8568(r0);
        return this.f4677;
    L5:
        r0 = false;
        goto L6
    }

    /* JADX INFO: renamed from: ᵔﹳ */
    public int m3818() {
        int r0 = 0;
        int r1 = 0;
    L4:
        if (m3823() == true) goto L6;
        r1 = r1 + 1;
        goto L4
    L6:
        int r3 = (1 << r1) - 1;
        if (r1 <= 0) goto L10;
        r0 = m3808(r1);
    L10:
        return r3 + r0;
    }

    /* JADX INFO: renamed from: ᵢˏ */
    public void m3819(byte[] r5, int r6, int r7) {
        byte[] r0 = this.f4680;
        if ((r5.length - r6) < r7) goto L15;
        if (r7 > (r0.length - this.f4679)) goto L13;
        int r1 = this.f4677;
        if ((r1 + r7) > r0.length) goto L9;
        System.arraycopy(r5, r6, r0, r1, r7);
    L10:
        this.f4677 = (this.f4677 + r7) % r0.length;
        this.f4679 += r7;
        return;
    L9:
        int r2 = r0.length - r1;
        System.arraycopy(r5, r6, r0, r1, r2);
        System.arraycopy(r5, r6 + r2, r0, 0, r7 - r2);
        goto L10
    L13:
        throw new IndexOutOfBoundsException("Size of bytes to be written is greater than available buffer space");
    L15:
        throw new IllegalArgumentException("Bytes to write do not exist in source");
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public int m3820() {
        return ((this.f4679 - this.f4677) * 8) - this.f4678;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public void m3821() {
        switch(this.f4681) {
            case 0: goto L15;
            default: goto L4;
        };
    L4:
        int r0 = this.f4677;
        if (r0 < 0) goto L12;
        int r1 = this.f4679;
        if (r0 < r1) goto L11;
        if (r0 != r1) goto L12;
        if (this.f4678 != 0) goto L12;
    L11:
        boolean r02 = true;
    L13:
        AbstractC4214.m8568(r02);
        return;
    L12:
        r02 = false;
        goto L13
    L15:
        int r03 = this.f4678;
        if (r03 < 0) goto L23;
        int r12 = this.f4677;
        if (r03 < r12) goto L22;
        if (r03 != r12) goto L23;
        if (this.f4679 != 0) goto L23;
    L22:
        boolean r04 = true;
    L24:
        AbstractC4214.m8568(r04);
        return;
    L23:
        r04 = false;
        goto L24
    }

    /* JADX INFO: renamed from: ﹳᐧ */
    public int m3822() {
        int r0 = m3818();
        if ((r0 % 2) != 0) goto L5;
        int r1 = -1;
    L7:
        return ((r0 + 1) / 2) * r1;
    L5:
        r1 = 1;
        goto L7
    }

    /* JADX INFO: renamed from: ﾞʻ */
    public boolean m3823() {
        switch(this.f4681) {
            case 0: goto L17;
            case 1: goto L5;
            case 2: goto L5;
            case 3: goto L11;
            default: goto L5;
        };
    L5:
        if ((this.f4680[this.f4677] & (128 >> this.f4678)) == 0) goto L7;
        boolean r0 = true;
    L8:
        m3813();
        return r0;
    L7:
        r0 = false;
        goto L8
    L11:
        if ((((this.f4680[this.f4678] & 255) >> this.f4679) & 1) != 1) goto L13;
        boolean r02 = true;
    L14:
        m3806(1);
        return r02;
    L13:
        r02 = false;
        goto L14
    L17:
        if ((this.f4680[this.f4678] & (128 >> this.f4679)) == 0) goto L19;
        boolean r03 = true;
    L20:
        m3813();
        return r03;
    L19:
        r03 = false;
        goto L20
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public int m3824(short[] r5, int r6) {
        m3814();
        short r0 = r5[r6];
        int r1 = (this.f4677 >>> 11) * r0;
        if (Integer.compare(this.f4678 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ r1) >= 0) goto L6;
        this.f4677 = r1;
        r5[r6] = (short) (r0 + ((2048 - r0) >>> 5));
        return 0;
    L6:
        this.f4677 -= r1;
        this.f4678 -= r1;
        r5[r6] = (short) (r0 - (r0 >>> 5));
        return 1;
    }
}
