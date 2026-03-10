package p032;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: ʼˈ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C1510 implements InterfaceC1513 {

    /* JADX INFO: renamed from: ʾˋ */
    public final InputContentInfo f5003;

    public C1510(Uri r2, ClipDescription r3, Uri r4) {
        this.f5003 = new InputContentInfo(r2, r3, r4);
    }

    public C1510(Object r1) {
        this.f5003 = (InputContentInfo) r1;
    }

    @Override // p032.InterfaceC1513
    /* JADX INFO: renamed from: ʼˎ */
    public final void mo4057() {
        this.f5003.requestPermission();
    }

    @Override // p032.InterfaceC1513
    /* JADX INFO: renamed from: ʽ */
    public final ClipDescription mo4058() {
        return this.f5003.getDescription();
    }

    @Override // p032.InterfaceC1513
    /* JADX INFO: renamed from: ٴﹶ */
    public final Uri mo4059() {
        return this.f5003.getLinkUri();
    }

    @Override // p032.InterfaceC1513
    /* JADX INFO: renamed from: ᵎﹶ */
    public final Object mo4060() {
        return this.f5003;
    }

    @Override // p032.InterfaceC1513
    /* JADX INFO: renamed from: ᵔᵢ */
    public final Uri mo4061() {
        return this.f5003.getContentUri();
    }
}
