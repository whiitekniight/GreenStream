package p434;

import android.system.Os;
import java.io.FileDescriptor;

/* JADX INFO: renamed from: ﹳﹳ.ᵔᵢ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5490 {
    /* JADX INFO: renamed from: ʽ */
    public static long m10599(FileDescriptor r0, long r1, int r3) {
        return Os.lseek(r0, r1, r3);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static FileDescriptor m10600(FileDescriptor r0) {
        return Os.dup(r0);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static void m10601(FileDescriptor r0) {
        Os.close(r0);
    }
}
