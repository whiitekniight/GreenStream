package p203;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: renamed from: ˋﾞ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C3359 implements InterfaceC3356 {

    /* JADX INFO: renamed from: ʽ */
    public static final String[] f11738 = null;

    /* JADX INFO: renamed from: ˈ */
    public static final String[] f11739 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public final ContentResolver f11740;

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f11741;

    static {
        f11738 = new String[]{"_data"};
        f11739 = new String[]{"_data"};
    }

    public /* synthetic */ C3359(ContentResolver r1, int r2) {
        this.f11741 = r2;
        this.f11740 = r1;
    }

    @Override // p203.InterfaceC3356
    /* JADX INFO: renamed from: ﹳٴ */
    public final Cursor mo7084(Uri r7) {
        switch(this.f11741) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        String r72 = r7.getLastPathSegment();
        ContentResolver r0 = this.f11740;
        String[] r2 = f11739;
        return r0.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, r2, "kind = 1 AND video_id = ?", new String[]{r72}, null);
    L6:
        String r73 = r7.getLastPathSegment();
        ContentResolver r02 = this.f11740;
        String[] r22 = f11738;
        return r02.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, r22, "kind = 1 AND image_id = ?", new String[]{r73}, null);
    }
}
