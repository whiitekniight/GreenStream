package p176;

import com.bumptech.glide.ˈ;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import p047.AbstractC1703;
import p405.AbstractC5190;
import p447.AbstractC5635;
import p447.AbstractC5637;
import ˈˆ.ﾞᴵ;

/* JADX INFO: renamed from: ˊᐧ.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public class C3054 implements Serializable, Comparable {

    /* JADX INFO: renamed from: ˈٴ */
    public static final C3054 f10707 = null;

    /* JADX INFO: renamed from: ʽʽ */
    public transient String f10708;

    /* JADX INFO: renamed from: ʾˋ */
    public final byte[] f10709;

    /* JADX INFO: renamed from: ᴵˊ */
    public transient int f10710;

    static {
        f10707 = new C3054(new byte[0]);
    }

    public C3054(byte[] r1) {
        this.f10709 = r1;
    }

    /* JADX INFO: renamed from: ᵔʾ */
    public static /* synthetic */ C3054 m6456(C3054 r1, int r2, int r3, int r4) {
        if ((r4 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r3 = -1234567890;
    L9:
        return r1.mo6463(r2, r3);
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public static int m6457(C3054 r1, C3054 r2) {
        r1.getClass();
        return r1.mo6465(0, r2.mo6467());
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object r1) {
        return m6470((C3054) r1);
    }

    public boolean equals(Object r5) {
        if (r5 != this) goto L5;
        return true;
    L5:
        if ((r5 instanceof C3054) == false) goto L12;
        C3054 r52 = (C3054) r5;
        int r0 = r52.mo6460();
        byte[] r2 = this.f10709;
        if (r0 != r2.length) goto L12;
        if (r52.mo6461(0, 0, r2.length, r2) == false) goto L12;
        return true;
    L12:
        return false;
    }

    public int hashCode() {
        int r0 = this.f10710;
        if (r0 == 0) goto L5;
        return r0;
    L5:
        int r02 = Arrays.hashCode(this.f10709);
        this.f10710 = r02;
        return r02;
    }

    public String toString() {
        byte[] r1 = this.f10709;
        if (r1.length != 0) goto L6;
        return "[size=0]";
    L6:
        int r2 = r1.length;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
    L8:
        if (r4 >= r2) goto L181;
        byte r9 = r1[r4];
        int r16 = 2;
        if (r9 >= 0) goto L11;
        if ((r9 >> 5) != (-2)) goto L83;
        int r3 = r4 + 1;
        if (r2 <= r3) goto L53;
        byte r32 = r1[r3];
        if ((r32 & 192) != 128) goto L80;
        int r33 = (r32 ^ 3968) ^ (r9 << 6);
        if (r33 < 128) goto L59;
        int r7 = r6 + 1;
        if (r6 == 64) goto L181;
        if (r33 == 10) goto L73;
        if (r33 == 13) goto L73;
        if (r33 < 0) goto L69;
        if (r33 >= 32) goto L69;
    L179:
        r5 = -1;
    L69:
        if (127 > r33) goto L73;
        if (r33 < 160) goto L179;
    L73:
        if (r33 == 65533) goto L179;
        if (r33 >= 65536) goto L78;
        r16 = 1;
    L78:
        r5 = r5 + r16;
        r4 = r4 + 2;
    L79:
        r6 = r7;
        goto L8
    L59:
        if (r6 != 64) goto L179;
    L80:
        if (r6 != 64) goto L179;
    L53:
        if (r6 != 64) goto L179;
    L83:
        if ((r9 >> 4) != (-2)) goto L126;
        int r34 = r4 + 2;
        if (r2 <= r34) goto L86;
        byte r72 = r1[r4 + 1];
        if ((r72 & 192) != 128) goto L123;
        byte r35 = r1[r34];
        if ((r35 & 192) != 128) goto L121;
        int r36 = ((r35 ^ (-123008)) ^ (r72 << 6)) ^ (r9 << 12);
        if (r36 < 2048) goto L94;
        if (55296 > r36) goto L100;
        if (r36 >= 57344) goto L100;
        if (r6 != 64) goto L179;
    L100:
        r7 = r6 + 1;
        if (r6 == 64) goto L181;
        if (r36 == 10) goto L115;
        if (r36 == 13) goto L115;
        if (r36 < 0) goto L110;
        if (r36 < 32) goto L179;
    L110:
        if (127 > r36) goto L115;
        if (r36 < 160) goto L179;
    L115:
        if (r36 == 65533) goto L179;
        if (r36 >= 65536) goto L120;
        r16 = 1;
    L120:
        r5 = r5 + r16;
        r4 = r4 + 3;
        goto L79
    L94:
        if (r6 != 64) goto L179;
    L121:
        if (r6 != 64) goto L179;
    L123:
        if (r6 != 64) goto L179;
    L86:
        if (r6 != 64) goto L179;
    L126:
        if ((r9 >> 3) != (-2)) goto L177;
        int r37 = r4 + 3;
        if (r2 <= r37) goto L129;
        byte r73 = r1[r4 + 1];
        if ((r73 & 192) != 128) goto L175;
        byte r13 = r1[r4 + 2];
        if ((r13 & 192) != 128) goto L173;
        byte r38 = r1[r37];
        if ((r38 & 192) != 128) goto L171;
        int r39 = (((r38 ^ 3678080) ^ (r13 << 6)) ^ (r73 << 12)) ^ (r9 << 18);
        if (r39 > 1114111) goto L139;
        if (55296 > r39) goto L146;
        if (r39 >= 57344) goto L146;
        if (r6 != 64) goto L179;
    L146:
        if (r39 < 65536) goto L147;
        r7 = r6 + 1;
        if (r6 == 64) goto L181;
        if (r39 == 10) goto L165;
        if (r39 == 13) goto L165;
        if (r39 < 0) goto L160;
        if (r39 < 32) goto L179;
    L160:
        if (127 > r39) goto L165;
        if (r39 < 160) goto L179;
    L165:
        if (r39 == 65533) goto L179;
        if (r39 >= 65536) goto L170;
        r16 = 1;
    L170:
        r5 = r5 + r16;
        r4 = r4 + 4;
        goto L79
    L147:
        if (r6 != 64) goto L179;
    L139:
        if (r6 != 64) goto L179;
    L171:
        if (r6 != 64) goto L179;
    L173:
        if (r6 != 64) goto L179;
    L175:
        if (r6 != 64) goto L179;
    L129:
        if (r6 != 64) goto L179;
    L177:
        if (r6 != 64) goto L179;
    L11:
        int r18 = r6 + 1;
        if (r6 == 64) goto L181;
        if (r9 == 10) goto L22;
        if (r9 == 13) goto L22;
        if (r9 < 0) goto L19;
        if (r9 < 32) goto L179;
    L19:
        if (127 > r9) goto L22;
        if (r9 < 160) goto L179;
    L22:
        if (r9 == 65533) goto L179;
        if (r9 >= 65536) goto L26;
        int r62 = 1;
    L27:
        r5 = r5 + r62;
        r4 = r4 + 1;
    L28:
        r6 = r18;
        if (r4 >= r2) goto L8;
        byte r92 = r1[r4];
        if (r92 < 0) goto L8;
        r4 = r4 + 1;
        r18 = r6 + 1;
        if (r6 == 64) goto L181;
        if (r92 == 10) goto L43;
        if (r92 == 13) goto L43;
        if (r92 < 0) goto L40;
        if (r92 < 32) goto L179;
    L40:
        if (127 > r92) goto L43;
        if (r92 < 160) goto L179;
    L43:
        if (r92 == 65533) goto L179;
        if (r92 >= 65536) goto L47;
        int r63 = 1;
    L48:
        r5 = r5 + r63;
        goto L28
    L47:
        r63 = 2;
        goto L48
    L26:
        r62 = 2;
    L181:
        if (r5 == (-1)) goto L183;
        String r64 = m6459();
        String r74 = AbstractC5635.m10861(AbstractC5635.m10861(AbstractC5635.m10861(r64.substring(0, r5), "\\", "\\\\", false), "\n", "\\n", false), "\r", "\\r", false);
        if (r5 >= r64.length()) goto L201;
        return "[size=" + r1.length + " text=" + r74 + "\u2026]";
    L201:
        return AbstractC1703.m4492(']', "[text=", r74);
    L183:
        if (r1.length <= 64) goto L185;
        StringBuilder r42 = new StringBuilder("[size=");
        r42.append(r1.length);
        r42.append(" hex=");
        if (64 > r1.length) goto L195;
        if (64 != r1.length) goto L191;
        C3054 r310 = this;
    L192:
        r42.append(r310.mo6462());
        r42.append("\u2026]");
        return r42.toString();
    L191:
        ﾞᴵ.ᵎﹶ(64, r1.length);
        r310 = new C3054(Arrays.copyOfRange(r1, 0, 64));
        goto L192
    L195:
        throw new IllegalArgumentException(AbstractC1703.m4495(new StringBuilder("endIndex > length("), r1.length, ')').toString());
    L185:
        return "[hex=" + mo6462() + ']';
    }

    /* JADX INFO: renamed from: ʼˎ */
    public int mo6458(byte[] r5) {
        int r0 = mo6460();
        byte[] r1 = this.f10709;
        int r02 = Math.min(r0, r1.length - r5.length);
    L4:
        if ((-1) >= r02) goto L9;
        if (ˈ.ⁱˊ(r1, r02, r5, 0, r5.length) == true) goto L7;
        r02 = r02 - 1;
        goto L4
    L7:
        return r02;
    L9:
        return -1;
    }

    /* JADX INFO: renamed from: ʼᐧ */
    public final String m6459() {
        String r0 = this.f10708;
        if (r0 != null) goto L6;
        String r1 = new String(mo6467(), AbstractC5637.f20377);
        this.f10708 = r1;
        return r1;
    L6:
        return r0;
    }

    /* JADX INFO: renamed from: ʽ */
    public int mo6460() {
        return this.f10709.length;
    }

    /* JADX INFO: renamed from: ˆʾ */
    public boolean mo6461(int r3, int r4, int r5, byte[] r6) {
        if (r3 < 0) goto L12;
        byte[] r0 = this.f10709;
        if (r3 > (r0.length - r5)) goto L14;
        if (r4 >= 0) goto L7;
        return false;
    L7:
        if (r4 <= (r6.length - r5)) goto L9;
        return false;
    L9:
        if (ˈ.ⁱˊ(r0, r3, r6, r4, r5) == false) goto L17;
        return true;
    L17:
        return false;
    L14:
        return false;
    L12:
        return false;
    }

    /* JADX INFO: renamed from: ˈ */
    public String mo6462() {
        byte[] r0 = this.f10709;
        char[] r1 = new char[r0.length * 2];
        int r2 = r0.length;
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r3 >= r2) goto L6;
        byte r5 = r0[r3];
        int r6 = r4 + 1;
        char[] r8 = AbstractC5190.f18737;
        r1[r4] = r8[(r5 >> 4) & 15];
        r4 = r4 + 2;
        r1[r6] = r8[r5 & 15];
        r3 = r3 + 1;
        goto L3
    L6:
        return new String(r1);
    }

    /* JADX INFO: renamed from: ˉʿ */
    public C3054 mo6463(int r4, int r5) {
        if (r5 != (-1234567890)) goto L5;
        r5 = mo6460();
    L5:
        if (r4 < 0) goto L21;
        byte[] r0 = this.f10709;
        if (r5 > r0.length) goto L19;
        if ((r5 - r4) < 0) goto L17;
        if (r4 == 0) goto L12;
    L14:
        ﾞᴵ.ᵎﹶ(r5, r0.length);
        return new C3054(Arrays.copyOfRange(r0, r4, r5));
    L12:
        if (r5 != r0.length) goto L14;
        return this;
    L17:
        throw new IllegalArgumentException("endIndex < beginIndex");
    L19:
        throw new IllegalArgumentException(AbstractC1703.m4495(new StringBuilder("endIndex > length("), r0.length, ')').toString());
    L21:
        throw new IllegalArgumentException("beginIndex < 0");
    }

    /* JADX INFO: renamed from: ˉˆ */
    public C3054 mo6464() {
        int r0 = 0;
    L3:
        byte[] r1 = this.f10709;
        if (r0 >= r1.length) goto L22;
        byte r2 = r1[r0];
        if (r2 < 65) goto L21;
        if (r2 > 90) goto L21;
        byte[] r12 = Arrays.copyOf(r1, r1.length);
        int r5 = r0 + 1;
        r12[r0] = (byte) (r2 + 32);
    L12:
        if (r5 >= r12.length) goto L20;
        byte r02 = r12[r5];
        if (r02 < 65) goto L18;
        if (r02 > 90) goto L18;
        r12[r5] = (byte) (r02 + 32);
    L18:
        r5 = r5 + 1;
        goto L12
    L20:
        return new C3054(r12);
    L21:
        r0 = r0 + 1;
        goto L3
    L22:
        return this;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public int mo6465(int r5, byte[] r6) {
        byte[] r0 = this.f10709;
        int r1 = r0.length - r6.length;
        int r52 = Math.max(r5, 0);
        if (r52 <= r1) goto L5;
        return -1;
    L5:
        if (ˈ.ⁱˊ(r0, r52, r6, 0, r6.length) == true) goto L6;
        if (r52 == r1) goto L13;
        r52 = r52 + 1;
        goto L5
    L13:
        return -1;
    L6:
        return r52;
    }

    /* JADX INFO: renamed from: ٴﹶ */
    public boolean mo6466(int r3, C3054 r4, int r5) {
        return r4.mo6461(0, r3, r5, this.f10709);
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public byte[] mo6467() {
        return this.f10709;
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public byte mo6468(int r2) {
        return this.f10709[r2];
    }

    /* JADX INFO: renamed from: ᵔﹳ */
    public void mo6469(C3082 r3, int r4) {
        r3.write(this.f10709, 0, r4);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final int m6470(C3054 r10) {
        int r0 = mo6460();
        int r1 = r10.mo6460();
        int r2 = Math.min(r0, r1);
        int r4 = 0;
    L4:
        if (r4 >= r2) goto L11;
        int r7 = mo6468(r4) & 255;
        int r8 = r10.mo6468(r4) & 255;
        if (r7 != r8) goto L8;
        r4 = r4 + 1;
        goto L4
    L8:
        if (r7 >= r8) goto L10;
        return -1;
    L10:
        return 1;
    L11:
        if (r0 != r1) goto L13;
        return 0;
    L13:
        if (r0 >= r1) goto L15;
        return -1;
    L15:
        return 1;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public String mo6471() {
        byte[] r0 = AbstractC3079.f10774;
        byte[] r1 = this.f10709;
        byte[] r2 = new byte[((r1.length + 2) / 3) * 4];
        int r4 = r1.length - (r1.length % 3);
        int r5 = 0;
        int r6 = 0;
    L3:
        if (r5 >= r4) goto L5;
        byte r8 = r1[r5];
        int r9 = r5 + 2;
        byte r7 = r1[r5 + 1];
        r5 = r5 + 3;
        byte r92 = r1[r9];
        r2[r6] = r0[(r8 & 255) >> 2];
        r2[r6 + 1] = r0[((r8 & 3) << 4) | ((r7 & 255) >> 4)];
        int r82 = r6 + 3;
        r2[r6 + 2] = r0[((r7 & 15) << 2) | ((r92 & 255) >> 6)];
        r6 = r6 + 4;
        r2[r82] = r0[r92 & 63];
        goto L3
    L5:
        int r72 = r1.length - r4;
        if (r72 == 1) goto L10;
        if (r72 != 2) goto L12;
        int r42 = r5 + 1;
        byte r52 = r1[r5];
        byte r12 = r1[r42];
        r2[r6] = r0[(r52 & 255) >> 2];
        r2[r6 + 1] = r0[((r52 & 3) << 4) | ((r12 & 255) >> 4)];
        r2[r6 + 2] = r0[(r12 & 15) << 2];
        r2[r6 + 3] = 61;
    L12:
        return new String(r2, AbstractC5637.f20377);
    L10:
        byte r13 = r1[r5];
        r2[r6] = r0[(r13 & 255) >> 2];
        r2[r6 + 1] = r0[(r13 & 3) << 4];
        r2[r6 + 2] = 61;
        r2[r6 + 3] = 61;
        goto L12
    }

    /* JADX INFO: renamed from: ﾞʻ */
    public String mo6472(Charset r3) {
        return new String(this.f10709, r3);
    }
}
