package p176;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: renamed from: ˊᐧ.ᵎﹶ */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3073 extends InterfaceC3059, WritableByteChannel {
    @Override // p176.InterfaceC3059, java.io.Flushable
    void flush();

    InterfaceC3073 write(byte[] r1);

    InterfaceC3073 writeByte(int r1);

    InterfaceC3073 writeInt(int r1);

    InterfaceC3073 writeShort(int r1);

    /* JADX INFO: renamed from: ʼᐧ */
    InterfaceC3073 mo6443(long r1);

    /* JADX INFO: renamed from: ʾᵎ */
    InterfaceC3073 mo6445(int r1, int r2, String r3);

    /* JADX INFO: renamed from: ʿ */
    InterfaceC3073 mo6446(int r1, byte[] r2);

    /* JADX INFO: renamed from: ˈ */
    C3082 mo6447();

    /* JADX INFO: renamed from: ـﹶ */
    OutputStream mo6449();

    /* JADX INFO: renamed from: ᐧᴵ */
    InterfaceC3073 mo6450(String r1);

    /* JADX INFO: renamed from: ﾞʻ */
    InterfaceC3073 mo6453(C3054 r1);
}
