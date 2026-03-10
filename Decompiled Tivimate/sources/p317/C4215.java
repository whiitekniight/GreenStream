package p317;

import com.google.android.gms.internal.play_billing.י;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import p029.AbstractC1480;
import p319.AbstractC4223;
import ˈˊ.ˉˆ;
import ˉᵎ.ⁱˊ;

/* JADX INFO: renamed from: ᐧˎ.ﹳᐧ */
/* JADX INFO: loaded from: classes.dex */
public final class C4215 {

    /* JADX INFO: renamed from: ˈ */
    public static final char[] f15471 = null;

    /* JADX INFO: renamed from: ˑﹳ */
    public static final char[] f15472 = null;

    /* JADX INFO: renamed from: ﾞᴵ */
    public static final AbstractC1480 f15473 = null;

    /* JADX INFO: renamed from: ʽ */
    public int f15474;

    /* JADX INFO: renamed from: ⁱˊ */
    public int f15475;

    /* JADX INFO: renamed from: ﹳٴ */
    public byte[] f15476;

    static {
        f15471 = new char[]{'\r', '\n'};
        f15472 = new char[]{'\n'};
        f15473 = AbstractC1480.m3986(5, new Object[]{StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE});
    }

    public C4215() {
        this.f15476 = AbstractC4195.f15422;
    }

    public C4215(int r2) {
        this.f15476 = new byte[r2];
        this.f15474 = r2;
    }

    public C4215(int r1, byte[] r2) {
        this.f15476 = r2;
        this.f15474 = r1;
    }

    public C4215(byte[] r1) {
        this.f15476 = r1;
        this.f15474 = r1.length;
    }

