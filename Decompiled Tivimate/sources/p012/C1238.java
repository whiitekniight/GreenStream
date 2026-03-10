package p012;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import p005j$.util.Objects;

/* JADX INFO: renamed from: ʻʻ.ˆʾ */
/* JADX INFO: loaded from: classes.dex */
public final class C1238 {

    /* JADX INFO: renamed from: ʽ */
    public final long f4066;

    /* JADX INFO: renamed from: ˈ */
    public final long f4067;

    /* JADX INFO: renamed from: ⁱˊ */
    public final int f4068;

    /* JADX INFO: renamed from: ﹳٴ */
    public final int f4069;

    public C1238(int r1, int r2, long r3, long r5) {
        this.f4069 = r1;
        this.f4068 = r2;
        this.f4066 = r3;
        this.f4067 = r5;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static C1238 m3468(File r9) {
        DataInputStream r1 = new DataInputStream(new FileInputStream(r9));
        C1238 r2 = new C1238(r1.readInt(), r1.readInt(), r1.readLong(), r1.readLong());     // Catch: Throwable -> L6
        r1.close();
        return r2;
    L6:
        th = move-exception;
        r1.close();     // Catch: Throwable -> L10
        throw th;
    L10:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (r7 != null) goto L8;
    L19:
        return false;
    L8:
        if ((r7 instanceof C1238) == false) goto L19;
        C1238 r72 = (C1238) r7;
        if (this.f4068 != r72.f4068) goto L19;
        if (this.f4066 != r72.f4066) goto L19;
        if (this.f4069 != r72.f4069) goto L19;
        if (this.f4067 != r72.f4067) goto L19;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f4068), Long.valueOf(this.f4066), Integer.valueOf(this.f4069), Long.valueOf(this.f4067)});
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m3469(File r4) {
        r4.delete();
        DataOutputStream r0 = new DataOutputStream(new FileOutputStream(r4));
        r0.writeInt(this.f4069);     // Catch: Throwable -> L6
        r0.writeInt(this.f4068);     // Catch: Throwable -> L6
        r0.writeLong(this.f4066);     // Catch: Throwable -> L6
        r0.writeLong(this.f4067);     // Catch: Throwable -> L6
        r0.close();
        return;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }
}
