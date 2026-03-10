package p222;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;

/* JADX INFO: renamed from: ˎﹶ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public final class C3461 extends FilterOutputStream implements DataOutput {
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.DataOutput
    public final void write(byte[] r2, int r3, int r4) {
        ((FilterOutputStream) this).out.write(r2, r3, r4);
    }

    @Override // java.io.DataOutput
    public final void writeBoolean(boolean r2) {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeBoolean(r2);
    }

    @Override // java.io.DataOutput
    public final void writeByte(int r2) {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeByte(r2);
    }

    @Override // java.io.DataOutput
    public final void writeBytes(String r2) {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeBytes(r2);
    }

    @Override // java.io.DataOutput
    public final void writeChar(int r1) {
        writeShort(r1);
    }

    @Override // java.io.DataOutput
    public final void writeChars(String r3) {
        int r0 = 0;
    L4:
        if (r0 >= r3.length()) goto L6;
        writeShort(r3.charAt(r0));
        r0 = r0 + 1;
        goto L4
    }

    @Override // java.io.DataOutput
    public final void writeDouble(double r1) {
        writeLong(Double.doubleToLongBits(r1));
    }

    @Override // java.io.DataOutput
    public final void writeFloat(float r1) {
        writeInt(Float.floatToIntBits(r1));
    }

    @Override // java.io.DataOutput
    public final void writeInt(int r3) {
        ((FilterOutputStream) this).out.write(r3 & 255);
        ((FilterOutputStream) this).out.write((r3 >> 8) & 255);
        ((FilterOutputStream) this).out.write((r3 >> 16) & 255);
        ((FilterOutputStream) this).out.write((r3 >> 24) & 255);
    }

    @Override // java.io.DataOutput
    public final void writeLong(long r6) {
        long r62 = Long.reverseBytes(r6);
        byte[] r1 = new byte[8];
        int r2 = 7;
    L3:
        if (r2 < 0) goto L5;
        r1[r2] = (byte) (255 & r62);
        r62 = r62 >> 8;
        r2 = r2 - 1;
        goto L3
    L5:
        write(r1, 0, 8);
    }

    @Override // java.io.DataOutput
    public final void writeShort(int r3) {
        ((FilterOutputStream) this).out.write(r3 & 255);
        ((FilterOutputStream) this).out.write((r3 >> 8) & 255);
    }

    @Override // java.io.DataOutput
    public final void writeUTF(String r2) {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeUTF(r2);
    }
}
