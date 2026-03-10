package p102;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
import java.io.IOException;
import p164.AbstractC2935;
import p341.InterfaceC4587;

/* JADX INFO: renamed from: ʿᵢ.ـˏ */
/* JADX INFO: loaded from: classes.dex */
public final class C2291 extends AbstractC2935 implements InterfaceC4587 {

    /* JADX INFO: renamed from: ʽʽ */
    public final /* synthetic */ C2301 f8240;

    /* JADX INFO: renamed from: ᴵˊ */
    public final /* synthetic */ int f8241;

    public /* synthetic */ C2291(C2301 r1, int r2) {
        this.f8241 = r2;
        this.f8240 = r1;
        super(0);
    }

    @Override // p341.InterfaceC4587
    /* JADX INFO: renamed from: ʽ */
    public final Object mo716() {
        switch(this.f8241) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        C2301 r0 = this.f8240;
        File r2 = new File(r0.f8280.getAbsolutePath() + r0.f8276);
        C2301.m5468(r0, r2);
        return r2;
    L6:
        System.loadLibrary("datastore_shared_counter");
        C2301 r02 = this.f8240;
        File r22 = new File(r02.f8280.getAbsolutePath() + r02.f8277);
        C2301.m5468(r02, r22);
        ParcelFileDescriptor r03 = ParcelFileDescriptor.open(r22, 939524096);     // Catch: Throwable -> L21
        int r1 = r03.getFd();     // Catch: Throwable -> L19
        NativeSharedCounter r23 = C2299.f8268;     // Catch: Throwable -> L19
        if (r23.nativeTruncateFile(r1) != 0) goto L18;
        long r12 = r23.nativeCreateSharedCounter(r1);     // Catch: Throwable -> L19
        if (r12 < 0) goto L16;
        C2299 r3 = new C2299(r12);     // Catch: Throwable -> L19
        r03.close();
        return r3;
    L16:
        throw new IOException("Failed to mmap counter file");     // Catch: Throwable -> L19
    L18:
        throw new IOException("Failed to truncate counter file");     // Catch: Throwable -> L19
    L19:
        th = th;
    L23:
        if (r03 == null) goto L25;
        r03.close();
    L25:
        throw th;
    L21:
        th = th;
        r03 = null;
        goto L23
    }
}
