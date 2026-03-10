package p080;

import android.graphics.Bitmap;
import java.io.File;
import p092.InterfaceC2193;
import p099.AbstractC2229;
import p099.AbstractC2234;

/* JADX INFO: renamed from: ʾˑ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C2104 implements InterfaceC2193 {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f7408;

    /* JADX INFO: renamed from: ᴵˊ */
    public final Object f7409;

    public C2104(Bitmap r2) {
        this.f7408 = 2;
        this.f7409 = r2;
    }

    public C2104(File r2) {
        this.f7408 = 0;
        AbstractC2234.m5422(r2, "Argument must not be null");
        this.f7409 = r2;
    }

    public C2104(byte[] r2) {
        this.f7408 = 1;
        AbstractC2234.m5422(r2, "Argument must not be null");
        this.f7409 = r2;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    private final void m5111() {
    }

    /* JADX INFO: renamed from: ﹳٴ */
    private final void m5112() {
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    private final void m5113() {
    }

    @Override // p092.InterfaceC2193
    public final Object get() {
        switch(this.f7408) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return (Bitmap) this.f7409;
    L7:
        return (byte[]) this.f7409;
    L9:
        return (File) this.f7409;
    }

    @Override // p092.InterfaceC2193
    /* JADX INFO: renamed from: ʽ */
    public final Class mo5114() {
        switch(this.f7408) {
            case 0: goto L9;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        return Bitmap.class;
    L6:
        return byte[].class;
    L9:
        return ((File) this.f7409).getClass();
    }

    @Override // p092.InterfaceC2193
    /* JADX INFO: renamed from: ˈ */
    public final void mo5115() {
        int r0 = this.f7408;
    }

    @Override // p092.InterfaceC2193
    /* JADX INFO: renamed from: ⁱˊ */
    public final int mo5116() {
        switch(this.f7408) {
            case 0: goto L8;
            case 1: goto L7;
            default: goto L5;
        };
    L8:
        return 1;
    L5:
        return AbstractC2229.m5409((Bitmap) this.f7409);
    L7:
        return ((byte[]) this.f7409).length;
    }
}
