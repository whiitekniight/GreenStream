package p209;

import com.hierynomus.protocol.commons.buffer.Buffer$BufferException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import p047.AbstractC1703;
import p319.AbstractC4223;
import p329.AbstractC4396;
import p461.AbstractC5842;

/* JADX INFO: renamed from: ˎʿ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3384 {

    /* JADX INFO: renamed from: ʽ */
    public int f11879;

    /* JADX INFO: renamed from: ˈ */
    public int f11880;

    /* JADX INFO: renamed from: ⁱˊ */
    public final C3383 f11881;

    /* JADX INFO: renamed from: ﹳٴ */
    public byte[] f11882;

    static {
        AbstractC5842.m11465(AbstractC3384.class);
    }

    public AbstractC3384() {
        this(new byte[m7120(256)], false, C3383.f11875);
    }

    public AbstractC3384(byte[] r1, boolean r2, C3383 r3) {
        this.f11882 = r1;
        this.f11881 = r3;
        int r32 = 0;
        this.f11879 = 0;
        if (r2 == false) goto L5;
        r32 = r1.length;
    L5:
        this.f11880 = r32;
    }

    /* JADX INFO: renamed from: ʽ */
    public static int m7120(int r3) {
        int r0 = 1;
    L3:
        if (r0 >= r3) goto L9;
        r0 = r0 << 1;
        if (r0 > 0) goto L3;
        throw new IllegalArgumentException(AbstractC1703.m4484(r3, "Cannot get next power of 2; ", " is too large"));
    L9:
        return r0;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("Buffer [rpos=");
        r0.append(this.f11879);
        r0.append(", wpos=");
        r0.append(this.f11880);
        r0.append(", size=");
        return AbstractC1703.m4493(r0, this.f11882.length, "]");
    }

    /* JADX INFO: renamed from: ʼˎ */
    public final byte m7121() {
        if (m7132() < 1) goto L7;
        byte[] r0 = this.f11882;
        int r1 = this.f11879;
        this.f11879 = r1 + 1;
        return r0[r1];
    L7:
        throw new Buffer$BufferException("Underflow");
    }

    /* JADX INFO: renamed from: ˆʾ */
    public final void m7122(int r4, byte[] r5) {
        if (m7132() < r4) goto L7;
        System.arraycopy(this.f11882, this.f11879, r5, 0, r4);
        this.f11879 += r4;
        return;
    L7:
        throw new Buffer$BufferException("Underflow");
    }

    /* JADX INFO: renamed from: ˈ */
    public AbstractC3384 mo7123(byte r5) {
        int r0 = this.f11882.length;
        int r1 = this.f11880;
        if ((r0 - r1) >= 1) goto L5;
        byte[] r02 = new byte[m7120(r1 + 1)];
        byte[] r12 = this.f11882;
        System.arraycopy(r12, 0, r02, 0, r12.length);
        this.f11882 = r02;
    L5:
        byte[] r03 = this.f11882;
        int r13 = this.f11880;
        this.f11880 = r13 + 1;
        r03[r13] = r5;
        return this;
    }

    /* JADX INFO: renamed from: ˉʿ */
    public final void m7124() {
        this.f11881.m7117(this);
    }

    /* JADX INFO: renamed from: ˉˆ */
    public final void m7125(int r2) {
        if (m7132() < r2) goto L7;
        this.f11879 += r2;
        return;
    L7:
        throw new Buffer$BufferException("Underflow");
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public AbstractC3384 mo7126(int r5, byte[] r6) {
        int r0 = this.f11882.length;
        int r1 = this.f11880;
        if ((r0 - r1) >= r5) goto L5;
        byte[] r02 = new byte[m7120(r1 + r5)];
        byte[] r12 = this.f11882;
        System.arraycopy(r12, 0, r02, 0, r12.length);
        this.f11882 = r02;
    L5:
        System.arraycopy(r6, 0, this.f11882, this.f11880, r5);
        this.f11880 += r5;
        return this;
    }

    /* JADX INFO: renamed from: ٴﹶ */
    public final byte[] m7127(int r2) {
        byte[] r0 = new byte[r2];
        m7122(r2, r0);
        return r0;
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public final void m7128(int r2) {
        this.f11881.m7115(this, r2);
    }

    /* JADX INFO: renamed from: ᵔʾ */
    public final int m7129() {
        return (int) this.f11881.m7113(this);
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public final void m7130(long r18) {
        switch(this.f11881.f11878) {
            case 0: goto L12;
            default: goto L5;
        };
    L5:
        if (r18 < 0) goto L10;
        if (r18 > 4294967295L) goto L10;
        mo7126(4, new byte[]{(byte) r18, (byte) (r18 >> 8), (byte) (r18 >> 16), (byte) (r18 >> 24)});
        return;
    L10:
        throw new IllegalArgumentException(AbstractC4223.m8637("Invalid uint32 value: ", r18));
    L12:
        if (r18 < 0) goto L18;
        if (r18 > 4294967295L) goto L18;
        mo7126(4, new byte[]{(byte) (r18 >> 24), (byte) (r18 >> 16), (byte) (r18 >> 8), (byte) r18});
        return;
    L18:
        throw new IllegalArgumentException(AbstractC4223.m8637("Invalid uint32 value: ", r18));
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final byte[] m7131() {
        int r0 = m7132();
        if (r0 <= 0) goto L7;
        byte[] r2 = new byte[r0];
        System.arraycopy(this.f11882, this.f11879, r2, 0, r0);
        return r2;
    L7:
        return new byte[0];
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final int m7132() {
        return this.f11880 - this.f11879;
    }

    /* JADX INFO: renamed from: ﾞʻ */
    public final String m7133(int r4, Charset r5) {
        String r0 = r5.name();
        r0.getClass();
        byte r2 = -1;
        switch(r0.hashCode()) {
            case -1781783509: goto L18;
            case 81070450: goto L14;
            case 1398001070: goto L10;
            case 1398001380: goto L6;
            default: goto L21;
        };
    L21:
        switch(r2) {
            case 0: goto L31;
            case 1: goto L28;
            case 2: goto L27;
            case 3: goto L25;
            default: goto L23;
        };
    L28:
        byte[] r1 = new byte[r4];
        m7122(r4, r1);
        return new String(r1, r5);
    L23:
        throw new UnsupportedCharsetException(r5.name());
    L25:
        return C3383.m7111(this, r4, AbstractC4396.f16114);
    L27:
        return C3383.m7111(this, r4, AbstractC4396.f16116);
    L31:
        switch(this.f11881.f11878) {
            case 0: goto L34;
            default: goto L35;
        };
    L35:
        return C3383.m7111(this, r4, AbstractC4396.f16114);
    L34:
        return C3383.m7111(this, r4, AbstractC4396.f16116);
    L6:
        if (r0.equals("UTF-16LE") == false) goto L21;
        r2 = 3;
        goto L21
    L10:
        if (r0.equals("UTF-16BE") == false) goto L21;
        r2 = 2;
        goto L21
    L14:
        if (r0.equals("UTF-8") == false) goto L21;
        r2 = 1;
        goto L21
    L18:
        if (r0.equals("UTF-16") == false) goto L21;
        r2 = 0;
        goto L21
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public final void m7134(String r4, Charset r5) {
        String r0 = r5.name();
        r0.getClass();
        byte r2 = -1;
        switch(r0.hashCode()) {
            case -1781783509: goto L18;
            case 81070450: goto L14;
            case 1398001070: goto L10;
            case 1398001380: goto L6;
            default: goto L21;
        };
    L21:
        switch(r2) {
            case 0: goto L30;
            case 1: goto L28;
            case 2: goto L26;
            case 3: goto L24;
            default: goto L23;
        };
    L24:
        C3383.f11875.m7112(this, r4);
        return;
    L26:
        C3383.f11876.m7112(this, r4);
        return;
    L28:
        byte[] r42 = r4.getBytes(r5);
        mo7126(r42.length, r42);
        return;
    L30:
        this.f11881.m7112(this, r4);
        return;
    L23:
        throw new UnsupportedCharsetException(r5.name());
    L6:
        if (r0.equals("UTF-16LE") == false) goto L21;
        r2 = 3;
        goto L21
    L10:
        if (r0.equals("UTF-16BE") == false) goto L21;
        r2 = 2;
        goto L21
    L14:
        if (r0.equals("UTF-8") == false) goto L21;
        r2 = 1;
        goto L21
    L18:
        if (r0.equals("UTF-16") == false) goto L21;
        r2 = 0;
        goto L21
    }
}
