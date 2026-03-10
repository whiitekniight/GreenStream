package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.OutputStream;
import p269.C3880;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C0216 extends OutputStream {

    /* JADX INFO: renamed from: ʽʽ */
    public final C3880 f1628;

    /* JADX INFO: renamed from: ʾˋ */
    public final FileOutputStream f1629;

    /* JADX INFO: renamed from: ˈٴ */
    public int f1630;

    /* JADX INFO: renamed from: ᴵˊ */
    public byte[] f1631;

    public C0216(FileOutputStream r2, C3880 r3) {
        this.f1629 = r2;
        this.f1628 = r3;
        this.f1631 = (byte[]) r3.m8004(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileOutputStream r0 = this.f1629;
        flush();     // Catch: Throwable -> L8
        r0.close();
        byte[] r02 = this.f1631;
        if (r02 == null) goto L13;
        this.f1628.m8007(r02);
        this.f1631 = null;
        return;
    L13:
        return;
    L8:
        th = move-exception;
        r0.close();
        throw th;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        int r0 = this.f1630;
        FileOutputStream r1 = this.f1629;
        if (r0 <= 0) goto L5;
        r1.write(this.f1631, 0, r0);
        this.f1630 = 0;
    L5:
        r1.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int r4) {
        byte[] r0 = this.f1631;
        int r1 = this.f1630;
        int r2 = r1 + 1;
        this.f1630 = r2;
        r0[r1] = (byte) r4;
        if (r2 != r0.length) goto L7;
        if (r2 <= 0) goto L8;
        this.f1629.write(r0, 0, r2);
        this.f1630 = 0;
        return;
    L8:
        return;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] r3) {
        write(r3, 0, r3.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] r8, int r9, int r10) {
        int r1 = 0;
    L3:
        int r2 = r10 - r1;
        int r3 = r9 + r1;
        int r4 = this.f1630;
        FileOutputStream r5 = this.f1629;
        if (r4 == 0) goto L6;
    L9:
        int r22 = Math.min(r2, this.f1631.length - r4);
        System.arraycopy(r8, r3, this.f1631, this.f1630, r22);
        int r32 = this.f1630 + r22;
        this.f1630 = r32;
        r1 = r1 + r22;
        byte[] r23 = this.f1631;
        if (r32 != r23.length) goto L13;
        if (r32 <= 0) goto L13;
        r5.write(r23, 0, r32);
        this.f1630 = 0;
    L13:
        if (r1 < r10) goto L3;
        return;
    L6:
        if (r2 < this.f1631.length) goto L9;
        r5.write(r8, r3, r2);
    }
}
