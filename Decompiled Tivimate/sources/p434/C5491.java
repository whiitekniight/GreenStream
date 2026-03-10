package p434;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import p047.AbstractC1703;

/* JADX INFO: renamed from: ﹳﹳ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public class C5491 extends InputStream implements DataInput {

    /* JADX INFO: renamed from: ˊʻ */
    public static final ByteOrder f19685 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final ByteOrder f19686 = null;

    /* JADX INFO: renamed from: ʽʽ */
    public int f19687;

    /* JADX INFO: renamed from: ʾˋ */
    public final DataInputStream f19688;

    /* JADX INFO: renamed from: ˈٴ */
    public byte[] f19689;

    /* JADX INFO: renamed from: ᴵˊ */
    public ByteOrder f19690;

    static {
        f19686 = ByteOrder.LITTLE_ENDIAN;
        f19685 = ByteOrder.BIG_ENDIAN;
    }

    public C5491(InputStream r2) {
        ByteOrder r0 = ByteOrder.BIG_ENDIAN;
        this(r2, 0);
    }

    public C5491(InputStream r2, int r3) {
        ByteOrder r32 = ByteOrder.BIG_ENDIAN;
        this.f19690 = r32;
        DataInputStream r0 = new DataInputStream(r2);
        this.f19688 = r0;
        r0.mark(0);
        this.f19687 = 0;
        this.f19690 = r32;
    }

    public C5491(byte[] r2) {
        ByteArrayInputStream r0 = new ByteArrayInputStream(r2);
        ByteOrder r22 = ByteOrder.BIG_ENDIAN;
        this(r0, 0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f19688.available();
    }

    @Override // java.io.InputStream
    public final void mark(int r2) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f19687++;
        return this.f19688.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] r2, int r3, int r4) {
        int r22 = this.f19688.read(r2, r3, r4);
        this.f19687 += r22;
        return r22;
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f19687++;
        return this.f19688.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f19687++;
        int r0 = this.f19688.read();
        if (r0 < 0) goto L7;
        return (byte) r0;
    L7:
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f19687 += 2;
        return this.f19688.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] r3) {
        this.f19687 += r3.length;
        this.f19688.readFully(r3);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] r2, int r3, int r4) {
        this.f19687 += r4;
        this.f19688.readFully(r2, r3, r4);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f19687 += 4;
        DataInputStream r0 = this.f19688;
        int r1 = r0.read();
        int r2 = r0.read();
        int r3 = r0.read();
        int r02 = r0.read();
        if ((((r1 | r2) | r3) | r02) < 0) goto L15;
        ByteOrder r4 = this.f19690;
        if (r4 != f19686) goto L9;
        return (((r02 << 24) + (r3 << 16)) + (r2 << 8)) + r1;
    L9:
        if (r4 != f19685) goto L13;
        return (((r1 << 24) + (r2 << 16)) + (r3 << 8)) + r02;
    L13:
        throw new IOException("Invalid byte order: " + this.f19690);
    L15:
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readLine() {
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        this.f19687 += 8;
        DataInputStream r1 = this.f19688;
        int r3 = r1.read();
        int r4 = r1.read();
        int r5 = r1.read();
        int r6 = r1.read();
        int r7 = r1.read();
        int r8 = r1.read();
        int r9 = r1.read();
        int r12 = r1.read();
        if ((((((((r3 | r4) | r5) | r6) | r7) | r8) | r9) | r12) < 0) goto L15;
        ByteOrder r10 = this.f19690;
        if (r10 != f19686) goto L10;
        long r102 = ((((((((long) r12) << 56) + (((long) r9) << 48)) + (((long) r8) << 40)) + (((long) r7) << 32)) + (((long) r6) << 24)) + (((long) r5) << 16)) + (((long) r4) << 8);
        long r13 = r3;
    L8:
        return r102 + r13;
    L10:
        if (r10 != f19685) goto L13;
        r102 = ((((((((long) r3) << 56) + (((long) r4) << 48)) + (((long) r5) << 40)) + (((long) r6) << 32)) + (((long) r7) << 24)) + (((long) r8) << 16)) + (((long) r9) << 8);
        r13 = r12;
        goto L8
    L13:
        throw new IOException("Invalid byte order: " + this.f19690);
    L15:
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f19687 += 2;
        DataInputStream r0 = this.f19688;
        int r1 = r0.read();
        int r02 = r0.read();
        if ((r1 | r02) < 0) goto L15;
        ByteOrder r2 = this.f19690;
        if (r2 != f19686) goto L9;
        return (short) ((r02 << 8) + r1);
    L9:
        if (r2 != f19685) goto L13;
        return (short) ((r1 << 8) + r02);
    L13:
        throw new IOException("Invalid byte order: " + this.f19690);
    L15:
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f19687 += 2;
        return this.f19688.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f19687++;
        return this.f19688.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f19687 += 2;
        DataInputStream r0 = this.f19688;
        int r1 = r0.read();
        int r02 = r0.read();
        if ((r1 | r02) < 0) goto L15;
        ByteOrder r2 = this.f19690;
        if (r2 != f19686) goto L9;
        return (r02 << 8) + r1;
    L9:
        if (r2 != f19685) goto L13;
        return (r1 << 8) + r02;
    L13:
        throw new IOException("Invalid byte order: " + this.f19690);
    L15:
        throw new EOFException();
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int r2) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m10602(int r7) {
        int r1 = 0;
    L3:
        if (r1 >= r7) goto L15;
        int r2 = r7 - r1;
        DataInputStream r5 = this.f19688;
        int r3 = (int) r5.skip(r2);
        if (r3 > 0) goto L14;
        if (this.f19689 != null) goto L9;
        this.f19689 = new byte[8192];
    L9:
        r3 = r5.read(this.f19689, 0, Math.min(8192, r2));
        if (r3 != (-1)) goto L14;
        throw new EOFException(AbstractC1703.m4484(r7, "Reached EOF while skipping ", " bytes."));
    L14:
        r1 = r1 + r3;
        goto L3
    L15:
        this.f19687 += r1;
    }
}
