package p395;

import android.util.Log;
import com.bumptech.glide.EnumC0235;
import com.bumptech.glide.load.data.InterfaceC0218;
import com.bumptech.glide.load.data.InterfaceC0220;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p099.AbstractC2231;

/* JADX INFO: renamed from: ⁱʼ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C5067 implements InterfaceC0220 {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f18020;

    /* JADX INFO: renamed from: ᴵˊ */
    public final Object f18021;

    public /* synthetic */ C5067(int r1, Object r2) {
        this.f18020 = r1;
        this.f18021 = r2;
    }

    /* JADX INFO: renamed from: ʽ */
    private final void m9844() {
    }

    /* JADX INFO: renamed from: ˈ */
    private final void m9845() {
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    private final void m9846() {
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    private final void m9847() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0220
    public final void cancel() {
        int r0 = this.f18020;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0220
    /* JADX INFO: renamed from: ˑﹳ */
    public final int mo1168() {
        switch(this.f18020) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return 1;
    L6:
        return 1;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0220
    /* JADX INFO: renamed from: ⁱˊ */
    public final void mo1169() {
        int r0 = this.f18020;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0220
    /* JADX INFO: renamed from: ﹳٴ */
    public final Class mo1170() {
        switch(this.f18020) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        return ByteBuffer.class;
    L5:
        return this.f18021.getClass();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0220
    /* JADX INFO: renamed from: ﾞᴵ */
    public final void mo1171(EnumC0235 r3, InterfaceC0218 r4) {
        switch(this.f18020) {
            case 0: goto L14;
            default: goto L4;
        };
    L4:
        r4.mo1165(this.f18021);
        return;
    L14:
        r4.mo1165(AbstractC2231.m5421((File) this.f18021));     // Catch: IOException -> L8
        return;
    L8:
        e = move-exception;
        if (Log.isLoggable("ByteBufferFileLoader", 3) == true) goto L12;
    L12:
        r4.mo1164(e);
    }
}
