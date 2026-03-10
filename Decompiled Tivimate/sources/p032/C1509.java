package p032;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import ʻʿ.ˈ;
import ﹳי.ʽ;

/* JADX INFO: renamed from: ʼˈ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C1509 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ ˈ f5002;

    public C1509(InputConnection r1, ˈ r2) {
        this.f5002 = r2;
        super(r1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String r14, Bundle r15) {
        ˈ r0 = this.f5002;
        boolean r2 = false;
        r2 = false;
        r2 = false;
        r2 = false;
        if (r15 != null) goto L6;
    L52:
        if (r2 == false) goto L55;
        return true;
    L55:
        return super.performPrivateCommand(r14, r15);
    L6:
        if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", r14) == false) goto L9;
        byte r3 = false;
    L12:
        if (r3 == false) goto L16;
        String r5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    L56:
        ResultReceiver r52 = (ResultReceiver) r15.getParcelable(r5);     // Catch: Throwable -> L14
        if (r3 == false) goto L22;
        String r6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    L58:
        Uri r62 = (Uri) r15.getParcelable(r6);     // Catch: Throwable -> L20
        if (r3 == false) goto L26;
        String r7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    L27:
        ClipDescription r72 = (ClipDescription) r15.getParcelable(r7);     // Catch: Throwable -> L20
        if (r3 == false) goto L30;
        String r8 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    L31:
        Uri r82 = (Uri) r15.getParcelable(r8);     // Catch: Throwable -> L20
        if (r3 == false) goto L34;
        String r9 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    L35:
        int r92 = r15.getInt(r9);     // Catch: Throwable -> L20
        if (r3 == false) goto L38;
        String r32 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    L39:
        Bundle r33 = (Bundle) r15.getParcelable(r32);     // Catch: Throwable -> L20
        if (r62 == null) goto L47;
        if (r72 == null) goto L47;
        ʽ r10 = new ʽ();     // Catch: Throwable -> L20
        if (Build.VERSION.SDK_INT < 25) goto L45;
        r10.ʾˋ = new C1510(r62, r72, r82);     // Catch: Throwable -> L20
    L46:
        r2 = r0.ᵔʾ(r10, r92, r33);     // Catch: Throwable -> L20
        goto L47
    L45:
        r10.ʾˋ = new ˑי.ʽ(r62, r72, r82);     // Catch: Throwable -> L20
    L47:
        if (r52 == null) goto L52;
        r52.send(r2 ? 1 : 0, null);
        goto L52
    L38:
        r32 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
        goto L39
    L34:
        r9 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
        goto L35
    L30:
        r8 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
        goto L31
    L26:
        r7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    L20:
        th = th;
    L49:
        if (r52 == null) goto L51;
        r52.send(0, null);
    L51:
        throw th;
    L22:
        r6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    L14:
        th = th;
        r52 = null;
        goto L49
    L16:
        r5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
        goto L56
    L9:
        if (TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", r14) == false) goto L52;
        r3 = true;
        goto L12
    }
}