    /* JADX INFO: renamed from: ˈ */
    public static int m8581(Charset r3) {
        AbstractC4214.m8554("Unsupported charset: " + r3, f15473.contains(r3));
        if (r3.equals(StandardCharsets.UTF_8) == false) goto L5;
        return 1;
    L5:
        if (r3.equals(StandardCharsets.US_ASCII) == true) goto L11;
        return 2;
    L11:
        return 1;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public static boolean m8582(byte r1) {
        if ((r1 & 192) != 128) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static int m8583(int r2, int r3, int r4, int r5) {
        byte r42 = (byte) r4;
        return ˉˆ.ˉˆ((byte) 0, ⁱˊ.ˈ(((r2 & 7) << 2) | ((r3 & 48) >> 4)), ⁱˊ.ˈ(((((byte) r3) & 15) << 4) | ((r42 & 60) >> 2)), ⁱˊ.ˈ(((r42 & 3) << 6) | (((byte) r5) & 63)));
    }

    /* JADX INFO: renamed from: ʻٴ */
    public final short m8584() {
        byte[] r0 = this.f15476;
        int r1 = this.f15475;
        int r2 = r1 + 1;
        this.f15475 = r2;
        int r3 = (r0[r1] & 255) << 8;
        this.f15475 = r1 + 2;
        return (short) ((r0[r2] & 255) | r3);
    }

    /* JADX INFO: renamed from: ʼʼ */
    public final int m8585() {
        byte[] r0 = this.f15476;
        int r1 = this.f15475;
        this.f15475 = r1 + 1;
        return r0[r1] & 255;
    }

    /* JADX INFO: renamed from: ʼˎ */
    public final void m8586(byte[] r3, int r4, int r5) {
        System.arraycopy(this.f15476, this.f15475, r3, r4, r5);
        this.f15475 += r5;
    }

    /* JADX INFO: renamed from: ʼᐧ */
    public final long m8587() {
        byte[] r0 = this.f15476;
        int r1 = this.f15475;
        int r2 = r1 + 1;
        this.f15475 = r2;
        long r3 = ((long) r0[r1]) & 255;
        int r7 = r1 + 2;
        this.f15475 = r7;
        long r32 = r3 | ((((long) r0[r2]) & 255) << 8);
        int r22 = r1 + 3;
        this.f15475 = r22;
        long r33 = r32 | ((((long) r0[r7]) & 255) << 16);
        this.f15475 = r1 + 4;
        return ((((long) r0[r22]) & 255) << 24) | r33;
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m8588(int r3) {
        byte[] r0 = this.f15476;
        if (r3 <= r0.length) goto L6;
        this.f15476 = Arrays.copyOf(r0, r3);
        return;
    }

    /* JADX INFO: renamed from: ʽʽ */
    public final int m8589() {
        int r0 = m8604();
        if (r0 < 0) goto L6;
        return r0;
    L6:
        throw new IllegalStateException(AbstractC4223.m8643(r0, "Top bit not zero: "));
    }

    /* JADX INFO: renamed from: ʽﹳ */
    public final String m8590(int r6) {
        if (r6 != 0) goto L5;
        return "";
    L5:
        int r0 = this.f15475;
        int r1 = (r0 + r6) - 1;
        if (r1 < this.f15474) goto L8;
    L10:
        int r12 = r6;
    L11:
        byte[] r2 = this.f15476;
        String r3 = AbstractC4195.f15423;
        String r32 = new String(r2, r0, r12, StandardCharsets.UTF_8);
        this.f15475 += r6;
        return r32;
    L8:
        if (this.f15476[r1] != 0) goto L10;
        r12 = r6 - 1;
        goto L11
    }

    /* JADX INFO: renamed from: ʾˋ */
    public final long m8591() {
        byte[] r0 = this.f15476;
        int r1 = this.f15475;
        int r2 = r1 + 1;
        this.f15475 = r2;
        long r3 = (((long) r0[r1]) & 255) << 24;
        int r7 = r1 + 2;
        this.f15475 = r7;
        long r32 = r3 | ((((long) r0[r2]) & 255) << 16);
        int r22 = r1 + 3;
        this.f15475 = r22;
        long r33 = r32 | ((((long) r0[r7]) & 255) << 8);
        this.f15475 = r1 + 4;
        return (((long) r0[r22]) & 255) | r33;
    }

    /* JADX INFO: renamed from: ʾᵎ */
    public final int m8592() {
        int r0 = m8585();
        int r1 = m8585();
        int r2 = m8585();
        int r02 = ((r0 << 21) | (r1 << 14)) | (r2 << 7);
        return r02 | m8585();
    }

    /* JADX INFO: renamed from: ˆʾ */
    public final char m8593(Charset r8, char[] r9) {
        if (m8615() < m8581(r8)) goto L26;
        int r82 = m8609(r8);
        if (r82 == 0) goto L26;
        long r0 = r82 >>> 8;
        boolean r4 = true;
        if ((r0 >> 32) != 0) goto L11;
        boolean r3 = true;
    L12:
        י.ˑﹳ(r0, "out of range: %s", r3);
        int r02 = (int) r0;
        if (Character.isSupplementaryCodePoint(r02) == true) goto L26;
        long r03 = r02;
        char r32 = (char) r03;
        if (r32 == r03) goto L19;
        r4 = false;
    L19:
        י.ˑﹳ(r03, "Out of range: %s", r4);
        int r04 = r9.length;
        int r1 = 0;
    L20:
        if (r1 >= r04) goto L26;
        if (r9[r1] == r32) goto L23;
        r1 = r1 + 1;
        goto L20
    L23:
        this.f15475 = ˉˆ.ᵔᵢ(r82 & 255) + this.f15475;
        return r32;
    L11:
        r3 = false;
    L26:
        return 0;
    }

    /* JADX INFO: renamed from: ˈٴ */
    public final long m8594() {
        long r0 = m8600();
        if (r0 < 0) goto L6;
        return r0;
    L6:
        throw new IllegalStateException(AbstractC4223.m8637("Top bit not zero: ", r0));
    }

    /* JADX INFO: renamed from: ˉʿ */
    public final int m8595() {
        byte[] r0 = this.f15476;
        int r1 = this.f15475;
        int r2 = r1 + 1;
        this.f15475 = r2;
        int r3 = r0[r1] & 255;
        int r4 = r1 + 2;
        this.f15475 = r4;
        int r22 = ((r0[r2] & 255) << 8) | r3;
        int r32 = r1 + 3;
        this.f15475 = r32;
        int r23 = r22 | ((r0[r4] & 255) << 16);
        this.f15475 = r1 + 4;
        return ((r0[r32] & 255) << 24) | r23;
    }

    /* JADX INFO: renamed from: ˉˆ */
    public final short m8596() {
        byte[] r0 = this.f15476;
        int r1 = this.f15475;
        int r2 = r1 + 1;
        this.f15475 = r2;
        int r3 = r0[r1] & 255;
        this.f15475 = r1 + 2;
        return (short) (((r0[r2] & 255) << 8) | r3);
    }

    /* JADX INFO: renamed from: ˉٴ */
    public final void m8597(int r3) {
        byte[] r0 = this.f15476;
        if (r0.length >= r3) goto L5;
        r0 = new byte[r3];
    L5:
        m8608(r3, r0);
    }

    /* JADX INFO: renamed from: ˊʻ */
    public final long m8598() {
        long r0 = this.f15476[this.f15475];
        int r3 = 7;
    L3:
        int r5 = 1;
        if (r3 < 0) goto L12;
        int r6 = 1 << r3;
        if ((((long) r6) & r0) == 0) goto L7;
        r3 = r3 - 1;
        goto L3
    L7:
        if (r3 >= 6) goto L9;
        r0 = r0 & ((long) (r6 - 1));
        int r2 = 7 - r3;
    L13:
        if (r2 == 0) goto L23;
    L14:
        if (r5 >= r2) goto L20;
        byte r32 = this.f15476[this.f15475 + r5];
        if ((r32 & 192) != 128) goto L19;
        r0 = (r0 << 6) | ((long) (r32 & 63));
        r5 = r5 + 1;
        goto L14
    L19:
        throw new NumberFormatException(AbstractC4223.m8637("Invalid UTF-8 sequence continuation byte: ", r0));
    L20:
        this.f15475 += r2;
        return r0;
    L23:
        throw new NumberFormatException(AbstractC4223.m8637("Invalid UTF-8 sequence first byte: ", r0));
    L9:
        if (r3 != 7) goto L12;
        r2 = 1;
    L12:
        r2 = 0;
        goto L13
    }

    /* JADX INFO: renamed from: ˏי */
    public final String m8599() {
        if (m8615() != 0) goto L6;
        return null;
    L6:
        int r0 = this.f15475;
    L8:
        if (r0 >= this.f15474) goto L12;
        if (this.f15476[r0] == 0) goto L12;
        r0 = r0 + 1;
    L12:
        byte[] r1 = this.f15476;
        int r2 = this.f15475;
        String r4 = AbstractC4195.f15423;
        String r42 = new String(r1, r2, r0 - r2, StandardCharsets.UTF_8);
        this.f15475 = r0;
        if (r0 >= this.f15474) goto L15;
        this.f15475 = r0 + 1;
    L15:
        return r42;
    }

    /* JADX INFO: renamed from: יـ */
    public final long m8600() {
        byte[] r0 = this.f15476;
        int r1 = this.f15475;
        int r2 = r1 + 1;
        this.f15475 = r2;
        long r3 = (((long) r0[r1]) & 255) << 56;
        int r7 = r1 + 2;
        this.f15475 = r7;
        long r32 = r3 | ((((long) r0[r2]) & 255) << 48);
        int r22 = r1 + 3;
        this.f15475 = r22;
        long r33 = r32 | ((((long) r0[r7]) & 255) << 40);
        int r72 = r1 + 4;
        this.f15475 = r72;
        long r34 = r33 | ((((long) r0[r22]) & 255) << 32);
        int r23 = r1 + 5;
        this.f15475 = r23;
        long r35 = r34 | ((((long) r0[r72]) & 255) << 24);
        int r73 = r1 + 6;
        this.f15475 = r73;
        long r36 = r35 | ((((long) r0[r23]) & 255) << 16);
        int r24 = r1 + 7;
        this.f15475 = r24;
        long r37 = r36 | ((((long) r0[r73]) & 255) << 8);
        this.f15475 = r1 + 8;
        return (((long) r0[r24]) & 255) | r37;
    }

    /* JADX INFO: renamed from: ـˆ */
    public final String m8601(int r4, Charset r5) {
        String r0 = new String(this.f15476, this.f15475, r4, r5);
        this.f15475 += r4;
        return r0;
    }

    /* JADX INFO: renamed from: ٴʼ */
    public final void m8602(int r2) {
        if (r2 >= 0) goto L4;
    L6:
        boolean r0 = false;
    L7:
        AbstractC4214.m8560(r0);
        this.f15474 = r2;
        return;
    L4:
        if (r2 > this.f15476.length) goto L6;
        r0 = true;
        goto L7
    }

    /* JADX INFO: renamed from: ٴᵢ */
    public final Charset m8603() {
        if (m8615() < 3) goto L13;
        byte[] r0 = this.f15476;
        int r2 = this.f15475;
        if (r0[r2] != (-17)) goto L13;
        if (r0[r2 + 1] != (-69)) goto L13;
        if (r0[r2 + 2] != (-65)) goto L13;
        this.f15475 = r2 + 3;
        return StandardCharsets.UTF_8;
    L13:
        if (m8615() < 2) goto L25;
        byte[] r02 = this.f15476;
        int r22 = this.f15475;
        byte r3 = r02[r22];
        if (r3 == (-2)) goto L17;
    L20:
        if (r3 == (-1)) goto L22;
        return null;
    L22:
        if (r02[r22 + 1] != (-2)) goto L28;
        this.f15475 = r22 + 2;
        return StandardCharsets.UTF_16LE;
    L28:
        return null;
    L17:
        if (r02[r22 + 1] != (-1)) goto L20;
        this.f15475 = r22 + 2;
        return StandardCharsets.UTF_16BE;
    L25:
        return null;
    }

    /* JADX INFO: renamed from: ٴﹶ */
    public final int m8604() {
        byte[] r0 = this.f15476;
        int r1 = this.f15475;
        int r2 = r1 + 1;
        this.f15475 = r2;
        int r3 = (r0[r1] & 255) << 24;
        int r4 = r1 + 2;
        this.f15475 = r4;
        int r22 = ((r0[r2] & 255) << 16) | r3;
        int r32 = r1 + 3;
        this.f15475 = r32;
        int r23 = r22 | ((r0[r4] & 255) << 8);
        this.f15475 = r1 + 4;
        return (r0[r32] & 255) | r23;
    }

    /* JADX INFO: renamed from: ᴵˊ */
    public final int m8605() {
        byte[] r0 = this.f15476;
        int r1 = this.f15475;
        int r2 = r1 + 1;
        this.f15475 = r2;
        int r3 = (r0[r1] & 255) << 16;
        int r4 = r1 + 2;
        this.f15475 = r4;
        int r22 = ((r0[r2] & 255) << 8) | r3;
        this.f15475 = r1 + 3;
        return (r0[r4] & 255) | r22;
    }

    /* JADX INFO: renamed from: ᴵᵔ */
    public final int m8606() {
        byte[] r0 = this.f15476;
        int r1 = this.f15475;
        int r2 = r1 + 1;
        this.f15475 = r2;
        int r3 = (r0[r1] & 255) << 8;
        this.f15475 = r1 + 2;
        return (r0[r2] & 255) | r3;
    }

    /* JADX INFO: renamed from: ᵎˊ */
    public final void m8607(int r2) {
        if (r2 >= 0) goto L4;
    L6:
        boolean r0 = false;
    L7:
        AbstractC4214.m8560(r0);
        this.f15475 = r2;
        return;
    L4:
        if (r2 > this.f15474) goto L6;
        r0 = true;
        goto L7
    }

    /* JADX INFO: renamed from: ᵎⁱ */
    public final void m8608(int r1, byte[] r2) {
        this.f15476 = r2;
        this.f15474 = r1;
        this.f15475 = 0;
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public final int m8609(Charset r8) {
        AbstractC4214.m8554("Unsupported charset: " + r8, f15473.contains(r8));
        if (m8615() < m8581(r8)) goto L66;
        int r1 = 1;
        if (r8.equals(StandardCharsets.US_ASCII) == false) goto L11;
        byte r82 = this.f15476[this.f15475];
        if ((r82 & 128) != 0) goto L47;
        int r83 = r82 & 255;
    L64:
        return (r83 << 8) | r1;
    L47:
        return 0;
    L11:
        if (r8.equals(StandardCharsets.UTF_8) == false) goto L54;
        byte r84 = this.f15476[this.f15475];
        if ((r84 & 128) != 0) goto L16;
        int r85 = 1;
    L43:
        if (r85 == 1) goto L52;
        if (r85 == 2) goto L51;
        if (r85 == 3) goto L50;
        if (r85 != 4) goto L47;
        byte[] r0 = this.f15476;
        int r12 = this.f15475;
        int r02 = m8583(r0[r12], r0[r12 + 1], r0[r12 + 2], r0[r12 + 3]);
    L49:
        r1 = r85;
        r83 = r02;
        goto L64
    L50:
        byte[] r03 = this.f15476;
        int r13 = this.f15475;
        r02 = m8583(0, r03[r13] & 15, r03[r13 + 1], r03[r13 + 2]);
        goto L49
    L51:
        byte[] r04 = this.f15476;
        int r3 = this.f15475;
        r02 = m8583(0, 0, r04[r3], r04[r3 + 1]);
        goto L49
    L52:
        r02 = this.f15476[this.f15475] & 255;
        goto L49
    L16:
        if ((r84 & 224) != 192) goto L23;
        if (m8615() < 2) goto L23;
        if (m8582(this.f15476[this.f15475 + 1]) == false) goto L23;
        r85 = 2;
    L23:
        if ((this.f15476[this.f15475] & 240) != 224) goto L32;
        if (m8615() < 3) goto L32;
        if (m8582(this.f15476[this.f15475 + 1]) == false) goto L32;
        if (m8582(this.f15476[this.f15475 + 2]) == false) goto L32;
        r85 = 3;
    L32:
        if ((this.f15476[this.f15475] & 248) == 240) goto L34;
    L42:
        r85 = 0;
        goto L43
    L34:
        if (m8615() < 4) goto L42;
        if (m8582(this.f15476[this.f15475 + 1]) == false) goto L42;
        if (m8582(this.f15476[this.f15475 + 2]) == false) goto L42;
        if (m8582(this.f15476[this.f15475 + 3]) == false) goto L42;
        r85 = 4;
        goto L43
    L54:
        if (r8.equals(StandardCharsets.UTF_16LE) == false) goto L56;
        ByteOrder r86 = ByteOrder.LITTLE_ENDIAN;
    L57:
        char r05 = m8618(0, r86);
        if (Character.isHighSurrogate(r05) == true) goto L60;
    L62:
        r83 = r05;
        r1 = 2;
        goto L64
    L60:
        if (m8615() < 4) goto L62;
        r83 = Character.toCodePoint(r05, m8618(2, r86));
        r1 = 4;
        goto L64
    L56:
        r86 = ByteOrder.BIG_ENDIAN;
        goto L57
    L66:
        throw new IndexOutOfBoundsException("position=" + this.f15475 + ", limit=" + this.f15474);
    }

    /* JADX INFO: renamed from: ᵔʾ */
    public final long m8610() {
        byte[] r0 = this.f15476;
        int r1 = this.f15475;
        int r2 = r1 + 1;
        this.f15475 = r2;
        long r3 = ((long) r0[r1]) & 255;
        int r7 = r1 + 2;
        this.f15475 = r7;
        long r32 = r3 | ((((long) r0[r2]) & 255) << 8);
        int r8 = r1 + 3;
        this.f15475 = r8;
        long r33 = r32 | ((((long) r0[r7]) & 255) << 16);
        int r72 = r1 + 4;
        this.f15475 = r72;
        long r34 = r33 | ((((long) r0[r8]) & 255) << 24);
        int r82 = r1 + 5;
        this.f15475 = r82;
        long r35 = r34 | ((((long) r0[r72]) & 255) << 32);
        int r73 = r1 + 6;
        this.f15475 = r73;
        long r36 = r35 | ((((long) r0[r82]) & 255) << 40);
        int r83 = r1 + 7;
        this.f15475 = r83;
        long r37 = r36 | ((((long) r0[r73]) & 255) << 48);
        this.f15475 = r1 + 8;
        return ((((long) r0[r83]) & 255) << 56) | r37;
    }

    /* JADX INFO: renamed from: ᵔי */
    public final void m8611(int r2) {
        m8607(this.f15475 + r2);
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public final int m8612() {
        return this.f15476[this.f15475] & 255;
    }

    /* JADX INFO: renamed from: ᵔﹳ */
    public final int m8613() {
        int r0 = m8595();
        if (r0 < 0) goto L6;
        return r0;
    L6:
        throw new IllegalStateException(AbstractC4223.m8643(r0, "Top bit not zero: "));
    }

    /* JADX INFO: renamed from: ᵢˏ */
    public final int m8614() {
        byte[] r0 = this.f15476;
        int r1 = this.f15475;
        int r2 = r1 + 1;
        this.f15475 = r2;
        int r3 = (r0[r1] & 255) << 8;
        this.f15475 = r1 + 2;
        int r02 = (r0[r2] & 255) | r3;
        this.f15475 = r1 + 4;
        return r02;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final int m8615() {
        return Math.max(this.f15474 - this.f15475, 0);
    }

    /* JADX INFO: renamed from: ﹳᐧ */
    public final int m8616() {
        byte[] r0 = this.f15476;
        int r1 = this.f15475;
        int r2 = r1 + 1;
        this.f15475 = r2;
        int r3 = r0[r1] & 255;
        this.f15475 = r1 + 2;
        return ((r0[r2] & 255) << 8) | r3;
    }

    /* JADX INFO: renamed from: ﾞʻ */
    public final String m8617(Charset r5) {
        AbstractC4214.m8554("Unsupported charset: " + r5, f15473.contains(r5));
        if (m8615() != 0) goto L6;
        return null;
    L6:
        Charset r0 = StandardCharsets.US_ASCII;
        if (r5.equals(r0) == true) goto L10;
        m8603();
    L10:
        if (r5.equals(StandardCharsets.UTF_8) == false) goto L12;
    L24:
        int r02 = 1;
    L25:
        int r1 = this.f15475;
    L26:
        int r2 = this.f15474;
        if (r1 >= (r2 - (r02 - 1))) goto L52;
        if (r5.equals(StandardCharsets.UTF_8) == true) goto L33;
        if (r5.equals(StandardCharsets.US_ASCII) == true) goto L33;
    L36:
        if (r5.equals(StandardCharsets.UTF_16) == false) goto L38;
    L39:
        byte[] r22 = this.f15476;
        if (r22[r1] == 0) goto L42;
    L45:
        if (r5.equals(StandardCharsets.UTF_16LE) == false) goto L51;
        byte[] r23 = this.f15476;
        if (r23[r1 + 1] != 0) goto L51;
        if (AbstractC4195.m8490(r23[r1]) == false) goto L51;
    L53:
        String r03 = m8601(r1 - this.f15475, r5);
        if (this.f15475 != this.f15474) goto L57;
    L59:
        return r03;
    L57:
        if (m8593(r5, f15471) != '\r') goto L59;
        m8593(r5, f15472);
    L51:
        r1 = r1 + r02;
        goto L26
    L42:
        if (AbstractC4195.m8490(r22[r1 + 1]) == false) goto L45;
    L38:
        if (r5.equals(StandardCharsets.UTF_16BE) == false) goto L45;
    L33:
        if (AbstractC4195.m8490(this.f15476[r1]) == false) goto L36;
    L52:
        r1 = r2;
        goto L53
    L12:
        if (r5.equals(r0) == true) goto L24;
        if (r5.equals(StandardCharsets.UTF_16) == false) goto L17;
    L23:
        r02 = 2;
        goto L25
    L17:
        if (r5.equals(StandardCharsets.UTF_16LE) == true) goto L23;
        if (r5.equals(StandardCharsets.UTF_16BE) == true) goto L23;
        throw new IllegalArgumentException("Unsupported charset: " + r5);
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public final char m8618(int r2, ByteOrder r3) {
        if (r3 != ByteOrder.BIG_ENDIAN) goto L7;
        byte[] r32 = this.f15476;
        int r0 = this.f15475 + r2;
        byte r22 = r32[r0];
        byte r33 = r32[r0 + 1];
    L6:
        return (char) ((r22 << 8) | (r33 & 255));
    L7:
        byte[] r34 = this.f15476;
        int r02 = this.f15475 + r2;
        r22 = r34[r02 + 1];
        r33 = r34[r02];
        goto L6
    }
}
