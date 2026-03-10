package p388;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import p319.AbstractC4223;

/* JADX INFO: renamed from: ᵢٴ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C5018 {

    /* JADX INFO: renamed from: ʽ */
    public C5020 f17912;

    /* JADX INFO: renamed from: ˈ */
    public int f17913;

    /* JADX INFO: renamed from: ⁱˊ */
    public ByteBuffer f17914;

    /* JADX INFO: renamed from: ﹳٴ */
    public final byte[] f17915;

    public C5018() {
        this.f17915 = new byte[256];
        this.f17913 = 0;
    }

    /* JADX INFO: renamed from: ʽ */
    public final int m9819() {
        return this.f17914.get() & 255;
    L5:
        this.f17912.f17944 = 1;
        return 0;
    }

    /* JADX INFO: renamed from: ˈ */
    public final void m9820() {
        int r0 = m9819();
        this.f17913 = r0;
        if (r0 <= 0) goto L18;
        int r02 = 0;
        int r1 = 0;
    L15:
        r1 = this.f17913;     // Catch: Exception -> L9
        if (r02 >= r1) goto L19;
        r1 = r1 - r02;     // Catch: Exception -> L9
        this.f17914.get(this.f17915, r02, r1);     // Catch: Exception -> L9
        r02 = r02 + r1;
        goto L15
    L19:
        return;
    L11:
        if (Log.isLoggable("GifHeaderParser", 3) == false) goto L13;
        StringBuilder r03 = AbstractC4223.m8655("Error Reading Block n: ", r02, " count: ", r1, " blockSize: ");
        r03.append(this.f17913);
        r03.toString();
    L13:
        this.f17912.f17944 = 1;
        return;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final int[] m9821(int r10) {
        byte[] r0 = new byte[r10 * 3];
        int[] r1 = null;
        this.f17914.get(r0);     // Catch: BufferUnderflowException -> L7
        r1 = new int[256];     // Catch: BufferUnderflowException -> L7
        int r2 = 0;
        int r3 = 0;
    L4:
        if (r2 >= r10) goto L9;
        int r5 = r0[r3] & 255;     // Catch: BufferUnderflowException -> L7
        int r6 = r3 + 2;     // Catch: BufferUnderflowException -> L7
        int r4 = r0[r3 + 1] & 255;     // Catch: BufferUnderflowException -> L7
        r3 = r3 + 3;     // Catch: BufferUnderflowException -> L7
        int r7 = r2 + 1;     // Catch: BufferUnderflowException -> L7
        r1[r2] = ((r4 << 8) | ((r5 << 16) | (-16777216))) | (r0[r6] & 255);     // Catch: BufferUnderflowException -> L7
        r2 = r7;
        goto L4
    L9:
        return r1;
    L11:
        if (Log.isLoggable("GifHeaderParser", 3) == true) goto L13;
    L13:
        this.f17912.f17944 = 1;
        return r1;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final C5020 m9822() {
        if (this.f17914 == null) goto L102;
        if (m9823() == true) goto L7;
        StringBuilder r0 = new StringBuilder();
        int r2 = 0;
    L10:
        if (r2 >= 6) goto L13;
        r0.append((char) m9819());
        r2 = r2 + 1;
        goto L10
    L13:
        if (r0.toString().startsWith("GIF") == true) goto L15;
        this.f17912.f17944 = 1;
    L25:
        if (m9823() == true) goto L100;
        boolean r02 = false;
    L27:
        if (r02 == true) goto L96;
        if (m9823() == true) goto L96;
        if (this.f17912.f17937 > Integer.MAX_VALUE) goto L96;
        int r5 = m9819();
        if (r5 != 33) goto L35;
        int r52 = m9819();
        if (r52 != 1) goto L62;
        m9824();
        goto L27
    L62:
        if (r52 != 249) goto L64;
        this.f17912.f17939 = new C5021();
        m9819();
        int r53 = m9819();
        C5021 r6 = this.f17912.f17939;
        int r8 = (r53 & 28) >> 2;
        r6.f17953 = r8;
        if (r8 != 0) goto L88;
        r6.f17953 = 1;
    L88:
        if ((r53 & 1) == 0) goto L90;
        boolean r54 = true;
    L91:
        r6.f17957 = r54;
        short r55 = this.f17914.getShort();
        if (r55 >= 2) goto L94;
        r55 = 10;
    L94:
        C5021 r7 = this.f17912.f17939;
        r7.f17947 = r55 * 10;
        r7.f17954 = m9819();
        m9819();
        goto L27
    L90:
        r54 = false;
        goto L91
    L64:
        if (r52 != 254) goto L66;
        m9824();
        goto L27
    L66:
        if (r52 != 255) goto L67;
        m9820();
        StringBuilder r56 = new StringBuilder();
        int r62 = 0;
    L69:
        byte[] r9 = this.f17915;
        if (r62 >= 11) goto L73;
        r56.append((char) r9[r62]);
        r62 = r62 + 1;
        goto L69
    L73:
        if (r56.toString().equals("NETSCAPE2.0") == true) goto L74;
        m9824();
    L74:
        m9820();
        if (r9[0] != 1) goto L78;
        byte r57 = r9[1];
        byte r58 = r9[2];
        this.f17912.getClass();
    L78:
        if (this.f17913 <= 0) goto L27;
        if (m9823() == false) goto L74;
    L67:
        m9824();
        goto L27
    L35:
        if (r5 != 44) goto L37;
        C5020 r59 = this.f17912;
        if (r59.f17939 != null) goto L43;
        r59.f17939 = new C5021();
    L43:
        r59.f17939.f17956 = this.f17914.getShort();
        this.f17912.f17939.f17955 = this.f17914.getShort();
        this.f17912.f17939.f17948 = this.f17914.getShort();
        this.f17912.f17939.f17950 = this.f17914.getShort();
        int r510 = m9819();
        if ((r510 & 128) == 0) goto L46;
        boolean r63 = true;
    L47:
        int r72 = (int) Math.pow(2.0d, (r510 & 7) + 1);
        C5021 r82 = this.f17912.f17939;
        if ((r510 & 64) == 0) goto L50;
        boolean r511 = true;
    L51:
        r82.f17951 = r511;
        if (r63 == false) goto L54;
        r82.f17952 = m9821(r72);
    L55:
        this.f17912.f17939.f17949 = this.f17914.position();
        m9819();
        m9824();
        if (m9823() == true) goto L27;
        C5020 r512 = this.f17912;
        r512.f17937++;
        r512.f17940.add(r512.f17939);
        goto L27
    L54:
        r82.f17952 = null;
        goto L55
    L50:
        r511 = false;
        goto L51
    L46:
        r63 = false;
        goto L47
    L37:
        if (r5 != 59) goto L38;
        r02 = true;
        goto L27
    L38:
        this.f17912.f17944 = 1;
    L96:
        C5020 r03 = this.f17912;
        if (r03.f17937 >= 0) goto L100;
        r03.f17944 = 1;
    L100:
        return this.f17912;
    L15:
        this.f17912.f17946 = this.f17914.getShort();
        this.f17912.f17942 = this.f17914.getShort();
        int r04 = m9819();
        C5020 r513 = this.f17912;
        if ((r04 & 128) == 0) goto L18;
        boolean r64 = true;
    L19:
        r513.f17943 = r64;
        r513.f17936 = (int) Math.pow(2.0d, (r04 & 7) + 1);
        this.f17912.f17938 = m9819();
        C5020 r05 = this.f17912;
        m9819();
        r05.getClass();
        if (this.f17912.f17943 == false) goto L25;
        if (m9823() == true) goto L25;
        C5020 r06 = this.f17912;
        r06.f17945 = m9821(r06.f17936);
        C5020 r07 = this.f17912;
        r07.f17941 = r07.f17945[r07.f17938];
        goto L25
    L18:
        r64 = false;
        goto L19
    L7:
        return this.f17912;
    L102:
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final boolean m9823() {
        if (this.f17912.f17944 == 0) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public final void m9824() {
    L2:
        int r0 = m9819();
        int r1 = Math.min(this.f17914.position() + r0, this.f17914.limit());
        this.f17914.position(r1);
        if (r0 > 0) goto L2;
    }
}
