package p287;

import android.content.res.Configuration;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.util.Base64;
import android.window.OnBackInvokedDispatcher;
import java.nio.file.LinkOption;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.PosixFilePermission;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import p151.C2839;
import p232.InterfaceC3511;
import p309.AbstractC4175;
import p317.InterfaceC4217;
import p371.InterfaceC4846;
import ˑי.ʽ;

/* JADX INFO: renamed from: ـﹶ.ʾᵎ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3990 implements InterfaceC3511, InterfaceC4846, InterfaceC4217 {
    /* JADX INFO: renamed from: ʼˎ */
    public static /* bridge */ /* synthetic */ PosixFilePermission m8167() {
        return PosixFilePermission.OTHERS_READ;
    }

    /* JADX INFO: renamed from: ʼᐧ */
    public static /* bridge */ /* synthetic */ PosixFilePermission m8168() {
        return PosixFilePermission.GROUP_READ;
    }

    /* JADX INFO: renamed from: ʽ */
    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher m8169(Object r0) {
        return (OnBackInvokedDispatcher) r0;
    }

    /* JADX INFO: renamed from: ˆʾ */
    public static /* bridge */ /* synthetic */ Class m8170() {
        return DosFileAttributeView.class;
    }

    /* JADX INFO: renamed from: ˈ */
    public static /* bridge */ /* synthetic */ LinkOption m8171() {
        return LinkOption.NOFOLLOW_LINKS;
    }

    /* JADX INFO: renamed from: ˉʿ */
    public static /* bridge */ /* synthetic */ PosixFilePermission m8172() {
        return PosixFilePermission.OWNER_READ;
    }

    /* JADX INFO: renamed from: ˉˆ */
    public static /* bridge */ /* synthetic */ PosixFilePermission m8173() {
        return PosixFilePermission.OWNER_EXECUTE;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public static /* bridge */ /* synthetic */ DosFileAttributeView m8174(Object r0) {
        return (DosFileAttributeView) r0;
    }

    /* JADX INFO: renamed from: ٴﹶ */
    public static /* bridge */ /* synthetic */ PosixFilePermission m8175() {
        return PosixFilePermission.OTHERS_WRITE;
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public static /* bridge */ /* synthetic */ void m8176(Configuration r0, int r1) {
        r0.colorMode = r1;
    }

    /* JADX INFO: renamed from: ᵔʾ */
    public static /* bridge */ /* synthetic */ PosixFilePermission m8177() {
        return PosixFilePermission.OWNER_WRITE;
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public static /* bridge */ /* synthetic */ void m8178(BitmapFactory.Options r0, ColorSpace r1) {
        r0.inPreferredColorSpace = r1;
    }

    /* JADX INFO: renamed from: ᵔﹳ */
    public static /* bridge */ /* synthetic */ PosixFilePermission m8179() {
        return PosixFilePermission.GROUP_WRITE;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static /* bridge */ /* synthetic */ ImageDecoder.Source m8180(Object r0) {
        return (ImageDecoder.Source) r0;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static /* bridge */ /* synthetic */ int m8181(Configuration r0) {
        return r0.colorMode;
    }

    /* JADX INFO: renamed from: ﾞʻ */
    public static /* bridge */ /* synthetic */ PosixFilePermission m8182() {
        return PosixFilePermission.OTHERS_EXECUTE;
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public static /* bridge */ /* synthetic */ PosixFilePermission m8183() {
        return PosixFilePermission.GROUP_EXECUTE;
    }

    @Override // p317.InterfaceC4217
    public void accept(Object r1) {
        ((ExecutorService) r1).shutdown();
    }

    @Override // p371.InterfaceC4846
    public Object apply(Object r5) {
        Cursor r52 = ((SQLiteDatabase) r5).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        ArrayList r1 = new ArrayList();     // Catch: Throwable -> L14
    L4:
        if (r52.moveToNext() == false) goto L12;
        ʽ r2 = C2839.m6152();     // Catch: Throwable -> L14
        r2.ʽʽ(r52.getString(1));     // Catch: Throwable -> L14
        r2.ʽʽ = AbstractC4175.m8439(r52.getInt(2));     // Catch: Throwable -> L14
        String r3 = r52.getString(3);     // Catch: Throwable -> L14
        if (r3 != null) goto L9;
        byte[] r32 = null;
    L10:
        r2.ᴵˊ = r32;     // Catch: Throwable -> L14
        r1.add(r2.ᵔﹳ());     // Catch: Throwable -> L14
        goto L4
    L9:
        r32 = Base64.decode(r3, 0);     // Catch: Throwable -> L14
        goto L10
    L12:
        r52.close();
        return r1;
    L14:
        th = move-exception;
        r52.close();
        throw th;
    }

    @Override // p232.InterfaceC3511
    /* JADX INFO: renamed from: ٴʼ */
    public void mo5299(Exception r3) {
    }
}
