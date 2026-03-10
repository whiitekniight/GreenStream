package p222;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import ˈˊ.ˉˆ;

/* JADX INFO: renamed from: ˎﹶ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C3458 extends FilterInputStream implements DataInput {
    public C3458(C3456 r1) {
        super(r1);
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        if (readUnsignedByte() == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        return (byte) readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        return (char) readUnsignedShort();
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
        int r0 = AbstractC3459.f12319;
        AbstractC3459.m7214(this, r3, 0, r3.length);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] r1, int r2, int r3) {
        AbstractC3459.m7214(this, r1, r2, r3);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        byte r0 = m7212();
        byte r1 = m7212();
        byte r2 = m7212();
        return ˉˆ.ˉˆ(m7212(), r2, r1, r0);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    @Override // java.io.DataInput
    public final long readLong() {
        byte r0 = m7212();
        byte r1 = m7212();
        byte r2 = m7212();
        byte r3 = m7212();
        byte r4 = m7212();
        byte r5 = m7212();
        byte r6 = m7212();
        long r52 = (((long) r5) & 255) << 40;
        long r32 = (((long) r3) & 255) << 24;
        long r12 = (((long) r1) & 255) << 8;
        return (r12 | ((r32 | ((r52 | (((((long) m7212()) & 255) << 56) | ((((long) r6) & 255) << 48))) | ((((long) r4) & 255) << 32))) | ((((long) r2) & 255) << 16))) | (((long) r0) & 255);
    }

    @Override // java.io.DataInput
    public final short readShort() {
        return (short) readUnsignedShort();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        return new DataInputStream(((FilterInputStream) this).in).readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        int r0 = ((FilterInputStream) this).in.read();
        if (r0 < 0) goto L6;
        return r0;
    L6:
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        byte r0 = m7212();
        return ˉˆ.ˉˆ((byte) 0, (byte) 0, m7212(), r0);
    }

    @Override // java.io.DataInput
    public final int skipBytes(int r4) {
        return (int) ((FilterInputStream) this).in.skip(r4);
    }

    /* JADX INFO: renamed from: ʽ */
    public final byte m7212() {
        int r0 = ((FilterInputStream) this).in.read();
        if ((-1) == r0) goto L7;
        return (byte) r0;
    L7:
        throw new EOFException();
    }
}
